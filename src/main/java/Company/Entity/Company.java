package Company.Entity;

import com.first.Job.Portal.Entity.Jobs;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Company
{
    private Integer id;
    private String name;

    @OneToMany(mappedBy = "company")
    private List<Jobs> jobs;
}
