package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.punchtowin.balls.R;

/* renamed from: l.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0211H extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0212I f2880a;

    public C0211H(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        S0.a(this, getContext());
        C0212I c0212i = new C0212I(this);
        this.f2880a = c0212i;
        c0212i.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0212I c0212i = this.f2880a;
        Drawable drawable = c0212i.f2882f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0211H c0211h = c0212i.f2881e;
        if (drawable.setState(c0211h.getDrawableState())) {
            c0211h.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2880a.f2882f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2880a.g(canvas);
    }
}
