package yads;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes14.dex */
public final class u10 {
    public final View a;
    public final RectF b;
    public final Path c;
    public final float[] d;

    public u10(View view, float f, float f2, float f3, float f4) {
        RectF rectF = new RectF();
        Path path = new Path();
        this.a = view;
        this.b = rectF;
        this.c = path;
        this.d = (f > 0.0f || f2 > 0.0f || f3 > 0.0f || f4 > 0.0f) ? new float[]{f, f, f2, f2, f3, f3, f4, f4} : null;
    }

    public final void a() {
        if (this.d != null) {
            int measuredWidth = this.a.getMeasuredWidth();
            int measuredHeight = this.a.getMeasuredHeight();
            int paddingLeft = this.a.getPaddingLeft();
            int paddingTop = this.a.getPaddingTop();
            int paddingRight = measuredWidth - this.a.getPaddingRight();
            int paddingBottom = measuredHeight - this.a.getPaddingBottom();
            if (paddingLeft >= paddingRight || paddingTop >= paddingBottom) {
                return;
            }
            this.b.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
            this.c.reset();
            this.c.addRoundRect(this.b, this.d, Path.Direction.CW);
        }
    }
}
