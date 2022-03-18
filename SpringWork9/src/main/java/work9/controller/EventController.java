package work9.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import work9.entity.Event;
import work9.entity.Participant;
import work9.form.EventEntryForm;
import work9.form.EventForm;
import work9.service.EventEntryService;
import work9.service.EventService;

@Controller
public class EventController {
	
	@Autowired
	EventEntryService eventEntryService;
	
	@Autowired
	EventService eventService;
	
	
	/*トップページアクセス時の処理
	 * DBに登録されたイベント一覧を表示*/
	@GetMapping("/")
	public String list(Model model) {
		List<Event> eventList = eventService.findEventAll();
		model.addAttribute("eventList",eventList);
		return "eventlist";
	}
	/*新規イベント登録画面を表示する。
	 * 
	 */
	@GetMapping("regist")
		public String regist(Model model) {
			return "regist";
	}
	/*
	 * 指定されたイベントIDの詳細画面
	 * @PathVariableを使って、URLの情報をJavaのプログラムで使用。
	 */
	
	@GetMapping("entry/{eventId}")
	public String eventDetail(@PathVariable("eventId")Integer eventId, Model model) {
		List<Event> eventDetail = eventService.findEventOne(eventId);
		//ID指定して検索するので、１件の情報になる。
		model.addAttribute("event" ,eventDetail.get(0));
		//イベントIDで参加者の情報を検索する。
		List<Participant> participantList = eventEntryService.selectEntryParticipant(eventId);
		model.addAttribute("participantList",participantList);
		return "eventdetail";
	}
	
	
	
	/*画面に入力された情報でイベントの新規登録を実行する。
	 * @ModelAttributeでFormクラスとマッピングする。
	 */
	@PostMapping("eventregist")
	public String register(@ModelAttribute EventForm eventForm,Model model) {
		eventService.registar(eventForm);
		return "redirect:/";
	}
	/*画面に入力された情報でイベント参加登録を実行する。
	 */
	@PostMapping("entry/add")
	public String entry(@ModelAttribute EventEntryForm eventEntryForm) {
		eventEntryService.saveEventEntry(eventEntryForm);
		return "redirect:/entry/" +eventEntryForm.getEventId();
	}
	
	
}
