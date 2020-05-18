package io.biza.lab.api;


import io.biza.lap.api.AccountsApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class BackendController  {
    @Autowired
    AccountsApi accountsApi;
    @GetMapping("/search")
    public String search(@RequestParam(value = "q") String q) {
//        accountsApi.getBalance()
        return q;
    }


}
