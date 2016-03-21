package ua.com.kistudio.birthdayapplication.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Вiталя on 18.03.2016.
 */
public class User {

    private int mId;
    private String mFirstName;
    private String mLastName;
    private Calendar mBirthday;
    private String mEmail;

    public User(int mId, String mFirstName, String mLastName, String mBirthdayString, String mEmail) {
        this.mId = mId;
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
        this.mBirthday = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        try {
            this.mBirthday.setTime(sdf.parse(mBirthdayString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.mEmail = mEmail;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public void setmFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public void setmLastName(String mLastName) {
        this.mLastName = mLastName;
    }

    public Calendar getmBirthday() {
        return mBirthday;
    }


    public String getStringmBirthday() {
        SimpleDateFormat sdfTemplate = new SimpleDateFormat("yyyy-mm-dd");
        return sdfTemplate.format(mBirthday);
    }

    public void setmBirthday(Calendar mBirthday) {
        this.mBirthday = mBirthday;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }
}