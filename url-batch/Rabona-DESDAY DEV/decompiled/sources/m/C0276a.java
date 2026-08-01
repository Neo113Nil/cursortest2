package m;

import i1.q;
import java.util.concurrent.Executors;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0276a extends q {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0276a f3190c;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3191b;

    public C0276a(int i) {
        switch (i) {
            case 1:
                this.f3191b = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f3191b = new C0276a(1);
                break;
        }
    }

    public static C0276a l() {
        if (f3190c != null) {
            return f3190c;
        }
        synchronized (C0276a.class) {
            try {
                if (f3190c == null) {
                    f3190c = new C0276a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3190c;
    }
}
