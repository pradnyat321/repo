package prjone;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={AppConfig.class})
public class DataModelServiceTest {
	
	@Autowired
	@Qualifier("dataModelService")
	DataModelService dataModelService;
	
	@Test
	public void isValidTest() {
		assertThat(dataModelService, instanceOf(DataModelService.class));
		assertThat(dataModelService.printString("Hello"),is("Hello"));
		
		
	}

}
