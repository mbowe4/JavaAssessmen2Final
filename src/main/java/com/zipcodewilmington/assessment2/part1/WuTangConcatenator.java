package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer input;

<<<<<<< HEAD
=======

>>>>>>> part2
    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    public boolean isWu() {
<<<<<<< HEAD
        return input % 3 ==0;
=======
        return input % 3 == 0;
>>>>>>> part2
    }

    public boolean isTang() {
        return input % 5 == 0;
<<<<<<< HEAD
    }

    public boolean isWuTang() {
        return input % 3 == 0 && input % 5 ==0;
=======

    }

    public boolean isWuTang() {
        return input % 5 == 0 && input % 3 ==0;
>>>>>>> part2
    }
}
