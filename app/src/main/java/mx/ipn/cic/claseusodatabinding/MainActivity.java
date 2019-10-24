package mx.ipn.cic.claseusodatabinding;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import mx.ipn.cic.claseusodatabinding.databinding.ActivityMainBinding;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        final ActivityMainBinding activityMainBinding;

        super.onCreate(savedInstanceState);
        Color c = Color.valueOf(1);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        UserInfo userInfo = new UserInfo("EJEMPLO DE CAMBIO PROPIEDAD TEXT", "USANDO DATABINDING POJO", c);
        activityMainBinding.setUserInfo(userInfo);
        //setContentView(R.layout.activity_main);
    }
}
