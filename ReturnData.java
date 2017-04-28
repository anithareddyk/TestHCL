
import java.util.HashMap;
import java.util.Map;

public class ReturnData {

    private HashMap<Integer,HashMap<String,Object>> data;

    ReturnData(){

        //create the data.
        data = new HashMap<Integer,HashMap<String,Object>>();
        HashMap<String,Object> values;
        for(int i = 0 ; i < 50; i++){
            values = new HashMap<String,Object>();
            values.put("ID", i);
            values.put("NAME", "NAME"+i);
            values.put("PHONE", i+"-"+i+"-"+i);
            values.put("ADDRESS","Address"+i);
            data.put(i, values);
        }
        //print the data
        for(Map.Entry<Integer,HashMap<String,Object>> value : data.entrySet()){
            value.getValue().forEach((k,v)-> System.out.println(k+" : "+v));
        }
    }

    public HashMap<Integer,HashMap<String,Object>> getData(){
        return this.data;
    }

    public static void main(String[] args) {
        ReturnData x = new ReturnData();
        x.getData();


        // TODO Auto-generated method stub

    }


}
