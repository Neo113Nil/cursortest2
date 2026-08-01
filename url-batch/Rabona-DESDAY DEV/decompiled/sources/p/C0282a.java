package p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0282a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0282a f3385b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0282a f3386c;

    /* renamed from: a, reason: collision with root package name */
    public final CancellationException f3387a;

    static {
        if (g.d) {
            f3386c = null;
            f3385b = null;
        } else {
            f3386c = new C0282a(false, null);
            f3385b = new C0282a(true, null);
        }
    }

    public C0282a(boolean z2, CancellationException cancellationException) {
        this.f3387a = cancellationException;
    }
}
