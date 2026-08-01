package O0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f513a;

    public a(float f2) {
        this.f513a = f2;
    }

    @Override // O0.c
    public final float a(RectF rectF) {
        return this.f513a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f513a == ((a) obj).f513a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f513a)});
    }
}
