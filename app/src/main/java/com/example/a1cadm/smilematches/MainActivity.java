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
        Intent intent = new Intent(this, GamePoolActivity.class);
        startActivity(intent);
        // по id определеяем кнопку, вызвавшую этот обработчик
        /*switch (v.getId()) {
            case R.id.bnGame:
                // кнопка ОК
                tvOut.setText("Нажата кнопка ОК");
                break;
            case R.id.bStatistic:
                // кнопка Cancel
                tvOut.setText("Нажата кнопка Cancel");
                break;
        }*/
    }
}

