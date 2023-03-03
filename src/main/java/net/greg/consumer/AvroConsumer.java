package net.greg.consumer;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.stereotype.Service;

import net.greg.schema.Employee;

@Service
public class AvroConsumer {

    @StreamListener(Processor.INPUT)
    public void consumeEmployeeDetails(Employee employeeDetails) {
        System.err.println("Let's process employee details: " + employeeDetails);
    }

}
