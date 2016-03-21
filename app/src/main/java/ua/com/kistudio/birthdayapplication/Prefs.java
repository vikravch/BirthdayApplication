package ua.com.kistudio.birthdayapplication;

import android.net.Uri;

/**
 * Created by Вiталя on 18.03.2016.
 */
public class Prefs {
    public static final String LOG_TAG = "BirthdayLogs";
    public static final String DB_NAME = "birthday_db";
    public static final String TABLE_NAME = "users";
    public static final String ID_FIELD_NAME = "_id";

    public static final String FN_FIELD_NAME = "first_name";
    public static final String LN_FIELD_NAME = "last_name";
    public static final String BIRTHDAY_FIELD_NAME = "birthday";
    public static final String EMAIL_FIELD_NAME = "email";
    public static final String AUTORITY = "ua.com.kistudio.birthdayapplication.provider";
    
    public static final String PATH_USER = "users";
    public static final int CODE_USER = 1;
    
    public static final String PATH_API = "api";
    public static final int CODE_API = 2;
    
    public static final Uri USERS_URI = Uri.parse("content://"+AUTORITY+"/"+PATH_USER);
    public static final Uri API_URI = Uri.parse("content://"+AUTORITY+"/"+PATH_API);


    public static final int DB_VERSION = 1;


    public static final String API_SERVER = "http://cityfinder.esy.es";
}
