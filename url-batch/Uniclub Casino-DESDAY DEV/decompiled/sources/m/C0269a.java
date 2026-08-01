package m;

import i1.r;
import java.util.concurrent.Executors;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0269a extends r {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0269a f3193c;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3194b;

    public C0269a(int i) {
        switch (i) {
            case 1:
                this.f3194b = new Object();
                Executors.newFixedThreadPool(4, new b());
                break;
            default:
                this.f3194b = new C0269a(1);
                break;
        }
    }

    public static C0269a k() {
        if (f3193c != null) {
            return f3193c;
        }
        synchronized (C0269a.class) {
            try {
                if (f3193c == null) {
                    f3193c = new C0269a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3193c;
    }
}
