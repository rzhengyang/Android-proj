package com.example.billyjni;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;  
import android.widget.EditText;  
import android.widget.Button;  

public class MainActivity extends Activity {

	static{  
		System.loadLibrary("JNITest");  
		}  
		private native String GetReply();  
		private EditText edtName;  
		private Button btnShow;  
		String reply;  
		/**Called when the activity is first created. */  
		@Override  
		public void onCreate(Bundle savedInstanceState) {  
				super.onCreate(savedInstanceState);  
				setContentView(R.layout.activity_main);  
				reply= GetReply();  
				edtName= (EditText)this.findViewById(R.id.ed_name);  
				btnShow= (Button)this.findViewById(R.id.button1);  
				btnShow.setOnClickListener(new Button.OnClickListener() {  
				public void onClick(View arg0) {  
					edtName.setText(reply);  
					}  
			});   
		}  
}
