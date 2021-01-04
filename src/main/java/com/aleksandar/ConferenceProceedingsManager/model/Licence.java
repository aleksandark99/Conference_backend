package com.aleksandar.ConferenceProceedingsManager.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="licence")
public class Licence implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Long id;

    @Column(nullable=false, length=100)
    private String name;

    private String description;

    @Column(nullable=false, length=100)
    private String url;

    @Column(nullable=false)
    private boolean openAccess;
}
