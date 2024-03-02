package via.sdj3.slaughterhousepart2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.sdj3.slaughterhousepart2.entity.Animal;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IAnimalRepository extends JpaRepository<Animal, Integer>
{
  //filter or extra: add the method here
}
