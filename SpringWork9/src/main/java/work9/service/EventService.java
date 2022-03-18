package work9.service;

import java.util.List;

import work9.entity.Event;
import work9.form.EventForm;

public interface EventService {
	
	
	//eventテーブルに登録されているイベント情報の全件検索
	public List<Event> findEventAll();
	
	//eventテーブルから指定したイベントIDに合致するイベント情報を検索する。
	public List<Event> findEventOne(Integer eventId);
	
	public void registar(EventForm eventForm);
}
