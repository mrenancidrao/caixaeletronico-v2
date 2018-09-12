package teste.junit;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import br.com.project.report.util.DateUtils;

public class TesteData {

	@Test
	public void testData() {
		
		try {
			
			assertEquals("13082018", DateUtils.getDateAtualReportname());  
			
			assertEquals("'2018-08-13'", DateUtils.formatDateSql(Calendar.getInstance().getTime()));  
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
		
		
	}

}
