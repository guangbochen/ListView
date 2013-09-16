package com.example.test4_1;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.example.test4_1.adapters.CustomBaseAdapter;
import com.example.test4_1.model.RowItem;

public class MainActivity extends Activity implements OnItemClickListener {
	private static final String[] titles = new String [] { "Banana" , "Apple",
		"Orange", "Four Season","Banana" , "Apple", "Orange", "Four Season" };
	
	private static final String[] descriptions = new String [] {
		"yum yum, best fruit in the summer.",
		"golden fruit with the symbol of wisdom.",
		"ok, your are staring like the sun, my dear yum oran~bo.",
		"I don't know who you are, but you are amazing!",
		"yum yum, best fruit in the summer.",
		"golden fruit with the symbol of wisdom.",
		"ok, your are staring like the sun, my dear yum oran~bo.",
		"I don't know who you are, but you are amazing!" 
		};
	
	private static final Integer[] images = {R.drawable.banana, R.drawable.apple, R.drawable.orange, R.drawable.mixed,
		R.drawable.banana, R.drawable.apple, R.drawable.orange, R.drawable.mixed};
	
	private ListView listView;
	private List<RowItem> rowItems;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		rowItems = new ArrayList<RowItem>();
		for(int i=0; i < titles.length; i++)
		{
			RowItem item = new RowItem(images[i], titles[i], descriptions[i]);
			rowItems.add(item);
		}
		listView = (ListView) findViewById(R.id.list);
		CustomBaseAdapter adapter = new CustomBaseAdapter(this,rowItems);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Intent intent = new Intent(MainActivity.this,ListItemDetailsActivity.class);
		intent.putExtra("POSITION", position);
		startActivity(intent);
		Toast toast = Toast.makeText(MainActivity.this, titles[position] + " is selected", Toast.LENGTH_SHORT);
		toast.setGravity(Gravity.CENTER |Gravity.CENTER_HORIZONTAL, 0, 0);
		toast.show();
	}

}
