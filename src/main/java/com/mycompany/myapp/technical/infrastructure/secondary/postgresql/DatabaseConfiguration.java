package com.mycompany.myapp.technical.infrastructure.secondary.postgresql;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories({ "com.mycompany.myapp" })
@EnableTransactionManagement
public class DatabaseConfiguration {}
