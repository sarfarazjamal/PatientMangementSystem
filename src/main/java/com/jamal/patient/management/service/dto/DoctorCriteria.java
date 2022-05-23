package com.jamal.patient.management.service.dto;

import java.io.Serializable;
import java.util.Objects;
import io.github.jhipster.service.Criteria;
import io.github.jhipster.service.filter.BooleanFilter;
import io.github.jhipster.service.filter.DoubleFilter;
import io.github.jhipster.service.filter.Filter;
import io.github.jhipster.service.filter.FloatFilter;
import io.github.jhipster.service.filter.IntegerFilter;
import io.github.jhipster.service.filter.LongFilter;
import io.github.jhipster.service.filter.StringFilter;
import io.github.jhipster.service.filter.InstantFilter;

/**
 * Criteria class for the {@link com.jamal.patient.management.domain.Doctor} entity. This class is used
 * in {@link com.jamal.patient.management.web.rest.DoctorResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /doctors?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
public class DoctorCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter firstName;

    private StringFilter middleName;

    private StringFilter lastName;

    private StringFilter specialization;

    private StringFilter address;

    private LongFilter rate;

    private StringFilter bio;

    private StringFilter education;

    private StringFilter picture;

    private InstantFilter startTime;

    private InstantFilter endTime;

    private LongFilter experience;

    private LongFilter userId;

    public DoctorCriteria() {
    }

    public DoctorCriteria(DoctorCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.firstName = other.firstName == null ? null : other.firstName.copy();
        this.middleName = other.middleName == null ? null : other.middleName.copy();
        this.lastName = other.lastName == null ? null : other.lastName.copy();
        this.specialization = other.specialization == null ? null : other.specialization.copy();
        this.address = other.address == null ? null : other.address.copy();
        this.rate = other.rate == null ? null : other.rate.copy();
        this.bio = other.bio == null ? null : other.bio.copy();
        this.education = other.education == null ? null : other.education.copy();
        this.picture = other.picture == null ? null : other.picture.copy();
        this.startTime = other.startTime == null ? null : other.startTime.copy();
        this.endTime = other.endTime == null ? null : other.endTime.copy();
        this.experience = other.experience == null ? null : other.experience.copy();
        this.userId = other.userId == null ? null : other.userId.copy();
    }

    @Override
    public DoctorCriteria copy() {
        return new DoctorCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public StringFilter getFirstName() {
        return firstName;
    }

    public void setFirstName(StringFilter firstName) {
        this.firstName = firstName;
    }

    public StringFilter getMiddleName() {
        return middleName;
    }

    public void setMiddleName(StringFilter middleName) {
        this.middleName = middleName;
    }

    public StringFilter getLastName() {
        return lastName;
    }

    public void setLastName(StringFilter lastName) {
        this.lastName = lastName;
    }

    public StringFilter getSpecialization() {
        return specialization;
    }

    public void setSpecialization(StringFilter specialization) {
        this.specialization = specialization;
    }

    public StringFilter getAddress() {
        return address;
    }

    public void setAddress(StringFilter address) {
        this.address = address;
    }

    public LongFilter getRate() {
        return rate;
    }

    public void setRate(LongFilter rate) {
        this.rate = rate;
    }

    public StringFilter getBio() {
        return bio;
    }

    public void setBio(StringFilter bio) {
        this.bio = bio;
    }

    public StringFilter getEducation() {
        return education;
    }

    public void setEducation(StringFilter education) {
        this.education = education;
    }

    public StringFilter getPicture() {
        return picture;
    }

    public void setPicture(StringFilter picture) {
        this.picture = picture;
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

    public LongFilter getExperience() {
        return experience;
    }

    public void setExperience(LongFilter experience) {
        this.experience = experience;
    }

    public LongFilter getUserId() {
        return userId;
    }

    public void setUserId(LongFilter userId) {
        this.userId = userId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final DoctorCriteria that = (DoctorCriteria) o;
        return
            Objects.equals(id, that.id) &&
            Objects.equals(firstName, that.firstName) &&
            Objects.equals(middleName, that.middleName) &&
            Objects.equals(lastName, that.lastName) &&
            Objects.equals(specialization, that.specialization) &&
            Objects.equals(address, that.address) &&
            Objects.equals(rate, that.rate) &&
            Objects.equals(bio, that.bio) &&
            Objects.equals(education, that.education) &&
            Objects.equals(picture, that.picture) &&
            Objects.equals(startTime, that.startTime) &&
            Objects.equals(endTime, that.endTime) &&
            Objects.equals(experience, that.experience) &&
            Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
        id,
        firstName,
        middleName,
        lastName,
        specialization,
        address,
        rate,
        bio,
        education,
        picture,
        startTime,
        endTime,
        experience,
        userId
        );
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DoctorCriteria{" +
                (id != null ? "id=" + id + ", " : "") +
                (firstName != null ? "firstName=" + firstName + ", " : "") +
                (middleName != null ? "middleName=" + middleName + ", " : "") +
                (lastName != null ? "lastName=" + lastName + ", " : "") +
                (specialization != null ? "specialization=" + specialization + ", " : "") +
                (address != null ? "address=" + address + ", " : "") +
                (rate != null ? "rate=" + rate + ", " : "") +
                (bio != null ? "bio=" + bio + ", " : "") +
                (education != null ? "education=" + education + ", " : "") +
                (picture != null ? "picture=" + picture + ", " : "") +
                (startTime != null ? "startTime=" + startTime + ", " : "") +
                (endTime != null ? "endTime=" + endTime + ", " : "") +
                (experience != null ? "experience=" + experience + ", " : "") +
                (userId != null ? "userId=" + userId + ", " : "") +
            "}";
    }

}
