package com.aleksandar.ConferenceProceedingsManager.model;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="paper")
public class Paper implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Long id;


    @Column(nullable=false, length=100)
    private String title;

    private int endpage;

    private int startpage;

    @Column(name="ABSTRACT",length = 280)
    private String abstract_;

    private int doi;

    @Column(nullable=false)
    private byte published;

    @ManyToOne(optional=false)
    private Proceedings proceedings;

    @OneToMany(mappedBy ="paper" ,fetch = FetchType.EAGER)
    private Set<Author> authors;
}
