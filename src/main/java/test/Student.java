package test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "enr_id")
	private int enrId;

	@Column(name = "field")
	private String field;

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

	public int getEnrId() {
		return enrId;
	}

	public void setEnrId(int enrId) {
		this.enrId = enrId;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public Student() {};
	
	public Student(String name, int enr_id, String field) {
		this.name = name;
		this.enrId = enr_id;
		this.field = field;
	}

	@Override
	public String toString() {
		return "id: " + getId() + "|| name: " + getName() + "|| enrId: "
				+ getEnrId() + "|| field: " + getField();
	}
	
}
