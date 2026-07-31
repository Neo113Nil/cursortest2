package yads;

import android.net.Uri;

/* loaded from: classes13.dex */
public final class zx2 extends ns2 {
    public final /* synthetic */ fr i;
    public final /* synthetic */ v30 j;
    public final /* synthetic */ dy2 k;

    public zx2(dy2 dy2Var, fr frVar, v30 v30Var) {
        this.k = dy2Var;
        this.i = frVar;
        this.j = v30Var;
    }

    @Override // yads.ns2
    public final Object b() {
        g30 g30Var;
        fr frVar = this.i;
        g30Var = this.k.b;
        v30 v30Var = this.j;
        c43 c43Var = new c43(frVar);
        wf1.a.getAndIncrement();
        c43Var.b = 0L;
        s30 s30Var = new s30(c43Var, v30Var);
        try {
            s30Var.a.a(s30Var.b);
            s30Var.d = true;
            Uri uri = frVar.i;
            uri.getClass();
            Object a = g30Var.a(uri, s30Var);
            sb3.a(s30Var);
            return (e30) a;
        } catch (Throwable th) {
            sb3.a(s30Var);
            throw th;
        }
    }
}
