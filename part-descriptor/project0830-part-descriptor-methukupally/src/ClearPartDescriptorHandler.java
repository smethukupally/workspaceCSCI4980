
import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

import project0830partdescriptormethukupally.ViewPartDescriptor;


public class ClearPartDescriptorHandler{
	@Inject
	private EPartService epartService;

	@Execute
	public void execute() {
		MPart findPart = epartService.findPart(ViewPartDescriptor.View_ID);
		Object findPartObj = findPart.getObject();

		if (findPartObj instanceof ViewPartDescriptor) {
			ViewPartDescriptor v = (ViewPartDescriptor) findPartObj;
			v.setText("");
		}
	}
}