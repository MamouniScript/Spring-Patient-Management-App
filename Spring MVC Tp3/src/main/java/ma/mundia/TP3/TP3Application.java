package ma.mundia.TP3;

import ma.mundia.TP3.entities.Patient;
import ma.mundia.TP3.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class TP3Application implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(TP3Application.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
       patientRepository.save(new Patient(null,"Mohamed",new Date(),false,4000));
       patientRepository.save(new Patient(null,"Hanane",new Date(),false,432));
       patientRepository.save(new Patient(null,"Imane",new Date(),true,340));
        patientRepository.save(new Patient(null,"Free GAZA",new Date(),false,4000));
        patientRepository.save(new Patient(null,"Free Palestine",new Date(),false,432));
        patientRepository.save(new Patient(null,"Anti ",new Date(),true,340));patientRepository.save(new Patient(null,"Mohamed",new Date(),false,4000));
        patientRepository.save(new Patient(null,"Zionist",new Date(),false,432));
        patientRepository.save(new Patient(null,"Genocide",new Date(),true,340));

    }
}
