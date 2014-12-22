package tests;
 
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import tests.LinkedLists.*;
 
@RunWith(Suite.class)
@SuiteClasses({ 
    tests.LinkedLists.LinkedListNodeTest.class,
    tests.LinkedLists.LinkedListTest.class
})
public class AllTests {}