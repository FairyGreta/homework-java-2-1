public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000; //стоимость билета
        int miles = service.calculate (price); // считаем только бонусные мили
        System.out.println(miles);

    }
}