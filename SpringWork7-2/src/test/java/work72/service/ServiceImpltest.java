package work72.service;


import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import work72.entity.UserEntity;
import work72.form.UserForm;

@SpringBootTest
public class ServiceImpltest {

	 @Autowired
	 UserService userService;
	
	
	
	@Test
	//年齢が20歳の場合のテスト
	public void test001(){
		UserForm userForm = new UserForm();
		userForm.setName("榎本");
		userForm.setAge(20);
		UserEntity entity = userService.serviceRegistar(userForm);
		assertThat(entity.getAge(),is(20));
		
		
	}
	@Test
	//年齢が19際の場合のテスト。使用上nullを返すはず。
	public void test002() {
		UserForm userForm = new UserForm();
		userForm.setName("榎本");
		userForm.setAge(19);
		UserEntity entity = userService.serviceRegistar(userForm);
		assertThat(entity,is(nullValue()));
	}
	
	
}
