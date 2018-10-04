package org.johnny.h2test.repository;

import org.johnny.h2test.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICompanyRepository extends JpaRepository<Company, Long> {
}
