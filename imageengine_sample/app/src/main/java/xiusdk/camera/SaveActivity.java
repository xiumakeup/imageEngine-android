package xiusdk.camera;

import xiusdk.tools.GlobalDefinitions;
import xiusdk.tools.ScaleUtils;
import xiusdk.tools.TitleView;

//import com.example.timageviewtest.R;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

import com.xiusdk.beautycamera.R;

public class SaveActivity extends Activity{
	private RelativeLayout main = null;
	private TitleView mTitleBar = null;
	private final int FILTER_ACTIVITY_ID = 9000;
	private ImageView mCancelBtn = null;
	private ImageView mOkBtn = null;
	private TextView mSaveTxt = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN); 
		main = new RelativeLayout(this);
		main.setBackgroundResource(R.drawable.save_bac);
		setContentView(main);
		ScaleUtils.scaleInit(this,1280,720,320);
		InitialUI();
		ResponseUI();
	}
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.d(GlobalDefinitions.TAG, "--CameraActivity onResume");

	}

	@Override
	public void onPause() {
		super.onPause();
	}

	@Override                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
	public void onDestroy() {
		super.onDestroy();
	}
	private void InitialUI()
	{
		RelativeLayout.LayoutParams param = new RelativeLayout.LayoutParams(LayoutParams.FILL_PARENT,ScaleUtils.scale(100));
		mTitleBar = new TitleView(this,GlobalDefinitions.SCREEN_WIDTH,ScaleUtils.scale(100),R.drawable.title_back,R.drawable.title_ok, getString(R.string.savetitle));
		mTitleBar.setId(FILTER_ACTIVITY_ID);
		//mTitleBar.setBackgroundColor(Color.argb(128, 208,120,144));
		param.addRule(RelativeLayout.ALIGN_PARENT_TOP);
		main.addView(mTitleBar,param);
		
		mCancelBtn = (ImageView)mTitleBar.findViewById(mTitleBar.getBackBtnId());
		mOkBtn = (ImageView)mTitleBar.findViewById(mTitleBar.getOkBtnId());
		mSaveTxt = new TextView(this);
		mSaveTxt.setText(R.string.savetxt);
		mSaveTxt.setTextSize(ScaleUtils.getTextSize(20));
		mSaveTxt.setTextColor(Color.WHITE);
		param = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
		param.addRule(RelativeLayout.CENTER_HORIZONTAL);
		param.addRule(RelativeLayout.BELOW, mTitleBar.getId());
		param.topMargin = ScaleUtils.scaleX(200);
		main.addView(mSaveTxt,param);
		
	}
	private void ResponseUI()
	{
		mCancelBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
				IntentToCameraView();
			}
		});
		mOkBtn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				finish();
				IntentToStartView();
			}
		});
	}
	private void IntentToStartView()
	{
		Intent intent = new Intent(SaveActivity.this,ModelActivity.class);
	 	startActivity(intent); 	
	}
	private void IntentToCameraView()
	{
		Intent intent = new Intent(SaveActivity.this,CameraActivity.class);
	 	startActivity(intent); 	
	}
}
