package wyc.entity;

/**
 * �߶���ʿ��Very Important Person��
 * @author Yicheng Wang
 */
public class Vip {
	
	private int id;
	private String name;

	public Vip() { }

	public Vip(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
