package dacaiyule.alanxie.com.dacaiyule;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import dacaiyule.alanxie.com.dacaiyule.util.StatusBarUtils;

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtils.setWindowStatusBarColor(this,R.color.theme_color);
    }

    public void back(View view){
        this.finish();
    }
}
