package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank
    @Size(max = 300)
    private String description;

    public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String name) {
        this.description = description;
    }


}