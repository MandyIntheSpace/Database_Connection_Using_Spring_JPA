package Controller;

import ComapnyRepository.CompanyRepsitory;
import Model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
public class CompanyController {
    @Autowired
    private CompanyRepsitory repo;

    @GetMapping("/")
    public String welcome() {
        return "<html><body>" +
                "<h1>WELCOME</h1?>" +
                "</body></html>";
    }

    @GetMapping("/company")
    public List<Company> getAllNotes() {
        return (List<Company>) repo.findAll();
    }
    @PostMapping("/compamy")
    @ResponseStatus(HttpStatus.ACCEPTED.CREATED)
    public Company addCompany(@RequestBody Company company) {
        return repo.save(company);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(
            @PathVariable(value = "id") int id){
        repo.deleteById(id);
    }
    @PutMapping("/compant/{id}") {
        public ResponseEntity<Object> updateStudent(
                @RequestBody Company company,
                @PathVariable int id) {
            Optional<Company> companyRepo = Optional.ofNullable(
                    repo.findById(id));

            if (!companyRepo.isPresent())
                return ResponseEntity
                        .notFound()
                        .build();
            company.setId(id);
            repo.save(company);

            return ResponseEntity
                    .noContent()
                    .build();
        }
    }
}
