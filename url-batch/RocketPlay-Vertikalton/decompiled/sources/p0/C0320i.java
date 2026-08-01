package p0;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* renamed from: p0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0320i extends AbstractC0323l {
    public B.d d;

    /* renamed from: e, reason: collision with root package name */
    public float f3754e;

    /* renamed from: f, reason: collision with root package name */
    public B.d f3755f;

    /* renamed from: g, reason: collision with root package name */
    public float f3756g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3757j;

    /* renamed from: k, reason: collision with root package name */
    public float f3758k;

    /* renamed from: l, reason: collision with root package name */
    public Paint.Cap f3759l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Join f3760m;

    /* renamed from: n, reason: collision with root package name */
    public float f3761n;

    @Override // p0.AbstractC0322k
    public final boolean a() {
        return this.f3755f.d() || this.d.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // p0.AbstractC0322k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int[] iArr) {
        boolean z2;
        B.d dVar;
        B.d dVar2 = this.f3755f;
        boolean z3 = false;
        if (dVar2.d()) {
            ColorStateList colorStateList = (ColorStateList) dVar2.d;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != dVar2.f60b) {
                dVar2.f60b = colorForState;
                z2 = true;
                dVar = this.d;
                if (dVar.d()) {
                    ColorStateList colorStateList2 = (ColorStateList) dVar.d;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != dVar.f60b) {
                        dVar.f60b = colorForState2;
                        z3 = true;
                    }
                }
                return z2 | z3;
            }
        }
        z2 = false;
        dVar = this.d;
        if (dVar.d()) {
        }
        return z2 | z3;
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f3755f.f60b;
    }

    public float getStrokeAlpha() {
        return this.f3756g;
    }

    public int getStrokeColor() {
        return this.d.f60b;
    }

    public float getStrokeWidth() {
        return this.f3754e;
    }

    public float getTrimPathEnd() {
        return this.f3757j;
    }

    public float getTrimPathOffset() {
        return this.f3758k;
    }

    public float getTrimPathStart() {
        return this.i;
    }

    public void setFillAlpha(float f2) {
        this.h = f2;
    }

    public void setFillColor(int i) {
        this.f3755f.f60b = i;
    }

    public void setStrokeAlpha(float f2) {
        this.f3756g = f2;
    }

    public void setStrokeColor(int i) {
        this.d.f60b = i;
    }

    public void setStrokeWidth(float f2) {
        this.f3754e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f3757j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f3758k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.i = f2;
    }
}
