
package project0830partdescriptormethukupally;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

public class ViewPartDescriptor {
public static final String View_ID="project0830-part-descriptor-methukupally.partdescriptor.viewpartdescriptor";
public final static String POPUPMENU_ID = "project0830-part-descriptor-methukupally.popupmenu.popupmenu";
private StyledText styledText = null;

@Inject

public void postConstruct(Composite parent, EMenuService menuService) {
	Composite container = new Composite(parent, SWT.NONE);
	container.setLayout(new FillLayout(SWT.HORIZONTAL));
	styledText = new StyledText(container, SWT.BORDER);
	menuService.registerContextMenu(styledText, POPUPMENU_ID);
}

// Pass an empty string parameter here to clear the text box.
public void setText(String str) {
	this.styledText.setText(str);
}

public void appendText(String str) {
	this.styledText.append(str);
}
}