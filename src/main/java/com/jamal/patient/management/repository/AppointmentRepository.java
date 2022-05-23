package com.jamal.patient.management.repository;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jamal.patient.management.domain.Appointment;

/**
 * Spring Data repository for the Appointment entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long>, JpaSpecificationExecutor<Appointment> {

	List<Appointment> findAllByStartTimeBetween(Instant fromDate, Instant toDate);

	List<Appointment> findByStartTimeGreaterThanEqualAndEndTimeLessThanEqual(Instant fromDate, Instant toDate);

	@Transactional(readOnly = true)
	@Query("SELECT COUNT(d) from Appointment d WHERE d.startTime>=:from AND d.endTime<=:until AND d.doctor.id = :doctorId AND d.status=com.jamal.patient.management.domain.enumeration.AppointmentStatusEnum.ACTIVE ORDER BY d.id ASC")
	long doctorMaxCapacity(@Param("from") Instant start, @Param("until") Instant end, @Param("doctorId") long doctorId);

	@Transactional(readOnly = true)
	@Query("SELECT COUNT(d) FROM Appointment d WHERE (d.startTime BETWEEN :from AND :until AND d.patient.id = :patinetId AND d.status=com.jamal.patient.management.domain.enumeration.AppointmentStatusEnum.ACTIVE) OR (d.endTime BETWEEN :from AND :until AND d.patient.id = :patinetId AND d.status=com.jamal.patient.management.domain.enumeration.AppointmentStatusEnum.ACTIVE)")
	long patientMaxCapacity(@Param("from") Instant start, @Param("until") Instant end,
			@Param("patinetId") long patinetId);

}
