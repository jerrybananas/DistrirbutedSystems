package gr.hua.dit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "Employees")
@Entity
@Table(name = "employees")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4310661683443846471L;

	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "Name")
	private String name;

	@Column(name = "Role")
	private String role;

	@Column(name = "Sumbit")
	private Boolean sumbit;

	@Column(name = "Calculate")
	private Boolean calculate;
	
	@Column(name = "Password")
	private String password;
	
	public Employee() {
		
	}

	public Employee(int id, String name, String role, Boolean sumbit, Boolean calculate, String password) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.sumbit = sumbit;
		this.calculate = calculate;
		this.password = password;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Boolean getSumbit() {
		return sumbit;
	}

	public void setSumbit(Boolean sumbit) {
		this.sumbit = sumbit;
	}
	
	public Boolean getCalculate() {
		return calculate;
	}

	public void setCalculate(Boolean calculate) {
		this.calculate = calculate;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + name + ", Role=" + role + ", Sumbit=" + sumbit + ", Calculate=" + calculate + ", Password=" + password +"]";
	}
	
	

}
