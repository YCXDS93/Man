package com.hc.manbuy.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.hc.manbuy.R;
import com.hc.manbuy.bean.ClassBeanFirst;
import com.hc.manbuy.utils.OnItemonclicklinearLeft;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * 类用途 :分类左边RecyclerView的Adapter
 * 作者 : 于帅光
 * 时间 : 2017/9/5 9:54
 */
public class ClassFirstRecylerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private List<ClassBeanFirst.DatasBean.ClassListBean>list=new ArrayList<>();
    private Context context;
    private OnItemonclicklinearLeft onItemonclicklinear;
    private ImageLoader imageloader;
    private DisplayImageOptions options;

    public void setOnItemonclicklinear(OnItemonclicklinearLeft onItemonclicklinear) {
        this.onItemonclicklinear = onItemonclicklinear;

    }
    public ClassFirstRecylerAdapter(List<ClassBeanFirst.DatasBean.ClassListBean> list, Context context) {
        this.list = list;
        this.context = context;
    }
    //加载布局
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=null;
        RecyclerView.ViewHolder viewHolder=null;
        view= LayoutInflater.from(context).inflate(R.layout.first_recylerview,parent,false);
        viewHolder=new MyViewHolder(view);

        return viewHolder;
    }
    //赋值
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        ClassBeanFirst.DatasBean.ClassListBean bean=list.get(position);
        final MyViewHolder myViewHolder= (MyViewHolder) holder;
        myViewHolder.gc_name.setText( bean.getGc_name());
        Log.i("===", "77777ata: " + bean.getGc_name());
        RequestOptions options=new RequestOptions().placeholder(R.drawable.ic_normal_class_press)
                .error(R.drawable.ic_normal_class_press);
        Glide.with(context).load(bean.getImage())
                .apply(options)
       .into(myViewHolder.classfy_image);
//        Picasso.with(context).load(bean.getImage()).into(myViewHolder.classfy_image);


        Log.i("===", "999999getData: " +bean.getImage());
        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemonclicklinear.onClickListenerLeft(myViewHolder.itemView,position);
            }
        });


    }

    @Override
    public int getItemCount() {
        return list!=null?list.size():0;
    }
    static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView classfy_image;
        TextView gc_name;
        public MyViewHolder(View itemView) {
            super(itemView);
            classfy_image=(ImageView) itemView.findViewById(R.id.recyler_image);
            gc_name=(TextView) itemView.findViewById(R.id.gc_name);
        }
    }
}
