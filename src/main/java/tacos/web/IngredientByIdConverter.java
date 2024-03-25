package tacos.web;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import tacos.Ingredient;
import tacos.Ingredient.Type;

import java.util.HashMap;
import java.util.Map;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

private Map<String, Ingredient> ingredientMap = new HashMap<>();

public IngredientByIdConverter() {
    ingredientMap.put("FLTO", new Ingredient("FLTO", "Мучная Tortilla", Type.WRAP));
    ingredientMap.put("COTO", new Ingredient("COTO","Кукурузная Tortilla", Type.WRAP));
    ingredientMap.put("GRBF", new Ingredient("GRBF", "Говяжий фарш", Type.PROTEIN));
    ingredientMap.put("CARN", new Ingredient("CARN", "Свиной фарш", Type.PROTEIN));
    ingredientMap.put("CHDF", new Ingredient("CHDF", "Куриный фарш", Type.PROTEIN));
    ingredientMap.put("TMTO", new Ingredient("TMTO", "Помидоры черри", Type.VEGGIES));
    ingredientMap.put("LETC", new Ingredient("LETC", "Лист салата", Type.VEGGIES));
    ingredientMap.put("CHED", new Ingredient("CHED", "Чедр", Type.CHEESE));
    ingredientMap.put("JACK", new Ingredient("JACK", "Чёрный принц", Type.CHEESE));
    ingredientMap.put("RUCH", new Ingredient("RUCH", "Российский", Type.CHEESE));
    ingredientMap.put("SLSA", new Ingredient("SLSA", "Сальса", Type.SAUCE));
    ingredientMap.put("SRCR", new Ingredient("SRCR", "Сметана", Type.SAUCE));

}


    @Override
    public Ingredient convert(String id) {
        return ingredientMap.get(id);
    }
}
