package com.averageloser.supermariomakerlevels.model;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.averageloser.supermariomakerlevels.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by tj on 10/9/2015.
 */
public class ResultsListFragmentAdapter extends ArrayAdapter<Level> {
    private List<Drawable> images;
    private List<Level> levels;

    public ResultsListFragmentAdapter(Context context, int resource, List<Level> levels) {
        super(context, resource, levels);

        this.levels = levels;

        images = getDrawables();
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public Level getItem(int position) {
        return super.getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());

        ViewHolder holder;

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.results_list_row, parent, false);

            holder = new ViewHolder();
            holder.iconImageView = (ImageView) convertView.findViewById(R.id.icon_image_view);
            holder.levelCodeTextView = (TextView) convertView.findViewById(R.id.level_code_text_view);
            holder.levelNameTextView = (TextView) convertView.findViewById(R.id.level_name_text_view);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Level level = getItem(position);

        Random r = new Random();

        int num = r.nextInt(images.size());

        holder.iconImageView.setImageDrawable(images.get(num));
        holder.levelNameTextView.setText(level.getName().toUpperCase());
        holder.levelCodeTextView.setText(level.getCode().toUpperCase());

        return convertView;
    }

    private static class ViewHolder {
        TextView levelNameTextView;
        TextView levelCodeTextView;
        ImageView iconImageView;
    }

    private List<Drawable> getDrawables() {
        Drawable mario = getContext().getResources().getDrawable(R.drawable.mario);
        Drawable goomba = getContext().getResources().getDrawable(R.drawable.goomba);
        Drawable luigi = getContext().getResources().getDrawable(R.drawable.luigi);
        Drawable peach  = getContext().getResources().getDrawable(R.drawable.peach);
        Drawable wario = getContext().getResources().getDrawable(R.drawable.wario);
        Drawable cloudGuy = getContext().getResources().getDrawable(R.drawable.cloudguy32x38);
        Drawable oneUp = getContext().getResources().getDrawable(R.drawable.oneup32x32);
        Drawable birdo = getContext().getResources().getDrawable(R.drawable.birdo);
        Drawable turtle = getContext().getResources().getDrawable(R.drawable.turtle);
        Drawable bulletbill = getContext().getResources().getDrawable(R.drawable.bulletbill);
        Drawable boo = getContext().getResources().getDrawable(R.drawable.boo);
        Drawable coin = getContext().getResources().getDrawable(R.drawable.coin);
        Drawable questionMark = getContext().getResources().getDrawable(R.drawable.question_mark32);
        Drawable yoshi = getContext().getResources().getDrawable(R.drawable.yoshi);
        Drawable bowser = getContext().getResources().getDrawable(R.drawable.bowser);
        Drawable waluigi = getContext().getResources().getDrawable(R.drawable.waluigi);




        List<Drawable> drawables = new ArrayList();
        drawables.add(mario);
        drawables.add(goomba);
        drawables.add(luigi);
        drawables.add(peach);
        drawables.add(wario);
        drawables.add(cloudGuy);
        drawables.add(oneUp);
        drawables.add(birdo);
        drawables.add(turtle);
        drawables.add(bulletbill);
        drawables.add(boo);
        drawables.add(coin);
        drawables.add(questionMark);
        drawables.add(yoshi);
        drawables.add(bowser);
        drawables.add(waluigi);

        return drawables;
    }
}
