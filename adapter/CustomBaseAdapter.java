package com.example.test4_1.adapters;

import java.util.List;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.test4_1.R;
import com.example.test4_1.model.RowItem;

public class CustomBaseAdapter extends BaseAdapter {

	Context context;
	List<RowItem> rowItems;
	
	public CustomBaseAdapter(Context context, List<RowItem> rowItems) {
		this.context = context;
		this.rowItems = rowItems;
	}
	
	private class ViewHolder {
		ImageView imageView;
		TextView txtTitle;
		TextView txtDesc;
	}

	@Override
	public View getView(int position, View view, ViewGroup parent) {
		ViewHolder holder = null;
		LayoutInflater mInflater = (LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
		if(view == null)
		{
			view = mInflater.inflate(R.layout.list_item, null);
			holder  = new ViewHolder();
			holder.txtTitle = (TextView) view.findViewById(R.id.title);
			holder.txtDesc = (TextView) view.findViewById(R.id.desc);
			holder.imageView = (ImageView) view.findViewById(R.id.icon);
			view.setTag(holder);
		}
		else
		{
			holder = (ViewHolder) view.getTag();
		}
		
		RowItem rowItem = (RowItem) getItem(position);
		holder.txtDesc.setText(rowItem.getDesc());
		holder.txtTitle.setText(rowItem.getTitle());
		holder.imageView.setImageResource(rowItem.getImageId());
		
		return view;
	}
	
	@Override
	public int getCount() {
		return rowItems.size();
	}

	@Override
	public Object getItem(int position) {
		return rowItems.get(position);
	}

	@Override
	public long getItemId(int position) {
		return rowItems.indexOf(getItem(position));
	}


}
