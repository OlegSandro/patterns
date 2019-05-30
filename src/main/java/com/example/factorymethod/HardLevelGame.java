package com.example.factorymethod;

public class HardLevelGame implements Game {

    private int nMinuts;
    private int nLetters;

    public void run(){
        generateRound1();
        generateRound2();
        generateRound3();
    }

    private void generateRound1() {
        System.out.println("Раунд 1 игры на сложном уровне начался. За " + nMinuts + " минут нужно успеть составить 10 слов, используя " + nLetters + " букв алфавита");
        System.out.println("Раунд 1 игры на сложном уровне успешно пройден");
        nMinuts = nMinuts - 2;
        nLetters = nLetters - 4;
    }

    private void generateRound2() {
        System.out.println("Раунд 2 игры на сложном уровне начался. За " + nMinuts + " минут нужно успеть составить 10 слов, используя " + nLetters + " букв алфавита");
        System.out.println("Раунд 2 игры на сложном уровне успешно пройден");
        nMinuts = nMinuts - 2;
        nLetters = nLetters - 4;
    }

    private void generateRound3() {
        System.out.println("Раунд 3 игры на сложном уровне начался. За " + nMinuts + " минуты нужно успеть составить 10 слов, используя " + nLetters + " букв алфавита");
        System.out.println("Раунд 3 игры на сложном уровне успешно пройден");
    }

    public int getnMinuts() {
        return nMinuts;
    }

    public void setnMinuts(int nMinuts) {
        this.nMinuts = nMinuts;
    }

    public int getnLetters() {
        return nLetters;
    }

    public void setnLetters(int nLetters) {
        this.nLetters = nLetters;
    }
}
