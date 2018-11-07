package org.johnny.h2test.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Audited
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DUESE")
@Access(AccessType.FIELD)
public class Duese {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME", nullable = false, unique = true, length = 128)
    private String name="";
    @Column(name = "DESCRIPTION", length = 1000)
    private String desc="";

    private int height;
    private int posx;
    private int posy;
    private int anglea;
    private int angleb;
    private int anglec;

}
