package com.jamal.patient.management.service.impl;

import com.jamal.patient.management.service.PatientService;
import com.jamal.patient.management.domain.Patient;
import com.jamal.patient.management.repository.PatientRepository;
import com.jamal.patient.management.service.dto.PatientDTO;
import com.jamal.patient.management.service.mapper.PatientMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link Patient}.
 */
@Service
@Transactional
public class PatientServiceImpl implements PatientService {

    private final Logger log = LoggerFactory.getLogger(PatientServiceImpl.class);

    private final PatientRepository patientRepository;

    private final PatientMapper patientMapper;

    public PatientServiceImpl(PatientRepository patientRepository, PatientMapper patientMapper) {
        this.patientRepository = patientRepository;
        this.patientMapper = patientMapper;
    }

    @Override
    public PatientDTO save(PatientDTO patientDTO) {
        log.debug("Request to save Patient : {}", patientDTO);
        Patient patient = patientMapper.toEntity(patientDTO);
        patient = patientRepository.save(patient);
        return patientMapper.toDto(patient);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<PatientDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Patients");
        return patientRepository.findAll(pageable)
            .map(patientMapper::toDto);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<PatientDTO> findOne(Long id) {
        log.debug("Request to get Patient : {}", id);
        return patientRepository.findById(id)
            .map(patientMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Patient : {}", id);
        patientRepository.deleteById(id);
    }
}
