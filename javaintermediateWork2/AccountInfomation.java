package javaintermediateWork2;

//授業内課題。口座情報クラスの作成。
public class AccountInfomation {
	private int accountNumber; //口座番号
	private String password; //暗証番号
	private int registerCount; //口座番号の登録回数
	private int registerBranchCount; //支店コードの登録回数
	private int branchCode; //支店コード
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	//口座番号を登録する。登録回数が2回の場合、口座変更はできない旨のメッセージを表示する。
	public void setAccountNumber(int accountNumber) {
		registerCount ++;
		if(registerCount >= 0 && registerCount <2) {
			this.accountNumber = accountNumber;
			System.out.println("口座番号を登録しました。");
		}else {
			System.out.println("口座番号の変更は1回しかできません。");
		}
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		
		this.password = password;
		System.out.println("パスワードを設定しました。");
	}
	public int getBranchCode() {
		return branchCode;
	}
	
	//支店コードを登録する。登録回数が2回の場合、口座変更はできない旨のメッセージを表示する。
	public void setBranchCode(int branchCode) {
		registerBranchCount ++;
		if(registerBranchCount >= 0 && registerBranchCount <2) {
			this.branchCode = branchCode;
			System.out.println("支店コードを登録しました。");
		}else{
			System.out.println("支店コードの変更は1回しかできません。");
		}
	}
		
		public void ChangePassWord(String oldPassword,String newPassWord) {
			if(password.equals(oldPassword)) {
				password = newPassWord;
				System.out.println("パスワードを変更しました");
			}else {
				System.out.println("現在のパスワードを入力してください");
			}
		}
		
	}
	
