package com.marlow.logservice.serviceTest;

import com.marlow.logservice.DTO.MyMsg;
import com.marlow.logservice.entity.ChangeLogs;
import com.marlow.logservice.repositoryTest.LogRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumerService {
    @Autowired
    private LogRepository logRepository;

    @KafkaListener(topics = {"topic-name"}, groupId = "topic-name")
    public void consume(MyMsg myMsg) {
        log.info(String.format("Received: " + myMsg));
        ChangeLogs logs=new ChangeLogs();
        logs.setAccountId(myMsg.getId());
        logs.setUserEmail(myMsg.getUserEmail());
        logs.setAction(myMsg.getEvent());
        try {
            logRepository.save(logs);
            log.info("Log successfully saved :"+logs);
        }
        catch (Exception e)
        {
            log.error("Failed to update logs to change logs table",e.getMessage());
        }
    }
}