package com.google.android.material.datepicker;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import g.C0125e;
import j.AbstractC0175a;
import k.C0204o;
import l.Z0;

/* loaded from: classes.dex */
public final class j implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2261a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2262b;

    public /* synthetic */ j(int i, Object obj) {
        this.f2261a = i;
        this.f2262b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        switch (this.f2261a) {
            case 0:
                k kVar = (k) this.f2262b;
                int i = kVar.f2266X;
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
                C0125e c0125e = (C0125e) this.f2262b;
                Message obtain = (view != c0125e.f2651g || (message3 = c0125e.i) == null) ? (view != c0125e.f2652j || (message2 = c0125e.f2654l) == null) ? (view != c0125e.f2655m || (message = c0125e.f2657o) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (obtain != null) {
                    obtain.sendToTarget();
                }
                c0125e.f2644C.obtainMessage(1, c0125e.f2647b).sendToTarget();
                break;
            case 2:
                ((AbstractC0175a) this.f2262b).a();
                break;
            default:
                Z0 z02 = ((Toolbar) this.f2262b).f1753L;
                C0204o c0204o = z02 == null ? null : z02.f3393b;
                if (c0204o != null) {
                    c0204o.collapseActionView();
                    break;
                }
                break;
        }
    }
}
