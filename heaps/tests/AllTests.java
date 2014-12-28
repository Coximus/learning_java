package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import tests.Heaps.*;

@RunWith(Suite.class)
@SuiteClasses({tests.Heaps.HeapTest.class})
public class AllTests {}