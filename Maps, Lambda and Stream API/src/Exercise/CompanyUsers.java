package Exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, List<String>> companyData = new LinkedHashMap<>();

        while(!(command.equals("End"))){

            String[] commandToArray = command.split(" -> ");
            String companyName = commandToArray[0];
            String employeeID = commandToArray[1];

            List<String> ids = companyData.get(companyName);

            if(ids != null){
                checkIfAdded(employeeID,ids);
            }
            else{
                ids = new ArrayList<>();
                companyData.put(companyName,ids);
                checkIfAdded(employeeID,ids);
            }

            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companyData.entrySet()) {
            System.out.println(entry.getKey());
            for (String s : entry.getValue()) {
                System.out.println("-- " + s);
            }

        }

    }

    private static void checkIfAdded(String employeeID,List<String> ids) {
        boolean isAdded = false;
        for (String id : ids) {
            if(employeeID.equals(id)){
                isAdded = true;
            }
        }
        if(!isAdded){
            ids.add(employeeID);
        }
    }
}
