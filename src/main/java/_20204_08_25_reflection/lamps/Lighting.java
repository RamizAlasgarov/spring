package _20204_08_25_reflection.lamps;

import java.awt.*;

/**
 * Создайте иерархию классов световых приборов с тремя поколениями. Например,
 * 1.световой прибор (яркость свечения, цвет)
 * 2.электрическая лампа (потребляемая мощность, тип цоколя)
 * 3.умная лампа (перечень доступных функций, тип подключения к сети передачи данных)
 * Составьте мапу, в которой классу иерархии будут соответствовать его приватные поля. Выведите мапу в консоль.
 * Всем строковым полям присвойте значение «abc».
 */
public class Lighting {
    private int lumen;
    private Color color;

    @Override
    public String toString() {
        return "Lighting{" +
                "lumen=" + lumen +
                ", color=" + color +
                '}';
    }
}
