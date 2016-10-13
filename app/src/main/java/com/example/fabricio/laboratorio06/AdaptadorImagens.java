package com.example.fabricio.laboratorio06;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;

/**
 * Created by Fabrício on 12/10/2016.
 */
public class AdaptadorImagens extends BaseAdapter {

    int itensMinhaGaleria;
    Context contexto;

    private Integer[] minhasIdsImagem = {
            R.drawable.moto_01,
            R.drawable.moto_02,
            R.drawable.moto_03
    };

    public AdaptadorImagens(Context contextoParam){

        contexto contectoParam;
        TypedArray atributos = contexto.obtainStyledAttributes(R.styleable.MinhaGaleria);
        itensMinhaGaleria = atributos.getResourceId(R.styleable.MinhaGaleria_android_galleryItenBackground,0);
        atributos.recycle();
    }


    @Override
    public int getCount() {
        return minhasIdsImagem.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup ) {
        ImageView imagem = new ImageView(contexto);

        imagem.setImageResource(minhasIdsImagem[i]);
        imagem.setLayoutParams(new Gallery.LayoutParams(150,100));
        imagem.setScaleType(ImageView.ScaleType.FIT_XY);
        imagem.setBackgroundResource(itensMinhaGaleria);
        return imagem;
    }
}