package com.google.android.material.datepicker;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import g.C0134e;
import j.AbstractC0148a;
import k.C0170o;
import l.Y0;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1668b;

    public /* synthetic */ j(int i, Object obj) {
        this.f1667a = i;
        this.f1668b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1667a) {
            case 0:
                k kVar = (k) this.f1668b;
                int i = kVar.f1672X;
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
                C0134e c0134e = (C0134e) this.f1668b;
                Button button = c0134e.f2306f;
                c0134e.f2320v.obtainMessage(1, c0134e.f2303b).sendToTarget();
                break;
            case 2:
                ((AbstractC0148a) this.f1668b).a();
                break;
            default:
                Y0 y02 = ((Toolbar) this.f1668b).f1219L;
                C0170o c0170o = y02 == null ? null : y02.f2948b;
                if (c0170o != null) {
                    c0170o.collapseActionView();
                    break;
                }
                break;
        }
    }
}
