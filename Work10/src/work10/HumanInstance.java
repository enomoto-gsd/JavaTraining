package work10;
import java.util.ArrayList;

//10�͂܂Ƃ߉ۑ�̎��s�N���X�BArrayList
public class HumanInstance {
	public static void main(String[] args) {
		//�l���i�[���郊�X�g�̍쐬�B
		ArrayList<Human> humanList = new ArrayList<>();
		//3�C���X�^���X���쐬���A�}�b�v�Ɋi�[����B
		Human h1  = new Human("�|�{",26);
		Human h2  = new Human("�䑾�Y",26);
		Human h3  = new Human("����",26);
		
		humanList.add(h1);
		humanList.add(h2);
		humanList.add(h3);
		
		for(int i=0; i<humanList.size(); i++) {
			humanList.get(i).introduce();
		}
		
		
		
		
	}

}
