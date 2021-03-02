package com.example.muslimprayertime;

public class poltava {

    String[] get_time_prayer(Integer current_mouth, Integer current_day) {

        String[] list_time_prayer = new String[]{};

        /*--------------БАЗА на месяц "ЯНВАРЬ"- изменяется автоматически каждый год с учетом "ГРИГОРИАНСКОГО" (СОЛНЕЧНОГО) КАЛЕНДАРЯ--------------*/
        if(current_mouth == 1) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"05:49", "07:29", "11:50", "13:40", "16:02", "17:32"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:49", "07:29", "11:51", "13:41", "16:03", "17:33"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:49", "07:29", "11:51", "13:42", "16:04", "17:34"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:49", "07:29", "11:52", "13:43", "16:05", "17:35"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:48", "07:28", "11:52", "13:44", "16:06", "17:36"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:48", "07:28", "11:53", "13:45", "16:07", "17:37"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:48", "07:28", "11:53", "13:46", "16:08", "17:38"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:48", "07:28", "11:53", "13:47", "16:09", "17:39"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:47", "07:27", "11:54", "13:48", "16:11", "17:41"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:47", "07:27", "11:54", "13:50", "16:12", "17:42"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:46", "07:26", "11:55", "13:51", "16:13", "17:43"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:46", "07:26", "11:55", "13:52", "16:15", "17:45"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:45", "07:25", "11:55", "13:53", "16:16", "17:46"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:45", "07:25", "11:56", "13:54", "16:17", "17:47"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:44", "07:24", "11:56", "13:56", "16:19", "17:49"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:43", "07:23", "11:56", "13:57", "16:20", "17:50"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:42", "07:22", "11:57", "13:58", "16:22", "17:52"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:42", "07:22", "11:57", "13:59", "16:23", "17:53"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:41", "07:21", "11:57", "14:01", "16:25", "17:55"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:40", "07:20", "11:58", "14:02", "16:26", "17:56"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:39", "07:19", "11:58", "14:03", "16:28", "17:58"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:38", "07:18", "11:58", "14:05", "16:29", "17:59"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:37", "07:17", "11:59", "14:06", "16:31", "18:01"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:36", "07:16", "11:59", "14:07", "16:32", "18:02"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:35", "07:15", "11:59", "14:09", "16:34", "18:04"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:34", "07:14", "11:59", "14:10", "16:35", "18:05"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:32", "07:12", "11:59", "14:11", "16:37", "18:07"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:31", "07:11", "12:00", "14:13", "16:39", "18:09"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:30", "07:10", "12:00", "14:14", "16:40", "18:10"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"05:29", "07:09", "12:00", "14:15", "16:42", "18:12"};
            } else {
                list_time_prayer = new String[]{"05:26", "07:06", "12:00", "14:18", "16:45", "18:15"};
            }

            /*--------------БАЗА на месяц "ФЕВРАЛЬ", - "29" день необходимо добавить в ручную, т.к. это высокосный год и бывает раз в 4 года---------*/
        } else if(current_mouth == 2) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"05:26", "07:06", "12:00", "14:18", "16:45", "18:15"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:24", "07:04", "12:00", "14:19", "16:47", "18:17"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:23", "07:03", "12:01", "14:21", "16:49", "18:19"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:22", "07:02", "12:01", "14:22", "16:50", "18:20"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:20", "07:00", "12:01", "14:24", "16:52", "18:22"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:19", "06:59", "12:01", "14:25", "16:54", "18:24"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:17", "06:57", "12:01", "14:26", "16:55", "18:25"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:16", "06:56", "12:01", "14:28", "16:57", "18:27"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:14", "06:54", "12:01", "14:29", "16:59", "18:29"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:12", "06:52", "12:01", "14:30", "17:00", "18:30"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:11", "06:51", "12:01", "14:32", "17:02", "18:32"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:09", "06:49", "12:01", "14:33", "17:04", "18:34"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:07", "06:47", "12:01", "14:34", "17:05", "18:35"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:06", "06:46", "12:01", "14:36", "17:07", "18:37"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:04", "06:44", "12:01", "14:37", "17:09", "18:39"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:02", "06:42", "12:01", "14:38", "17:10", "18:40"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:00", "06:40", "12:01", "14:40", "17:12", "18:42"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:58", "06:38", "12:01", "14:41", "17:14", "18:44"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:57", "06:37", "12:01", "14:42", "17:15", "18:45"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:55", "06:35", "12:00", "14:43", "17:17", "18:47"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:53", "06:33", "12:00", "14:45", "17:19", "18:49"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:51", "06:31", "12:00", "14:46", "17:20", "18:50"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:49", "06:29", "12:00", "14:47", "17:22", "18:52"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:47", "06:27", "12:00", "14:48", "17:24", "18:54"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:45", "06:25", "12:00", "14:50", "17:25", "18:55"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:43", "06:23", "12:00", "14:51", "17:27", "18:57"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:41", "06:21", "11:59", "14:52", "17:28", "18:58"};

                /*------------------Разкоментировать эту строку указанную ниже, если наступил высокосный год, т.е. 29 Февраля 2016 года-------*/
			/*} else if(current_day > 27 && current_day < 29) {
				list_time_prayer = new String[]{"04:58", "06:38", "12:16", "15:06", "17:44", "19:14"};*/
            } else {
                list_time_prayer = new String[]{"04:39", "06:19", "11:59", "14:53", "17:30", "19:00"};
            }

            /*--------------БАЗА на месяц "МАРТ"---------------*/
        } else if(current_mouth == 3) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:37", "06:17", "11:59", "14:54", "17:32", "19:02"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:35", "06:15", "11:59", "14:55", "17:33", "19:03"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:33", "06:13", "11:59", "14:56", "17:35", "19:05"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:31", "06:11", "11:58", "14:58", "17:37", "19:07"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:29", "06:09", "11:58", "14:59", "17:38", "19:08"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:27", "06:07", "11:58", "15:00", "17:40", "19:10"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:25", "06:05", "11:58", "15:01", "17:41", "19:11"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:23", "06:03", "11:58", "15:02", "17:43", "19:13"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:21", "06:01", "11:57", "15:03", "17:45", "19:15"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:19", "05:59", "11:57", "15:04", "17:46", "19:16"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:17", "05:57", "11:57", "15:05", "17:48", "19:18"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:15", "05:55", "11:56", "15:06", "17:49", "19:19"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:12", "05:52", "11:56", "15:07", "17:51", "19:21"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:10", "05:50", "11:56", "15:08", "17:53", "19:23"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:08", "05:48", "11:56", "15:09", "17:54", "19:24"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:06", "05:46", "11:55", "15:10", "17:56", "19:26"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:04", "05:44", "11:55", "15:11", "17:57", "19:27"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:02", "05:42", "11:55", "15:12", "17:59", "19:29"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:00", "05:40", "11:55", "15:13", "18:01", "19:31"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:58", "05:38", "11:54", "15:14", "18:03", "19:33"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:55", "05:35", "11:54", "15:15", "18:04", "19:34"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"03:53", "05:33", "11:54", "15:16", "18:05", "19:35"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:51", "05:31", "11:53", "15:17", "18:07", "19:37"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:49", "05:29", "11:53", "15:18", "18:08", "19:38"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:47", "05:27", "11:53", "15:18", "18:10", "19:40"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:45", "05:25", "11:52", "15:19", "18:11", "19:41"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:42", "05:22", "11:52", "15:20", "18:13", "19:43"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:40", "05:20", "11:52", "15:21", "18:14", "19:44"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:38", "06:18", "12:52", "16:22", "19:16", "20:46"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"04:36", "06:16", "12:51", "16:23", "19:18", "20:48"};
            } else {
                list_time_prayer = new String[]{"04:34", "06:14", "12:51", "16:24", "19:19", "20:49"};/* Перевод часов на (1 час вперед) в последнее воскресенье этого месяца, т.е. с последней (субботы на воскресенье) (31.03.2019 г.) */
            }
            /*--------------БАЗА на месяц "АПРЕЛЬ"---------------*/
        } else if(current_mouth == 4) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:32", "06:12", "12:51", "16:24", "19:21", "20:51"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:29", "06:09", "12:50", "16:25", "19:22", "20:52"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:27", "06:07", "12:50", "16:26", "19:24", "20:54"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:25", "06:05", "12:50", "16:27", "19:25", "20:55"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:23", "06:03", "12:49", "16:27", "19:27", "20:57"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:21", "06:01", "12:49", "16:28", "19:28", "20:58"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:19", "05:59", "12:49", "16:29", "19:30", "21:00"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:17", "05:57", "12:49", "16:30", "19:32", "21:02"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:15", "05:55", "12:48", "16:30", "19:33", "21:03"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:12", "05:52", "12:48", "16:31", "19:35", "21:05"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:10", "05:50", "12:48", "16:32", "19:36", "21:06"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:08", "05:48", "12:48", "16:33", "19:38", "21:08"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:06", "05:46", "12:47", "16:33", "19:39", "21:09"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:04", "05:44", "12:47", "16:34", "19:41", "21:11"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:02", "05:42", "12:47", "16:35", "19:42", "21:12"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:00", "05:40", "12:47", "16:35", "19:44", "21:14"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:58", "05:38", "12:46", "16:36", "19:46", "21:16"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:56", "05:36", "12:46", "16:37", "19:47", "21:17"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:54", "05:34", "12:46", "16:37", "19:49", "21:19"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:52", "05:32", "12:46", "16:38", "19:50", "21:20"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:50", "05:30", "12:45", "16:39", "19:52", "21:22"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"03:48", "05:28", "12:45", "16:39", "19:53", "21:23"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:46", "05:26", "12:45", "16:40", "19:55", "21:25"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:44", "05:24", "12:45", "16:41", "19:57", "21:27"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:42", "05:22", "12:45", "16:41", "19:58", "21:28"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:40", "05:20", "12:44", "16:42", "20:00", "21:30"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:38", "05:18", "12:44", "16:42", "20:01", "21:31"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:37", "05:17", "12:44", "16:43", "20:03", "21:33"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"03:35", "05:15", "12:44", "16:44", "20:04", "21:34"};
            } else {
                list_time_prayer = new String[]{"03:33", "05:13", "12:44", "16:44", "20:06", "21:36"};
            }

            /*--------------БАЗА на месяц "МАЙ"---------------*/
        } else if(current_mouth == 5) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"03:31", "05:11", "12:44", "16:45", "20:07", "21:37"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"03:29", "05:09", "12:44", "16:45", "20:09", "21:39"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"03:28", "05:08", "12:44", "16:46", "20:11", "21:41"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"03:26", "05:06", "12:43", "16:47", "20:12", "21:42"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"03:24", "05:04", "12:43", "16:47", "20:14", "21:44"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"03:22", "05:02", "12:43", "16:48", "20:15", "21:45"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"03:21", "05:01", "12:43", "16:48", "20:17", "21:47"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"03:19", "04:59", "12:43", "16:49", "20:18", "21:48"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"03:18", "04:58", "12:43", "16:49", "20:20", "21:50"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"03:16", "04:56", "12:43", "16:50", "20:21", "21:51"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"03:14", "04:54", "12:43", "16:50", "20:23", "21:53"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"03:13", "04:53", "12:43", "16:51", "20:24", "21:54"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:11", "04:51", "12:43", "16:52", "20:26", "21:56"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:10", "04:50", "12:43", "16:52", "20:27", "21:57"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:09", "04:49", "12:43", "16:53", "20:28", "21:58"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:07", "04:47", "12:43", "16:53", "20:30", "22:00"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:06", "04:46", "12:43", "16:54", "20:31", "22:01"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:04", "04:44", "12:43", "16:54", "20:33", "22:03"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:03", "04:43", "12:43", "16:55", "20:34", "22:04"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:02", "04:42", "12:43", "16:55", "20:35", "22:05"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:01", "04:41", "12:43", "16:56", "20:37", "22:07"};
            } else if(current_day > 21 && current_day < 23)  {
                list_time_prayer = new String[]{"02:59", "04:39", "12:43", "16:56", "20:38", "22:09"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"02:58", "04:38", "12:43", "16:57", "20:39", "22:11"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"02:57", "04:37", "12:43", "16:57", "20:41", "22:14"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"02:56", "04:36", "12:44", "16:58", "20:42", "22:16"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"02:55", "04:35", "12:44", "16:58", "20:43", "22:18"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"02:54", "04:34", "12:44", "16:58", "20:44", "22:20"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"02:53", "04:33", "12:44", "16:59", "20:45", "22:22"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"02:52", "04:32", "12:44", "16:59", "20:46", "22:24"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"02:51", "04:31", "12:44", "17:00", "20:48", "22:27"};
            } else {
                list_time_prayer = new String[]{"02:51", "04:31", "12:44", "17:00", "20:49", "22:29"};
            }

            /*--------------БАЗА на месяц "ИЮНЬ"---------------*/
        } else if(current_mouth == 6) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"02:50", "04:30", "12:44", "17:01", "20:50", "22:30"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"02:49", "04:29", "12:45", "17:01", "20:51", "22:31"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"02:48", "04:28", "12:45", "17:01", "20:52", "22:32"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"02:48", "04:28", "12:45", "17:02", "20:53", "22:33"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"02:47", "04:27", "12:45", "17:02", "20:54", "22:34"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"02:46", "04:26", "12:45", "17:03", "20:55", "22:35"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"02:46", "04:26", "12:45", "17:03", "20:55", "22:35"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"02:46", "04:26", "12:46", "17:03", "20:56", "22:36"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"02:45", "04:25", "12:46", "17:04", "20:57", "22:37"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"02:45", "04:25", "12:46", "17:04", "20:58", "22:38"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"02:44", "04:24", "12:46", "17:04", "20:58", "22:38"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"02:44", "04:24", "12:46", "17:05", "20:59", "22:39"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"02:44", "04:24", "12:47", "17:05", "21:00", "22:40"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"02:44", "04:24", "12:47", "17:05", "21:00", "22:40"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"02:44", "04:24", "12:47", "17:06", "21:01", "22:41"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"02:44", "04:24", "12:47", "17:06", "21:01", "22:41"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"02:44", "04:24", "12:48", "17:06", "21:02", "22:42"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"02:44", "04:24", "12:48", "17:07", "21:02", "22:42"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"02:44", "04:24", "12:48", "17:07", "21:02", "22:42"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"02:44", "04:24", "12:48", "17:07", "21:03", "22:43"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"02:44", "04:24", "12:48", "17:07", "21:03", "22:43"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"02:44", "04:24", "12:49", "17:07", "21:03", "22:43"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"02:44", "04:24", "12:49", "17:08", "21:03", "22:43"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"02:45", "04:25", "12:49", "17:08", "21:03", "22:43"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"02:45", "04:25", "12:49", "17:08", "21:03", "22:43"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"02:45", "04:25", "12:49", "17:08", "21:03", "22:43"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"02:46", "04:26", "12:50", "17:08", "21:03", "22:43"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"02:46", "04:26", "12:50", "17:08", "21:03", "22:43"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"02:47", "04:27", "12:50", "17:08", "21:03", "22:43"};
            } else {
                list_time_prayer = new String[]{"02:48", "04:28", "12:50", "17:08", "21:03", "22:43"};
            }

            /*--------------БАЗА на месяц "ИЮЛЬ"---------------*/
        } else if(current_mouth == 7) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"02:48", "04:28", "12:50", "17:09", "21:02", "22:42"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"02:49", "04:29", "12:51", "17:09", "21:02", "22:42"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"02:49", "04:29", "12:51", "17:09", "21:02", "22:42"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"02:50", "04:30", "12:51", "17:09", "21:01", "22:41"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"02:51", "04:31", "12:51", "17:09", "21:01", "22:41"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"02:52", "04:32", "12:51", "17:09", "21:00", "22:40"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"02:53", "04:33", "12:52", "17:08", "21:00", "22:40"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"02:54", "04:34", "12:52", "17:08", "20:59", "22:39"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"02:54", "04:34", "12:52", "17:08", "20:59", "22:39"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"02:55", "04:35", "12:52", "17:08", "20:58", "22:38"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"02:56", "04:36", "12:52", "17:08", "20:57", "22:37"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"02:57", "04:37", "12:52", "17:08", "20:56", "22:36"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"02:58", "04:38", "12:52", "17:08", "20:56", "22:36"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:00", "04:40", "12:52", "17:07", "20:55", "22:35"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:01", "04:41", "12:53", "17:07", "20:54", "22:34"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:02", "04:42", "12:53", "17:07", "20:53", "22:33"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:03", "04:43", "12:53", "17:07", "20:52", "22:32"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:04", "04:44", "12:53", "17:06", "20:51", "22:31"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:05", "04:45", "12:53", "17:06", "20:50", "22:30"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:07", "04:47", "12:53", "17:06", "20:49", "22:29"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:08", "04:48", "12:53", "17:05", "20:48", "22:28"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"03:09", "04:49", "12:53", "17:05", "20:46", "22:26"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:10", "04:50", "12:53", "17:05", "20:45", "22:25"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:12", "04:52", "12:53", "17:04", "20:44", "22:24"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:13", "04:53", "12:53", "17:04", "20:43", "22:23"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:14", "04:54", "12:53", "17:03", "20:41", "22:21"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:16", "04:56", "12:53", "17:03", "20:40", "22:20"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:17", "04:57", "12:53", "17:02", "20:38", "22:18"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"03:18", "04:58", "12:53", "17:02", "20:37", "22:17"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"03:20", "05:00", "12:53", "17:01", "20:36", "22:16"};
            } else {
                list_time_prayer = new String[]{"03:21", "05:01", "12:53", "17:01", "20:34", "22:14"};
            }

            /*--------------БАЗА на месяц "АВГУСТ"---------------*/
        } else if(current_mouth == 8) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"03:22", "05:02", "12:53", "17:00", "20:33", "22:13"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"03:24", "05:04", "12:53", "16:59", "20:31", "22:11"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"03:25", "05:05", "12:53", "16:59", "20:29", "22:09"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"03:27", "05:07", "12:53", "16:58", "20:28", "22:08"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"03:28", "05:08", "12:53", "16:57", "20:26", "22:06"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"03:30", "05:10", "12:53", "16:56", "20:24", "22:04"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"03:31", "05:11", "12:52", "16:56", "20:23", "22:03"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"03:33", "05:13", "12:52", "16:55", "20:21", "22:01"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"03:34", "05:14", "12:52", "16:54", "20:19", "21:59"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"03:36", "05:16", "12:52", "16:53", "20:18", "21:58"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"03:37", "05:17", "12:52", "16:53", "20:16", "21:56"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"03:38", "05:18", "12:52", "16:52", "20:14", "21:54"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:40", "05:20", "12:52", "16:51", "20:12", "21:52"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:41", "05:21", "12:51", "16:50", "20:10", "21:50"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:43", "05:23", "12:51", "16:49", "20:08", "21:48"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:44", "05:24", "12:51", "16:48", "20:06", "21:46"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:47", "05:27", "12:51", "16:48", "20:06", "21:46"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:47", "05:27", "12:51", "16:46", "20:03", "21:43"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:49", "05:29", "12:50", "16:45", "20:01", "21:41"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:50", "05:30", "12:50", "16:44", "19:59", "21:39"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:52", "05:32", "12:50", "16:43", "19:57", "21:37"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"03:53", "05:33", "12:50", "16:41", "19:55", "21:35"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:55", "05:35", "12:49", "16:40", "19:53", "21:33"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:56", "05:36", "12:49", "16:39", "19:51", "21:31"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:58", "05:38", "12:49", "16:38", "19:49", "21:29"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:59", "05:39", "12:49", "16:37", "19:47", "21:27"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:01", "05:41", "12:48", "16:36", "19:45", "21:25"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"04:02", "05:42", "12:48", "16:36", "19:43", "21:23"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:04", "05:44", "12:48", "16:33", "19:40", "21:20"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"04:05", "05:45", "12:47", "16:32", "19:38", "21:18"};
            } else {
                list_time_prayer = new String[]{"04:07", "05:47", "12:47", "16:31", "19:36", "21:16"};
            }

            /*--------------БАЗА на месяц "СЕНТЯБРЬ"---------------*/
        } else if(current_mouth == 9) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:08", "05:48", "12:47", "16:29", "19:34", "21:14"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:10", "05:50", "12:46", "16:28", "19:32", "21:11"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:11", "05:51", "12:46", "16:27", "19:30", "21:08"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:13", "05:53", "12:46", "16:26", "19:28", "21:05"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:14", "05:54", "12:45", "16:24", "19:26", "21:02"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:16", "05:56", "12:45", "16:23", "19:23", "21:58"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:17", "05:57", "12:45", "16:21", "19:21", "20:55"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:19", "05:59", "12:44", "16:20", "19:19", "20:52"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:20", "06:00", "12:44", "16:19", "19:17", "20:49"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:22", "06:02", "12:44", "16:17", "19:15", "20:46"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:23", "06:03", "12:43", "16:16", "19:13", "20:43"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:25", "06:05", "12:43", "16:14", "19:10", "20:40"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:26", "06:06", "12:43", "16:13", "19:08", "20:38"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:28", "06:08", "12:42", "16:11", "19:06", "20:36"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:29", "06:09", "12:42", "16:10", "19:04", "20:34"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:30", "06:10", "12:42", "16:08", "19:02", "20:32"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:32", "06:12", "12:41", "16:07", "19:00", "20:30"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:33", "06:13", "12:41", "16:05", "18:57", "20:27"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:35", "06:15", "12:41", "16:04", "18:55", "20:25"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:36", "06:16", "12:40", "16:02", "18:53", "20:23"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:38", "06:18", "12:40", "16:01", "18:51", "20:21"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:39", "06:19", "12:39", "15:59", "18:49", "20:19"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:41", "06:21", "12:39", "15:58", "18:46", "20:16"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:43", "06:23", "12:39", "15:57", "18:44", "20:14"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:44", "06:24", "12:38", "15:55", "18:42", "20:12"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:45", "06:25", "12:38", "15:53", "18:40", "20:10"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:47", "06:27", "12:38", "15:51", "18:38", "20:08"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"04:48", "06:28", "12:37", "15:50", "18:36", "20:06"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:50", "06:30", "12:37", "15:48", "18:33", "20:03"};
            } else {
                list_time_prayer = new String[]{"04:51", "06:31", "12:37", "15:47", "18:31", "20:01"};
            }

            /*--------------БАЗА на месяц "ОКТЯБРЬ"---------------*/
        } else if(current_mouth == 10) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:53", "06:33", "12:36", "15:45", "18:29", "19:59"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:54", "06:34", "12:36", "15:43", "18:27", "19:57"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:56", "06:36", "12:36", "15:42", "18:25", "19:55"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:57", "06:37", "12:35", "15:40", "18:23", "19:53"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:59", "06:39", "12:35", "15:39", "18:21", "19:51"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:00", "06:40", "12:35", "15:37", "18:19", "19:49"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:02", "06:42", "12:35", "15:35", "18:16", "19:46"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:03", "06:43", "12:34", "15:34", "18:14", "19:44"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:05", "06:45", "12:34", "15:32", "18:12", "19:42"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:06", "06:46", "12:34", "15:31", "18:10", "19:40"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:08", "06:48", "12:33", "15:29", "18:08", "19:38"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:10", "06:50", "12:33", "15:27", "18:06", "19:36"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:11", "06:51", "12:33", "15:26", "18:04", "19:34"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:13", "06:53", "12:33", "15:24", "18:02", "19:32"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:14", "06:54", "12:33", "15:23", "18:00", "19:30"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:16", "06:56", "12:32", "15:21", "17:58", "19:28"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:17", "06:57", "12:32", "15:19", "17:56", "19:26"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:19", "06:59", "12:32", "15:18", "17:54", "19:24"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:20", "07:00", "12:32", "15:16", "17:52", "19:22"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:22", "07:02", "12:32", "15:15", "17:50", "19:20"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:24", "07:04", "12:31", "15:13", "17:48", "19:18"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:25", "07:05", "12:31", "15:12", "17:46", "19:16"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:27", "07:07", "12:31", "15:10", "17:45", "19:15"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:28", "07:08", "12:31", "15:09", "17:43", "19:13"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:30", "06:10", "11:31", "14:07", "16:41", "18:11"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:32", "06:12", "11:31", "14:06", "16:39", "18:09"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:33", "06:13", "11:31", "14:04", "16:37", "18:07"};/* Перевод часов на (1 час назад) последней субботы начиная с воскресенья (27.10.2019 г.) этого месяца*/
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"04:35", "06:15", "11:31", "14:03", "16:36", "18:06"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:36", "06:16", "11:30", "14:02", "16:34", "18:04"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"04:38", "06:18", "11:30", "14:00", "16:32", "18:02"};
            } else {
                list_time_prayer = new String[]{"04:40", "06:20", "11:30", "13:59", "16:30", "18:00"};
            }

            /*--------------БАЗА на месяц "НОЯБРЬ"---------------*/
        } else if(current_mouth == 11) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:41", "06:21", "11:30", "13:58", "16:29", "17:59"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:43", "06:23", "11:30", "13:56", "16:27", "17:57"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:44", "06:24", "11:30", "13:55", "16:25", "17:55"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:46", "06:26", "11:30", "13:54", "16:24", "17:54"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:48", "06:28", "11:30", "13:52", "16:22", "17:52"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:49", "06:29", "11:30", "13:51", "16:21", "17:51"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:51", "06:31", "11:30", "13:50", "16:19", "17:49"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:53", "06:33", "11:30", "13:49", "16:18", "17:48"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:54", "06:34", "11:31", "13:48", "16:16", "17:46"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:56", "06:36", "11:31", "13:47", "16:15", "17:45"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:57", "06:37", "11:31", "13:45", "16:14", "17:44"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:59", "06:39", "11:31", "13:44", "16:12", "17:42"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:00", "06:40", "11:31", "13:43", "16:11", "17:41"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:02", "06:42", "11:31", "13:42", "16:10", "17:40"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:04", "06:44", "11:31", "13:41", "16:08", "17:38"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:05", "06:45", "11:31", "13:40", "16:07", "17:37"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:07", "06:47", "11:32", "13:39", "16:06", "17:36"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:08", "06:48", "11:32", "13:39", "16:05", "17:35"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:10", "06:50", "11:32", "13:38", "16:04", "17:34"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:11", "06:51", "11:32", "13:37", "16:03", "17:33"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:13", "06:53", "11:33", "13:36", "16:02", "17:32"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:14", "06:54", "11:33", "13:35", "16:01", "17:31"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:16", "06:56", "11:33", "13:35", "16:00", "17:30"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:17", "06:57", "11:33", "13:34", "15:59", "17:29"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:19", "06:59", "11:34", "13:33", "15:58", "17:28"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:20", "07:00", "11:34", "13:33", "15:57", "17:27"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:22", "07:02", "11:34", "13:32", "15:57", "17:27"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:23", "07:03", "11:35", "13:32", "15:56", "17:26"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:24", "07:04", "11:35", "13:31", "15:55", "17:25"};
            } else {
                list_time_prayer = new String[]{"05:26", "07:06", "11:35", "13:31", "15:55", "17:25"};
            }

            /*--------------БАЗА на месяц "ДЕКАБРЬ"---------------*/
        } else {
            if(current_day < 2) {
                list_time_prayer = new String[]{"05:27", "07:07", "11:36", "13:31", "15:54", "17:24"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:28", "07:08", "11:36", "13:30", "15:54", "17:24"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:29", "07:09", "11:36", "13:30", "15:53", "17:23"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:31", "07:11", "11:37", "13:30", "15:53", "17:23"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:32", "07:12", "11:37", "13:29", "15:52", "17:22"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:33", "07:13", "11:38", "13:29", "15:52", "17:22"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:33", "07:13", "11:38", "13:29", "15:52", "17:22"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:35", "07:15", "11:39", "13:29", "15:52", "17:22"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:36", "07:16", "11:39", "13:29", "15:51", "17:21"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:37", "07:17", "11:39", "13:29", "15:51", "17:21"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:38", "07:18", "11:40", "13:29", "15:51", "17:21"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:39", "07:19", "11:40", "13:29", "15:51", "17:21"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:40", "07:20", "11:41", "13:29", "15:51", "17:21"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:41", "07:21", "11:41", "13:30", "15:51", "17:21"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:42", "07:22", "11:42", "13:30", "15:51", "17:21"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:43", "07:23", "11:42", "13:30", "15:52", "17:22"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:43", "07:23", "11:43", "13:30", "15:52", "17:22"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:44", "07:24", "11:43", "13:31", "15:52", "17:22"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:45", "07:25", "11:44", "13:31", "15:53", "17:23"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:45", "07:25", "11:44", "13:32", "15:53", "17:23"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:46", "07:26", "11:45", "13:32", "15:53", "17:23"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:46", "07:26", "11:45", "13:33", "15:54", "17:24"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:47", "07:27", "11:46", "13:33", "15:54", "17:24"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:47", "07:27", "11:46", "13:34", "15:55", "17:25"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:48", "07:28", "11:47", "13:34", "15:56", "17:26"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:48", "07:28", "11:47", "13:35", "15:56", "17:26"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:48", "07:28", "11:48", "13:36", "15:57", "17:27"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:49", "07:29", "11:48", "13:37", "15:58", "17:28"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:49", "07:29", "11:49", "13:37", "15:59", "17:29"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"05:49", "07:29", "11:49", "13:38", "16:00", "17:30"};
            } else {
                list_time_prayer = new String[]{"05:49", "07:29", "11:50", "13:39", "16:00", "17:30"};
            }
        }

        return list_time_prayer;
    }

}
