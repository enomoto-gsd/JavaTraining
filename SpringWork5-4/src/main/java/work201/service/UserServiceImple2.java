package work201.service;

import work201.entity.UserEntity;
import work201.form.UserForm;
//@Service
public class UserServiceImple2 implements UserService {
	public UserEntity serviceLogin( UserForm userform) {
		//formの名前と年齢をEntity移し替えただけ	
		//UserServiceImpleと切り替える。別処理としてコンソール表示
		System.out.println("UserServiceImple2");
		UserEntity entity = new UserEntity();
		entity.setName(userform.getName());
		entity.setAge(userform.getAge());
		return entity;
	}
}
