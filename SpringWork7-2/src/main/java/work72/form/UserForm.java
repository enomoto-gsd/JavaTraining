package work72.form;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class UserForm {
	@NotNull
	private String name;
	@NotNull
	private Integer age;
}
