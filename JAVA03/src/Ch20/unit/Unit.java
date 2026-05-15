package Ch20.unit;

public abstract class Unit {
	int hp;
	int amor;
	String type;
	public boolean isDead;
	
	abstract public void move();
	abstract public void underAttack(int damage);
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAmor() {
		return amor;
	}
	public void setAmor(int amor) {
		this.amor = amor;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isDead() {
		return isDead;
	}
	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}
	
	
	
	
	
}
