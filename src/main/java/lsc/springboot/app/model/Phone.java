package lsc.springboot.app.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PHONE")
public class Phone extends AbstractEntity{
	
	String type;
	
	String value;
	
	public Phone() {
		
	}

	public Phone(String type, String value) {
		super();
		this.type = type;
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	

}
