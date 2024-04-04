package tacos;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Table("Taco_Cloud_Order")
public class TacoOrder {

    @Id
    private Long id;

    private Date placedAt;

    @Column("customer_name")
    @NotBlank(message = "Требуется наименование доставки")
    private String deliveryName;

    @NotBlank(message = "Требуется улица")
    private String deliveryStreet;

    @NotBlank(message = "Требуется город")
    private String deliveryCity;

    @NotBlank(message = "Укажите адрес")
    private String deliveryState;

    @NotBlank(message = "Укажите почтовый индекс")
    private String deliveryZip;

    @CreditCardNumber(message="Недействительный номер кредитной карты")
    private String ccNumber;

    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$",
            message="Должно быть отформатировано ММ/ГГ")
    private String ccExpiration;

    @Digits(integer=3, fraction=0, message="Недействительный CVV")
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();

    public void addTaco(Taco taco) {
        this.tacos.add(taco);
    }
}
