package com.jamal.patient.management.service.dto;

import java.time.Instant;
import java.io.Serializable;
import com.jamal.patient.management.domain.enumeration.AppointmentTypeEnum;
import com.jamal.patient.management.domain.enumeration.AppointmentStatusEnum;

/**
 * A DTO for the {@link com.jamal.patient.management.domain.Appointment} entity.
 */
public class AppointmentDTO implements Serializable {
    
    private Long id;

    private Instant startTime;

    private Instant endTime;

    private AppointmentTypeEnum type;

    private AppointmentStatusEnum status;


    private Long doctorId;

    private Long patientId;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }

    public void setEndTime(Instant endTime) {
        this.endTime = endTime;
    }

    public AppointmentTypeEnum getType() {
        return type;
    }

    public void setType(AppointmentTypeEnum type) {
        this.type = type;
    }

    public AppointmentStatusEnum getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatusEnum status) {
        this.status = status;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppointmentDTO)) {
            return false;
        }

        return id != null && id.equals(((AppointmentDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "AppointmentDTO{" +
            "id=" + getId() +
            ", startTime='" + getStartTime() + "'" +
            ", endTime='" + getEndTime() + "'" +
            ", type='" + getType() + "'" +
            ", status='" + getStatus() + "'" +
            ", doctorId=" + getDoctorId() +
            ", patientId=" + getPatientId() +
            "}";
    }
}
