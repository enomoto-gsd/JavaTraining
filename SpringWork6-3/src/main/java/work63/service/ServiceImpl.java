package work63.service;

import org.springframework.stereotype.Service;

import work63.entity.UserEntity;
import work63.form.UserForm;

@Service
public class ServiceImpl implements UserService {

	public UserEntity serviceRegistar(UserForm userform) {
		UserEntity entity = new UserEntity();
		entity.setAge(userform.getAge());
		entity.setName(userform.getName());
		
		return entity;
	}
	
}
