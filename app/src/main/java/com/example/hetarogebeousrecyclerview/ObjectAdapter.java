package com.example.hetarogebeousrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ObjectAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private ArrayList<Object> objects;
    private final int carType=1;
    private final int movieType=2;

    public ObjectAdapter(Context context, ArrayList<Object> objects) {
        this.context = context;
        this.objects = objects;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        RecyclerView.ViewHolder viewHolder=null;
        switch (viewType){
            case carType:
                View v=inflater.inflate(R.layout.car_single_row,parent,false);
                viewHolder=new CarViewHolder(v);
                break;
            case movieType:
                View v1=inflater.inflate(R.layout.movie_single_row,parent,false);
                viewHolder=new MovieViewHolder(v1);
                break;
        }

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position){
        switch (holder.getItemViewType()){
            case carType:
                // carType bole holder k Type Cast kora hoice
                CarViewHolder cvh= (CarViewHolder) holder;

                Car car= (Car) objects.get(position);
                cvh.carImageView.setImageResource(car.getCarImage());
                cvh.carName.setText(car.getCarName());
                cvh.carCompany.setText(car.getCarCompany());
                break;
            case movieType:
                MovieViewHolder mvh= (MovieViewHolder) holder;
                Movie movie= (Movie) objects.get(position);
                mvh.movieName.setText(movie.getMovieName());
                mvh.movieCategory.setText(movie.getCategory());
                break;



        }


    }

    @Override
    public int getItemCount() {
        return objects.size();
    }

    public  class CarViewHolder extends RecyclerView.ViewHolder {
        ImageView carImageView;
        TextView carName;
        TextView carCompany;

        public CarViewHolder(@NonNull View itemView) {
            super(itemView);
            carImageView=itemView.findViewById(R.id.carImage);
            carName=itemView.findViewById(R.id.carName);
            carCompany=itemView.findViewById(R.id.carCompany);
        }

    }
    public  class MovieViewHolder extends RecyclerView.ViewHolder{
        TextView movieName;
        TextView movieCategory;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            movieName=itemView.findViewById(R.id.movieName);
            movieCategory=itemView.findViewById(R.id.movieCategory);
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (objects.get(position) instanceof Car){
            return carType;
        }
        else if (objects.get(position)instanceof Movie){
            return movieType;
        }
        return -1;
    }
}
