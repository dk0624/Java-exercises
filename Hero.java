package bao;

public class Hero {

	String name;//姓名
	int price;//价格
	float hp;//血量
	float armor;//护甲
	int moveSpeed;//移动速度
	int killed;//送了多少人头
	int kill;//杀了多少人
	int support;//助攻次数
	int money;//金钱
	int lastHit;//补刀数
	int attackSpeed;//攻击速度
	String wordAfterKill;//杀人后说的话
	String wordAfterkilled;//被杀后说的话
	
	public static void main(String[] args) {
		
		Hero garen = new Hero();
		garen.name="盖伦";
		garen.moveSpeed=350;
		garen.addSpeed(100);
		garen.hp=600;
		garen.recovery(100);
		
	
	}
	
	void addSpeed(int Speed){
		moveSpeed=moveSpeed+Speed;
		System.out.println();
		
	}
	
	void legenderay(){
		System.out.println("超神啦！");
	}
	
	float getHp(){
		return hp;
	}
		void recovery(float blood){
			hp = hp+blood;
			System.out.println(hp);
		}
	

}
