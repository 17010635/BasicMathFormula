package sg.edu.rp.c346.basicmathformula;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<MathFormula> mathFormulaList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MathFormula> objects){
        super(context, resource,objects);
        parent_context = context;
        layout_id = resource;
        mathFormulaList = objects;

    }
    @NonNull
    @Override
    public View getView (int position, @Nullable View convertView, @NonNull ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView;
        if (convertView == null) {
            rowView = inflater.inflate(layout_id, parent, false);
            TextView tvName = rowView.findViewById(R.id.tvName);
            TextView tvTitle = rowView.findViewById(R.id.tvFormula);
            TextView tvType = rowView.findViewById(R.id.tvType);
            MathFormula currentItem = mathFormulaList.get(position);
            tvName.setText(currentItem.getFormulaName());
            tvTitle.setText(currentItem.getFormula());
            tvType.setText(currentItem.getFormulaType());
        } else {
            rowView = convertView;
        }
        return rowView;
    }
}
