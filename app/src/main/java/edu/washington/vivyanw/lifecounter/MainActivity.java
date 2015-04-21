package edu.washington.vivyanw.lifecounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    //P1 fields
    int life;
    Button p1LifeChange;
    Button p1LifeChange2;
    Button p1LifeChange3;
    Button p1LifeChange4;
    TextView p1Stats;
    LinearLayout p1Display;

    //P2 fields
    int life2;
    Button p2LifeChange;
    Button p2LifeChange2;
    Button p2LifeChange3;
    Button p2LifeChange4;
    TextView p2Stats;
    LinearLayout p2Display;

    //P3 fields
    int life3;
    Button p3LifeChange;
    Button p3LifeChange2;
    Button p3LifeChange3;
    Button p3LifeChange4;
    TextView p3Stats;
    LinearLayout p3Display;

    //P4 fields
    int life4;
    Button p4LifeChange;
    Button p4LifeChange2;
    Button p4LifeChange3;
    Button p4LifeChange4;
    TextView p4Stats;
    LinearLayout p4Display;

    //P5 fields
    int life5;
    Button p5LifeChange;
    Button p5LifeChange2;
    Button p5LifeChange3;
    Button p5LifeChange4;
    TextView p5Stats;
    LinearLayout p5Display;

    //P6 fields
    int life6;
    Button p6LifeChange;
    Button p6LifeChange2;
    Button p6LifeChange3;
    Button p6LifeChange4;
    TextView p6Stats;
    LinearLayout p6Display;

    //P7 fields
    int life7;
    Button p7LifeChange;
    Button p7LifeChange2;
    Button p7LifeChange3;
    Button p7LifeChange4;
    TextView p7Stats;
    LinearLayout p7Display;

    //P8 fields
    int life8;
    Button p8LifeChange;
    Button p8LifeChange2;
    Button p8LifeChange3;
    Button p8LifeChange4;
    TextView p8Stats;
    LinearLayout p8Display;

    //setting up players
    Button submit;
    TextView playersText;
    EditText numPlayers;
    TextView gameOver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.players_main);

        playersText = (TextView) findViewById(R.id.txtPlayers);
        numPlayers = (EditText) findViewById(R.id.usrNumberPlayers);
        submit = (Button) findViewById(R.id.btnSubmit);
        gameOver = (TextView) findViewById(R.id.playerLost);

        //set displays
        p1Display = (LinearLayout)findViewById(R.id.player1);
        p2Display = (LinearLayout)findViewById(R.id.player2);
        p3Display = (LinearLayout)findViewById(R.id.player3);
        p4Display = (LinearLayout)findViewById(R.id.player4);
        p5Display = (LinearLayout)findViewById(R.id.player5);
        p6Display = (LinearLayout)findViewById(R.id.player6);
        p7Display = (LinearLayout)findViewById(R.id.player7);
        p8Display = (LinearLayout)findViewById(R.id.player8);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = numPlayers.getText().toString();
                //String value = String.valueOf(Log.v("EditText", numPlayers.getText().toString()));
                playersText.setVisibility(View.GONE);
                numPlayers.setVisibility(View.GONE);
                submit.setVisibility(View.GONE);

                p1Display.setVisibility(View.VISIBLE);
                p2Display.setVisibility(View.VISIBLE);
                if (value.contains("3")) {
                    p3Display.setVisibility(View.VISIBLE);
                    /*p4Display.setVisibility(View.GONE);
                    p5Display.setVisibility(View.GONE);
                    p6Display.setVisibility(View.GONE);
                    p7Display.setVisibility(View.GONE);
                    p8Display.setVisibility(View.GONE);*/
                } else if (value.contains("4")) {
                    p3Display.setVisibility(View.VISIBLE);
                    p4Display.setVisibility(View.VISIBLE);
                    /*p5Display.setVisibility(View.GONE);
                    p6Display.setVisibility(View.GONE);
                    p7Display.setVisibility(View.GONE);
                    p8Display.setVisibility(View.GONE);*/
                } else if (value.contains("5")) {
                    p3Display.setVisibility(View.VISIBLE);
                    p4Display.setVisibility(View.VISIBLE);
                    p5Display.setVisibility(View.VISIBLE);
                    /*p6Display.setVisibility(View.GONE);
                    p7Display.setVisibility(View.GONE);
                    p8Display.setVisibility(View.GONE);*/

                } else if(value.contains("6")) {
                    p3Display.setVisibility(View.VISIBLE);
                    p4Display.setVisibility(View.VISIBLE);
                    p5Display.setVisibility(View.VISIBLE);
                    p6Display.setVisibility(View.VISIBLE);
                    /*p7Display.setVisibility(View.GONE);
                    p8Display.setVisibility(View.GONE);*/

                } else if(value.contains("7")) {
                    p2Display.setVisibility(View.VISIBLE);
                    p3Display.setVisibility(View.VISIBLE);
                    p4Display.setVisibility(View.VISIBLE);
                    p5Display.setVisibility(View.VISIBLE);
                    p6Display.setVisibility(View.VISIBLE);
                    p7Display.setVisibility(View.VISIBLE);
                    //p8Display.setVisibility(View.GONE);

                } else if (value.contains("8")) {
                    p2Display.setVisibility(View.VISIBLE);
                    p3Display.setVisibility(View.VISIBLE);
                    p4Display.setVisibility(View.VISIBLE);
                    p5Display.setVisibility(View.VISIBLE);
                    p6Display.setVisibility(View.VISIBLE);
                    p7Display.setVisibility(View.VISIBLE);
                    p8Display.setVisibility(View.VISIBLE);

                }
            }
        });

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
                if (life <= 0) {
                    gameOver.setText("Player 1 LOSES!");
                    gameOver.setVisibility(View.VISIBLE);
                }
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
                if (life <= 0) {
                    gameOver.setText("Player 1 LOSES!");
                    gameOver.setVisibility(View.VISIBLE);
                }
                p1Stats.setText("Life: " + life);
            }
        });//end of p1

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
                if (life2 <= 0 ) {
                    gameOver.setText("Player 2 LOSES!");
                    gameOver.setVisibility(View.VISIBLE);
                }
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
                if (life2 <= 0 ) {
                    gameOver.setText("Player 2 LOSES!");
                    gameOver.setVisibility(View.VISIBLE);
                }
                p2Stats.setText("Life: " + life2);
            }
        });//end of p2

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
                if(life3 <= 0) {
                    gameOver.setText("Player 3 LOSES!");
                    gameOver.setVisibility(View.VISIBLE);
                }
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
                if(life3 <= 0) {
                    gameOver.setText("Player 3 LOSES!");
                    gameOver.setVisibility(View.VISIBLE);
                }
                p3Stats.setText("Life: " + life3);
            }
        });//end of p3

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
                if(life4 <= 0) {
                    gameOver.setText("Player 4 LOSES!");
                    gameOver.setVisibility(View.VISIBLE);
                }
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
                if(life4 <= 0) {
                    gameOver.setText("Player 4 LOSES!");
                    gameOver.setVisibility(View.VISIBLE);
                }
                p4Stats.setText("Life: " + life4);
            }
        });//end of p4

        //p5
        life5 = 100;
        p5Stats = (TextView) findViewById(R.id.stats5);
        p5LifeChange = (Button) findViewById(R.id.btnPlus_5);
        p5LifeChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life5++;
                p5Stats.setText("Life: " + life5);
            }
        });

        p5LifeChange2 = (Button) findViewById(R.id.btnMinus_5);
        p5LifeChange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life5--;
                if (life5 <= 0) {
                    gameOver.setText("Player 5 LOSES!");
                    gameOver.setVisibility(View.VISIBLE);
                }
                p5Stats.setText("Life: " + life);
            }
        });

        p5LifeChange3 = (Button) findViewById(R.id.btnPlus55);
        p5LifeChange3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life5 = life5 + 5;
                p5Stats.setText("Life: " + life5);
            }
        });

        p5LifeChange4 = (Button) findViewById(R.id.btnMinus55);
        p5LifeChange4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life5 = life5 - 5;
                if (life5 <= 0) {
                    gameOver.setText("Player 5 LOSES!");
                    gameOver.setVisibility(View.VISIBLE);
                }
                p5Stats.setText("Life: " + life5);
            }
        });//end of p5

        //p6
        life6 = 100;
        p6Stats = (TextView) findViewById(R.id.stats6);
        p6LifeChange = (Button) findViewById(R.id.btnPlus6);
        p6LifeChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life6++;
                p6Stats.setText("Life: " + life6);
            }
        });

        p6LifeChange2 = (Button) findViewById(R.id.btnMinus6);
        p6LifeChange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life6--;
                if (life6 <= 0) {
                    gameOver.setText("Player 6 LOSES!");
                    gameOver.setVisibility(View.VISIBLE);
                }
                p6Stats.setText("Life: " + life6);
            }
        });

        p6LifeChange3 = (Button) findViewById(R.id.btnPlus56);
        p6LifeChange3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life6 = life6 + 5;
                p6Stats.setText("Life: " + life6);
            }
        });

        p6LifeChange4 = (Button) findViewById(R.id.btnMinus56);
        p6LifeChange4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life6 = life6 - 5;
                if (life6 <= 0) {
                    gameOver.setText("Player 6 LOSES!");
                    gameOver.setVisibility(View.VISIBLE);
                }
                p6Stats.setText("Life: " + life6);
            }
        });//end of p6

        //p7
        life7 = 100;
        p7Stats = (TextView) findViewById(R.id.stats7);
        p7LifeChange = (Button) findViewById(R.id.btnPlus7);
        p7LifeChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life7++;
                p7Stats.setText("Life: " + life7);
            }
        });

        p7LifeChange2 = (Button) findViewById(R.id.btnMinus7);
        p7LifeChange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life7--;
                if (life7 <= 0) {
                    gameOver.setText("Player 7 LOSES!");
                    gameOver.setVisibility(View.VISIBLE);
                }
                p7Stats.setText("Life: " + life7);
            }
        });

        p7LifeChange3 = (Button) findViewById(R.id.btnPlus57);
        p7LifeChange3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life7 = life7 + 5;
                p7Stats.setText("Life: " + life7);
            }
        });

        p7LifeChange4 = (Button) findViewById(R.id.btnMinus57);
        p7LifeChange4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life7 = life7 - 5;
                if (life7 <= 0) {
                    gameOver.setText("Player 7 LOSES!");
                    gameOver.setVisibility(View.VISIBLE);
                }
                p7Stats.setText("Life: " + life7);
            }
        });//end of p7

        //p8
        life8 = 100;
        p8Stats = (TextView) findViewById(R.id.stats8);
        p8LifeChange = (Button) findViewById(R.id.btnPlus8);
        p8LifeChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life8++;
                p8Stats.setText("Life: " + life8);
            }
        });

        p8LifeChange2 = (Button) findViewById(R.id.btnMinus8);
        p8LifeChange2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life8--;
                if (life8 <= 0) {
                    gameOver.setText("Player 8 LOSES!");
                    gameOver.setVisibility(View.VISIBLE);
                }
                p8Stats.setText("Life: " + life8);
            }
        });

        p8LifeChange3 = (Button) findViewById(R.id.btnPlus58);
        p8LifeChange3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life8 = life8 + 5;
                p8Stats.setText("Life: " + life8);
            }
        });

        p8LifeChange4 = (Button) findViewById(R.id.btnMinus58);
        p8LifeChange4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                life8 = life8 - 5;
                if (life8 <= 0) {
                    gameOver.setText("Player 8 LOSES!");
                    gameOver.setVisibility(View.VISIBLE);
                }
                p8Stats.setText("Life: " + life8);
            }
        });//end of p8
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
