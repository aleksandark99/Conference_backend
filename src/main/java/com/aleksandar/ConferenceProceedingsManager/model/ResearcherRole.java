package com.aleksandar.ConferenceProceedingsManager.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="researcher_role")
public class ResearcherRole implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Long id;

    @Column(nullable=false, length=100)
    private String title;

    @Column(nullable=false, length=2)
    private String group; //group refers to Editor/Author/Board member

    @Column(length=100)
    private String description;



}
