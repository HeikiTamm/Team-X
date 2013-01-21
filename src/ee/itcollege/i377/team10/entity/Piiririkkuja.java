package ee.itcollege.i377.team10.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Size;

import java.util.List;


/**
 * The persistent class for the PIIRIRIKKUJA database table.
 * 
 */
@Entity
@Table(name="PIIRIRIKKUJA")
public class Piiririkkuja extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	@Size(min = 1, max = 255)
	private String eesnimi;
	@Size(min = 1, max = 255)
	private String isikukood;
	@Size(min = 1, max = 255)
	private String perekonnanimi;
	private int sugu;
	private List<Intsident> intsidents;

	public Piiririkkuja() {
	}


	@Column(length=255)
	public String getEesnimi() {
		return this.eesnimi;
	}

	public void setEesnimi(String eesnimi) {
		this.eesnimi = eesnimi;
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


	public int getSugu() {
		return this.sugu;
	}

	public void setSugu(int sugu) {
		this.sugu = sugu;
	}


	//bi-directional many-to-one association to Intsident
	@OneToMany(mappedBy="piiririkkuja")
	public List<Intsident> getIntsidents() {
		return this.intsidents;
	}

	public void setIntsidents(List<Intsident> intsidents) {
		this.intsidents = intsidents;
	}

}