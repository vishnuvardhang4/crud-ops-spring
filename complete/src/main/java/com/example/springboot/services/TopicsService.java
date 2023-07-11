package com.example.springboot.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springboot.records.Topic;

@Service
public class TopicsService {

	private List<Topic> topicLists = new ArrayList<>(
			Arrays.asList(new Topic("_spring", "_Spring FrameWork", "_Spring Description"),
					new Topic("spring", "Spring FrameWork", "Spring Description"),
					new Topic("java", "Java FrameWork", "Java Description")));

	public List<Topic> getAllTopicList() {

		return topicLists;
	}

	public List<Topic> getTopic(String id) {
		// TODO Auto-generated method stub
		return new ArrayList<>(
				Arrays.asList(topicLists.stream().filter(topic -> topic.getId().equals(id)).findFirst().get()));
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topicLists.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		// TODO Auto-generated method stub
		int itr = 0;
		for (Topic topicList : topicLists) {
			if (topicList.getId().equals(id)) {
				topicLists.set(itr, topic);
				break;
			}
			itr++;
		}
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topicLists.removeIf(topic -> topic.getId().equals(id));
	}

}
