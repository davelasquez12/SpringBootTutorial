package main_package.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService
{
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring description"),
			new Topic("Java", "Java Framework", "Java description"),
			new Topic("Javascript", "Javascript Framework", "Javascript description"))
	);

	public List<Topic> getAllTopics()
	{
		return topics;
	}

	public Topic getTopic(String id)
	{
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic)
	{
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic)
	{
		for(int i = 0; i < topics.size(); i++)
		{
			if(id.equals(topics.get(i).getId()))
			{
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deleteTopic(String id)
	{
		topics.removeIf(t -> t.getId().equals(id));
	}
}
