package cs489.apsd.dentalsurgeryapp.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "appointments")
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate appointmentDate;

    private LocalTime appointmentTime;

    private String status;

    @ManyToOne
    @JoinColumn(name = "surgeryId")
//    @JsonBackReference
    private Surgery surgery;

    @ManyToOne
    @JoinColumn(name = "dentistId")
//    @JsonBackReference
    private Dentist dentist;

    @ManyToOne
    @JoinColumn(name = "patientId")
//   @JsonBackReference
    private Patient patient;
}
