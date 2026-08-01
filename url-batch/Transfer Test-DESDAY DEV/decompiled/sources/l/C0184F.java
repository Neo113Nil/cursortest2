package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.football.transfertrivia.R;

/* renamed from: l.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184F extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0185G f2890a;

    public C0184F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        Q0.a(this, getContext());
        C0185G c0185g = new C0185G(this);
        this.f2890a = c0185g;
        c0185g.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0185G c0185g = this.f2890a;
        Drawable drawable = c0185g.f2892f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0184F c0184f = c0185g.f2891e;
        if (drawable.setState(c0184f.getDrawableState())) {
            c0184f.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2890a.f2892f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2890a.g(canvas);
    }
}
