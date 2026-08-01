package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.fortuneodd.shadegrid.R;

/* renamed from: l.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0201H extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0202I f2889a;

    public C0201H(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        S0.a(this, getContext());
        C0202I c0202i = new C0202I(this);
        this.f2889a = c0202i;
        c0202i.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0202I c0202i = this.f2889a;
        Drawable drawable = c0202i.f2891f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0201H c0201h = c0202i.f2890e;
        if (drawable.setState(c0201h.getDrawableState())) {
            c0201h.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2889a.f2891f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2889a.g(canvas);
    }
}
