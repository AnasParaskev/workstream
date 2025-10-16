package paraskevopoulos.workstream.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import paraskevopoulos.workstream.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
}