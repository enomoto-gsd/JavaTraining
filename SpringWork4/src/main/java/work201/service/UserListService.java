package work201.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import work201.entity.UserList;
import work201.repository.UserListRepository;

@Service
public class UserListService {
	
	@Autowired
	UserListRepository userListRepository;
	
	public List<UserList> findAll() {
		return userListRepository.findAll();
	}
	
	public void save(String name,Integer age) {
		UserList userList = new UserList();
		userList.setName(name);
		userList.setAge(age);
		userListRepository.save(userList);
	}
	
	public void delete(Integer id) {
		userListRepository.deleteById(id);
	}
}
