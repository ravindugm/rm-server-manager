package com.rmdev.springbootservermanager.repository;

import com.rmdev.springbootservermanager.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server, Long> {
    Server findByIpAddress(String IpAddress);
}
