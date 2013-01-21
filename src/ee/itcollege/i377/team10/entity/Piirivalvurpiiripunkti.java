package ee.itcollege.i377.team10.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;


/**
 * The persistent class for the PIIRIVALVURPIIRIPUNKTIS database table.
 * 
 */
@Entity
@Table(name="PIIRIVALVURPIIRIPUNKTIS")
public class Piirivalvurpiiripunkti extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Timestamp alates;
	private double koormus;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Timestamp kuni;
	private Piirivalvur piirivalvur;

	public Piirivalvurpiiripunkti() {
	}


	public Timestamp getAlates() {
		return this.alates;
	}

	public void setAlates(Timestamp alates) {
		this.alates = alates;
	}


	public double getKoormus() {
		return this.koormus;
	}

	public void setKoormus(double koormus) {
		this.koormus = koormus;
	}


	public Timestamp getKuni() {
		return this.kuni;
	}

	public void setKuni(Timestamp kuni) {
		this.kuni = kuni;
	}


	//bi-directional many-to-one association to Piirivalvur
	@ManyToOne
	@JoinColumn(name="PIIRIVALVUR_ID")
	public Piirivalvur getPiirivalvur() {
		return this.piirivalvur;
	}

	public void setPiirivalvur(Piirivalvur piirivalvur) {
		this.piirivalvur = piirivalvur;
	}

}