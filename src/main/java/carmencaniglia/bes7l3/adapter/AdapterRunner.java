package carmencaniglia.bes7l3.adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        UserData userData = new UserData();

        Info info = new Info();
        info.setName("John");
        info.setSurname("Doe");
        info.setBirthDate(java.time.LocalDate.of(1990, 1, 1));

        DataAdapter adapter = new DataAdapter(info);
        userData.getData(adapter);

        System.out.println("Full name: " + userData.getFullName());
        System.out.println("Age: " + userData.getAge());
    }

}
