package o;

import android.content.Context;

/* renamed from: o.q3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1737q3 implements InterfaceC0219Ii {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C1737q3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // o.InterfaceC0219Ii
    public final void a() {
        switch (this.a) {
            case 0:
                ((Context) this.b).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C1802r3) this.c);
                break;
            case 1:
                ((Context) this.b).getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks2C1868s3) this.c);
                break;
            default:
                C0177Gs c0177Gs = (C0177Gs) this.b;
                c0177Gs.a.m((C0099Ds) this.c);
                break;
        }
    }
}
