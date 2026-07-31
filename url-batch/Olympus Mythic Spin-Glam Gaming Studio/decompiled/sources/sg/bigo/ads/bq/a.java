package sg.bigo.ads.bq;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpEngine;
import android.net.http.UrlRequest;
import android.os.HandlerThread;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import io.bidmachine.util.network.NetworkUtils;
import java.net.URL;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.impl.HttpEngineNativeProvider$$ExternalSyntheticApiModelOutline0;
import sg.bigo.ads.an.g;
import sg.bigo.ads.bo.d;
import sg.bigo.ads.bo.f;
import sg.bigo.ads.bo.h;
import sg.bigo.ads.bp.e;
import sg.bigo.ads.bq.b;
import sg.bigo.ads.bq.c;
import sg.bigo.ads.common.utils.l;

@RequiresApi
/* loaded from: classes9.dex */
public final class a implements d {
    final sg.bigo.ads.bh.b a;
    private final HttpEngine b;
    private final sg.bigo.ads.bp.b c = new sg.bigo.ads.bp.b();

    @Nullable
    private final g d;

    /* renamed from: sg.bigo.ads.bq.a$a, reason: collision with other inner class name */
    static final class C1854a {

        @NonNull
        final UrlRequest a;

        @NonNull
        final c b;

        C1854a(@NonNull UrlRequest urlRequest, @NonNull c cVar) {
            this.a = urlRequest;
            this.b = cVar;
        }
    }

    public a(@NonNull Context context, @Nullable g gVar) {
        HttpEngine build;
        this.d = gVar;
        build = HttpEngineNativeProvider$$ExternalSyntheticApiModelOutline0.m(context).build();
        this.b = build;
        HandlerThread handlerThread = new HandlerThread("BGAd-HttpEngine", 0);
        handlerThread.start();
        this.a = new sg.bigo.ads.bh.b("BGAd-HttpEngine", handlerThread.getLooper());
    }

    private void d(@NonNull final sg.bigo.ads.bs.c cVar, @NonNull final sg.bigo.ads.bo.b bVar) {
        Executor executor = cVar.l;
        if (executor == null) {
            executor = e.a();
        }
        final Executor executor2 = executor;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final AtomicReference atomicReference = new AtomicReference();
        final Runnable runnable = new Runnable() { // from class: sg.bigo.ads.bq.a.1
            @Override // java.lang.Runnable
            public final void run() {
                if (atomicBoolean.compareAndSet(false, true)) {
                    sg.bigo.ads.bn.a.a(0, "HttpEngineNetClient", "async request timed out: " + cVar.g());
                    C1854a c1854a = (C1854a) atomicReference.get();
                    if (c1854a != null) {
                        c1854a.b.a(new h(701, "async request timed out"));
                        c1854a.a.cancel();
                    }
                }
            }
        };
        final c.a aVar = new c.a() { // from class: sg.bigo.ads.bq.a.2
            @Override // sg.bigo.ads.bq.c.a
            public final void a() {
                a.this.a.removeCallbacks(runnable);
                atomicBoolean.compareAndSet(false, true);
            }
        };
        sg.bigo.ads.bh.d.a(new Runnable() { // from class: sg.bigo.ads.bq.a.3
            @Override // java.lang.Runnable
            public final void run() {
                bVar.a((sg.bigo.ads.bo.b) cVar);
            }
        }, new Runnable() { // from class: sg.bigo.ads.bq.a.4
            @Override // java.lang.Runnable
            public final void run() {
                C1854a a = a.this.a(cVar, bVar, aVar, executor2);
                atomicReference.set(a);
                if (a != null) {
                    long j = cVar.m;
                    if (j <= 10) {
                        j = 15000;
                    }
                    a.this.a.postDelayed(runnable, j);
                }
            }
        });
    }

