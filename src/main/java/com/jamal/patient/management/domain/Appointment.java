package com.jamal.patient.management.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.io.Serializable;
import java.time.Instant;

import com.jamal.patient.management.domain.enumeration.AppointmentTypeEnum;

import com.jamal.patient.management.domain.enumeration.AppointmentStatusEnum;

/**
 * A Appointment.
 */
@Entity
@Table(name = "appointment")
public class Appointment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "start_time")
    private Instant startTime;

    @Column(name = "end_time")
    private Instant endTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private AppointmentTypeEnum type;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private AppointmentStatusEnum status;

    @ManyToOne
    @JsonIgnoreProperties(value = "appointments", allowSetters = true)
    private Doctor doctor;

    @ManyToOne
    @JsonIgnoreProperties(value = "appointments", allowSetters = true)
    private Patient patient;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public Appointment startTime(Instant startTime) {
        this.startTime = startTime;
        return this;
    }

    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }

    public Appointment endTime(Instant endTime) {
        this.endTime = endTime;
        return this;
    }

    public void setEndTime(Instant endTime) {
        this.endTime = endTime;
    }

    public AppointmentTypeEnum getType() {
        return type;
    }

    public Appointment type(AppointmentTypeEnum type) {
        this.type = type;
        return this;
    }

    public void setType(AppointmentTypeEnum type) {
        this.type = type;
    }

    public AppointmentStatusEnum getStatus() {
        return status;
    }

    public Appointment status(AppointmentStatusEnum status) {
        this.status = status;
        return this;
    }

    public void setStatus(AppointmentStatusEnum status) {
        this.status = status;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Appointment doctor(Doctor doctor) {
        this.doctor = doctor;
        return this;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public Appointment patient(Patient patient) {
        this.patient = patient;
        return this;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Appointment)) {
            return false;
        }
        return id != null && id.equals(((Appointment) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Appointment{" +
            "id=" + getId() +
            ", startTime='" + getStartTime() + "'" +
            ", endTime='" + getEndTime() + "'" +
            ", type='" + getType() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }
}
