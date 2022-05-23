package com.jamal.patient.management.service.mapper;


import com.jamal.patient.management.domain.*;
import com.jamal.patient.management.service.dto.AppointmentDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Appointment} and its DTO {@link AppointmentDTO}.
 */
@Mapper(componentModel = "spring", uses = {DoctorMapper.class, PatientMapper.class})
public interface AppointmentMapper extends EntityMapper<AppointmentDTO, Appointment> {

    @Mapping(source = "doctor.id", target = "doctorId")
    @Mapping(source = "patient.id", target = "patientId")
    AppointmentDTO toDto(Appointment appointment);

    @Mapping(source = "doctorId", target = "doctor")
    @Mapping(source = "patientId", target = "patient")
    Appointment toEntity(AppointmentDTO appointmentDTO);

    default Appointment fromId(Long id) {
        if (id == null) {
            return null;
        }
        Appointment appointment = new Appointment();
        appointment.setId(id);
        return appointment;
    }
}
