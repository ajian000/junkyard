package base;

import util.Rand;

public class Player {
	public Player(int atk,int def,int matk,int mdef,int spd,int luk,int hp,int tec) {
		this.atk = atk;
		this.def = def;
		this.matk = matk;
		this.mdef = mdef;
		this.spd = spd;
		this.luk = luk;
		this.hp = hp;
		this.tec = tec;
	}
	/**
	 * Base Damage = (atk - def) * (random(0.75 + luk,1)) + 1
	 * Base Magic Damage = (matk - mdef) * (random(0.75 + luk,1)) + 1
	 * Hit Chance = BaseChance + 2 * tec - luk - spd
	 * */
	public static int atk;
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public static int def;
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public static int matk;
	public int getMatk() {
		return matk;
	}
	public void setMatk(int matk) {
		this.matk = matk;
	}
	public static int mdef;
	public int getMdef() {
		return mdef;
	}
	public void setmdef(int mdef) {
		this.mdef = mdef;
	}
	public static int spd;
	public int getSpd() {
		return spd;
	}
	public void setSpd(int spd) {
		this.spd = spd;
	}
	public static int luk;
	public int getLuk() {
		return luk;
	}
	public void setLuk(int luk) {
		this.luk = luk;
	}
	public static int hp;
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public static int tec;
	public int getTec() {
		return tec;
	}
	public void setTec(int tec) {
		this.tec = tec;
	}
	/*************************************************/
	public static void attack(Player defer) {
		int baseDamage = atk * (atk - def) * (util.Rand.ranInt(75 + luk,1))/(100) + 1;
		if(hit()) {
			defer.setHp(defer.getHp()-baseDamage);
		}
	}
	
}
