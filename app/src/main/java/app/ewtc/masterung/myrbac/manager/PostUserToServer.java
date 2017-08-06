package app.ewtc.masterung.myrbac.manager;

import android.content.Context;
import android.os.AsyncTask;

/**
 * Created by Administrator on 6/8/2560.
 */

public class PostUserToServer extends AsyncTask<String, Void, String>{

    private Context context;

    public  PostUserToServer(Context context){
        this.context = context;
    }

    @Override
    protected String doInBackground(String... strings) {

        try {




        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }
} //Main Class
