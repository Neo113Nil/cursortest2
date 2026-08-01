package com.google.android.material.datepicker;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import g.C0122e;
import j.AbstractC0138a;
import k.C0160o;
import l.Y0;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1659b;

    public /* synthetic */ j(int i, Object obj) {
        this.f1658a = i;
        this.f1659b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1658a) {
            case 0:
                k kVar = (k) this.f1659b;
                int i = kVar.f1663X;
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
                C0122e c0122e = (C0122e) this.f1659b;
                Button button = c0122e.f2300f;
                c0122e.f2314v.obtainMessage(1, c0122e.f2297b).sendToTarget();
                break;
            case 2:
                ((AbstractC0138a) this.f1659b).a();
                break;
            default:
                Y0 y02 = ((Toolbar) this.f1659b).f1217L;
                C0160o c0160o = y02 == null ? null : y02.f2923b;
                if (c0160o != null) {
                    c0160o.collapseActionView();
                    break;
                }
                break;
        }
    }
}
