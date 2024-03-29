// Реализовать класс товар, содержащий следующие свойства:
// 1. Название 
// 2. Цена
// 3. Количество
// 4. Единица измерения
// А так же реализовать следующие классы-наследники:
// 1. Продукты питания, содержащие следующие свойства:
// 1.1 Срок годности
// 2. Напитки, содержащие следующие свойства:
// 2.1 Объём
// 3. Предметы гигиены, содержащие следующие свойства:
// 3.1 Количество штук в упаковке
// 4. Детские товары:
// 4.1 Минимальный возраст
// 4.2 Гипоаллергенность,
// А так же реализовать слеюущие классы, наследуемые от приведённых выше классов
// (надеюсь сами разберётесь от каких именно):
// 5. Молоко, содержащиее следующее свойство:
// 5.1 Процент жирности
// 5.2 Срок годности
// 6. Лимонад
// 7. Хлеб, содержащий следующие свойство:
// 7.1 Тип муки
// 8. Яйца, содержащее следующиее свойство:
// 8.1 Количество в упаковке
// 9. Маски
// 10. Туалетная бумага, содержащее следующее свойство:
// 10.1 Количество слоёв
// 11. Подгузники, содержащие следующее свойства:
// 11.1 Размер
// 11.2 Минимальный вес
// 11.3 Максимальный вес
// 11.4 Тип
// 12. Соска
// У всех классов перегрузить метод ToString класса Object, от которого наследуются все классы, 
// в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы, 
// принемающие все поля. Реализовать в классе Program, метод выводящий все данные о товаре. 
// Создать в Main все объекты товаров и проверить работу метода, созданного в классе Program

public class Product {
    public static String title;
    public static Integer price;
    public static Integer quantity;
    public static String unitOfMeasurement;
    public static Integer expirationDate;

    /**
     * @param title
     * @param price
     * @param quantity
     * @param unitOfString
     */
    public Product(String title, Integer price, Integer quantity, String unitOfMeasurement) {
        Product.title = title;
        Product.price = price;
        Product.quantity = quantity;
        Product.unitOfMeasurement = unitOfMeasurement;
    }

    @Override
    public String toString()
    {
        return String.format(
        "Название:  %s\n Цена: %d\n Количество: %d\n Единица измерения: %s\n", 
        title, price, quantity, unitOfMeasurement);
    }
    
    public void print()
    {
        System.out.println(this);
    }

    public String getInfo() {
        return null;
    }

}

