package com.example.my_crud_project.service;

import com.example.my_crud_project.models.Rencontre;
import com.example.my_crud_project.repository.RencontreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class SchedulerService {

    @Autowired
    private RencontreRepository rencontreRepository;  // Assuming you have a RencontreRepository

    @Scheduled(cron = "0 0 8 * * ?")
    public void rencontreDeDateSys() {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Fetch all matches for today's date
        List<Rencontre> matchesToday = rencontreRepository.findByDateMatch(today);

        // Log matches or print them to the console
        if (matchesToday.isEmpty()) {
            System.out.println("No matches scheduled for today.");
        } else {
            System.out.println("Matches scheduled for today (" + today + "):");
            for (Rencontre match : matchesToday) {
                System.out.println(match.getNomStade() + ": " + match.getEquipe1() + " vs " + match.getEquipe2());
            }
        }
    }
}
