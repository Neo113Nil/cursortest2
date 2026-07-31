package com.five_corp.ad;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.preference.PreferenceManager;
import com.five_corp.ad.internal.v;
import com.five_corp.ad.internal.w;
import com.five_corp.ad.internal.y;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class k implements com.five_corp.ad.internal.hub.global.e {
    public final com.five_corp.ad.internal.hub.global.b a;
    public final com.five_corp.ad.internal.t b;
    public final com.five_corp.ad.internal.storage.d c;
    public final com.five_corp.ad.internal.cache.q d;
    public final com.five_corp.ad.internal.context.d e;
    public final com.five_corp.ad.internal.adselector.a f;
    public final com.five_corp.ad.internal.bgtask.b g;
    public final com.five_corp.ad.internal.bgtask.b h;
    public final com.five_corp.ad.internal.soundstate.e i;
    public final v j;
    public final com.five_corp.ad.internal.j k;
    public final y l;
    public final com.five_corp.ad.internal.time.a m;
    public final com.five_corp.ad.internal.system.l n;
    public final com.five_corp.ad.internal.system.b o;
    public final com.five_corp.ad.internal.http.auxcache.h p;
    public final com.five_corp.ad.internal.context.r q;
    public final com.five_corp.ad.internal.tracking_data.e r;
    public final com.five_corp.ad.internal.system.h s;

    public k(Context context, FiveAdConfig fiveAdConfig, a aVar) {
        StringBuilder sb;
        com.five_corp.ad.internal.time.a aVar2 = new com.five_corp.ad.internal.time.a();
        com.five_corp.ad.internal.http.connection.b bVar = new com.five_corp.ad.internal.http.connection.b();
        Context applicationContext = context.getApplicationContext();
        com.five_corp.ad.internal.hub.global.b bVar2 = new com.five_corp.ad.internal.hub.global.b();
        this.a = bVar2;
        com.five_corp.ad.internal.logger.a aVar3 = new com.five_corp.ad.internal.logger.a(bVar2);
        File filesDir = context.getApplicationContext().getFilesDir();
        String str = fiveAdConfig.appId;
        boolean z = fiveAdConfig.isTest;
        Pattern pattern = com.five_corp.ad.internal.storage.j.b;
        if (z) {
            Locale locale = Locale.US;
            sb = new StringBuilder("app-");
            sb.append(str);
            str = "-test";
        } else {
            Locale locale2 = Locale.US;
            sb = new StringBuilder("app-");
        }
        sb.append(str);
        com.five_corp.ad.internal.storage.e eVar = new com.five_corp.ad.internal.storage.e(filesDir, sb.toString(), aVar3);
        FiveAdConfig deepCopy = fiveAdConfig.deepCopy();
        w a = w.a(applicationContext);
        Random random = new Random();
        com.five_corp.ad.internal.system.c cVar = new com.five_corp.ad.internal.system.c();
        com.five_corp.ad.internal.soundstate.e eVar2 = new com.five_corp.ad.internal.soundstate.e(deepCopy.a, new com.five_corp.ad.internal.media_config.a(new ArrayList(), false, 300000L, false, false, new com.five_corp.ad.internal.media_config.b(), 6), bVar2);
        this.i = eVar2;
        y yVar = new y(applicationContext);
        this.l = yVar;
        com.five_corp.ad.internal.http.d dVar = new com.five_corp.ad.internal.http.d(bVar);
        this.m = aVar2;
        this.g = new com.five_corp.ad.internal.bgtask.b(bVar2, 1, aVar2, aVar3);
        com.five_corp.ad.internal.bgtask.b bVar3 = new com.five_corp.ad.internal.bgtask.b(bVar2, 3, aVar2, aVar3);
        this.h = bVar3;
        com.five_corp.ad.internal.storage.d dVar2 = new com.five_corp.ad.internal.storage.d(eVar, new com.five_corp.ad.internal.storage.j(random), cVar, aVar3);
        this.c = dVar2;
        com.five_corp.ad.internal.tracking_data.b bVar4 = new com.five_corp.ad.internal.tracking_data.b(applicationContext);
        com.five_corp.ad.internal.system.e eVar3 = new com.five_corp.ad.internal.system.e(applicationContext);
        this.r = new com.five_corp.ad.internal.tracking_data.e(applicationContext, bVar2);
        com.five_corp.ad.internal.t tVar = new com.five_corp.ad.internal.t(bVar2, a, deepCopy, aVar, yVar, aVar2, new com.five_corp.ad.internal.context.n(eVar3), bVar4);
        this.b = tVar;
        com.five_corp.ad.internal.http.auxcache.h hVar = new com.five_corp.ad.internal.http.auxcache.h(aVar3, dVar2, bVar);
        this.p = hVar;
        com.five_corp.ad.internal.cache.o oVar = new com.five_corp.ad.internal.cache.o(dVar2);
        this.d = new com.five_corp.ad.internal.cache.q(oVar, bVar2, aVar2);
        v vVar = new v(tVar, dVar, bVar3, bVar2);
        this.j = vVar;
        com.five_corp.ad.internal.context.d dVar3 = new com.five_corp.ad.internal.context.d(deepCopy, oVar, aVar2, eVar2, hVar);
        this.e = dVar3;
        this.k = new com.five_corp.ad.internal.j(dVar3, tVar, dVar, bVar2);
        com.five_corp.ad.internal.context.r rVar = new com.five_corp.ad.internal.context.r(aVar2, bVar4, bVar2);
        this.q = rVar;
        this.f = new com.five_corp.ad.internal.adselector.a(dVar3, vVar, rVar, aVar2, bVar2);
        this.n = new com.five_corp.ad.internal.system.l();
        com.five_corp.ad.internal.system.b bVar5 = new com.five_corp.ad.internal.system.b();
        new Handler(Looper.getMainLooper()).post(new com.five_corp.ad.internal.system.a(bVar5));
        this.o = bVar5;
        this.s = new com.five_corp.ad.internal.system.h(applicationContext, aVar3, bVar2);
        HandlerThread handlerThread = new HandlerThread("FetchAdIdHandlerThread");
        handlerThread.start();
        new Handler(handlerThread.getLooper());
    }

    public final com.five_corp.ad.internal.util.c a() {
        try {
            com.five_corp.ad.internal.soundstate.e eVar = this.i;
            eVar.b.c.add(eVar);
            com.five_corp.ad.internal.bgtask.b bVar = this.g;
            bVar.a.h.add(bVar);
            com.five_corp.ad.internal.cache.q qVar = this.d;
            qVar.b.b.add(qVar);
            v vVar = this.j;
            vVar.d.c.add(vVar);
            vVar.d.d.add(vVar);
            vVar.d.f.add(vVar);
            com.five_corp.ad.internal.j jVar = this.k;
            jVar.d.a.add(jVar);
            jVar.d.g.add(jVar);
            com.five_corp.ad.internal.base_url.a aVar = this.b.a;
            aVar.e.c.add(aVar);
            com.five_corp.ad.internal.context.r rVar = this.q;
            rVar.c.c.add(rVar);
            rVar.c.f.add(rVar);
            com.five_corp.ad.internal.tracking_data.e eVar2 = this.r;
            PreferenceManager.getDefaultSharedPreferences(eVar2.b).registerOnSharedPreferenceChangeListener(eVar2);
            this.r.a();
            com.five_corp.ad.internal.util.c a = this.c.a();
            if (!a.a) {
                return a;
            }
            this.a.e.add(this);
            this.s.a();
            com.five_corp.ad.internal.util.b a2 = this.l.a();
            if (!a2.a) {
                return new com.five_corp.ad.internal.util.c(false, a2.b);
            }
            int intValue = ((Integer) a2.c).intValue();
            if (4300000 > intValue || intValue >= 4400000) {
                return new com.five_corp.ad.internal.util.c(true, null);
            }
            return new com.five_corp.ad.internal.util.c(false, new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.H, "Google Play Services version " + intValue + " has a bug.", null));
        } catch (Throwable th) {
            return new com.five_corp.ad.internal.util.c(false, new com.five_corp.ad.internal.l(com.five_corp.ad.internal.m.i, null, th));
        }
    }
}
