package o;

/* renamed from: o.iO, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1232iO extends Y7 {
    public AbstractC1232iO(InterfaceC2235xe interfaceC2235xe) {
        super(interfaceC2235xe);
        if (interfaceC2235xe != null && interfaceC2235xe.getContext() != C1188hk.h) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // o.InterfaceC2235xe
    public final InterfaceC0189He getContext() {
        return C1188hk.h;
    }
}
