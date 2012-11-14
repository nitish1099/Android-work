package com.example.iospasscodelock;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Password extends Activity
{
TextView view;	
Boolean Login =true;	
int flag=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	setContentView(R.layout.password);
	
   // Button b = (Button)findViewById(R.id.button10);
    final EditText editText1 = (EditText)findViewById(R.id.editText1);
    final EditText editText2 = (EditText)findViewById(R.id.editText2);
    final EditText editText3 = (EditText)findViewById(R.id.editText3);
    final EditText editText4 = (EditText)findViewById(R.id.editText4);
    editText1.setInputType(InputType.TYPE_CLASS_TEXT);
    Button b0 = (Button) findViewById(R.id.button0) ;
    Button b1 = (Button) findViewById(R.id.button1) ;
    Button b2 = (Button) findViewById(R.id.button2) ;
    Button b3 = (Button) findViewById(R.id.button3) ;
    Button b4 = (Button) findViewById(R.id.button4) ;
    Button b5 = (Button) findViewById(R.id.button5) ;
    Button b6 = (Button) findViewById(R.id.button6) ;
    Button b7 = (Button) findViewById(R.id.button7) ;
    Button b8 = (Button) findViewById(R.id.button8) ;
    Button b9 = (Button) findViewById(R.id.button9) ;
    Button backspace = (Button) findViewById(R.id.backspace) ;
    Button undo= (Button) findViewById(R.id.undo) ;
    final TextView view = (TextView)findViewById(R.id.textView1);
   
editText1.addTextChangedListener(new TextWatcher() 
{
	
	@Override
	public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		if (arg0.length()==1)
		{
			
			
			    		
			editText2.requestFocus();
		}
	}
	
	@Override
	public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
			int arg3) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void afterTextChanged(Editable arg0) {
		// TODO Auto-generated method stub
		
	}
});
editText2.addTextChangedListener(new TextWatcher() {
	
	@Override
	public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		if (arg0.length()==1)
		{
			editText3.requestFocus();
		}
	}
	
	@Override
	public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
			int arg3) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void afterTextChanged(Editable arg0) {
		// TODO Auto-generated method stub
		
	}
});
editText3.addTextChangedListener(new TextWatcher() {
	
	@Override
	public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		if (arg0.length()==1)
		{
			editText4.requestFocus();
		}
	}
	
	@Override
	public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
			int arg3) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void afterTextChanged(Editable arg0) {
		// TODO Auto-generated method stub
		
	}
});

	//b.setOnClickListener(new OnClickListener() {
		//@Override
		//public void onClick(View v) {
			// TODO Auto-generated method stub
		//Intent 	i =  new Intent("com.thenewboston.hello.HOME");
		//startActivity(i);
	//	}
	//});
b0.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(flag==0)
			{editText1.setText("0");
			flag++;}
			
			  
		else if(flag==1)
			{editText2.setText("0");
			flag++;
			}
		else if (flag==2)
			{editText3.setText("0");
			flag++;
			}
		else
			{editText4.setText("0");
			flag++;
			if(editText1.getText().toString().equals("1")&&editText2.getText().toString().equals("2")&&editText3.getText().toString().equals("3")&&editText4.getText().toString().equals("4"))
			{
			Intent 	j =  new Intent("com.example.iospasscodelock.Hello");
			startActivity(j);
			}
			else
			{ 
			view.setText("Wrong Password");
			view.setTextColor(Color.WHITE);
			view.setBackgroundColor(Color.RED);
			view.setTextSize(30);
			

				editText1.setText("");
				editText2.setText("");
				editText3.setText("");
				editText4.setText("");
				flag=0;
				editText1.requestFocus();
			}
			}}
	
});
	b1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(flag==0)
				{editText1.setText("1");
				flag++;
				}
			else if(flag==1)
				{editText2.setText("1");
				flag++;
				}
			else if (flag==2)
				{editText3.setText("1");
				flag++;
				}
			else
				{editText4.setText("1");
				flag++;
				
				if(editText1.getText().toString().equals("1")&&editText2.getText().toString().equals("2")&&editText3.getText().toString().equals("3")&&editText4.getText().toString().equals("4"))
				{
				Intent 	j =  new Intent("com.example.iospasscodelock.Hello");
				startActivity(j);
				}
				else
				{
					view.setText("Wrong Password");
					view.setTextColor(Color.WHITE);
					view.setBackgroundColor(Color.RED);
					view.setTextSize(30);
					editText1.setText("");
					editText2.setText("");
					editText3.setText("");
					editText4.setText("");
					flag=0;
					editText1.requestFocus();
				}
				}
				}
		
	});
