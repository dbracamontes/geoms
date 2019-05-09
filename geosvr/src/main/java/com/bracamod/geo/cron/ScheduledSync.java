package com.bracamod.geo.cron;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledSync {

	@Scheduled(fixedRate= 5000 )
	public void syncElasticSearch() {
		
	}
}