    @Nullable
    final C1854a a(@NonNull sg.bigo.ads.bs.c cVar, @NonNull sg.bigo.ads.bo.b bVar, @Nullable c.a aVar, @NonNull Executor executor) {
        UrlRequest.Builder newUrlRequestBuilder;
        UrlRequest build;
        String l;
        try {
            b bVar2 = new b(cVar, this.d);
            c cVar2 = new c(bVar2, bVar, this.c, aVar);
            HttpEngine httpEngine = this.b;
            bVar2.a.a("PreHost");
            T t = bVar2.a.k;
            String a = t.a();
            String f = t.f();
            String d = t.d();
            if (!TextUtils.isEmpty(f) && !TextUtils.isEmpty(d) && !TextUtils.equals(f, d)) {
                bVar2.a.a("PreHost", f);
            }
            if (t.e()) {
                bVar2.a.a("Host", d);
            }
            bVar2.a.h();
            URL a2 = sg.bigo.ads.br.b.a(Uri.parse(a), bVar2.a, bVar2.b);
            bVar2.c = a2;
            newUrlRequestBuilder = httpEngine.newUrlRequestBuilder(a2.toString(), executor, cVar2);
            newUrlRequestBuilder.setHttpMethod(bVar2.a.a());
            Map<String, Set<String>> map = bVar2.a.n;
            bVar2.d = sg.bigo.ads.br.b.a(map);
            for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                Set<String> value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !l.a(value)) {
                    for (String str : value) {
                        if (!TextUtils.isEmpty(str)) {
                            newUrlRequestBuilder.addHeader(key, str);
                        }
                    }
                }
            }
            byte[] a3 = sg.bigo.ads.br.b.a(bVar2.a, bVar2.b);
            if (a3 != null) {
                f b = bVar2.a.b();
                if (b != null) {
                    newUrlRequestBuilder.addHeader("Content-Type", b.toString());
                }
                if (sg.bigo.ads.br.b.b(bVar2.a, bVar2.b)) {
                    newUrlRequestBuilder.addHeader("Content-Encoding", "gzip");
                    l = String.valueOf(a3.length);
                } else {
                    l = Long.toString(bVar2.a.e());
                }
                newUrlRequestBuilder.addHeader(NetworkUtils.HEADER_CONTENT_LENGTH, l);
                newUrlRequestBuilder.setUploadDataProvider(new b.a(a3), executor);
            }
            build = newUrlRequestBuilder.build();
            build.start();
            return new C1854a(build, cVar2);
        } catch (Throwable th) {
            sg.bigo.ads.bn.a.a(0, "HttpEngineNetClient", "performRequest error: " + th.getMessage());
            bVar.a((sg.bigo.ads.bo.b) cVar, new h(700, th.getMessage()));
            if (aVar == null) {
                return null;
            }
            aVar.a();
            return null;
        }
    }

    @Override // sg.bigo.ads.bo.d
    public final void a(@NonNull sg.bigo.ads.bs.c cVar, @NonNull sg.bigo.ads.bo.b bVar) {
        d(cVar, bVar);
    }

    @Override // sg.bigo.ads.bo.d
    public final void b(@NonNull sg.bigo.ads.bs.c cVar, @NonNull sg.bigo.ads.bo.b bVar) {
        d(cVar, bVar);
    }

    @Override // sg.bigo.ads.bo.d
    public final void c(@NonNull sg.bigo.ads.bs.c cVar, @NonNull final sg.bigo.ads.bo.b bVar) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        c.a aVar = new c.a() { // from class: sg.bigo.ads.bq.a.5
            @Override // sg.bigo.ads.bq.c.a
            public final void a() {
                countDownLatch.countDown();
                atomicBoolean.compareAndSet(false, true);
            }
        };
        Executor executor = cVar.l;
        if (executor == null) {
            executor = e.a();
        }
        C1854a a = a(cVar, bVar, aVar, executor);
        try {
            if (countDownLatch.await(cVar.m, TimeUnit.MILLISECONDS)) {
                return;
            }
            sg.bigo.ads.bn.a.a(0, "HttpEngineNetClient", "sync request timed out: " + cVar.g());
            if (a != null) {
                a.b.a(new h(701, "sync request timed out"));
                a.a.cancel();
            }
            bVar.a((sg.bigo.ads.bo.b) cVar, new h(702, "sync request timed out"));
            atomicBoolean.compareAndSet(false, true);
        } catch (Throwable th) {
            if (a != null) {
                a.b.a(new h(700, th.getMessage()));
                a.a.cancel();
            }
            bVar.a((sg.bigo.ads.bo.b) cVar, new h(700, "error: " + th.getMessage()));
            atomicBoolean.compareAndSet(false, true);
        }
    }
}
