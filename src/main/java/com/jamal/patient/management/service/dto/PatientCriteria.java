package com.jamal.patient.management.service.dto;

import java.io.Serializable;
import java.util.Objects;
import io.github.jhipster.service.Criteria;
import com.jamal.patient.management.domain.enumeration.GenderEnum;
import com.jamal.patient.management.domain.enumeration.MarItalStatusEnum;
import com.jamal.patient.management.domain.enumeration.BloodGroupEnum;
import io.github.jhipster.service.filter.BooleanFilter;
import io.github.jhipster.service.filter.DoubleFilter;
import io.github.jhipster.service.filter.Filter;
import io.github.jhipster.service.filter.FloatFilter;
import io.github.jhipster.service.filter.IntegerFilter;
import io.github.jhipster.service.filter.LongFilter;
import io.github.jhipster.service.filter.StringFilter;
import io.github.jhipster.service.filter.InstantFilter;

/**
 * Criteria class for the {@link com.jamal.patient.management.domain.Patient} entity. This class is used
 * in {@link com.jamal.patient.management.web.rest.PatientResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /patients?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
public class PatientCriteria implements Serializable, Criteria {
    /**
     * Class for filtering GenderEnum
     */
    public static class GenderEnumFilter extends Filter<GenderEnum> {

        public GenderEnumFilter() {
        }

        public GenderEnumFilter(GenderEnumFilter filter) {
            super(filter);
        }

        @Override
        public GenderEnumFilter copy() {
            return new GenderEnumFilter(this);
        }

    }
    /**
     * Class for filtering MarItalStatusEnum
     */
    public static class MarItalStatusEnumFilter extends Filter<MarItalStatusEnum> {

        public MarItalStatusEnumFilter() {
        }

        public MarItalStatusEnumFilter(MarItalStatusEnumFilter filter) {
            super(filter);
        }

        @Override
        public MarItalStatusEnumFilter copy() {
            return new MarItalStatusEnumFilter(this);
        }

    }
    /**
     * Class for filtering BloodGroupEnum
     */
    public static class BloodGroupEnumFilter extends Filter<BloodGroupEnum> {

        public BloodGroupEnumFilter() {
        }

        public BloodGroupEnumFilter(BloodGroupEnumFilter filter) {
            super(filter);
        }

        @Override
        public BloodGroupEnumFilter copy() {
            return new BloodGroupEnumFilter(this);
        }

    }

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter firstName;

    private StringFilter middleName;

    private StringFilter lastName;

    private InstantFilter dateOfBirth;

    private FloatFilter height;

    private FloatFilter weight;

    private GenderEnumFilter gender;

    private MarItalStatusEnumFilter maritalStatus;

    private BloodGroupEnumFilter bloodGroup;

    private StringFilter address;

    private StringFilter language;

    private LongFilter userId;

    public PatientCriteria() {
    }

    public PatientCriteria(PatientCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.firstName = other.firstName == null ? null : other.firstName.copy();
        this.middleName = other.middleName == null ? null : other.middleName.copy();
        this.lastName = other.lastName == null ? null : other.lastName.copy();
        this.dateOfBirth = other.dateOfBirth == null ? null : other.dateOfBirth.copy();
        this.height = other.height == null ? null : other.height.copy();
        this.weight = other.weight == null ? null : other.weight.copy();
        this.gender = other.gender == null ? null : other.gender.copy();
        this.maritalStatus = other.maritalStatus == null ? null : other.maritalStatus.copy();
        this.bloodGroup = other.bloodGroup == null ? null : other.bloodGroup.copy();
        this.address = other.address == null ? null : other.address.copy();
        this.language = other.language == null ? null : other.language.copy();
        this.userId = other.userId == null ? null : other.userId.copy();
    }

    @Override
    public PatientCriteria copy() {
        return new PatientCriteria(this);
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

    public InstantFilter getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(InstantFilter dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public FloatFilter getHeight() {
        return height;
    }

    public void setHeight(FloatFilter height) {
        this.height = height;
    }

    public FloatFilter getWeight() {
        return weight;
    }

    public void setWeight(FloatFilter weight) {
        this.weight = weight;
    }

    public GenderEnumFilter getGender() {
        return gender;
    }

    public void setGender(GenderEnumFilter gender) {
        this.gender = gender;
    }

    public MarItalStatusEnumFilter getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MarItalStatusEnumFilter maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public BloodGroupEnumFilter getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroupEnumFilter bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public StringFilter getAddress() {
        return address;
    }

    public void setAddress(StringFilter address) {
        this.address = address;
    }

    public StringFilter getLanguage() {
        return language;
    }

    public void setLanguage(StringFilter language) {
        this.language = language;
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
        final PatientCriteria that = (PatientCriteria) o;
        return
            Objects.equals(id, that.id) &&
            Objects.equals(firstName, that.firstName) &&
            Objects.equals(middleName, that.middleName) &&
            Objects.equals(lastName, that.lastName) &&
            Objects.equals(dateOfBirth, that.dateOfBirth) &&
            Objects.equals(height, that.height) &&
            Objects.equals(weight, that.weight) &&
            Objects.equals(gender, that.gender) &&
            Objects.equals(maritalStatus, that.maritalStatus) &&
            Objects.equals(bloodGroup, that.bloodGroup) &&
            Objects.equals(address, that.address) &&
            Objects.equals(language, that.language) &&
            Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
        id,
        firstName,
        middleName,
        lastName,
        dateOfBirth,
        height,
        weight,
        gender,
        maritalStatus,
        bloodGroup,
        address,
        language,
        userId
        );
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "PatientCriteria{" +
                (id != null ? "id=" + id + ", " : "") +
                (firstName != null ? "firstName=" + firstName + ", " : "") +
                (middleName != null ? "middleName=" + middleName + ", " : "") +
                (lastName != null ? "lastName=" + lastName + ", " : "") +
                (dateOfBirth != null ? "dateOfBirth=" + dateOfBirth + ", " : "") +
                (height != null ? "height=" + height + ", " : "") +
                (weight != null ? "weight=" + weight + ", " : "") +
                (gender != null ? "gender=" + gender + ", " : "") +
                (maritalStatus != null ? "maritalStatus=" + maritalStatus + ", " : "") +
                (bloodGroup != null ? "bloodGroup=" + bloodGroup + ", " : "") +
                (address != null ? "address=" + address + ", " : "") +
                (language != null ? "language=" + language + ", " : "") +
                (userId != null ? "userId=" + userId + ", " : "") +
            "}";
    }

}
