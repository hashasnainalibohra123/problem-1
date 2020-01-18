import Problem4.DPMgmtSystem;
import Problem4.EmployeeHistoryRecord;
import Problem4.Roles;
import Problem4.User;

import java.util.ArrayList;


public class Runner {
    public static void main(String[] args){
        //Problem 1
//        Problem1 problem1 = new Problem1();
//        ArrayList array = new ArrayList<Integer>();
//
//        array.add(1);
//        array.add(2);
//        array.add(3);
//        String str = "";
//        problem1.listAllStrings(array,0,str);
//        problem1.printList();

        //Problem 2



        //Problem 3
        DPMgmtSystem dpMgmtSystem = new DPMgmtSystem();
        User user1= new User();
        user1.setId("1");
        user1.setName("emp1");
        user1.setCurrentRole(Roles.ROLE1);

        EmployeeHistoryRecord employeeHistoryRecord = new EmployeeHistoryRecord("1");

        dpMgmtSystem.addUser("1",user1,employeeHistoryRecord);
        dpMgmtSystem.getUserHistory(employeeHistoryRecord);

        dpMgmtSystem.promoteUser(user1, employeeHistoryRecord);
        dpMgmtSystem.getUserHistory(employeeHistoryRecord);

    }
}
