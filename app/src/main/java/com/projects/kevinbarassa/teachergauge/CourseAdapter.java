package com.projects.kevinbarassa.teachergauge;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Kevin Barassa on 27-Jan-17.
 */

public class CourseAdapter  extends RecyclerView.Adapter<CourseAdapter.CourseViewHolders> {

    private List<Course> items;
    private Context context;

    public CourseAdapter(Context context, List<Course> items) {
        this.items = items;
        this.context = context;
    }

    @Override
    public CourseViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_item, null);
        CourseViewHolders rcv = new CourseViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(CourseViewHolders holder, int position) {
        //Initiate the dishes items
        final Course courseItem = items.get(position);

        holder.courseName.setText(courseItem.getCourse_name());

        //Add click listener to Dishes items
//        holder.courseLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context, "You clicked: "+ courseItem.getCourse_name(), Toast.LENGTH_LONG).show();
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class CourseViewHolders extends RecyclerView.ViewHolder{

        public TextView courseName;
       // public RelativeLayout courseLayout;

        public CourseViewHolders(View itemView) {
            super(itemView);

            courseName = (TextView)itemView.findViewById(R.id.course_name);
            //courseLayout = (RelativeLayout) itemView.findViewById(R.id.courseLayout);

        }

    }
}