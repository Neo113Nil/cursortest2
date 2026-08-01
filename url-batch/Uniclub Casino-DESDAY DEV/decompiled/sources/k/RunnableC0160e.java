package k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0160e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0161f f2650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0170o f2651b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuC0168m f2652c;
    public final /* synthetic */ C.g d;

    public RunnableC0160e(C.g gVar, C0161f c0161f, C0170o c0170o, MenuC0168m menuC0168m) {
        this.d = gVar;
        this.f2650a = c0161f;
        this.f2651b = c0170o;
        this.f2652c = menuC0168m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0161f c0161f = this.f2650a;
        if (c0161f != null) {
            C.g gVar = this.d;
            ((ViewOnKeyListenerC0162g) gVar.f62b).f2677z = true;
            c0161f.f2654b.c(false);
            ((ViewOnKeyListenerC0162g) gVar.f62b).f2677z = false;
        }
        C0170o c0170o = this.f2651b;
        if (c0170o.isEnabled() && c0170o.hasSubMenu()) {
            this.f2652c.q(c0170o, null, 4);
        }
    }
}
