package mvc_crud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mvc_crud.dto.Student;

@Component
public class StudentDao {

	@Autowired
	EntityManagerFactory factory;
	
	public void save(Student student) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.persist(student);
		transaction.commit();
		
	}

	public List<Student> fetch(){
		EntityManager manager=factory.createEntityManager();
		return manager.createQuery("select x from Student x").getResultList();
	}
	
	public Student find(int id){
		EntityManager manager=factory.createEntityManager();
		
		return manager.find(Student.class, id);
	}
	
	public void delete(int id){
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.remove(manager.find(Student.class, id));
		transaction.commit();
	}

	public void update(Student student) {
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		manager.merge(student);
		transaction.commit();	}
}
