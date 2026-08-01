package m;

import a1.AbstractC0067d;
import e0.d;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293a extends AbstractC0067d {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0293a f3549e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f3550f = new d(1);
    public final c d = new c();

    public static C0293a w() {
        if (f3549e != null) {
            return f3549e;
        }
        synchronized (C0293a.class) {
            try {
                if (f3549e == null) {
                    f3549e = new C0293a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3549e;
    }
}
