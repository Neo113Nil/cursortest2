package com.fyber.inneractive.sdk.flow.endcard;

import android.content.Context;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.x0;
import com.fyber.inneractive.sdk.flow.y0;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class k {
    public final y0 a;
    public final m b;
    public final boolean c;
    public final com.fyber.inneractive.sdk.flow.endcard.loaders.b d;
    public final h e;
    public final int f;
    public final AtomicBoolean g;
    public final Object h;

    public k(Context context, t0 t0Var, x0 x0Var) {
        y0 y0Var = new y0(context, t0Var);
        m mVar = new m();
        this.b = mVar;
        this.g = new AtomicBoolean(false);
        this.h = new Object();
        this.a = y0Var;
        this.c = !TextUtils.equals(y0Var.d.B, "1");
        h hVar = new h(x0Var);
        this.e = hVar;
        this.f = hVar.b;
        this.d = new com.fyber.inneractive.sdk.flow.endcard.loaders.b(y0Var, mVar);
    }

    public final b a() {
        synchronized (this.h) {
            try {
                if (!this.g.compareAndSet(false, true)) {
                    return this.b.a();
                }
                b b = b();
                this.e.a(this.b);
                return b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r0.c >= 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b b() {
        m mVar = this.b;
        int size = mVar.a.size();
        int i = mVar.c;
        while (true) {
            i++;
            if (i >= size) {
                break;
            }
            b bVar = (b) mVar.a.get(i);
            if (bVar.l()) {
                if (bVar.i() == com.fyber.inneractive.sdk.model.vast.i.Default_End_Card) {
                    int size2 = mVar.b.size() - 1;
                    while (true) {
                        if (size2 >= 0) {
                            if (((b) mVar.b.get(size2)) instanceof o) {
                                break;
                            }
                            size2--;
                        }
                    }
                } else if (bVar instanceof c) {
                    int i2 = i + 1;
                    for (int size3 = mVar.a.size() - 1; size3 >= i2; size3--) {
                        b bVar2 = (b) mVar.a.get(size3);
                        if (bVar2 instanceof c) {
                            bVar2.destroy();
                            mVar.a.remove(size3);
                        }
                    }
                }
                mVar.c = i;
                mVar.b.add(bVar);
                bVar.e = mVar.b.size();
                return bVar;
            }
        }
        return null;
    }
}
