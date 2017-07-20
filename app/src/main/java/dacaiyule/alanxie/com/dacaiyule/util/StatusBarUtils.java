package dacaiyule.alanxie.com.dacaiyule.util;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import dacaiyule.alanxie.com.dacaiyule.R;


/**
 * Created by xin.xie on 2016/11/17.
 * Description:
 */

public class StatusBarUtils {

    public static void setWindowStatusBarColor(Activity activity, int colorResId) {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                Window window = activity.getWindow();
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.setStatusBarColor(activity.getResources().getColor(colorResId));
                //底部导航栏
                //window.setNavigationBarColor(activity.getResources().getColor(colorResId));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setWindowStatusBarColor(Dialog dialog, int colorResId) {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                Window window = dialog.getWindow();
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.setStatusBarColor(dialog.getContext().getResources().getColor(colorResId));

                //底部导航栏
                //window.setNavigationBarColor(activity.getResources().getColor(colorResId));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void setTranslucentStatus(View rootView,Activity activity,int type)
//    {
//        //判断版本是4.4以上
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT && activity!=null && rootView!=null)
//        {
//            Window win = activity.getWindow();
//            WindowManager.LayoutParams winParams = win.getAttributes();
//            final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
//            winParams.flags |= bits;
//            win.setAttributes(winParams);
//
//            SystemStatusManager tintManager = new SystemStatusManager(activity);
//            //打开系统状态栏控制
//            tintManager.setStatusBarTintEnabled(true);
//            if(type == 1){
//                tintManager.setStatusBarTintResource(R.drawable.statusbar_bg1);//设置背景
//            }else{
//                tintManager.setStatusBarTintResource(R.drawable.statusbar_bg1);//设置背景
//            }
//
//            View layoutAll = rootView.findViewById(R.id.root);
//            //设置系统栏需要的内偏移
//            layoutAll.setPadding(0, ScreenUtils.getStatusHeight(activity), 0, 0);
//        }
//    }
}
