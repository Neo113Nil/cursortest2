package k0;

import android.content.Context;
import androidx.lifecycle.K;
import j0.InterfaceC0178a;
import j0.InterfaceC0179b;

/* loaded from: classes.dex */
public final class h implements InterfaceC0179b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3272a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3273b;

    /* renamed from: c, reason: collision with root package name */
    public final B.d f3274c;
    public final V0.g d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3275e;

    public h(Context context, String str, B.d dVar) {
        i1.f.e(dVar, "callback");
        this.f3272a = context;
        this.f3273b = str;
        this.f3274c = dVar;
        this.d = new V0.g(new K(2, this));
    }

    public final InterfaceC0178a a() {
        return ((g) this.d.a()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d.f1247b != V0.h.f1249a) {
            ((g) this.d.a()).close();
        }
    }
}
