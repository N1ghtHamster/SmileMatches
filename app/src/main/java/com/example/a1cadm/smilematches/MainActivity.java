package com.example.a1cadm.smilematches;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bnGame;
    Button bStatistic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        bnGame = (Button) findViewById(R.id.bnGame);
        bStatistic = (Button) findViewById(R.id.bStatistic);

    }
    // Метод обработки нажатия на кнопку
    public void onClick(View v) {
        // по id определеяем кнопку, вызвавшую этот обработчик
        switch (v.getId()) {
            case R.id.bnGame:
                // кнопка New Game
                Intent intent = new Intent(this, GamePoolActivity.class);
                startActivity(intent);
                //tvOut.setText("Нажата кнопка ОК");
                break;
            case R.id.bStatistic:
                // кнопка Statistic
                Intent intent1 = new Intent(this, StatistikActivity.class);
                startActivity(intent1);
                //tvOut.setText("Нажата кнопка Cancel");
                break;
        }
    }
}

