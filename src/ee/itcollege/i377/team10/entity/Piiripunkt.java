package ee.itcollege.i377.team10.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Size;

import java.util.List;


/**
 * The persistent class for the PIIRIPUNKT database table.
 * 
 */
@Entity
@Table(name="PIIRIPUNKT")
public class Piiripunkt extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private double gpslaiuskraad;
	private double gpspikkuskraad;
	@Size(min = 1, max = 255)
	private String kood;
	private double korgusmerepinnast;
	@Size(min = 1, max = 255)
	private String nimetus;
	private List<Ametpiiripunkti> ametpiiripunktis;
	private List<Piiriloiguhaldaja> piiriloiguhaldajas;
	private List<Vahtkond> vahtkonds;

	public Piiripunkt() {
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


	public double getKorgusmerepinnast() {
		return this.korgusmerepinnast;
	}

	public void setKorgusmerepinnast(double korgusmerepinnast) {
		this.korgusmerepinnast = korgusmerepinnast;
	}


	@Column(length=255)
	public String getNimetus() {
		return this.nimetus;
	}

	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
	}


	//bi-directional many-to-one association to Ametpiiripunkti
	@OneToMany(mappedBy="piiripunkt")
	public List<Ametpiiripunkti> getAmetpiiripunktis() {
		return this.ametpiiripunktis;
	}

	public void setAmetpiiripunktis(List<Ametpiiripunkti> ametpiiripunktis) {
		this.ametpiiripunktis = ametpiiripunktis;
	}


	//bi-directional many-to-one association to Piiriloiguhaldaja
	@OneToMany(mappedBy="piiripunkt")
	public List<Piiriloiguhaldaja> getPiiriloiguhaldajas() {
		return this.piiriloiguhaldajas;
	}

	public void setPiiriloiguhaldajas(List<Piiriloiguhaldaja> piiriloiguhaldajas) {
		this.piiriloiguhaldajas = piiriloiguhaldajas;
	}


	//bi-directional many-to-one association to Vahtkond
	@OneToMany(mappedBy="piiripunkt")
	public List<Vahtkond> getVahtkonds() {
		return this.vahtkonds;
	}

	public void setVahtkonds(List<Vahtkond> vahtkonds) {
		this.vahtkonds = vahtkonds;
	}

}