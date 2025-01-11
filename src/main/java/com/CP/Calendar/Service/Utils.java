package com.CP.Calendar.Service;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Utils {

    public static String getRelativeTime(LocalDate date, LocalTime time) {
        LocalDateTime eventTime = LocalDateTime.of(date, time);
        LocalDateTime now = LocalDateTime.now();
        Duration duration = Duration.between(now, eventTime);

        // If the event is in the future
        if (!duration.isNegative()) {
            long days = duration.toDays();
            long hours = duration.toHours() % 24;
            long minutes = duration.toMinutes() % 60;

            StringBuilder message = new StringBuilder("Starts in ");

            if (days > 0) {
                message.append(days).append(" day").append(days > 1 ? "s" : "").append(", ");
            }
            if (hours > 0) {
                message.append(hours).append(" hour").append(hours > 1 ? "s" : "").append(", ");
            }
            if (minutes > 0) {
                message.append(minutes).append(" minute").append(minutes > 1 ? "s" : "");
            }

            // Clean up trailing comma if necessary
            String result = message.toString().replaceAll(", $", "");
            return result;
        } else {
            return "The event has already started or ended.";
        }
    }

}
