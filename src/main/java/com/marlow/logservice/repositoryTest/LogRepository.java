package com.marlow.logservice.repositoryTest;

import com.marlow.logservice.entity.ChangeLogs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogRepository extends JpaRepository<ChangeLogs,Long> {

}
