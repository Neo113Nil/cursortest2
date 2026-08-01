package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.luckycounter.drinkwater.R;

/* renamed from: l.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227G extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0228H f3296a;

    public C0227G(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        S0.a(this, getContext());
        C0228H c0228h = new C0228H(this);
        this.f3296a = c0228h;
        c0228h.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0228H c0228h = this.f3296a;
        Drawable drawable = c0228h.f3323f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0227G c0227g = c0228h.f3322e;
        if (drawable.setState(c0227g.getDrawableState())) {
            c0227g.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3296a.f3323f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f3296a.g(canvas);
    }
}
