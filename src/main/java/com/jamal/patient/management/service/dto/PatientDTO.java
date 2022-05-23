package com.jamal.patient.management.service.dto;

import java.time.Instant;
import java.io.Serializable;
import com.jamal.patient.management.domain.enumeration.GenderEnum;
import com.jamal.patient.management.domain.enumeration.MarItalStatusEnum;
import com.jamal.patient.management.domain.enumeration.BloodGroupEnum;

/**
 * A DTO for the {@link com.jamal.patient.management.domain.Patient} entity.
 */
public class PatientDTO implements Serializable {
    
    private Long id;

    private String firstName;

    private String middleName;

    private String lastName;

    private Instant dateOfBirth;

    private Float height;

    private Float weight;

    private GenderEnum gender;

    private MarItalStatusEnum maritalStatus;

    private BloodGroupEnum bloodGroup;

    private String address;

    private String language;

    private Long userId;

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Instant getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Instant dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public MarItalStatusEnum getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MarItalStatusEnum maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public BloodGroupEnum getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroupEnum bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatientDTO)) {
            return false;
        }

        return id != null && id.equals(((PatientDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "PatientDTO{" +
            "id=" + getId() +
            ", firstName='" + getFirstName() + "'" +
            ", middleName='" + getMiddleName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", dateOfBirth='" + getDateOfBirth() + "'" +
            ", height=" + getHeight() +
            ", weight=" + getWeight() +
            ", gender='" + getGender() + "'" +
            ", maritalStatus='" + getMaritalStatus() + "'" +
            ", bloodGroup='" + getBloodGroup() + "'" +
            ", address='" + getAddress() + "'" +
            ", language='" + getLanguage() + "'" +
            ", userId=" + getUserId() +
            "}";
    }
}
