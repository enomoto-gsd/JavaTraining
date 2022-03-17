package work201.service;

import org.springframework.stereotype.Service;

import work201.entity.UserEntity;
import work201.form.UserForm;

@Service
public class UserServiceImple implements UserService {
	public UserEntity serviceLogin( UserForm userform) {
		//formの名前と年齢をEntity移し替えただけ	
		UserEntity entity = new UserEntity();
		entity.setName(userform.getName());
		entity.setAge(userform.getAge());
		return entity;
	}
}
