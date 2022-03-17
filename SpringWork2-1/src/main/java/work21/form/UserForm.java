package work21.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class UserForm {
	@NotBlank
	private String id;
	@NotBlank
	@Pattern(regexp="[0-9]*")
	private String password;
	
	
	public UserForm() {
		
	}
	
	UserForm(String id,String password){
		this.id = id;
		this.password = password;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
	
