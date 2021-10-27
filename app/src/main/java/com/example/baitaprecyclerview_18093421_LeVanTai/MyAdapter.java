package com.example.baitaprecyclerview_18093421_LeVanTai;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolderView> {
//    String s1[],s2[];
//    int images[];
    List<BookName> nameArray;
    Context context;
    public MyAdapter(Context context, List<BookName> nameArray)
    {
        this.context=context;
        this.nameArray = nameArray;
    }
    @NonNull
    @Override
    public MyHolderView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent,false);
        return new MyHolderView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolderView holder, int position) {
//        String a=s1[position];
//        holder.txtTitle.setText(a);
//        holder.txtDescription.setText(s2[position]);
//        holder.imageView.setImageResource(images[position]);
//        holder.txtTitle.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(context, NewMainActivity.class);
//                intent.putExtra("name" , a);
//                context.startActivity(intent);
//            }
//        });
        String title = nameArray.get(position).getTitle();
        String content = nameArray.get(position).getContent();
        int image = nameArray.get(position).getImage();
        holder.txtTitle.setText(title);
        holder.txtDescription.setText(content);
        holder.imageView.setImageResource(image);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(context,NewMainActivity.class);
                intent.putExtra("name", title);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return nameArray.size();
    }

    public class MyHolderView extends  RecyclerView.ViewHolder{
    TextView txtTitle,txtDescription;
    ImageView imageView;
    CardView cardView;
        public MyHolderView(@NonNull View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtDescription =itemView.findViewById(R.id.txtDescription);
            imageView = itemView.findViewById(R.id.imageView);
            cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
