package sg.edu.rpc346.id19016011.mydatabook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter {
    private Context context;
    private ArrayList<Drawer> drawerlist;
    int resource;
    private TextView name;
    private ImageView iv;

    public CustomAdapter(Context context, int resource, ArrayList<Drawer> drawerlist) {
        super(context, resource, drawerlist);
        this.drawerlist = drawerlist;
        this.context = context;
        this.resource= resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);
        name = (TextView) rowView.findViewById(R.id.tvName);
        expiry = (TextView) rowView.findViewById(R.id.tvExpiryRow);
        Drawer inventory = inventorys.get(position);
        name.setText(inventory.getName());
        expiry.setText(inventory.getExpiry());

        return rowView;
    }
}