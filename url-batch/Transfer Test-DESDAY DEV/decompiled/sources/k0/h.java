package k0;

import android.content.Context;
import androidx.lifecycle.K;

/* loaded from: classes.dex */
public final class h implements j0.b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2841a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2842b;

    /* renamed from: c, reason: collision with root package name */
    public final B.d f2843c;
    public final U0.g d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2844e;

    public h(Context context, String str, B.d dVar) {
        g1.f.e(dVar, "callback");
        this.f2841a = context;
        this.f2842b = str;
        this.f2843c = dVar;
        this.d = new U0.g(new K(2, this));
    }

    public final j0.a a() {
        return ((g) this.d.a()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d.f867b != U0.h.f869a) {
            ((g) this.d.a()).close();
        }
    }
}
