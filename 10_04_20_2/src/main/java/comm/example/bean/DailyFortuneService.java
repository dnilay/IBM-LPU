package comm.example.bean;

import java.util.Formattable;
import java.util.Formatter;

public class DailyFortuneService implements FortuneService, Formattable {

	@Override
	public void formatTo(Formatter arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "today is yourlucky day.";
	}

}
