package xyz.sahia.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.sahia.app.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
