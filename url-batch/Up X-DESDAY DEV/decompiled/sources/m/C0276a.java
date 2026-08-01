package m;

import i1.p;
import java.util.concurrent.Executors;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0276a extends p {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0276a f3168c;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3169b;

    public C0276a(int i) {
        switch (i) {
            case 1:
                this.f3169b = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f3169b = new C0276a(1);
                break;
        }
    }

    public static C0276a l() {
        if (f3168c != null) {
            return f3168c;
        }
        synchronized (C0276a.class) {
            try {
                if (f3168c == null) {
                    f3168c = new C0276a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3168c;
    }
}
