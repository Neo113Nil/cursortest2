package com.fyber.inneractive.sdk.config.cellular;

import android.content.Context;
import com.fyber.inneractive.sdk.util.a1;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class a implements h {
    public final d a;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public a1 b = a1.UNKNOWN;

    public a(Context context) {
        this.a = e.a(context);
    }

    @Override // com.fyber.inneractive.sdk.config.cellular.h
    public final void a(a1 a1Var) {
        this.b = a1Var;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar != null) {
                hVar.a(this.b);
            }
        }
    }
}
