package gr.hua.dit.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Customer")
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4310661683443846471L;

	/**
	 * 
	 */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CID")
	private int cid;

	@Column(name = "came")
	private String cname;

	@Column(name = "AFM")
	private String cafm;

	@Column(name = "model")
	private String model;

	@Column(name = "plate_num")
	private String plate_num;

	@Column(name = "type")
	private String type;

	@Column(name = "year")
	private int year;

	@Column(name = "condition")
	private String condition;

	@Column(name = "afm_given")
	private Boolean afm_given;

	public Customer() {

	}
	
	

	public Customer(int cid, String cname, String cafm, String model, String plate_num, String type, int year,
			String condition, Boolean afm_given) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cafm = cafm;
		this.model = model;
		this.plate_num = plate_num;
		this.type = type;
		this.year = year;
		this.condition = condition;
		this.afm_given = afm_given;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCafm() {
		return cafm;
	}

	public void setCafm(String cafm) {
		this.cafm = cafm;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPlate_num() {
		return plate_num;
	}

	public void setPlate_num(String plate_num) {
		this.plate_num = plate_num;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Boolean getAfm_given() {
		return afm_given;
	}

	public void setAfm_given(Boolean afm_given) {
		this.afm_given = afm_given;
	}

	
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cafm=" + cafm + ", model=" + model + ", plate_num="
				+ plate_num + ", type=" + type + ", year=" + year + ", condition=" + condition + ", afm_given="
				+ afm_given + "]";
	}

}
