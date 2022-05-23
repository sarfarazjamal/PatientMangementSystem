package com.jamal.patient.management.service.impl;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jamal.patient.management.domain.Appointment;
import com.jamal.patient.management.repository.AppointmentRepository;
import com.jamal.patient.management.service.AppointmentService;
import com.jamal.patient.management.service.dto.AppointmentDTO;
import com.jamal.patient.management.service.mapper.AppointmentMapper;

/**
 * Service Implementation for managing {@link Appointment}.
 */
@Service
@Transactional
public class AppointmentServiceImpl implements AppointmentService {

    private final Logger log = LoggerFactory.getLogger(AppointmentServiceImpl.class);

    private final AppointmentRepository appointmentRepository;

    private final AppointmentMapper appointmentMapper;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository, AppointmentMapper appointmentMapper) {
        this.appointmentRepository = appointmentRepository;
        this.appointmentMapper = appointmentMapper;
    }

    @Override
    public AppointmentDTO save(AppointmentDTO appointmentDTO) {
        log.debug("Request to save Appointment : {}", appointmentDTO);
        Appointment appointment = appointmentMapper.toEntity(appointmentDTO);
        long patientId=Long.valueOf(appointmentDTO.getPatientId());
        long patientAppointmentCount=appointmentRepository.patientMaxCapacity(appointmentDTO.getStartTime(), appointmentDTO.getEndTime(),patientId);
        //List<Appointment> value2=appointmentRepository.findAllByStartTimeBetween(appointmentDTO.getStartTime(), appointmentDTO.getEndTime());
        log.info("<<<<<<<<----patientAppointmentCount:  "+patientAppointmentCount  +" >>>>>>>>>>>>>");
        appointment = appointmentRepository.save(appointment);
        return appointmentMapper.toDto(appointment);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<AppointmentDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Appointments");
        return appointmentRepository.findAll(pageable)
            .map(appointmentMapper::toDto);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<AppointmentDTO> findOne(Long id) {
        log.debug("Request to get Appointment : {}", id);
        return appointmentRepository.findById(id)
            .map(appointmentMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Appointment : {}", id);
        appointmentRepository.deleteById(id);
    }
    
    @Override
    public long findPatientMaxCapacity(AppointmentDTO appointmentDTO) {
        log.debug("Request to save Appointment : {}", appointmentDTO);
        long activeAppointmentCount=appointmentRepository.patientMaxCapacity(appointmentDTO.getStartTime(), appointmentDTO.getEndTime(),appointmentDTO.getPatientId());
        return activeAppointmentCount;
    }
    
    @Override
    public long doctorMaxCapacity(AppointmentDTO appointmentDTO) {
        log.debug("Request to save Appointment : {}", appointmentDTO);
        String[] stdate=appointmentDTO.getStartTime().toString().split("T");
        String stttrDate=stdate[0]+"T00:00:00Z";
        String[] enddate=appointmentDTO.getEndTime().toString().split("T");
        String enddDate=enddate[0]+"T23:59:59Z";
        //appointmentDTO.setStartTime(Instant.parse(stttrDate));
        //appointmentDTO.setEndTime(Instant.parse(enddDate));
        long activeAppointmentCount=appointmentRepository.doctorMaxCapacity(Instant.parse(stttrDate), Instant.parse(enddDate),appointmentDTO.getDoctorId());
        return activeAppointmentCount;
    }
}
