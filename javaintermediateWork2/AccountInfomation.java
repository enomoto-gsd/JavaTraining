package javaintermediateWork2;

//���Ɠ��ۑ�B�������N���X�̍쐬�B
public class AccountInfomation {
	private int accountNumber; //�����ԍ�
	private String password; //�Ïؔԍ�
	private int registerCount; //�����ԍ��̓o�^��
	private int registerBranchCount; //�x�X�R�[�h�̓o�^��
	private int branchCode; //�x�X�R�[�h
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	//�����ԍ���o�^����B�o�^�񐔂�2��̏ꍇ�A�����ύX�͂ł��Ȃ��|�̃��b�Z�[�W��\������B
	public void setAccountNumber(int accountNumber) {
		registerCount ++;
		if(registerCount >= 0 && registerCount <2) {
			this.accountNumber = accountNumber;
			System.out.println("�����ԍ���o�^���܂����B");
		}else {
			System.out.println("�����ԍ��̕ύX��1�񂵂��ł��܂���B");
		}
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		
		this.password = password;
		System.out.println("�p�X���[�h��ݒ肵�܂����B");
	}
	public int getBranchCode() {
		return branchCode;
	}
	
	//�x�X�R�[�h��o�^����B�o�^�񐔂�2��̏ꍇ�A�����ύX�͂ł��Ȃ��|�̃��b�Z�[�W��\������B
	public void setBranchCode(int branchCode) {
		registerBranchCount ++;
		if(registerBranchCount >= 0 && registerBranchCount <2) {
			this.branchCode = branchCode;
			System.out.println("�x�X�R�[�h��o�^���܂����B");
		}else{
			System.out.println("�x�X�R�[�h�̕ύX��1�񂵂��ł��܂���B");
		}
	}
		
		public void ChangePassWord(String oldPassword,String newPassWord) {
			if(password.equals(oldPassword)) {
				password = newPassWord;
				System.out.println("�p�X���[�h��ύX���܂���");
			}else {
				System.out.println("���݂̃p�X���[�h����͂��Ă�������");
			}
		}
		
	}
	
