package work201.form;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UserForm {
	private Integer id;
	@NotNull
	private String name;
	@NotNull
	private Integer age;
	
}
