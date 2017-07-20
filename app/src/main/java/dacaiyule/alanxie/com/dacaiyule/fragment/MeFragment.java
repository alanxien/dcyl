package dacaiyule.alanxie.com.dacaiyule.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import dacaiyule.alanxie.com.dacaiyule.R;
import dacaiyule.alanxie.com.dacaiyule.util.DrawableUtil;

public class MeFragment extends Fragment implements OnClickListener{

	private TextView btnExit;


	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_me, container, false);
		
		initView(view);
		return view;
	}
	
	private void initView(View view){

		btnExit = (TextView) view.findViewById(R.id.btn_exit);
		btnExit.setBackgroundDrawable(DrawableUtil.getSelectorDrawableColor(
				getResources().getColor(R.color.theme_color),
				getResources().getColor(R.color.theme_color_2),
				15f
		));
	}


	@Override
	public void onClick(View v) {

	}
}











