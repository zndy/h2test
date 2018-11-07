package org.johnny.h2test.repository;

import org.johnny.h2test.entity.Duese;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDueseRepository extends JpaRepository<Duese, Long> {
}
