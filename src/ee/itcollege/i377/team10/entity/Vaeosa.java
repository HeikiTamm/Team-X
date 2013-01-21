package ee.itcollege.i377.team10.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Size;

import java.util.List;


/**
 * The persistent class for the VAEOSA database table.
 * 
 */
@Entity
@Table(name="VAEOSA")
public class Vaeosa extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Size(min = 1, max = 255)
	private String kood;
	@Size(min = 1, max = 255)
	private String nimetus;
	private List<Ametvaeosa> ametvaeosas;
	private List<Piirivalvurvaeosa> piirivalvurvaeosas;
	private List<Vahtkond> vahtkonds;

	public Vaeosa() {
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


	//bi-directional many-to-one association to Ametvaeosa
	@OneToMany(mappedBy="vaeosa")
	public List<Ametvaeosa> getAmetvaeosas() {
		return this.ametvaeosas;
	}

	public void setAmetvaeosas(List<Ametvaeosa> ametvaeosas) {
		this.ametvaeosas = ametvaeosas;
	}


	//bi-directional many-to-one association to Piirivalvurvaeosa
	@OneToMany(mappedBy="vaeosa")
	public List<Piirivalvurvaeosa> getPiirivalvurvaeosas() {
		return this.piirivalvurvaeosas;
	}

	public void setPiirivalvurvaeosas(List<Piirivalvurvaeosa> piirivalvurvaeosas) {
		this.piirivalvurvaeosas = piirivalvurvaeosas;
	}


	//bi-directional many-to-one association to Vahtkond
	@OneToMany(mappedBy="vaeosa")
	public List<Vahtkond> getVahtkonds() {
		return this.vahtkonds;
	}

	public void setVahtkonds(List<Vahtkond> vahtkonds) {
		this.vahtkonds = vahtkonds;
	}

}