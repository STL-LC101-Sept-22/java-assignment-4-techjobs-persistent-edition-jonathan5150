package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(max = 60)
    private String location;

    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String name) {
        this.location = location;
    }

}
