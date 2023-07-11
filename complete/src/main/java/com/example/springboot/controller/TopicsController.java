package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.records.Topic;
import com.example.springboot.services.TopicsService;

@RestController
public class TopicsController {

	@Autowired
	private TopicsService topicsService;

	@GetMapping("/topics")
	public List<Topic> allTopics() {

		return topicsService.getAllTopicList();
	}

	@GetMapping("/topics/{id}")
	public List<Topic> getTopic(@PathVariable("id") String id) {

		return topicsService.getTopic(id);
	}

	@PostMapping("/topics")
	public void addTopic(@RequestBody Topic topic) {

		topicsService.addTopic(topic);
	}

	@PutMapping("/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable("id") String id) {

		topicsService.updateTopic(topic, id);
	}

	@DeleteMapping("/topics/{id}")
	public void deleteTopic(@PathVariable("id") String id) {

		topicsService.deleteTopic(id);
	}
}
