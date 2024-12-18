package com.example.my_crud_project.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class ArbitreAspect {
    // Logs a warning message when an exception is thrown in the `affecterArbitreARencontre` method
    @AfterThrowing(pointcut = "execution(* com.example.my_crud_project.service.MatchService.affecterArbitreARencontre(..))", throwing = "e")
    public void logWarning(Exception e) {
        log.warn("Il faut affecter un arbitre de même niveau que la rencontre");
    }
}
