package CDI;

import javax.inject.Inject;
import javax.inject.Named;


@Named
public class CdiBusinessExample {
	
	@Inject
	CdiDaoExample cdidaoexample;

	public CdiDaoExample getCdidaoexample() {
		return cdidaoexample;
	}

	public void setCdidaoexample(CdiDaoExample cdidaoexample) {
		this.cdidaoexample = cdidaoexample;
	}
	

}
