package v;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class p extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4007a;

    public p(Context context) {
        super(context);
        this.f4007a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z2) {
        this.f4007a = z2;
    }

    public void setGuidelineBegin(int i) {
        C0324e c0324e = (C0324e) getLayoutParams();
        if (this.f4007a && c0324e.f3856a == i) {
            return;
        }
        c0324e.f3856a = i;
        setLayoutParams(c0324e);
    }

    public void setGuidelineEnd(int i) {
        C0324e c0324e = (C0324e) getLayoutParams();
        if (this.f4007a && c0324e.f3858b == i) {
            return;
        }
        c0324e.f3858b = i;
        setLayoutParams(c0324e);
    }

    public void setGuidelinePercent(float f2) {
        C0324e c0324e = (C0324e) getLayoutParams();
        if (this.f4007a && c0324e.f3860c == f2) {
            return;
        }
        c0324e.f3860c = f2;
        setLayoutParams(c0324e);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
