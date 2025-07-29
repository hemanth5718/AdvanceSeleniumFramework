/**
 * @author heman
 */
package crm.generic.webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


/**
 * @author heman
 */
public class JavaUtility {
	
	/**
	 * @author heman
	 **/
	public int getRandomNumber()
	{
		
		Random random= new Random();
		int randomNumber = random.nextInt(5000);
		return randomNumber;
	}
	
	public String getSystemDateyyyymmdd()
	{
		Date dateObj = new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		String date = sdf.format(dateObj);	
		return date;	
	}
	public String getRequiredDateyyymmdd(int days)
	{
		Date dateObj = new Date();
		
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		sim.format(dateObj);	
		Calendar cal =sim.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH,days);
		String reqDate = sim.format(cal.getTime());
		return reqDate;
	}

}


