package StudentManger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentManger {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        while (true) {

            System.out.println("==========欢迎访问学生管理系统==========");
            System.out.println("[1] 添加学生信息");
            System.out.println("[2] 查找学生信息");
            System.out.println("[3] 删除学生信息");
            System.out.println("[4] 更新学生信息");
            System.out.println("[5] 退出系统");
            System.out.println("请输入您的选择:");
            System.out.println("=======================================");
            Scanner sc = new Scanner(System.in);
            String number = sc.nextLine();
            switch (number) {
                case "1":
//                    System.out.println("添加学生信息");
                    addStudent(array);
                    break;
                case "2":
//                    System.out.println("查找学生信息");
                    findAllStudent(array);
                    break;
                case "3":
//                    System.out.println("删除学生信息");
                    break;
                case "4":
//                    System.out.println("更新学生信息");
                    break;
                case "5":
                    System.out.println("感谢使用本系统");
                    System.exit(0);
            }
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号:");
        String sid = sc.nextLine();
        System.out.println("请输入学生姓名:");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄:");
        String age = sc.nextLine();
        System.out.println("请输入学生地址:");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        array.add(s);

        System.out.println("添加学生信息成功");
    }

    public static void findAllStudent(ArrayList<Student> array) {
        System.out.println("学号\t\t姓名\t\t年龄\t\t地址");
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t\t" + s.getAge() + "岁\t\t" + s.getAddress());
        }
    }

    public static void deleteStudent() {
    }

    public static void updateStudent() {
    }
}
