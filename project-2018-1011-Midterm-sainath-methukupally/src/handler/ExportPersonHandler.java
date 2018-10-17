

package handler;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;

import model.MyPerson;
import model.MyPersonModelProvider;

import view.MyTableViewer;

public class ExportPersonHandler {
   @Inject
   private ESelectionService selectionService;

   @Execute
   public void execute(EPartService epartService) throws IOException {
      MPart findPart = epartService.findPart(MyTableViewer.ID);
      Object findPartObj = findPart.getObject();

      if (findPartObj instanceof MyTableViewer) {
         MyTableViewer v = (MyTableViewer) findPartObj;
         Object selection = selectionService.getSelection();
         saveFile(selection);
         v.refresh();
      }
   }

private void saveFile(Object selection) throws IOException {
	// TODO Auto-generated method stub

	 //public static void saveFile(Object selection) throws IOException {
	      FileWriter fileWriter = new FileWriter("C:\\Users\\SainathReddy\\Desktop");
	      PrintWriter printWriter = new PrintWriter(fileWriter);
	       
	         printWriter.print(selection);
	         printWriter.close();
	        
	      }
	 }



	      
 
