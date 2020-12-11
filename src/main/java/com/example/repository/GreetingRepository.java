package com.example.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JPARepository<Greeting, Long> {
}
