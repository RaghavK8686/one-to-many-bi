package com.ty.one_to_many_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestDeleteHospitalBranch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
	
		
		Hospital hospital=entityManager.find(Hospital.class, 1);
		Branch  branch1=entityManager.find(Branch.class,1);
		Branch branch2=entityManager.find(Branch.class, 2);
		entityManager.remove(branch1);
		entityManager.remove(branch2);
		entityManager.remove(hospital);
		
	}

}
