package c;

import java.util.concurrent.Executors;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0020a extends a.a {

    /* renamed from: f, reason: collision with root package name */
    public static volatile C0020a f460f;

    /* renamed from: e, reason: collision with root package name */
    public final Object f461e;

    public C0020a(int i2) {
        switch (i2) {
            case 1:
                this.f461e = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0021b());
                break;
            default:
                this.f461e = new C0020a(1);
                break;
        }
    }
}
