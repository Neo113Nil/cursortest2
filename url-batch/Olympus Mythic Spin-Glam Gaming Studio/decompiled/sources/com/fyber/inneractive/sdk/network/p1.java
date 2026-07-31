package com.fyber.inneractive.sdk.network;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.internal.partials.DTExchangeNetworkBridge;
import io.bidmachine.util.network.NetworkUtils;
import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* loaded from: classes6.dex */
public final class p1 extends i implements h {
    public final OkHttpClient a = new OkHttpClient().newBuilder().build();

    public static HashMap b(Response response) {
        HashMap hashMap = new HashMap();
        if (response != null) {
            Headers headers = response.headers();
            for (int i = 0; i < headers.size(); i++) {
                String name = headers.name(i);
                hashMap.put(name, Collections.singletonList(headers.get(name)));
            }
        }
        return hashMap;
    }

    @Override // com.fyber.inneractive.sdk.network.h
    public final l a(t0 t0Var, String str, String str2) {
        IAlog.a("%s okhttp network stack is in use", "OkHttpExecutorImpl");
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(t0Var.r());
            Pair a = a(t0Var.r(), t0Var, arrayList, str, str2);
            Object obj = a.second;
            String message = obj != null ? ((Response) obj).message() : "";
            FilterInputStream a2 = a((Response) a.second);
            Object obj2 = a.second;
            int code = obj2 == null ? -1 : ((Response) obj2).code();
            HashMap b = b((Response) a.second);
            Response response = (Response) a.second;
            o1 o1Var = new o1(i.a(a2, code, message, b, response != null ? response.headers().get("Last-Modified") : null), (Response) a.second);
            Iterator it = ((List) a.first).iterator();
            while (it.hasNext()) {
                o1Var.f.add((String) it.next());
            }
            return o1Var;
        } catch (b e) {
            IAlog.b("%s cannot connect exception: %s", "OkHttpExecutorImpl", e.getMessage());
            throw e;
        } catch (Exception e2) {
            IAlog.b("%s exception: %s", "OkHttpExecutorImpl", e2.getMessage());
            throw e2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d5, code lost:
    
        if (r8.code() != 308) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e1 A[Catch: all -> 0x00c1, Exception -> 0x00c4, TryCatch #1 {Exception -> 0x00c4, blocks: (B:14:0x00a4, B:16:0x00b0, B:18:0x00b8, B:21:0x00d7, B:23:0x00e1, B:25:0x00e9, B:27:0x00f1, B:29:0x00f7, B:32:0x0114, B:34:0x0124, B:36:0x012f, B:40:0x0149, B:41:0x0150, B:42:0x00c7, B:44:0x00cf, B:46:0x0151), top: B:13:0x00a4, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair a(String str, t0 t0Var, ArrayList arrayList, String str2, String str3) {
        String header;
        l1 p = t0Var.p();
        Request.Builder builder = new Request.Builder();
        a(builder, "Accept-Encoding", "gzip");
        a(builder, "User-Agent", str2);
        a(builder, "If-Modified-Since", str3);
        Map l = t0Var.l();
        if (l != null) {
            for (String str4 : l.keySet()) {
                a(builder, str4, (String) l.get(str4));
            }
        }
        builder.url(str);
        if (t0Var.m() == m0.POST || t0Var.m() == m0.PUT) {
            byte[] f = t0Var.f();
            if (f != null) {
                builder.post(RequestBody.create(f, MediaType.parse(t0Var.n())));
            } else {
                throw new Exception("Could not create ok http request. post payload is null");
            }
        }
        Request build = builder.build();
        boolean z = !(t0Var instanceof h1);
        OkHttpClient.Builder followSslRedirects = this.a.newBuilder().followRedirects(z).followSslRedirects(z);
        long j = p.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient build2 = followSslRedirects.connectTimeout(j, timeUnit).readTimeout(p.b, timeUnit).build();
        t0Var.c(System.currentTimeMillis());
        IAlog.a("OkHttpExecutorImpl: start connection timestamp: %s", t0Var.g);
        try {
            try {
                Response okhttp3CallExecute = DTExchangeNetworkBridge.okhttp3CallExecute(build2.newCall(build));
                if (t0Var instanceof h1) {
                    if (okhttp3CallExecute.code() > 300) {
                        if (okhttp3CallExecute.code() >= 304) {
                        }
                        header = okhttp3CallExecute.header(NetworkUtils.HEADER_LOCATION, "");
                        if (header != null) {
                            if (!header.startsWith("http") && !header.contains("://") && arrayList.size() > 0) {
                                Uri parse = Uri.parse((String) arrayList.get(arrayList.size() - 1));
                                header = String.format(header.startsWith("/") ? "%s://%s%s" : "%s://%s/%s", parse.getScheme(), parse.getHost(), header);
                            }
                            String str5 = header;
                            arrayList.add(str5);
                            if (arrayList.size() <= 5) {
                                Pair a = a(str5, t0Var, arrayList, str2, str3);
                                t0Var.a(System.currentTimeMillis());
                                IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", t0Var.g);
                                return a;
                            }
                            throw new b("Url chain too big for us");
                        }
                    }
                    if (okhttp3CallExecute.code() != 307) {
                    }
                    header = okhttp3CallExecute.header(NetworkUtils.HEADER_LOCATION, "");
                    if (header != null) {
                    }
                }
                Pair pair = new Pair(arrayList, okhttp3CallExecute);
                t0Var.a(System.currentTimeMillis());
                IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", t0Var.g);
                return pair;
            } catch (Exception e) {
                throw new b(e);
            }
        } catch (Throwable th) {
            t0Var.a(System.currentTimeMillis());
            IAlog.a("OkHttpExecutorImpl: end connection timestamp: %s", t0Var.g);
            throw th;
        }
    }

    public static FilterInputStream a(Response response) {
        if (response == null) {
            return null;
        }
        try {
            if (DTExchangeNetworkBridge.okhttp3Response_body(response) == null) {
                return null;
            }
            return i.a(DTExchangeNetworkBridge.okhttp3Response_body(response).byteStream(), TextUtils.equals("gzip", response.headers().get("content-encoding")));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Request.Builder builder, String str, String str2) {
        IAlog.d("%s %s : %s", "REQUEST_HEADER", str, str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.addHeader(str, str2);
    }
}
