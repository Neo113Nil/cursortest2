package yads;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes10.dex */
public final class t13 {
    public final w13 a = new w13();
    public final wk b = new wk();
    public final uo c = new uo();
    public v13 d;

    public final void a(ImageView imageView, q31 q31Var, Drawable drawable) {
        v13 v13Var = new v13(this.b, this.c, this.a, q31Var, drawable);
        this.d = v13Var;
        imageView.addOnLayoutChangeListener(v13Var);
        if (imageView.getLayoutParams().width == -1 || imageView.getLayoutParams().height == -1 || imageView.getLayoutParams().width == -2 || imageView.getLayoutParams().height == -2) {
            imageView.setImageDrawable(drawable);
        }
    }

    public final void a(ImageView imageView) {
        imageView.removeOnLayoutChangeListener(this.d);
    }
}
