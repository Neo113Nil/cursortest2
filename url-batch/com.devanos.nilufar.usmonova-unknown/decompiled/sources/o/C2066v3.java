package o;

/* renamed from: o.v3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2066v3 extends AbstractC2367ze {
    public ViewOnAttachStateChangeListenerC2132w3 h;
    public I8 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ ViewOnAttachStateChangeListenerC2132w3 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2066v3(ViewOnAttachStateChangeListenerC2132w3 viewOnAttachStateChangeListenerC2132w3, AbstractC2367ze abstractC2367ze) {
        super(abstractC2367ze);
        this.k = viewOnAttachStateChangeListenerC2132w3;
    }

    @Override // o.Y7
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
