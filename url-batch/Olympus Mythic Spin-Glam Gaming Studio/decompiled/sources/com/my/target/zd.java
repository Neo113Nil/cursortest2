package com.my.target;

import android.view.View;
import com.my.target.wh;
import java.util.HashMap;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public final class zd {
    private final th a;

    public zd(th thVar) {
        this.a = thVar;
    }

    public void a(ae aeVar) {
        if (aeVar.f() == null) {
            mi.a("NativeViewElementsTracker: can't tracking show elements, context is null ");
            return;
        }
        int i = (a(aeVar.q()) ? 1 : 0) + (a(aeVar.h()) ? 2 : 0) + (a(aeVar.d()) ? 4 : 0) + (a(aeVar.p()) ? 8 : 0) + (a(aeVar.r()) ? 16 : 0) + (a(aeVar.j()) ? 32 : 0) + (a(aeVar.k()) ? 64 : 0) + (a(aeVar.l()) ? 128 : 0) + (a(aeVar.g()) ? 256 : 0) + (a(aeVar.c()) ? 512 : 0) + (a(aeVar.i()) ? 1024 : 0) + (a(aeVar.b()) ? 2048 : 0);
        mi.a("NativeViewElementsTracker: visibleElementsBite is " + i);
        HashMap hashMap = new HashMap();
        hashMap.put("args", Integer.toString(i));
        wh.a(this.a.b("showElement"), hashMap, 1, (wh.c) null);
    }

    private boolean a(View view) {
        return view != null && view.getVisibility() == 0;
    }
}
