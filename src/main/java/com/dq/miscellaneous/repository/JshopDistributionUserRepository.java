package com.dq.miscellaneous.repository;

import com.dq.miscellaneous.entity.JshopDistributionUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JshopDistributionUserRepository extends JpaRepository<JshopDistributionUser, String> {
    List<JshopDistributionUser> findByUtoken(String utoken);

    List<JshopDistributionUser> findByParentUtokenAndLevelAndIsDelete(String utoken, int level, int isDelete);
}
