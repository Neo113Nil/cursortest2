package M0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f847a;

    public h(float f2) {
        this.f847a = f2;
    }

    @Override // M0.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f847a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f847a == ((h) obj).f847a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f847a)});
    }
}
