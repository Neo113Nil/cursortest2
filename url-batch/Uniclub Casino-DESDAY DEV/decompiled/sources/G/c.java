package G;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f172a;

    /* renamed from: b, reason: collision with root package name */
    public b f173b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f174c;

    public final void a(b bVar) {
        synchronized (this) {
            while (this.f174c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f173b == bVar) {
                return;
            }
            this.f173b = bVar;
            if (this.f172a) {
                bVar.k();
            }
        }
    }
}
