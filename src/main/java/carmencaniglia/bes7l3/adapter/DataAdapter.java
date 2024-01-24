package carmencaniglia.bes7l3.adapter;

import java.time.LocalDate;

public class DataAdapter implements DataSource {
    private final Info info;

    public DataAdapter(Info info) {
        this.info = info;
    }


    public String getFullName() {
        return info.getName() + " " + info.getSurname();
    }

    @Override
    public int getAge() {
        return LocalDate.now().getYear() - info.getBirthDate().getYear();
    }
}
