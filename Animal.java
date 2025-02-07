public abstract class Animal {

        private int age;

        public Animal() {

            this.age = 0;

        }

        public void setAge(int age) {

            this.age = age;

        }

        public int getAge() {

            return age;

        }

        // all subclasses must implement this
        public abstract void eat();


    }
