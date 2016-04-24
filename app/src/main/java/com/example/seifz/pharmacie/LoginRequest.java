package com.example.seifz.pharmacie;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by seifz on 19/04/2016.
 */
public class LoginRequest extends StringRequest {
    private static final  String LOGIN_REQUEST_URL = "http://seifz.netau.net/Login.php";
    private Map<String, String> params;
    public LoginRequest(String username, String password, Response.Listener<String> listener){
        super(Method.POST, LOGIN_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("username", username);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}