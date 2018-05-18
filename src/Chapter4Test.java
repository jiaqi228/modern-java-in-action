import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Chapter4Test {

    /**
     * default constructor
     */
    public Chapter4Test() {
        super();
    }

    public static void main(String[] args) {

        List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT), new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT), new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER), new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER), new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));

        List<String> names = menu.stream().sorted((dishA, dishB) -> {
            System.out.println("sorted:" + dishA.getName());
            return 1;
        }).filter(dish -> {
            System.out.println("filtering:" + dish.getName());
            return dish.getCalories() > 300;
        }).map(dish -> {
            System.out.println("mapping:" + dish.getName());
            return dish.getName();
        }).limit(3).collect(Collectors.toList());
        System.out.println(names);
    }
}

