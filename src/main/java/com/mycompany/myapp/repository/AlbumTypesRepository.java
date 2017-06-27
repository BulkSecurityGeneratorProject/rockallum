package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.AlbumTypes;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the AlbumTypes entity.
 */
public interface AlbumTypesRepository extends JpaRepository<AlbumTypes,Long> {

}
