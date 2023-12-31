package Practice;

import org.testng.annotations.*;

public class GroupedTestsExample {

    @BeforeGroups("database")
    public void setUpDatabase() {
        System.out.println("Setting up database connections for the group 'database'");
    }

    @AfterGroups("database")
    public void tearDownDatabase() {
        System.out.println("Tearing down database connections for the group 'database'");
    }

    @Test(groups = "database")
    public void testDatabaseOperation1() {
        System.out.println("Executing testDatabaseOperation1");
    }

    @Test(groups = "database")
    public void testDatabaseOperation2() {
        System.out.println("Executing testDatabaseOperation2");
    }

    @BeforeGroups("ui")
    public void setUpUI() {
        System.out.println("Setting up UI resources for the group 'ui'");
    }

    @AfterGroups("ui")
    public void tearDownUI() {
        System.out.println("Tearing down UI resources for the group 'ui'");
    }

    @Test(groups = "ui")
    public void testUIOperation1() {
        System.out.println("Executing testUIOperation1");
    }

    @Test(groups = "ui")
    public void testUIOperation2() {
        System.out.println("Executing testUIOperation2");
    }
}
