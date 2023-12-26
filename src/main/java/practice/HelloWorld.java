package practice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class HelloWorld {
    public static void main(String[] args) throws JsonProcessingException {
        System.out.println("Hello World");

        String jsonString = "{ \"orgno\": 4215, \"branchcode\": 611, \"projectcode\": 15, \"loan_product\": 42, \"loan_duration\": 9, \"invest_sector\": 17, \"scheme\": 352, \"propos_amt\": 60000, \"instal_amt\": 7380, \"status\": 2, \"loan_id\": \"cc2eb9f7-65a5-44e2-9736-5326af72c7a1\", \"erp_mem_id\": 48118558, \"memberTypeId\": 1, \"frequencyId\": 3, \"subSectorId\": 27, \"ErpStatus\": 1, \"approval_amount\": 60000, \"erpstatus\": 1 }";


        ObjectMapper objectMapper = new ObjectMapper();
        LoanInfo loanInfo = objectMapper.readValue(jsonString, LoanInfo.class);

        // Now you can use the 'loanInfo' object in your Java code
        System.out.println(loanInfo.getLoanId());

    }


}

class GrandPapa{

    GrandPapa(){}

    GrandPapa(String a){
    }

}

class Father extends GrandPapa{

    Father(){
        //super("k");
    }
}
