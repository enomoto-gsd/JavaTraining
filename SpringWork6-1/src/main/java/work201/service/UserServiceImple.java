package work201.service;

import org.springframework.stereotype.Service;

import work201.entity.UserEntity;
import work201.form.UserForm;

@Service
public class UserServiceImple implements UserService {
	/*Serviceクラス内でユーザーIDを管理。singletonで管理されているので、
	 * 実行すれば、するだけentityインスタンスのId変数に＋１されていく。
	 *
	*/
	//ログ出力
	
	private int userId =0;
	public UserEntity serviceLogin( UserForm userform) {
		//ログ出力
		System.out.println("----Serviceクラス　serviceLoginメソッド開始-----");
		//formの名前と年齢をEntity移し替えただけ
		
		userId = userId +1;
		
		UserEntity entity = new UserEntity();
		
		entity.setId(userId);
		entity.setName(userform.getName());
		entity.setAge(userform.getAge());
		//ログ出力
		System.out.println("----Serviceクラス　serviceLoginメソッド終了-----");
		return entity;
	}
}
