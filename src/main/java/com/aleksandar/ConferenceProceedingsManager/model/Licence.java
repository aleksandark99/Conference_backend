package com.aleksandar.ConferenceProceedingsManager.model;
import com.aleksandar.ConferenceProceedingsManager.model.enums.EName;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="licence")
public class Licence implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable=false, length=100)
    private EName name;

    private String description;

    @Column(nullable=false, length=100)
    private String url;

    @Column(nullable=false)
    private boolean openAccess;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "licence")
    private Set<File> files;
}
