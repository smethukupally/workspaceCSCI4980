package model;

import java.util.ArrayList;
import java.util.List;

import util.UtilFile;

public enum MyPersonModelProvider {
   INSTANCE;

   private List<MyPerson> persons;

   private MyPersonModelProvider() {
	   
	   String inputData ="C:\\Users\\SainathReddy\\workspaceCSCI4980\\workspaceCSCI4980methukupally\\project0911-fieldassist-methukupally\\src\\input\\inputdata.txt" ;
	   List<String> contents =UtilFile.readFile(inputData);
			
		List<List<String>> tableContents = UtilFile.convertTableContents(contents);

		persons = new ArrayList<MyPerson>();
		for (List<String> iList : tableContents) {                        
			persons.add(new MyPerson(iList.get(0),iList.get(1),iList.get(2),Boolean.valueOf(iList.get(3))));
		}
	   }
     

   public List<MyPerson> getPersons() {
      return persons;
   }
}
