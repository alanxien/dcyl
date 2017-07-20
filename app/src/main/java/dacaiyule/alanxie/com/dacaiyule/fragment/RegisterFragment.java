package dacaiyule.alanxie.com.dacaiyule.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import dacaiyule.alanxie.com.dacaiyule.R;
import dacaiyule.alanxie.com.dacaiyule.util.DrawableUtil;

public class RegisterFragment extends Fragment implements OnClickListener{
	private TextView tvRegister;
	private LinearLayout llUserName,llPassword,llPassword2;
	private RelativeLayout rlCode;

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_rigister, container, false);
		
		initView(view);
		return view;
	}
	
	private void initView(View view){

		tvRegister = (TextView) view.findViewById(R.id.btn_register);
		llUserName = (LinearLayout) view.findViewById(R.id.ll_username);
		llPassword = (LinearLayout) view.findViewById(R.id.ll_password);
		rlCode = (RelativeLayout) view.findViewById(R.id.rl_code);
		llPassword2 = (LinearLayout) view.findViewById(R.id.ll_password2);

		tvRegister.setBackgroundDrawable(DrawableUtil.getSelectorDrawableColor(
				getResources().getColor(R.color.theme_color),
				getResources().getColor(R.color.theme_color_2),
				15f
		));

		llUserName.setBackgroundDrawable(DrawableUtil.getGradientDrawableStroke(
				getResources().getColor(R.color.solid),
				getResources().getColor(R.color.white),
				5f
		));
		llPassword.setBackgroundDrawable(DrawableUtil.getGradientDrawableStroke(
				getResources().getColor(R.color.solid),
				getResources().getColor(R.color.white),
				5f
		));
		llPassword2.setBackgroundDrawable(DrawableUtil.getGradientDrawableStroke(
				getResources().getColor(R.color.solid),
				getResources().getColor(R.color.white),
				5f
		));
		rlCode.setBackgroundDrawable(DrawableUtil.getGradientDrawableStroke(
				getResources().getColor(R.color.solid),
				getResources().getColor(R.color.white),
				5f
		));
	}


	@Override
	public void onClick(View v) {

	}
}











