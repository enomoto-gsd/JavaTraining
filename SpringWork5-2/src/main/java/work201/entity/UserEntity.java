package work201.entity;

import lombok.Data;
@Data
public class UserEntity {
	//入力チェックを示すアノテーションは使用していない。
	private String name;
	private Integer age;
}
