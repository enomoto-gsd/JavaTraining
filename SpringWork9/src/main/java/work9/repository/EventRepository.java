package work9.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import work9.entity.Event;

/**
 * eventテーブルを操作するためのRepositoryクラスです
 */
public interface EventRepository extends JpaRepository<Event, Integer> {
	/**
	 * 指定したイベントIDからイベントの情報を検索します.
	 * @param eventId イベントID
	 * @return	イベント一覧
	 */
	//特殊な条件の場合は以下のように、定義を追加する必要がある。
	public List<Event> findByEventId(Integer eventId);
}