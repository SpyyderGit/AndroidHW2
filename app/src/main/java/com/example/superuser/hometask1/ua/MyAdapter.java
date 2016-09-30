package com.example.superuser.hometask1.ua;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.superuser.hometask1.R;
import com.example.superuser.hometask1.model.Person;

import java.util.ArrayList;

/**
 * Created by SuperUser on 17.09.2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.PersonViewHolder> {
    private Context mContext;
    private ArrayList mPersonData;

    public MyAdapter(Context mContext, ArrayList mPersonData) {
        this.mContext = mContext;
        this.mPersonData = mPersonData;
    }

    static class PersonViewHolder extends RecyclerView.ViewHolder {

        TextView mNameTV;


        public PersonViewHolder(View itemView) {
            super(itemView);

            this.mNameTV = (TextView) itemView.findViewById(R.id.txt_name_person);

        }
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        PersonViewHolder personViewHolder = new PersonViewHolder(view);
        return personViewHolder;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder holder, int position) {
        Person person = (Person) mPersonData.get(position);
        holder.mNameTV.setText(person.getmName());
    }

    @Override
    public int getItemCount() {
        return mPersonData.size();
    }
}
