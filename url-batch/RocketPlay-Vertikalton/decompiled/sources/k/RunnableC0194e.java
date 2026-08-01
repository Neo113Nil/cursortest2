package k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0194e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0195f f3146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0204o f3147b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuC0202m f3148c;
    public final /* synthetic */ A1.d d;

    public RunnableC0194e(A1.d dVar, C0195f c0195f, C0204o c0204o, MenuC0202m menuC0202m) {
        this.d = dVar;
        this.f3146a = c0195f;
        this.f3147b = c0204o;
        this.f3148c = menuC0202m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0195f c0195f = this.f3146a;
        if (c0195f != null) {
            A1.d dVar = this.d;
            ((ViewOnKeyListenerC0196g) dVar.f38b).f3173z = true;
            c0195f.f3150b.c(false);
            ((ViewOnKeyListenerC0196g) dVar.f38b).f3173z = false;
        }
        C0204o c0204o = this.f3147b;
        if (c0204o.isEnabled() && c0204o.hasSubMenu()) {
            this.f3148c.q(c0204o, null, 4);
        }
    }
}
