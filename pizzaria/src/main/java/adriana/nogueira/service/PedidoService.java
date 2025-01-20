package adriana.nogueira.service;

import adriana.nogueira.DTO.PizzaDTO;
import adriana.nogueira.model.Pedido;
import adriana.nogueira.repository.PizzaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    public List<PizzaDTO> getAllPizzas() {
        return pizzaRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public PizzaDTO getPizzaById(Long id) {
        Pedido pizza = pizzaRepository.findById(id).orElseThrow(() -> new RuntimeException("Pizza not found"));
        return convertToDTO(pizza);
    }

    public PizzaDTO createPizza(PizzaDTO pizzaDTO) {
        Pedido pizza = convertToEntity(pizzaDTO);
        Pedido savedPizza = pizzaRepository.save(pizza);
        return convertToDTO(savedPizza);
    }

    public void deletePizza(Long id) {
        pizzaRepository.deleteById(id);
    }

    private PizzaDTO convertToDTO(Pedido pizza) {
        PizzaDTO dto = new PizzaDTO();
        dto.setName(pizza.getName());
        dto.setDescription(pizza.getDescription());
        dto.setPrice(pizza.getPrice());
        return dto;
    }

    private Pedido convertToEntity(PizzaDTO dto) {
        Pedido pizza = new Pedido();
        pizza.setName(dto.getName());
        pizza.setDescription(dto.getDescription());
        pizza.setPrice(dto.getPrice());
        return pizza;
    }

    public PizzaDTO updatePizza(Long id, PizzaDTO pizzaDTO) {
        Pedido existingPizza = pizzaRepository.findById(id).orElseThrow(() -> new RuntimeException("Pizza not found"));
        existingPizza.setName(pizzaDTO.getName());
        existingPizza.setDescription(pizzaDTO.getDescription());
        existingPizza.setPrice(pizzaDTO.getPrice());
        Pedido updatedPizza = pizzaRepository.save(existingPizza);
        return convertToDTO(updatedPizza);
    }
}