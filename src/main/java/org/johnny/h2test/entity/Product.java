package org.johnny.h2test.entity;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Audited
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PRODUCTS")
@Access(AccessType.FIELD)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME", nullable = false, unique = true, length = 128)
    private String name;

    @Column(name = "DESCRIPTION", length = 1000)
    private String description;

    @Column(name = "PRICE_PER_UNIT")
    private Integer pricePerUnit;

    @ManyToOne
    @JoinColumn(name = "COMPANY_ID", nullable = false)
    private Company company;
}
