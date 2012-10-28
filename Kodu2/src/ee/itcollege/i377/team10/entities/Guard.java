package ee.itcollege.i377.team10.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the GUARD database table.
 * 
 */
@Entity
public class Guard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private int age;

	private String name;

	public Guard() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}