package net.javaguides.organizationservice.mapper;

import net.javaguides.organizationservice.dto.OrganizationDto;
import net.javaguides.organizationservice.entity.OrganizationEntity;

public class OrganizationMapper {
	public OrganizationDto mapToOrganizationDto(OrganizationEntity organization) {
		OrganizationDto organizationDto = new OrganizationDto(organization.getId(), organization.getOrganizationName(),
				organization.getOrganizationDescription(), organization.getOrganizationCode(),
				organization.getCreatedDate());
		return organizationDto;

	}

	public OrganizationEntity mapToOrganization(OrganizationDto organizationDto) {
		OrganizationEntity organization = new OrganizationEntity(organizationDto.getId(),
				organizationDto.getOrganizationName(), organizationDto.getOrganizationDescription(),
				organizationDto.getOrganizationCode(), organizationDto.getCreatedDate());
		return organization;
	}
}
