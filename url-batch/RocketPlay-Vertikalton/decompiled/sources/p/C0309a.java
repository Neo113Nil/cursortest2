package p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0309a f3721b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0309a f3722c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3723a;

    static {
        if (g.d) {
            f3722c = null;
            f3721b = null;
        } else {
            f3722c = new C0309a(false, null);
            f3721b = new C0309a(true, null);
        }
    }

    public C0309a(boolean z2, CancellationException cancellationException) {
        this.f3723a = cancellationException;
    }
}
