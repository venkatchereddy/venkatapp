/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2016 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 *
 *
 */
package generated;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;

import com.hybris.atddengine.framework.*;
import com.hybris.atddengine.framework.impl.DefaultPythonProvider;
import com.hybris.atddengine.framework.impl.PythonAware;
import com.hybris.atddengine.framework.impl.PythonRobotTestSuiteFactory;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.apache.commons.lang.StringUtils;


/*
 * This is a generated class. Do not edit, changes will be overridden.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/META-INF/entitlement-rest-client-test-spring.xml")
@SuppressWarnings("PMD")
public class TestNonMeteredEntitlements_MultiConditionTypes_CreateAndCheck
{
	public static RobotTestSuite robotTestSuite;

	public static void startSuite() throws IOException
	{
		if (robotTestSuite == null)
		{
			final PythonAware pythonAware = new DefaultPythonProvider(
				"/opt/bamboo-agent/xml-data/build-dir/HYM-EMS6106-CJ/src/entitlements/entitlements-rest-client/target/dependencies/atdd/keywords",
				"/opt/bamboo-agent/xml-data/build-dir/HYM-EMS6106-CJ/src/entitlements/entitlements-rest-client/src/test/resources/atdd/keywords"
			);
			final RobotSettings robotSettings = new RobotSettings();

			robotSettings.setOutputDir(new File("/opt/bamboo-agent/xml-data/build-dir/HYM-EMS6106-CJ/src/entitlements/entitlements-rest-client/target/atdd/reports"));
			robotSettings.setLogName("TestNonMeteredEntitlements_MultiConditionTypes_CreateAndCheck-log");
			robotSettings.setOutputName("TestNonMeteredEntitlements_MultiConditionTypes_CreateAndCheck-output");
			robotSettings.setReportName("TestNonMeteredEntitlements_MultiConditionTypes_CreateAndCheck-report");

			final RobotTestSuiteFactory robotTestSuiteFactory = new PythonRobotTestSuiteFactory(pythonAware);

			robotTestSuite = robotTestSuiteFactory.parseTestSuite(robotSettings, new File(
			"/opt/bamboo-agent/xml-data/build-dir/HYM-EMS6106-CJ/src/entitlements/entitlements-rest-client/src/test/resources/atdd/suites/NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck.txt"));
        }

        if (!robotTestSuite.isStarted())
        {
        	robotTestSuite.start();
        }

    }

	@AfterClass
	public static void tearDownSuite()
	{
		robotTestSuite.close();
	}

	private RobotTest currentRobotTest;

	@Before
	public void setUp() throws IOException
	{
		startSuite();
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringFalse_TimeframeFalse_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringFalse_TimeframeFalse_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_TimeframeFalse_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_TimeframeFalse_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringFalse_TimeframeTrue_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringFalse_TimeframeTrue_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_TimeframeTrue_True()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_TimeframeTrue_True";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringFalse_PathFalse_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringFalse_PathFalse_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathFalse_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathFalse_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringFalse_PathTrue_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringFalse_PathTrue_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathTrue_True()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathTrue_True";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringFalse_GeoFalse_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringFalse_GeoFalse_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_GeoFalse_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_GeoFalse_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringFalse_GeoTrue_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringFalse_GeoTrue_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_GeoTrue_True()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_GeoTrue_True";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_PathFalse_TimeframeFalse_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_PathFalse_TimeframeFalse_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_PathTrue_TimeframeFalse_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_PathTrue_TimeframeFalse_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_PathFalse_TimeframeTrue_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_PathFalse_TimeframeTrue_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_PathTrue_TimeframeTrue_True()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_PathTrue_TimeframeTrue_True";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_PathFalse_GeoFalse_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_PathFalse_GeoFalse_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_PathTrue_GeoFalse_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_PathTrue_GeoFalse_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_PathFalse_GeoTrue_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_PathFalse_GeoTrue_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_PathTrue_GeoTrue_True()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_PathTrue_GeoTrue_True";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_TimeframeFalse_GeoFalse_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_TimeframeFalse_GeoFalse_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_TimeframeTrue_GeoFalse_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_TimeframeTrue_GeoFalse_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_TimeframeFalse_GeoTrue_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_TimeframeFalse_GeoTrue_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_TimeframeTrue_GeoTrue_True()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_TimeframeTrue_GeoTrue_True";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringFalse_PathFalse_TimeframeFalse_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringFalse_PathFalse_TimeframeFalse_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathFalse_TimeframeFalse_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathFalse_TimeframeFalse_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringFalse_PathTrue_TimeframeFalse_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringFalse_PathTrue_TimeframeFalse_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringFalse_PathFalse_TimeframeTrue_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringFalse_PathFalse_TimeframeTrue_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathTrue_TimeframeFalse_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathTrue_TimeframeFalse_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathFalse_TimeframeTrue_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathFalse_TimeframeTrue_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringFalse_PathTrue_TimeframeTrue_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringFalse_PathTrue_TimeframeTrue_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathTrue_TimeframeTrue_True()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathTrue_TimeframeTrue_True";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringNone_PathTrue_TimeframeTrue_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringNone_PathTrue_TimeframeTrue_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathNone_TimeframeTrue_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathNone_TimeframeTrue_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathTrue_TimeframeNone_CurrentTimeMeetsTimeframe_True()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathTrue_TimeframeNone_CurrentTimeMeetsTimeframe_True";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathTrue_TimeframeNone_CurrentTimeNotMeetsTimeframe_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathTrue_TimeframeNone_CurrentTimeNotMeetsTimeframe_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringNone_PathNone_TimeframeTrue_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringNone_PathNone_TimeframeTrue_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringNone_PathTrue_TimeframeNone_CurrentTimeMeetsTimeframe_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringNone_PathTrue_TimeframeNone_CurrentTimeMeetsTimeframe_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringNone_PathTrue_TimeframeNone_CurrentTimeNotMeetsTimeframe_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringNone_PathTrue_TimeframeNone_CurrentTimeNotMeetsTimeframe_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathNone_TimeframeNone_CurrentTimeMeetsTimeframe_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathNone_TimeframeNone_CurrentTimeMeetsTimeframe_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathNone_TimeframeNone_CurrentTimeNotMeetsTimeframe_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathNone_TimeframeNone_CurrentTimeNotMeetsTimeframe_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringNone_PathNone_TimeframeNone_CurrentTimeMeetsTimeframe_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringNone_PathNone_TimeframeNone_CurrentTimeMeetsTimeframe_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringNone_PathNone_TimeframeNone_CurrentTimeNotMeetsTimeframe_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringNone_PathNone_TimeframeNone_CurrentTimeNotMeetsTimeframe_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathTrue_TimeframeTrue_GeoTrue_True()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathTrue_TimeframeTrue_GeoTrue_True";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathTrue_TimeframeTrue_GeoFalse_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathTrue_TimeframeTrue_GeoFalse_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathTrue_TimeframeTrue_GeoNone_False()
	{
		final String robotTestName = "Test_NonMeteredEntitlements_MultiConditionTypes_CreateAndCheck_StringTrue_PathTrue_TimeframeTrue_GeoNone_False";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

}
