package O0;

import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f514a;

    /* renamed from: b, reason: collision with root package name */
    public final float f515b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f514a;
            f2 += ((b) cVar).f515b;
        }
        this.f514a = cVar;
        this.f515b = f2;
    }

    @Override // O0.c
    public final float a(RectF rectF) {
        return Math.max(RecyclerView.f1570A0, this.f514a.a(rectF) + this.f515b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f514a.equals(bVar.f514a) && this.f515b == bVar.f515b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f514a, Float.valueOf(this.f515b)});
    }
}
