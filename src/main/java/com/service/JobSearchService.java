package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.model.CompanyInfo;
import com.model.JobAdvert;
import com.model.JobSearch;

@Service
public class JobSearchService {

	public List<JobAdvert> searchJob(JobSearch jobSearch) {

		ApplicationContext context = new ClassPathXmlApplicationContext("jobAdvertBean.xml");
		Map<String, JobAdvert> jobAdverts = context.getBeansOfType(JobAdvert.class);

		List<JobAdvert> matchingJobAdverts = new ArrayList<JobAdvert>();
		for (JobAdvert advert : jobAdverts.values()) {
			if (isMatchingJob(jobSearch, advert)) {
				matchingJobAdverts.add(advert);
			}
		}
		return matchingJobAdverts;
	}

	// Strict Matching on Location.
	// Fuzzy Matching over the other Search Keywords.
	private boolean isMatchingJob(JobSearch jobSearch, JobAdvert advert) {
		return advert.getLocation().contains(jobSearch.getLocation())
				&& (advert.getKeywords().contains(jobSearch.getJobKeyword())
						|| advert.getSalaryMin() <= jobSearch.getExpectedSalary()
						|| advert.getSalaryMax() >= jobSearch.getExpectedSalary());
	}
}
