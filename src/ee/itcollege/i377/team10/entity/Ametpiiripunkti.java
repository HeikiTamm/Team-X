package ee.itcollege.i377.team10.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;


/**
 * The persistent class for the AMETPIIRIPUNKTIS database table.
 * 
 */
@Entity
@Table(name="AMETPIIRIPUNKTIS")
public class Ametpiiripunkti extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Timestamp alates;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Timestamp kuni;
	private Amet amet;
	private Piiripunkt piiripunkt;

	public Ametpiiripunkti() {
	}


	public Timestamp getAlates() {
		return this.alates;
	}

	public void setAlates(Timestamp alates) {
		this.alates = alates;
	}
	

	public Timestamp getKuni() {
		return this.kuni;
	}

	public void setKuni(Timestamp kuni) {
		this.kuni = kuni;
	}


	//bi-directional many-to-one association to Amet
	@ManyToOne
	@JoinColumn(name="AMET_ID")
	public Amet getAmet() {
		return this.amet;
	}

	public void setAmet(Amet amet) {
		this.amet = amet;
	}


	//bi-directional many-to-one association to Piiripunkt
	@ManyToOne
	@JoinColumn(name="PIIRIPUNKT_ID")
	public Piiripunkt getPiiripunkt() {
		return this.piiripunkt;
	}

	public void setPiiripunkt(Piiripunkt piiripunkt) {
		this.piiripunkt = piiripunkt;
	}

}