package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.devanos.nilufar.usmonova.R;

/* renamed from: o.w5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2134w5 extends RatingBar {
    public final C2002u5 h;

    public C2134w5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        CV.a(this, getContext());
        C2002u5 c2002u5 = new C2002u5(this);
        this.h = c2002u5;
        c2002u5.T(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.h.j;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
