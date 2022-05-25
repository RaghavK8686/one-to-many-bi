package com.ty.one_to_many_bi;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveHospitalBranch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("raghav");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Hospital hospital = new Hospital();
		hospital.setName("Appollo");
		hospital.setWeb("google");

		Branch branch1 = new Branch();
		branch1.setName("Appollo sub branch 1");
		branch1.setPhone(987412366l);
		branch1.setState("karnataka");
		branch1.setCountry("India");

		Branch branch2 = new Branch();
		branch2.setName("Appollo sub branch 2");
		branch2.setPhone(147896325l);
		branch2.setState("Delhi");
		branch2.setCountry("india");

		branch1.setHospital(hospital);
		branch2.setHospital(hospital);

		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityTransaction.commit();

	}
}
