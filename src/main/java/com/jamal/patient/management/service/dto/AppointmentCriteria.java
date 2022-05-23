package com.jamal.patient.management.service.dto;

import java.io.Serializable;
import java.util.Objects;
import io.github.jhipster.service.Criteria;
import com.jamal.patient.management.domain.enumeration.AppointmentTypeEnum;
import com.jamal.patient.management.domain.enumeration.AppointmentStatusEnum;
import io.github.jhipster.service.filter.BooleanFilter;
import io.github.jhipster.service.filter.DoubleFilter;
import io.github.jhipster.service.filter.Filter;
import io.github.jhipster.service.filter.FloatFilter;
import io.github.jhipster.service.filter.IntegerFilter;
import io.github.jhipster.service.filter.LongFilter;
import io.github.jhipster.service.filter.StringFilter;
import io.github.jhipster.service.filter.InstantFilter;

/**
 * Criteria class for the {@link com.jamal.patient.management.domain.Appointment} entity. This class is used
 * in {@link com.jamal.patient.management.web.rest.AppointmentResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /appointments?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
public class AppointmentCriteria implements Serializable, Criteria {
    /**
     * Class for filtering AppointmentTypeEnum
     */
    public static class AppointmentTypeEnumFilter extends Filter<AppointmentTypeEnum> {

        public AppointmentTypeEnumFilter() {
        }

        public AppointmentTypeEnumFilter(AppointmentTypeEnumFilter filter) {
            super(filter);
        }

        @Override
        public AppointmentTypeEnumFilter copy() {
            return new AppointmentTypeEnumFilter(this);
        }

    }
    /**
     * Class for filtering AppointmentStatusEnum
     */
    public static class AppointmentStatusEnumFilter extends Filter<AppointmentStatusEnum> {

        public AppointmentStatusEnumFilter() {
        }

        public AppointmentStatusEnumFilter(AppointmentStatusEnumFilter filter) {
            super(filter);
        }

        @Override
        public AppointmentStatusEnumFilter copy() {
            return new AppointmentStatusEnumFilter(this);
        }

    }

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private InstantFilter startTime;

    private InstantFilter endTime;

    private AppointmentTypeEnumFilter type;

    private AppointmentStatusEnumFilter status;

    private LongFilter doctorId;

    private LongFilter patientId;

    public AppointmentCriteria() {
    }

    public AppointmentCriteria(AppointmentCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.startTime = other.startTime == null ? null : other.startTime.copy();
        this.endTime = other.endTime == null ? null : other.endTime.copy();
        this.type = other.type == null ? null : other.type.copy();
        this.status = other.status == null ? null : other.status.copy();
        this.doctorId = other.doctorId == null ? null : other.doctorId.copy();
        this.patientId = other.patientId == null ? null : other.patientId.copy();
    }

    @Override
    public AppointmentCriteria copy() {
        return new AppointmentCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public InstantFilter getStartTime() {
        return startTime;
    }

    public void setStartTime(InstantFilter startTime) {
        this.startTime = startTime;
    }

    public InstantFilter getEndTime() {
        return endTime;
    }

    public void setEndTime(InstantFilter endTime) {
        this.endTime = endTime;
    }

    public AppointmentTypeEnumFilter getType() {
        return type;
    }

    public void setType(AppointmentTypeEnumFilter type) {
        this.type = type;
    }

    public AppointmentStatusEnumFilter getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatusEnumFilter status) {
        this.status = status;
    }

    public LongFilter getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(LongFilter doctorId) {
        this.doctorId = doctorId;
    }

    public LongFilter getPatientId() {
        return patientId;
    }

    public void setPatientId(LongFilter patientId) {
        this.patientId = patientId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final AppointmentCriteria that = (AppointmentCriteria) o;
        return
            Objects.equals(id, that.id) &&
            Objects.equals(startTime, that.startTime) &&
            Objects.equals(endTime, that.endTime) &&
            Objects.equals(type, that.type) &&
            Objects.equals(status, that.status) &&
            Objects.equals(doctorId, that.doctorId) &&
            Objects.equals(patientId, that.patientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
        id,
        startTime,
        endTime,
        type,
        status,
        doctorId,
        patientId
        );
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "AppointmentCriteria{" +
                (id != null ? "id=" + id + ", " : "") +
                (startTime != null ? "startTime=" + startTime + ", " : "") +
                (endTime != null ? "endTime=" + endTime + ", " : "") +
                (type != null ? "type=" + type + ", " : "") +
                (status != null ? "status=" + status + ", " : "") +
                (doctorId != null ? "doctorId=" + doctorId + ", " : "") +
                (patientId != null ? "patientId=" + patientId + ", " : "") +
            "}";
    }

}
