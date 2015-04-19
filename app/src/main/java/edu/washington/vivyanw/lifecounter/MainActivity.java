package edu.washington.vivyanw.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    //P1 fields
    int life;
    Button p1LifeChange;
    Button p1LifeChange2;
    Button p1LifeChange3;
    Button p1LifeChange4;
    TextView p1Stats;

    //P2 fields
    int life2;
    Button p2LifeChange;
    Button p2LifeChange2;
    Button p2LifeChange3;
    Button p2LifeChange4;
    TextView p2Stats;

    //P3 fields
    int life3;
    Button p3LifeChange;
    Button p3LifeChange2;
    Button p3LifeChange3;
    Button p3LifeChange4;
    TextView p3Stats;

    //P4 fields
    int life4;
    Button p4LifeChange;
    Button p4LifeChange2;
    Button p4LifeChange3;
    Button p4LifeChange4;
    TextView p4Stats;

    TextView gameOver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.players_main);

        gameOver = (TextView) findViewById(R.id.playerLost);

        //p1
        life = 100;
        p1Stats = (TextView) findViewById(R.id.stats);
        p1LifeChange = (Button) findViewById(R.id.btnPlus);
        p1LifeChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life++;
                p1Stats.setText("Life: " + life);
            }
        });

        p1LifeChange2 = (Button) findViewById(R.id.btnMinus);
        p1LifeChange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life--;
                p1Stats.setText("Life: " + life);
            }
        });

        p1LifeChange3 = (Button) findViewById(R.id.btnPlus5);
        p1LifeChange3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life = life + 5;
                p1Stats.setText("Life: " + life);
            }
        });

        p1LifeChange4 = (Button) findViewById(R.id.btnMinus5);
        p1LifeChange4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life = life - 5;
                p1Stats.setText("Life: " + life);
            }
        });

        //p2
        life2 = 100;
        p2Stats = (TextView) findViewById(R.id.stats2);
        p2LifeChange = (Button) findViewById(R.id.btnPlus2);
        p2LifeChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life2++;
                p2Stats.setText("Life: " + life2);
            }
        });

        p2LifeChange2 = (Button) findViewById(R.id.btnMinus2);
        p2LifeChange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life2--;
                p2Stats.setText("Life: " + life2);
            }
        });

        p2LifeChange3 = (Button) findViewById(R.id.btnPlus52);
        p2LifeChange3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life2 += 5;
                p2Stats.setText("Life: " + life2);
            }
        });

        p2LifeChange4 = (Button) findViewById(R.id.btnMinus52);
        p2LifeChange4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life2 -= 5;
                p2Stats.setText("Life: " + life2);
            }
        });

        //p3
        life3 = 100;
        p3Stats = (TextView) findViewById(R.id.stats3);
        p3LifeChange = (Button) findViewById(R.id.btnPlus3);
        p3LifeChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life3++;
                p3Stats.setText("Life: " + life3);
            }
        });

        p3LifeChange2 = (Button) findViewById(R.id.btnMinus3);
        p3LifeChange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life3--;
                p3Stats.setText("Life: " + life3);
            }
        });

        p3LifeChange3 = (Button) findViewById(R.id.btnPlus53);
        p3LifeChange3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life3 += 5;
                p3Stats.setText("Life: " + life3);
            }
        });

        p3LifeChange4 = (Button) findViewById(R.id.btnMinus53);
        p3LifeChange4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life3 -= 5;
                p3Stats.setText("Life: " + life3);
            }
        });

        //p4
        life4 = 100;
        p4Stats = (TextView) findViewById(R.id.stats4);
        p4LifeChange = (Button) findViewById(R.id.btnPlus4);
        p4LifeChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life4++;
                p4Stats.setText("Life: " + life4);
            }
        });

        p4LifeChange2 = (Button) findViewById(R.id.btnMinus4);
        p4LifeChange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life4--;
                p4Stats.setText("Life: " + life4);
            }
        });

        p4LifeChange3 = (Button) findViewById(R.id.btnPlus54);
        p4LifeChange3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life4 += 5;
                p4Stats.setText("Life: " + life4);
            }
        });

        p4LifeChange4 = (Button) findViewById(R.id.btnMinus54);
        p4LifeChange4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life4 -= 5;
                p4Stats.setText("Life: " + life4);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
