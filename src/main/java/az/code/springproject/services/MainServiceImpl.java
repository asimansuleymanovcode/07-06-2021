package az.code.springproject.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.xml.crypto.dsig.Manifest;

//@Component
public class MainServiceImpl implements MainService {
    Logger logger = LoggerFactory.getLogger(ExecutorServiceImpl.class);

    ExecuteService executeService;
    ExecuteService executeService2;

//    public MainServiceImpl(ExecuteService executeService, ExecuteService executeService2) {
//        this.executeService = executeService;
//        this.executeService2 = executeService2;
//    }

}
