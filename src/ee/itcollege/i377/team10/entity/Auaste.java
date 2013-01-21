package ee.itcollege.i377.team10.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Size;

import java.util.List;


/**
 * The persistent class for the AUASTE database table.
 * 
 */
@Entity
@Table(name="AUASTE")
public class Auaste extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Size(min = 1, max = 255)
	private String kood;
	@Size(min = 1, max = 255)
	private String nimetus;
	private int tyyp;
	private List<Piirivalvurauaste> piirivalvurauastes;

	public Auaste() {
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


	public int getTyyp() {
		return this.tyyp;
	}

	public void setTyyp(int tyyp) {
		this.tyyp = tyyp;
	}


	//bi-directional many-to-one association to Piirivalvurauaste
	@OneToMany(mappedBy="auaste")
	public List<Piirivalvurauaste> getPiirivalvurauastes() {
		return this.piirivalvurauastes;
	}

	public void setPiirivalvurauastes(List<Piirivalvurauaste> piirivalvurauastes) {
		this.piirivalvurauastes = piirivalvurauastes;
	}

}