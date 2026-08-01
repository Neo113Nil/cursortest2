package M0;

import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f810a;

    /* renamed from: b, reason: collision with root package name */
    public final float f811b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f810a;
            f2 += ((b) cVar).f811b;
        }
        this.f810a = cVar;
        this.f811b = f2;
    }

    @Override // M0.c
    public final float a(RectF rectF) {
        return Math.max(RecyclerView.f1949A0, this.f810a.a(rectF) + this.f811b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f810a.equals(bVar.f810a) && this.f811b == bVar.f811b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f810a, Float.valueOf(this.f811b)});
    }
}
