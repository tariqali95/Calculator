package guiCalc;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class CalcController
{
	
	private Text output;
	private String operator = "";
	private Long number1;
	private boolean start = true;
	
	private CalcModel model = new CalcModel();
	private CalcView view = new CalcView();
	
	public void numpad(ActionEvent event)
	{
		if (start)
		{
			output.setText("");
			start = false;
		}
		String value = ((Button)event.getSource()).getText();
		output.setText(output.getText() + value);
	}
	public void operator(ActionEvent event)
	{
		String value = ((Button)event.getSource()).getText();
		
		if(! "=".equals(value)){
			if(!operator.isEmpty())
				return;
			
			
			operator = value;
			number1 = Long.parseLong(output.getText());
			output.setText("");
		}
		else {
			if(operator.isEmpty())
				return;
			
			output.setText(String.valueOf(model.calculate(number1, Long.parseLong(output.getText()), operator)));
			operator = "";
			start = true;
		}
	}
	
}
