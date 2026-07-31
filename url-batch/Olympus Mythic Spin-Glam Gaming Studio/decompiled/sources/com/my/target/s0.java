package com.my.target;

import com.my.target.gb;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes15.dex */
public class s0 {
    private final List a;

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements gb.a {
        final /* synthetic */ q0 a;
        final /* synthetic */ CountDownLatch b;
        final /* synthetic */ cb c;
        final /* synthetic */ String d;

        a(q0 q0Var, CountDownLatch countDownLatch, cb cbVar, String str) {
            this.a = q0Var;
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
            this.c.b.c(0, 4001, "audioUrl=" + this.d);
        }
    }

    private s0(List list) {
        this.a = list;
    }

    public static s0 a(List list) {
        return new s0(list);
    }

    public void a() {
        if (o0.a()) {
            mi.b("AudioLoaderUtils: Method load called from main thread");
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(this.a.size());
        for (cb cbVar : this.a) {
            q0 q0Var = (q0) cbVar.a;
            String url = q0Var.getUrl();
            r0.a().c(url, new a(q0Var, countDownLatch, cbVar, url));
        }
        try {
            countDownLatch.await();
            mi.a("AudioLoaderUtils: success media loading");
        } catch (InterruptedException unused) {
            mi.a("AudioLoaderUtils: awaiting media files load failed");
        }
    }
}
