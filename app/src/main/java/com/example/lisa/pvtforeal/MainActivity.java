package com.example.lisa.pvtforeal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView whatIs;
    TextView problem;
    EditText answer;
    Button submit;
    int x;
    int y;
    int correct;

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.x
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        x = (int) (Math.random() * 20 + 1);
        y = (int) (Math.random() * 20 + 1);
        whatIs = (TextView) findViewById(R.id.whatIs);
        problem = (TextView) findViewById(R.id.problem);
        problem.setText(x + " + " + y + "?");
        answer = (EditText) findViewById(R.id.answer);

        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float answerS = Float.parseFloat(answer.getText().toString());
                if (answerS == (x + y)) {
                    correct++;
                }
                x = (int) (Math.random() * 20 + 1);
                y = (int) (Math.random() * 20 + 1);
                problem.setText(x + " + " + y + "?");

                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        float answerS = Float.parseFloat(answer.getText().toString());
                        if (answerS == (x + y)) {
                            correct++;
                        }
                    }

                });
            }
        });
    }
        public void sendMessage (View view){
        Intent intent = new Intent(this, QuestionActivity.class);
        intent.putExtra(EXTRA_HITS, hitNum);
        intent.putExtra(EXTRA_MISSES, missNum);
        intent.putExtra(EXTRA_FALSE_STARTS, fsNum);
        intent.putExtra(EXTRA_REACTION_ARRAY, getList());
        startActivity(intent);

    }
}



    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.

    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") TODO: Define a title for the content shown.
;                TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.

    public com.google.android.gms.appindexing.Action getIndexApiAction() {
        com.google.android.gms.appindexing.Thing object = new com.google.android.gms.appindexing.Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new com.google.android.gms.appindexing.Action.Builder(com.google.android.gms.appindexing.Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(com.google.android.gms.appindexing.Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        com.google.android.gms.appindexing.AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        com.google.android.gms.appindexing.AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
    */
