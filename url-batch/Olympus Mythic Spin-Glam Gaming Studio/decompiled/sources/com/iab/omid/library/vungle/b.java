package com.iab.omid.library.vungle;

import android.content.Context;
import android.webkit.WebSettings;
import com.iab.omid.library.vungle.internal.i;
import com.iab.omid.library.vungle.internal.k;
import com.iab.omid.library.vungle.utils.e;
import com.iab.omid.library.vungle.utils.g;
import java.util.concurrent.Executors;

/* loaded from: classes14.dex */
public class b {
    private boolean a;

    public class a implements Runnable {
        public final /* synthetic */ Context a;

        public a(b bVar, Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WebSettings.getDefaultUserAgent(this.a);
            } catch (Throwable unused) {
                com.iab.omid.library.vungle.utils.d.a("Ignoring failure while retrieving default WebView user agent");
            }
        }
    }

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    private void c(Context context) {
        Executors.newSingleThreadExecutor().execute(new a(this, context));
    }

    public String a() {
        return "1.6.2-Vungle";
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.vungle.internal.b.g().a(context);
        com.iab.omid.library.vungle.utils.a.a(context);
        com.iab.omid.library.vungle.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.vungle.internal.g.b().a(context);
        com.iab.omid.library.vungle.internal.a.a().a(context);
        k.b().a(context);
        c(context);
    }

    public void a(boolean z) {
        this.a = z;
    }

    public boolean b() {
        return this.a;
    }

    public void c() {
        g.a();
        com.iab.omid.library.vungle.internal.a.a().d();
    }
}
