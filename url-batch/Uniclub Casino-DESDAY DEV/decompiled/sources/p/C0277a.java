package p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0277a f3360b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0277a f3361c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3362a;

    static {
        if (g.d) {
            f3361c = null;
            f3360b = null;
        } else {
            f3361c = new C0277a(false, null);
            f3360b = new C0277a(true, null);
        }
    }

    public C0277a(boolean z2, CancellationException cancellationException) {
        this.f3362a = cancellationException;
    }
}
