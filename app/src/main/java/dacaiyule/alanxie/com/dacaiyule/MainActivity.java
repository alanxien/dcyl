package dacaiyule.alanxie.com.dacaiyule;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RadioButton;

import java.util.ArrayList;

import dacaiyule.alanxie.com.dacaiyule.adapter.MyFragmentPagerAdapter;
import dacaiyule.alanxie.com.dacaiyule.fragment.GouCaiFragment;
import dacaiyule.alanxie.com.dacaiyule.fragment.KaiJiangFragment;
import dacaiyule.alanxie.com.dacaiyule.fragment.MeFragment;
import dacaiyule.alanxie.com.dacaiyule.fragment.WangZhanFragment;
import dacaiyule.alanxie.com.dacaiyule.util.StatusBarUtils;
import dacaiyule.alanxie.com.dacaiyule.viewpager.CustomViewPager;

public class MainActivity extends FragmentActivity implements View.OnClickListener{

    public static final int TAB_0 = 0;  // 购彩大厅
    public static final int TAB_1 = 1; 	// 开奖公告
    public static final int TAB_2 = 2; 	// 网站公告
    public static final int TAB_3 = 3; 	// 用户中心

    private CustomViewPager viewPager;
    private ArrayList<Fragment> fragmentsList = new ArrayList<Fragment>();
    private RadioButton mainTab0, mainTab1, mainTab2, mainTab3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusBarUtils.setWindowStatusBarColor(this,R.color.theme_color);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView(){
        viewPager = (CustomViewPager) findViewById(R.id.viewpager);
        mainTab0 = (RadioButton) findViewById(R.id.main_tab_home);
        mainTab1 = (RadioButton) findViewById(R.id.main_tab_kaijiang);
        mainTab2 = (RadioButton) findViewById(R.id.main_tab_wangzhan);
        mainTab3 = (RadioButton) findViewById(R.id.main_tab_me);

        mainTab0.setOnClickListener(this);
        mainTab1.setOnClickListener(this);
        mainTab2.setOnClickListener(this);
        mainTab3.setOnClickListener(this);

        mainTab0.setChecked(true);

        GouCaiFragment gouCaiFragment = new GouCaiFragment();
        KaiJiangFragment kaiJiangFragment = new KaiJiangFragment();
        WangZhanFragment wangZhanFragment = new WangZhanFragment();
        MeFragment meFragment = new MeFragment();

        fragmentsList.add(gouCaiFragment);
        fragmentsList.add(kaiJiangFragment);
        fragmentsList.add(wangZhanFragment);
        fragmentsList.add(meFragment);

        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(
                getSupportFragmentManager(), fragmentsList);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(4);
        viewPager.setScanScroll(false);

    }

    ViewPager.OnPageChangeListener pageListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int position) {
            switch (position) {
                case TAB_0:
                    mainTab0.setChecked(true);
                    break;
                case TAB_1:
                    mainTab1.setChecked(true);
                    break;
                case TAB_2:
                    mainTab2.setChecked(true);
                    break;
                case TAB_3:
                    mainTab3.setChecked(true);
                    break;
                default:
                    break;
            }
        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onPageScrollStateChanged(int position) {

        }
    };

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_tab_home:
                viewPager.setCurrentItem(TAB_0,false);
                mainTab0.setChecked(true);
                break;
            case R.id.main_tab_kaijiang:
                viewPager.setCurrentItem(TAB_1,false);
                mainTab1.setChecked(true);
                break;
            case R.id.main_tab_wangzhan:
                viewPager.setCurrentItem(TAB_2,false);
                mainTab2.setChecked(true);
                break;
            case R.id.main_tab_me:
                viewPager.setCurrentItem(TAB_3,false);
                mainTab3.setChecked(true);
                break;
        }
    }
}
