package J0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f261a;

    public a(float f2) {
        this.f261a = f2;
    }

    @Override // J0.c
    public final float a(RectF rectF) {
        return this.f261a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f261a == ((a) obj).f261a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f261a)});
    }
}
