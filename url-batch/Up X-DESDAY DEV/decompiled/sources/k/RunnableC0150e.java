package k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0150e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0151f f2625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0160o f2626b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuC0158m f2627c;
    public final /* synthetic */ B0.d d;

    public RunnableC0150e(B0.d dVar, C0151f c0151f, C0160o c0160o, MenuC0158m menuC0158m) {
        this.d = dVar;
        this.f2625a = c0151f;
        this.f2626b = c0160o;
        this.f2627c = menuC0158m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0151f c0151f = this.f2625a;
        if (c0151f != null) {
            B0.d dVar = this.d;
            ((ViewOnKeyListenerC0152g) dVar.f59b).f2652z = true;
            c0151f.f2629b.c(false);
            ((ViewOnKeyListenerC0152g) dVar.f59b).f2652z = false;
        }
        C0160o c0160o = this.f2626b;
        if (c0160o.isEnabled() && c0160o.hasSubMenu()) {
            this.f2627c.q(c0160o, null, 4);
        }
    }
}
