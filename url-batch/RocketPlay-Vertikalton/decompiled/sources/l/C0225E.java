package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.luckycounter.drinkwater.R;

/* renamed from: l.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225E extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    public final C0223C f3293a;

    public C0225E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        S0.a(this, getContext());
        C0223C c0223c = new C0223C(this);
        this.f3293a = c0223c;
        c0223c.b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f3293a.f3286c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
