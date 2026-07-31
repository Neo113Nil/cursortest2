package com.vungle.ads.internal.downloader;

import com.safedk.android.internal.partials.LiftoffMonetizeNetworkBridge;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.AssetWriteError;
import com.vungle.ads.InvalidAssetUrlError;
import com.vungle.ads.NoSpaceError;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.n;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.io.File;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.GzipSource;
import okio.Okio;
import okio.Okio__JvmOkioKt;

/* loaded from: classes4.dex */
public final class h implements m {
    public final com.vungle.ads.internal.executor.j a;
    public final PathProvider b;
    public final Lazy c;
    public final CopyOnWriteArrayList d;

    public h(com.vungle.ads.internal.executor.j downloadExecutor, PathProvider pathProvider) {
        Intrinsics.checkNotNullParameter(downloadExecutor, "downloadExecutor");
        Intrinsics.checkNotNullParameter(pathProvider, "pathProvider");
        this.a = downloadExecutor;
        this.b = pathProvider;
        this.c = LazyKt.lazy(new g(this));
        this.d = new CopyOnWriteArrayList();
    }

    public final void a(final k kVar, final com.vungle.ads.internal.load.c cVar) {
        this.d.add(kVar);
        this.a.a(new f(kVar, this, cVar), new Runnable() { // from class: com.vungle.ads.internal.downloader.h$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                h.a(k.this, this, cVar);
            }
        });
    }

    public static final void a(k kVar, h this$0, d dVar) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        b bVar = new b(-1, new OutOfMemory("Failed to execute download request: " + kVar.a().h()), 4);
        this$0.getClass();
        if (dVar != null) {
            ((com.vungle.ads.internal.load.c) dVar).a(bVar, kVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x027f, code lost:
    
        r8.b(3);
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0492 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0519  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b a(k kVar, d dVar) {
        BufferedSource bufferedSource;
        Call call;
        String str;
        File file;
        Response response;
        BufferedSink bufferedSink;
        ResponseBody okhttp3Response_body;
        b bVar;
        int b;
        ResponseBody okhttp3Response_body2;
        long contentLength;
        Call call2;
        int i;
        long read;
        ResponseBody okhttp3Response_body3;
        String str2 = "download status: ";
        com.vungle.ads.internal.model.b a = kVar.a();
        boolean z = u.a;
        StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("launch request in thread: ");
        a2.append(Thread.currentThread().getId());
        a2.append(" request: ");
        a2.append(a.h());
        t.a("AssetDownloader", a2.toString());
        if (kVar.e()) {
            StringBuilder a3 = com.iab.omid.library.vungle.internal.l.a("Request ");
            a3.append(a.h());
            a3.append(" is cancelled before starting");
            t.a("AssetDownloader", a3.toString());
            new c().b(3);
            return null;
        }
        c cVar = new c();
        cVar.c(System.currentTimeMillis());
        String h = a.h();
        String c = a.c();
        int i2 = -1;
        if (h.length() != 0 && n.a(h)) {
            if (c.length() == 0) {
                return new b(-1, new AssetWriteError(com.iab.omid.library.vungle.d.a("invalid path: ", c)).setLogEntry$vungle_ads_release(kVar.c()).logError$vungle_ads_release(), 3);
            }
            String absolutePath = this.b.c().getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "pathProvider.getVungleDir().absolutePath");
            long a4 = PathProvider.a(absolutePath);
            if (a4 < ServiceProvider.HTTP_CACHE_DISK_SIZE) {
                new NoSpaceError("Insufficient space " + a4).setLogEntry$vungle_ads_release(kVar.c()).logErrorNoReturnValue$vungle_ads_release();
                return new b(-1, new NoSpaceError(null, 1, null).setLogEntry$vungle_ads_release(kVar.c()).logError$vungle_ads_release(), 2);
            }
            File file2 = new File(c);
            if (file2.exists()) {
                StringBuilder a5 = com.iab.omid.library.vungle.internal.l.a("Deleting existing file before download: ");
                a5.append(file2.getAbsolutePath());
                t.a("AssetDownloader", a5.toString());
                if (!file2.delete()) {
                    return new b(-1, new AssetWriteError("Cannot delete partial file for restart").setLogEntry$vungle_ads_release(kVar.c()).logError$vungle_ads_release(), 2);
                }
            }
            try {
                File parentFile = file2.getParentFile();
                if (parentFile != null) {
                    try {
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                    } catch (Exception e) {
                        e = e;
                        str = "download status: ";
                        bufferedSource = null;
                        call = null;
                        response = null;
                        bufferedSink = null;
                        file = file2;
                        try {
                            boolean z2 = u.a;
                            t.b("AssetDownloader", "Download exception for " + a.h() + ": " + e);
                            cVar.b(7);
                            bVar = new b(i2, e, 1);
                            if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                            }
                            if (call != null) {
                            }
                            n.a(bufferedSink);
                            n.a(bufferedSource);
                            t.a("AssetDownloader", str + cVar.b());
                            b = cVar.b();
                            if (b == 7) {
                            }
                            return bVar;
                        } catch (Throwable th) {
                            th = th;
                            str2 = str;
                            if ((response == null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                                okhttp3Response_body.close();
                                Unit unit = Unit.INSTANCE;
                            }
                            if (call != null) {
                            }
                            n.a(bufferedSink);
                            n.a(bufferedSource);
                            boolean z3 = u.a;
                            StringBuilder a6 = com.iab.omid.library.vungle.internal.l.a(str2);
                            a6.append(cVar.b());
                            t.a("AssetDownloader", a6.toString());
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedSource = null;
                        call = null;
                        response = null;
                        bufferedSink = null;
                        if ((response == null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                        }
                        if (call != null) {
                        }
                        n.a(bufferedSink);
                        n.a(bufferedSource);
                        boolean z32 = u.a;
                        StringBuilder a62 = com.iab.omid.library.vungle.internal.l.a(str2);
                        a62.append(cVar.b());
                        t.a("AssetDownloader", a62.toString());
                        throw th;
                    }
                }
                call = ((OkHttpClient) this.c.getValue()).newCall(new Request.Builder().url(h).build());
            } catch (Exception e2) {
                e = e2;
                str = "download status: ";
                file = file2;
                bufferedSource = null;
                call = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedSource = null;
                call = null;
            }
            try {
                response = LiftoffMonetizeNetworkBridge.okhttp3CallExecute(call);
                try {
                    try {
                        i2 = response.code();
                        try {
                        } catch (Exception e3) {
                            e = e3;
                            str = "download status: ";
                            file = file2;
                            bufferedSource = null;
                            bufferedSink = null;
                            boolean z22 = u.a;
                            t.b("AssetDownloader", "Download exception for " + a.h() + ": " + e);
                            cVar.b(7);
                            bVar = new b(i2, e, 1);
                            if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                                okhttp3Response_body2.close();
                                Unit unit2 = Unit.INSTANCE;
                            }
                            if (call != null) {
                            }
                            n.a(bufferedSink);
                            n.a(bufferedSource);
                            t.a("AssetDownloader", str + cVar.b());
                            b = cVar.b();
                            if (b == 7) {
                            }
                            return bVar;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Exception e4) {
                    e = e4;
                    str = "download status: ";
                    file = file2;
                }
            } catch (Exception e5) {
                e = e5;
                str = "download status: ";
                file = file2;
                bufferedSource = null;
                response = null;
                bufferedSink = null;
                boolean z222 = u.a;
                t.b("AssetDownloader", "Download exception for " + a.h() + ": " + e);
                cVar.b(7);
                bVar = new b(i2, e, 1);
                if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                }
                if (call != null) {
                }
                n.a(bufferedSink);
                n.a(bufferedSource);
                t.a("AssetDownloader", str + cVar.b());
                b = cVar.b();
                if (b == 7) {
                }
                return bVar;
            } catch (Throwable th5) {
                th = th5;
                bufferedSource = null;
                response = null;
                bufferedSink = null;
                if ((response == null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                }
                if (call != null) {
                }
                n.a(bufferedSink);
                n.a(bufferedSource);
                boolean z322 = u.a;
                StringBuilder a622 = com.iab.omid.library.vungle.internal.l.a(str2);
                a622.append(cVar.b());
                t.a("AssetDownloader", a622.toString());
                throw th;
            }
            if (!response.isSuccessful()) {
                str = "download status: ";
                file = file2;
                try {
                    throw new l(response.message());
                } catch (Exception e6) {
                    e = e6;
                    i2 = i2;
                    call = call;
                    bufferedSource = null;
                    bufferedSink = null;
                    boolean z2222 = u.a;
                    t.b("AssetDownloader", "Download exception for " + a.h() + ": " + e);
                    cVar.b(7);
                    bVar = new b(i2, e, 1);
                    if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                    }
                    if (call != null) {
                    }
                    n.a(bufferedSink);
                    n.a(bufferedSource);
                    t.a("AssetDownloader", str + cVar.b());
                    b = cVar.b();
                    if (b == 7) {
                    }
                    return bVar;
                } catch (Throwable th6) {
                    th = th6;
                    call = call;
                    str2 = str;
                    bufferedSource = null;
                    bufferedSink = null;
                    if ((response == null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                    }
                    if (call != null) {
                    }
                    n.a(bufferedSink);
                    n.a(bufferedSource);
                    boolean z3222 = u.a;
                    StringBuilder a6222 = com.iab.omid.library.vungle.internal.l.a(str2);
                    a6222.append(cVar.b());
                    t.a("AssetDownloader", a6222.toString());
                    throw th;
                }
            }
            if (response.cacheResponse() != null) {
                try {
                    AnalyticsClient.INSTANCE.a(new m2(Sdk.SDKMetric.SDKMetricType.CACHED_ASSETS_USED), kVar.c(), h);
                    Unit unit3 = Unit.INSTANCE;
                } catch (Exception e7) {
                    e = e7;
                    str = "download status: ";
                    bufferedSource = null;
                    bufferedSink = null;
                    file = file2;
                    boolean z22222 = u.a;
                    t.b("AssetDownloader", "Download exception for " + a.h() + ": " + e);
                    cVar.b(7);
                    bVar = new b(i2, e, 1);
                    if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                    }
                    if (call != null) {
                    }
                    n.a(bufferedSink);
                    n.a(bufferedSource);
                    t.a("AssetDownloader", str + cVar.b());
                    b = cVar.b();
                    if (b == 7) {
                    }
                    return bVar;
                } catch (Throwable th7) {
                    th = th7;
                    bufferedSource = null;
                    bufferedSink = null;
                    if ((response == null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                    }
                    if (call != null) {
                    }
                    n.a(bufferedSink);
                    n.a(bufferedSource);
                    boolean z32222 = u.a;
                    StringBuilder a62222 = com.iab.omid.library.vungle.internal.l.a(str2);
                    a62222.append(cVar.b());
                    t.a("AssetDownloader", a62222.toString());
                    throw th;
                }
            }
            ResponseBody a7 = a(response);
            String header$default = Response.header$default(response, "Content-Type", null, 2, null);
            if (header$default != null) {
                kVar.a().a(header$default);
                Unit unit4 = Unit.INSTANCE;
            }
            bufferedSource = a7 != null ? LiftoffMonetizeNetworkBridge.retrofitExceptionCatchingRequestBody_source(a7) : null;
            try {
                t.a("AssetDownloader", "Start download from url: " + h + " mimeType=" + header$default);
                int i3 = 0;
                bufferedSink = Okio.buffer(Okio__JvmOkioKt.sink$default(file2, false, 1, null));
                file = file2;
                if (a7 != null) {
                    try {
                        contentLength = a7.getContentLength();
                    } catch (Exception e8) {
                        e = e8;
                        str = "download status: ";
                        boolean z222222 = u.a;
                        t.b("AssetDownloader", "Download exception for " + a.h() + ": " + e);
                        cVar.b(7);
                        bVar = new b(i2, e, 1);
                        if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                        }
                        if (call != null) {
                        }
                        n.a(bufferedSink);
                        n.a(bufferedSource);
                        t.a("AssetDownloader", str + cVar.b());
                        b = cVar.b();
                        if (b == 7) {
                        }
                        return bVar;
                    } catch (Throwable th8) {
                        th = th8;
                        if ((response == null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                        }
                        if (call != null) {
                        }
                        n.a(bufferedSink);
                        n.a(bufferedSource);
                        boolean z322222 = u.a;
                        StringBuilder a622222 = com.iab.omid.library.vungle.internal.l.a(str2);
                        a622222.append(cVar.b());
                        t.a("AssetDownloader", a622222.toString());
                        throw th;
                    }
                } else {
                    contentLength = 0;
                }
                try {
                    cVar.b(0);
                    cVar.b(contentLength);
                    Call call3 = call;
                    try {
                        cVar.a(0L);
                        cVar.a(0);
                        a.a(contentLength);
                        if (dVar != null) {
                            try {
                                ((com.vungle.ads.internal.load.c) dVar).a(cVar, kVar);
                            } catch (Exception e9) {
                                e = e9;
                                str = "download status: ";
                                call = call3;
                                i2 = i2;
                                boolean z2222222 = u.a;
                                t.b("AssetDownloader", "Download exception for " + a.h() + ": " + e);
                                cVar.b(7);
                                bVar = new b(i2, e, 1);
                                if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                                }
                                if (call != null) {
                                }
                                n.a(bufferedSink);
                                n.a(bufferedSource);
                                t.a("AssetDownloader", str + cVar.b());
                                b = cVar.b();
                                if (b == 7) {
                                }
                                return bVar;
                            } catch (Throwable th9) {
                                th = th9;
                                call = call3;
                                if ((response == null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                                }
                                if (call != null) {
                                }
                                n.a(bufferedSink);
                                n.a(bufferedSource);
                                boolean z3222222 = u.a;
                                StringBuilder a6222222 = com.iab.omid.library.vungle.internal.l.a(str2);
                                a6222222.append(cVar.b());
                                t.a("AssetDownloader", a6222222.toString());
                                throw th;
                            }
                        }
                        long j = 0;
                        while (true) {
                            if (bufferedSource != null) {
                                try {
                                    call2 = call3;
                                    i = i3;
                                    try {
                                        try {
                                            read = bufferedSource.read(bufferedSink.getBuffer(), 8192L);
                                        } catch (Exception e10) {
                                            e = e10;
                                            str = str2;
                                            i2 = i2;
                                            call = call2;
                                            boolean z22222222 = u.a;
                                            t.b("AssetDownloader", "Download exception for " + a.h() + ": " + e);
                                            cVar.b(7);
                                            bVar = new b(i2, e, 1);
                                            if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null && (okhttp3Response_body2 = LiftoffMonetizeNetworkBridge.okhttp3Response_body(response)) != null) {
                                                okhttp3Response_body2.close();
                                                Unit unit22 = Unit.INSTANCE;
                                            }
                                            if (call != null) {
                                                call.cancel();
                                                Unit unit5 = Unit.INSTANCE;
                                            }
                                            n.a(bufferedSink);
                                            n.a(bufferedSource);
                                            t.a("AssetDownloader", str + cVar.b());
                                            b = cVar.b();
                                            if (b == 7) {
                                                if (b != 3) {
                                                }
                                                return null;
                                            }
                                            return bVar;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        call = call2;
                                        if ((response == null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                                        }
                                        if (call != null) {
                                        }
                                        n.a(bufferedSink);
                                        n.a(bufferedSource);
                                        boolean z32222222 = u.a;
                                        StringBuilder a62222222 = com.iab.omid.library.vungle.internal.l.a(str2);
                                        a62222222.append(cVar.b());
                                        t.a("AssetDownloader", a62222222.toString());
                                        throw th;
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    call2 = call3;
                                    str = str2;
                                    i2 = i2;
                                    call = call2;
                                    boolean z222222222 = u.a;
                                    t.b("AssetDownloader", "Download exception for " + a.h() + ": " + e);
                                    cVar.b(7);
                                    bVar = new b(i2, e, 1);
                                    if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                                    }
                                    if (call != null) {
                                    }
                                    n.a(bufferedSink);
                                    n.a(bufferedSource);
                                    t.a("AssetDownloader", str + cVar.b());
                                    b = cVar.b();
                                    if (b == 7) {
                                    }
                                    return bVar;
                                } catch (Throwable th11) {
                                    th = th11;
                                    call2 = call3;
                                    call = call2;
                                    if ((response == null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                                    }
                                    if (call != null) {
                                    }
                                    n.a(bufferedSink);
                                    n.a(bufferedSource);
                                    boolean z322222222 = u.a;
                                    StringBuilder a622222222 = com.iab.omid.library.vungle.internal.l.a(str2);
                                    a622222222.append(cVar.b());
                                    t.a("AssetDownloader", a622222222.toString());
                                    throw th;
                                }
                            } else {
                                call2 = call3;
                                i = i3;
                                read = -1;
                            }
                            try {
                                Unit unit6 = Unit.INSTANCE;
                                if (read <= 0) {
                                    break;
                                }
                                if (kVar.e()) {
                                    break;
                                }
                                if (file.exists()) {
                                    cVar.b(1);
                                    bufferedSink.emit();
                                    bufferedSink.flush();
                                    j += read;
                                    cVar.a(j);
                                    Long f = a.f();
                                    long longValue = f != null ? f.longValue() : a.g();
                                    if (!a.o() || j < longValue) {
                                        str = str2;
                                    } else {
                                        boolean z4 = u.a;
                                        StringBuilder sb = new StringBuilder();
                                        str = str2;
                                        try {
                                            sb.append("Downloader totalRead=");
                                            sb.append(j);
                                            sb.append(" requiredBytes=");
                                            sb.append(longValue);
                                            t.b("AssetDownloader", sb.toString());
                                            a.p();
                                        } catch (Exception e12) {
                                            e = e12;
                                            i2 = i2;
                                            call = call2;
                                            boolean z2222222222 = u.a;
                                            t.b("AssetDownloader", "Download exception for " + a.h() + ": " + e);
                                            cVar.b(7);
                                            bVar = new b(i2, e, 1);
                                            if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                                            }
                                            if (call != null) {
                                            }
                                            n.a(bufferedSink);
                                            n.a(bufferedSource);
                                            t.a("AssetDownloader", str + cVar.b());
                                            b = cVar.b();
                                            if (b == 7) {
                                            }
                                            return bVar;
                                        } catch (Throwable th12) {
                                            th = th12;
                                            call = call2;
                                            str2 = str;
                                            if ((response == null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                                            }
                                            if (call != null) {
                                            }
                                            n.a(bufferedSink);
                                            n.a(bufferedSource);
                                            boolean z3222222222 = u.a;
                                            StringBuilder a6222222222 = com.iab.omid.library.vungle.internal.l.a(str2);
                                            a6222222222.append(cVar.b());
                                            t.a("AssetDownloader", a6222222222.toString());
                                            throw th;
                                        }
                                    }
                                    i3 = contentLength > 0 ? (int) ((100 * j) / contentLength) : i;
                                    while (cVar.a() + 1 <= Math.min(i3, 100)) {
                                        cVar.b(1);
                                        cVar.a(cVar.a() + 1);
                                        if (cVar.a() >= 100) {
                                            cVar.b(4);
                                        }
                                        if (dVar != null) {
                                            ((com.vungle.ads.internal.load.c) dVar).a(cVar, kVar);
                                        }
                                    }
                                    call3 = call2;
                                    str2 = str;
                                } else {
                                    new AssetWriteError("Asset save error " + h).setLogEntry$vungle_ads_release(kVar.c()).logErrorNoReturnValue$vungle_ads_release();
                                    throw new l("File is not existing");
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                call = call2;
                                if ((response == null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null && (okhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(response)) != null) {
                                    okhttp3Response_body.close();
                                    Unit unit7 = Unit.INSTANCE;
                                }
                                if (call != null) {
                                    call.cancel();
                                    Unit unit8 = Unit.INSTANCE;
                                }
                                n.a(bufferedSink);
                                n.a(bufferedSource);
                                boolean z32222222222 = u.a;
                                StringBuilder a62222222222 = com.iab.omid.library.vungle.internal.l.a(str2);
                                a62222222222.append(cVar.b());
                                t.a("AssetDownloader", a62222222222.toString());
                                throw th;
                            }
                        }
                        String str3 = str2;
                        bufferedSink.flush();
                        if (cVar.b() == 1) {
                            cVar.b(4);
                            if (dVar != null) {
                                ((com.vungle.ads.internal.load.c) dVar).a(cVar, kVar);
                            }
                        }
                        if (LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) != null && (okhttp3Response_body3 = LiftoffMonetizeNetworkBridge.okhttp3Response_body(response)) != null) {
                            okhttp3Response_body3.close();
                        }
                        call2.cancel();
                        n.a(bufferedSink);
                        n.a(bufferedSource);
                        boolean z5 = u.a;
                        StringBuilder a8 = com.iab.omid.library.vungle.internal.l.a(str3);
                        a8.append(cVar.b());
                        t.a("AssetDownloader", a8.toString());
                        bVar = null;
                    } catch (Exception e13) {
                        e = e13;
                        str = "download status: ";
                        call2 = call3;
                    } catch (Throwable th14) {
                        th = th14;
                    }
                } catch (Exception e14) {
                    e = e14;
                    str = "download status: ";
                } catch (Throwable th15) {
                    th = th15;
                }
            } catch (Exception e15) {
                e = e15;
                str = "download status: ";
                file = file2;
                bufferedSink = null;
                boolean z22222222222 = u.a;
                t.b("AssetDownloader", "Download exception for " + a.h() + ": " + e);
                cVar.b(7);
                bVar = new b(i2, e, 1);
                if ((response != null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                }
                if (call != null) {
                }
                n.a(bufferedSink);
                n.a(bufferedSource);
                t.a("AssetDownloader", str + cVar.b());
                b = cVar.b();
                if (b == 7) {
                }
                return bVar;
            } catch (Throwable th16) {
                th = th16;
                bufferedSink = null;
                if ((response == null ? LiftoffMonetizeNetworkBridge.okhttp3Response_body(response) : null) != null) {
                }
                if (call != null) {
                }
                n.a(bufferedSink);
                n.a(bufferedSource);
                boolean z322222222222 = u.a;
                StringBuilder a622222222222 = com.iab.omid.library.vungle.internal.l.a(str2);
                a622222222222.append(cVar.b());
                t.a("AssetDownloader", a622222222222.toString());
                throw th;
            }
            b = cVar.b();
            if (b == 7 || b == 0) {
                return bVar;
            }
            if (b != 3) {
                t.a("AssetDownloader", "On cancel " + kVar);
                if (dVar != null) {
                    ((com.vungle.ads.internal.load.c) dVar).a(cVar, kVar);
                }
            } else {
                t.a("AssetDownloader", "On success " + kVar);
                if (dVar != null) {
                    ((com.vungle.ads.internal.load.c) dVar).a(file, kVar);
                }
                int b2 = kVar.b();
                if (b2 > 0) {
                    AnalyticsClient.INSTANCE.c(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_RETRY_STATUS, 1L, kVar.c(), "retryCount=" + b2 + " url=" + kVar.a().h());
                }
            }
            return null;
        }
        return new b(-1, new InvalidAssetUrlError(com.iab.omid.library.vungle.d.a("invalid url: ", h)).setLogEntry$vungle_ads_release(kVar.c()).logError$vungle_ads_release(), 4);
    }

    public static ResponseBody a(Response response) {
        ResponseBody okhttp3Response_body = LiftoffMonetizeNetworkBridge.okhttp3Response_body(response);
        if (!StringsKt.equals("gzip", Response.header$default(response, "Content-Encoding", null, 2, null), true) || okhttp3Response_body == null) {
            return okhttp3Response_body;
        }
        return new RealResponseBody(Response.header$default(response, "Content-Type", null, 2, null), -1L, Okio.buffer(new GzipSource(LiftoffMonetizeNetworkBridge.retrofitExceptionCatchingRequestBody_source(okhttp3Response_body))));
    }
}
