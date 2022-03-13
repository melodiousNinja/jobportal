package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.JobAdvert;
import com.model.JobSearch;
import com.service.JobSearchService;

@Controller
@ComponentScan("com.service")
public class FirstController {

	@Autowired
	private JobSearchService jobSearchService;

	@RequestMapping("/searchJobs")
	public ModelAndView searchJobs(@ModelAttribute JobSearch jobSearch) {

		List<JobAdvert> matchingJobAdverts = jobSearchService.searchJob(jobSearch);

		ModelAndView modelAndView = new ModelAndView("searchResult");
		modelAndView.addObject("matchingJobAdverts", matchingJobAdverts);

		return modelAndView;
	}

}
