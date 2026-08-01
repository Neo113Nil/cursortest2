package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ic;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public class Guideline extends View {
    public boolean f;

    public Guideline(Context context) {
        super(context);
        this.f = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f = z;
    }

    public void setGuidelineBegin(int i) {
        ic icVar = (ic) getLayoutParams();
        if (this.f && icVar.a == i) {
            return;
        }
        icVar.a = i;
        setLayoutParams(icVar);
    }

    public void setGuidelineEnd(int i) {
        ic icVar = (ic) getLayoutParams();
        if (this.f && icVar.b == i) {
            return;
        }
        icVar.b = i;
        setLayoutParams(icVar);
    }

    public void setGuidelinePercent(float f) {
        ic icVar = (ic) getLayoutParams();
        if (this.f && icVar.c == f) {
            return;
        }
        icVar.c = f;
        setLayoutParams(icVar);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
