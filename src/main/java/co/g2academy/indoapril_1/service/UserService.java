package co.g2academy.indoapril_1.service;

import co.g2academy.indoapril_1.request.loginrequest.LoginRequest;
import co.g2academy.indoapril_1.response.loginresponse.BaseResponse;

import java.security.NoSuchAlgorithmException;

public interface UserService {

    //login
    BaseResponse loginByUsername( LoginRequest request ) throws NoSuchAlgorithmException;

}
