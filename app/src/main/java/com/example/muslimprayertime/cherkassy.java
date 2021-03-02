package com.example.muslimprayertime;

public class cherkassy {

    String[] get_time_prayer(Integer current_mouth, Integer current_day, Boolean February_29_Day) {

        String[] list_time_prayer = new String[]{};

        /*--------------БАЗА на месяц "ЯНВАРЬ"- изменяется автоматически каждый год с учетом "ГРИГОРИАНСКОГО" (СОЛНЕЧНОГО) КАЛЕНДАРЯ--------------*/
        if (current_mouth == 1) {
            if (current_day < 2) {
                list_time_prayer = new String[]{"05:58", "07:38", "12:00", "13:51", "16:12", "17:42"};
            } else if (current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:58", "07:38", "12:01", "13:52", "16:13", "17:43"};
            } else if (current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:58", "07:38", "12:01", "13:53", "16:14", "17:44"};
            } else if (current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:58", "07:38", "12:02", "13:54", "16:15", "17:45"};
            } else if (current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:58", "07:38", "12:02", "13:55", "16:16", "17:46"};
            } else if (current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:58", "07:38", "12:02", "13:56", "16:18", "17:48"};
            } else if (current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:57", "07:37", "12:03", "13:57", "16:19", "17:49"};
            } else if (current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:57", "07:37", "12:03", "13:58", "16:20", "17:50"};
            } else if (current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:57", "07:37", "12:04", "13:59", "16:21", "17:51"};
            } else if (current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:56", "07:36", "12:04", "14:00", "16:22", "17:52"};
            } else if (current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:56", "07:36", "12:04", "14:01", "16:24", "17:54"};
            } else if (current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:55", "07:35", "12:05", "14:02", "16:25", "17:55"};
            } else if (current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:54", "07:34", "12:05", "14:04", "16:26", "17:56"};
            } else if (current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:54", "07:34", "12:06", "14:05", "16:28", "17:58"};
            } else if (current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:53", "07:33", "12:06", "14:06", "16:29", "17:59"};
            } else if (current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:52", "07:32", "12:06", "14:07", "16:31", "18:01"};
            } else if (current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:52", "07:32", "12:07", "14:09", "16:32", "18:02"};
            } else if (current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:51", "07:31", "12:07", "14:10", "16:34", "18:04"};
            } else if (current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:50", "07:30", "12:07", "14:11", "16:35", "18:05"};
            } else if (current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:49", "07:29", "12:08", "14:12", "16:37", "18:07"};
            } else if (current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:48", "07:28", "12:08", "14:14", "16:38", "18:08"};
            } else if (current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:47", "07:27", "12:08", "14:15", "16:40", "18:10"};
            } else if (current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:46", "07:26", "12:08", "14:16", "16:41", "18:11"};
            } else if (current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:45", "07:25", "12:09", "14:18", "16:43", "18:13"};
            } else if (current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:44", "07:24", "12:09", "14:19", "16:44", "18:14"};
            } else if (current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:43", "07:23", "12:09", "14:20", "16:46", "18:16"};
            } else if (current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:42", "07:22", "12:09", "14:22", "16:47", "18:17"};
            } else if (current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:41", "07:21", "12:10", "14:23", "16:49", "18:19"};
            } else if (current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:39", "07:19", "12:10", "14:24", "16:51", "18:21"};
            } else if (current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"05:38", "07:18", "12:10", "14:26", "16:52", "18:22"};
            } else {
                list_time_prayer = new String[]{"05:35", "07:15", "12:10", "14:28", "16:55", "18:25"};
            }

            /*--------------БАЗА на месяц "ФЕВРАЛЬ", - "29" день необходимо добавить в ручную, т.к. это высокосный год и бывает раз в 4 года---------*/
        } else if (current_mouth == 2) {
            if (current_day < 2) {
                list_time_prayer = new String[]{"05:35", "07:15", "12:10", "14:29", "16:56", "18:26"};
            } else if (current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:34", "07:14", "12:10", "14:30", "16:57", "18:27"};
            } else if (current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:33", "07:13", "12:10", "14:31", "16:59", "18:29"};
            } else if (current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:31", "07:11", "12:11", "14:33", "17:01", "18:31"};
            } else if (current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:30", "07:10", "12:11", "14:34", "17:02", "18:32"};
            } else if (current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:28", "07:08", "12:11", "14:35", "17:04", "18:34"};
            } else if (current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:27", "07:07", "12:11", "14:37", "17:06", "18:36"};
            } else if (current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:25", "07:05", "12:11", "14:38", "17:07", "18:37"};
            } else if (current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:23", "07:03", "12:11", "14:39", "17:09", "18:39"};
            } else if (current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:22", "07:02", "12:11", "14:41", "17:11", "18:41"};
            } else if (current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:20", "07:00", "12:11", "14:42", "17:12", "18:42"};
            } else if (current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:19", "06:59", "12:11", "14:43", "17:14", "18:44"};
            } else if (current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:17", "06:57", "12:11", "14:45", "17:16", "18:46"};
            } else if (current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:15", "06:55", "12:11", "14:46", "17:17", "18:47"};
            } else if (current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:13", "06:53", "12:11", "14:47", "17:19", "18:49"};
            } else if (current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:12", "06:52", "12:11", "14:49", "17:20", "18:50"};
            } else if (current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:10", "06:50", "12:11", "14:50", "17:22", "18:52"};
            } else if (current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:08", "06:48", "12:11", "14:51", "17:24", "18:54"};
            } else if (current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:06", "06:46", "12:10", "14:52", "17:25", "18:55"};
            } else if (current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:04", "06:44", "12:10", "14:54", "17:27", "18:57"};
            } else if (current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:03", "06:43", "12:10", "14:55", "17:29", "18:59"};
            } else if (current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:01", "06:41", "12:10", "14:56", "17:30", "19:00"};
            } else if (current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:59", "06:39", "12:10", "14:57", "17:32", "19:02"};
            } else if (current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:57", "06:37", "12:10", "14:59", "17:34", "19:04"};
            } else if (current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:55", "06:35", "12:10", "15:00", "17:35", "19:05"};
            } else if (current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:53", "06:33", "12:10", "15:01", "17:37", "19:07"};
            } else if (current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:51", "06:31", "12:09", "15:02", "17:39", "19:09"};

                /*------------------Разкоментировать эту строку указанную ниже, если наступил высокосный год, т.е. 29 Февраля 2016 года-------*/
			/*} else if(current_day > 27 && current_day < 29) {
				list_time_prayer = new String[]{"04:58", "06:38", "12:16", "15:06", "17:44", "19:14"};*/
            } else {
                list_time_prayer = new String[]{"4:49", "6:29", "12:09", "15:03", "17:40", "19:10"};
            }

            /*--------------БАЗА на месяц "МАРТ"---------------*/
        } else if (current_mouth == 3) {
            if (current_day < 2) {
                list_time_prayer = new String[]{"04:47", "06:27", "12:09", "15:04", "17:42", "19:12"};
            } else if (current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:45", "06:25", "12:09", "15:06", "17:43", "19:13"};
            } else if (current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:43", "06:23", "12:09", "15:07", "17:45", "19:15"};
            } else if (current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:41", "06:21", "12:08", "15:08", "17:47", "19:17"};
            } else if (current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:39", "06:19", "12:08", "15:09", "17:48", "19:18"};
            } else if (current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:37", "06:17", "12:08", "15:10", "17:50", "19:20"};
            } else if (current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:35", "06:15", "12:08", "15:11", "17:51", "19:21"};
            } else if (current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:33", "06:13", "12:07", "15:12", "17:53", "19:23"};
            } else if (current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:31", "06:11", "12:07", "15:13", "17:55", "19:25"};
            } else if (current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:29", "06:09", "12:07", "15:14", "17:56", "19:26"};
            } else if (current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:26", "06:06", "12:07", "15:15", "17:58", "19:28"};
            } else if (current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:24", "06:04", "12:06", "15:16", "17:59", "19:29"};
            } else if (current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:22", "06:02", "12:06", "15:17", "18:01", "19:31"};
            } else if (current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:20", "06:00", "12:06", "15:18", "18:02", "19:32"};
            } else if (current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:18", "05:58", "12:06", "15:19", "18:04", "19:34"};
            } else if (current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:16", "05:56", "12:05", "15:20", "18:06", "19:36"};
            } else if (current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:14", "05:54", "12:05", "15:21", "18:07", "19:37"};
            } else if (current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:12", "05:52", "12:05", "15:22", "18:09", "19:39"};
            } else if (current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:10", "05:50", "12:04", "15:23", "18:11", "19:41"};
            } else if (current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:08", "05:48", "12:04", "15:24", "18:12", "19:42"};
            } else if (current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:05", "05:45", "12:04", "15:25", "18:13", "19:43"};
            } else if (current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:03", "05:43", "12:04", "15:26", "18:15", "19:45"};
            } else if (current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:01", "05:41", "12:03", "15:27", "18:16", "19:46"};
            } else if (current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:59", "05:39", "12:03", "15:28", "18:18", "19:48"};
            } else if (current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:57", "05:37", "12:03", "15:28", "18:20", "19:50"};
            } else if (current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:54", "05:34", "12:02", "15:29", "18:21", "19:51"};
            } else if (current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:52", "05:32", "12:02", "15:30", "18:23", "19:53"};
            } else if (current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:50", "05:30", "12:02", "15:31", "18:24", "19:54"};
            } else if (current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:48", "06:28", "13:01", "16:32", "19:26", "20:56"};
            } else if (current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"04:46", "06:26", "13:01", "16:33", "19:27", "20:57"};
            } else {
                list_time_prayer = new String[]{"04:44", "06:24", "13:01", "16:33", "19:29", "20:59"};/* Перевод часов на (1 час вперед) в последнее воскресенье этого месяца, т.е. с последней (субботы на воскресенье) (31.03.2019 г.) */
            }

