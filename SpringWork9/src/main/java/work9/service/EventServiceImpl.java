package work9.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import work9.entity.Event;
import work9.form.EventForm;
import work9.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService{
	//repositoryのインスタンスを注入
	@Autowired
	EventRepository eventRepository;
	
	@Override
	public List<Event> findEventAll() {
		List<Event> eventList = eventRepository.findAll();
		return eventList;
		
	
	}
	@Override
	public List<Event> findEventOne(Integer eventId) {
		List<Event> eventDetail = eventRepository.findByEventId(eventId);
		return eventDetail;
	}
	

	@Override
	public void registar(EventForm eventForm) {
		Event event = new Event();
		//Eventクラスに情報を詰め替える。
		event.setEventName(eventForm.getEventName());
		event.setEventDate(Date.valueOf(eventForm.getEventDate()));
		event.setEventVenue(eventForm.getEventVenue());
		eventRepository.save(event);
	}
	
	
}
