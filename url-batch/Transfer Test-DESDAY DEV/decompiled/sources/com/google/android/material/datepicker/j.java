package com.google.android.material.datepicker;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import g.C0104e;
import j.AbstractC0144a;
import k.C0166o;
import l.X0;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1893a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1894b;

    public /* synthetic */ j(int i, Object obj) {
        this.f1893a = i;
        this.f1894b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1893a) {
            case 0:
                k kVar = (k) this.f1894b;
                int i = kVar.f1898X;
                if (i != 2) {
                    if (i == 1) {
                        kVar.H(2);
                        break;
                    }
                } else {
                    kVar.H(1);
                    break;
                }
                break;
            case 1:
                C0104e c0104e = (C0104e) this.f1894b;
                Button button = c0104e.f2219f;
                c0104e.f2233v.obtainMessage(1, c0104e.f2216b).sendToTarget();
                break;
            case 2:
                ((AbstractC0144a) this.f1894b).a();
                break;
            default:
                X0 x02 = ((Toolbar) this.f1894b).f1367L;
                C0166o c0166o = x02 == null ? null : x02.f2962b;
                if (c0166o != null) {
                    c0166o.collapseActionView();
                    break;
                }
                break;
        }
    }
}
