package com.example.tsebalesotho;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptor extends RecyclerView.Adapter<Adaptor.ExampleViewHolder>{

    private ArrayList<Model> models;
    private static RecyclerViewClickListener listener;

    public Adaptor(ArrayList<Model> models, RecyclerViewClickListener listener) {
        this.models = models;
        Adaptor.listener = listener;
    }

    public static class  ExampleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public ImageView imageView;
        public TextView tTextView1;
        public TextView tTextView2;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            tTextView1 = itemView.findViewById(R.id.text_1);
            tTextView2 = itemView.findViewById(R.id.text_2);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            listener.onClick(v, getAbsoluteAdapterPosition());
        }
    }


    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new ExampleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        Model currentModel = models.get(position);

        holder.imageView.setImageResource(currentModel.getImage());
        holder.tTextView1.setText(currentModel.getTitle());
        holder.tTextView2.setText(currentModel.getDescription());
    }

    @Override
    public int getItemCount() { return models.size(); }

    public interface RecyclerViewClickListener{
        void onClick(View view, int position);
    }

}
