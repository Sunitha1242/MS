package net.javaguides.organizationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.organizationservice.entity.OrganizationEntity;

public interface OrganizationRepository extends JpaRepository<OrganizationEntity, Long> {

}
