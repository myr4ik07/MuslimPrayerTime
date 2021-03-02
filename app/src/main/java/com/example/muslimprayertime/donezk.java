package com.example.muslimprayertime;

public class donezk {

    String[] get_time_prayer(Integer current_mouth, Integer current_day) {

        String[] list_time_prayer = new String[]{};

        /*--------------БАЗА на месяц "ЯНВАРЬ"- изменяется автоматически каждый год с учетом "ГРИГОРИАНСКОГО" (СОЛНЕЧНОГО) КАЛЕНДАРЯ--------------*/
        if(current_mouth == 1) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"05:29", "07:09", "11:37", "13:34", "15:55", "17:25"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:29", "07:09", "11:38", "13:35", "15:56", "17:26"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:29", "07:09", "11:38", "13:36", "15:57", "17:27"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:29", "07:09", "11:39", "13:37", "15:58", "17:28"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:29", "07:09", "11:39", "13:38", "15:59", "17:29"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:29", "07:09", "11:40", "13:39", "16:00", "17:30"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:29", "07:09", "11:40", "13:40", "16:01", "17:31"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:28", "07:08", "11:40", "13:41", "16:03", "17:33"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:28", "07:08", "11:41", "13:42", "16:04", "17:34"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:28", "07:08", "11:41", "13:43", "16:05", "17:35"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:27", "07:07", "11:42", "13:44", "16:06", "17:36"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:27", "07:07", "11:42", "13:45", "16:08", "17:38"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:26", "07:06", "11:42", "13:46", "16:09", "17:39"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:26", "07:06", "11:43", "13:47", "16:10", "17:40"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:25", "07:05", "11:43", "13:49", "16:11", "17:41"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:24", "07:04", "11:43", "13:50", "16:13", "17:43"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:24", "07:04", "11:44", "13:51", "16:14", "17:44"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:23", "07:03", "11:44", "13:52", "16:16", "17:46"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:22", "07:02", "11:44", "13:53", "16:17", "17:47"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:21", "07:01", "11:45", "13:55", "16:18", "17:48"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:21", "07:01", "11:45", "13:56", "16:20", "17:50"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:20", "07:00", "11:45", "13:57", "16:21", "17:51"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:19", "06:59", "11:46", "13:58", "16:23", "17:53"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:18", "06:58", "11:46", "14:00", "16:24", "17:54"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:17", "06:57", "11:46", "14:01", "16:26", "17:56"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:16", "06:56", "11:46", "14:02", "16:27", "17:57"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:15", "06:55", "11:46", "14:04", "16:29", "17:59"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:13", "06:53", "11:47", "14:05", "16:30", "18:00"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:12", "06:52", "11:47", "14:06", "16:32", "18:02"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"05:11", "06:51", "11:47", "14:08", "16:33", "18:03"};
            } else {
                list_time_prayer = new String[]{"05:08", "06:48", "11:47", "14:09", "16:36", "18:06"};
            }

            /*--------------БАЗА на месяц "ФЕВРАЛЬ", - "29" день необходимо добавить в ручную, т.к. это высокосный год и бывает раз в 4 года---------*/
        } else if(current_mouth == 2) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"05:09", "06:49", "11:47", "14:10", "16:37", "18:07"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:07", "06:47", "11:47", "14:11", "16:38", "18:08"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:06", "06:46", "11:48", "14:13", "16:40", "18:10"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:05", "06:45", "11:48", "14:14", "16:41", "18:11"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:03", "06:43", "11:48", "14:15", "16:43", "18:13"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:02", "06:42", "11:48", "14:17", "16:44", "18:14"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:00", "06:40", "11:48", "14:18", "16:46", "18:16"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:59", "06:39", "11:48", "14:19", "16:48", "18:18"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:57", "06:37", "11:48", "14:20", "16:50", "18:20"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:56", "06:36", "11:48", "14:22", "16:52", "18:22"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:54", "06:34", "11:48", "14:23", "16:54", "18:24"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:53", "06:33", "11:48", "14:24", "16:56", "18:26"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:51", "06:31", "11:48", "14:25", "16:57", "18:27"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:49", "06:29", "11:48", "14:26", "16:59", "18:29"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:47", "06:27", "11:48", "14:27", "17:00", "18:30"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:46", "06:26", "11:48", "14:29", "17:01", "18:31"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:44", "06:24", "11:48", "14:30", "17:02", "18:32"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:43", "06:23", "11:48", "14:32", "17:03", "18:33"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:41", "06:21", "11:48", "14:33", "17:05", "18:35"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:39", "06:19", "11:47", "14:34", "17:06", "18:36"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:37", "06:17", "11:47", "14:35", "17:08", "18:38"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:36", "06:16", "11:47", "14:36", "17:10", "18:40"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:34", "06:14", "11:47", "14:37", "17:11", "18:41"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:32", "06:12", "11:47", "14:39", "17:13", "18:43"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:30", "06:10", "11:47", "14:40", "17:14", "18:44"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:28", "06:08", "11:47", "14:41", "17:16", "18:46"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:26", "06:06", "11:46", "14:42", "17:17", "18:47"};

                /*------------------Разкоментировать эту строку указанную ниже, если наступил высокосный год, т.е. 29 Февраля 2016 года-------*/
			/*} else if(current_day > 27 && current_day < 29) {
				list_time_prayer = new String[]{"04:58", "06:38", "12:16", "15:06", "17:44", "19:14"};*/
            } else {
                list_time_prayer = new String[]{"04:25", "06:05", "11:46", "14:43", "17:19", "18:49"};
            }

            /*--------------БАЗА на месяц "МАРТ"---------------*/
        } else if(current_mouth == 3) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:23", "06:03", "11:46", "14:44", "17:20", "18:50"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:21", "06:01", "11:46", "14:45", "17:22", "18:52"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:19", "05:59", "11:46", "14:46", "17:23", "18:53"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:17", "05:57", "11:45", "14:47", "17:25", "18:55"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:15", "05:55", "11:45", "14:48", "17:26", "18:56"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:13", "05:53", "11:45", "14:49", "17:28", "18:58"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:11", "05:51", "11:45", "14:50", "17:29", "18:59"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:09", "05:49", "11:45", "14:51", "17:31", "19:01"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:07", "05:47", "11:44", "14:52", "17:32", "19:02"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:05", "05:45", "11:44", "14:53", "17:34", "19:04"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:03", "05:43", "11:44", "14:54", "17:35", "19:05"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:01", "05:41", "11:43", "14:55", "17:37", "19:07"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:59", "05:39", "11:43", "14:56", "17:38", "19:08"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:57", "05:37", "11:43", "14:57", "17:40", "19:10"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:55", "05:35", "11:43", "14:58", "17:41", "19:11"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:53", "05:33", "11:42", "14:59", "17:43", "19:13"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:51", "05:31", "11:42", "15:00", "17:44", "19:14"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:49", "05:29", "11:42", "15:01", "17:46", "19:16"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:47", "05:27", "11:42", "15:02", "17:48", "19:18"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:45", "05:25", "11:41", "15:03", "17:50", "19:20"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:43", "05:23", "11:41", "15:03", "17:50", "19:20"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"03:41", "05:21", "11:41", "15:04", "17:51", "19:21"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:39", "05:19", "11:40", "15:05", "17:53", "19:23"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:37", "05:17", "11:40", "15:06", "17:54", "19:24"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:35", "05:15", "11:40", "15:06", "17:56", "19:26"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:32", "05:12", "11:39", "15:07", "17:57", "19:27"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:30", "05:10", "11:39", "15:08", "17:59", "19:29"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:28", "05:08", "11:39", "15:09", "18:00", "19:30"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:26", "06:06", "12:39", "16:10", "19:02", "20:32"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"04:24", "06:04", "12:38", "16:10", "19:03", "20:33"};
            } else {
                list_time_prayer = new String[]{"04:22", "06:02", "12:38", "16:11", "19:05", "20:35"};/* Перевод часов на (1 час вперед) в последнее воскресенье этого месяца, т.е. с последней (субботы на воскресенье) (31.03.2019 г.) */
            }

            /*--------------БАЗА на месяц "АПРЕЛЬ"---------------*/
        } else if(current_mouth == 4) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:20", "06:00", "12:38", "16:12", "19:06", "20:36"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:18", "05:58", "12:37", "16:12", "19:07", "20:37"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:16", "05:56", "12:37", "16:13", "19:09", "20:39"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:14", "05:54", "12:37", "16:14", "19:10", "20:40"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:12", "05:52", "12:36", "16:15", "19:12", "20:42"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:10", "05:50", "12:36", "16:15", "19:13", "20:43"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:08", "05:48", "12:36", "16:16", "19:15", "20:45"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:06", "05:46", "12:36", "16:17", "19:16", "20:46"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:04", "05:44", "12:35", "16:17", "19:18", "20:48"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:02", "05:42", "12:35", "16:18", "19:19", "20:49"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:00", "05:40", "12:35", "16:19", "19:21", "20:51"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"03:58", "05:38", "12:35", "16:19", "19:22", "20:52"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:56", "05:36", "12:34", "16:20", "19:23", "20:53"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:54", "05:34", "12:34", "16:20", "19:25", "20:55"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:52", "05:32", "12:34", "16:21", "19:26", "20:56"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:50", "05:30", "12:34", "16:22", "19:28", "20:58"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:48", "05:28", "12:33", "16:22", "19:29", "20:59"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:46", "05:26", "12:33", "16:23", "19:31", "21:01"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:44", "05:24", "12:33", "16:24", "19:32", "21:02"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:43", "05:23", "12:33", "16:24", "19:34", "21:04"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:41", "05:21", "12:32", "16:25", "19:35", "21:05"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"03:39", "05:19", "12:32", "16:25", "19:37", "21:07"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:37", "05:17", "12:32", "16:26", "19:38", "21:08"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:35", "05:15", "12:32", "16:26", "19:39", "21:09"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:33", "05:13", "12:32", "16:27", "19:41", "21:11"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:32", "05:12", "12:31", "16:27", "19:42", "21:12"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:30", "05:10", "12:31", "16:28", "19:44", "21:14"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:28", "05:08", "12:31", "16:29", "19:45", "21:15"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"03:26", "05:06", "12:31", "16:29", "19:47", "21:17"};
            } else {
                list_time_prayer = new String[]{"03:25", "05:05", "12:31", "16:30", "19:48", "21:18"};
            }

            /*--------------БАЗА на месяц "МАЙ"---------------*/
        } else if(current_mouth == 5) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"03:23", "05:03", "12:31", "16:30", "19:50", "21:20"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"03:21", "05:01", "12:31", "16:31", "19:51", "21:21"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"03:20", "05:00", "12:31", "16:31", "19:52", "21:22"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"03:18", "04:58", "12:30", "16:32", "19:54", "21:24"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"03:16", "04:56", "12:30", "16:32", "19:55", "21:25"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"03:15", "04:55", "12:30", "16:33", "19:57", "21:27"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"03:13", "04:53", "12:30", "16:33", "19:58", "21:28"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"03:12", "04:52", "12:30", "16:34", "20:00", "21:30"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"03:10", "04:50", "12:30", "16:34", "20:01", "21:31"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"03:09", "04:49", "12:30", "16:35", "20:02", "21:32"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"03:07", "04:47", "12:30", "16:35", "20:04", "21:34"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"03:06", "04:46", "12:30", "16:36", "20:05", "21:35"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:04", "04:44", "12:30", "16:36", "20:06", "21:36"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:03", "04:43", "12:30", "16:37", "20:08", "21:38"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:02", "04:42", "12:30", "16:37", "20:09", "21:39"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:00", "04:40", "12:30", "16:38", "20:10", "21:40"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"02:59", "04:39", "12:30", "16:38", "20:12", "21:42"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"02:58", "04:38", "12:30", "16:39", "20:13", "21:43"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"02:57", "04:37", "12:30", "16:39", "20:14", "21:44"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"02:55", "04:35", "12:30", "16:40", "20:16", "21:46"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"02:54", "04:34", "12:30", "16:40", "20:17", "21:47"};
            } else if(current_day > 21 && current_day < 23)  {
                list_time_prayer = new String[]{"02:53", "04:33", "12:30", "16:40", "20:18", "21:49"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"02:52", "04:32", "12:30", "16:41", "20:19", "21:51"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"02:51", "04:31", "12:30", "16:41", "20:20", "21:53"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"02:50", "04:30", "12:31", "16:42", "20:22", "21:56"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"02:49", "04:29", "12:31", "16:42", "20:23", "21:58"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"02:48", "04:28", "12:31", "16:43", "20:24", "22:00"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"02:47", "04:27", "12:31", "16:43", "20:25", "22:02"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"02:47", "04:27", "12:31", "16:43", "20:26", "22:04"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"02:46", "04:26", "12:31", "16:44", "20:27", "22:06"};
            } else {
                list_time_prayer = new String[]{"02:45", "04:25", "12:31", "16:44", "20:28", "22:08"};
            }

            /*--------------БАЗА на месяц "ИЮНЬ"---------------*/
        } else if(current_mouth == 6) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"02:44", "04:24", "12:31", "16:45", "20:29", "22:09"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"02:44", "04:24", "12:32", "16:45", "20:30", "22:10"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"02:43", "04:23", "12:32", "16:45", "20:31", "22:11"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"02:42", "04:22", "12:32", "16:46", "20:32", "22:12"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"02:42", "04:22", "12:32", "16:46", "20:33", "22:13"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"02:41", "04:21", "12:32", "16:46", "20:34", "22:14"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"02:41", "04:21", "12:32", "16:47", "20:34", "22:14"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"02:41", "04:21", "12:33", "16:47", "20:35", "22:15"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"02:40", "04:20", "12:33", "16:48", "20:36", "22:16"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"02:40", "04:20", "12:33", "16:48", "20:37", "22:17"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"02:40", "04:20", "12:33", "16:48", "20:37", "22:17"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"02:39", "04:19", "12:33", "16:49", "20:38", "22:18"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"02:39", "04:19", "12:34", "16:49", "20:38", "22:18"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"02:39", "04:19", "12:34", "16:49", "20:39", "22:19"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"02:39", "04:19", "12:34", "16:49", "20:39", "22:19"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"02:39", "04:19", "12:34", "16:50", "20:40", "22:20"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"02:39", "04:19", "12:35", "16:50", "20:40", "22:20"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"02:39", "04:19", "12:35", "16:50", "20:41", "22:21"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"02:39", "04:19", "12:35", "16:50", "20:41", "22:21"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"02:39", "04:19", "12:35", "16:51", "20:41", "22:21"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"02:39", "04:19", "12:35", "16:51", "20:41", "22:21"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"02:39", "04:19", "12:36", "16:51", "20:42", "22:22"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"02:40", "04:20", "12:36", "16:51", "20:42", "22:22"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"02:40", "04:20", "12:36", "16:51", "20:42", "22:22"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"02:40", "04:20", "12:36", "16:52", "20:42", "22:22"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"02:41", "04:21", "12:36", "16:52", "20:42", "22:22"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"02:41", "04:21", "12:37", "16:52", "20:42", "22:22"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"02:42", "04:22", "12:37", "16:52", "20:42", "22:22"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"02:42", "04:22", "12:37", "16:52", "20:42", "22:22"};
            } else {
                list_time_prayer = new String[]{"02:43", "04:23", "12:37", "16:52", "20:42", "22:22"};
            }

            /*--------------БАЗА на месяц "ИЮЛЬ"---------------*/
        } else if(current_mouth == 7) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"02:43", "04:23", "12:37", "16:52", "20:41", "22:21"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"02:44", "04:24", "12:38", "16:52", "20:41", "22:21"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"02:45", "04:25", "12:38", "16:52", "20:41", "22:21"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"02:45", "04:25", "12:38", "16:52", "20:40", "22:20"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"02:46", "04:26", "12:38", "16:52", "20:40", "22:20"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"02:47", "04:27", "12:38", "16:52", "20:40", "22:20"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"02:48", "04:28", "12:39", "16:52", "20:39", "22:19"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"02:48", "04:28", "12:39", "16:52", "20:39", "22:19"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"02:49", "04:29", "12:39", "16:52", "20:38", "22:18"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"02:50", "04:30", "12:39", "16:52", "20:37", "22:17"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"02:51", "04:31", "12:39", "16:52", "20:37", "22:17"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"02:52", "04:32", "12:39", "16:52", "20:36", "22:16"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"02:53", "04:33", "12:39", "16:52", "20:35", "22:15"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"02:54", "04:34", "12:39", "16:52", "20:34", "22:14"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"02:55", "04:35", "12:40", "16:51", "20:34", "22:14"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"02:56", "04:36", "12:40", "16:51", "20:33", "22:13"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"02:57", "04:37", "12:40", "16:51", "20:32", "22:12"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"02:58", "04:38", "12:40", "16:51", "20:31", "22:11"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"02:59", "04:39", "12:40", "16:50", "20:30", "22:10"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:00", "04:40", "12:40", "16:50", "20:29", "22:09"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:02", "04:42", "12:40", "16:50", "20:28", "22:08"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"03:03", "04:43", "12:40", "16:49", "20:27", "22:07"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:04", "04:44", "12:40", "16:49", "20:25", "22:05"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:05", "04:45", "12:40", "16:49", "20:24", "22:04"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:06", "04:46", "12:40", "16:48", "20:23", "22:03"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:08", "04:48", "12:40", "16:48", "20:22", "22:02"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:09", "04:49", "12:40", "16:47", "20:21", "22:01"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:10", "04:50", "12:40", "16:47", "20:19", "21:59"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"03:11", "04:51", "12:40", "16:46", "20:18", "21:58"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"03:13", "04:53", "12:40", "16:46", "20:17", "21:57"};
            } else {
                list_time_prayer = new String[]{"03:14", "04:54", "12:40", "16:45", "20:15", "21:55"};
            }

            /*--------------БАЗА на месяц "АВГУСТ"---------------*/
        } else if(current_mouth == 8) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"03:15", "04:55", "12:40", "16:45", "20:14", "21:54"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"03:17", "04:57", "12:40", "16:44", "20:12", "21:52"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"03:18", "04:58", "12:40", "16:44", "20:11", "21:51"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"03:19", "04:59", "12:40", "16:43", "20:09", "21:49"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"03:21", "05:01", "12:40", "16:42", "20:08", "21:48"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"03:22", "05:02", "12:40", "16:42", "20:06", "21:46"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"03:23", "05:03", "12:39", "16:41", "20:05", "21:45"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"03:25", "05:05", "12:39", "16:40", "20:03", "21:43"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"03:26", "05:06", "12:39", "16:39", "20:01", "21:41"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"03:28", "05:08", "12:39", "16:39", "20:00", "21:40"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"03:29", "05:09", "12:39", "16:38", "19:58", "21:38"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"03:30", "05:10", "12:39", "16:37", "19:56", "21:36"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:32", "05:12", "12:39", "16:36", "19:54", "21:34"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:33", "05:13", "12:38", "16:35", "19:53", "21:33"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:34", "05:14", "12:38", "16:34", "19:51", "21:31"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:36", "05:16", "12:38", "16:33", "19:49", "21:29"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:38", "05:18", "12:38", "16:33", "19:49", "21:29"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:39", "05:19", "12:38", "16:32", "19:46", "21:26"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:40", "05:20", "12:37", "16:31", "19:44", "21:24"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:41", "05:21", "12:37", "16:30", "19:42", "21:22"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:43", "05:23", "12:37", "16:29", "19:40", "21:20"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"03:44", "05:24", "12:37", "16:28", "19:38", "21:18"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:45", "05:25", "12:36", "16:27", "19:36", "21:16"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:47", "05:27", "12:36", "16:25", "19:34", "21:14"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:48", "05:28", "12:36", "16:24", "19:32", "21:12"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:50", "05:30", "12:36", "16:23", "19:30", "21:10"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:51", "05:31", "12:35", "16:22", "19:28", "21:08"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:52", "05:32", "12:35", "16:21", "19:26", "21:06"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"03:54", "05:34", "12:35", "16:20", "19:25", "21:05"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"03:55", "05:35", "12:34", "16:19", "19:23", "21:03"};
            } else {
                list_time_prayer = new String[]{"03:57", "05:37", "12:34", "16:17", "19:21", "21:01"};
            }

            /*--------------БАЗА на месяц "СЕНТЯБРЬ"---------------*/
        } else if(current_mouth == 9) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"03:58", "05:38", "12:34", "16:16", "19:19", "20:59"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"03:59", "05:39", "12:33", "16:15", "19:17", "20:56"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:01", "05:41", "12:33", "16:14", "19:14", "20:53"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:02", "05:42", "12:33", "16:13", "19:12", "20:49"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:03", "05:43", "12:32", "16:11", "19:10", "20:46"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:05", "05:45", "12:32", "16:10", "19:08", "20:43"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:06", "05:46", "12:32", "16:09", "19:06", "20:40"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:08", "05:48", "12:31", "16:07", "19:04", "20:37"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:09", "05:49", "12:31", "16:06", "19:02", "20:34"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:10", "05:50", "12:31", "16:05", "19:00", "20:31"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:12", "05:52", "12:30", "16:03", "18:58", "20:28"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:13", "05:53", "12:30", "16:02", "18:56", "20:26"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:14", "05:54", "12:30", "16:01", "18:54", "20:24"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:16", "05:56", "12:29", "15:59", "18:52", "20:22"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:17", "05:57", "12:29", "15:58", "18:50", "20:20"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:19", "05:59", "12:29", "15:56", "18:48", "20:18"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:20", "06:00", "12:28", "15:55", "18:46", "20:16"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:21", "06:01", "12:28", "15:53", "18:44", "20:14"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:23", "06:03", "12:28", "15:52", "18:41", "20:11"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:24", "06:04", "12:27", "15:51", "18:39", "20:09"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:25", "06:05", "12:27", "15:49", "18:37", "20:07"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:27", "06:07", "12:26", "15:48", "18:35", "20:05"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:28", "06:08", "12:26", "15:46", "18:33", "20:03"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:29", "06:09", "12:26", "15:46", "18:31", "20:01"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:30", "06:10", "12:25", "15:44", "18:29", "19:59"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:32", "06:12", "12:25", "15:42", "18:27", "19:57"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:34", "06:14", "12:25", "15:40", "18:25", "19:55"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"04:35", "06:15", "12:24", "15:39", "18:23", "19:53"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:37", "06:17", "12:24", "15:37", "18:21", "19:51"};
            } else {
                list_time_prayer = new String[]{"04:38", "06:18", "12:24", "15:36", "18:19", "19:49"};
            }

            /*--------------БАЗА на месяц "ОКТЯБРЬ"---------------*/
        } else if(current_mouth == 10) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:39", "06:19", "12:23", "15:34", "18:17", "19:47"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:41", "06:21", "12:23", "15:33", "18:15", "19:45"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:42", "06:22", "12:23", "15:31", "18:13", "19:43"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:44", "06:24", "12:22", "15:29", "18:10", "19:40"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:45", "06:25", "12:22", "15:28", "18:08", "19:38"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:46", "06:26", "12:22", "15:26", "18:06", "19:36"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:48", "06:28", "12:22", "15:25", "18:04", "19:34"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:49", "06:29", "12:21", "15:23", "18:02", "19:32"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:51", "06:31", "12:21", "15:22", "18:00", "19:30"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:52", "06:32", "12:21", "15:20", "17:59", "19:29"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:54", "06:34", "12:20", "15:19", "17:57", "19:27"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:55", "06:35", "12:20", "15:17", "17:55", "19:25"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:56", "06:36", "12:20", "15:16", "17:53", "19:23"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:58", "06:38", "12:20", "15:14", "17:51", "19:21"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:59", "06:39", "12:20", "15:13", "17:49", "19:19"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:01", "06:41", "12:19", "15:11", "17:47", "19:17"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:02", "06:42", "12:19", "15:10", "17:45", "19:15"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:04", "06:44", "12:19", "15:08", "17:43", "19:13"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:05", "06:45", "12:19", "15:07", "17:41", "19:11"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:07", "06:47", "12:19", "15:05", "17:40", "19:10"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:08", "06:48", "12:18", "15:04", "17:38", "19:08"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:10", "06:50", "12:18", "15:03", "17:36", "19:06"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:11", "06:51", "12:18", "15:01", "17:34", "19:04"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:13", "06:53", "12:18", "15:00", "17:32", "19:02"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:14", "05:54", "11:18", "13:58", "16:31", "18:01"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:16", "05:56", "11:18", "13:57", "16:29", "17:59"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:17", "05:57", "11:18", "13:56", "16:27", "17:57"};/* Перевод часов на (1 час назад) последней субботы начиная с воскресенья (27.10.2019 г.) этого месяца*/
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"04:19", "05:59", "11:18", "13:54", "16:26", "17:56"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:20", "06:00", "11:17", "13:53", "16:24", "17:54"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"04:22", "06:02", "11:17", "13:52", "16:22", "17:52"};
            } else {
                list_time_prayer = new String[]{"04:23", "06:03", "11:17", "13:50", "16:21", "17:51"};
            }

            /*--------------БАЗА на месяц "НОЯБРЬ"---------------*/
        } else if(current_mouth == 11) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:25", "06:05", "11:17", "13:49", "16:19", "17:49"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:26", "06:06", "11:17", "13:48", "16:18", "17:48"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:28", "06:08", "11:17", "13:47", "16:16", "17:46"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:29", "06:09", "11:17", "13:45", "16:15", "17:45"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:31", "06:11", "11:17", "13:44", "16:13", "17:43"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:32", "06:12", "11:17", "13:43", "16:12", "17:42"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:34", "06:14", "11:17", "13:42", "16:10", "17:40"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:35", "06:15", "11:17", "13:41", "16:09", "17:39"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:37", "06:17", "11:18", "13:40", "16:08", "17:38"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:38", "06:18", "11:18", "13:39", "16:06", "17:36"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:40", "06:20", "11:18", "13:38", "16:05", "17:35"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:41", "06:21", "11:18", "13:37", "16:04", "17:34"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:43", "06:23", "11:18", "13:36", "16:03", "17:33"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:44", "06:24", "11:18", "13:35", "16:01", "17:31"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:46", "06:26", "11:18", "13:34", "16:00", "17:30"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:47", "06:27", "11:18", "13:33", "15:59", "17:29"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:49", "06:29", "11:19", "13:32", "15:58", "17:28"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:50", "06:30", "11:19", "13:31", "15:57", "17:27"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:52", "06:32", "11:19", "13:30", "15:56", "17:26"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:53", "06:33", "11:19", "13:30", "15:55", "17:25"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:55", "06:35", "11:20", "13:29", "15:54", "17:24"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:56", "06:36", "11:20", "13:28", "15:53", "17:23"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:57", "06:37", "11:20", "13:28", "15:52", "17:22"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:59", "06:39", "11:20", "13:27", "15:51", "17:21"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:00", "06:40", "11:21", "13:26", "15:51", "17:21"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:01", "06:41", "11:21", "13:26", "15:50", "17:20"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:03", "06:43", "11:21", "13:25", "15:49", "17:19"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:04", "06:44", "11:22", "13:25", "15:49", "17:19"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:05", "06:45", "11:22", "13:25", "15:48", "17:18"};
            } else {
                list_time_prayer = new String[]{"05:07", "06:47", "11:22", "13:24", "15:48", "17:18"};
            }

            /*--------------БАЗА на месяц "ДЕКАБРЬ"---------------*/
        } else {
            if(current_day < 2) {
                list_time_prayer = new String[]{"05:08", "06:48", "11:23", "13:24", "15:47", "17:17"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:09", "06:49", "11:23", "13:24", "15:47", "17:17"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:10", "06:50", "11:23", "13:23", "15:46", "17:16"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:12", "06:52", "11:24", "13:23", "15:46", "17:16"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:13", "06:53", "11:24", "13:23", "15:46", "17:16"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:14", "06:54", "11:25", "13:23", "15:45", "17:15"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:14", "06:54", "11:25", "13:23", "15:45", "17:15"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:16", "06:56", "11:26", "13:23", "15:45", "17:15"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:17", "06:57", "11:26", "13:23", "15:45", "17:15"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:18", "06:58", "11:26", "13:23", "15:45", "17:15"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:19", "06:59", "11:27", "13:23", "15:45", "17:15"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:20", "07:00", "11:27", "13:23", "15:45", "17:15"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:21", "07:01", "11:28", "13:23", "15:45", "17:15"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:22", "07:02", "11:28", "13:23", "15:45", "17:15"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:22", "07:02", "11:29", "13:24", "15:45", "17:15"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:23", "07:03", "11:29", "13:24", "15:45", "17:15"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:24", "07:04", "11:30", "13:24", "15:46", "17:16"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:24", "07:04", "11:30", "13:25", "15:46", "17:16"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:25", "07:05", "11:31", "13:25", "15:46", "17:16"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:26", "07:06", "11:31", "13:25", "15:47", "17:17"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:26", "07:06", "11:32", "13:26", "15:47", "17:17"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:27", "07:07", "11:32", "13:26", "15:48", "17:18"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:27", "07:07", "11:33", "13:27", "15:48", "17:18"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:28", "07:08", "11:33", "13:28", "15:49", "17:19"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:28", "07:08", "11:34", "13:28", "15:49", "17:19"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:28", "07:08", "11:34", "13:29", "15:50", "17:20"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:29", "07:09", "11:35", "13:30", "15:51", "17:21"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:29", "07:09", "11:35", "13:30", "15:51", "17:21"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:29", "07:09", "11:36", "13:31", "15:52", "17:22"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"05:29", "07:09", "11:36", "13:32", "15:53", "17:23"};
            } else {
                list_time_prayer = new String[]{"05:29", "07:09", "11:37", "13:33", "15:54", "17:24"};
            }
        }

        return list_time_prayer;
    }

}
