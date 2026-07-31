package com.fyber.inneractive.sdk.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* loaded from: classes3.dex */
public abstract class a {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;

    public static void a(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }
}
