package dacaiyule.alanxie.com.dacaiyule.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import dacaiyule.alanxie.com.dacaiyule.R;
import dacaiyule.alanxie.com.dacaiyule.util.DrawableUtil;

public class WangZhanFragment extends Fragment implements OnClickListener{

	private TextView tvTitle;
	private ImageView ivBack;

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_wangzhan, container, false);
		
		initView(view);
		return view;
	}
	
	private void initView(View view){

		tvTitle = (TextView) view.findViewById(R.id.tv_title);
		ivBack = (ImageView) view.findViewById(R.id.iv_back);
		ivBack.setVisibility(View.INVISIBLE);
		tvTitle.setText("网站公告");
	}


	@Override
	public void onClick(View v) {

	}
}











