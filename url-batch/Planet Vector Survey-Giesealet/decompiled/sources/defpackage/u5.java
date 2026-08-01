package defpackage;

import android.view.ViewConfiguration;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class u5 implements e01 {
    public final ViewConfiguration a;

    public u5(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.e01
    public final float a() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.e01
    public final float b() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.e01
    public final long c() {
        return (Float.floatToRawIntBits(48.0f) << 32) | (Float.floatToRawIntBits(48.0f) & 4294967295L);
    }
}
