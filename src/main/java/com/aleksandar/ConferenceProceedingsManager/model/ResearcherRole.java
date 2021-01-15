package com.aleksandar.ConferenceProceedingsManager.model;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="researcher_role")
public class ResearcherRole implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Long id;

    @Column(nullable=false, length=100)
    private String title;

    @Column(nullable=false, length=2 ,name = "role_group")
    private String group; //group refers to Editor/Author/Board member

    @Column(length=100,name = "_description")
    private String description;

    @OneToMany(mappedBy ="researcherRole" ,fetch = FetchType.LAZY)
    private Set<BoardMember> boardMembers;

    @OneToMany(mappedBy ="researcherRole" ,fetch = FetchType.LAZY)
    private Set<Editor> editors;

    @OneToMany(mappedBy ="researcherRole" ,fetch = FetchType.LAZY)
    private Set<Author> authors;


}
