package javaIntermediateWork1;
/*main���\�b�h����RobotFactory�N���X���Ăяo����
 * Robot�N���X�̃I�u�W�F�N�g���쐬
 * ��L�̏������I�������u���{�b�g�̍쐬���������܂����v�Ƃ�����������o�͂��Ċ���
 */
public class SampleController {
	public static void main(String[] args) {
		
		Robot robo = RobotFactory.getCreateRobot("���{�b�g");
		System.out.println(robo.getName() + "�𐻑����������܂���");

	}

}
