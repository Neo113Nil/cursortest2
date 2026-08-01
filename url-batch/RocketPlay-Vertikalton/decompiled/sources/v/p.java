package v;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class p extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4400a;

    public p(Context context) {
        super(context);
        this.f4400a = true;
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
        this.f4400a = z2;
    }

    public void setGuidelineBegin(int i) {
        e eVar = (e) getLayoutParams();
        if (this.f4400a && eVar.f4249a == i) {
            return;
        }
        eVar.f4249a = i;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i) {
        e eVar = (e) getLayoutParams();
        if (this.f4400a && eVar.f4251b == i) {
            return;
        }
        eVar.f4251b = i;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f2) {
        e eVar = (e) getLayoutParams();
        if (this.f4400a && eVar.f4253c == f2) {
            return;
        }
        eVar.f4253c = f2;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
