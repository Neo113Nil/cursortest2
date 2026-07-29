package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.devanos.nilufar.usmonova.R;

/* renamed from: o.y5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2266y5 extends SeekBar {
    public final C2332z5 h;

    public C2266y5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        CV.a(this, getContext());
        C2332z5 c2332z5 = new C2332z5(this);
        this.h = c2332z5;
        c2332z5.T(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2332z5 c2332z5 = this.h;
        C2266y5 c2266y5 = c2332z5.l;
        Drawable drawable = c2332z5.m;
        if (drawable != null && drawable.isStateful() && drawable.setState(c2266y5.getDrawableState())) {
            c2266y5.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.h.m;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.h.i0(canvas);
    }
}
