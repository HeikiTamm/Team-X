package ee.itcollege.i377.team10.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;


/**
 * The persistent class for the PIIRIVALVURAUASTE database table.
 * 
 */
@Entity
@Table(name="PIIRIVALVURAUASTE")
public class Piirivalvurauaste extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Timestamp alates;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Timestamp kuni;
	private Auaste auaste;
	private Piirivalvur piirivalvur;

	public Piirivalvurauaste() {
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


	//bi-directional many-to-one association to Auaste
	@ManyToOne
	@JoinColumn(name="AUASTE_ID")
	public Auaste getAuaste() {
		return this.auaste;
	}

	public void setAuaste(Auaste auaste) {
		this.auaste = auaste;
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