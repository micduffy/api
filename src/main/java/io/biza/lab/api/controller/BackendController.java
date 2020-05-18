package io.biza.lab.api.controller;


import io.biza.lap.api.BankingApiController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;

public class BackendController extends BankingApiController {
    public BackendController(NativeWebRequest request) {
        super(request);
    }
}
