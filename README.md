# Hilt-migration
Got the below error
java.lang.IllegalStateException: Cannot reset state if the test rule has not been set.
	at dagger.hilt.internal.Preconditions.checkState(Preconditions.java:83)
	at dagger.hilt.android.internal.testing.TestApplicationComponentManager.clearState(TestApplicationComponentManager.java:138)
	at dagger.hilt.android.internal.testing.MarkThatRulesRanRule$1.evaluate(MarkThatRulesRanRule.java:94)
	at org.junit.rules.RunRules.evaluate(RunRules.java:20)
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78)
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at androidx.test.runner.AndroidJUnit4.run(AndroidJUnit4.java:104)
	at org.junit.runners.Suite.runChild(Suite.java:128)
	at org.junit.runners.Suite.runChild(Suite.java:27)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:137)
	at org.junit.runner.JUnitCore.run(JUnitCore.java:115)
	at androidx.test.internal.runner.TestExecutor.execute(TestExecutor.java:56)
	at androidx.test.runner.AndroidJUnitRunner.onStart(AndroidJUnitRunner.java:392)
	at com.cmovva.hiltsample.PpbAndroidTestRunner.onStart(PpbAndroidTestRunner.java:17)
	at android.app.Instrumentation$InstrumentationThread.run(Instrumentation.java:2145)