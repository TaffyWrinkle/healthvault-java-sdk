package com.microsoft.hsg.android.hvsample;

import com.microsoft.hsg.android.simplexml.client.HealthVaultClient;
import com.microsoft.hsg.android.simplexml.things.types.base.VocabFamily;
import com.microsoft.hsg.android.simplexml.things.types.base.VocabName;
import com.microsoft.hsg.android.simplexml.vocabs.types.VocabIdentifier;

import android.app.Activity;
import android.os.Bundle;
import android.provider.VoicemailContract;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class VocabActivity extends Activity {

	private HealthVaultClient mClient;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_vocab);

		mClient = new HealthVaultClient();
		
		init();
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		mClient.start();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		init();
	}

	@Override
	protected void onStop() {
		mClient.stop();
		super.onStop();
	}

	private void init() {
		// Get a reference to the AutoCompleteTextView in the layout
		AutoCompleteTextView autoCompView = (AutoCompleteTextView) findViewById(R.id.autocomplete_textView1);
		autoCompView.setAdapter(
				new VocabAutoCompleteAdapter(this, 
						R.layout.list_item, 
						new VocabIdentifier(VocabFamily.USDA, VocabName.FoodDescription),
						mClient));
		autoCompView.setThreshold(3);
	}
}
