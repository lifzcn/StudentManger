/**
 * @File : StudentManger
 * @Discription :
 * @Author : Leonard
 * @Time : 2022/1/13
 **/

package StudentManger;

import java.util.*;

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
            String mode_1 = sc.nextLine();
            switch (mode_1) {
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
                    deleteStudent(array);
                    break;
                case "4":
//                    System.out.println("更新学生信息");
                    updateStudent(array);
                    break;
                case "5":
                    System.out.println("感谢使用本系统!");
                    System.exit(0);
            }
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号:");
        String sid = sc.nextLine();
        int sid_length = sid.length();
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                System.out.println("系统中已经存在该学号对应学生的信息,请检查后重试!");
                return;
            } else break;
        }
        if (sid_length == 10) {
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
        } else {
            System.out.println("您输入的学号位数格式不正确,请检查后重试!");
            return;
        }
    }

    public static void findAllStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[1] 查询全部学生信息");
        System.out.println("[2] 查询个别学生信息");
        System.out.println("请输入您的选择:");
        String mode_2 = sc.nextLine();
        switch (mode_2) {
            case "1":
                if (array.size() == 0) {
                    System.out.println("无学生信息,请检查后重试!");
                    //此处添加的return语句所起的作用等同于后面的else语句
//                    return;
                } else {
                    System.out.println("学号\t\t姓名\t\t年龄\t\t地址");
                    for (int i = 0; i < array.size(); i++) {
                        Student s = array.get(i);
                        System.out.println(s.getSid() + "\t" + s.getName() + "\t\t" + s.getAge() + "岁\t\t" + s.getAddress());
                    }
                }
                break;
            case "2":
                if (array.size() == 0) System.out.println("无学生信息,请检查后重试!");
                else {
//                    Scanner sc = new Scanner(System.in);
                    System.out.println("请输入要查询的学生学号:");
                    String sid = sc.nextLine();
                    for (int i = 0; i < array.size(); i++) {
                        Student s = array.get(i);
                        if (s.getSid().equals(sid)) {
                            System.out.println("学号\t\t姓名\t\t年龄\t\t地址");
                            System.out.println(s.getSid() + "\t" + s.getName() + "\t\t" + s.getAge() + "岁\t\t" + s.getAddress());
                            break;
                        }
                    }
                }
                break;
        }
    }

    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生学号:");
        String sid = sc.nextLine();
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                array.remove(i);
                break;
            } else {
                System.out.println("没有对应学号的学生信息,删除失败,请检查后重试!");
                break;
            }
        }
        System.out.println("删除学生信息成功!");
    }

    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要更新的学生学号:");
        String sid = sc.nextLine();
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getSid().equals(sid)) {
                System.out.println("请输入要更新的学生姓名:");
                String name = sc.nextLine();
                s.setName(name);
                System.out.println("请输入要更新的学生年龄:");
                String age = sc.nextLine();
                s.setAge(age);
                System.out.println("请输入要更新的学生地址:");
                String address = sc.nextLine();
                s.setAddress(address);
            } else {
                System.out.println("没有找到对应学号学生信息,请检查后重试!");
            }
        }
    }
}
