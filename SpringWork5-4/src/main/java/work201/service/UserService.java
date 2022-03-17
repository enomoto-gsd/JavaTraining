package work201.service;

import work201.entity.UserEntity;
import work201.form.UserForm;

public interface UserService {
	public UserEntity serviceLogin(UserForm userForm);
}
