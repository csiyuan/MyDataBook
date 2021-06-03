package sg.edu.rpc346.id19016011.mydatabook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<String> {
    private Context context;
    private ArrayList<String> drawerlist;
    int resource;
    private TextView name;
    private ImageView iv;


    public CustomAdapter(Context context, int resource, ArrayList<String> drawerlist) {
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

        String drawer = drawerlist.get(position);

        name.setText(drawer);

        iv = rowView.findViewById(R.id.iv);
        if(position == 0){
            iv.setImageResource(android.R.drawable.ic_dialog_info);
        }else if(position == 1){
            iv.setImageResource(android.R.drawable.ic_menu_edit);
        }else if(position == 2){
            iv.setImageResource(android.R.drawable.ic_menu_my_calendar);
        }else if(position == 3){
            iv.setImageResource(android.R.drawable.btn_star_big_on);
        }
//            if(drawer.getName().equals("Bio")){
//                iv.setImageResource(android.R.drawable.ic_dialog_info);
//            }else if(drawer.getName().equals("Vaccination")){
//                iv.setImageResource(android.R.drawable.ic_menu_edit);
//            }else if(drawer.getName().equals("Anniversary")){
//                iv.setImageResource(android.R.drawable.ic_menu_my_calendar);
//            }else if(drawer.getName().equals("About Us")){
//                iv.setImageResource(android.R.drawable.btn_star_big_on);
//            }
        return rowView;
    }
}
