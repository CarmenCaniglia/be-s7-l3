package carmencaniglia.bes7l3.adapter;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Info {
    private String name;
    private String surname;
    private LocalDate birthDate;
}
