package G;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f426a;

    /* renamed from: b, reason: collision with root package name */
    public b f427b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f428c;

    public final void a(b bVar) {
        synchronized (this) {
            while (this.f428c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f427b == bVar) {
                return;
            }
            this.f427b = bVar;
            if (this.f426a) {
                bVar.k();
            }
        }
    }
}
