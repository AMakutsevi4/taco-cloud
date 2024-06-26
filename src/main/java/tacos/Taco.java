package tacos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;
import java.util.List;

@Data
@Table
public class Taco {

    @Id
    private Long id;

    private Date createdAt = new Date();

    @NotNull
    @Size(min = 5, message = "Длина имени должна составлять не менее 5 символов")
    private String name;

    @NotNull
    @Size(min = 1, message = "Вы должны выбрать по крайней мере 1 ингредиент")
    private List<Ingredient> ingredients;
}
