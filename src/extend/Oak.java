package extend;

public class Oak extends Monster {

	public Oak(String name, int hp, int offensive) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
	}

	void attack(Living target) {
		int damege = 0;
		damege = offensive * Rand.get(10);
		target.hp = target.hp - damege; // 攻撃対象のHPを、計算したダメージ分減らす
		System.out.println(this.name + "が槍で攻撃！" + target.name + "に" + damege + "のダメージを与えた");
	}
}