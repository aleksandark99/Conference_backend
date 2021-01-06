package com.aleksandar.ConferenceProceedingsManager.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="file")
public class File implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private Long id;

    @Column(nullable=false, length=100)
    private String clientName;

    @Column(nullable=false, length=100)
    private String serverName;

    @Column(nullable=false, length=20)
    private String mimeType;

//    @Column(nullable=false)
//    private int size;

    @ManyToOne
    private Licence licence;

    //fali veza ka proceeigns

    //fali veza ka Paper
}