            /*--------------БАЗА на месяц "АПРЕЛЬ"---------------*/
        } else if (current_mouth == 4) {
            if (current_day < 2) {
                list_time_prayer = new String[]{"04:42", "06:22", "13:01", "16:34", "19:30", "21:00"};
            } else if (current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:39", "06:19", "13:00", "16:35", "19:32", "21:02"};
            } else if (current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:37", "06:17", "13:00", "16:36", "19:33", "21:03"};
            } else if (current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:35", "06:15", "13:00", "16:37", "19:35", "21:05"};
            } else if (current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:33", "06:13", "12:59", "16:37", "19:37", "21:07"};
            } else if (current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:31", "06:11", "12:59", "16:38", "19:38", "21:08"};
            } else if (current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:29", "06:09", "12:59", "16:39", "19:40", "21:10"};
            } else if (current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:27", "06:07", "12:58", "16:40", "19:41", "21:11"};
            } else if (current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:25", "06:05", "12:58", "16:40", "19:43", "21:13"};
            } else if (current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:23", "06:03", "12:58", "16:41", "19:44", "21:14"};
            } else if (current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:20", "06:00", "12:58", "16:42", "19:46", "21:16"};
            } else if (current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:18", "05:58", "12:57", "16:42", "19:47", "21:17"};
            } else if (current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:16", "05:56", "12:57", "16:43", "19:49", "21:19"};
            } else if (current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:14", "05:54", "12:57", "16:44", "19:51", "21:21"};
            } else if (current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:12", "05:52", "12:57", "16:45", "19:52", "21:22"};
            } else if (current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:10", "05:50", "12:56", "16:45", "19:54", "21:24"};
            } else if (current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:08", "05:48", "12:56", "16:46", "19:55", "21:25"};
            } else if (current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:06", "05:46", "12:56", "16:47", "19:57", "21:27"};
            } else if (current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:04", "05:44", "12:56", "16:47", "19:58", "21:28"};
            } else if (current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:02", "05:42", "12:56", "16:48", "20:00", "21:30"};
            } else if (current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:00", "05:40", "12:55", "16:48", "20:01", "21:31"};
            } else if (current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"03:58", "05:38", "12:55", "16:49", "20:03", "21:33"};
            } else if (current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:56", "05:36", "12:55", "16:50", "20:05", "21:35"};
            } else if (current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:54", "05:34", "12:55", "16:50", "20:06", "21:36"};
            } else if (current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:53", "05:33", "12:55", "16:51", "20:08", "21:38"};
            } else if (current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:51", "05:31", "12:54", "16:52", "20:09", "21:39"};
            } else if (current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:49", "05:29", "12:54", "16:52", "20:11", "21:41"};
            } else if (current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:47", "05:27", "12:54", "16:53", "20:12", "21:42"};
            } else if (current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"03:45", "05:25", "12:54", "16:53", "20:14", "21:44"};
            } else {
                list_time_prayer = new String[]{"03:43", "05:23", "12:54", "16:54", "20:15", "21:45"};
            }

            /*--------------БАЗА на месяц "МАЙ"---------------*/
        } else if (current_mouth == 5) {
            if (current_day < 2) {
                list_time_prayer = new String[]{"03:41", "05:21", "12:54", "16:55", "20:17", "21:47"};
            } else if (current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"03:40", "05:20", "12:54", "16:55", "20:18", "21:48"};
            } else if (current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"03:38", "05:18", "12:53", "16:56", "20:20", "21:50"};
            } else if (current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"03:36", "05:16", "12:53", "16:56", "20:21", "21:51"};
            } else if (current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"03:35", "05:15", "12:53", "16:57", "20:23", "21:53"};
            } else if (current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"03:33", "05:13", "12:53", "16:57", "20:24", "21:54"};
            } else if (current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"03:31", "05:11", "12:53", "16:58", "20:26", "21:56"};
            } else if (current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"03:30", "05:10", "12:53", "16:59", "20:27", "21:57"};
            } else if (current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"03:28", "05:08", "12:53", "16:59", "20:29", "21:59"};
            } else if (current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"03:26", "05:06", "12:53", "17:00", "20:30", "22:00"};
            } else if (current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"03:25", "05:05", "12:53", "17:00", "20:32", "22:02"};
            } else if (current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"03:23", "05:03", "12:53", "17:01", "20:33", "22:03"};
            } else if (current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:22", "05:02", "12:53", "17:01", "20:35", "22:05"};
            } else if (current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:21", "05:01", "12:53", "17:02", "20:36", "22:06"};
            } else if (current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:19", "04:59", "12:53", "17:02", "20:38", "22:08"};
            } else if (current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:18", "04:58", "12:53", "17:03", "20:39", "22:09"};
            } else if (current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:16", "04:56", "12:53", "17:03", "20:40", "22:10"};
            } else if (current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:15", "04:55", "12:53", "17:04", "20:42", "22:12"};
            } else if (current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:14", "04:54", "12:53", "17:04", "20:43", "22:13"};
            } else if (current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:13", "04:53", "12:53", "17:05", "20:45", "22:15"};
            } else if (current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:11", "04:51", "12:53", "17:05", "20:46", "22:16"};
            } else if (current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"03:10", "04:50", "12:53", "17:06", "20:47", "22:18"};
            } else if (current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:09", "04:49", "12:53", "17:06", "20:48", "22:20"};
            } else if (current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:08", "04:48", "12:53", "17:07", "20:50", "22:23"};
            } else if (current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:07", "04:47", "12:53", "17:07", "20:51", "22:25"};
            } else if (current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:06", "04:46", "12:54", "17:08", "20:52", "22:27"};
            } else if (current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:05", "04:45", "12:54", "17:08", "20:53", "22:29"};
            } else if (current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:04", "04:44", "12:54", "17:09", "20:55", "22:32"};
            } else if (current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"03:03", "04:43", "12:54", "17:09", "20:56", "22:34"};
            } else if (current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"03:02", "04:42", "12:54", "17:09", "20:57", "22:36"};
            } else {
                list_time_prayer = new String[]{"03:01", "04:41", "12:54", "17:10", "20:58", "22:38"};
            }

            /*--------------БАЗА на месяц "ИЮНЬ"---------------*/
        } else if (current_mouth == 6) {
            if (current_day < 2) {
                list_time_prayer = new String[]{"03:00", "04:40", "12:54", "17:10", "20:59", "22:39"};
            } else if (current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"03:00", "04:40", "12:54", "17:11", "21:00", "22:40"};
            } else if (current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"02:59", "04:39", "12:55", "17:11", "21:01", "22:41"};
            } else if (current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"02:58", "04:38", "12:55", "17:12", "21:02", "22:42"};
            } else if (current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"02:58", "04:38", "12:55", "17:12", "21:03", "22:43"};
            } else if (current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"02:57", "04:37", "12:55", "17:12", "21:04", "22:44"};
            } else if (current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"02:57", "04:37", "12:55", "17:13", "21:04", "22:44"};
            } else if (current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"02:56", "04:36", "12:56", "17:13", "21:05", "22:45"};
            } else if (current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"02:56", "04:36", "12:56", "17:13", "21:06", "22:46"};
            } else if (current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"02:55", "04:35", "12:56", "17:14", "21:07", "22:47"};
            } else if (current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"02:55", "04:35", "12:56", "17:14", "21:07", "22:47"};
            } else if (current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"02:55", "04:35", "12:56", "17:14", "21:08", "22:48"};
            } else if (current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"02:55", "04:35", "12:57", "17:15", "21:09", "22:49"};
            } else if (current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"02:54", "04:34", "12:57", "17:15", "21:09", "22:49"};
            } else if (current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"02:54", "04:34", "12:57", "17:15", "21:10", "22:50"};
            } else if (current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"02:54", "04:34", "12:57", "17:16", "21:10", "22:50"};
            } else if (current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"02:54", "04:34", "12:57", "17:16", "21:11", "22:51"};
            } else if (current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"02:54", "04:34", "12:58", "17:16", "21:11", "22:51"};
            } else if (current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"02:54", "04:34", "12:58", "17:16", "21:11", "22:51"};
            } else if (current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"02:55", "04:35", "12:58", "17:17", "21:12", "22:52"};
            } else if (current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"02:55", "04:35", "12:58", "17:17", "21:12", "22:52"};
            } else if (current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"02:55", "04:35", "12:58", "17:17", "21:12", "22:52"};
            } else if (current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"02:55", "04:35", "12:59", "17:17", "21:12", "22:52"};
            } else if (current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"02:55", "04:35", "12:59", "17:17", "21:12", "22:52"};
            } else if (current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"02:56", "04:36", "12:59", "17:18", "21:12", "22:52"};
            } else if (current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"02:56", "04:36", "12:59", "17:18", "21:12", "22:52"};
            } else if (current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"02:57", "04:37", "13:00", "17:18", "21:12", "22:52"};
            } else if (current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"02:57", "04:37", "13:00", "17:18", "21:12", "22:52"};
            } else if (current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"02:58", "04:38", "13:00", "17:18", "21:12", "22:52"};
            } else {
                list_time_prayer = new String[]{"02:58", "04:38", "13:00", "17:18", "21:11", "22:51"};
            }

            /*--------------БАЗА на месяц "ИЮЛЬ"---------------*/
        } else if (current_mouth == 7) {
            if (current_day < 2) {
                list_time_prayer = new String[]{"02:59", "04:39", "13:01", "17:18", "21:11", "22:51"};
            } else if (current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"02:59", "04:39", "13:01", "17:18", "21:11", "22:51"};
            } else if (current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"03:00", "04:40", "13:01", "17:18", "21:11", "22:51"};
            } else if (current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"03:01", "04:41", "13:01", "17:18", "21:11", "22:51"};
            } else if (current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"03:02", "04:42", "13:01", "17:18", "21:10", "22:50"};
            } else if (current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"03:02", "04:42", "13:01", "17:18", "21:10", "22:50"};
            } else if (current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"03:03", "04:43", "13:01", "17:18", "21:09", "22:49"};
            } else if (current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"03:04", "04:44", "13:02", "17:18", "21:08", "22:48"};
            } else if (current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"03:05", "04:45", "13:02", "17:18", "21:08", "22:48"};
            } else if (current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"03:06", "04:46", "13:02", "17:18", "21:07", "22:47"};
            } else if (current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"03:07", "04:47", "13:02", "17:18", "21:06", "22:46"};
            } else if (current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"03:08", "04:48", "13:02", "17:17", "21:06", "22:46"};
            } else if (current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:09", "04:49", "13:02", "17:17", "21:05", "22:45"};
            } else if (current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:10", "04:50", "13:03", "17:17", "21:04", "22:44"};
            } else if (current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:11", "04:51", "13:03", "17:17", "21:03", "22:43"};
            } else if (current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:12", "04:52", "13:03", "17:17", "21:02", "22:42"};
            } else if (current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:14", "04:54", "13:03", "17:16", "21:01", "22:41"};
            } else if (current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:15", "04:55", "13:03", "17:16", "21:00", "22:40"};
            } else if (current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:16", "04:56", "13:03", "17:16", "20:59", "22:39"};
            } else if (current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"03:17", "04:57", "13:03", "17:15", "20:58", "22:38"};
            } else if (current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"03:18", "04:58", "13:03", "17:15", "20:57", "22:37"};
            } else if (current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"03:20", "05:00", "13:03", "17:15", "20:56", "22:36"};
            } else if (current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"03:21", "05:01", "13:03", "17:14", "20:54", "22:34"};
            } else if (current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"03:22", "05:02", "13:03", "17:14", "20:53", "22:33"};
            } else if (current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"03:23", "05:03", "13:03", "17:13", "20:52", "22:32"};
            } else if (current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"03:25", "05:05", "13:03", "17:13", "20:50", "22:30"};
            } else if (current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"03:26", "05:06", "13:03", "17:12", "20:49", "22:29"};
            } else if (current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"03:27", "05:07", "13:03", "17:12", "20:48", "22:28"};
            } else if (current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"03:29", "05:09", "13:03", "17:11", "20:46", "22:26"};
            } else if (current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"03:30", "05:10", "13:03", "17:11", "20:44", "22:24"};
            } else {
                list_time_prayer = new String[]{"03:32", "05:12", "13:03", "17:10", "20:43", "22:23"};
            }

            /*--------------БАЗА на месяц "АВГУСТ"---------------*/
        } else if (current_mouth == 8) {
            if (current_day < 2) {
                list_time_prayer = new String[]{"03:33", "05:13", "13:03", "17:10", "20:42", "22:22"};
            } else if (current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"03:34", "05:14", "13:03", "17:09", "20:40", "22:20"};
            } else if (current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"03:36", "05:16", "13:03", "17:08", "20:39", "22:19"};
            } else if (current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"03:37", "05:17", "13:03", "17:08", "20:37", "22:17"};
            } else if (current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"03:39", "05:19", "13:03", "17:07", "20:35", "22:15"};
            } else if (current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"03:40", "05:20", "13:02", "17:06", "20:34", "22:14"};
            } else if (current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"03:42", "05:22", "13:02", "17:05", "20:32", "22:12"};
            } else if (current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"03:43", "05:23", "13:02", "17:05", "20:30", "22:10"};
            } else if (current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"03:44", "05:24", "13:02", "17:04", "20:29", "22:09"};
            } else if (current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"03:46", "05:26", "13:02", "17:03", "20:27", "22:07"};
            } else if (current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"03:48", "05:28", "13:02", "17:02", "20:25", "22:05"};
            } else if (current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"03:49", "05:29", "13:02", "17:01", "20:23", "22:03"};
            } else if (current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"03:50", "05:30", "13:01", "17:00", "20:22", "22:02"};
            } else if (current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"03:52", "05:32", "13:01", "16:59", "20:20", "22:00"};
            } else if (current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"03:53", "05:33", "13:01", "16:58", "20:18", "21:58"};
            } else if (current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"03:55", "05:35", "13:01", "16:58", "20:16", "21:56"};
            } else if (current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"03:58", "05:38", "13:00", "16:58", "20:15", "21:55"};
            } else if (current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"03:58", "05:38", "13:00", "16:56", "20:12", "21:52"};
            } else if (current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"03:59", "05:39", "13:00", "16:55", "20:10", "21:50"};
            } else if (current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:01", "05:41", "13:00", "16:53", "20:08", "21:48"};
            } else if (current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:02", "05:42", "13:00", "16:52", "20:06", "21:46"};
            } else if (current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:04", "05:44", "12:59", "16:51", "20:04", "21:44"};
            } else if (current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:05", "05:45", "12:59", "16:50", "20:02", "21:42"};
            } else if (current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:07", "05:47", "12:59", "16:49", "20:00", "21:40"};
            } else if (current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:08", "05:48", "12:59", "16:48", "19:58", "21:38"};
            } else if (current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:10", "05:50", "12:58", "16:47", "19:56", "21:36"};
            } else if (current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:11", "05:51", "12:58", "16:46", "19:54", "21:34"};
            } else if (current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"04:13", "05:53", "12:58", "16:44", "19:52", "21:32"};
            } else if (current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:14", "05:54", "12:58", "16:43", "19:50", "21:30"};
            } else if (current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"04:15", "05:55", "12:57", "16:42", "19:48", "21:28"};
            } else {
                list_time_prayer = new String[]{"04:17", "05:57", "12:57", "16:41", "19:46", "21:26"};
            }

            /*--------------БАЗА на месяц "СЕНТЯБРЬ"---------------*/
        } else if (current_mouth == 9) {
            if (current_day < 2) {
                list_time_prayer = new String[]{"04:18", "05:58", "12:57", "16:39", "19:44", "21:24"};
            } else if (current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:20", "06:00", "12:56", "16:38", "19:42", "21:21"};
            } else if (current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:21", "06:01", "12:56", "16:37", "19:40", "21:18"};
            } else if (current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:23", "06:03", "12:56", "16:35", "19:37", "21:14"};
            } else if (current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:24", "06:04", "12:55", "16:34", "19:35", "21:11"};
            } else if (current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:26", "06:06", "12:55", "16:33", "19:33", "21:08"};
            } else if (current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"04:27", "06:07", "12:55", "16:31", "19:31", "21:05"};
            } else if (current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"04:29", "06:09", "12:54", "16:30", "19:29", "21:02"};
            } else if (current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"04:30", "06:10", "12:54", "16:29", "19:27", "20:59"};
            } else if (current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"04:32", "06:12", "12:54", "16:27", "19:25", "20:56"};
            } else if (current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"04:33", "06:13", "12:53", "16:26", "19:22", "20:52"};
            } else if (current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"04:35", "06:15", "12:53", "16:24", "19:20", "20:50"};
            } else if (current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"04:36", "06:16", "12:53", "16:23", "19:18", "20:48"};
            } else if (current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"04:38", "06:18", "12:52", "16:21", "19:16", "20:46"};
            } else if (current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"04:39", "06:19", "12:52", "16:20", "19:14", "20:44"};
            } else if (current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"04:40", "06:20", "12:51", "16:18", "19:12", "20:42"};
            } else if (current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"04:42", "06:22", "12:51", "16:17", "19:09", "20:39"};
            } else if (current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"04:43", "06:23", "12:51", "16:15", "19:07", "20:37"};
            } else if (current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"04:45", "06:25", "12:50", "16:14", "19:05", "20:35"};
            } else if (current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"04:46", "06:26", "12:50", "16:12", "19:03", "20:33"};
            } else if (current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"04:48", "06:28", "12:50", "16:11", "19:01", "20:31"};
            } else if (current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"04:49", "06:29", "12:49", "16:09", "18:58", "20:28"};
            } else if (current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"04:50", "06:30", "12:49", "16:08", "18:56", "20:26"};
            } else if (current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"04:51", "06:31", "12:49", "16:08", "18:54", "20:24"};
            } else if (current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:53", "06:33", "12:48", "16:06", "18:52", "20:22"};
            } else if (current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:55", "06:35", "12:48", "16:03", "18:50", "20:20"};
            } else if (current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:57", "06:37", "12:48", "16:01", "18:48", "20:18"};
            } else if (current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"04:58", "06:38", "12:47", "16:00", "18:45", "20:15"};
            } else if (current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:00", "06:40", "12:47", "15:58", "18:43", "20:13"};
            } else {
                list_time_prayer = new String[]{"05:01", "06:41", "12:47", "15:57", "18:41", "20:11"};
            }

            /*--------------БАЗА на месяц "ОКТЯБРЬ"---------------*/
        } else if (current_mouth == 10) {
            if (current_day < 2) {
                list_time_prayer = new String[]{"05:03", "06:43", "12:46", "15:55", "18:39", "20:09"};
            } else if (current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:04", "06:44", "12:46", "15:53", "18:37", "20:07"};
            } else if (current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:06", "06:46", "12:46", "15:52", "18:35", "20:05"};
            } else if (current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:07", "06:47", "12:45", "15:50", "18:33", "20:03"};
            } else if (current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:09", "06:49", "12:45", "15:49", "18:31", "20:01"};
            } else if (current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:10", "06:50", "12:45", "15:47", "18:28", "19:58"};
            } else if (current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:12", "06:52", "12:44", "15:45", "18:26", "19:56"};
            } else if (current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:13", "06:53", "12:44", "15:44", "18:24", "19:54"};
            } else if (current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:15", "06:55", "12:44", "15:42", "18:22", "19:52"};
            } else if (current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:16", "06:56", "12:44", "15:41", "18:20", "19:50"};
            } else if (current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:18", "06:58", "12:43", "15:39", "18:18", "19:48"};
            } else if (current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:19", "06:59", "12:43", "15:37", "18:16", "19:46"};
            } else if (current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:21", "07:01", "12:43", "15:36", "18:14", "19:44"};
            } else if (current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:22", "07:02", "12:43", "15:34", "18:12", "19:42"};
            } else if (current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:24", "07:04", "12:42", "15:33", "18:10", "19:40"};
            } else if (current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:25", "07:05", "12:42", "15:31", "18:08", "19:38"};
            } else if (current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:27", "07:07", "12:42", "15:30", "18:06", "19:36"};
            } else if (current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:29", "07:09", "12:42", "15:28", "18:04", "19:34"};
            } else if (current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:30", "07:10", "12:42", "15:27", "18:02", "19:32"};
            } else if (current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:32", "07:12", "12:41", "15:25", "18:00", "19:30"};
            } else if (current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:33", "07:13", "12:41", "15:24", "17:58", "19:28"};
            } else if (current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:35", "07:15", "12:41", "15:22", "17:57", "19:27"};
            } else if (current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:36", "07:16", "12:41", "15:21", "17:55", "19:25"};
            } else if (current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:38", "07:18", "12:41", "15:19", "17:53", "19:23"};
            } else if (current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"04:40", "06:20", "11:41", "14:18", "16:51", "18:21"};
            } else if (current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"04:41", "06:21", "11:41", "14:16", "16:49", "18:19"};
            } else if (current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"04:43", "06:23", "11:40", "14:15", "16:47", "18:17"};/* Перевод часов на (1 час назад) последней субботы начиная с воскресенья (27.10.2019 г.) этого месяца*/
            } else if (current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"04:44", "06:24", "11:40", "14:13", "16:46", "18:16"};
            } else if (current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"04:46", "06:26", "11:40", "14:12", "16:44", "18:14"};
            } else if (current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"04:48", "06:28", "11:40", "14:11", "16:42", "18:12"};
            } else {
                list_time_prayer = new String[]{"04:49", "06:29", "11:40", "14:09", "16:41", "18:11"};
            }

            /*--------------БАЗА на месяц "НОЯБРЬ"---------------*/
        } else if (current_mouth == 11) {
            if (current_day < 2) {
                list_time_prayer = new String[]{"04:51", "06:31", "11:40", "14:08", "16:39", "18:09"};
            } else if (current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"04:52", "06:32", "11:40", "14:07", "16:37", "18:07"};
            } else if (current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"04:54", "06:34", "11:40", "14:05", "16:36", "18:06"};
            } else if (current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"04:56", "06:36", "11:40", "14:04", "16:34", "18:04"};
            } else if (current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"04:57", "06:37", "11:40", "14:03", "16:33", "18:03"};
            } else if (current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"04:59", "06:39", "11:40", "14:02", "16:31", "18:01"};
            } else if (current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:00", "06:40", "11:40", "14:00", "16:30", "18:00"};
            } else if (current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:02", "06:42", "11:40", "13:59", "16:28", "17:58"};
            } else if (current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:04", "06:44", "11:40", "13:58", "16:27", "17:57"};
            } else if (current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:05", "06:45", "11:41", "13:57", "16:25", "17:55"};
            } else if (current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:07", "06:47", "11:41", "13:56", "16:24", "17:54"};
            } else if (current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:08", "06:48", "11:41", "13:55", "16:23", "17:53"};
            } else if (current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:10", "06:50", "11:41", "13:54", "16:21", "17:51"};
            } else if (current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:12", "06:52", "11:41", "13:53", "16:20", "17:50"};
            } else if (current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:13", "06:53", "11:41", "13:52", "16:19", "17:49"};
            } else if (current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:15", "06:55", "11:41", "13:51", "16:18", "17:48"};
            } else if (current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:16", "06:56", "11:42", "13:50", "16:16", "17:46"};
            } else if (current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:18", "06:58", "11:42", "13:49", "16:15", "17:45"};
            } else if (current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:19", "06:59", "11:42", "13:48", "16:14", "17:44"};
            } else if (current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:21", "07:01", "11:42", "13:47", "16:13", "17:43"};
            } else if (current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:22", "07:02", "11:42", "13:47", "16:12", "17:42"};
            } else if (current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:24", "07:04", "11:43", "13:46", "16:11", "17:41"};
            } else if (current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:25", "07:05", "11:43", "13:45", "16:10", "17:40"};
            } else if (current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:27", "07:07", "11:43", "13:44", "16:09", "17:39"};
            } else if (current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:28", "07:08", "11:44", "13:44", "16:09", "17:39"};
            } else if (current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:29", "07:09", "11:44", "13:43", "16:08", "17:38"};
            } else if (current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:31", "07:11", "11:44", "13:43", "16:07", "17:37"};
            } else if (current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:32", "07:12", "11:44", "13:42", "16:06", "17:36"};
            } else if (current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:34", "07:14", "11:45", "13:42", "16:06", "17:36"};
            } else {
                list_time_prayer = new String[]{"05:35", "07:15", "11:45", "13:41", "16:05", "17:35"};
            }

            /*--------------БАЗА на месяц "ДЕКАБРЬ"---------------*/
        } else {
            if (current_day < 2) {
                list_time_prayer = new String[]{"05:36", "07:16", "11:46", "13:41", "16:05", "17:35"};
            } else if (current_day > 1 && current_day < 3) {
                list_time_prayer = new String[]{"05:38", "07:18", "11:46", "13:41", "16:04", "17:34"};
            } else if (current_day > 2 && current_day < 4) {
                list_time_prayer = new String[]{"05:39", "07:19", "11:46", "13:40", "16:04", "17:34"};
            } else if (current_day > 3 && current_day < 5) {
                list_time_prayer = new String[]{"05:40", "07:20", "11:47", "13:40", "16:03", "17:33"};
            } else if (current_day > 4 && current_day < 6) {
                list_time_prayer = new String[]{"05:41", "07:21", "11:47", "13:40", "16:03", "17:33"};
            } else if (current_day > 5 && current_day < 7) {
                list_time_prayer = new String[]{"05:42", "07:22", "11:48", "13:40", "16:03", "17:33"};
            } else if (current_day > 6 && current_day < 8) {
                list_time_prayer = new String[]{"05:42", "07:22", "11:48", "13:40", "16:03", "17:33"};
            } else if (current_day > 7 && current_day < 9) {
                list_time_prayer = new String[]{"05:45", "07:25", "11:48", "13:40", "16:02", "17:32"};
            } else if (current_day > 8 && current_day < 10) {
                list_time_prayer = new String[]{"05:46", "07:26", "11:49", "13:40", "16:02", "17:32"};
            } else if (current_day > 9 && current_day < 11) {
                list_time_prayer = new String[]{"05:47", "07:27", "11:49", "13:40", "16:02", "17:32"};
            } else if (current_day > 10 && current_day < 12) {
                list_time_prayer = new String[]{"05:48", "07:28", "11:50", "13:40", "16:02", "17:32"};
            } else if (current_day > 11 && current_day < 13) {
                list_time_prayer = new String[]{"05:49", "07:29", "11:50", "13:40", "16:02", "17:32"};
            } else if (current_day > 12 && current_day < 14) {
                list_time_prayer = new String[]{"05:49", "07:29", "11:51", "13:40", "16:02", "17:32"};
            } else if (current_day > 13 && current_day < 15) {
                list_time_prayer = new String[]{"05:50", "07:30", "11:51", "13:40", "16:02", "17:32"};
            } else if (current_day > 14 && current_day < 16) {
                list_time_prayer = new String[]{"05:51", "07:31", "11:52", "13:40", "16:02", "17:32"};
            } else if (current_day > 15 && current_day < 17) {
                list_time_prayer = new String[]{"05:52", "07:32", "11:52", "13:41", "16:02", "17:32"};
            } else if (current_day > 16 && current_day < 18) {
                list_time_prayer = new String[]{"05:53", "07:33", "11:53", "13:41", "16:02", "17:32"};
            } else if (current_day > 17 && current_day < 19) {
                list_time_prayer = new String[]{"05:53", "07:33", "11:53", "13:41", "16:03", "17:33"};
            } else if (current_day > 18 && current_day < 20) {
                list_time_prayer = new String[]{"05:54", "07:34", "11:54", "13:42", "16:03", "17:33"};
            } else if (current_day > 19 && current_day < 21) {
                list_time_prayer = new String[]{"05:55", "07:35", "11:54", "13:42", "16:04", "17:34"};
            } else if (current_day > 20 && current_day < 22) {
                list_time_prayer = new String[]{"05:55", "07:35", "11:55", "13:43", "16:04", "17:34"};
            } else if (current_day > 21 && current_day < 23) {
                list_time_prayer = new String[]{"05:56", "07:36", "11:55", "13:43", "16:04", "17:34"};
            } else if (current_day > 22 && current_day < 24) {
                list_time_prayer = new String[]{"05:56", "07:36", "11:56", "13:44", "16:05", "17:35"};
            } else if (current_day > 23 && current_day < 25) {
                list_time_prayer = new String[]{"05:57", "07:37", "11:56", "13:44", "16:06", "17:36"};
            } else if (current_day > 24 && current_day < 26) {
                list_time_prayer = new String[]{"05:57", "07:37", "11:57", "13:45", "16:06", "17:36"};
            } else if (current_day > 25 && current_day < 27) {
                list_time_prayer = new String[]{"05:57", "07:37", "11:57", "13:46", "16:07", "17:37"};
            } else if (current_day > 26 && current_day < 28) {
                list_time_prayer = new String[]{"05:58", "07:38", "11:58", "13:46", "16:08", "17:38"};
            } else if (current_day > 27 && current_day < 29) {
                list_time_prayer = new String[]{"05:58", "07:38", "11:58", "13:47", "16:08", "17:38"};
            } else if (current_day > 28 && current_day < 30) {
                list_time_prayer = new String[]{"05:58", "07:38", "11:59", "13:48", "16:09", "17:39"};
            } else if (current_day > 29 && current_day < 31) {
                list_time_prayer = new String[]{"05:58", "07:38", "11:59", "13:49", "16:10", "17:40"};
            } else {
                list_time_prayer = new String[]{"05:58", "07:38", "12:00", "13:50", "16:11", "17:41"};
            }
        }

        return list_time_prayer;
    }

}
