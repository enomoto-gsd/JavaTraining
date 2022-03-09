package javaintermediateWork2;

public class Account {
	public static void main(String[] args) {
		AccountInfomation acinfo = new AccountInfomation();
		acinfo.setAccountNumber(110203);
		acinfo.setBranchCode(100);
		acinfo.setPassword("A123");
		//2âÒñ⁄à»ç~ÇÃìoò^
		acinfo.setAccountNumber(234344);
		acinfo.setBranchCode(123);
		acinfo.ChangePassWord("A123", "AA123");
		
		
		
		

	}

}
