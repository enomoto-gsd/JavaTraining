package work201.service;

import org.springframework.stereotype.Service;

import work201.entity.UserEntity;
import work201.form.UserForm;

@Service
public class UserService {
	public UserEntity serviceLogin( UserForm userform) {
		//名前と年齢を移し替える	
		UserEntity entity = new UserEntity();
		entity.setName(userform.getName());
		entity.setAge(userform.getAge());
		return entity;
	}
}
