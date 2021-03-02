package com.example.muslimprayertime;

public class harkov {

    String[] get_time_prayer(Integer current_mouth, Integer current_day) {

        String[] list_time_prayer = new String[]{};

        /*--------------БАЗА на месяц "ЯНВАРЬ"- изменяется автоматически каждый год с учетом "ГРИГОРИАНСКОГО" (СОЛНЕЧНОГО) КАЛЕНДАРЯ--------------*/
        if(current_mouth == 1) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"05:44", "07:24", "11:44", "13:32", "15:53", "17:23"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:44", "07:24", "11:44", "13:33", "15:54", "17:24"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:44", "07:24", "11:44", "13:34", "15:55", "17:25"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:43", "07:23", "11:45", "13:35", "15:57", "17:27"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:43", "07:23", "11:45", "13:36", "15:58", "17:28"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:43", "07:23", "11:46", "13:37", "15:59", "17:29"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:43", "07:23", "11:46", "13:38", "16:00", "17:30"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:42", "07:22", "11:47", "13:39", "16:01", "17:31"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:42", "07:22", "11:47", "13:40", "16:03", "17:33"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:41", "07:21", "11:47", "13:41", "16:04", "17:34"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:41", "07:21", "11:48", "13:42", "16:05", "17:35"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:40", "07:20", "11:48", "13:44", "16:07", "17:37"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:40", "07:20", "11:49", "13:45", "16:08", "17:38"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:39", "07:19", "11:49", "13:46", "16:09", "17:39"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:39", "07:19", "11:49", "13:47", "16:11", "17:41"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:38", "07:18", "11:50", "13:49", "16:12", "17:42"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:37", "07:17", "11:50", "13:50", "16:14", "17:44"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:36", "07:16", "11:50", "13:51", "16:15", "17:45"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:35", "07:15", "11:51", "13:53", "16:17", "17:47"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:34", "07:14", "11:51", "13:54", "16:18", "17:48"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:33", "07:13", "11:51", "13:55", "16:20", "17:50"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:32", "07:12", "11:52", "13:57", "16:21", "17:51"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:31", "07:11", "11:52", "13:58", "16:23", "17:53"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:30", "07:10", "11:52", "13:59", "16:24", "17:54"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:29", "07:09", "11:52", "14:01", "16:26", "17:56"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:28", "07:08", "11:53", "14:02", "16:28", "17:58"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:27", "07:07", "11:53", "14:03", "16:29", "17:59"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:26", "07:06", "11:53", "14:05", "16:31", "18:01"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:24", "07:04", "11:53", "14:06", "16:33", "18:03"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"05:23", "07:03", "11:53", "14:07", "16:34", "18:04"};
            } else {
                list_time_prayer = new String[]{"05:20", "07:00", "11:53", "14:10", "16:37", "18:07"};
            }

            /*--------------БАЗА на месяц "ФЕВРАЛЬ", - "29" день необходимо добавить в ручную, т.к. это высокосный год и бывает раз в 4 года---------*/
        } else if(current_mouth == 2) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"05:20", "07:00", "11:54", "14:10", "16:38", "18:08"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:19", "06:59", "11:54", "14:12", "16:39", "18:09"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:17", "06:57", "11:54", "14:13", "16:41", "18:11"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:16", "06:56", "11:54", "14:14", "16:43", "18:13"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:14", "06:54", "11:54", "14:16", "16:44", "18:14"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:13", "06:53", "11:54", "14:17", "16:46", "18:16"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:11", "06:51", "11:54", "14:19", "16:48", "18:18"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:10", "06:50", "11:54", "14:20", "16:49", "18:19"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:08", "06:48", "11:54", "14:21", "16:51", "18:21"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:06", "06:46", "11:54", "14:23", "16:53", "18:23"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:05", "06:45", "11:54", "14:24", "16:54", "18:24"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:03", "06:43", "11:54", "14:25", "16:56", "18:26"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:01", "06:41", "11:54", "14:27", "16:58", "18:28"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:00", "06:40", "11:54", "14:28", "17:00", "18:30"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:58", "06:38", "11:54", "14:29", "17:01", "18:31"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:56", "06:36", "11:54", "14:31", "17:03", "18:33"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:54", "06:34", "11:54", "14:32", "17:05", "18:35"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:52", "06:32", "11:54", "14:33", "17:06", "18:36"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:51", "06:31", "11:54", "14:35", "17:08", "18:38"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:49", "06:29", "11:54", "14:36", "17:10", "18:40"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:47", "06:27", "11:54", "14:37", "17:11", "18:41"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:45", "06:25", "11:54", "14:38", "17:13", "18:43"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:43", "06:23", "11:53", "14:40", "17:15", "18:45"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:41", "06:21", "11:53", "14:41", "17:16", "18:46"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:39", "06:19", "11:53", "14:42", "17:18", "18:48"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:37", "06:17", "11:53", "14:43", "17:20", "18:50"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:35", "06:15", "11:53", "14:44", "17:21", "18:51"};

                /*------------------Разкоментировать эту строку указанную ниже, если наступил высокосный год, т.е. 29 Февраля 2016 года-------*/
			/*} else if(current_day > 27 && current_day < 29) {
				list_time_prayer = new String[]{"04:58", "06:38", "12:16", "15:06", "17:44", "19:14"};*/
            } else {
                list_time_prayer = new String[]{"04:33", "06:13", "11:53", "14:46", "17:23", "18:53"};
            }

            /*--------------БАЗА на месяц "МАРТ"---------------*/
        } else if(current_mouth == 3) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:31", "06:11", "11:52", "14:47", "17:25", "18:55"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:29", "06:09", "11:52", "14:48", "17:26", "18:56"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:27", "06:07", "11:52", "14:49", "17:28", "18:58"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:25", "06:05", "11:52", "14:50", "17:30", "19:00"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:23", "06:03", "11:52", "14:51", "17:31", "19:01"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:21", "06:01", "11:51", "14:53", "17:33", "19:03"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:19", "05:59", "11:51", "14:54", "17:34", "19:04"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:16", "05:56", "11:51", "14:55", "17:36", "19:06"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:14", "05:54", "11:51", "14:56", "17:38", "19:08"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:12", "05:52", "11:50", "14:57", "17:39", "19:09"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:10", "05:50", "11:50", "14:58", "17:41", "19:11"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:08", "05:48", "11:50", "14:59", "17:43", "19:13"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:06", "05:46", "11:50", "15:00", "17:44", "19:14"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:04", "05:44", "11:49", "15:01", "17:46", "19:16"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:02", "05:42", "11:49", "15:02", "17:47", "19:17"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:59", "05:39", "11:49", "15:03", "17:49", "19:19"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:57", "05:37", "11:48", "15:04", "17:51", "19:21"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:55", "05:35", "11:48", "15:05", "17:52", "19:22"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:53", "05:33", "11:48", "15:06", "17:54", "19:24"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:51", "05:31", "11:48", "15:07", "17:56", "19:26"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:49", "05:29", "11:47", "15:08", "17:57", "19:27"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"03:46", "05:26", "11:47", "15:09", "17:59", "19:29"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:44", "05:24", "11:47", "15:10", "18:00", "19:30"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:42", "05:22", "11:46", "15:11", "18:02", "19:32"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:40", "05:20", "11:46", "15:12", "18:03", "19:33"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:38", "05:18", "11:46", "15:12", "18:05", "19:35"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:35", "05:15", "11:45", "15:13", "18:06", "19:36"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:33", "05:13", "11:45", "15:14", "18:08", "19:38"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:31", "06:11", "12:45", "16:15", "19:10", "20:40"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"04:29", "06:09", "12:45", "16:16", "19:11", "20:41"};
            } else {
                list_time_prayer = new String[]{"04:27", "06:07", "12:44", "16:17", "19:13", "20:43"};/* Перевод часов на (1 час вперед) в последнее воскресенье этого месяца, т.е. с последней (субботы на воскресенье) (31.03.2019 г.) */
            }

            /*--------------БАЗА на месяц "АПРЕЛЬ"---------------*/
        } else if(current_mouth == 4) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:25", "06:05", "12:44", "16:17", "19:14", "20:44"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:22", "06:02", "12:44", "16:18", "19:16", "20:46"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:20", "06:00", "12:43", "16:19", "19:17", "20:47"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:18", "05:58", "12:43", "16:20", "19:19", "20:49"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:16", "05:56", "12:43", "16:21", "19:21", "20:51"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:14", "05:54", "12:42", "16:21", "19:22", "20:52"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:12", "05:52", "12:42", "16:22", "19:24", "20:54"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:09", "05:49", "12:42", "16:23", "19:25", "20:55"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:07", "05:47", "12:42", "16:24", "19:27", "20:57"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:05", "05:45", "12:41", "16:24", "19:29", "20:59"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:03", "05:43", "12:41", "16:25", "19:30", "21:00"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:01", "05:41", "12:41", "16:26", "19:32", "21:02"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:59", "05:39", "12:41", "16:27", "19:33", "21:03"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:57", "05:37", "12:40", "16:27", "19:35", "21:05"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:55", "05:35", "12:40", "16:28", "19:37", "21:07"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:53", "05:33", "12:40", "16:29", "19:38", "21:08"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:51", "05:31", "12:40", "16:29", "19:40", "21:10"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:48", "05:28", "12:39", "16:30", "19:41", "21:11"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:46", "05:26", "12:39", "16:31", "19:43", "21:13"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:44", "05:24", "12:39", "16:32", "19:44", "21:14"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:42", "05:22", "12:39", "16:32", "19:46", "21:16"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"03:40", "05:20", "12:39", "16:33", "19:48", "21:18"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:38", "05:18", "12:38", "16:33", "19:49", "21:19"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:37", "05:17", "12:38", "16:34", "19:51", "21:21"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:35", "05:15", "12:38", "16:35", "19:52", "21:22"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:33", "05:13", "12:38", "16:35", "19:54", "21:24"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:31", "05:11", "12:38", "16:36", "19:56", "21:26"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:29", "05:09", "12:37", "16:37", "19:57", "21:27"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"03:27", "05:07", "12:37", "16:37", "19:59", "21:29"};
            } else {
                list_time_prayer = new String[]{"03:25", "05:05", "12:37", "16:38", "20:00", "21:30"};
            }

            /*--------------БАЗА на месяц "МАЙ"---------------*/
        } else if(current_mouth == 5) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"03:23", "05:03", "12:37", "16:38", "20:02", "21:32"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"03:22", "05:02", "12:37", "16:39", "20:03", "21:33"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"03:20", "05:00", "12:37", "16:40", "20:05", "21:35"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"03:18", "04:58", "12:37", "16:40", "20:07", "21:37"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"03:16", "04:56", "12:37", "16:41", "20:08", "21:38"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"03:15", "04:55", "12:37", "16:41", "20:10", "21:40"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"03:13", "04:53", "12:37", "16:42", "20:11", "21:41"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"03:11", "04:51", "12:36", "16:43", "20:13", "21:43"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"03:10", "04:50", "12:36", "16:43", "20:14", "21:44"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"03:08", "04:48", "12:36", "16:44", "20:16", "21:46"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"03:06", "04:46", "12:36", "16:44", "20:17", "21:47"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"03:05", "04:45", "12:36", "16:45", "20:19", "21:49"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:04", "04:44", "12:36", "16:45", "20:20", "21:50"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:02", "04:42", "12:36", "16:46", "20:22", "21:52"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:00", "04:40", "12:36", "16:46", "20:23", "21:53"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"02:59", "04:39", "12:36", "16:47", "20:25", "21:55"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"02:58", "04:38", "12:36", "16:47", "20:26", "21:56"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"02:56", "04:36", "12:36", "16:48", "20:27", "21:57"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"02:55", "04:35", "12:36", "16:49", "20:29", "21:59"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"02:54", "04:34", "12:36", "16:49", "20:30", "22:00"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"02:52", "04:32", "12:37", "16:50", "20:32", "22:02"};
            } else if(current_day > 21 && current_day < 23)  {
                list_time_prayer = new String[]{"02:51", "04:31", "12:37", "16:50", "20:33", "22:04"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"02:50", "04:30", "12:37", "16:51", "20:34", "22:06"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"02:49", "04:29", "12:37", "16:51", "20:35", "22:08"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"02:48", "04:28", "12:37", "16:51", "20:37", "22:11"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"02:47", "04:27", "12:37", "16:52", "20:38", "22:13"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"02:46", "04:26", "12:37", "16:52", "20:39", "22:15"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"02:45", "04:25", "12:37", "16:53", "20:40", "22:17"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"02:44", "04:24", "12:37", "16:53", "20:42", "22:20"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"02:43", "04:23", "12:37", "16:54", "20:43", "22:22"};
            } else {
                list_time_prayer = new String[]{"02:42", "04:22", "12:38", "16:54", "20:44", "22:24"};
            }

            /*--------------БАЗА на месяц "ИЮНЬ"---------------*/
        } else if(current_mouth == 6) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"02:41", "04:21", "12:38", "16:55", "20:45", "22:25"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"02:41", "04:21", "12:38", "16:55", "20:46", "22:26"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"02:40", "04:20", "12:38", "16:56", "20:47", "22:27"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"02:39", "04:19", "12:38", "16:56", "20:48", "22:28"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"02:38", "04:18", "12:38", "16:56", "20:49", "22:29"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"02:38", "04:18", "12:39", "16:56", "20:50", "22:30"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"02:37", "04:17", "12:39", "16:57", "20:51", "22:31"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"02:37", "04:17", "12:39", "16:57", "20:51", "22:31"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"02:37", "04:17", "12:39", "16:57", "20:52", "22:32"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"02:36", "04:16", "12:39", "16:58", "20:53", "22:33"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"02:36", "04:16", "12:40", "16:58", "20:54", "22:34"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"02:36", "04:16", "12:40", "16:59", "20:54", "22:34"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"02:35", "04:15", "12:40", "16:59", "20:55", "22:35"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"02:35", "04:15", "12:40", "16:59", "20:55", "22:35"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"02:35", "04:15", "12:40", "16:59", "20:56", "22:36"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"02:35", "04:15", "12:41", "17:00", "20:56", "22:36"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"02:35", "04:15", "12:41", "17:00", "20:57", "22:37"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"02:35", "04:15", "12:41", "17:00", "20:57", "22:37"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"02:35", "04:15", "12:41", "17:01", "20:58", "22:38"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"02:35", "04:15", "12:41", "17:01", "20:58", "22:38"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"02:35", "04:15", "12:42", "17:01", "20:58", "22:38"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"02:35", "04:15", "12:42", "17:01", "20:58", "22:38"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"02:36", "04:16", "12:42", "17:02", "20:58", "22:38"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"02:36", "04:16", "12:42", "17:02", "20:58", "22:38"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"02:36", "04:16", "12:43", "17:02", "20:58", "22:38"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"02:37", "04:17", "12:43", "17:02", "20:58", "22:38"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"02:37", "04:17", "12:43", "17:02", "20:58", "22:38"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"02:38", "04:18", "12:43", "17:02", "20:58", "22:38"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"02:38", "04:18", "12:43", "17:02", "20:58", "22:38"};
            } else {
                list_time_prayer = new String[]{"02:39", "04:19", "12:44", "17:03", "20:58", "22:38"};
            }

            /*--------------БАЗА на месяц "ИЮЛЬ"---------------*/
        } else if(current_mouth == 7) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"02:39", "04:19", "12:44", "17:03", "20:58", "22:38"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"02:40", "04:20", "12:44", "17:03", "20:57", "22:37"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"02:41", "04:21", "12:44", "17:03", "20:57", "22:37"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"02:42", "04:22", "12:44", "17:03", "20:57", "22:37"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"02:42", "04:22", "12:44", "17:03", "20:56", "22:36"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"02:43", "04:23", "12:45", "17:03", "20:56", "22:36"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"02:44", "04:24", "12:45", "17:02", "20:55", "22:35"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"02:45", "04:25", "12:45", "17:02", "20:54", "22:34"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"02:46", "04:26", "12:45", "17:02", "20:54", "22:34"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"02:47", "04:27", "12:45", "17:02", "20:53", "22:33"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"02:48", "04:28", "12:45", "17:02", "20:52", "22:32"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"02:49", "04:29", "12:46", "17:02", "20:52", "22:32"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"02:50", "04:30", "12:46", "17:02", "20:51", "22:31"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"02:51", "04:31", "12:46", "17:01", "20:50", "22:30"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"02:52", "04:32", "12:46", "17:01", "20:49", "22:29"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"02:53", "04:33", "12:46", "17:01", "20:48", "22:28"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"02:54", "04:34", "12:46", "17:01", "20:47", "22:27"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"02:56", "04:36", "12:46", "17:00", "20:46", "22:26"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"02:57", "04:37", "12:46", "17:00", "20:45", "22:25"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"02:58", "04:38", "12:46", "17:00", "20:44", "22:24"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"02:59", "04:39", "12:46", "16:59", "20:43", "22:23"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"03:01", "04:41", "12:46", "16:59", "20:41", "22:21"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:02", "04:42", "12:46", "16:59", "20:40", "22:20"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:03", "04:43", "12:46", "16:58", "20:39", "22:19"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:05", "04:45", "12:46", "16:58", "20:37", "22:17"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:06", "04:46", "12:46", "16:57", "20:36", "22:16"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:07", "04:47", "12:46", "16:57", "20:35", "22:15"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:09", "04:49", "12:46", "16:56", "20:33", "22:13"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"03:10", "04:50", "12:46", "16:56", "20:32", "22:12"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"03:12", "04:52", "12:46", "16:55", "20:30", "22:10"};
            } else {
                list_time_prayer = new String[]{"03:13", "04:53", "12:46", "16:54", "20:29", "22:09"};
            }

            /*--------------БАЗА на месяц "АВГУСТ"---------------*/
        } else if(current_mouth == 8) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"03:14", "04:54", "12:46", "16:54", "20:27", "22:07"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"03:16", "04:56", "12:46", "16:53", "20:26", "22:06"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"03:17", "04:57", "12:46", "16:52", "20:24", "22:04"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"03:19", "04:59", "12:46", "16:52", "20:22", "22:02"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"03:20", "05:00", "12:46", "16:51", "20:21", "22:01"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"03:22", "05:02", "12:46", "16:50", "20:19", "21:59"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"03:23", "05:03", "12:46", "16:49", "20:17", "21:57"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"03:25", "05:05", "12:46", "16:49", "20:16", "21:56"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"03:26", "05:06", "12:45", "16:48", "20:14", "21:54"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"03:28", "05:08", "12:45", "16:47", "20:12", "21:52"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"03:29", "05:09", "12:45", "16:46", "20:10", "21:50"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"03:31", "05:11", "12:45", "16:45", "20:08", "21:48"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:32", "05:12", "12:45", "16:44", "20:06", "21:46"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:34", "05:14", "12:45", "16:43", "20:05", "21:45"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:35", "05:15", "12:44", "16:42", "20:03", "21:43"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:37", "05:17", "12:44", "16:41", "20:01", "21:41"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:40", "05:20", "12:44", "16:40", "20:00", "21:40"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:40", "05:20", "12:44", "16:39", "19:57", "21:37"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:41", "05:21", "12:44", "16:38", "19:55", "21:35"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:43", "05:23", "12:43", "16:37", "19:53", "21:33"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:44", "05:24", "12:43", "16:36", "19:51", "21:31"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"03:46", "05:26", "12:43", "16:35", "19:49", "21:29"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:47", "05:27", "12:43", "16:34", "19:47", "21:27"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:49", "05:29", "12:42", "16:33", "19:45", "21:25"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:50", "05:30", "12:42", "16:32", "19:43", "21:23"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:52", "05:32", "12:42", "16:30", "19:41", "21:21"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:53", "05:33", "12:42", "16:29", "19:40", "21:20"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:55", "05:35", "12:41", "16:28", "19:37", "21:17"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"03:56", "05:36", "12:41", "16:27", "19:34", "21:14"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"03:58", "05:38", "12:41", "16:25", "19:32", "21:12"};
            } else {
                list_time_prayer = new String[]{"03:59", "05:39", "12:40", "16:24", "19:30", "21:10"};
            }

            /*--------------БАЗА на месяц "СЕНТЯБРЬ"---------------*/
        } else if(current_mouth == 9) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:01", "05:41", "12:40", "16:23", "19:28", "21:08"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:02", "05:42", "12:40", "16:21", "19:26", "21:07"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:04", "05:44", "12:39", "16:20", "19:24", "21:02"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:05", "05:45", "12:39", "16:19", "19:22", "20:59"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:07", "05:47", "12:39", "16:17", "19:19", "20:55"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:08", "05:48", "12:38", "16:16", "19:17", "20:52"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:10", "05:50", "12:38", "16:15", "19:15", "20:49"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:11", "05:51", "12:38", "16:13", "19:13", "20:46"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:13", "05:53", "12:37", "16:12", "19:11", "20:43"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:14", "05:54", "12:37", "16:10", "19:09", "20:40"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:16", "05:56", "12:37", "16:09", "19:06", "20:36"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:17", "05:57", "12:36", "16:07", "19:04", "20:34"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:19", "05:59", "12:36", "16:06", "19:02", "20:32"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:20", "06:00", "12:36", "16:04", "19:00", "20:30"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:22", "06:02", "12:35", "16:03", "18:58", "20:28"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:23", "06:03", "12:35", "16:01", "18:55", "20:25"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:25", "06:05", "12:35", "16:00", "18:53", "20:23"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:26", "06:06", "12:34", "15:58", "18:51", "20:21"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:28", "06:08", "12:34", "15:57", "18:49", "20:19"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:29", "06:09", "12:33", "16:55", "18:46", "20:16"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:31", "06:11", "12:33", "15:54", "18:44", "20:14"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:32", "06:12", "12:33", "15:52", "18:42", "20:12"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:34", "06:14", "12:32", "15:51", "18:40", "20:10"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:36", "06:16", "12:32", "15:50", "18:38", "20:08"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:38", "06:18", "12:32", "15:48", "18:36", "20:06"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:39", "06:19", "12:31", "15:46", "18:33", "20:03"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:40", "06:20", "12:31", "15:44", "18:31", "20:01"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"04:42", "06:22", "12:31", "15:43", "18:29", "19:59"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:43", "06:23", "12:30", "15:41", "18:27", "19:57"};
            } else {
                list_time_prayer = new String[]{"04:45", "06:25", "12:30", "15:39", "18:25", "19:55"};
            }

            /*--------------БАЗА на месяц "ОКТЯБРЬ"---------------*/
        } else if(current_mouth == 10) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:46", "06:26", "12:30", "15:38", "18:22", "19:52"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:48", "06:28", "12:29", "15:36", "18:20", "19:50"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:49", "06:29", "12:29", "15:35", "18:18", "19:48"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:51", "06:31", "12:29", "15:33", "18:16", "19:46"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:52", "06:32", "12:28", "15:31", "18:14", "19:44"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:54", "06:34", "12:28", "15:30", "18:12", "19:42"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:55", "06:35", "12:28", "15:28", "18:09", "19:39"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:57", "06:37", "12:28", "15:26", "18:07", "19:37"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:58", "06:38", "12:27", "15:25", "18:05", "19:35"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:00", "06:40", "12:27", "15:23", "18:03", "19:33"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:02", "06:42", "12:27", "15:22", "18:01", "19:31"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:03", "06:43", "12:27", "15:20", "17:59", "19:29"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:05", "06:45", "12:26", "15:18", "17:57", "19:27"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:06", "06:46", "12:26", "15:17", "17:55", "19:25"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:08", "06:48", "12:26", "15:15", "17:53", "19:23"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:09", "06:49", "12:26", "15:14", "17:51", "19:21"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:11", "06:51", "12:25", "15:12", "17:49", "19:19"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:13", "06:53", "12:25", "15:10", "17:47", "19:17"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:14", "06:54", "12:25", "15:09", "17:45", "19:15"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:16", "06:56", "12:25", "15:07", "17:43", "19:13"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:17", "06:57", "12:25", "15:06", "17:41", "19:11"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:19", "06:59", "12:24", "15:04", "17:39", "19:09"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:21", "07:01", "12:24", "15:03", "17:37", "19:07"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:22", "07:02", "12:24", "15:01", "17:35", "19:05"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:24", "06:04", "11:24", "14:00", "16:34", "18:04"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:26", "06:06", "11:24", "13:58", "16:32", "18:02"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:27", "06:07", "11:24", "13:57", "16:30", "18:00"};/* Перевод часов на (1 час назад) последней субботы начиная с воскресенья (27.10.2019 г.) этого месяца*/
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"04:29", "06:09", "11:24", "13:55", "16:28", "17:58"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:30", "06:10", "11:24", "13:54", "16:26", "17:56"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"04:32", "06:12", "11:24", "13:53", "16:25", "17:55"};
            } else {
                list_time_prayer = new String[]{"04:34", "06:14", "11:24", "13:51", "16:23", "17:53"};
            }

            /*--------------БАЗА на месяц "НОЯБРЬ"---------------*/
        } else if(current_mouth == 11) {
            if(current_day < 2) {
                list_time_prayer = new String[]{"04:35", "06:15", "11:24", "13:50", "16:21", "17:51"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:37", "06:17", "11:24", "13:48", "16:19", "17:49"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:39", "06:19", "11:24", "13:47", "16:18", "17:48"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:40", "06:20", "11:24", "13:46", "16:16", "17:46"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:42", "06:22", "11:24", "13:45", "16:15", "17:45"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:44", "06:24", "11:24", "13:43", "16:13", "17:43"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:45", "06:25", "11:24", "13:42", "16:12", "17:42"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:47", "06:27", "11:24", "13:41", "16:10", "17:40"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:48", "06:28", "11:24", "13:40", "16:09", "17:39"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:50", "06:30", "11:24", "13:39", "16:07", "17:37"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:52", "06:32", "11:24", "13:37", "16:06", "17:36"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:53", "06:33", "11:24", "13:36", "16:04", "17:34"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:55", "06:35", "11:24", "13:35", "16:03", "17:33"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:56", "06:36", "11:24", "13:34", "16:02", "17:32"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:58", "06:38", "11:25", "13:33", "16:01", "17:31"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:00", "06:40", "11:25", "13:32", "15:59", "17:29"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:01", "06:41", "11:25", "13:31", "15:58", "17:28"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:03", "06:43", "11:25", "13:31", "15:57", "17:27"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:04", "06:44", "11:25", "13:30", "15:56", "17:26"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:06", "06:46", "11:26", "13:29", "15:55", "17:25"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:07", "06:47", "11:26", "13:28", "15:54", "17:24"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:09", "06:49", "11:26", "13:27", "15:53", "17:23"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:10", "06:50", "11:26", "13:27", "15:52", "17:22"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:12", "06:52", "11:27", "13:26", "15:51", "17:21"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:13", "06:53", "11:27", "13:25", "15:50", "17:20"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:15", "06:55", "11:27", "13:25", "15:49", "17:19"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:16", "06:56", "11:28", "13:24", "15:49", "17:19"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:18", "06:58", "11:28", "13:24", "15:48", "17:18"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:19", "06:59", "11:28", "13:23", "15:47", "17:17"};
            } else {
                list_time_prayer = new String[]{"05:20", "07:00", "11:29", "13:23", "15:47", "17:17"};
            }

            /*--------------БАЗА на месяц "ДЕКАБРЬ"---------------*/
        } else {
            if(current_day < 2) {
                list_time_prayer = new String[]{"05:22", "07:02", "11:29", "13:22", "15:46", "17:16"};
            } else if(current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:23", "07:03", "11:29", "13:22", "15:45", "17:15"};
            } else if(current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:24", "07:04", "11:30", "13:22", "15:45", "17:15"};
            } else if(current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:25", "07:05", "11:30", "13:21", "15:45", "17:15"};
            } else if(current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:27", "07:07", "11:31", "13:21", "15:44", "17:14"};
            } else if(current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:28", "07:08", "11:31", "13:21", "15:44", "17:14"};
            } else if(current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:28", "07:08", "11:31", "13:21", "15:44", "17:14"};
            } else if(current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:30", "07:10", "11:32", "13:21", "15:43", "17:13"};
            } else if(current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:31", "07:11", "11:32", "13:21", "15:43", "17:13"};
            } else if(current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:32", "07:12", "11:33", "13:21", "15:43", "17:13"};
            } else if(current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:33", "07:13", "11:33", "13:21", "15:43", "17:13"};
            } else if(current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:34", "07:14", "11:34", "13:21", "15:43", "17:13"};
            } else if(current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:35", "07:15", "11:34", "13:21", "15:43", "17:13"};
            } else if(current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:36", "07:16", "11:35", "13:21", "15:43", "17:13"};
            } else if(current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:37", "07:17", "11:35", "13:22", "15:43", "17:13"};
            } else if(current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:38", "07:18", "11:36", "13:22", "15:43", "17:13"};
            } else if(current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:38", "07:18", "11:36", "13:22", "15:44", "17:14"};
            } else if(current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:39", "07:19", "11:37", "13:22", "15:44", "17:14"};
            } else if(current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:40", "07:20", "11:37", "13:23", "15:44", "17:14"};
            } else if(current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:40", "07:20", "11:38", "13:23", "15:45", "17:15"};
            } else if(current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:41", "07:21", "11:38", "13:24", "15:45", "17:15"};
            } else if(current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:41", "07:21", "11:38", "13:24", "15:46", "17:16"};
            } else if(current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:42", "07:22", "11:39", "13:25", "15:46", "17:16"};
            } else if(current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:42", "07:22", "11:40", "13:26", "15:47", "17:17"};
            } else if(current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:43", "07:23", "11:40", "13:26", "15:47", "17:17"};
            } else if(current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:43", "07:23", "11:40", "13:27", "15:48", "17:18"};
            } else if(current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:43", "07:23", "11:41", "13:28", "15:49", "17:19"};
            } else if(current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:43", "07:23", "11:41", "13:28", "15:50", "17:20"};
            } else if(current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:44", "07:24", "11:42", "13:29", "15:50", "17:20"};
            } else if(current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"05:44", "07:24", "11:42", "13:30", "15:51", "17:21"};
            } else {
                list_time_prayer = new String[]{"05:44", "07:24", "11:43", "13:31", "15:52", "17:22"};
            }
        }

        return list_time_prayer;
    }

}
