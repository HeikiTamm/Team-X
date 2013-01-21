package ee.itcollege.i377.team10.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the AMETVAEOSAS database table.
 * 
 */
@Entity
@Table(name="AMETVAEOSAS")
public class Ametvaeosa extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Timestamp alates;
	@DateTimeFormat(pattern = "dd.MM.yyyy")
	private Timestamp kuni;
	private Amet amet;
	private Vaeosa vaeosa;
	private List<Piirivalvurvaeosa> piirivalvurvaeosas;

	public Ametvaeosa() {
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


	//bi-directional many-to-one association to Amet
	@ManyToOne
	@JoinColumn(name="AMET_ID")
	public Amet getAmet() {
		return this.amet;
	}

	public void setAmet(Amet amet) {
		this.amet = amet;
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


	//bi-directional many-to-one association to Piirivalvurvaeosa
	@OneToMany(mappedBy="ametvaeosa")
	public List<Piirivalvurvaeosa> getPiirivalvurvaeosas() {
		return this.piirivalvurvaeosas;
	}

	public void setPiirivalvurvaeosas(List<Piirivalvurvaeosa> piirivalvurvaeosas) {
		this.piirivalvurvaeosas = piirivalvurvaeosas;
	}

}