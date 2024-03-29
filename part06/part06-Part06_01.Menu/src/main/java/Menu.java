
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal){
        if(!meals.contains(meal)){
            meals.add(meal);
        }
    }
    
    public void printMeals(){
        for(String buffer:meals){
            System.out.println(buffer);
        }
    }
    
    public void clearMenu(){
        meals.removeAll(meals);
    }
    
    
    
}
