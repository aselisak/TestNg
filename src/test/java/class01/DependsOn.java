package class01;

import org.testng.annotations.Test;

public class DependsOn {
    @Test
    public void Login(){
        System.out.println("this is login");

    }
    @Test(dependsOnMethods = "Login")
    public void VerificationOfDashboard(){
        System.out.println("this is dashboard");
    }

}
