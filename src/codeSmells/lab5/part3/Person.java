package codeSmells.lab5.part3;

public class Person {
        private String name;
        private int age;
        private String gender;
        private Friends friends;
        private Enemies enemies;
        private Tasks tasks;

        public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.friends = new Friends();
            this.enemies = new Enemies();
            this.tasks = new Tasks();
        }

        public void displayInfo() {
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Gender: " + this.gender);
            System.out.println("Friends: " + this.friends.getFriendsList());
            System.out.println("Enemies: " + this.enemies.getEnemiesList());
            System.out.println("Tasks: " + this.tasks.getTasksList());
        }

        // Delegate methods
        public void addFriend(String friend) {
            this.friends.addFriend(friend);
        }

        public void removeFriend(String friend) {
            this.friends.removeFriend(friend);
        }

        public void addEnemy(String enemy) {
            this.enemies.addEnemy(enemy);
        }

        public void removeEnemy(String enemy) {
            this.enemies.removeEnemy(enemy);
        }

        public void addTask(String task) {
            this.tasks.addTask(task);
        }

        public void removeTask(String task) {
            this.tasks.removeTask(task);
        }
    }