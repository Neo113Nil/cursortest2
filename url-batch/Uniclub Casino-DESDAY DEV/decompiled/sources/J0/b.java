package J0;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f262a;

    /* renamed from: b, reason: collision with root package name */
    public final float f263b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f262a;
            f2 += ((b) cVar).f263b;
        }
        this.f262a = cVar;
        this.f263b = f2;
    }

    @Override // J0.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f262a.a(rectF) + this.f263b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f262a.equals(bVar.f262a) && this.f263b == bVar.f263b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f262a, Float.valueOf(this.f263b)});
    }
}
