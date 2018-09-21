package model.labelprovider;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;

import model.MyPerson;
import util.SearchUtil;

public class PhoneLabelProvider extends FirstNameLabelProvider {

	public PhoneLabelProvider(Text searchText) {
		super(searchText);
	}

	@Override
	public void update(ViewerCell cell) {
		super.update(cell);
	}

	protected String getCellText(ViewerCell cell) {
		MyPerson person = (MyPerson) cell.getElement();
		String cellText = person.getPhone();
		return cellText;
	}
}
	