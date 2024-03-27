package tacos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class Taco {

    @NotNull
    @Size(min = 5, message = "Длина имени должна составлять не менее 5 символов")
    private String name;

    @NotNull
    @Size(min = 1, message = "Вы должны выбрать по крайней мере 1 ингредиент")
    private List<Ingredient> ingredients;
}
