package com.hc.manbuy.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.GridView;
import android.widget.TextView;

import com.hc.manbuy.R;
import com.hc.manbuy.bean.Bean;

import java.util.List;
import java.util.Map;

/**
 * Created by YU on 2017/9/7.
 */

public class ExpandedAdapter extends BaseExpandableListAdapter {
    private Context context;
    private List<Bean> class_Title;
    private Map<String, List<Bean>> map;
    private List<Bean> bean;

    public ExpandedAdapter(Context context, List<Bean> class_Title, Map<String, List<Bean>> map, List<Bean> bean) {
        this.context = context;
        this.class_Title = class_Title;
        this.map = map;
        this.bean = bean;
    }

    @Override
    public int getGroupCount() {
        return class_Title.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return 1;
    }

    @Override
    public Object getGroup(int i) {
        return null;
    }

    @Override
    public Object getChild(int i, int i1) {
        return null;
    }

    @Override
    public long getGroupId(int i) {
        return 0;
    }

    @Override
    public long getChildId(int i, int i1) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.expandable_item, null);
        TextView textView = view.findViewById(R.id.expan_name);
        textView.setText(class_Title.get(i).name);

        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.classfy_gridview, null);
        GridView gridView = view.findViewById(R.id.class_gridview);
        bean = map.get(class_Title.get(i).name);

        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return false;
    }
}
