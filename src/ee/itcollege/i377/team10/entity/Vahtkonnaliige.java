package ee.itcollege.i377.team10.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;


/**
 * The persistent class for the VAHTKONNALIIGE database table.
 * 
 */
@Entity
@Table(name="VAHTKONNALIIGE")
public class Vahtkonnaliige extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Timestamp alates;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Timestamp kuni;
	private Piirivalvur piirivalvur;
	private Vahtkond vahtkond;

	public Vahtkonnaliige() {
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


	//bi-directional many-to-one association to Piirivalvur
	@ManyToOne
	@JoinColumn(name="PIIRIVALVUR_ID")
	public Piirivalvur getPiirivalvur() {
		return this.piirivalvur;
	}

	public void setPiirivalvur(Piirivalvur piirivalvur) {
		this.piirivalvur = piirivalvur;
	}


	//bi-directional many-to-one association to Vahtkond
	@ManyToOne
	@JoinColumn(name="VAHTKOND_ID")
	public Vahtkond getVahtkond() {
		return this.vahtkond;
	}

	public void setVahtkond(Vahtkond vahtkond) {
		this.vahtkond = vahtkond;
	}

}