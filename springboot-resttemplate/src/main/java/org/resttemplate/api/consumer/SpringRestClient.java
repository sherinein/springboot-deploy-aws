package org.resttemplate.api.consumer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.resttemplate.api.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SpringRestClient {
	@Autowired
	RestTemplate restTemplate;

	public static final String GET_TOPICS_ENDPOINT_URL = "http://localhost:8080/api/topics";
	public static final String GET_TOPIC_ENDPOINT_URL = "http://localhost:8080/api/topics/";
	public static final String CREATE_TOPICS_ENDPOINT_URL = "http://localhost:8080/api/topics/";
	public static final String UPDATE_TOPICS_ENDPOINT_URL = "http://localhost:8080/api/topics/";
	public static final String DELETE_TOPICS_ENDPOINT_URL = "http://localhost:8080/api/topics/";

	@GetMapping("/template/topics")
	private String getAllTopic() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		return restTemplate.exchange(GET_TOPICS_ENDPOINT_URL, HttpMethod.GET, entity, String.class).getBody();

	}

	@GetMapping("/template/topics/{id}")
	private String getTopicById(@PathVariable("id") String id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		return restTemplate.exchange(GET_TOPIC_ENDPOINT_URL +id, HttpMethod.GET, entity, String.class).getBody();

	}

	@PostMapping("/template/topics")
	private String createTopic(@RequestBody Topic topic) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Topic> entity = new HttpEntity<Topic>(topic, headers);

		return restTemplate.exchange(CREATE_TOPICS_ENDPOINT_URL, HttpMethod.POST, entity, String.class).getBody();
	}

	@PutMapping("/template/topics/{id}")
	private String updateTopic(@PathVariable("id") String id, @RequestBody Topic topic) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Topic> entity = new HttpEntity<Topic>(topic, headers);

		return restTemplate.exchange(UPDATE_TOPICS_ENDPOINT_URL + id, HttpMethod.PUT, entity, String.class).getBody();

	}

	@DeleteMapping("/template/topics/{id}")
	private String deleteTopic(@PathVariable("id") String id) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Topic> entity = new HttpEntity<Topic>(headers);

		return restTemplate.exchange(DELETE_TOPICS_ENDPOINT_URL + id, HttpMethod.DELETE, entity, String.class)
				.getBody();

	}

}
