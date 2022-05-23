package com.jamal.patient.management.domain;


import javax.persistence.*;

import java.io.Serializable;
import java.time.Instant;

import com.jamal.patient.management.domain.enumeration.GenderEnum;

import com.jamal.patient.management.domain.enumeration.MarItalStatusEnum;

import com.jamal.patient.management.domain.enumeration.BloodGroupEnum;

/**
 * A Patient.
 */
@Entity
@Table(name = "patient")
public class Patient implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "date_of_birth")
    private Instant dateOfBirth;

    @Column(name = "height")
    private Float height;

    @Column(name = "weight")
    private Float weight;

    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private GenderEnum gender;

    @Enumerated(EnumType.STRING)
    @Column(name = "marital_status")
    private MarItalStatusEnum maritalStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "blood_group")
    private BloodGroupEnum bloodGroup;

    @Column(name = "address")
    private String address;

    @Column(name = "language")
    private String language;

    @Column(name = "user_id")
    private Long userId;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public Patient firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Patient middleName(String middleName) {
        this.middleName = middleName;
        return this;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Patient lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Instant getDateOfBirth() {
        return dateOfBirth;
    }

    public Patient dateOfBirth(Instant dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public void setDateOfBirth(Instant dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Float getHeight() {
        return height;
    }

    public Patient height(Float height) {
        this.height = height;
        return this;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWeight() {
        return weight;
    }

    public Patient weight(Float weight) {
        this.weight = weight;
        return this;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public Patient gender(GenderEnum gender) {
        this.gender = gender;
        return this;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public MarItalStatusEnum getMaritalStatus() {
        return maritalStatus;
    }

    public Patient maritalStatus(MarItalStatusEnum maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    public void setMaritalStatus(MarItalStatusEnum maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public BloodGroupEnum getBloodGroup() {
        return bloodGroup;
    }

    public Patient bloodGroup(BloodGroupEnum bloodGroup) {
        this.bloodGroup = bloodGroup;
        return this;
    }

    public void setBloodGroup(BloodGroupEnum bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getAddress() {
        return address;
    }

    public Patient address(String address) {
        this.address = address;
        return this;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLanguage() {
        return language;
    }

    public Patient language(String language) {
        this.language = language;
        return this;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Long getUserId() {
        return userId;
    }

    public Patient userId(Long userId) {
        this.userId = userId;
        return this;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Patient)) {
            return false;
        }
        return id != null && id.equals(((Patient) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Patient{" +
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
