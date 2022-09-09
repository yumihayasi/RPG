package extend;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Human brave = new Brave("勇者", 20, 20);
		Human fighter = new Fighter("戦士", 20, 20);
		Human wizard = new Wizard("魔法使い", 20, 20);

		List<Human> humans = new ArrayList<>();
		humans.add(brave);
		humans.add(fighter);
		humans.add(wizard);

		Monster slime = new Slime("スライム", 20, 20);
		Monster oak = new Oak("オーク", 20, 20);
		Monster dragon = new Dragon("ドラゴン", 20, 20);

		List<Monster> monsters = new ArrayList<>();
		monsters.add(slime);
		monsters.add(oak);
		monsters.add(dragon);

		while (true) {

			Human human = humans.get(Rand.get(humans.size()));
			Monster monster = monsters.get(Rand.get(monsters.size()));

			System.out.println("人間のターン！");
			human.attack(monster);

			if (monster.hp <= 0) {
				System.out.println(monster.name + "は倒れた。");
				monsters.remove(monster);
			}
			if (monsters.isEmpty()) {
				System.out.println("勇者たちは勝利した！");
				break;
			}

			System.out.println("モンスターのターン！");

			monster.attack(human);

			if (human.hp <= 0) {
				System.out.println(human.name + "は倒れた。");
				humans.remove(human);

				if (monsters.isEmpty()) {
					System.out.println("モンスターたちは勝利した!");
					break;
				}

			}

		}

	}

}
