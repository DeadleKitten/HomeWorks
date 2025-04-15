public class Main {
    public static void main(String[] args) {

        System.out.println("Задани 1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задани 2");

        dog = dog + 2;
        cat = cat + 2;
        paper = paper + 2;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задани 3");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задани 4");

        var friend = 19;

        System.out.println(friend);

        friend = friend + 2;

        System.out.println(friend);

        friend = friend / 2;

        System.out.println(friend);

        System.out.println("Задани 5");

        var frog = 3.5;

        System.out.println(frog);

        frog = frog * 10;

        System.out.println(frog);

        frog = frog / 3.5;

        System.out.println(frog);

        frog = frog + 4;

        System.out.println(frog);

        System.out.println("Задани 6");

        var ferstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = ferstBoxer + secondBoxer;

        System.out.println(ferstBoxer);
        System.out.println(secondBoxer);
        System.out.println(totalWeight);

        System.out.println("Задани 7");

        var remains = secondBoxer % ferstBoxer;

        System.out.println(remains);

        System.out.println("Задани 8");

        var totalTime = 640;
        var timeOfOne = 8;
        var totalEmployees = totalTime / timeOfOne;

        System.out.println(totalEmployees);

        System.out.println(" Всего работников в компании -  " + totalEmployees + " человек.");

        var employees = 94;
        var totalTime1 = employees * timeOfOne;

        System.out.println(" Если в компании работает " + employees + " человек, то всего "
                + totalTime1 + " часа работы может быть поделено между сотрудниками");


    }


}

