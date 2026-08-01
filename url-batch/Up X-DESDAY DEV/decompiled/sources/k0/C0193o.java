package k0;

import java.util.ArrayList;

/* renamed from: k0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0193o extends AbstractC0192n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o.b f2806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC0194p f2807b;

    public C0193o(ViewTreeObserverOnPreDrawListenerC0194p viewTreeObserverOnPreDrawListenerC0194p, o.b bVar) {
        this.f2807b = viewTreeObserverOnPreDrawListenerC0194p;
        this.f2806a = bVar;
    }

    @Override // k0.InterfaceC0189k
    public final void b(AbstractC0191m abstractC0191m) {
        ((ArrayList) this.f2806a.getOrDefault(this.f2807b.f2809b, null)).remove(abstractC0191m);
        abstractC0191m.x(this);
    }
}
