package com.xworkz.hospital.crud;

import com.xworkz.hospital.dto.PatientDTO;

public interface Hospital {
	public boolean createPatient(PatientDTO dto);
	public void getPatientDetails();
	public boolean updatePatientNameById(int id, String name);
	public boolean updatePatientAddressById(int id, String address);
	public boolean deletePatientByName(String name);
	public boolean deletePatientByAddress(String address);
}
