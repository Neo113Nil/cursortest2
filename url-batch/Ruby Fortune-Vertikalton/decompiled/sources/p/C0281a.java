package p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0281a f3379b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0281a f3380c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3381a;

    static {
        if (g.d) {
            f3380c = null;
            f3379b = null;
        } else {
            f3380c = new C0281a(false, null);
            f3379b = new C0281a(true, null);
        }
    }

    public C0281a(boolean z2, CancellationException cancellationException) {
        this.f3381a = cancellationException;
    }
}
