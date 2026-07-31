package com.smaato.sdk.ng.vpaid.utils;

import android.graphics.Bitmap;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.io.File;

/* loaded from: classes14.dex */
public class ImageUtils {

    class a implements ViewTreeObserver.OnPreDrawListener {
        final /* synthetic */ ImageView a;
        final /* synthetic */ BitmapDecoder b;
        final /* synthetic */ String c;

        a(ImageView imageView, BitmapDecoder bitmapDecoder, String str) {
            this.a = imageView;
            this.b = bitmapDecoder;
            this.c = str;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            int measuredHeight = this.a.getMeasuredHeight();
            Bitmap decodeFile = this.b.decodeFile(new File(this.c), this.a.getMeasuredWidth(), measuredHeight);
            if (decodeFile == null) {
                return true;
            }
            this.a.setImageBitmap(decodeFile);
            return true;
        }
    }

    public static void setScaledImage(ImageView imageView, String str) {
        setScaledImage(imageView, str, new AndroidBitmapDecoder());
    }

    public static void setScaledImage(ImageView imageView, String str, BitmapDecoder bitmapDecoder) {
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new a(imageView, bitmapDecoder, str));
        }
    }
}
