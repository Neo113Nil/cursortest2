package k;

/* renamed from: k.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0156e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0157f f2715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0166o f2716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MenuC0164m f2717c;
    public final /* synthetic */ A0.h d;

    public RunnableC0156e(A0.h hVar, C0157f c0157f, C0166o c0166o, MenuC0164m menuC0164m) {
        this.d = hVar;
        this.f2715a = c0157f;
        this.f2716b = c0166o;
        this.f2717c = menuC0164m;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0157f c0157f = this.f2715a;
        if (c0157f != null) {
            A0.h hVar = this.d;
            ((ViewOnKeyListenerC0158g) hVar.f30b).f2742z = true;
            c0157f.f2719b.c(false);
            ((ViewOnKeyListenerC0158g) hVar.f30b).f2742z = false;
        }
        C0166o c0166o = this.f2716b;
        if (c0166o.isEnabled() && c0166o.hasSubMenu()) {
            this.f2717c.q(c0166o, null, 4);
        }
    }
}
