package com.hospitalManagement.HospitalManagement.webRepository;

import com.hospitalManagement.HospitalManagement.webEntity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {

    //Method to find Doctor by Id
    Optional<Doctor> findById(int doctorId);

}
