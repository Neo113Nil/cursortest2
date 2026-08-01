package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.ratebook.luckyconvert.R;

/* renamed from: l.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0212H extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0213I f2864a;

    public C0212H(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        S0.a(this, getContext());
        C0213I c0213i = new C0213I(this);
        this.f2864a = c0213i;
        c0213i.b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0213I c0213i = this.f2864a;
        Drawable drawable = c0213i.f2866f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C0212H c0212h = c0213i.f2865e;
        if (drawable.setState(c0212h.getDrawableState())) {
            c0212h.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2864a.f2866f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2864a.g(canvas);
    }
}
