package com.bracamod.geo.test;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// @RunWith(SpringRunner.class)
@SpringBootTest
@EnableJpaRepositories("com.bracamod.geo.jpa.repository")
@EntityScan("com.bracamod.geo.entity")
public abstract class CucumberStepDefinitions {
 
}