package lab4p2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContMain {
	private static Addition model;
	private static ViewLayout view;

	public static void main(String[] args) {
		// attributes
		model= new Addition();
		view= new ViewLayout();
		
		//add a listener event to a button
				view.btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						updateModel();
						updateView();
						
						}

					private void updateView() {
						view.totSum.setText(Double.toString(model.getsum()));
						
					}

					private void updateModel() {
						//get input values
						double x=Double.parseDouble(view.varx.getText());
						double y=Double.parseDouble(view.vary.getText());
						// get to where can add them???
						model.addvar(x,y);
						
					}
				});

	}

}
