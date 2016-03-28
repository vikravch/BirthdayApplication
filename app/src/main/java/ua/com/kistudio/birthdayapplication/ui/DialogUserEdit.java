package ua.com.kistudio.birthdayapplication.ui;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ua.com.kistudio.birthdayapplication.R;

/**
 * Created by Вiталя on 24.03.2016.
 */
public class DialogUserEdit extends DialogFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog_user_edit,container,false);
        return v;
    }
}
