package com.example.muslimprayertime;

public class odessa {

    String[] get_time_prayer(Integer current_mouth, Integer current_day) {

        String[] list_time_prayer = new String[]{};

        /*--------------БАЗА на месяц "ЯНВАРЬ"- изменяется автоматически каждый год с учетом "ГРИГОРИАНСКОГО" (СОЛНЕЧНОГО) КАЛЕНДАРЯ--------------*/
        if(current_mouth == 1) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"05:52", "07:32", "12:06", "14:08", "16:29", "17:59"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:52", "07:32", "12:06", "14:09", "16:30", "18:00"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:52", "07:32", "12:07", "14:10", "16:31", "18:01"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:52", "07:32", "12:07", "14:11", "16:32", "18:02"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:52", "07:32", "12:07", "14:12", "16:33", "18:03"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:52", "07:32", "12:08", "14:13", "16:34", "18:04"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:52", "07:32", "12:08", "14:14", "16:35", "18:05"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:51", "07:31", "12:09", "14:15", "16:36", "18:06"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:51", "07:31", "12:09", "14:16", "16:38", "18:08"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:51", "07:31", "12:10", "14:17", "16:39", "18:09"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:50", "07:30", "12:10", "14:18", "16:40", "18:10"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:50", "07:30", "12:10", "14:19", "16:41", "18:11"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:49", "07:29", "12:11", "14:20", "16:42", "18:12"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:49", "07:29", "12:11", "14:21", "16:44", "18:14"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:48", "07:28", "12:11", "14:22", "16:45", "18:15"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:48", "07:28", "12:12", "14:23", "16:46", "18:16"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:47", "07:27", "12:12", "14:25", "16:48", "18:18"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:47", "07:27", "12:13", "14:26", "16:49", "18:19"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:46", "07:26", "12:13", "14:27", "16:50", "18:20"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:45", "07:25", "12:13", "14:28", "16:52", "18:22"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:44", "07:24", "12:13", "14:29", "16:53", "18:23"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:43", "07:23", "12:14", "14:31", "16:54", "18:24"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:43", "07:23", "12:14", "14:32", "16:56", "18:26"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:42", "07:22", "12:14", "14:33", "16:57", "18:27"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:41", "07:21", "12:14", "14:34", "16:59", "18:29"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:40", "07:20", "12:15", "14:36", "17:00", "18:30"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:39", "07:19", "12:15", "14:37", "17:01", "18:31"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:38", "07:18", "12:15", "14:38", "17:03", "18:33"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:37", "07:17", "12:15", "14:39", "17:04", "18:34"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"05:35", "07:15", "12:15", "14:41", "17:06", "18:36"};
            } else {
                list_time_prayer = new String[]{"05:33", "07:13", "12:16", "14:43", "17:09", "18:39"};
            }

            /*--------------БАЗА на месяц "ФЕВРАЛЬ", - "29" день необходимо добавить в ручную, т.к. это высокосный год и бывает раз в 4 года---------*/
        } else if(current_mouth == 2) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"05:33", "07:13", "12:16", "14:43", "17:09", "18:39"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:32", "07:12", "12:16", "14:44", "17:10", "18:40"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:31", "07:11", "12:16", "14:45", "17:12", "18:42"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:29", "07:09", "12:16", "14:47", "17:13", "18:43"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:28", "07:08", "12:16", "14:48", "17:15", "18:45"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:27", "07:07", "12:16", "14:49", "17:16", "18:46"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:25", "07:05", "12:16", "14:50", "17:18", "18:48"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:24", "07:04", "12:16", "14:52", "17:19", "18:49"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:23", "07:03", "12:16", "14:53", "17:21", "18:51"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:21", "07:01", "12:16", "14:54", "17:22", "18:52"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:20", "07:00", "12:16", "14:55", "17:24", "18:54"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:18", "06:58", "12:16", "14:56", "17:25", "18:55"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:17", "06:57", "12:16", "14:58", "17:27", "18:57"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:15", "06:55", "12:16", "14:59", "17:28", "18:58"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:13", "06:53", "12:16", "15:00", "17:30", "19:00"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:12", "06:52", "12:16", "15:01", "17:31", "19:01"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:10", "06:50", "12:16", "15:02", "17:33", "19:03"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:09", "06:49", "12:16", "15:03", "17:34", "19:04"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:07", "06:47", "12:16", "15:04", "17:36", "19:06"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:05", "06:45", "12:16", "15:06", "17:37", "19:07"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:04", "06:44", "12:16", "15:07", "17:38", "19:08"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:02", "06:42", "12:16", "15:08", "17:40", "19:10"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:00", "06:40", "12:15", "15:09", "17:41", "19:11"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:59", "06:39", "12:15", "15:10", "17:43", "19:13"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:57", "06:37", "12:15", "15:11", "17:44", "19:14"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:55", "06:35", "12:15", "15:12", "17:46", "19:16"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:53", "06:33", "12:15", "15:13", "17:47", "19:17"};

                /*------------------Разкоментировать эту строку указанную ниже, если наступил высокосный год, т.е. 29 Февраля 2016 года-------*/
			/*} else if(current_day > 27 && current_day < 29) {
				list_time_prayer = new String[]{"04:58", "06:38", "12:16", "15:06", "17:44", "19:14"};*/
            } else {
                list_time_prayer = new String[]{"04:51", "06:31", "12:15", "15:14", "17:49", "19:19"};
            }

            /*--------------БАЗА на месяц "МАРТ"---------------*/
        } else if(current_mouth == 3) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:50", "06:30", "12:14", "15:15", "17:50", "19:20"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:48", "06:28", "12:14", "15:16", "17:51", "19:21"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:46", "06:26", "12:14", "15:17", "17:53", "19:23"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:44", "06:24", "12:14", "15:18", "17:54", "19:24"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:42", "06:22", "12:14", "15:19", "17:56", "19:26"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:40", "06:20", "12:13", "15:20", "17:57", "19:27"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:39", "06:19", "12:13", "15:21", "17:59", "19:29"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:37", "06:17", "12:13", "15:22", "18:00", "19:30"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:35", "06:15", "12:13", "15:23", "18:01", "19:31"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:33", "06:13", "12:12", "15:24", "18:03", "19:33"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:31", "06:11", "12:12", "15:25", "18:04", "19:34"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:29", "06:09", "12:12", "15:25", "18:06", "19:36"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:27", "06:07", "12:12", "15:26", "18:07", "19:37"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:25", "06:05", "12:11", "15:27", "18:08", "19:38"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:23", "06:03", "12:11", "15:28", "18:10", "19:40"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:21", "06:01", "12:11", "15:29", "18:11", "19:41"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:19", "05:59", "12:11", "15:30", "18:13", "19:43"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:17", "05:57", "12:10", "15:30", "18:14", "19:44"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:15", "05:55", "12:10", "15:31", "18:15", "19:45"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:13", "05:53", "12:10", "15:32", "18:16", "19:46"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:12", "05:52", "12:09", "15:33", "18:18", "19:48"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:10", "05:50", "12:09", "15:34", "18:19", "19:49"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:08", "05:48", "12:09", "15:34", "18:21", "19:51"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:06", "05:46", "12:08", "15:35", "18:22", "19:52"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:04", "05:44", "12:08", "15:36", "18:23", "19:53"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:02", "05:42", "12:08", "15:36", "18:25", "19:55"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:00", "05:40", "12:08", "15:37", "18:26", "19:56"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:58", "05:38", "12:07", "15:38", "18:28", "19:58"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:56", "06:36", "13:07", "16:39", "19:29", "20:59"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"04:54", "06:34", "13:07", "16:39", "19:30", "21:00"};
            } else {
                list_time_prayer = new String[]{"04:52", "06:32", "13:06", "16:40", "19:32", "21:02"};/* Перевод часов на (1 час вперед) в последнее воскресенье этого месяца, т.е. с последней (субботы на воскресенье) (31.03.2019 г.) */
            }
            /*--------------БАЗА на месяц "АПРЕЛЬ"---------------*/
        } else if(current_mouth == 4) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:50", "06:30", "13:06", "16:41", "19:33", "21:03"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:48", "06:28", "13:06", "16:41", "19:34", "21:04"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:46", "06:26", "13:05", "16:42", "19:36", "21:06"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:44", "06:24", "13:05", "16:42", "19:37", "21:07"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:42", "06:22", "13:05", "16:43", "19:38", "21:08"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:40", "06:20", "13:05", "16:44", "19:40", "21:10"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:38", "06:18", "13:04", "16:44", "19:41", "21:11"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:36", "06:16", "13:04", "16:45", "19:43", "21:13"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:34", "06:14", "13:04", "16:46", "19:44", "21:14"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:33", "06:13", "13:03", "16:46", "19:45", "21:15"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:31", "06:11", "13:03", "16:47", "19:47", "21:17"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:29", "06:09", "13:03", "16:47", "19:48", "21:18"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:27", "06:07", "13:03", "16:48", "19:49", "21:19"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:25", "06:05", "13:02", "16:48", "19:51", "21:21"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:23", "06:03", "13:02", "16:49", "19:52", "21:22"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:21", "06:01", "13:02", "16:49", "19:53", "21:23"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:20", "06:00", "13:02", "16:50", "19:55", "21:25"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:18", "05:58", "13:01", "16:51", "19:56", "21:26"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:16", "05:56", "13:01", "16:51", "19:58", "21:28"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:14", "05:54", "13:01", "16:52", "19:59", "21:29"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:12", "05:52", "13:01", "16:52", "20:00", "21:30"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:11", "05:51", "13:01", "16:53", "20:02", "21:32"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:09", "05:49", "13:00", "16:53", "20:03", "21:33"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:07", "05:47", "13:00", "16:54", "20:04", "21:34"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:05", "05:45", "13:00", "16:54", "20:06", "21:36"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:04", "05:44", "13:00", "16:55", "20:07", "21:37"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:02", "05:42", "13:00", "16:55", "20:08", "21:38"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"04:00", "05:40", "13:00", "16:56", "20:10", "21:40"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"03:59", "05:39", "12:59", "16:56", "20:11", "21:41"};
            } else {
                list_time_prayer = new String[]{"03:57", "05:37", "12:59", "16:57", "20:12", "21:42"};
            }

            /*--------------БАЗА на месяц "МАЙ"---------------*/
        } else if(current_mouth == 5) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"03:55", "05:35", "12:59", "16:57", "20:14", "21:44"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"03:54", "05:34", "12:59", "16:57", "20:15", "21:45"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"03:52", "05:32", "12:59", "16:58", "20:17", "21:47"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"03:51", "05:31", "12:59", "16:58", "20:18", "21:48"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"03:49", "05:29", "12:59", "16:59", "20:19", "21:49"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"03:48", "05:28", "12:59", "16:59", "20:21", "21:51"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"03:46", "05:26", "12:59", "17:00", "20:22", "21:52"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"03:45", "05:25", "12:59", "17:00", "20:23", "21:53"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"03:43", "05:23", "12:58", "17:01", "20:24", "21:54"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"03:42", "05:22", "12:58", "17:01", "20:26", "21:56"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"03:41", "05:21", "12:58", "17:02", "20:27", "21:57"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"03:39", "05:19", "12:58", "17:02", "20:28", "21:58"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:38", "05:18", "12:58", "17:02", "20:30", "22:00"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:37", "05:17", "12:58", "17:03", "20:31", "22:01"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:35", "05:15", "12:58", "17:03", "20:32", "22:02"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:34", "05:14", "12:58", "17:04", "20:33", "22:03"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:33", "05:13", "12:58", "17:04", "20:35", "22:05"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:32", "05:12", "12:58", "17:05", "20:36", "22:06"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:31", "05:11", "12:59", "17:05", "20:37", "22:07"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:30", "05:10", "12:59", "17:05", "20:38", "22:08"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:29", "05:09", "12:59", "17:06", "20:39", "22:09"};
            } else if(current_day > 21 && current_day < 23)  {
                list_time_prayer = new String[]{"03:28", "05:08", "12:59", "17:06", "20:41", "22:12"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:27", "05:07", "12:59", "17:07", "20:42", "22:14"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:26", "05:06", "12:59", "17:07", "20:43", "22:16"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:25", "05:05", "12:59", "17:07", "20:44", "22:18"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:24", "05:04", "12:59", "17:08", "20:45", "22:20"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:23", "05:03", "12:59", "17:08", "20:46", "22:22"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:22", "05:02", "12:59", "17:09", "20:47", "22:24"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"03:21", "05:01", "12:59", "17:09", "20:48", "22:26"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"03:21", "05:01", "13:00", "17:09", "20:49", "22:28"};
            } else {
                list_time_prayer = new String[]{"03:20", "05:00", "13:00", "17:10", "20:50", "22:30"};
            }

            /*--------------БАЗА на месяц "ИЮНЬ"---------------*/
        } else if(current_mouth == 6) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"03:19", "04:59", "13:00", "17:10", "20:51", "22:31"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"03:19", "04:59", "13:00", "17:11", "20:52", "22:32"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"03:18", "04:58", "13:00", "17:11", "20:53", "22:33"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"03:18", "04:58", "13:00", "17:11", "20:54", "22:34"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"03:17", "04:57", "13:00", "17:12", "20:54", "22:34"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"03:17", "04:57", "13:01", "17:12", "20:55", "22:35"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"03:16", "04:56", "13:01", "17:12", "20:56", "22:36"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"03:16", "04:56", "13:01", "17:13", "20:57", "22:37"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"03:16", "04:56", "13:01", "17:13", "20:57", "22:37"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"03:15", "04:55", "13:01", "17:13", "20:58", "22:38"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"03:15", "04:55", "13:02", "17:14", "20:59", "22:39"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"03:15", "04:55", "13:02", "17:14", "20:59", "22:39"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:15", "04:55", "13:02", "17:14", "21:00", "22:40"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:14", "04:54", "13:02", "17:14", "21:00", "22:40"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:14", "04:54", "13:02", "17:15", "21:01", "22:41"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:14", "04:54", "13:03", "17:15", "21:01", "22:41"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:14", "04:54", "13:03", "17:15", "21:02", "22:42"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:14", "04:54", "13:03", "17:15", "21:02", "22:42"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:15", "04:55", "13:03", "17:16", "21:02", "22:42"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:15", "04:55", "13:04", "17:16", "21:02", "22:42"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:15", "04:55", "13:04", "17:16", "21:03", "22:43"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"03:15", "04:55", "13:04", "17:16", "21:03", "22:43"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:15", "04:55", "13:04", "17:17", "21:03", "22:43"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:16", "04:56", "13:04", "17:17", "21:03", "22:43"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:16", "04:56", "13:05", "17:17", "21:03", "22:43"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:16", "04:56", "13:05", "17:17", "21:03", "22:43"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:17", "04:57", "13:05", "17:17", "21:03", "22:43"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:17", "04:57", "13:05", "17:17", "21:03", "22:43"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"03:18", "04:58", "13:05", "17:17", "21:03", "22:43"};
            } else {
                list_time_prayer = new String[]{"03:18", "04:58", "13:06", "17:17", "21:03", "22:43"};
            }

            /*--------------БАЗА на месяц "ИЮЛЬ"---------------*/
        } else if(current_mouth == 7) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"03:19", "04:59", "13:06", "17:18", "21:03", "22:43"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"03:19", "04:59", "13:06", "17:18", "21:02", "22:42"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"03:20", "05:00", "13:06", "17:18", "21:02", "22:42"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"03:21", "05:01", "13:06", "17:18", "21:02", "22:42"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"03:21", "05:01", "13:07", "17:18", "21:02", "22:42"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"03:22", "05:02", "13:07", "17:18", "21:01", "22:41"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"03:23", "05:03", "13:07", "17:18", "21:01", "22:41"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"03:24", "05:04", "13:07", "17:18", "21:00", "22:40"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"03:24", "05:04", "13:07", "17:18", "21:00", "22:40"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"03:25", "05:05", "13:07", "17:18", "20:59", "22:39"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"03:26", "05:06", "13:08", "17:18", "20:58", "22:38"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"03:27", "05:07", "13:08", "17:17", "20:58", "22:38"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:28", "05:08", "13:08", "17:17", "20:57", "22:37"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:29", "05:09", "13:08", "17:17", "20:56", "22:36"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:30", "05:10", "13:08", "17:17", "20:56", "22:36"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:31", "05:11", "13:08", "17:17", "20:55", "22:35"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:32", "05:12", "13:08", "17:17", "20:54", "22:34"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:33", "05:13", "13:08", "17:16", "20:53", "22:33"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:34", "05:14", "13:08", "17:16", "20:52", "22:32"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:35", "05:15", "13:08", "17:16", "20:51", "22:31"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:36", "05:16", "13:08", "17:16", "20:50", "22:30"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"03:37", "05:17", "13:08", "17:15", "20:49", "22:29"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:38", "05:18", "13:09", "17:15", "20:48", "22:28"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:39", "05:19", "13:09", "17:15", "20:47", "22:27"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:41", "05:21", "13:09", "17:14", "20:46", "22:26"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:42", "05:22", "13:09", "17:14", "20:45", "22:25"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:43", "05:23", "13:09", "17:13", "20:43", "22:23"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:44", "05:24", "13:09", "17:13", "20:42", "22:22"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"03:45", "05:25", "13:09", "17:13", "20:41", "22:21"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"03:46", "05:26", "13:08", "17:12", "20:40", "22:20"};
            } else {
                list_time_prayer = new String[]{"03:48", "05:28", "13:08", "17:12", "20:38", "22:18"};
            }

            /*--------------БАЗА на месяц "АВГУСТ"---------------*/
        } else if(current_mouth == 8) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"03:49", "05:29", "13:08", "17:11", "20:37", "22:17"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"03:50", "05:30", "13:08", "17:10", "20:36", "22:16"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"03:51", "05:31", "13:08", "17:10", "20:34", "22:14"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"03:53", "05:33", "13:08", "17:09", "20:33", "22:13"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"03:54", "05:34", "13:08", "17:09", "20:31", "22:11"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"03:55", "05:35", "13:08", "17:08", "20:30", "22:10"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"03:56", "05:36", "13:08", "17:07", "20:28", "22:08"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"03:58", "05:38", "13:08", "17:07", "20:27", "22:07"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"03:59", "05:39", "13:08", "17:06", "20:25", "22:05"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:00", "05:40", "13:07", "17:05", "20:24", "22:04"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:02", "05:42", "13:07", "17:05", "20:22", "22:02"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:03", "05:43", "13:07", "17:04", "20:20", "22:00"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:04", "05:44", "13:07", "17:03", "20:19", "21:59"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:05", "05:45", "13:07", "17:02", "20:17", "21:57"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:07", "05:47", "13:07", "17:01", "20:16", "21:56"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:08", "05:48", "13:07", "17:01", "20:14", "21:54"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:11", "05:51", "13:07", "16:59", "20:13", "21:53"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:11", "05:51", "13:06", "16:59", "20:10", "21:50"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:12", "05:52", "13:06", "16:58", "20:09", "21:49"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:13", "05:53", "13:05", "16:57", "20:07", "21:47"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:15", "05:55", "13:05", "16:56", "20:05", "21:45"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:16", "05:56", "13:05", "16:55", "20:03", "21:43"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:17", "05:57", "13:05", "16:54", "20:01", "21:41"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:18", "05:58", "13:04", "16:53", "20:00", "21:40"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:20", "06:00", "13:04", "16:52", "19:58", "21:38"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:21", "06:01", "13:04", "16:51", "19:56", "21:36"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:22", "06:02", "13:04", "16:50", "19:54", "21:34"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"04:24", "06:04", "13:03", "16:49", "19:52", "21:32"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:25", "06:05", "13:03", "16:48", "19:50", "21:30"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"04:26", "06:06", "13:03", "16:47", "19:48", "21:28"};
            } else {
                list_time_prayer = new String[]{"04:27", "06:07", "13:02", "16:46", "19:47", "21:27"};
            }

            /*--------------БАЗА на месяц "СЕНТЯБРЬ"---------------*/
        } else if(current_mouth == 9) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:29", "06:09", "13:02", "16:44", "19:45", "21:25"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:30", "06:10", "13:02", "16:43", "19:43", "21:22"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:31", "06:11", "13:01", "16:42", "19:41", "21:19"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:33", "06:13", "13:01", "16:41", "19:39", "21:16"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:34", "06:14", "13:01", "16:40", "19:37", "21:13"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:35", "06:15", "13:00", "16:38", "19:35", "21:10"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:36", "06:16", "13:00", "16:37", "19:33", "21:07"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:38", "06:18", "13:00", "16:36", "19:31", "21:04"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:39", "06:19", "12:59", "16:35", "19:29", "21:01"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:40", "06:20", "12:59", "16:33", "19:27", "20:58"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:42", "06:22", "12:59", "16:32", "19:25", "20:55"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:43", "06:23", "12:58", "16:31", "19:23", "20:53"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:44", "06:24", "12:58", "16:29", "19:21", "20:51"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:45", "06:25", "12:58", "16:28", "19:19", "20:49"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:47", "06:27", "12:57", "16:27", "19:17", "20:47"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:48", "06:28", "12:57", "16:25", "19:15", "20:45"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:49", "06:29", "12:57", "16:24", "19:13", "20:43"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:51", "06:31", "12:56", "16:23", "19:11", "20:41"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:52", "06:32", "12:56", "16:21", "19:09", "20:39"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:53", "06:33", "12:56", "16:20", "19:07", "20:37"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:54", "06:34", "12:55", "16:18", "19:05", "20:35"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:56", "06:36", "12:55", "16:17", "19:03", "20:33"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:57", "06:37", "12:55", "16:16", "19:01", "20:31"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:58", "06:38", "12:54", "16:15", "18:58", "20:28"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:59", "06:39", "12:54", "16:13", "18:57", "20:27"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:01", "06:41", "12:53", "16:11", "18:55", "20:25"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:02", "06:42", "12:53", "16:10", "18:53", "20:23"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:04", "06:44", "12:53", "16:09", "18:51", "20:21"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:05", "06:45", "12:52", "16:07", "18:49", "20:19"};
            } else {
                list_time_prayer = new String[]{"05:06", "06:46", "12:52", "16:06", "18:47", "20:17"};
            }

            /*--------------БАЗА на месяц "ОКТЯБРЬ"---------------*/
        } else if(current_mouth == 10) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"05:07", "06:47", "12:52", "16:04", "18:45", "20:15"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:09", "06:49", "12:51", "16:03", "18:43", "20:13"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:10", "06:50", "12:51", "16:01", "18:41", "20:11"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:11", "06:51", "12:51", "16:00", "18:40", "20:10"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:13", "06:53", "12:51", "15:58", "18:38", "20:08"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:14", "06:54", "12:50", "15:57", "18:36", "20:06"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:15", "06:55", "12:50", "15:55", "18:34", "20:04"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:17", "06:57", "12:50", "15:54", "18:32", "20:02"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:18", "06:58", "12:49", "15:53", "18:30", "20:00"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:19", "06:59", "12:49", "15:51", "18:28", "19:58"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:21", "07:01", "12:49", "15:50", "18:26", "19:56"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:22", "07:02", "12:49", "15:48", "18:24", "19:54"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:23", "07:03", "12:48", "15:47", "18:23", "19:53"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:25", "07:05", "12:48", "15:45", "18:21", "19:51"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:26", "07:06", "12:48", "15:44", "18:19", "19:49"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:28", "07:08", "12:48", "15:43", "18:17", "19:47"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:29", "07:09", "12:47", "15:41", "18:15", "19:45"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:30", "07:10", "12:47", "15:40", "18:14", "19:44"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:32", "07:12", "12:47", "15:38", "18:12", "19:42"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:33", "07:13", "12:47", "15:37", "18:10", "19:40"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:34", "07:14", "12:47", "15:36", "18:08", "19:38"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:36", "07:16", "12:47", "15:34", "18:07", "19:37"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:37", "07:17", "12:46", "15:33", "18:05", "19:35"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:39", "07:19", "12:46", "15:32", "18:03", "19:33"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:40", "06:20", "11:46", "14:30", "17:02", "18:32"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:42", "06:22", "11:46", "14:29", "17:00", "18:30"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:43", "06:23", "11:46", "14:28", "16:58", "18:28"};/* Перевод часов на (1 час назад) последней субботы начиная с воскресенья (27.10.2019 г.) этого месяца*/
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"04:44", "06:24", "11:46", "14:26", "16:57", "18:27"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:46", "06:26", "11:46", "14:25", "16:55", "18:25"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"04:47", "06:27", "11:46", "14:24", "16:54", "18:24"};
            } else {
                list_time_prayer = new String[]{"04:49", "06:29", "11:46", "14:23", "16:52", "18:22"};
            }

            /*--------------БАЗА на месяц "НОЯБРЬ"---------------*/
        } else if(current_mouth == 11) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:50", "06:30", "11:46", "14:21", "16:51", "18:21"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:52", "06:32", "11:46", "14:20", "16:49", "18:19"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:53", "06:33", "11:46", "14:19", "16:48", "18:18"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:54", "06:34", "11:46", "14:18", "16:46", "18:16"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:56", "06:36", "11:46", "14:17", "16:45", "18:15"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:57", "06:37", "11:46", "14:16", "16:44", "18:14"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:59", "06:39", "11:46", "14:15", "16:42", "18:12"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:00", "06:40", "11:46", "14:14", "16:41", "18:11"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:02", "06:42", "11:46", "14:13", "16:40", "18:10"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:03", "06:43", "11:46", "14:12", "16:39", "18:09"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:04", "06:44", "11:46", "14:11", "16:37", "18:07"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:06", "06:46", "11:46", "14:10", "16:36", "18:06"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:07", "06:47", "11:46", "14:09", "16:35", "18:05"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:09", "06:49", "11:47", "14:08", "16:34", "18:04"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:10", "06:50", "11:47", "14:07", "16:33", "18:03"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:11", "06:51", "11:47", "14:06", "16:32", "18:02"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:13", "06:53", "11:47", "14:05", "16:31", "18:01"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:14", "06:54", "11:47", "14:05", "16:30", "18:00"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:16", "06:56", "11:47", "14:04", "16:29", "17:59"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:17", "06:57", "11:48", "14:03", "16:28", "17:58"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:18", "06:58", "11:48", "14:03", "16:27", "17:57"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:20", "07:00", "11:48", "14:02", "16:26", "17:56"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:21", "07:01", "11:48", "14:01", "16:25", "17:55"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:22", "07:02", "11:49", "14:01", "16:25", "17:55"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:24", "07:04", "11:49", "14:00", "16:24", "17:54"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:25", "07:05", "11:49", "14:00", "16:23", "17:53"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:26", "07:06", "11:50", "13:59", "16:23", "17:53"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:27", "07:07", "11:50", "13:59", "16:22", "17:52"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:29", "07:09", "11:50", "13:59", "16:22", "17:52"};
            } else {
                list_time_prayer = new String[]{"05:30", "07:10", "11:51", "13:58", "16:21", "17:51"};
            }

            /*--------------БАЗА на месяц "ДЕКАБРЬ"---------------*/
        } else {
            if(current_day < 2) {
                list_time_prayer = new String[]{"05:31", "07:11", "11:51", "13:58", "16:21", "17:51"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:32", "07:12", "11:51", "13:58", "16:20", "17:50"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:33", "07:13", "11:52", "13:58", "16:20", "17:50"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:35", "07:15", "11:52", "13:58", "16:20", "17:50"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:36", "07:16", "11:53", "13:58", "16:20", "17:50"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:37", "07:17", "11:53", "13:58", "16:20", "17:50"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:37", "07:17", "11:53", "13:58", "16:20", "17:50"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:39", "07:19", "11:54", "13:58", "16:20", "17:50"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:40", "07:20", "11:54", "13:58", "16:20", "17:50"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:41", "07:21", "11:55", "13:58", "16:20", "17:50"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:42", "07:22", "11:55", "13:58", "16:20", "17:50"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:42", "07:22", "11:56", "13:58", "16:20", "17:50"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:43", "07:23", "11:56", "13:58", "16:20", "17:50"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:44", "07:24", "11:57", "13:58", "16:20", "17:50"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:45", "07:25", "11:57", "13:58", "16:20", "17:50"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:46", "07:26", "11:58", "13:58", "16:20", "17:50"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:46", "07:26", "11:58", "13:58", "16:20", "17:50"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:47", "07:27", "11:59", "13:59", "16:20", "17:50"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:48", "07:28", "11:59", "13:59", "16:20", "17:50"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:48", "07:28", "12:00", "14:00", "16:21", "17:51"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:49", "07:29", "12:00", "14:00", "16:21", "17:51"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:49", "07:29", "12:01", "14:01", "16:22", "17:52"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:50", "07:30", "12:01", "14:01", "16:22", "17:52"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:50", "07:30", "12:02", "14:02", "16:23", "17:53"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:51", "07:31", "12:02", "14:02", "16:24", "17:54"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:51", "07:31", "12:03", "14:03", "16:24", "17:54"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:51", "07:31", "12:03", "14:04", "16:25", "17:55"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:52", "07:32", "12:04", "14:05", "16:26", "17:56"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:52", "07:32", "12:04", "14:05", "16:26", "17:56"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"05:52", "07:32", "12:05", "14:06", "16:27", "17:57"};
            } else {
                list_time_prayer = new String[]{"05:52", "07:32", "12:05", "14:07", "16:28", "17:58"};
            }
        }

        return list_time_prayer;
    }

}
