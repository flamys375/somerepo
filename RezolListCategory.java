package ru.kck.ukid.portal.server.bean.resolution;

/**
 * @author a.denisov
 * @version 09.04.2021
 */
public enum RezolListCategory {
    PRIVATE(1),
    DEPENDENT(2),
    ALL(3),
    MANAGEMENT(4),
    TO_ME(5),
    ANSWER(6);

//1 - Личное / 2 - Подчинённых / 3 - Все / 4 - Управление / 5 - Мне

    private final int code;

    private RezolListCategory(int type) {
        this.code = type;
    }

    public int getCode() {
        return code;
    }

}

