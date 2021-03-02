package com.example.muslimprayertime;

public class lvov {

    String[] get_time_prayer(Integer current_mouth, Integer current_day) {

        String[] list_time_prayer = new String[]{};

        /*--------------БАЗА на месяц "ЯНВАРЬ"- изменяется автоматически каждый год с учетом "ГРИГОРИАНСКОГО" (СОЛНЕЧНОГО) КАЛЕНДАРЯ--------------*/
        if(current_mouth == 1) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"06:24", "08:04", "12:29", "14:21", "16:43", "18:13"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"06:24", "08:04", "12:30", "14:22", "16:44", "18:14"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"06:24", "08:04", "12:30", "14:23", "16:45", "18:15"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"06:23", "08:03", "12:31", "14:24", "16:46", "18:16"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"06:23", "08:03", "12:31", "14:25", "16:48", "18:18"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"06:23", "08:03", "12:32", "14:26", "16:49", "18:19"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"06:23", "08:03", "12:32", "14:27", "16:50", "18:20"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"06:22", "08:02", "12:33", "14:28", "16:51", "18:22"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"06:22", "08:02", "12:33", "14:29", "16:53", "18:23"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"06:21", "08:01", "12:33", "14:30", "16:54", "18:24"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"06:21", "08:01", "12:34", "14:32", "16:55", "18:25"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"06:20", "08:00", "12:34", "14:33", "16:57", "18:27"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"06:20", "08:00", "12:35", "14:34", "16:58", "18:28"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"06:19", "07:59", "12:35", "14:35", "16:59", "18:29"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"06:18", "07:58", "12:35", "14:36", "17:01", "18:31"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"06:18", "07:58", "12:36", "14:38", "17:02", "18:32"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"06:17", "07:57", "12:36", "14:39", "17:04", "18:34"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"06:16", "07:56", "12:36", "14:40", "17:05", "18:35"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"06:15", "07:55", "12:37", "14:42", "17:07", "18:37"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"06:14", "07:54", "12:37", "14:43", "17:08", "18:38"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"06:13", "07:53", "12:37", "14:44", "17:09", "18:40"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"06:12", "07:52", "12:38", "14:46", "17:11", "18:42"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"06:11", "07:51", "12:38", "14:47", "17:13", "18:43"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"06:10", "07:50", "12:38", "14:48", "17:14", "18:45"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"06:09", "07:49", "12:38", "14:50", "17:15", "18:46"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"06:07", "07:47", "12:39", "14:51", "17:17", "18:48"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"06:06", "07:46", "12:39", "14:53", "17:19", "18:50"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"06:05", "07:45", "12:39", "14:54", "17:20", "18:51"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"06:04", "07:44", "12:39", "14:55", "17:22", "18:53"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"06:03", "07:42", "12:39", "14:57", "17:25", "18:55"};
            } else {
                list_time_prayer = new String[]{"06:01", "07:39", "12:39", "14:59", "17:27", "18:57"};
            }

            /*--------------БАЗА на месяц "ФЕВРАЛЬ", - "29" день необходимо добавить в ручную, т.к. это высокосный год и бывает раз в 4 года---------*/
        } else if(current_mouth == 2) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"06:04", "07:44", "12:40", "15:04", "17:27", "18:57"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"06:02", "07:42", "12:40", "15:05", "17:29", "18:59"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"06:01", "07:41", "12:40", "15:06", "17:31", "19:01"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:59", "07:39", "12:40", "15:08", "17:32", "19:02"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:58", "07:38", "12:40", "15:09", "17:34", "19:04"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:56", "07:36", "12:40", "15:11", "17:36", "19:06"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:54", "07:34", "12:40", "15:12", "17:37", "19:07"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:53", "07:33", "12:40", "15:13", "17:39", "19:09"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:51", "07:31", "12:40", "15:15", "17:41", "19:11"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:49", "07:29", "12:40", "15:16", "17:43", "19:13"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:48", "07:28", "12:40", "15:18", "17:44", "19:14"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:46", "07:26", "12:40", "15:19", "17:46", "19:16"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:44", "07:24", "12:40", "15:20", "17:48", "19:18"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:42", "07:22", "12:40", "15:22", "17:50", "19:20"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:41", "07:21", "12:40", "15:23", "17:51", "19:21"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:39", "07:19", "12:40", "15:24", "17:53", "19:23"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:37", "07:17", "12:40", "15:26", "17:55", "19:25"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:35", "07:15", "12:40", "15:27", "17:56", "19:26"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:33", "07:13", "12:40", "15:28", "17:58", "19:28"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:31", "07:11", "12:40", "15:30", "18:00", "19:30"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:29", "07:09", "12:40", "15:31", "18:02", "19:32"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:27", "07:07", "12:39", "15:32", "18:03", "19:33"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:26", "07:06", "12:39", "15:34", "18:05", "19:35"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:24", "07:04", "12:39", "15:35", "18:07", "19:37"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:22", "07:02", "12:39", "15:36", "18:08", "19:38"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:20", "07:00", "12:39", "15:37", "18:10", "19:40"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:17", "06:57", "12:39", "15:38", "18:12", "19:42"};

                /*------------------Разкоментировать эту строку указанную ниже, если наступил высокосный год, т.е. 29 Февраля 2016 года-------*/
			/*} else if(current_day > 27 && current_day < 29) {
				list_time_prayer = new String[]{"04:58", "06:38", "12:16", "15:06", "17:44", "19:14"};*/
            } else {
                list_time_prayer = new String[]{"05:15", "06:55", "12:39", "15:40", "18:13", "19:43"};
            }

            /*--------------БАЗА на месяц "МАРТ"---------------*/
        } else if(current_mouth == 3) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"05:16", "06:56", "12:39", "15:35", "18:12", "19:42"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:14", "06:54", "12:39", "15:36", "18:14", "19:44"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:12", "06:52", "12:39", "15:37", "18:15", "19:45"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:10", "06:50", "12:39", "15:38", "18:17", "19:47"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:08", "06:48", "12:38", "15:40", "18:19", "19:49"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:06", "06:46", "12:38", "15:41", "18:20", "19:50"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:04", "06:44", "12:38", "15:42", "18:22", "19:52"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:02", "06:42", "12:38", "15:43", "18:24", "19:54"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:00", "06:40", "12:38", "15:44", "18:25", "19:55"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:57", "06:37", "12:37", "15:45", "18:27", "19:57"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:55", "06:35", "12:37", "15:46", "18:29", "19:59"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:53", "06:33", "12:37", "15:47", "18:30", "20:00"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:51", "06:31", "12:36", "15:48", "18:32", "20:02"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:49", "06:29", "12:36", "15:49", "18:34", "20:04"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:47", "06:27", "12:36", "15:50", "18:35", "20:05"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:44", "06:24", "12:36", "15:52", "18:37", "20:07"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:42", "06:22", "12:35", "15:53", "18:39", "20:09"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:40", "06:20", "12:35", "15:54", "18:40", "20:10"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:39", "06:19", "12:35", "15:55", "18:42", "20:12"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:37", "06:17", "12:34", "15:56", "18:43", "20:13"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:33", "06:13", "12:34", "15:56", "18:45", "20:15"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:31", "06:11", "12:34", "15:57", "18:47", "20:17"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:29", "06:09", "12:34", "15:58", "18:48", "20:18"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:27", "06:07", "12:33", "15:59", "18:50", "20:20"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:24", "06:04", "12:33", "16:00", "18:52", "20:22"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:22", "06:02", "12:33", "16:01", "18:53", "20:23"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:20", "06:00", "12:32", "16:02", "18:55", "20:25"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"04:18", "05:58", "12:32", "16:03", "18:56", "20:26"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:16", "06:56", "13:32", "17:04", "19:58", "21:28"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"05:13", "06:53", "13:31", "17:05", "20:00", "21:30"};
            } else {
                list_time_prayer = new String[]{"05:11", "06:51", "13:31", "17:05", "20:01", "21:31"};/* Перевод часов на (1 час вперед) в последнее воскресенье этого месяца, т.е. с последней (субботы на воскресенье) (31.03.2019 г.) */
            }

            /*--------------БАЗА на месяц "АПРЕЛЬ"---------------*/
        } else if(current_mouth == 4) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"05:12", "06:52", "13:30", "17:16", "20:00", "21:30"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:10", "06:50", "13:30", "17:17", "20:01", "21:31"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:08", "06:48", "13:29", "17:18", "20:03", "21:33"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:05", "06:45", "13:29", "17:19", "20:05", "21:35"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:03", "06:43", "13:29", "17:20", "20:06", "21:36"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:01", "06:41", "13:28", "17:20", "20:08", "21:38"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:59", "06:39", "13:28", "17:21", "20:10", "21:40"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:57", "06:37", "13:28", "17:22", "20:11", "21:41"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:54", "06:34", "13:28", "17:23", "20:13", "21:43"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:52", "06:32", "13:27", "17:24", "20:14", "21:44"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:50", "06:30", "13:27", "17:24", "20:16", "21:46"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:48", "06:28", "13:27", "17:25", "20:18", "21:48"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:46", "06:26", "13:27", "17:26", "20:19", "21:49"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:44", "06:24", "13:26", "17:27", "20:21", "21:51"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:42", "06:22", "13:26", "17:27", "20:23", "21:53"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:40", "06:20", "13:26", "17:28", "20:24", "21:54"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:37", "06:17", "13:26", "17:29", "20:26", "21:56"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:35", "06:15", "13:25", "17:29", "20:27", "21:57"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:33", "06:13", "13:25", "17:30", "20:29", "21:59"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:31", "06:11", "13:25", "17:31", "20:31", "22:01"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:29", "06:09", "13:25", "17:31", "20:32", "22:02"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:27", "06:07", "13:24", "17:32", "20:34", "22:04"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:25", "06:05", "13:24", "17:33", "20:35", "22:05"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:23", "06:03", "13:24", "17:33", "20:37", "22:07"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:21", "06:01", "13:24", "17:34", "20:39", "22:09"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:19", "05:59", "13:24", "17:35", "20:40", "22:10"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:17", "05:57", "13:24", "17:35", "20:42", "22:12"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"04:15", "05:55", "13:23", "17:36", "20:44", "22:14"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:13", "05:53", "13:23", "17:37", "20:45", "22:15"};
            } else {
                list_time_prayer = new String[]{"04:12", "05:52", "13:23", "17:37", "20:47", "22:17"};
            }

            /*--------------БАЗА на месяц "МАЙ"---------------*/
        } else if(current_mouth == 5) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:14", "05:54", "13:23", "17:24", "20:45", "22:15"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:12", "05:52", "13:23", "17:24", "20:47", "22:17"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:10", "05:50", "13:23", "17:25", "20:49", "22:19"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:08", "05:48", "13:23", "17:26", "20:50", "22:20"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:07", "05:47", "13:23", "17:26", "20:52", "22:22"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:05", "05:45", "13:23", "17:27", "20:53", "22:23"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:03", "05:43", "13:22", "17:28", "20:55", "22:25"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:01", "05:41", "13:22", "17:28", "20:56", "22:26"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:00", "05:40", "13:22", "17:29", "20:58", "22:28"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"03:58", "05:38", "13:22", "17:29", "21:00", "22:30"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"03:56", "05:36", "13:22", "17:30", "21:01", "22:31"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"03:55", "05:35", "13:22", "17:30", "21:03", "22:33"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:53", "05:33", "13:22", "17:31", "21:04", "22:34"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:52", "05:32", "13:22", "17:32", "21:06", "22:36"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:50", "05:30", "13:22", "17:32", "21:07", "22:37"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:49", "05:29", "13:22", "17:33", "21:09", "22:39"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:47", "05:27", "13:22", "17:33", "21:10", "22:40"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:46", "05:26", "13:22", "17:34", "21:12", "22:42"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:45", "05:25", "13:22", "17:34", "21:13", "22:43"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:43", "05:23", "13:22", "17:35", "21:14", "22:44"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:42", "05:22", "13:22", "17:35", "21:16", "22:46"};
            } else if(current_day > 21 && current_day < 23)  {
                list_time_prayer = new String[]{"03:41", "05:21", "13:23", "17:36", "21:17", "22:48"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:40", "05:20", "13:23", "17:36", "21:18", "22:50"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:39", "05:19", "13:23", "17:37", "21:20", "22:53"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:37", "05:17", "13:23", "17:37", "21:21", "22:55"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:36", "05:16", "13:23", "17:38", "21:22", "22:57"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:35", "05:15", "13:23", "17:38", "21:24", "23:00"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:34", "05:14", "13:23", "17:39", "21:25", "23:02"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"03:33", "05:13", "13:23", "17:39", "21:26", "23:04"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"03:32", "05:12", "13:23", "17:40", "21:27", "23:06"};
            } else {
                list_time_prayer = new String[]{"03:32", "05:12", "13:24", "17:40", "21:28", "23:08"};
            }

            /*--------------БАЗА на месяц "ИЮНЬ"---------------*/
        } else if(current_mouth == 6) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"03:32", "05:12", "13:24", "17:39", "21:26", "23:08"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"03:31", "05:11", "13:24", "17:39", "21:27", "23:08"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"03:30", "05:10", "13:24", "17:40", "21:28", "23:08"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"03:30", "05:10", "13:24", "17:40", "21:29", "23:09"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"03:29", "05:09", "13:24", "17:40", "21:30", "23:10"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"03:28", "05:08", "13:25", "17:42", "21:31", "23:11"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"03:28", "05:08", "13:25", "17:42", "21:32", "23:12"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"03:27", "05:07", "13:25", "17:42", "21:33", "23:13"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"03:27", "05:07", "13:25", "17:42", "21:34", "23:14"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"03:26", "05:06", "13:25", "17:42", "21:35", "23:15"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"03:26", "05:06", "13:26", "17:43", "21:35", "23:15"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"03:26", "05:06", "13:26", "17:43", "21:36", "23:16"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:26", "05:06", "13:26", "17:43", "21:37", "23:17"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:25", "05:05", "13:26", "17:43", "21:37", "23:17"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:25", "05:05", "13:26", "17:44", "21:38", "23:18"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:25", "05:05", "13:27", "17:44", "21:38", "23:18"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:25", "05:05", "13:27", "17:44", "21:39", "23:19"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:25", "05:05", "13:27", "17:45", "21:39", "23:19"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:25", "05:05", "13:27", "17:45", "21:39", "23:19"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:25", "05:05", "13:27", "17:45", "21:40", "23:20"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:26", "05:06", "13:27", "17:45", "21:40", "23:20"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"03:26", "05:06", "13:28", "17:45", "21:40", "23:20"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:26", "05:06", "13:28", "17:46", "21:40", "23:20"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:26", "05:06", "13:28", "17:46", "21:40", "23:20"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:27", "05:07", "13:28", "17:46", "21:40", "23:20"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:27", "05:07", "13:29", "17:46", "21:40", "23:20"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:28", "05:08", "13:29", "17:46", "21:40", "23:20"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:28", "05:08", "13:29", "17:46", "21:40", "23:20"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"03:29", "05:09", "13:29", "17:46", "21:40", "23:20"};
            } else {
                list_time_prayer = new String[]{"03:29", "05:09", "13:30", "17:46", "21:40", "23:20"};
            }

            /*--------------БАЗА на месяц "ИЮЛЬ"---------------*/
        } else if(current_mouth == 7) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"03:31", "05:11", "13:30", "17:47", "21:39", "23:19"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"03:31", "05:11", "13:30", "17:47", "21:39", "23:19"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"03:32", "05:12", "13:30", "17:47", "21:39", "23:19"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"03:33", "05:13", "13:30", "17:47", "21:38", "23:18"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"03:34", "05:14", "13:30", "17:47", "21:38", "23:18"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"03:35", "05:15", "13:31", "17:46", "21:37", "23:17"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"03:35", "05:15", "13:31", "17:46", "21:37", "23:17"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"03:36", "05:16", "13:31", "17:46", "21:36", "23:16"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"03:37", "05:17", "13:31", "17:46", "21:35", "23:15"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"03:38", "05:18", "13:31", "17:46", "21:35", "23:15"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"03:39", "05:19", "13:31", "17:46", "21:34", "23:14"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"03:40", "05:20", "13:32", "17:46", "21:33", "23:13"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:42", "05:22", "13:32", "17:46", "21:32", "23:12"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:43", "05:23", "13:32", "17:45", "21:31", "23:11"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:44", "05:24", "13:32", "17:45", "21:30", "23:10"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:45", "05:25", "13:32", "17:45", "21:29", "23:09"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:46", "05:26", "13:32", "17:45", "21:28", "23:08"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:47", "05:27", "13:32", "17:45", "21:27", "23:07"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:49", "05:29", "13:32", "17:44", "21:26", "23:06"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:50", "06:30", "13:32", "17:43", "21:25", "23:05"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:51", "05:31", "13:32", "17:43", "21:24", "23:04"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"03:52", "05:32", "13:32", "17:43", "21:22", "23:02"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:54", "05:34", "13:32", "17:42", "21:21", "23:01"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:55", "05:35", "13:32", "17:42", "21:20", "23:00"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:56", "05:36", "13:32", "17:41", "21:18", "22:58"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:58", "05:38", "13:32", "17:41", "21:17", "22:57"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:59", "05:39", "13:32", "17:40", "21:16", "22:56"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"04:01", "05:41", "13:32", "17:40", "21:14", "22:54"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:02", "05:42", "13:32", "17:39", "21:13", "22:53"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"04:04", "05:44", "13:32", "17:39", "21:11", "22:51"};
            } else {
                list_time_prayer = new String[]{"04:05", "05:45", "13:32", "17:38", "21:10", "22:50"};
            }

            /*--------------БАЗА на месяц "АВГУСТ"---------------*/
        } else if(current_mouth == 8) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:05", "05:45", "13:32", "17:38", "21:10", "22:50"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:07", "05:47", "13:32", "17:38", "21:08", "22:48"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:08", "05:48", "13:32", "17:37", "21:07", "22:47"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:10", "05:50", "13:32", "17:36", "21:05", "22:45"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:11", "05:51", "13:32", "17:35", "21:03", "22:43"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:13", "05:53", "13:32", "17:35", "21:02", "22:42"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:14", "05:54", "13:32", "17:34", "21:00", "22:40"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:16", "05:56", "13:32", "17:33", "20:58", "22:38"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:18", "05:58", "13:31", "17:32", "20:56", "22:36"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:19", "05:59", "13:31", "17:31", "20:55", "22:35"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:21", "06:01", "13:31", "17:31", "20:53", "22:33"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:22", "06:02", "13:31", "17:30", "20:51", "22:31"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:24", "06:04", "13:31", "17:29", "20:49", "22:29"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:25", "06:05", "13:31", "17:28", "20:47", "22:27"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:27", "06:07", "13:30", "17:27", "20:45", "22:25"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:28", "06:08", "13:30", "17:26", "20:43", "22:23"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:31", "06:11", "13:30", "17:26", "20:42", "22:22"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:31", "06:11", "13:30", "17:24", "20:39", "22:19"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:33", "06:13", "13:30", "17:23", "20:37", "22:17"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:34", "06:14", "13:29", "17:21", "20:35", "22:15"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:36", "06:16", "13:29", "17:20", "20:33", "22:13"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:38", "06:18", "13:29", "17:19", "20:31", "22:11"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:39", "06:19", "13:29", "17:18", "20:29", "22:09"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:41", "06:21", "13:28", "17:17", "20:27", "22:07"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:42", "06:22", "13:28", "17:16", "20:25", "22:05"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:44", "06:24", "13:28", "17:14", "20:23", "22:03"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:45", "06:25", "13:27", "17:13", "20:21", "22:01"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"04:47", "06:27", "13:27", "17:12", "20:18", "21:58"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:48", "06:28", "13:27", "17:11", "20:16", "21:56"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"04:50", "06:30", "13:27", "17:09", "20:14", "21:54"};
            } else {
                list_time_prayer = new String[]{"04:52", "06:32", "13:26", "17:08", "20:12", "21:52"};
            }

            /*--------------БАЗА на месяц "СЕНТЯБРЬ"---------------*/
        } else if(current_mouth == 9) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:49", "06:29", "13:26", "17:23", "20:12", "21:52"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:51", "06:31", "13:26", "17:21", "20:10", "21:49"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:52", "06:32", "13:25", "17:20", "20:07", "21:45"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:54", "06:34", "13:25", "17:19", "20:05", "21:42"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:55", "06:35", "13:25", "17:17", "20:03", "21:39"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:57", "06:37", "13:24", "17:16", "20:01", "21:36"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:58", "06:38", "13:24", "17:14", "19:59", "21:33"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:00", "06:40", "13:24", "17:13", "19:56", "21:29"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:01", "06:41", "13:23", "17:12", "19:54", "21:26"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:03", "06:43", "13:23", "17:10", "19:52", "21:23"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:04", "06:44", "13:23", "17:09", "19:50", "21:20"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:06", "06:46", "13:22", "17:07", "19:48", "21:18"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:08", "06:48", "13:22", "17:06", "19:45", "21:15"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:09", "06:49", "13:21", "17:04", "19:43", "21:13"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:11", "06:51", "13:21", "17:03", "19:41", "21:11"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:12", "06:52", "13:21", "17:01", "19:39", "21:09"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:14", "06:54", "13:21", "17:00", "19:36", "21:06"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:15", "06:55", "13:20", "16:58", "19:34", "21:04"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:17", "06:57", "13:20", "16:56", "19:32", "21:02"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:18", "06:58", "13:19", "16:55", "19:30", "21:00"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:20", "07:00", "13:19", "16:53", "19:27", "20:57"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:21", "07:01", "13:19", "16:52", "19:25", "20:55"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:23", "07:03", "13:18", "16:50", "19:23", "20:53"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:23", "07:03", "13:18", "16:50", "19:23", "20:53"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:24", "07:04", "13:18", "16:47", "19:19", "20:49"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:27", "07:07", "13:17", "16:45", "19:16", "20:46"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:29", "07:09", "13:17", "16:44", "19:14", "20:44"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:31", "07:11", "13:17", "16:42", "19:12", "20:42"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:32", "07:12", "13:16", "16:40", "19:10", "20:40"};
            } else {
                list_time_prayer = new String[]{"05:34", "07:14", "13:16", "16:39", "19:07", "20:37"};
            }

            /*--------------БАЗА на месяц "ОКТЯБРЬ"---------------*/
        } else if(current_mouth == 10) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"05:32", "07:12", "13:16", "16:25", "19:09", "20:39"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:34", "07:14", "13:15", "16:23", "19:07", "20:37"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:35", "07:15", "13:15", "16:22", "19:05", "20:35"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:37", "07:17", "13:15", "16:20", "19:03", "20:33"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:39", "07:19", "13:14", "16:18", "19:00", "20:30"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:40", "07:20", "13:14", "16:17", "18:58", "20:28"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:42", "07:22", "13:14", "16:15", "18:56", "20:26"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:43", "07:23", "13:14", "16:13", "18:54", "20:24"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:45", "07:25", "13:13", "16:12", "18:52", "20:22"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:46", "07:26", "13:13", "16:10", "18:50", "20:20"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:48", "07:28", "13:13", "16:09", "18:48", "20:18"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:50", "07:30", "13:12", "16:07", "18:45", "20:15"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:51", "07:31", "13:12", "16:05", "18:43", "20:13"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:53", "07:33", "13:12", "16:04", "18:41", "20:11"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:54", "07:34", "13:12", "16:02", "18:39", "20:09"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:56", "07:36", "13:12", "16:00", "18:37", "20:07"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:58", "07:38", "13:11", "15:59", "18:35", "20:05"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:59", "07:39", "13:11", "15:57", "18:33", "20:03"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"06:01", "07:41", "13:11", "15:56", "18:31", "20:01"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"06:03", "07:43", "13:11", "15:54", "18:29", "19:59"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"06:04", "07:44", "13:11", "15:53", "18:27", "19:57"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"06:06", "07:46", "13:10", "15:51", "18:25", "19:55"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"06:07", "07:47", "13:10", "15:49", "18:23", "19:53"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"06:09", "07:49", "13:10", "15:48", "18:21", "19:51"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:11", "06:51", "12:10", "14:46", "17:20", "18:50"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:12", "06:52", "12:10", "14:45", "17:18", "18:48"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:14", "06:54", "12:10", "14:43", "17:16", "18:46"};/* Перевод часов на (1 час назад) последней субботы начиная с воскресенья (27.10.2019 г.) этого месяца*/
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:16", "06:56", "12:10", "14:42", "17:14", "18:44"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:17", "06:57", "12:10", "14:41", "17:12", "18:42"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"05:19", "06:59", "12:10", "14:39", "17:10", "18:40"};
            } else {
                list_time_prayer = new String[]{"05:21", "06:59", "12:10", "14:38", "17:09", "18:39"};
            }

            /*--------------БАЗА на месяц "НОЯБРЬ"---------------*/
        } else if(current_mouth == 11) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"05:19", "06:59", "12:10", "14:39", "17:10", "18:40"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:21", "07:01", "12:10", "14:38", "17:08", "18:38"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:23", "07:03", "12:10", "14:37", "17:07", "18:37"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:24", "07:04", "12:10", "14:35", "17:05", "18:35"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:26", "07:06", "12:10", "14:34", "17:03", "18:33"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:28", "07:08", "12:10", "14:33", "17:02", "18:32"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:29", "07:09", "12:10", "14:31", "17:00", "18:30"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:31", "07:11", "12:10", "14:30", "16:59", "18:29"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:33", "07:13", "12:10", "14:29", "16:57", "18:27"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:34", "07:14", "12:10", "14:28", "16:56", "18:26"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:36", "07:16", "12:10", "14:27", "16:54", "18:24"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:38", "07:18", "12:10", "14:26", "16:53", "18:23"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:39", "07:19", "12:10", "14:25", "16:52", "18:22"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:41", "07:21", "12:10", "14:23", "16:50", "18:20"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:43", "07:23", "12:11", "14:22", "16:49", "18:19"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:44", "07:24", "12:11", "14:21", "16:48", "18:18"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:46", "07:26", "12:11", "14:21", "16:46", "18:16"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:47", "07:27", "12:11", "14:20", "16:45", "18:15"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:49", "07:29", "12:11", "14:19", "16:44", "18:14"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:51", "07:31", "12:12", "14:18", "16:43", "18:13"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:52", "07:32", "12:12", "14:17", "16:42", "18:12"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:54", "07:34", "12:12", "14:16", "16:41", "18:11"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:55", "07:35", "12:12", "14:16", "16:40", "18:10"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:57", "07:37", "12:13", "14:15", "16:39", "18:09"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:58", "07:38", "12:13", "14:14", "16:38", "18:08"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"06:00", "07:40", "12:13", "14:14", "16:37", "18:07"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"06:01", "07:41", "12:14", "14:13", "16:37", "18:07"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"06:02", "07:42", "12:14", "14:13", "16:36", "18:06"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"06:04", "07:44", "12:14", "14:12", "16:35", "18:05"};
            } else {
                list_time_prayer = new String[]{"06:05", "07:45", "12:15", "14:12", "16:35", "18:05"};
            }

            /*--------------БАЗА на месяц "ДЕКАБРЬ"---------------*/
        } else {
            if(current_day < 2) {
                list_time_prayer = new String[]{"06:04", "07:44", "12:15", "14:13", "16:36", "18:06"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"06:05", "07:45", "12:15", "14:13", "16:35", "18:05"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"06:06", "07:46", "12:16", "14:13", "16:35", "18:05"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"06:07", "07:47", "12:16", "14:12", "16:35", "18:05"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"06:09", "07:49", "12:17", "14:12", "16:34", "18:04"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"06:10", "07:50", "12:17", "14:12", "16:34", "18:04"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"06:10", "07:50", "12:17", "14:12", "16:33", "18:03"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"06:12", "07:52", "12:18", "14:12", "16:33", "18:03"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"06:13", "07:53", "12:18", "14:12", "16:33", "18:03"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"06:14", "07:54", "12:19", "14:12", "16:33", "18:03"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"06:15", "07:55", "12:19", "14:12", "16:33", "18:03"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"06:16", "07:56", "12:20", "14:12", "16:33", "18:03"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"06:17", "07:57", "12:20", "14:12", "16:33", "18:03"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"06:18", "07:58", "12:21", "14:12", "16:33", "18:03"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"06:19", "07:59", "12:21", "14:12", "16:33", "18:03"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"06:20", "08:00", "12:22", "14:13", "16:33", "18:03"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"06:20", "08:00", "12:22", "14:13", "16:33", "18:03"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"06:21", "08:01", "12:22", "14:13", "16:34", "18:04"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"06:22", "08:02", "12:23", "14:14", "16:34", "18:04"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"06:22", "08:02", "12:23", "14:14", "16:35", "18:05"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"06:23", "08:03", "12:24", "14:15", "16:35", "18:05"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"06:23", "08:03", "12:24", "14:15", "16:35", "18:05"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"06:24", "08:04", "12:25", "14:16", "16:36", "18:06"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"06:24", "08:04", "12:25", "14:16", "16:37", "18:07"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"06:25", "08:05", "12:26", "14:17", "16:37", "18:07"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"06:25", "08:05", "12:26", "14:18", "16:38", "18:08"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"06:25", "08:05", "12:27", "14:18", "16:39", "18:09"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"06:26", "08:06", "12:27", "14:19", "16:39", "18:09"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"06:26", "08:06", "12:28", "14:20", "16:40", "18:10"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"06:26", "08:06", "12:28", "14:21", "16:41", "18:11"};
            } else {
                list_time_prayer = new String[]{"06:26", "08:06", "12:29", "14:22", "16:42", "18:12"};
            }
        }

        return list_time_prayer;
    }

}
