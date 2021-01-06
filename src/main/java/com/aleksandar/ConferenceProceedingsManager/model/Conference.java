package com.aleksandar.ConferenceProceedingsManager.model;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="conference")
public class Conference implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Long id;

    @Column(nullable=false, length=100)
    private String name;

    @Column(nullable=false)
    private int year;

    @Column(length=100)
    private String url;

    private LocalDateTime begin;

    private LocalDateTime end;

    @Column( length=280)
    private String shortdescription;

    @Column(length=100)
    private String country;

    @Column(length=100)
    private String city;

    @Column(nullable=false)
    private boolean published;

    @ManyToOne(fetch=FetchType.LAZY)
    private User user;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "conference_organizer_id",referencedColumnName = "id")
    private ConferenceOrganizer conferenceOrganizer;

    @OneToMany(mappedBy ="conference" ,fetch = FetchType.EAGER)
    private Set<BoardMember> boardMembers;

    @OneToMany(mappedBy ="conference" ,fetch = FetchType.LAZY)
    private Set<Proceedings> proceedings;



}
