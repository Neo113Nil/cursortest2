package com.iab.omid.library.mobilefuse;

import android.content.Context;
import com.iab.omid.library.mobilefuse.internal.i;
import com.iab.omid.library.mobilefuse.internal.j;
import com.iab.omid.library.mobilefuse.utils.e;
import com.iab.omid.library.mobilefuse.utils.g;

/* loaded from: classes4.dex */
public class b {
    private boolean a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    String a() {
        return "1.5.7-Mobilefuse";
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.mobilefuse.internal.b.g().a(context);
        com.iab.omid.library.mobilefuse.utils.a.a(context);
        com.iab.omid.library.mobilefuse.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.mobilefuse.internal.g.b().a(context);
        com.iab.omid.library.mobilefuse.internal.a.a().a(context);
        j.b().a(context);
    }

    void a(boolean z) {
        this.a = z;
    }

    boolean b() {
        return this.a;
    }

    void c() {
        g.a();
        com.iab.omid.library.mobilefuse.internal.a.a().d();
    }
}
