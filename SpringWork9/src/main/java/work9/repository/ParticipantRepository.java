package work9.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import work9.entity.Participant;

/**
 * participantテーブルを操作するためのRepositoryクラスです
 */
public interface ParticipantRepository extends JpaRepository<Participant, Integer> {
}