package work72.service;

import org.springframework.stereotype.Service;

import work72.entity.UserEntity;
import work72.form.UserForm;

@Service
public class ServiceImpl implements UserService {
	private int userId =0;
	public UserEntity serviceRegistar(UserForm userForm) {
		// ユーザ情報
		// Entityクラスは本来DBなどに格納する用途（今回はDB使用無しなのでここまで）
	

		// 年齢が20歳以上の場合のみ登録処理を実行
		if(userForm.getAge() < 20) {
			return null;
		}else {
			UserEntity entity = new UserEntity();
			userId = userId + 1;
			entity.setId(userId);
			entity.setName(userForm.getName());
			entity.setAge(userForm.getAge());
			return entity;
		}
		
	}
	
}
