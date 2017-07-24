package main_package.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService
{
	private List<Topic> topics = Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring description"),
			new Topic("Java", "Java Framework", "Java description"),
			new Topic("Javascript", "Javascript Framework", "Javascript description")
	);

	public List<Topic> getAllTopics()
	{
		return topics;
	}
}
