package net.ramonsilva.listascomviewholder;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ramonsilva on 13/03/16.
 */
public class ListaAdapter extends ArrayAdapter<String> {


    private String [] mData;
    private Context mContext;
    private int mLayoutResourceId;

    public ListaAdapter(Context context, int resource, String[] data) {
        super(context, resource, data);

        mContext = context;
        mData = data;
        mLayoutResourceId = resource;

    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public int getViewTypeCount() {
        return super.getViewTypeCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolderItem viewHolder;

        if(convertView == null){

            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(mLayoutResourceId, parent, false);

            viewHolder = new ViewHolderItem();
            viewHolder.textViewItem = (TextView) convertView.findViewById(R.id.textViewItem);

            convertView.setTag(viewHolder);

        }else{
            viewHolder = (ViewHolderItem) convertView.getTag();
        }

        String item = mData[position];

        if(item != null) {
            viewHolder.textViewItem.setText(item);
            convertView.setTag(viewHolder);
        }

        return convertView;
    }

    static class ViewHolderItem {
        TextView textViewItem;
        ImageView imageViewItem;
    }
}
