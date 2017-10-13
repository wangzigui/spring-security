package sinosoftsh.security.client.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sinosoftsh.security.client.entity.SRole;

@Repository
public interface SRoleRepository extends JpaRepository<SRole,Integer> {



}