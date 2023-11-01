package br.edu.unifalmg.domain;

import lombok.*;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@Builder


public class Chore {

    private String description;

    private Boolean isCompleted;

    private LocalDate deadline;
    public Chore (){

    }

    public Chore(String description, Boolean aFalse, LocalDate deadline) {
        this.description = description;
        isCompleted = aFalse;
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public void setIsCompleted(Boolean completed) {
        isCompleted = completed;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }


    public boolean getIsCompleted() {
        return isCompleted;
    }
}
