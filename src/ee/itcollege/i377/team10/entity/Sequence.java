package ee.itcollege.i377.team10.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the SEQUENCE database table.
 * 
 */
@Entity
@Table(name="SEQUENCE")
public class Sequence implements Serializable {
	private static final long serialVersionUID = 1L;
	private String seqName;
	private BigDecimal seqCount;

	public Sequence() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="SEQ_NAME", unique=true, nullable=false, length=50)
	public String getSeqName() {
		return this.seqName;
	}

	public void setSeqName(String seqName) {
		this.seqName = seqName;
	}


	@Column(name="SEQ_COUNT", precision=38)
	public BigDecimal getSeqCount() {
		return this.seqCount;
	}

	public void setSeqCount(BigDecimal seqCount) {
		this.seqCount = seqCount;
	}

}