package ee.itcollege.i377.team10.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Size;

import java.util.List;


/**
 * The persistent class for the PIIRIVALVUR database table.
 * 
 */
@Entity
@Table(name="PIIRIVALVUR")
public class Piirivalvur extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Size(min = 1, max = 255)
	private String aadress;
	@Size(min = 1, max = 255)
	private String eesnimi;
	@Size(min = 1, max = 255)
	private String email;
	@Size(min = 1, max = 255)
	private String isikukood;
	@Size(min = 1, max = 255)
	private String perekonnanimi;
	@Size(min = 1, max = 255)
	private String sodurikood;
	private int sugu;
	@Size(min = 1, max = 255)
	private String telefon;
	private List<Intsident> intsidents;
	private List<Piirivalvurauaste> piirivalvurauastes;
	private List<Piirivalvurpiiripunkti> piirivalvurpiiripunktis;
	private List<Piirivalvurvaeosa> piirivalvurvaeosas;
	private List<Vahtkonnaliige> vahtkonnaliiges;

	public Piirivalvur() {
	}


	@Column(length=255)
	public String getAadress() {
		return this.aadress;
	}

	public void setAadress(String aadress) {
		this.aadress = aadress;
	}


	@Column(length=255)
	public String getEesnimi() {
		return this.eesnimi;
	}

	public void setEesnimi(String eesnimi) {
		this.eesnimi = eesnimi;
	}


	@Column(length=255)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	@Column(length=255)
	public String getIsikukood() {
		return this.isikukood;
	}

	public void setIsikukood(String isikukood) {
		this.isikukood = isikukood;
	}


	@Column(length=255)
	public String getPerekonnanimi() {
		return this.perekonnanimi;
	}

	public void setPerekonnanimi(String perekonnanimi) {
		this.perekonnanimi = perekonnanimi;
	}


	@Column(length=255)
	public String getSodurikood() {
		return this.sodurikood;
	}

	public void setSodurikood(String sodurikood) {
		this.sodurikood = sodurikood;
	}


	public int getSugu() {
		return this.sugu;
	}

	public void setSugu(int sugu) {
		this.sugu = sugu;
	}


	@Column(length=255)
	public String getTelefon() {
		return this.telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}


	//bi-directional many-to-one association to Intsident
	@OneToMany(mappedBy="piirivalvur")
	public List<Intsident> getIntsidents() {
		return this.intsidents;
	}

	public void setIntsidents(List<Intsident> intsidents) {
		this.intsidents = intsidents;
	}


	//bi-directional many-to-one association to Piirivalvurauaste
	@OneToMany(mappedBy="piirivalvur")
	public List<Piirivalvurauaste> getPiirivalvurauastes() {
		return this.piirivalvurauastes;
	}

	public void setPiirivalvurauastes(List<Piirivalvurauaste> piirivalvurauastes) {
		this.piirivalvurauastes = piirivalvurauastes;
	}


	//bi-directional many-to-one association to Piirivalvurpiiripunkti
	@OneToMany(mappedBy="piirivalvur")
	public List<Piirivalvurpiiripunkti> getPiirivalvurpiiripunktis() {
		return this.piirivalvurpiiripunktis;
	}

	public void setPiirivalvurpiiripunktis(List<Piirivalvurpiiripunkti> piirivalvurpiiripunktis) {
		this.piirivalvurpiiripunktis = piirivalvurpiiripunktis;
	}


	//bi-directional many-to-one association to Piirivalvurvaeosa
	@OneToMany(mappedBy="piirivalvur")
	public List<Piirivalvurvaeosa> getPiirivalvurvaeosas() {
		return this.piirivalvurvaeosas;
	}

	public void setPiirivalvurvaeosas(List<Piirivalvurvaeosa> piirivalvurvaeosas) {
		this.piirivalvurvaeosas = piirivalvurvaeosas;
	}


	//bi-directional many-to-one association to Vahtkonnaliige
	@OneToMany(mappedBy="piirivalvur")
	public List<Vahtkonnaliige> getVahtkonnaliiges() {
		return this.vahtkonnaliiges;
	}

	public void setVahtkonnaliiges(List<Vahtkonnaliige> vahtkonnaliiges) {
		this.vahtkonnaliiges = vahtkonnaliiges;
	}

}