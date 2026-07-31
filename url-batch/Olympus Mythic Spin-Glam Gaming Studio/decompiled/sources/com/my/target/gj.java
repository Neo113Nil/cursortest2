package com.my.target;

import com.my.target.gb;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public final class gj {
    private final List a;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements gb.a {
        final /* synthetic */ dj a;
        final /* synthetic */ CountDownLatch b;
        final /* synthetic */ cb c;
        final /* synthetic */ String d;

        a(dj djVar, CountDownLatch countDownLatch, cb cbVar, String str) {
            this.a = djVar;
            this.b = countDownLatch;
            this.c = cbVar;
            this.d = str;
        }

        @Override // com.my.target.gb.a
        public void a(String str) {
            this.a.a(str);
            this.b.countDown();
        }

        @Override // com.my.target.gb.a
        public void a() {
            this.a.a((Object) null);
            this.b.countDown();
            this.c.b.c(0, 4001, "videoUrl=" + this.d);
        }
    }

    private gj(List list) {
        this.a = list;
    }

    public static gj a(dj djVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new cb(djVar, w0.d));
        return a(arrayList);
    }

    public static gj a(List list) {
        return new gj(list);
    }

    public void a() {
        if (o0.a()) {
            mi.b("VideoLoaderUtils: Method load called from main thread");
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(this.a.size());
        for (cb cbVar : this.a) {
            dj djVar = (dj) cbVar.a;
            String url = djVar.getUrl();
            fj.a().c(url, new a(djVar, countDownLatch, cbVar, url));
        }
        try {
            countDownLatch.await();
            mi.a("VideoLoaderUtils: success media loading");
        } catch (InterruptedException unused) {
            mi.a("VideoLoaderUtils: awaiting media files load failed");
        }
    }
}
