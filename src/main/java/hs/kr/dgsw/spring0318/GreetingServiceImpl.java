package hs.kr.dgsw.spring0318;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayHi(String name) {
        return "SERVICE2 : Hello " + name;
    }

}
