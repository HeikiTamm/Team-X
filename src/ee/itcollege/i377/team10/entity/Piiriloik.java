package ee.itcollege.i377.team10.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Size;

import java.util.List;


/**
 * The persistent class for the PIIRILOIK database table.
 * 
 */
@Entity
@Table(name="PIIRILOIK")
public class Piiriloik extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private String gpskoordinaadid;
	@Size(min = 1, max = 255)
	private String kood;
	private double korgusmerepinnast;
	@Size(min = 1, max = 255)
	private String nimetus;
	private List<Intsident> intsidents;
	private List<Piiriloiguhaldaja> piiriloiguhaldajas;
	private List<Vahtkondpiiriloigul> vahtkondpiiriloiguls;

	public Piiriloik() {
	}


	@Column(length=255)
	public String getGpskoordinaadid() {
		return this.gpskoordinaadid;
	}

	public void setGpskoordinaadid(String gpskoordinaadid) {
		this.gpskoordinaadid = gpskoordinaadid;
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


	//bi-directional many-to-one association to Intsident
	@OneToMany(mappedBy="piiriloik")
	public List<Intsident> getIntsidents() {
		return this.intsidents;
	}

	public void setIntsidents(List<Intsident> intsidents) {
		this.intsidents = intsidents;
	}


	//bi-directional many-to-one association to Piiriloiguhaldaja
	@OneToMany(mappedBy="piiriloik")
	public List<Piiriloiguhaldaja> getPiiriloiguhaldajas() {
		return this.piiriloiguhaldajas;
	}

	public void setPiiriloiguhaldajas(List<Piiriloiguhaldaja> piiriloiguhaldajas) {
		this.piiriloiguhaldajas = piiriloiguhaldajas;
	}


	//bi-directional many-to-one association to Vahtkondpiiriloigul
	@OneToMany(mappedBy="piiriloik")
	public List<Vahtkondpiiriloigul> getVahtkondpiiriloiguls() {
		return this.vahtkondpiiriloiguls;
	}

	public void setVahtkondpiiriloiguls(List<Vahtkondpiiriloigul> vahtkondpiiriloiguls) {
		this.vahtkondpiiriloiguls = vahtkondpiiriloiguls;
	}

}