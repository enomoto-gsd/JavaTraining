package work9.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import work9.entity.EventEntry;
import work9.entity.Participant;
import work9.form.EventEntryForm;
import work9.repository.EventEntryRepository;
import work9.repository.ParticipantRepository;


@Service
public class EventEntryServiceImpl implements EventEntryService {
	@Autowired
	EventEntryRepository eventEntryRepository;
	
	@Autowired
	ParticipantRepository participantRepository;
	
	@Override
	public List<Participant> selectEntryParticipant(Integer eventId){
		List<EventEntry> eventEntryList = eventEntryRepository.findByEventId(eventId);
		
		//イベント参加者のIDを取得。複数いるかもしれないのでリストで受け取る。
		List<Integer> ids = new ArrayList<Integer>();
		for(EventEntry eventEntry: eventEntryList) {
			ids.add(eventEntry.getParticipantId());
		}
		
		//イベント参加者IDであるidsを引数にセットし、イベント参加者の情報を検索
		List<Participant> participantList = participantRepository.findAllById(ids);
		return participantList;
	}

	@Override
	public void saveEventEntry(EventEntryForm eventEntryForm) {
		Participant participant = new Participant();
		participant.setParticipantName(eventEntryForm.getParticipantName());
		 //participant.setParticipantId(eventEntryForm.getEventId());
		participantRepository.save(participant);
	 
		
		EventEntry eventEntry = new EventEntry();
		eventEntry.setEventId(eventEntryForm.getEventId());
		eventEntry.setParticipantId(participant.getParticipantId());
		eventEntryRepository.save(eventEntry);
		
	}
	
}
