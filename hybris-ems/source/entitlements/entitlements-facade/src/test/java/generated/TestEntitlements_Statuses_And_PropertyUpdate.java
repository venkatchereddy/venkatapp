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
@ContextConfiguration("/META-INF/entitlement-facade-test-spring.xml")
@SuppressWarnings("PMD")
public class TestEntitlements_Statuses_And_PropertyUpdate
{
	public static RobotTestSuite robotTestSuite;

	public static void startSuite() throws IOException
	{
		if (robotTestSuite == null)
		{
			final PythonAware pythonAware = new DefaultPythonProvider(
				"/opt/bamboo-agent/xml-data/build-dir/HYM-EMS6106-CJ/src/entitlements/entitlements-facade/target/dependencies/atdd/keywords",
				"/opt/bamboo-agent/xml-data/build-dir/HYM-EMS6106-CJ/src/entitlements/entitlements-facade/src/test/resources/atdd/keywords"
			);
			final RobotSettings robotSettings = new RobotSettings();

			robotSettings.setOutputDir(new File("/opt/bamboo-agent/xml-data/build-dir/HYM-EMS6106-CJ/src/entitlements/entitlements-facade/target/atdd/reports"));
			robotSettings.setLogName("TestEntitlements_Statuses_And_PropertyUpdate-log");
			robotSettings.setOutputName("TestEntitlements_Statuses_And_PropertyUpdate-output");
			robotSettings.setReportName("TestEntitlements_Statuses_And_PropertyUpdate-report");

			final RobotTestSuiteFactory robotTestSuiteFactory = new PythonRobotTestSuiteFactory(pythonAware);

			robotTestSuite = robotTestSuiteFactory.parseTestSuite(robotSettings, new File(
			"/opt/bamboo-agent/xml-data/build-dir/HYM-EMS6106-CJ/src/entitlements/entitlements-facade/src/test/resources/atdd/suites/Entitlements_Statuses_And_PropertyUpdate.txt"));
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
	public void Test_Entitlements_Statuses_ConditionType_WithoutCondition_Active_To_Suspended()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_WithoutCondition_Active_To_Suspended";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_WithoutCondition_Active_To_Active()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_WithoutCondition_Active_To_Active";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_WithoutCondition_Suspended_To_Active()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_WithoutCondition_Suspended_To_Active";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_WithoutCondition_Suspended_To_Suspended()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_WithoutCondition_Suspended_To_Suspended";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_WithoutCondition_Active_To_Revoked_No1()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_WithoutCondition_Active_To_Revoked_No1";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_WithoutCondition_Active_To_Revoked_No2()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_WithoutCondition_Active_To_Revoked_No2";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_WithoutCondition_Suspended_To_Revoked_No1()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_WithoutCondition_Suspended_To_Revoked_No1";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_WithoutCondition_Suspended_To_Revoked_No2()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_WithoutCondition_Suspended_To_Revoked_No2";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_WithoutCondition_Active_PropertyUpdate()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_WithoutCondition_Active_PropertyUpdate";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_WithoutCondition_Suspended_PropertyUpdate()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_WithoutCondition_Suspended_PropertyUpdate";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_StringCondition_Active_To_Suspended()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_StringCondition_Active_To_Suspended";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_StringCondition_Active_To_Active()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_StringCondition_Active_To_Active";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_StringCondition_Suspended_To_Active()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_StringCondition_Suspended_To_Active";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_StringCondition_Suspended_To_Suspended()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_StringCondition_Suspended_To_Suspended";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_StringCondition_Active_To_Revoked_No1()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_StringCondition_Active_To_Revoked_No1";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_StringCondition_Active_To_Revoked_No2()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_StringCondition_Active_To_Revoked_No2";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_StringCondition_Suspended_To_Revoked_No1()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_StringCondition_Suspended_To_Revoked_No1";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_StringCondition_Suspended_To_Revoked_No2()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_StringCondition_Suspended_To_Revoked_No2";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_StringCondition_Active_PropertyUpdate()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_StringCondition_Active_PropertyUpdate";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_StringCondition_Suspended_PropertyUpdate()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_StringCondition_Suspended_PropertyUpdate";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_PathCondition_Active_To_Suspended()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_PathCondition_Active_To_Suspended";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_PathCondition_Active_To_Active()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_PathCondition_Active_To_Active";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_PathCondition_Suspended_To_Active()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_PathCondition_Suspended_To_Active";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_PathCondition_Suspended_To_Suspended()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_PathCondition_Suspended_To_Suspended";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_PathCondition_Active_To_Revoked_No1()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_PathCondition_Active_To_Revoked_No1";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_PathCondition_Active_To_Revoked_No2()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_PathCondition_Active_To_Revoked_No2";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_PathCondition_Suspended_To_Revoked_No1()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_PathCondition_Suspended_To_Revoked_No1";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_PathCondition_Suspended_To_Revoked_No2()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_PathCondition_Suspended_To_Revoked_No2";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_PathCondition_Active_PropertyUpdate()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_PathCondition_Active_PropertyUpdate";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_PathCondition_Suspended_PropertyUpdate()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_PathCondition_Suspended_PropertyUpdate";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Active_SetWhenGranted_No1()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Active_SetWhenGranted_No1";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Active_SetWhenGranted_No2()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Active_SetWhenGranted_No2";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Active_SetWhenGranted_No3()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Active_SetWhenGranted_No3";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Active_To_Suspended()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Active_To_Suspended";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Active_To_Active()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Active_To_Active";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Suspended_To_Active()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Suspended_To_Active";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Suspended_To_Suspended()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Suspended_To_Suspended";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Active_To_Revoked_No1()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Active_To_Revoked_No1";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Active_To_Revoked_No2()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Active_To_Revoked_No2";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Suspended_To_Revoked_No1()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Suspended_To_Revoked_No1";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Suspended_To_Revoked_No2()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Suspended_To_Revoked_No2";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Active_PropertyUpdate()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Active_PropertyUpdate";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Suspended_PropertyUpdate()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_TimeframeCondition_Suspended_PropertyUpdate";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_GeoCondition_Active_To_Suspended()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_GeoCondition_Active_To_Suspended";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_GeoCondition_Active_To_Active()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_GeoCondition_Active_To_Active";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_GeoCondition_Suspended_To_Active()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_GeoCondition_Suspended_To_Active";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_GeoCondition_Suspended_To_Suspended()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_GeoCondition_Suspended_To_Suspended";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_GeoCondition_Active_To_Revoked_No1()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_GeoCondition_Active_To_Revoked_No1";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_GeoCondition_Active_To_Revoked_No2()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_GeoCondition_Active_To_Revoked_No2";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_GeoCondition_Suspended_To_Revoked_No1()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_GeoCondition_Suspended_To_Revoked_No1";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_GeoCondition_Suspended_To_Revoked_No2()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_GeoCondition_Suspended_To_Revoked_No2";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_GeoCondition_Active_PropertyUpdate()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_GeoCondition_Active_PropertyUpdate";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_GeoCondition_Suspended_PropertyUpdate()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_GeoCondition_Suspended_PropertyUpdate";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_StringAndPathAndTimeCondition_Active_To_Suspended()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_StringAndPathAndTimeCondition_Active_To_Suspended";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_StringAndPathAndTimeCondition_Active_To_Active()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_StringAndPathAndTimeCondition_Active_To_Active";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_StringAndPathAndTimeCondition_Suspended_To_Active()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_StringAndPathAndTimeCondition_Suspended_To_Active";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_StringAndPathAndTimeCondition_Suspended_To_Suspended()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_StringAndPathAndTimeCondition_Suspended_To_Suspended";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_StringAndPathAndTimeCondition_Active_To_Revoked_No1()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_StringAndPathAndTimeCondition_Active_To_Revoked_No1";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_StringAndPathAndTimeCondition_Active_To_Revoked_No2()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_StringAndPathAndTimeCondition_Active_To_Revoked_No2";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_StringAndPathAndTimeCondition_Suspended_To_Revoked_No1()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_StringAndPathAndTimeCondition_Suspended_To_Revoked_No1";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_StringAndPathAndTimeCondition_Suspended_To_Revoked_No2()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_StringAndPathAndTimeCondition_Suspended_To_Revoked_No2";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_StringAndPathAndTimeCondition_Active_PropertyUpdate()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_StringAndPathAndTimeCondition_Active_PropertyUpdate";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_StringAndPathAndTimeCondition_Suspended_PropertyUpdate()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_StringAndPathAndTimeCondition_Suspended_PropertyUpdate";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_MeteredCondition_Active_To_Suspended()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_MeteredCondition_Active_To_Suspended";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_MeteredCondition_Active_To_Active()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_MeteredCondition_Active_To_Active";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_MeteredCondition_Suspended_To_Active()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_MeteredCondition_Suspended_To_Active";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_MeteredCondition_Suspended_To_Suspended()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_MeteredCondition_Suspended_To_Suspended";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_MeteredCondition_Active_To_Revoked_No1()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_MeteredCondition_Active_To_Revoked_No1";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_MeteredCondition_Active_To_Revoked_No2()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_MeteredCondition_Active_To_Revoked_No2";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_MeteredCondition_Suspended_To_Revoked_No1()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_MeteredCondition_Suspended_To_Revoked_No1";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_MeteredCondition_Suspended_To_Revoked_No2()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_MeteredCondition_Suspended_To_Revoked_No2";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_MeteredCondition_Active_PropertyUpdate()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_MeteredCondition_Active_PropertyUpdate";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_MeteredCondition_Suspended_PropertyUpdate()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_MeteredCondition_Suspended_PropertyUpdate";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_MixedCondition_Active_To_Suspended()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_MixedCondition_Active_To_Suspended";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_MixedCondition_Active_To_Active()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_MixedCondition_Active_To_Active";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_MixedCondition_Suspended_To_Active()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_MixedCondition_Suspended_To_Active";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_MixedCondition_Suspended_To_Suspended()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_MixedCondition_Suspended_To_Suspended";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_MixedCondition_Active_To_Revoked_No1()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_MixedCondition_Active_To_Revoked_No1";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_MixedCondition_Active_To_Revoked_No2()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_MixedCondition_Active_To_Revoked_No2";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_MixedCondition_Suspended_To_Revoked_No1()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_MixedCondition_Suspended_To_Revoked_No1";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_MixedCondition_Suspended_To_Revoked_No2()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_MixedCondition_Suspended_To_Revoked_No2";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_MixedCondition_Active_PropertyUpdate()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_MixedCondition_Active_PropertyUpdate";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

	@Test
	public void Test_Entitlements_Statuses_ConditionType_MixedCondition_Suspended_PropertyUpdate()
	{
		final String robotTestName = "Test_Entitlements_Statuses_ConditionType_MixedCondition_Suspended_PropertyUpdate";

		final RobotTest robotTest = robotTestSuite.getRobotTest(robotTestName);

		currentRobotTest = robotTestSuite.getRobotTest(robotTestName);
		assertNotNull("Robot test: '" + robotTestName + "' not found", currentRobotTest);

		final RobotTestResult robotTestResult = robotTest.run();
		assertTrue(robotTestResult.getMessage(), robotTestResult.isSuccess());
	}

}
