package adriana.nogueira.repository;


import adriana.nogueira.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pedido, Long> {
}