
    class Department {
        String deptName;

        Department(String name) {
            this.deptName = name;
        }
    }

    class Student {
        String name;
        Department department; // Association

        Student(String name, Department dept) {
            this.name = name;
            this.department = dept;
        }

        void showDetails() {
            System.out.println(name + " is in " + department.deptName + " department.");
        }
    }

    public class AssociationExample {
        public static void main(String[] args) {
            Department d = new Department("Computer Science");
            Student s = new Student("Pushparaj", d);
            s.showDetails();
        }
    }


