package org.johnny.h2test.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Audited
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "DUESE")
@Access(AccessType.FIELD)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Duese implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "NAME", nullable = false, unique = true, length = 128)
    private String name="";
    @NotBlank
    @Column(name = "DESCRIPTION", length = 1000)
    private String desc="";

    private int height;
    private int posx;
    private int posy;
    private int anglea;
    private int angleb;
    private int anglec;

}
