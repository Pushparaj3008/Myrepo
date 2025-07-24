
    class Department {
        String deptName;

        Department(String name) {
            this.deptName = name;
        }
    }

    class Stu {
        String name;
        Department department; // Association

        Stu(String name, Department dept) {
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
            Stu s = new Stu("Pushparaj", d);
            s.showDetails();
        }
    }


