package ua.com.kistudio.birthdayapplication.model;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;

public class MyIntentService extends IntentService {

    public static final String ACTION_GET_ALL = "ua.com.kistudio.birthdayapplication.model.action.GET_ALL";

    private static final String EXTRA_USER_ID = "ua.com.kistudio.birthdayapplication.model.extra.USER_ID";

    public MyIntentService() {
        super("MyIntentService");
    }

    /**
     * Starts this service to perform action Foo with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */

    public static void startActionGetAll(Context context){
        Intent intent = new Intent(context, MyIntentService.class).setAction(ACTION_GET_ALL);
        context.startService(intent);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (ACTION_GET_ALL.equals(action)) {
                handleActionGetAll();
            }
        }
    }

    private void handleActionGetAll() {
        //TODO
    }

}