b2.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(flag==0)
				{editText1.setText("2");
				flag++;
				}
			else if(flag==1)
				{editText2.setText("2");
				flag++;
				}
			else if (flag==2)
				{editText3.setText("2");
				flag++;
				}
			else
				{editText4.setText("2");
				flag++;
				
				if(editText1.getText().toString().equals("1")&&editText2.getText().toString().equals("2")&&editText3.getText().toString().equals("3")&&editText4.getText().toString().equals("4"))
				{
				Intent 	j =  new Intent("com.example.iospasscodelock.Hello");
				startActivity(j);
				}
				else
				{view.setText("Wrong Password");
				view.setTextColor(Color.WHITE);
				view.setBackgroundColor(Color.RED);
				view.setTextSize(30);
					editText1.setText("");
					editText2.setText("");
					editText3.setText("");
					editText4.setText("");
					flag=0;
					editText1.requestFocus();
				}
				}}
		
	});
b3.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(flag==0)
			{editText1.setText("3");
			flag++;
			}
		else if(flag==1)
			{editText2.setText("3");
			flag++;
			}
		else if (flag==2)
			{editText3.setText("3");
			flag++;
			}
		else
			{editText4.setText("3");
			flag++;
			
			if(editText1.getText().toString().equals("1")&&editText2.getText().toString().equals("2")&&editText3.getText().toString().equals("3")&&editText4.getText().toString().equals("4"))
			{
			Intent 	j =  new Intent("com.example.iospasscodelock.Hello");
			startActivity(j);
			}
			else
			{view.setText("Wrong Password");
			view.setTextColor(Color.WHITE);
			view.setBackgroundColor(Color.RED);
			view.setTextSize(30);
				editText1.setText("");
				editText2.setText("");
				editText3.setText("");
				editText4.setText("");
				flag=0;
				editText1.requestFocus();
			}
			}}
	
});
b4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(flag==0)
			{editText1.setText("4");
			flag++;
			}
		else if(flag==1)
			{editText2.setText("4");
			flag++;
			}
		else if (flag==2)
			{editText3.setText("4");
			flag++;
			}
		else if(flag==3)
			{
			editText4.setText("4");
			flag++;
			if(editText1.getText().toString().equals("1")&&editText2.getText().toString().equals("2")&&editText3.getText().toString().equals("3")&&editText4.getText().toString().equals("4"))
			{
			Intent 	j =  new Intent("com.example.iospasscodelock.Hello");
			startActivity(j);
			}
			else
			{view.setText("Wrong Password");
			view.setTextColor(Color.WHITE);
			view.setBackgroundColor(Color.RED);
			view.setTextSize(30);
				editText1.setText("");
				editText2.setText("");
				editText3.setText("");
				editText4.setText("");
				flag=0;
				editText1.requestFocus();
			}
			}
	}
});
b5.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(flag==0)
			{editText1.setText("5");
			flag++;
			if(!editText1.getText().toString().equals("1"))
			{
			Login=false;
			}}
		else if(flag==1)
			{editText2.setText("5");
			flag++;
			if(!editText2.getText().toString().equals("2"))
			{
			Login=false;
			}}
		else if (flag==2)
			{editText3.setText("5");
			flag++;
			if(!editText3.getText().toString().equals("3"))
			{
			Login=false;
			}}
		else
			{editText4.setText("5");
			flag++;
			
			if(editText1.getText().toString().equals("1")&&editText2.getText().toString().equals("2")&&editText3.getText().toString().equals("3")&&editText4.getText().toString().equals("4"))
			{
			Intent 	j =  new Intent("com.example.iospasscodelock.Hello");
			startActivity(j);
			}
			else
			{ view.setText("Wrong Password");
			view.setTextColor(Color.WHITE);
			view.setBackgroundColor(Color.RED);
			view.setTextSize(30);
				editText1.setText("");
				editText2.setText("");
				editText3.setText("");
				editText4.setText("");
				flag=0;
				editText1.requestFocus();
			}
			}
	}
});
b6.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(flag==0)
			{editText1.setText("6");
			flag++;
			}
		else if(flag==1)
			{editText2.setText("6");
			flag++;
			}
		else if (flag==2)
			{editText3.setText("6");
			flag++;
			}
		else
			{editText4.setText("6");
			flag++;
			
			if(editText1.getText().toString().equals("1")&&editText2.getText().toString().equals("2")&&editText3.getText().toString().equals("3")&&editText4.getText().toString().equals("4"))
			{
			Intent 	j =  new Intent("com.example.iospasscodelock.Hello");
			startActivity(j);
			}
			else
			{ view.setText("Wrong Password");
			view.setTextColor(Color.WHITE);
			view.setBackgroundColor(Color.RED);
			view.setTextSize(30);
				editText1.setText("");
				editText2.setText("");
				editText3.setText("");
				editText4.setText("");
				flag=0;
				editText1.requestFocus();
			}
			}
	}
});
b7.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(flag==0)
			{editText1.setText("7");
			flag++;
			}
		else if(flag==1)
			{editText2.setText("7");
			flag++;
			}
		else if (flag==2)
			{editText3.setText("7");
			flag++;
			}
		else
			{editText4.setText("7");
			flag++;
			
			if(editText1.getText().toString().equals("1")&&editText2.getText().toString().equals("2")&&editText3.getText().toString().equals("3")&&editText4.getText().toString().equals("4"))
			{
			Intent 	j =  new Intent("com.example.iospasscodelock.Hello");
			startActivity(j);
			}
			else
			{   view.setText("Wrong Password");
			view.setTextColor(Color.WHITE);
			view.setBackgroundColor(Color.RED);
			view.setTextSize(30);
				editText1.setText("");
				editText2.setText("");
				editText3.setText("");
				editText4.setText("");
				flag=0;
				editText1.requestFocus();
				
			}
			}}
	
});
b8.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(flag==0)
			{editText1.setText("8");
			flag++;
			}
		else if(flag==1)
			{editText2.setText("8");
			flag++;
			}
		else if (flag==2)
			{editText3.setText("8");
			flag++;
			}
		else
			{editText4.setText("8");
			flag++;
			if(editText1.getText().toString().equals("1")&&editText2.getText().toString().equals("2")&&editText3.getText().toString().equals("3")&&editText4.getText().toString().equals("4"))
				{
				Intent 	j =  new Intent("com.example.iospasscodelock.Hello");
				startActivity(j);
				}
				else
				{    view.setText("Wrong Password");
				view.setTextColor(Color.WHITE);
				view.setBackgroundColor(Color.RED);
				view.setTextSize(30);
					editText1.setText("");
					editText2.setText("");
					editText3.setText("");
					
					editText4.setText("");
					flag=0;
					editText1.requestFocus();
				}
				}
	}
});
b9.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(flag==0)
			{editText1.setText("9");
			flag++;
			}
		else if(flag==1)
			{editText2.setText("9");
			flag++;
			}
		else if (flag==2)
			{editText3.setText("9");
			flag++;
			}
		else
			{editText4.setText("9");
			flag++;
			
			if(editText1.getText().toString().equals("1")&&editText2.getText().toString().equals("2")&&editText3.getText().toString().equals("3")&&editText4.getText().toString().equals("4"))
			{
			Intent 	j =  new Intent("com.example.iospasscodelock.Hello");
			startActivity(j);
			}
			else
			{   view.setText("Wrong Password");
			view.setTextColor(Color.WHITE);
			view.setBackgroundColor(Color.RED);
			view.setTextSize(30);
				editText1.setText("");
				editText2.setText("");
				editText3.setText("");
				editText4.setText("");
				flag=0;
				editText1.requestFocus();
			}
			}}
	
});
 undo.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		editText1.setText("");
		editText2.setText("");
		editText3.setText("");
		editText4.setText("");
		flag=0;
		editText1.requestFocus();
		
		
	}
});
	backspace.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if(flag==1)
			{
				editText1.setText("");
				editText1.requestFocus();
				flag=0;
			
			}
			if(flag==2)
			{
				editText2.setText("");
				editText2.requestFocus();
				flag=1;
			
			}
			if(flag==3)
			{
				editText3.setText("");
				editText3.requestFocus();
				flag=2;
			
			}
			
			
		
		}
	} );
	}
	
	
	

}
