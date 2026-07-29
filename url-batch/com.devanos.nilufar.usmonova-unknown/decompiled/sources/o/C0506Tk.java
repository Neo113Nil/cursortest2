package o;

import android.content.Context;

/* renamed from: o.Tk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0506Tk implements InterfaceC2374zl {
    public final /* synthetic */ int h;
    public final InterfaceC1557nL i;

    public /* synthetic */ C0506Tk(InterfaceC1557nL interfaceC1557nL, int i) {
        this.h = i;
        this.i = interfaceC1557nL;
    }

    @Override // o.InterfaceC1557nL
    public final Object get() {
        switch (this.h) {
            case 0:
                String packageName = ((Context) this.i.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new C0970eQ(Integer.valueOf(C0970eQ.k).intValue(), (Context) this.i.get(), "com.google.android.datatransport.events");
        }
    }
}
