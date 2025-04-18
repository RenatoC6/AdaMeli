package com.Modulo_4.aula5;

import java.time.LocalDate;

public class Pessoa {
    private Long id;
    private String name;
    private String document;
    private LocalDate dateBirth;

    public Pessoa(Long id, String name, String document, LocalDate dateBirth) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.dateBirth = dateBirth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", document='" + document + '\'' +
                ", dateBirth=" + dateBirth +
                '}';
    }
}
