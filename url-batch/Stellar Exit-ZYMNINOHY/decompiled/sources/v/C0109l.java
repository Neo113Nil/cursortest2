package v;

import android.graphics.Rect;
import l.q;
import s.C0094b;

/* renamed from: v.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0109l {

    /* renamed from: a, reason: collision with root package name */
    public final C0094b f1291a;

    /* renamed from: b, reason: collision with root package name */
    public final q f1292b;

    public C0109l(C0094b c0094b, q qVar) {
        e0.h.e(qVar, "_windowInsetsCompat");
        this.f1291a = c0094b;
        this.f1292b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C0109l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        e0.h.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        C0109l c0109l = (C0109l) obj;
        return e0.h.a(this.f1291a, c0109l.f1291a) && e0.h.a(this.f1292b, c0109l.f1292b);
    }

    public final int hashCode() {
        return this.f1292b.hashCode() + (this.f1291a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics( bounds=" + this.f1291a + ", windowInsetsCompat=" + this.f1292b + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0109l(Rect rect, q qVar) {
        this(new C0094b(rect), qVar);
        e0.h.e(qVar, "insets");
    }
}
