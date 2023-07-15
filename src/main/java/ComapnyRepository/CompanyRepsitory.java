package ComapnyRepository;

import Model.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepsitory extends CrudRepository <Company, Integer> {
    Company findById(int id);
    List <Company> findAllBy();
    void deleteById(int id);
}
