package work9.form;

import lombok.Data;
/**
 * イベント参加情報のFormクラスです
 */
@Data
public class EventEntryForm {
	/*イベントID。Hiddenの項目でイベントIDを持たされるようになっている。
	 * 
	 */ 
	private Integer eventId;
	// イベント参加者名
	private String participantName;
}