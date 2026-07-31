package yads;

import android.R;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes3.dex */
public abstract class n8 {
    public static final ColorDrawable a = new ColorDrawable(Color.parseColor("#80ffffff"));
    public static final LayerDrawable b;

    static {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{0, 0});
        gradientDrawable.setCornerRadius(0.0f);
        int i = m8.b;
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{i, i});
        gradientDrawable2.setCornerRadius(0.0f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ClipDrawable(gradientDrawable2, 3, 1)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        b = layerDrawable;
    }
}
