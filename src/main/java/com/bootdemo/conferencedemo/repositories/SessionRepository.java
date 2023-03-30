package com.bootdemo.conferencedemo.repositories;

import com.bootdemo.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
