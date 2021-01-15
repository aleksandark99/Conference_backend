package com.aleksandar.ConferenceProceedingsManager.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="conference_organizer")
public class ConferenceOrganizer implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Long id;

    @Column(nullable=false, length=100)
    private String name;

    @Column(nullable=false, length=100)
    private String country;

    @Column(length=100)
    private String url;

    @OneToOne(fetch = FetchType.LAZY,mappedBy = "conferenceOrganizer",optional = false)
    private Conference conference;


}
