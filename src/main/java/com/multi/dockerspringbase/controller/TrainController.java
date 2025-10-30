package com.multi.dockerspringbase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.Map;

@Controller
public class TrainController{

    @GetMapping("/train")
    public String trainSchedule(Model model) {

        List<Map<String, String>> schedules = List.of(
                Map.of("train", "KTX 101", "departure", "서울", "arrival", "부산", "time", "06:00 ~ 09:00"),
                Map.of("train", "KTX 203", "departure", "서울", "arrival", "광주", "time", "07:30 ~ 10:00"),
                Map.of("train", "무궁화 307", "departure", "대전", "arrival", "부산", "time", "08:10 ~ 11:45"),
                Map.of("train", "새마을 405", "departure", "서울", "arrival", "목포", "time", "09:20 ~ 13:30")
        );

        model.addAttribute("schedules", schedules);
        return "train";  // train.html
    }
}

