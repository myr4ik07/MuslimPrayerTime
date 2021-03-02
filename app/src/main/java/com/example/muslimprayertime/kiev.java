package com.example.muslimprayertime;

public class kiev {

    String[] get_time_prayer(Integer current_mouth, Integer current_day) {

        String[] list_time_prayer = new String[]{};

        /*--------------БАЗА на месяц "ЯНВАРЬ"- изменяется автоматически каждый год с учетом "ГРИГОРИАНСКОГО" (СОЛНЕЧНОГО) КАЛЕНДАРЯ--------------*/
        if(current_mouth == 1) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"06:09", "07:49", "12:06", "13:53", "16:14", "17:44"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"06:09", "07:49", "12:07", "13:54", "16:15", "17:45"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"06:09", "07:49", "12:07", "13:55", "16:16", "17:46"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"06:08", "07:48", "12:08", "13:56", "16:17", "17:47"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"06:08", "07:48", "12:08", "13:57", "16:19", "17:49"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"06:08", "07:48", "12:09", "13:58", "16:20", "17:50"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"06:08", "07:48", "12:09", "13:59", "16:21", "17:51"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"06:07", "07:47", "12:10", "14:00", "16:22", "17:52"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"06:07", "07:47", "12:10", "14:01", "16:24", "17:54"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"06:06", "07:46", "12:10", "14:02", "16:25", "17:55"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"06:06", "07:46", "12:11", "14:04", "16:26", "17:56"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"06:05", "07:45", "12:11", "14:05", "16:28", "17:58"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"06:05", "07:45", "12:12", "14:06", "16:29", "17:59"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"06:04", "07:44", "12:12", "14:07", "16:30", "18:00"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"06:03", "07:43", "12:12", "14:08", "16:32", "18:02"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"06:03", "07:43", "12:13", "14:10", "16:33", "18:03"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"06:02", "07:42", "12:13", "14:11", "16:35", "18:05"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"06:01", "07:41", "12:13", "14:12", "16:36", "18:06"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"06:00", "07:40", "12:14", "14:14", "16:38", "18:08"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:59", "07:39", "12:14", "14:15", "16:39", "18:09"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:58", "07:38", "12:14", "14:16", "16:41", "18:11"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:57", "07:37", "12:15", "14:18", "16:43", "18:12"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:56", "07:36", "12:15", "14:19", "16:44", "18:14"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:55", "07:35", "12:15", "14:20", "16:46", "18:16"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:54", "07:34", "12:15", "14:22", "16:47", "18:17"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:52", "07:32", "12:16", "14:23", "16:49", "18:19"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:51", "07:31", "12:16", "14:25", "16:51", "18:21"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:50", "07:30", "12:16", "14:26", "16:52", "18:22"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:49", "07:29", "12:16", "14:27", "16:54", "18:24"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"05:47", "07:27", "12:16", "14:29", "16:56", "18:26"};
            } else {
                list_time_prayer = new String[]{"05:44", "07:24", "12:16", "14:31", "16:59", "18:29"};
            }

            /*--------------БАЗА на месяц "ФЕВРАЛЬ", - "29" день необходимо добавить в ручную, т.к. это высокосный год и бывает раз в 4 года---------*/
        } else if(current_mouth == 2) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"05:45", "07:25", "12:17", "14:32", "16:59", "18:29"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:43", "07:23", "12:17", "14:33", "17:01", "18:31"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:42", "07:22", "12:17", "14:34", "17:03", "18:33"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:40", "07:20", "12:17", "14:36", "17:04", "18:34"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:39", "07:19", "12:17", "14:37", "17:06", "18:36"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:37", "07:17", "12:17", "14:39", "17:08", "18:38"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:35", "07:15", "12:17", "14:40", "17:09", "18:39"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:34", "07:14", "12:17", "14:41", "17:11", "18:41"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:32", "07:12", "12:17", "14:43", "17:13", "18:43"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:30", "07:10", "12:17", "14:44", "17:15", "18:45"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:29", "07:09", "12:17", "14:46", "17:16", "18:46"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:27", "07:07", "12:17", "14:47", "17:18", "18:48"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:25", "07:05", "12:17", "14:48", "17:20", "18:50"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:23", "07:03", "12:17", "14:50", "17:22", "18:52"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:22", "07:02", "12:17", "14:51", "17:23", "18:53"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:20", "07:00", "12:17", "14:52", "17:25", "18:55"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:18", "06:58", "12:17", "14:54", "17:27", "18:57"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:16", "06:56", "12:17", "14:55", "17:28", "18:58"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:14", "06:54", "12:17", "14:56", "17:30", "19:00"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:12", "06:52", "12:17", "14:58", "17:32", "19:02"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:10", "06:50", "12:17", "14:59", "17:34", "19:04"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:08", "06:48", "12:16", "15:00", "17:35", "19:05"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:07", "06:47", "12:16", "15:02", "17:37", "19:07"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:05", "06:45", "12:16", "15:03", "17:39", "19:09"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:03", "06:43", "12:16", "15:04", "17:40", "19:10"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:01", "06:41", "12:16", "15:05", "17:42", "19:12"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:58", "06:38", "12:16", "15:06", "17:44", "19:14"};

                /*------------------Разкоментировать эту строку указанную ниже, если наступил высокосный год, т.е. 29 Февраля 2016 года-------*/
			/*} else if(current_day > 27 && current_day < 29) {
				list_time_prayer = new String[]{"04:58", "06:38", "12:16", "15:06", "17:44", "19:14"};*/
            } else {
                list_time_prayer = new String[]{"04:56", "06:36", "12:16", "15:08", "17:45", "19:15"};
            }

            /*--------------БАЗА на месяц "МАРТ"---------------*/
        } else if(current_mouth == 3) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:54", "06:34", "12:15", "15:09", "17:47", "19:17"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:52", "06:32", "12:15", "15:10", "17:49", "19:19"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:50", "06:30", "12:15", "15:11", "17:50", "19:20"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:48", "06:28", "12:15", "15:12", "17:52", "19:22"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:46", "06:26", "12:15", "15:14", "17:54", "19:24"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:44", "06:24", "12:14", "15:15", "17:55", "19:25"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:42", "06:22", "12:14", "15:16", "17:57", "19:27"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:40", "06:20", "12:14", "15:17", "17:59", "19:29"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:38", "06:18", "12:14", "15:18", "18:00", "19:30"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:35", "06:15", "12:13", "15:19", "18:02", "19:32"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:33", "06:13", "12:13", "15:20", "18:04", "19:34"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:31", "06:11", "12:13", "15:21", "18:05", "19:35"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:29", "06:09", "12:12", "15:22", "18:07", "19:37"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:27", "06:07", "12:12", "15:23", "18:09", "19:39"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:25", "06:05", "12:12", "15:24", "18:10", "19:40"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:22", "06:02", "12:12", "15:26", "18:12", "19:42"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:20", "06:00", "12:11", "15:27", "18:14", "19:44"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:18", "05:58", "12:11", "15:28", "18:15", "19:45"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:16", "05:56", "12:11", "15:29", "18:17", "19:47"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:14", "05:54", "12:10", "15:30", "18:18", "19:48"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:11", "05:51", "12:10", "15:30", "18:20", "19:50"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:09", "05:49", "12:10", "15:31", "18:22", "19:52"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:07", "05:47", "12:10", "15:32", "18:23", "19:53"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:05", "05:45", "12:09", "15:33", "18:25", "19:55"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:02", "05:42", "12:09", "15:34", "18:27", "19:57"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:00", "05:40", "12:09", "15:35", "18:28", "19:58"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:58", "05:38", "12:08", "15:36", "18:30", "20:00"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:56", "05:36", "12:08", "15:37", "18:31", "20:01"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:54", "06:34", "13:08", "16:38", "19:33", "21:03"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"04:51", "06:31", "13:07", "16:39", "19:35", "21:05"};
            } else {
                list_time_prayer = new String[]{"04:49", "06:29", "13:07", "16:39", "19:36", "21:06"};/* Перевод часов на (1 час вперед) в последнее воскресенье этого месяца, т.е. с последней (субботы на воскресенье) (31.03.2019 г.) */
            }
            /*--------------БАЗА на месяц "АПРЕЛЬ"---------------*/
        } else if(current_mouth == 4) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:47", "06:27", "13:07", "16:40", "19:38", "21:08"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:45", "06:25", "13:07", "16:41", "19:39", "21:09"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:43", "06:23", "13:06", "16:42", "19:41", "21:11"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:40", "06:20", "13:06", "16:43", "19:43", "21:13"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:38", "06:18", "13:06", "16:44", "19:44", "21:14"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:36", "06:16", "13:05", "16:44", "19:46", "21:16"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:34", "06:14", "13:05", "16:45", "19:48", "21:18"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:32", "06:12", "13:05", "16:46", "19:49", "21:19"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:29", "06:09", "13:05", "16:47", "19:51", "21:21"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:27", "06:07", "13:04", "16:48", "19:52", "21:22"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:25", "06:05", "13:04", "16:48", "19:54", "21:24"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:23", "06:03", "13:04", "16:49", "19:56", "21:26"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:21", "06:01", "13:04", "16:50", "19:57", "21:27"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:19", "05:59", "13:03", "16:51", "19:59", "21:29"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:17", "05:57", "13:03", "16:51", "20:01", "21:31"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:15", "05:55", "13:03", "16:52", "20:02", "21:32"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:12", "05:52", "13:03", "16:53", "20:04", "21:34"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:10", "05:50", "13:02", "16:53", "20:05", "21:35"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:08", "05:48", "13:02", "16:54", "20:07", "21:37"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:06", "05:46", "13:02", "16:55", "20:09", "21:39"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:04", "05:44", "13:02", "16:55", "20:10", "21:40"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:02", "05:42", "13:01", "16:56", "20:12", "21:42"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:00", "05:40", "13:01", "16:57", "20:13", "21:43"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:58", "05:38", "13:01", "16:57", "20:15", "21:45"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:56", "05:36", "13:01", "16:58", "20:17", "21:47"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:54", "05:34", "13:01", "16:59", "20:18", "21:48"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:52", "05:32", "13:01", "16:59", "20:20", "21:50"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:50", "05:30", "13:00", "17:00", "20:22", "21:52"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"03:48", "05:28", "13:00", "17:01", "20:23", "21:53"};
            } else {
                list_time_prayer = new String[]{"03:47", "05:27", "13:00", "17:01", "20:25", "21:55"};
            }

            /*--------------БАЗА на месяц "МАЙ"---------------*/
        } else if(current_mouth == 5) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"03:45", "05:25", "13:00", "17:02", "20:26", "21:56"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"03:43", "05:23", "13:00", "17:02", "20:28", "21:58"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"03:41", "05:21", "13:00", "17:03", "20:30", "22:00"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"03:39", "05:19", "13:00", "17:04", "20:31", "22:01"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"03:38", "05:18", "13:00", "17:04", "20:33", "22:03"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"03:36", "05:16", "13:00", "17:05", "20:34", "22:04"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"03:34", "05:14", "12:59", "17:06", "20:36", "22:06"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"03:32", "05:12", "12:59", "17:06", "20:37", "22:07"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"03:31", "05:11", "12:59", "17:07", "20:39", "22:09"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"03:29", "05:09", "12:59", "17:07", "20:41", "22:11"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"03:27", "05:07", "12:59", "17:08", "20:42", "22:12"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"03:26", "05:06", "12:59", "17:08", "20:44", "22:14"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:24", "05:04", "12:59", "17:09", "20:45", "22:15"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:23", "05:03", "12:59", "17:10", "20:47", "22:17"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:21", "05:01", "12:59", "17:10", "20:48", "22:18"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:20", "05:00", "12:59", "17:11", "20:50", "22:20"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:18", "04:58", "12:59", "17:11", "20:51", "22:21"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:17", "04:57", "12:59", "17:12", "20:53", "22:23"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:16", "04:56", "12:59", "17:12", "20:54", "22:24"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:14", "04:54", "12:59", "17:13", "20:55", "22:25"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:13", "04:53", "12:59", "17:13", "20:57", "22:27"};
            } else if(current_day > 21 && current_day < 23)  {
                list_time_prayer = new String[]{"03:12", "04:52", "13:00", "17:14", "20:58", "22:30"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:11", "04:51", "13:00", "17:14", "20:59", "22:33"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:10", "04:50", "13:00", "17:14", "21:01", "22:35"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:08", "04:48", "13:00", "17:15", "21:02", "22:36"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:07", "04:47", "13:00", "17:16", "21:03", "22:38"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:06", "04:46", "13:00", "17:16", "21:05", "22:41"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:05", "04:45", "13:00", "17:17", "21:06", "22:43"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"03:04", "04:44", "13:00", "17:17", "21:07", "22:45"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"03:03", "04:43", "13:00", "17:18", "21:08", "22:47"};
            } else {
                list_time_prayer = new String[]{"03:03", "04:43", "13:01", "17:18", "21:09", "22:49"};
            }

            /*--------------БАЗА на месяц "ИЮНЬ"---------------*/
        } else if(current_mouth == 6) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"03:02", "04:42", "13:01", "17:19", "21:10", "22:50"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"03:01", "04:41", "13:01", "17:19", "21:11", "22:51"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"03:00", "04:40", "13:01", "17:20", "21:12", "22:52"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"03:00", "04:40", "13:01", "17:20", "21:13", "22:53"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"02:59", "04:39", "13:01", "17:20", "21:14", "22:54"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"02:58", "04:38", "13:02", "17:22", "21:15", "22:55"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"02:58", "04:38", "13:02", "17:22", "21:16", "22:56"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"02:57", "04:37", "13:02", "17:22", "21:17", "22:57"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"02:57", "04:37", "13:02", "17:22", "21:18", "22:58"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"02:56", "04:36", "13:02", "17:22", "21:19", "22:59"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"02:56", "04:36", "13:03", "17:23", "21:19", "22:59"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"02:56", "04:36", "13:03", "17:23", "21:20", "23:00"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"02:56", "04:36", "13:03", "17:23", "21:21", "23:01"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"02:55", "04:35", "13:03", "17:23", "21:21", "23:01"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"02:55", "04:35", "13:03", "17:24", "21:22", "23:02"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"02:55", "04:35", "13:04", "17:24", "21:22", "23:02"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"02:55", "04:35", "13:04", "17:24", "21:23", "23:03"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"02:55", "04:35", "13:04", "17:25", "21:23", "23:03"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"02:55", "04:35", "13:04", "17:25", "21:23", "23:03"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"02:55", "04:35", "13:04", "17:25", "21:24", "23:04"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"02:56", "04:36", "13:04", "17:25", "21:24", "23:04"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"02:56", "04:36", "13:05", "17:25", "21:24", "23:04"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"02:56", "04:36", "13:05", "17:26", "21:24", "23:04"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"02:56", "04:36", "13:05", "17:26", "21:24", "23:04"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"02:57", "04:37", "13:05", "17:26", "21:24", "23:04"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"02:57", "04:37", "13:06", "17:26", "21:24", "23:04"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"02:58", "04:38", "13:06", "17:26", "21:24", "23:04"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"02:58", "04:38", "13:06", "17:26", "21:24", "23:04"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"02:59", "04:39", "13:06", "17:26", "21:24", "23:04"};
            } else {
                list_time_prayer = new String[]{"02:59", "04:39", "13:07", "17:26", "21:24", "23:04"};
            }

            /*--------------БАЗА на месяц "ИЮЛЬ"---------------*/
        } else if(current_mouth == 7) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"03:00", "04:40", "13:07", "17:27", "21:23", "23:03"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"03:00", "04:40", "13:07", "17:27", "21:23", "23:03"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"03:01", "04:41", "13:07", "17:27", "21:23", "23:03"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"03:02", "04:42", "13:07", "17:27", "21:22", "23:02"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"03:03", "04:43", "13:07", "17:27", "21:22", "23:02"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"03:04", "04:44", "13:08", "17:26", "21:21", "23:01"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"03:04", "04:44", "13:08", "17:26", "21:21", "23:01"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"03:05", "04:45", "13:08", "17:26", "21:20", "23:00"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"03:06", "04:46", "13:08", "17:26", "21:19", "22:59"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"03:07", "04:47", "13:08", "17:26", "21:19", "22:59"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"03:08", "04:48", "13:08", "17:26", "21:18", "22:58"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"03:09", "04:49", "13:09", "17:26", "21:17", "22:57"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:11", "04:51", "13:09", "17:26", "21:16", "22:56"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:12", "04:52", "13:09", "17:25", "21:15", "22:55"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:13", "04:53", "13:09", "17:25", "21:14", "22:54"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:14", "04:54", "13:09", "17:25", "21:13", "22:53"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:15", "04:55", "13:09", "17:25", "21:12", "22:52"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:16", "04:56", "13:09", "17:25", "21:11", "22:51"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:18", "04:58", "13:09", "17:24", "21:10", "22:50"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:19", "04:59", "13:09", "17:23", "21:09", "22:49"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:20", "05:00", "13:09", "17:23", "21:08", "22:48"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"03:21", "05:01", "13:09", "17:23", "21:06", "22:46"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:23", "05:03", "13:09", "17:22", "21:05", "22:45"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:24", "05:04", "13:09", "17:22", "21:04", "22:44"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:25", "05:05", "13:09", "17:21", "21:02", "22:42"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:27", "05:07", "13:09", "17:21", "21:01", "22:41"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:28", "05:08", "13:09", "17:20", "21:00", "22:40"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:30", "05:10", "13:09", "17:20", "20:58", "22:38"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"03:31", "05:11", "13:09", "17:19", "20:57", "22:37"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"03:33", "05:13", "13:09", "17:19", "20:55", "22:35"};
            } else {
                list_time_prayer = new String[]{"03:34", "05:14", "13:09", "17:18", "20:54", "22:34"};
            }

            /*--------------БАЗА на месяц "АВГУСТ"---------------*/
        } else if(current_mouth == 8) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"03:35", "05:15", "13:09", "17:17", "20:52", "22:32"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"03:37", "05:17", "13:09", "17:17", "20:50", "22:30"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"03:38", "05:18", "13:09", "17:16", "20:49", "22:29"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"03:40", "05:20", "13:09", "17:15", "20:47", "22:27"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"03:41", "05:21", "13:09", "17:14", "20:45", "22:25"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"03:43", "05:23", "13:09", "17:14", "20:44", "22:24"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"03:44", "05:24", "13:09", "17:13", "20:42", "22:22"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"03:46", "05:26", "13:09", "17:12", "20:40", "22:20"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"03:48", "05:28", "13:08", "17:11", "20:38", "22:18"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"03:49", "05:29", "13:08", "17:10", "20:37", "22:17"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"03:51", "05:31", "13:08", "17:10", "20:35", "22:15"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"03:52", "05:32", "13:08", "17:09", "20:33", "22:13"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:54", "05:34", "13:08", "17:08", "20:31", "22:11"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:55", "05:35", "13:08", "17:07", "20:29", "22:09"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:57", "05:37", "13:07", "17:06", "20:27", "22:07"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:58", "05:38", "13:07", "17:05", "20:25", "22:05"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:01", "05:41", "13:07", "17:05", "20:24", "22:04"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:01", "05:41", "13:07", "17:03", "20:21", "22:01"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:03", "05:43", "13:07", "17:02", "20:19", "21:59"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:04", "05:44", "13:06", "17:00", "20:17", "21:57"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:06", "05:46", "13:06", "16:59", "20:15", "21:55"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:08", "05:48", "13:06", "16:58", "20:13", "21:53"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:09", "05:49", "13:06", "16:57", "20:11", "21:51"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:11", "05:51", "13:05", "16:56", "20:09", "21:49"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:12", "05:52", "13:05", "16:55", "20:07", "21:47"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:14", "05:54", "13:05", "16:53", "20:05", "21:45"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:15", "05:55", "13:04", "16:52", "20:03", "21:43"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"04:17", "05:57", "13:04", "16:51", "20:00", "21:40"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:18", "05:58", "13:04", "16:50", "19:58", "21:38"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"04:20", "06:00", "13:04", "16:48", "19:56", "21:36"};
            } else {
                list_time_prayer = new String[]{"04:22", "06:02", "13:03", "16:47", "19:54", "21:34"};
            }

            /*--------------БАЗА на месяц "СЕНТЯБРЬ"---------------*/
        } else if(current_mouth == 9) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:23", "06:03", "13:03", "16:46", "19:52", "21:32"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:25", "06:05", "13:03", "16:44", "19:50", "21:29"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:26", "06:06", "13:02", "16:43", "19:47", "21:25"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:28", "06:08", "13:02", "16:42", "19:45", "21:22"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:29", "06:09", "13:02", "16:40", "19:43", "21:19"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:31", "06:11", "13:01", "16:39", "19:41", "21:16"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:32", "06:12", "13:01", "16:37", "19:39", "21:13"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:34", "06:14", "13:01", "16:36", "19:36", "21:09"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:35", "06:15", "13:00", "16:35", "19:34", "21:06"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:37", "06:17", "13:00", "16:33", "19:32", "21:04"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:38", "06:18", "13:00", "16:32", "19:30", "21:00"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:40", "06:20", "12:59", "16:30", "19:28", "20:58"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:42", "06:22", "12:59", "16:29", "19:25", "20:55"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:43", "06:23", "12:58", "16:27", "19:23", "20:53"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:45", "06:25", "12:58", "16:26", "19:21", "20:51"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:46", "06:26", "12:58", "16:24", "19:19", "20:49"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:48", "06:28", "12:58", "16:23", "19:16", "20:46"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:49", "06:29", "12:57", "16:21", "19:14", "20:44"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:51", "06:31", "12:57", "16:19", "19:12", "20:42"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:52", "06:32", "12:56", "16:18", "19:10", "20:40"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:54", "06:34", "12:56", "16:16", "19:07", "20:37"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:55", "06:35", "12:56", "16:15", "19:05", "20:35"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:57", "06:37", "12:55", "16:13", "19:03", "20:33"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:57", "06:37", "12:55", "16:13", "19:01", "20:31"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:58", "06:38", "12:55", "16:10", "18:59", "20:29"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:01", "06:41", "12:54", "16:08", "18:56", "20:26"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:03", "06:43", "12:54", "16:07", "18:54", "20:24"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:05", "06:45", "12:54", "16:05", "18:52", "20:22"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:06", "06:46", "12:53", "16:03", "18:50", "20:20"};
            } else {
                list_time_prayer = new String[]{"05:08", "06:48", "12:53", "16:02", "18:47", "20:17"};
            }

            /*--------------БАЗА на месяц "ОКТЯБРЬ"---------------*/
        } else if(current_mouth == 10) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"05:09", "06:49", "12:53", "16:00", "18:45", "20:15"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:11", "06:51", "12:52", "15:58", "18:43", "20:13"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:12", "06:52", "12:52", "15:57", "18:41", "20:11"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:14", "06:54", "12:52", "15:55", "18:39", "20:09"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:16", "06:56", "12:51", "15:53", "18:36", "20:06"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:17", "06:57", "12:51", "15:52", "18:34", "20:04"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:19", "06:59", "12:51", "15:50", "18:32", "20:02"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:20", "07:00", "12:51", "15:48", "18:30", "20:00"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:22", "07:02", "12:50", "15:47", "18:28", "19:58"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:23", "07:03", "12:50", "15:45", "18:26", "19:56"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:25", "07:05", "12:50", "15:44", "18:24", "19:54"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:27", "07:07", "12:49", "15:42", "18:21", "19:51"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:28", "07:08", "12:49", "15:40", "18:19", "19:49"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:30", "07:10", "12:49", "15:39", "18:17", "19:47"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:31", "07:11", "12:49", "15:37", "18:15", "19:45"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:33", "07:13", "12:49", "15:35", "18:13", "19:43"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:35", "07:15", "12:48", "15:34", "18:11", "19:41"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:36", "07:16", "12:48", "15:32", "18:09", "19:39"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:38", "07:18", "12:48", "15:31", "18:07", "19:37"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:40", "07:20", "12:48", "15:29", "18:05", "19:35"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:41", "07:21", "12:48", "15:28", "18:03", "19:33"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:43", "07:23", "12:47", "15:26", "18:01", "19:31"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:44", "07:24", "12:47", "15:24", "17:59", "19:29"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:46", "07:26", "12:47", "15:23", "17:57", "19:27"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:48", "06:28", "11:47", "14:21", "16:56", "18:26"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:49", "06:29", "11:47", "14:20", "16:54", "18:24"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:51", "06:31", "11:47", "14:18", "16:52", "18:22"};/* Перевод часов на (1 час назад) последней субботы начиная с воскресенья (27.10.2019 г.) этого месяца*/
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"04:53", "06:33", "11:47", "14:17", "16:50", "18:20"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:54", "06:34", "11:47", "14:16", "16:48", "18:18"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"04:56", "06:36", "11:47", "14:14", "16:46", "18:16"};
            } else {
                list_time_prayer = new String[]{"04:58", "06:38", "11:47", "14:13", "16:45", "18:15"};
            }

            /*--------------БАЗА на месяц "НОЯБРЬ"---------------*/
        } else if(current_mouth == 11) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:59", "06:39", "11:47", "14:11", "16:43", "18:13"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:01", "06:41", "11:47", "14:13", "16:41", "18:11"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:03", "06:43", "11:47", "14:09", "16:40", "18:10"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:04", "06:44", "11:47", "14:07", "16:38", "18:08"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:06", "06:46", "11:47", "14:06", "16:36", "18:06"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:08", "06:48", "11:47", "14:05", "16:35", "18:05"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:09", "06:49", "11:47", "14:03", "16:33", "18:03"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:11", "06:51", "11:47", "14:02", "16:32", "18:02"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:13", "06:53", "11:47", "14:01", "16:30", "18:00"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:14", "06:54", "11:47", "14:00", "16:29", "17:59"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:16", "06:56", "11:47", "13:59", "16:27", "17:57"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:18", "06:58", "11:47", "13:58", "16:26", "17:56"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:19", "06:59", "11:47", "13:57", "16:25", "17:55"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:21", "07:01", "11:47", "13:55", "16:23", "17:53"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:23", "07:03", "11:48", "13:54", "16:22", "17:52"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:24", "07:04", "11:48", "13:53", "16:21", "17:51"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:26", "07:06", "11:48", "13:53", "16:19", "17:49"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:27", "07:07", "11:48", "13:52", "16:18", "17:48"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:29", "07:09", "11:48", "13:51", "16:17", "17:47"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:31", "07:11", "11:49", "13:50", "16:16", "17:46"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:32", "07:12", "11:49", "13:49", "16:15", "17:45"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:34", "07:14", "11:49", "13:48", "16:14", "17:44"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:35", "07:15", "11:49", "13:48", "16:13", "17:43"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:37", "07:17", "11:50", "13:47", "16:12", "17:42"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:38", "07:18", "11:50", "13:46", "16:11", "17:41"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:40", "07:20", "11:50", "13:46", "16:10", "17:40"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:41", "07:21", "11:51", "13:45", "16:10", "17:40"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:42", "07:22", "11:51", "13:45", "16:09", "17:39"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:44", "07:24", "11:51", "13:44", "16:08", "17:38"};
            } else {
                list_time_prayer = new String[]{"05:45", "07:25", "11:52", "13:44", "16:08", "17:38"};
            }

            /*--------------БАЗА на месяц "ДЕКАБРЬ"---------------*/
        } else {
            if(current_day < 2) {
                list_time_prayer = new String[]{"05:47", "07:27", "11:52", "13:43", "16:07", "17:37"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:48", "07:28", "11:52", "13:43", "16:06", "17:36"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:49", "07:29", "11:53", "13:43", "16:06", "17:36"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:50", "07:30", "11:53", "13:42", "16:06", "17:36"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:52", "07:32", "11:54", "13:42", "16:05", "17:35"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:53", "07:33", "11:54", "13:42", "16:05", "17:35"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:54", "07:34", "11:54", "13:42", "16:04", "17:34"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:55", "07:35", "11:55", "13:42", "16:04", "17:34"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:56", "07:36", "11:55", "13:42", "16:04", "17:34"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:57", "07:37", "11:56", "13:42", "16:04", "17:34"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:58", "07:38", "11:56", "13:42", "16:04", "17:34"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:59", "07:39", "11:57", "13:42", "16:04", "17:34"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"06:00", "07:40", "11:57", "13:42", "16:04", "17:34"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"06:01", "07:41", "11:58", "13:42", "16:04", "17:34"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"06:02", "07:42", "11:58", "13:42", "16:04", "17:34"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"06:03", "07:43", "11:59", "13:43", "16:04", "17:34"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"06:03", "07:43", "11:59", "13:43", "16:04", "17:34"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"06:04", "07:44", "11:59", "13:43", "16:05", "17:35"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"06:05", "07:45", "12:00", "13:44", "16:05", "17:35"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"06:05", "07:45", "12:00", "13:44", "16:06", "17:36"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"06:06", "07:46", "12:01", "13:45", "16:06", "17:36"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"06:06", "07:46", "12:01", "13:45", "16:06", "17:36"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"06:07", "07:47", "12:02", "13:46", "16:07", "17:37"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"06:07", "07:47", "12:02", "13:46", "16:08", "17:38"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"06:08", "07:48", "12:03", "13:47", "16:08", "17:38"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"06:08", "07:48", "12:03", "13:48", "16:09", "17:39"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"06:08", "07:48", "12:04", "13:48", "16:10", "17:40"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"06:09", "07:49", "12:04", "13:49", "16:10", "17:40"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"06:09", "07:49", "12:05", "13:50", "16:11", "17:41"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"06:09", "07:49", "12:05", "13:51", "16:12", "17:42"};
            } else {
                list_time_prayer = new String[]{"06:09", "07:49", "12:06", "13:52", "16:13", "17:43"};
            }
        }

        return list_time_prayer;
    }

}
