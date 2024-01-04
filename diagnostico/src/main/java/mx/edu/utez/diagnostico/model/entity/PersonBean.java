package mx.edu.utez.diagnostico.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "person")
public class PersonBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "ape1")
    private String ape1;
    @Column(name = "ape2")
    private String ape2;
    @Column(name = "curp", length = 18)
    private String curp;
    @Column(name = "date")
    private String date;
}
