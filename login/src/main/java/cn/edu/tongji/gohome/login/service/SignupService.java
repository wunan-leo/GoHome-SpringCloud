package cn.edu.tongji.gohome.login.service;

import cn.edu.tongji.gohome.login.payload.IdVerificationResult;
import org.springframework.stereotype.Service;

/**
 * For Signup
 *
 * @author 卓正一
 * @since 2021-11-23 7:55 PM
 */
@Service
public interface SignupService {

    Boolean checkPhoneAvailable(String phone);

    void changeCustomerPassword(String phone, String newPassword);

    void changeCustomerPassword(Long userId, String newPassword);

    // TODO 分割一个发送短信的服务接口

    void sendSmsVerificationCode(String phone);

    // TODO 一个身份证照片检验服务

    IdVerificationResult idVerification(String base64img);

    Long customerSignup(String phoneCode, String phone, String password, String username);

    Long customerSignup(String phoneCode, String phone, String password, String username, String gender);

    void hostSignup(String phoneCode, String phone, String password, String username, String IdCardNum, String realName, String gender);

    void hostSignup(String residentId, String realName, Long customerId);

    void setCustomerGender(Long customerId, String gender);
}
