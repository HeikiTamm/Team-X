package ee.itcollege.i377.team10.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;


/**
 * The persistent class for the VAHTKONDPIIRILOIGUL database table.
 * 
 */
@Entity
@Table(name="VAHTKONDPIIRILOIGUL")
public class Vahtkondpiiriloigul extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Timestamp alates;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Timestamp kuni;
	private Piiriloik piiriloik;
	private Vahtkond vahtkond;

	public Vahtkondpiiriloigul() {
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


	//bi-directional many-to-one association to Piiriloik
	@ManyToOne
	@JoinColumn(name="PIIRILOIK_ID")
	public Piiriloik getPiiriloik() {
		return this.piiriloik;
	}

	public void setPiiriloik(Piiriloik piiriloik) {
		this.piiriloik = piiriloik;
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