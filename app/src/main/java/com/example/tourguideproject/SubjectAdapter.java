package com.example.tourguideproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

/**
 * {@link SubjectAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Subject} objects.
 */
public class SubjectAdapter extends ArrayAdapter<Subject> {

    /**
     * Create a new {@link SubjectAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param object  is the list of {@link Subject}s to be displayed.
     */
    public SubjectAdapter(Context context, ArrayList<Subject> object) {
        super(context, 0, object);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the Subject object located at this position in the list
        Subject currentSub = (Subject) getItem(position);

        // Find the TextView in the list_item.xml and set subject name
        TextView itemTextView = convertView.findViewById(R.id.item_text);
        itemTextView.setText(currentSub.getSetName());

        // Find the ImageView in the list_item.xml and display subject photo
        ImageView itemImageView = convertView.findViewById(R.id.image);
        itemImageView.setImageResource(currentSub.getImageResourceId());

        return convertView;
    }
}