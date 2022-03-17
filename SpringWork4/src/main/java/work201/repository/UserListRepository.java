package work201.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import work201.entity.UserList;

public interface UserListRepository extends JpaRepository <UserList, Integer>{
	
	
}
