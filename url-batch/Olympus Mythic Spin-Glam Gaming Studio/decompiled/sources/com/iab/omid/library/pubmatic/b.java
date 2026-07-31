package com.iab.omid.library.pubmatic;

import android.content.Context;
import android.webkit.WebSettings;
import com.iab.omid.library.pubmatic.internal.i;
import com.iab.omid.library.pubmatic.internal.k;
import com.iab.omid.library.pubmatic.utils.d;
import com.iab.omid.library.pubmatic.utils.e;
import com.iab.omid.library.pubmatic.utils.g;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class b {
    private boolean a;

    class a implements Runnable {
        final /* synthetic */ Context a;

        a(b bVar, Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                WebSettings.getDefaultUserAgent(this.a);
            } catch (Throwable unused) {
                d.a("Ignoring failure while retrieving default WebView user agent");
            }
        }
    }

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    private void c(Context context) {
        Executors.newSingleThreadExecutor().execute(new a(this, context));
    }

    String a() {
        return "1.6.3-Pubmatic";
    }

    void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        i.c().a(context);
        com.iab.omid.library.pubmatic.internal.b.g().a(context);
        com.iab.omid.library.pubmatic.utils.a.a(context);
        com.iab.omid.library.pubmatic.utils.c.a(context);
        e.a(context);
        com.iab.omid.library.pubmatic.internal.g.b().a(context);
        com.iab.omid.library.pubmatic.internal.a.a().a(context);
        k.b().a(context);
        c(context);
    }

    void a(boolean z) {
        this.a = z;
    }

    boolean b() {
        return this.a;
    }

    void c() {
        g.a();
        com.iab.omid.library.pubmatic.internal.a.a().d();
    }
}
