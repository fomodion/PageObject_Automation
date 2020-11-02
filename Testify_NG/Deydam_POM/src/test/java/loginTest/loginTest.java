package loginTest;

import Test.Test;
import setUp.setUps;

public class loginTest extends setUps {
@Test
    public void testVerifyCompanyLogo(){
    loginPage.verifyCompanyLogo();
}

@Test
    public void testVerifyForgotPassword(){
    loginPage.verifyForgetPassword();
}

}
