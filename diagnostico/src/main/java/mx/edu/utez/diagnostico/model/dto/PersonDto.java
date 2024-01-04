package mx.edu.utez.diagnostico.model.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class PersonDto {
    private Integer id;
    private String name;
    private String ape1;
    private String ape2;
    private String curp;
    private String date;
}
