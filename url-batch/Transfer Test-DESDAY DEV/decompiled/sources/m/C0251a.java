package m;

import e0.d;
import h0.f;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0251a extends f {
    public static volatile C0251a h;
    public static final d i = new d(1);

    /* renamed from: g, reason: collision with root package name */
    public final c f3121g = new c();

    public static C0251a s() {
        if (h != null) {
            return h;
        }
        synchronized (C0251a.class) {
            try {
                if (h == null) {
                    h = new C0251a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h;
    }
}
