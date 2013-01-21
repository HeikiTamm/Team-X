package ee.itcollege.i377.team10.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PIIRIVALVURVAEOSAS database table.
 * 
 */
@Entity
@Table(name="PIIRIVALVURVAEOSAS")
public class Piirivalvurvaeosa extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private double koormus;
	private Ametvaeosa ametvaeosa;
	private Piirivalvur piirivalvur;
	private Vaeosa vaeosa;

	public Piirivalvurvaeosa() {
	}


	public double getKoormus() {
		return this.koormus;
	}

	public void setKoormus(double koormus) {
		this.koormus = koormus;
	}


	//bi-directional many-to-one association to Ametvaeosa
	@ManyToOne
	@JoinColumn(name="AMETVAEOSAS_ID")
	public Ametvaeosa getAmetvaeosa() {
		return this.ametvaeosa;
	}

	public void setAmetvaeosa(Ametvaeosa ametvaeosa) {
		this.ametvaeosa = ametvaeosa;
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


	//bi-directional many-to-one association to Vaeosa
	@ManyToOne
	@JoinColumn(name="VAEOSA_ID")
	public Vaeosa getVaeosa() {
		return this.vaeosa;
	}

	public void setVaeosa(Vaeosa vaeosa) {
		this.vaeosa = vaeosa;
	}

}