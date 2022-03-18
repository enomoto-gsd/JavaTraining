package work9.service;

import java.util.List;

import work9.entity.Participant;
import work9.form.EventEntryForm;

public interface EventEntryService {
	
	public List<Participant> selectEntryParticipant(Integer eventId);
	
	public void saveEventEntry(EventEntryForm eventEntryForm);
}
