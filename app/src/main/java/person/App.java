/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package person;

    class Person {
        private static String fname, lname;

        Person (String fname, String lname) {
            Person.fname = fname;
            Person.lname = lname;
        }
        public static String getFirstName () {
            return fname;
        }
        public static String getLastName () {
            return lname;
        }
        
        public static void main (String[] args){
            new Person("Ibtisam", "Hemmo");
            System.out.println(Person.getFirstName());
            
            new Person("Ibtisam", "Hemmo");
            System.out.println(Person.getLastName());
        }

}