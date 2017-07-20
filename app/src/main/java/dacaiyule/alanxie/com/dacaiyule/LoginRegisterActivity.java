package dacaiyule.alanxie.com.dacaiyule;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import dacaiyule.alanxie.com.dacaiyule.adapter.MyFragmentPagerAdapter;
import dacaiyule.alanxie.com.dacaiyule.fragment.LoginFragment;
import dacaiyule.alanxie.com.dacaiyule.fragment.RegisterFragment;
import dacaiyule.alanxie.com.dacaiyule.util.StatusBarUtils;
import dacaiyule.alanxie.com.dacaiyule.viewpager.CustomViewPager;

public class LoginRegisterActivity extends FragmentActivity implements View.OnClickListener {

    public static final int TAB_LOGIN = 0;  // 登陆
    public static final int TAB_REGISTER = 1; 	// 注册

    private CustomViewPager viewPager;
    private ArrayList<Fragment> fragmentsList = new ArrayList<Fragment>();
    private TextView tvLogin,tvRegister;
    private ImageView ivLogin,ivRegister;

    public LoginRegisterActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtils.setWindowStatusBarColor(this,R.color.theme_color);
        setContentView(R.layout.login_register);

        initView();
    }

    private void initView(){

        viewPager = (CustomViewPager) findViewById(R.id.viewpager);
        tvLogin = (TextView) findViewById(R.id.tv_login);
        tvRegister = (TextView) findViewById(R.id.tv_register);
        ivLogin = (ImageView) findViewById(R.id.iv_login);
        ivRegister = (ImageView) findViewById(R.id.iv_register);

        tvLogin.setOnClickListener(this);
        tvRegister.setOnClickListener(this);

        LoginFragment loginFragment = new LoginFragment();
        RegisterFragment registerFragment = new RegisterFragment();

        fragmentsList.add(loginFragment);
        fragmentsList.add(registerFragment);

        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(
                getSupportFragmentManager(), fragmentsList);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(2);
        viewPager.setScanScroll(false);
    }

    public void back(View view){
        this.finish();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.tv_login:
                viewPager.setCurrentItem(TAB_LOGIN,false);
                ivRegister.setVisibility(View.INVISIBLE);
                ivLogin.setVisibility(View.VISIBLE);
                break;
            case R.id.tv_register:
                viewPager.setCurrentItem(TAB_REGISTER,false);
                ivRegister.setVisibility(View.VISIBLE);
                ivLogin.setVisibility(View.INVISIBLE);
                break;

        }
    }
}
