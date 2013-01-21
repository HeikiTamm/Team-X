package ee.itcollege.i377.team10.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;


/**
 * The persistent class for the INTSIDENT database table.
 * 
 */
@Entity
@Table(name="INTSIDENT")
public class Intsident extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private double gpslaiuskraad;
	private double gpspikkuskraad;
	@Size(min = 1, max = 255)
	private String kood;
	@Size(min = 1, max = 255)
	private String nimetus;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Timestamp toimumisealgus;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Timestamp toimumiselopp;
	private Piiriloik piiriloik;
	private Piiririkkuja piiririkkuja;
	private Piirivalvur piirivalvur;

	public Intsident() {
	}

	public double getGpslaiuskraad() {
		return this.gpslaiuskraad;
	}

	public void setGpslaiuskraad(double gpslaiuskraad) {
		this.gpslaiuskraad = gpslaiuskraad;
	}


	public double getGpspikkuskraad() {
		return this.gpspikkuskraad;
	}

	public void setGpspikkuskraad(double gpspikkuskraad) {
		this.gpspikkuskraad = gpspikkuskraad;
	}


	@Column(length=255)
	public String getKood() {
		return this.kood;
	}

	public void setKood(String kood) {
		this.kood = kood;
	}


	@Column(length=255)
	public String getNimetus() {
		return this.nimetus;
	}

	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
	}


	public Timestamp getToimumisealgus() {
		return this.toimumisealgus;
	}

	public void setToimumisealgus(Timestamp toimumisealgus) {
		this.toimumisealgus = toimumisealgus;
	}


	public Timestamp getToimumiselopp() {
		return this.toimumiselopp;
	}

	public void setToimumiselopp(Timestamp toimumiselopp) {
		this.toimumiselopp = toimumiselopp;
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


	//bi-directional many-to-one association to Piiririkkuja
	@ManyToOne
	@JoinColumn(name="PIIRIRIKKUJA_ID")
	public Piiririkkuja getPiiririkkuja() {
		return this.piiririkkuja;
	}

	public void setPiiririkkuja(Piiririkkuja piiririkkuja) {
		this.piiririkkuja = piiririkkuja;
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