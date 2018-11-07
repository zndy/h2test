package org.johnny.h2test.repository;

import org.johnny.h2test.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "company")
public interface ICompanyRepository extends JpaRepository<Company, Long> {
    @RestResource(path = "name", rel = "name")
    Company findByName(@Param("name") String name);
}
