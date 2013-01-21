package ee.itcollege.i377.team10.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Size;

import java.util.List;


/**
 * The persistent class for the AMET database table.
 * 
 */
@Entity
@Table(name="AMET")
public class Amet extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Size(min = 1, max = 255)
	private String iscokood;
	@Size(min = 1, max = 255)
	private String nimetus;
	private List<Ametpiiripunkti> ametpiiripunktis;
	private List<Ametvaeosa> ametvaeosas;

	public Amet() {
	}


	@Column(length=255)
	public String getIscokood() {
		return this.iscokood;
	}

	public void setIscokood(String iscokood) {
		this.iscokood = iscokood;
	}
	

	@Column(length=255)
	public String getNimetus() {
		return this.nimetus;
	}

	public void setNimetus(String nimetus) {
		this.nimetus = nimetus;
	}


	//bi-directional many-to-one association to Ametpiiripunkti
	@OneToMany(mappedBy="amet")
	public List<Ametpiiripunkti> getAmetpiiripunktis() {
		return this.ametpiiripunktis;
	}

	public void setAmetpiiripunktis(List<Ametpiiripunkti> ametpiiripunktis) {
		this.ametpiiripunktis = ametpiiripunktis;
	}


	//bi-directional many-to-one association to Ametvaeosa
	@OneToMany(mappedBy="amet")
	public List<Ametvaeosa> getAmetvaeosas() {
		return this.ametvaeosas;
	}

	public void setAmetvaeosas(List<Ametvaeosa> ametvaeosas) {
		this.ametvaeosas = ametvaeosas;
	}

}