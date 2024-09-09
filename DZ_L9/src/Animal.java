public class Animal {
    private String name;
    private static int count;

    public void run() {
        System.out.println(name + " Пробежал " + distance + " м");
    }
    public void swim() {
        System.out.println(name + " Проплыл " + distance + " м");
    }
    public Animal() {
        count++;
    }
    public static int getCount() {
        return count;
    }

    public static class Bowl {
        private static int food;
        Bowl(int food) {
            this.food = food;
        }
        void addFood() {
            food = food + 100;
        }
        static void eatFood(int hunger) {
            food = food - hunger;
        }
    }

    public class Dog extends Animal {
        String name;
        public int countDog = 0;

        Dog(String name){
            super();
            countDog++;
            this.name = name;
        }

        void run(int distance) {
            if (distance > 500) {
                System.out.println(name+ " не может бежать больше 500 м");
            } else {
                System.out.println(name+ " пробежал " + distance + " m");
            }

        }

        void swim(int distance) {
            if (distance > 10) {
                System.out.println(name + " не может плыть больше 10 м");
            } else {
                System.out.println(name + " проплыл " + distance + " м");
            }
        }

        public int getCountDog (){
            return countDog;
        }
    }
    public class Cat extends Animal {
        String name;
        int hunger; // количество еды, необходимое для того чтобы наесться
        boolean isHunger; // голоден ли кот
        public int countCat = 0;


        Cat (String name, int hunger, boolean isHunger){
            super();
            countCat++;
            this.name = name;
        }

        public void run(int distance) {
            if (distance > 200) {
                System.out.println(name+ " не может бежать болье 200 м");
            } else {
                System.out.println(name + " пробежал " + distance + " м");
            }
        }

        public void swim(int distance) {
            System.out.println("Коты не умеют плавать");
        }

        public void eat(Bowl) {
            Bowl.eatFood(hunger);
        }

        public int getCountCat(){
            return countCat;
        }
        Cat[] catArr = new Cat[3];

        {
            catArr[0] = new Cat("Murka", 3, true);
            catArr[1] = new Cat("Cheburek", 5, true);
            catArr[2] = new Cat("Puhlyash", 9, true);

            for (int i = 0; i < catArr.length; i++) {
                if (catArr[i].isHunger == true && catArr[i].hunger < Bowl.food) {
                    Bowl.eatFood(hunger);
                    catArr[i].isHunger = false;
                    System.out.println(catArr[i].name + " поел");
                } else {
                    System.out.println(catArr[i].name + " не поел");
                }
            }
        }

    }
}
