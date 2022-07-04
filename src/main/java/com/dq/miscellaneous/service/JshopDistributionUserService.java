package com.dq.miscellaneous.service;

import com.dq.miscellaneous.entity.JshopDistributionUser;
import com.dq.miscellaneous.repository.JshopDistributionUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JshopDistributionUserService {

    @Autowired
    private JshopDistributionUserRepository jshopDistributionUserRepository;

    public JshopDistributionUser findByUtoken(String utoken) {
        List<JshopDistributionUser> jshopDistributionUserList = jshopDistributionUserRepository.findByUtoken(utoken);
        if(jshopDistributionUserList.size()>0){
            return jshopDistributionUserList.get(0);
        }else{
            return null;
        }
    }

    public List<JshopDistributionUser> children(String parentUtoken, int level, int isDelete) {
        List<JshopDistributionUser> children = jshopDistributionUserRepository.findByParentUtokenAndLevelAndIsDelete(parentUtoken, level, isDelete);
        return children;
    }
}
