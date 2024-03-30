package com.example.muslimprayertime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    //variables
    public static final String APP_PREFERENCES = "MuslimPrayerTime_SETTING";
    public static final String APP_PREFERENCES_CURRENT_CITY = "current_city";
    private SharedPreferences mSettings;
    public String current_city;

    //initialization of variables
    //static name CITY
    String Kiev = "Киев";
    String Zaporozhye = "Запорожье";
    String Nikolaev = "Николаев";
    String Odessa = "Одесса";
    String Poltava = "Полтава";
    String Kharkiv = "Харкьов";
    String Kherson = "Херсон";
    String Khmelnitsky = "Хмельницкий";
    String Cherkasy = "Черкассы";
    String Obukhov = "Обухов";
    String Belayacerkov = "Белая церковь";
    String Zhytomyr = "Житомир";
    String Summi = "Суммы";
    String Donetsk = "Донецк";
    String Slavyansk = "Славянск";
    String Melitopol = "Мелитополь";
    String Kropyvnytsky = "Кропивницкий";
    String Kremenchuk = "Кременчук";
    String Lviv = "Львов";

    String site_not_found = "Сайт отсутствует";

    //fill arrays
    String[] city_list = fill_city_list();
    Map site_list;
    Map list_class_city;

    int current_Year = Calendar.getInstance().get(Calendar.YEAR);
    int current_Year_h_start = 0;
    int current_Year_h_end = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //відключити темну тему, навіть якщо вона активна на рівні системи
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        //відключити орієнтацію екрана
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);

        //заповнюємо масиви
        site_list = get_site_list();
        list_class_city = get_Class_city();

        //view
        Spinner spinner = (Spinner) findViewById(R.id.city_choice);
        RelativeLayout root_layout = findViewById(R.id.root_layout);

        //set spinner
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, city_list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        //робота з збереженими налаштуваннями на рівні системи
        mSettings = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        if (mSettings.contains(APP_PREFERENCES_CURRENT_CITY)) {
            current_city = mSettings.getString(APP_PREFERENCES_CURRENT_CITY, current_city);

            //set city list spinner
            set_City_List(spinner);
            //set city view
            set_City();
        }

        //set text calendar
        setTextCalendar();

        //select spinner
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                current_city = (String) parent.getItemAtPosition(position);

                //set city view
                set_City();
                //fill table prayer
                fill_table_prayer();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        spinner.setOnItemSelectedListener(itemSelectedListener);

    }

    //click URL site_list
    public void current_site_onClick(View v) {
        String current_url = (String) ((AppCompatTextView) v).getText();
        if (current_url != site_not_found) {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + current_url));
            startActivity(browserIntent);
        }
    }

    //click URL calendar
    public void prayer_calendar_onClick(View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://islam.ua/ru/biblioteka/kalendar-namazov"));
        startActivity(browserIntent);
    }

    //exit software
    protected void onPause() {
        super.onPause();
        SharedPreferences.Editor editor = mSettings.edit();
        editor.putString(APP_PREFERENCES_CURRENT_CITY, current_city);
        editor.apply();
    }

    //set city view
    void set_City() {
        TextView current_site_list = findViewById(R.id.current_site);
        current_site_list.setPaintFlags(0);
        String current_url = (String) site_list.get(current_city);
        if (current_url == null) {
            current_url = site_not_found;
        } else {
            current_site_list.setPaintFlags(current_site_list.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        }
        current_site_list.setText(current_url);
    }

    //set city spinner
    void set_City_List(Spinner spinner) {
        ArrayAdapter arrayAdapter = (ArrayAdapter) spinner.getAdapter();
        int position = arrayAdapter.getPosition(current_city);
        spinner.setSelection(position);
    }

    //set text calendar
    void setTextCalendar() {
        getValueYear();

        TextView calendar_prayers = findViewById(R.id.calendar_prayers);
        calendar_prayers.setPaintFlags(0);
        calendar_prayers.setPaintFlags(calendar_prayers.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        String textCalendar = "Календарь Намазов на ("+current_Year+"г./"+current_Year_h_start+"-"+current_Year_h_end+"h. для городов Украины)";
        calendar_prayers.setText(textCalendar);
    }

    void getValueYear() {
        int startYear = 2022;
        int startYear_h = 1443;
        int resultYear = this.current_Year - startYear;
        this.current_Year_h_start = startYear_h + resultYear;
        this.current_Year_h_end = this.current_Year_h_start + 1;
    }

    //fill list city
    String[] fill_city_list() {
        String[] city_list = {Kiev, Obukhov, Belayacerkov, Zhytomyr, Poltava,
                Summi, Kharkiv, Donetsk, Slavyansk, Zaporozhye,
                Melitopol, Nikolaev, Kherson, Kropyvnytsky, Khmelnitsky,
                Odessa, Cherkasy, Lviv, Kremenchuk};
        return city_list;
    }

    Map get_site_list() {
        Map<String, String> site_list = new HashMap<String, String>();
        site_list.put(Kiev, "islam.ua");
        site_list.put(Zaporozhye, "zp.islam.ua");
        site_list.put(Nikolaev, "islamnik.com");
        site_list.put(Odessa, "odessa.islam.ua");
        site_list.put(Poltava, "islampoltava.org");
        site_list.put(Kharkiv, "islamkharkov.org");
        site_list.put(Kherson, "islam.kherson.ua");
        site_list.put(Khmelnitsky, "khmelnizk.islam.ua");
        site_list.put(Cherkasy, "cherkassy.islam.ua");
        return site_list;
    }

    Map get_Class_city() {
        Map<String, String> name_class_city = new HashMap<String, String>();
        name_class_city.put(Kiev, "kiev");
        name_class_city.put(Zaporozhye, "zaporojye");
        name_class_city.put(Nikolaev, "nikolaev");
        name_class_city.put(Odessa, "odessa");
        name_class_city.put(Poltava, "poltava");
        name_class_city.put(Kharkiv, "harkov");
        name_class_city.put(Donetsk, "donezk");
        name_class_city.put(Lviv, "lvov");
        name_class_city.put(Cherkasy, "cherkassi");
        return name_class_city;
    }

    void fill_table_prayer() {

        //view table
        TextView first_prayer_time = findViewById(R.id.first_prayer_time);
        TextView sunrise_time = findViewById(R.id.sunrise_time);
        TextView third_prayer_time = findViewById(R.id.third_prayer_time);
        TextView fourth_prayer_time = findViewById(R.id.fourth_prayer_time);
        TextView fifth_prayer_time = findViewById(R.id.fifth_prayer_time);
        TextView second_prayer_time = findViewById(R.id.second_prayer_time);

        //current DATE
        Calendar calendar = new GregorianCalendar();
        int current_month = calendar.get(Calendar.MONTH) + 1;
        int current_day = calendar.get(Calendar.DATE);

        GregorianCalendar cal = (GregorianCalendar) calendar.getInstance();
        boolean February_29_Day = cal.isLeapYear(Calendar.YEAR);

        String empty_time = "00:00";

        //fill table
        if (current_city == null) {
            //exclusion
            first_prayer_time.setText(empty_time);
            sunrise_time.setText(empty_time);
            third_prayer_time.setText(empty_time);
            fourth_prayer_time.setText(empty_time);
            fifth_prayer_time.setText(empty_time);
            second_prayer_time.setText(empty_time);
        } else if (current_city == Kiev || current_city == Obukhov || current_city == Belayacerkov || current_city == Zhytomyr) {
            kiev kiev = new kiev();
            String[] list_time_prayer = kiev.get_time_prayer(current_month, current_day);
            if (list_time_prayer.length == 6) {
                first_prayer_time.setText(calculate_conversion(list_time_prayer[0]));
                sunrise_time.setText(calculate_conversion(list_time_prayer[1]));
                third_prayer_time.setText(calculate_conversion(list_time_prayer[2]));
                fourth_prayer_time.setText(calculate_conversion(list_time_prayer[3]));
                fifth_prayer_time.setText(calculate_conversion(list_time_prayer[4]));
                second_prayer_time.setText(calculate_conversion(list_time_prayer[5]));
            } else {
                //no time found
                first_prayer_time.setText(empty_time);
                sunrise_time.setText(empty_time);
                third_prayer_time.setText(empty_time);
                fourth_prayer_time.setText(empty_time);
                fifth_prayer_time.setText(empty_time);
                second_prayer_time.setText(empty_time);
            }
        } else if (current_city == Kharkiv) {
            harkov harkov = new harkov();
            String[] list_time_prayer = harkov.get_time_prayer(current_month, current_day);
            if (list_time_prayer.length == 6) {
                first_prayer_time.setText(calculate_conversion(list_time_prayer[0]));
                sunrise_time.setText(calculate_conversion(list_time_prayer[1]));
                third_prayer_time.setText(calculate_conversion(list_time_prayer[2]));
                fourth_prayer_time.setText(calculate_conversion(list_time_prayer[3]));
                fifth_prayer_time.setText(calculate_conversion(list_time_prayer[4]));
                second_prayer_time.setText(calculate_conversion(list_time_prayer[5]));
            } else {
                //no time found
                first_prayer_time.setText(empty_time);
                sunrise_time.setText(empty_time);
                third_prayer_time.setText(empty_time);
                fourth_prayer_time.setText(empty_time);
                fifth_prayer_time.setText(empty_time);
                second_prayer_time.setText(empty_time);
            }
        } else if (current_city == Poltava || current_city == Summi || current_city == Kremenchuk) {
            poltava poltava = new poltava();
            String[] list_time_prayer = poltava.get_time_prayer(current_month, current_day);
            if (list_time_prayer.length == 6) {
                first_prayer_time.setText(calculate_conversion(list_time_prayer[0]));
                sunrise_time.setText(calculate_conversion(list_time_prayer[1]));
                third_prayer_time.setText(calculate_conversion(list_time_prayer[2]));
                fourth_prayer_time.setText(calculate_conversion(list_time_prayer[3]));
                fifth_prayer_time.setText(calculate_conversion(list_time_prayer[4]));
                second_prayer_time.setText(calculate_conversion(list_time_prayer[5]));
            } else {
                //no time found
                first_prayer_time.setText(empty_time);
                sunrise_time.setText(empty_time);
                third_prayer_time.setText(empty_time);
                fourth_prayer_time.setText(empty_time);
                fifth_prayer_time.setText(empty_time);
                second_prayer_time.setText(empty_time);
            }
        } else if (current_city == Donetsk || current_city == Slavyansk) {
            donezk donezk = new donezk();
            String[] list_time_prayer = donezk.get_time_prayer(current_month, current_day);
            if (list_time_prayer.length == 6) {
                first_prayer_time.setText(calculate_conversion(list_time_prayer[0]));
                sunrise_time.setText(calculate_conversion(list_time_prayer[1]));
                third_prayer_time.setText(calculate_conversion(list_time_prayer[2]));
                fourth_prayer_time.setText(calculate_conversion(list_time_prayer[3]));
                fifth_prayer_time.setText(calculate_conversion(list_time_prayer[4]));
                second_prayer_time.setText(calculate_conversion(list_time_prayer[5]));
            } else {
                //no time found
                first_prayer_time.setText(empty_time);
                sunrise_time.setText(empty_time);
                third_prayer_time.setText(empty_time);
                fourth_prayer_time.setText(empty_time);
                fifth_prayer_time.setText(empty_time);
                second_prayer_time.setText(empty_time);
            }
        } else if (current_city == Zaporozhye || current_city == Melitopol) {
            zaporojye zaporojye = new zaporojye();
            String[] list_time_prayer = zaporojye.get_time_prayer(current_month, current_day);
            if (list_time_prayer.length == 6) {
                first_prayer_time.setText(calculate_conversion(list_time_prayer[0]));
                sunrise_time.setText(calculate_conversion(list_time_prayer[1]));
                third_prayer_time.setText(calculate_conversion(list_time_prayer[2]));
                fourth_prayer_time.setText(calculate_conversion(list_time_prayer[3]));
                fifth_prayer_time.setText(calculate_conversion(list_time_prayer[4]));
                second_prayer_time.setText(calculate_conversion(list_time_prayer[5]));
            } else {
                //no time found
                first_prayer_time.setText(empty_time);
                sunrise_time.setText(empty_time);
                third_prayer_time.setText(empty_time);
                fourth_prayer_time.setText(empty_time);
                fifth_prayer_time.setText(empty_time);
                second_prayer_time.setText(empty_time);
            }
        } else if (current_city == Nikolaev || current_city == Kherson || current_city == Kropyvnytsky) {
            nikolaev nikolaev = new nikolaev();
            String[] list_time_prayer = nikolaev.get_time_prayer(current_month, current_day);
            if (list_time_prayer.length == 6) {
                first_prayer_time.setText(calculate_conversion(list_time_prayer[0]));
                sunrise_time.setText(calculate_conversion(list_time_prayer[1]));
                third_prayer_time.setText(calculate_conversion(list_time_prayer[2]));
                fourth_prayer_time.setText(calculate_conversion(list_time_prayer[3]));
                fifth_prayer_time.setText(calculate_conversion(list_time_prayer[4]));
                second_prayer_time.setText(calculate_conversion(list_time_prayer[5]));
            } else {
                //no time found
                first_prayer_time.setText(empty_time);
                sunrise_time.setText(empty_time);
                third_prayer_time.setText(empty_time);
                fourth_prayer_time.setText(empty_time);
                fifth_prayer_time.setText(empty_time);
                second_prayer_time.setText(empty_time);
            }
        } else if (current_city == Odessa) {
            odessa odessa = new odessa();
            String[] list_time_prayer = odessa.get_time_prayer(current_month, current_day);
            if (list_time_prayer.length == 6) {
                first_prayer_time.setText(calculate_conversion(list_time_prayer[0]));
                sunrise_time.setText(calculate_conversion(list_time_prayer[1]));
                third_prayer_time.setText(calculate_conversion(list_time_prayer[2]));
                fourth_prayer_time.setText(calculate_conversion(list_time_prayer[3]));
                fifth_prayer_time.setText(calculate_conversion(list_time_prayer[4]));
                second_prayer_time.setText(calculate_conversion(list_time_prayer[5]));
            } else {
                //no time found
                first_prayer_time.setText(empty_time);
                sunrise_time.setText(empty_time);
                third_prayer_time.setText(empty_time);
                fourth_prayer_time.setText(empty_time);
                fifth_prayer_time.setText(empty_time);
                second_prayer_time.setText(empty_time);
            }
        } else if (current_city == Cherkasy) {
            cherkassy cherkassy = new cherkassy();
            String[] list_time_prayer = cherkassy.get_time_prayer(current_month, current_day, February_29_Day);
            if (list_time_prayer.length == 6) {
                first_prayer_time.setText(calculate_conversion(list_time_prayer[0]));
                sunrise_time.setText(calculate_conversion(list_time_prayer[1]));
                third_prayer_time.setText(calculate_conversion(list_time_prayer[2]));
                fourth_prayer_time.setText(calculate_conversion(list_time_prayer[3]));
                fifth_prayer_time.setText(calculate_conversion(list_time_prayer[4]));
                second_prayer_time.setText(calculate_conversion(list_time_prayer[5]));
            } else {
                //no time found
                first_prayer_time.setText(empty_time);
                sunrise_time.setText(empty_time);
                third_prayer_time.setText(empty_time);
                fourth_prayer_time.setText(empty_time);
                fifth_prayer_time.setText(empty_time);
                second_prayer_time.setText(empty_time);
            }
        } else if (current_city == Lviv || current_city == Khmelnitsky) {
            lvov lvov = new lvov();
            String[] list_time_prayer = lvov.get_time_prayer(current_month, current_day);
            if (list_time_prayer.length == 6) {
                first_prayer_time.setText(calculate_conversion(list_time_prayer[0]));
                sunrise_time.setText(calculate_conversion(list_time_prayer[1]));
                third_prayer_time.setText(calculate_conversion(list_time_prayer[2]));
                fourth_prayer_time.setText(calculate_conversion(list_time_prayer[3]));
                fifth_prayer_time.setText(calculate_conversion(list_time_prayer[4]));
                second_prayer_time.setText(calculate_conversion(list_time_prayer[5]));
            } else {
                //no time found
                first_prayer_time.setText(empty_time);
                sunrise_time.setText(empty_time);
                third_prayer_time.setText(empty_time);
                fourth_prayer_time.setText(empty_time);
                fifth_prayer_time.setText(empty_time);
                second_prayer_time.setText(empty_time);
            }
        } else {
            //no city found
            first_prayer_time.setText(empty_time);
            sunrise_time.setText(empty_time);
            third_prayer_time.setText(empty_time);
            fourth_prayer_time.setText(empty_time);
            fifth_prayer_time.setText(empty_time);
            second_prayer_time.setText(empty_time);
        }

    }

    String calculate_conversion(String currentTime) {

        //обробляємо ситуацію, коли відбувається перевод годинників в БЕРЕЗНІ та ЖОВТНІ

        Integer int_thisDay = 0;
        Integer int_hour = 0;
        Integer int_thisMonth = 0;

        Calendar calendar = new GregorianCalendar();
        int current_day = calendar.get(Calendar.DATE);

        int March = 03; //номер місяця БЕРЕЗЕНЬ
        int October = 10; //номер місяця ЖОВТЕНЬ
        Date thisDate = new Date(new Date().getTime());
        String thisMonth = (String) DateFormat.format("MM", thisDate); // поточний місяць
        String thisDay = (String) DateFormat.format("dd", thisDate); // поточний день

        int int_lastSundayMonth = getlastSundayMonth(); //остання неділя місяця (ЖОВТЕНЬ)

        try {

            int_thisDay = new Integer(thisDay);
            int_thisMonth = new Integer(thisMonth);

            if (int_thisMonth == October) { //якщо поточний місяць ЖОВТЕНЬ
                int_hour = new Integer(currentTime.substring(0, 2)) + 1;
                if (current_day > 24 && current_day < int_lastSundayMonth) { //попали на день в якому на 27.10.2019 в файлі годин намазів стоїть значення
                    //з урахуванням переводу годинників
                    if (int_thisDay < int_lastSundayMonth) {//якщо сьогоднішній день МЕНШЕ за останню неділю жовтня
                        if (int_hour < 10) {
                            return "0" + int_hour + currentTime.substring(2, 5); //добавляємо +1 годину, так як в поточному році 27 число НЕ є день
                            //коли потрібно переводити годинники
                        } else { //маємо час 11, 12, 13 і т.д.
                            return int_hour + currentTime.substring(2, 5); //добавляємо +1 годину, так як в поточному році 27 число НЕ є день
                            //коли потрібно переводити годинники
                        }
                    }
                }
            } else if (int_thisMonth == March) {
                int_hour = new Integer(currentTime.substring(0, 2)) + 1;
                if (current_day <= 28) {
                    if (current_day >= int_lastSundayMonth) {
                        if ( int_hour < 10) {
                            return "0" + int_hour + currentTime.substring(2, 5);
                        } else {
                            return "" + int_hour + currentTime.substring(2, 5);
                        }
                    }
                }else {
                    if (current_day < int_lastSundayMonth) {
                        int_hour = new Integer(currentTime.substring(0, 2)) - 1;
                        if ( int_hour < 10) {
                            return "0" + int_hour + currentTime.substring(2, 5);
                        } else {
                            return "" + int_hour + currentTime.substring(2, 5);
                        }
                    }
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Помилка визначення останньої неділі жовтня!");
        }
        return currentTime; //не потрібні урахування переводу годинників
    }

    int getlastSundayMonth() {
        Date date = new Date(new Date().getTime());
        int lastDayMounth = getDayNumberOld(date);
        return lastDayMounth;
    }

    int getDayNumberOld(Date date) {

        int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        int thisMonth = Calendar.getInstance().get(Calendar.MONTH);
        Calendar cal = Calendar.getInstance();

        cal.set( thisYear, thisMonth + 1, 1 );
        cal.add(Calendar.DATE, -1);
        cal.add( Calendar.DAY_OF_MONTH, -( cal.get( Calendar.DAY_OF_WEEK ) - 1 ) );
        Date dateOldNumber = cal.getTime();
        String dayNumberOld = (String) DateFormat.format("dd", dateOldNumber); // поточний день

        int int_dayNumberOld = 0;

        try {
            int_dayNumberOld = new Integer(dayNumberOld);
        } catch (NumberFormatException e) {
            System.err.println("Помилка визначення останньої неділі жовтня!");
        }

        return int_dayNumberOld;

    }

}