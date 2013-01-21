package ee.itcollege.i377.team10.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Size;

import java.util.List;


/**
 * The persistent class for the VAHTKOND database table.
 * 
 */
@Entity
@Table(name="VAHTKOND")
public class Vahtkond extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Size(min = 1, max = 255)
	private String kood;
	@Size(min = 1, max = 255)
	private String nimetus;
	private Piiripunkt piiripunkt;
	private Vaeosa vaeosa;
	private List<Vahtkondpiiriloigul> vahtkondpiiriloiguls;
	private List<Vahtkonnaliige> vahtkonnaliiges;

	public Vahtkond() {
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


	//bi-directional many-to-one association to Piiripunkt
	@ManyToOne
	@JoinColumn(name="PIIRIPUNKT_ID")
	public Piiripunkt getPiiripunkt() {
		return this.piiripunkt;
	}

	public void setPiiripunkt(Piiripunkt piiripunkt) {
		this.piiripunkt = piiripunkt;
	}


	//bi-directional many-to-one association to Vaeosa
	@ManyToOne
	@JoinColumn(name="VAEOSA_ID")
	public Vaeosa getVaeosa() {
		return this.vaeosa;
	}

	public void setVaeosa(Vaeosa vaeosa) {
		this.vaeosa = vaeosa;
	}


	//bi-directional many-to-one association to Vahtkondpiiriloigul
	@OneToMany(mappedBy="vahtkond")
	public List<Vahtkondpiiriloigul> getVahtkondpiiriloiguls() {
		return this.vahtkondpiiriloiguls;
	}

	public void setVahtkondpiiriloiguls(List<Vahtkondpiiriloigul> vahtkondpiiriloiguls) {
		this.vahtkondpiiriloiguls = vahtkondpiiriloiguls;
	}


	//bi-directional many-to-one association to Vahtkonnaliige
	@OneToMany(mappedBy="vahtkond")
	public List<Vahtkonnaliige> getVahtkonnaliiges() {
		return this.vahtkonnaliiges;
	}

	public void setVahtkonnaliiges(List<Vahtkonnaliige> vahtkonnaliiges) {
		this.vahtkonnaliiges = vahtkonnaliiges;
	}

}