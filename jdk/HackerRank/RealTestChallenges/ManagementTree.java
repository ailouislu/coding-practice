package jdk.HackerRank.RealTestChallenges;

import java.util.*;

/**
 * The main class for the employment management tree exercise
 */
public class ManagementTree {

    /**
     * The main method that reads input from STDIN.
     * DO NOT MODIFY THIS METHOD.
     */
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if(line.length() == 0)
                break;
            //if (line != null) {
            String[] input = line.split("\\s+");
            if (input.length == 3) {
                int id = Integer.parseInt(input[0]);
                String name = input[1];
                int managerId = Integer.parseInt(input[2]);

                Employee employee = new Employee(id, name, managerId);
                employees.add(employee);
            }
            //}
        }


//        displayManagementTree(employees);
    }



    /**
     * Displays employees in a logical tree.
     */
//    public static void displayManagementTree(Collection<Employee> employees) {
//        List<Employee> employeeList = new ArrayList<Employee>();
//        List<Integer> resultList = new ArrayList<Integer>();
//        if (employees instanceof List)
//            employeeList = (List)employees;
//        else
//            employeeList = new ArrayList(employees);
//
//        Map<Integer, Integer> map = new HashMap<>();
//        Map<Integer, Integer> countMap = new HashMap<>();
//        Map<Integer, String> employeeMap = new HashMap<>();
//        map.put(employeeList.get(0).getId(), 0);
//        List<Employee> list = new ArrayList<>();
//
//        for(int i = 0; i < employeeList.size(); i ++){
//
//            int id = employeeList.get(i).getId();
//
//            System.out.println("i id:" + id);
//
//            int managerId = employeeList.get(i).getManagerId();
//            map.put(id, map.getOrDefault(managerId,0) + 1);
//            employeeMap.put(id, employeeList.get(i).getName());
//            if(countMap.getOrDefault(id,0) == 0){
//                countMap.put(id, 1);
//                resultList.add(id);
//                list = employeeList.stream().filter(e -> e.getManagerId() == id).toList();
//                for(int j = 0; j < list.size(); j ++){
//                    int gid = list.get(j).getId();
//                    if(employeeList.stream().filter(em -> em.getManagerId() == gid).toList().size() > 0){
//                        if(countMap.getOrDefault(list.get(j).getId(),0) == 0){
//                            countMap.put(list.get(j).getId(), 1);
//                            resultList.add(list.get(j).getId());
//                            System.out.println("id:" + list.get(j).getId());
//                        }
//                    }
//                }
//            }
//        }
//
//        int count = 0;
//        int id = 0;
//        for(int j = 0; j < resultList.size(); j ++){
//            id = resultList.get(j);
//            count = map.get(id) - 1;
//            if(count == 0)
//                System.out.print("->");
//            if(count == 1)
//                System.out.print("->->");
//            if(count == 2)
//                System.out.print("->->->");
//            if(count == 3)
//                System.out.print("->->->->");
//            if(count == 4)
//                System.out.print("->->->->->");
//            if(count == 5)
//                System.out.print("->->->->->->");
//            System.out.println(employeeMap.get(id));
//        }
//    }

    /**
     * Employee class
     */
    static class Employee {

        private int id;

        private String name;

        private int managerId;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getManagerId() {
            return managerId;
        }

        public void setManagerId(int managerId) {
            this.managerId = managerId;
        }

        public Employee(int id, String name, int managerId) {
            setId(id);
            setName(name);
            setManagerId(managerId);
        }
    }
}

/***
 * 10 Tom 0
 * 2 Mickey 10
 * 3 Jerry 10
 * 7 John 2
 * 5 Sarah 10
 *
 *
 * 1 Jerry 0
 * 61 Tom 20
 * 5 David 20
 * 20 Philip 1
 * 17 Alice 5
 * 12 John 17
 * 22 Mike 5
 * 103 Ken 20
 * 45 Peter 103
 * 99 Stacie 1
 */