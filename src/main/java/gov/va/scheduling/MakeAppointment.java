package gov.va.scheduling;

import java.io.Serializable;

public class MakeAppointment implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3744277844849549610L;
	
	private String patientIen;
	private String appointmentDateTime;
	
	public String getPatientIen() {
		return patientIen;
	}
	public void setPatientIen(String patientIen) {
		this.patientIen = patientIen;
	}
	public String getAppointmentDateTime() {
		return appointmentDateTime;
	}
	public void setAppointmentDateTime(String appointmentDateTime) {
		this.appointmentDateTime = appointmentDateTime;
	}
	
	
}
