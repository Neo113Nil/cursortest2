package yads;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.TextView;

/* loaded from: classes4.dex */
public final class xk implements yd {
    @Override // yads.yd
    public final void a(TextView textView) {
        Drawable background = textView.getBackground();
        if (background instanceof TransitionDrawable) {
            ((TransitionDrawable) background).startTransition(500);
        }
    }

    @Override // yads.yd
    public final void cancel() {
    }
}
