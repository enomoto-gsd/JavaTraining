package work9;

/*9�͂܂Ƃ߉ۑ�
 * ����Z�̋@�\��񋟂���N���X���쐬���܂��B
 * ����Z�̃��\�b�h���쐬���܂��B
 * ����Z�̌��ʂ����̏ꍇ�͊���Z�̌��ʂ��A��̏ꍇ�͓Ǝ���O�Ŋ�ƂȂ���
 * ���Ƃ��Ăяo�����ɒʒm���鏈����ǉ����܂��B
 * ������������s���āA��O�̔��������m�ł��邩���m�F���邱�Ƃ��B
 */
public class RunCalculation {
	public static void main(String[] arggs) {
		Calc c = new Calc();
		try {
		   int ans = c.getDivideCalcurate(3);
		   System.out.println(ans+"�͋����ł��B");
		}catch(OddNumberException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
