package javaintermediateWork2;

//Žö‹Æ“à‰Û‘èBŒûÀî•ñƒNƒ‰ƒX‚Ìì¬B
public class AccountInfomation {
	private int accountNumber; //ŒûÀ”Ô†
	private String password; //ˆÃØ”Ô†
	private int registerCount; //ŒûÀ”Ô†‚Ì“o˜^‰ñ”
	private int registerBranchCount; //Žx“XƒR[ƒh‚Ì“o˜^‰ñ”
	private int branchCode; //Žx“XƒR[ƒh
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	//ŒûÀ”Ô†‚ð“o˜^‚·‚éB“o˜^‰ñ”‚ª2‰ñ‚Ìê‡AŒûÀ•ÏX‚Í‚Å‚«‚È‚¢Ž|‚ÌƒƒbƒZ[ƒW‚ð•\Ž¦‚·‚éB
	public void setAccountNumber(int accountNumber) {
		registerCount ++;
		if(registerCount >= 0 && registerCount <2) {
			this.accountNumber = accountNumber;
			System.out.println("ŒûÀ”Ô†‚ð“o˜^‚µ‚Ü‚µ‚½B");
		}else {
			System.out.println("ŒûÀ”Ô†‚Ì•ÏX‚Í1‰ñ‚µ‚©‚Å‚«‚Ü‚¹‚ñB");
		}
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		
		this.password = password;
		System.out.println("ƒpƒXƒ[ƒh‚ðÝ’è‚µ‚Ü‚µ‚½B");
	}
	public int getBranchCode() {
		return branchCode;
	}
	
	//Žx“XƒR[ƒh‚ð“o˜^‚·‚éB“o˜^‰ñ”‚ª2‰ñ‚Ìê‡AŒûÀ•ÏX‚Í‚Å‚«‚È‚¢Ž|‚ÌƒƒbƒZ[ƒW‚ð•\Ž¦‚·‚éB
	public void setBranchCode(int branchCode) {
		registerBranchCount ++;
		if(registerBranchCount >= 0 && registerBranchCount <2) {
			this.branchCode = branchCode;
			System.out.println("Žx“XƒR[ƒh‚ð“o˜^‚µ‚Ü‚µ‚½B");
		}else{
			System.out.println("Žx“XƒR[ƒh‚Ì•ÏX‚Í1‰ñ‚µ‚©‚Å‚«‚Ü‚¹‚ñB");
		}
	}
		
		public void ChangePassWord(String oldPassword,String newPassWord) {
			if(password.equals(oldPassword)) {
				password = newPassWord;
				System.out.println("ƒpƒXƒ[ƒh‚ð•ÏX‚µ‚Ü‚µ‚½");
			}else {
				System.out.println("Œ»Ý‚ÌƒpƒXƒ[ƒh‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
			}
		}
		
	}
	
