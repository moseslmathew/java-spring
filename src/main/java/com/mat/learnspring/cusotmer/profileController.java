package com.mat.learnspring.cusotmer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/api/v1/profile")
public class profileController {
    @GetMapping("/default")
    public List<profile> getProfile(){
        return List.of(new profile(11,"John","mathew","11-222-2222","11/11/2000","test@test.com",1112223333));
    }

    @GetMapping("/default2")
    public String getProfile2(){
        profile pr= new profile(11,"John","mathew","11-222-2222","11/11/2000","test@test.com",1112223333);
        return Arrays.stream(pr.getClass().getName().split("\\."))
                .sorted().findFirst().toString()
                .replace("Optional","")
                .replaceAll("[\\[.*\\]$]","");
//        return pr.toString().replace(pr.getClass().toString(),"");
    }


}
