package org.johnny.h2test.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "COMPANYS")
@Access(AccessType.FIELD)
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME", nullable = false, unique = true, length = 128)
    private String name;

    @OneToMany(mappedBy = "company")
    private List<Product> products;
}
