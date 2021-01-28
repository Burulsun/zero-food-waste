//package com.example.newfyp.HelperClasses;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.constraintlayout.widget.ConstraintLayout;
//import androidx.recyclerview.widget.RecyclerView;
//import androidx.viewpager.widget.PagerAdapter;
//
//import com.example.newfyp.R;
//
//import java.util.regex.Pattern;
//
//public class SliderAdapter extends RecyclerView.Adapter {
//
//    Context context;
//    LayoutInflater layoutInflater;
//
//    public SliderAdapter(Context context) {
//        this.context = context;
//    }
//
//    int images[] ={
//
//        R.drawable.eating_guy,
//        R.drawable.percentage,
//        R.drawable.eco
//
//    };
//
//    int headings[] ={
//            R.string.first_slide_title,
//            R.string.second_slide_title,
//            R.string.third_slide_title
//    };
//
//    int desctriptions[] ={
//           R.string.first_slide_desc,
//           R.string.second_slide_desc,
//           R.string.third_slide_desc
//    };
//
//
//
//
////    @Override
////    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
////        return view ==(ConstraintLayout) object;
////    }
////
////    @NonNull
////    @Override
////
////    public Object instantiateItem(@NonNull ViewGroup container, int position) {
////
////        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
////        View view = layoutInflater.inflate(R.layout.slides_layout, container, false);
////
////        ImageView imageView =view.findViewById(R.id.slider_image);
////        TextView heading =view.findViewById(R.id.slider_image);
////        TextView desc= view.findViewById(R.id.slider_image);
////
////
////        imageView.setImageResource(images[position]);
////        heading.setText(headings[position]);
////        desc.setText(desctriptions[position]);
////
////
////        container.addView(view);
////
////        return view;
////    }
//
//
//
//
//    @Override
//    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//        container.removeView((ConstraintLayout)object);
//    }
//
//
//    @NonNull
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        return null;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return headings.length;
//    }
//}
//
//
