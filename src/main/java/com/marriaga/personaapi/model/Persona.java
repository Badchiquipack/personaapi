package com.marriaga.personaapi.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Persona")
@Table(name = "personas")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String apellido;
    private Integer edad;

    @OneToMany
    private List<Mascota> mascota;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, Integer edad, List<Mascota> mascota) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.mascota = mascota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public List<Mascota> getMascota() {
        return mascota;
    }

    public void setMascota(List<Mascota> mascota) {
        this.mascota = mascota;
    }
}
