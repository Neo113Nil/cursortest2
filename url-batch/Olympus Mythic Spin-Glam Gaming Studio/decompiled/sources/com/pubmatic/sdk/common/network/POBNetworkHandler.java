package com.pubmatic.sdk.common.network;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Header;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BaseHttpStack;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.ironsource.B5;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBHttpRequest;
import com.pubmatic.sdk.common.taskhandler.POBThreadExecutor;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import io.bidmachine.util.network.NetworkUtils;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class POBNetworkHandler {
    public static final String TAG = "POBNetworkHandler";
    private final POBRequestQueue a;
    private POBThreadExecutor b;

    public interface POBImageNetworkListener<T> {
        void onFailure(POBError pOBError);

        void onSuccess(Bitmap bitmap);
    }

    public interface POBNetworkListener<T> {
        void onFailure(@NonNull POBError pOBError);

        void onSuccess(@Nullable T t);
    }

    public interface POBNetworkRedirectListener {
        POBHttpRequest onRedirect(POBHttpRequest pOBHttpRequest);
    }

    public interface POBNetworkResultListener {
        void onResult(@Nullable POBNetworkResult pOBNetworkResult);
    }

    class a implements Response.Listener {
        final /* synthetic */ POBNetworkListener a;

        /* renamed from: com.pubmatic.sdk.common.network.POBNetworkHandler$a$a, reason: collision with other inner class name */
        class RunnableC1688a implements Runnable {
            final /* synthetic */ String a;

            RunnableC1688a(String str) {
                this.a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.a.onSuccess(this.a);
            }
        }

        a(POBNetworkListener pOBNetworkListener) {
            this.a = pOBNetworkListener;
        }

        public void a(String str) {
            if (this.a != null) {
                POBNetworkHandler.this.a(new RunnableC1688a(str));
            }
        }

        @Override // com.android.volley.Response.Listener
        public /* bridge */ /* synthetic */ void onResponse(Object obj) {
            Logger.d("PubMatic|SafeDK: Execution> Lcom/pubmatic/sdk/common/network/POBNetworkHandler$a;->onResponse(Ljava/lang/Object;)V");
            CreativeInfoManager.onVolleyGetResponse(com.safedk.android.utils.h.F, this, obj);
            safedk_POBNetworkHandler$a_onResponse_ecdcd67a553e43db266b793219987486(obj);
        }

        public void safedk_POBNetworkHandler$a_onResponse_ecdcd67a553e43db266b793219987486(Object p0) {
            a((String) p0);
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[POBHttpRequest.HTTP_METHOD.values().length];
            a = iArr;
            try {
                iArr[POBHttpRequest.HTTP_METHOD.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[POBHttpRequest.HTTP_METHOD.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[POBHttpRequest.HTTP_METHOD.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    class c extends StringRequest {
        final /* synthetic */ POBHttpRequest a;
        final /* synthetic */ POBNetworkResultListener b;
        final /* synthetic */ POBNetworkHandler c;

        class a implements Runnable {
            final /* synthetic */ POBNetworkResult a;

            a(POBNetworkResult pOBNetworkResult) {
                this.a = pOBNetworkResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.b.onResult(this.a);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        c(POBNetworkHandler pOBNetworkHandler, int i, String str, Response.Listener listener, Response.ErrorListener errorListener, POBHttpRequest pOBHttpRequest, POBNetworkResultListener pOBNetworkResultListener) {
            this(pOBNetworkHandler, i, str, listener, errorListener, pOBHttpRequest, pOBNetworkResultListener, null);
            Logger.d("PubMatic|SafeDK: Execution> Lcom/pubmatic/sdk/common/network/POBNetworkHandler$c;-><init>(Lcom/pubmatic/sdk/common/network/POBNetworkHandler;ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;Lcom/pubmatic/sdk/common/network/POBHttpRequest;Lcom/pubmatic/sdk/common/network/POBNetworkHandler$POBNetworkResultListener;)V");
            CreativeInfoManager.onVolleyStringRequestCtor(com.safedk.android.utils.h.F, str, listener);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private c(POBNetworkHandler p1, int p2, String p3, Response.Listener p4, Response.ErrorListener p5, POBHttpRequest p6, POBNetworkResultListener p7, StatsEvent p8) {
            super(p2, p3, p4, p5);
            Logger.d("PubMatic|SafeDK: Execution> Lcom/pubmatic/sdk/common/network/POBNetworkHandler$c;-><init>(Lcom/pubmatic/sdk/common/network/POBNetworkHandler;ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;Lcom/pubmatic/sdk/common/network/POBHttpRequest;Lcom/pubmatic/sdk/common/network/POBNetworkHandler$POBNetworkResultListener;)V");
            if ("PubMatic|SafeDK: Execution> Lcom/pubmatic/sdk/common/network/POBNetworkHandler$c;-><init>(Lcom/pubmatic/sdk/common/network/POBNetworkHandler;ILjava/lang/String;Lcom/android/volley/Response$Listener;Lcom/android/volley/Response$ErrorListener;Lcom/pubmatic/sdk/common/network/POBHttpRequest;Lcom/pubmatic/sdk/common/network/POBNetworkHandler$POBNetworkResultListener;)V" == 0) {
                this.c = p1;
                this.a = p6;
                this.b = p7;
                return;
            }
            this.c = p1;
            this.a = p6;
            this.b = p7;
            super(p2, p3, p4, p5);
        }

        @Override // com.android.volley.Request
        public byte[] getBody() {
            if (this.a.getPostData() == null) {
                return null;
            }
            return this.a.getPostData().getBytes(StandardCharsets.UTF_8);
        }

        @Override // com.android.volley.Request
        public Map getHeaders() {
            return this.a.getHeaders();
        }

        @Override // com.android.volley.toolbox.StringRequest, com.android.volley.Request
        protected Response<String> parseNetworkResponse(NetworkResponse networkResponse) {
            if (this.b != null) {
                Map map = networkResponse.headers;
                if (map == null) {
                    map = new HashMap();
                }
                this.c.a(new a(new POBNetworkResult(map, networkResponse.networkTimeMs)));
            }
            return super.parseNetworkResponse(networkResponse);
        }
    }

    class d implements Response.Listener {
        final /* synthetic */ POBImageNetworkListener a;

        class a implements Runnable {
            final /* synthetic */ Bitmap a;

            a(Bitmap bitmap) {
                this.a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.a.onSuccess(this.a);
            }
        }

        d(POBImageNetworkListener pOBImageNetworkListener) {
            this.a = pOBImageNetworkListener;
        }

        public void a(Bitmap bitmap) {
            if (this.a != null) {
                POBNetworkHandler.this.a(new a(bitmap));
            }
        }

        @Override // com.android.volley.Response.Listener
        public /* bridge */ /* synthetic */ void onResponse(Object obj) {
            Logger.d("PubMatic|SafeDK: Execution> Lcom/pubmatic/sdk/common/network/POBNetworkHandler$d;->onResponse(Ljava/lang/Object;)V");
            CreativeInfoManager.onVolleyGetResponse(com.safedk.android.utils.h.F, this, obj);
            safedk_POBNetworkHandler$d_onResponse_592f11f730de7fb80646b2978968126c(obj);
        }

        public void safedk_POBNetworkHandler$d_onResponse_592f11f730de7fb80646b2978968126c(Object p0) {
            a((Bitmap) p0);
        }
    }

    class e implements Response.ErrorListener {
        final /* synthetic */ POBImageNetworkListener a;

        class a implements Runnable {
            final /* synthetic */ POBError a;

            a(POBError pOBError) {
                this.a = pOBError;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.a.onFailure(this.a);
            }
        }

        e(POBImageNetworkListener pOBImageNetworkListener) {
            this.a = pOBImageNetworkListener;
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            if (this.a != null) {
                POBNetworkHandler.this.a(new a(new POBError(1007, "not able to fetch response")));
            }
        }
    }

    class f implements Response.Listener {
        final /* synthetic */ POBNetworkListener a;

        class a implements Runnable {
            final /* synthetic */ JSONObject a;

            a(JSONObject jSONObject) {
                this.a = jSONObject;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.a.onSuccess(this.a);
            }
        }

        f(POBNetworkListener pOBNetworkListener) {
            this.a = pOBNetworkListener;
        }

        public void a(JSONObject jSONObject) {
            if (this.a != null) {
                POBNetworkHandler.this.a(new a(jSONObject));
            }
        }

        @Override // com.android.volley.Response.Listener
        public /* bridge */ /* synthetic */ void onResponse(Object obj) {
            Logger.d("PubMatic|SafeDK: Execution> Lcom/pubmatic/sdk/common/network/POBNetworkHandler$f;->onResponse(Ljava/lang/Object;)V");
            CreativeInfoManager.onVolleyGetResponse(com.safedk.android.utils.h.F, this, obj);
            safedk_POBNetworkHandler$f_onResponse_334679e25feaf4b11c4b777184f6aedb(obj);
        }

        public void safedk_POBNetworkHandler$f_onResponse_334679e25feaf4b11c4b777184f6aedb(Object p0) {
            a((JSONObject) p0);
        }
    }

    class g extends JsonObjectRequest {
        final /* synthetic */ POBHttpRequest a;
        final /* synthetic */ POBNetworkResultListener b;

        class a implements Runnable {
            final /* synthetic */ POBNetworkResult a;

            a(POBNetworkResult pOBNetworkResult) {
                this.a = pOBNetworkResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.b.onResult(this.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(int i, String str, JSONObject jSONObject, Response.Listener listener, Response.ErrorListener errorListener, POBHttpRequest pOBHttpRequest, POBNetworkResultListener pOBNetworkResultListener) {
            super(i, str, jSONObject, listener, errorListener);
            this.a = pOBHttpRequest;
            this.b = pOBNetworkResultListener;
        }

        @Override // com.android.volley.toolbox.JsonRequest, com.android.volley.Request
        public byte[] getBody() {
            if (this.a.getPostData() == null) {
                return null;
            }
            return this.a.getPostData().getBytes(StandardCharsets.UTF_8);
        }

        @Override // com.android.volley.Request
        public Map getHeaders() {
            return this.a.getHeaders();
        }

        @Override // com.android.volley.toolbox.JsonObjectRequest, com.android.volley.toolbox.JsonRequest, com.android.volley.Request
        protected Response parseNetworkResponse(NetworkResponse networkResponse) {
            try {
                JSONObject jSONObject = new JSONObject(new String(networkResponse.data, HttpHeaderParser.parseCharset(networkResponse.headers, B5.O)));
                if (this.b != null) {
                    Map map = networkResponse.headers;
                    if (map == null) {
                        map = new HashMap();
                    }
                    POBNetworkHandler.this.a(new a(new POBNetworkResult(map, networkResponse.networkTimeMs)));
                }
                return Response.success(jSONObject, HttpHeaderParser.parseCacheHeaders(networkResponse));
            } catch (UnsupportedEncodingException | JSONException unused) {
                return Response.error(new ParseError(networkResponse));
            }
        }
    }

    class h implements RequestQueue.RequestFilter {
        final /* synthetic */ String a;

        h(String str) {
            this.a = str;
        }

        @Override // com.android.volley.RequestQueue.RequestFilter
        public boolean apply(Request request) {
            if (!this.a.equals(request.getTag())) {
                return false;
            }
            POBLog.debug(POBNetworkHandler.TAG, "Cancelled volley Ad Request for Tag <" + this.a + "> ", new Object[0]);
            return true;
        }
    }

    class i implements Response.ErrorListener {
        final /* synthetic */ POBNetworkResultListener a;
        final /* synthetic */ POBHttpRequest b;
        final /* synthetic */ POBNetworkListener c;
        final /* synthetic */ POBNetworkRedirectListener d;

        class a implements Runnable {
            final /* synthetic */ POBNetworkResult a;

            a(POBNetworkResult pOBNetworkResult) {
                this.a = pOBNetworkResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.a.onResult(this.a);
            }
        }

        class b implements Runnable {
            final /* synthetic */ POBError a;

            b(POBError pOBError) {
                this.a = pOBError;
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.c.onFailure(this.a);
            }
        }

        class c implements Runnable {
            final /* synthetic */ POBError a;

            c(POBError pOBError) {
                this.a = pOBError;
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.c.onFailure(this.a);
            }
        }

        i(POBNetworkResultListener pOBNetworkResultListener, POBHttpRequest pOBHttpRequest, POBNetworkListener pOBNetworkListener, POBNetworkRedirectListener pOBNetworkRedirectListener) {
            this.a = pOBNetworkResultListener;
            this.b = pOBHttpRequest;
            this.c = pOBNetworkListener;
            this.d = pOBNetworkRedirectListener;
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            if (this.a != null) {
                NetworkResponse a2 = POBNetworkHandler.this.a(volleyError, this.b);
                Map map = a2.headers;
                if (map == null) {
                    map = new HashMap();
                }
                POBNetworkHandler.this.a(new a(new POBNetworkResult(map, a2.networkTimeMs)));
            }
            if (this.c != null) {
                try {
                    POBHttpRequest a3 = POBNetworkHandler.this.a(volleyError, this.b, this.d);
                    if (a3 != null) {
                        POBNetworkHandler.this.sendRequest(a3, this.c);
                    } else {
                        POBNetworkHandler.this.a(new b(POBNetworkHandler.this.a(volleyError)));
                    }
                } catch (VolleyError e) {
                    POBNetworkHandler.this.a(new c(POBNetworkHandler.this.a(e)));
                }
            }
        }
    }

    class j implements Response.ErrorListener {
        final /* synthetic */ POBNetworkResultListener a;
        final /* synthetic */ POBHttpRequest b;
        final /* synthetic */ POBNetworkRedirectListener c;
        final /* synthetic */ POBNetworkListener d;

        class a implements Runnable {
            final /* synthetic */ POBNetworkResult a;

            a(POBNetworkResult pOBNetworkResult) {
                this.a = pOBNetworkResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                j.this.a.onResult(this.a);
            }
        }

        class b implements Runnable {
            final /* synthetic */ POBError a;

            b(POBError pOBError) {
                this.a = pOBError;
            }

            @Override // java.lang.Runnable
            public void run() {
                j.this.d.onFailure(this.a);
            }
        }

        class c implements Runnable {
            final /* synthetic */ POBError a;

            c(POBError pOBError) {
                this.a = pOBError;
            }

            @Override // java.lang.Runnable
            public void run() {
                j.this.d.onFailure(this.a);
            }
        }

        j(POBNetworkResultListener pOBNetworkResultListener, POBHttpRequest pOBHttpRequest, POBNetworkRedirectListener pOBNetworkRedirectListener, POBNetworkListener pOBNetworkListener) {
            this.a = pOBNetworkResultListener;
            this.b = pOBHttpRequest;
            this.c = pOBNetworkRedirectListener;
            this.d = pOBNetworkListener;
        }

        @Override // com.android.volley.Response.ErrorListener
        public void onErrorResponse(VolleyError volleyError) {
            if (this.a != null) {
                NetworkResponse a2 = POBNetworkHandler.this.a(volleyError, this.b);
                Map map = a2.headers;
                if (map == null) {
                    map = new HashMap();
                }
                POBNetworkHandler.this.a(new a(new POBNetworkResult(map, a2.networkTimeMs)));
            }
            try {
                POBHttpRequest a3 = POBNetworkHandler.this.a(volleyError, this.b, this.c);
                if (a3 != null) {
                    POBNetworkHandler.this.sendJSONRequest(a3, this.d);
                } else if (this.d != null) {
                    POBNetworkHandler.this.a(new b(POBNetworkHandler.this.a(volleyError)));
                }
            } catch (VolleyError e) {
                if (this.d != null) {
                    POBNetworkHandler.this.a(new c(POBNetworkHandler.this.a(e)));
                }
            }
        }
    }

    public POBNetworkHandler() {
        this(POBVolley.newRequestQueue(new BasicNetwork((BaseHttpStack) new HurlStack())));
    }

    private Response.ErrorListener b(POBHttpRequest pOBHttpRequest, POBNetworkListener pOBNetworkListener, POBNetworkRedirectListener pOBNetworkRedirectListener, POBNetworkResultListener pOBNetworkResultListener) {
        return new j(pOBNetworkResultListener, pOBHttpRequest, pOBNetworkRedirectListener, pOBNetworkListener);
    }

    private void c(POBHttpRequest pOBHttpRequest, POBNetworkListener pOBNetworkListener, POBNetworkRedirectListener pOBNetworkRedirectListener, POBNetworkResultListener pOBNetworkResultListener) {
        String url;
        int a2 = a(pOBHttpRequest.getRequestMethod());
        if (pOBHttpRequest.getRequestMethod() != POBHttpRequest.HTTP_METHOD.GET || POBUtils.isNullOrEmpty(pOBHttpRequest.getPostData())) {
            url = pOBHttpRequest.getUrl();
        } else {
            url = pOBHttpRequest.getUrl() + pOBHttpRequest.getPostData();
        }
        g gVar = new g(a2, url, null, new f(pOBNetworkListener), b(pOBHttpRequest, pOBNetworkListener, pOBNetworkRedirectListener, pOBNetworkResultListener), pOBHttpRequest, pOBNetworkResultListener);
        a(pOBHttpRequest, gVar);
        a(gVar, pOBHttpRequest.getRequestTag());
    }

    public void cancelRequest(@NonNull String str) {
        POBRequestQueue pOBRequestQueue = this.a;
        if (pOBRequestQueue != null) {
            pOBRequestQueue.cancelAll((RequestQueue.RequestFilter) new h(str));
        }
    }

    @Nullable
    public POBThreadExecutor getThreadExecutor() {
        return this.b;
    }

    public void sendImageRequest(@Nullable POBImageRequest pOBImageRequest, @Nullable POBImageNetworkListener<String> pOBImageNetworkListener) {
        if (pOBImageRequest == null || pOBImageRequest.getUrl() == null) {
            if (pOBImageNetworkListener != null) {
                pOBImageNetworkListener.onFailure(new POBError(1001, "Request parameter or URL is null."));
            }
        } else {
            ImageRequest imageRequest = new ImageRequest(pOBImageRequest.getUrl(), new d(pOBImageNetworkListener), pOBImageRequest.getMaxWidth(), pOBImageRequest.getMaxHeight(), pOBImageRequest.getScaleType(), pOBImageRequest.getDecodeConfig(), new e(pOBImageNetworkListener));
            a(pOBImageRequest, imageRequest);
            a(imageRequest, pOBImageRequest.getRequestTag());
        }
    }

    public void sendJSONRequest(POBHttpRequest pOBHttpRequest, @Nullable POBNetworkListener<JSONObject> pOBNetworkListener) {
        c(pOBHttpRequest, pOBNetworkListener, null, null);
    }

    public void sendRequest(@NonNull String str, @Nullable String str2, POBNetworkListener<String> pOBNetworkListener, @Nullable POBNetworkRedirectListener pOBNetworkRedirectListener) {
        POBHttpRequest pOBHttpRequest = new POBHttpRequest();
        pOBHttpRequest.setUrl(str);
        pOBHttpRequest.setRequestTag(str2);
        sendRequest(pOBHttpRequest, pOBNetworkListener, pOBNetworkRedirectListener);
    }

    public POBNetworkHandler(@NonNull POBRequestQueue pOBRequestQueue) {
        this.a = pOBRequestQueue;
    }

    private boolean b(VolleyError volleyError) {
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse == null) {
            return false;
        }
        int i2 = networkResponse.statusCode;
        return 301 == i2 || i2 == 302 || i2 == 303;
    }

    public void sendJSONRequest(@NonNull POBHttpRequest pOBHttpRequest, @Nullable POBNetworkListener<JSONObject> pOBNetworkListener, @Nullable POBNetworkResultListener pOBNetworkResultListener) {
        c(pOBHttpRequest, pOBNetworkListener, null, pOBNetworkResultListener);
    }

    public POBNetworkHandler(@NonNull POBRequestQueue pOBRequestQueue, @NonNull POBThreadExecutor pOBThreadExecutor) {
        this.a = pOBRequestQueue;
        this.b = pOBThreadExecutor;
    }

    private void a(POBHttpRequest pOBHttpRequest, Request request) {
        if (pOBHttpRequest.getTimeout() > 0 || pOBHttpRequest.getRetryCount() > 0) {
            request.setRetryPolicy(new DefaultRetryPolicy(pOBHttpRequest.getTimeout(), pOBHttpRequest.getRetryCount(), pOBHttpRequest.getRetryBackoffMultiplier()));
        }
    }

    public void sendRequest(String str, String str2, POBNetworkListener<String> pOBNetworkListener) {
        sendRequest(str, str2, pOBNetworkListener, (POBNetworkRedirectListener) null);
    }

    public void sendRequest(POBHttpRequest pOBHttpRequest, POBNetworkListener<String> pOBNetworkListener) {
        sendRequest(pOBHttpRequest, pOBNetworkListener, (POBNetworkRedirectListener) null);
    }

    public void sendRequest(@Nullable POBHttpRequest pOBHttpRequest, @Nullable POBNetworkListener<String> pOBNetworkListener, @Nullable POBNetworkRedirectListener pOBNetworkRedirectListener) {
        sendRequest(pOBHttpRequest, pOBNetworkListener, pOBNetworkRedirectListener, (POBNetworkResultListener) null);
    }

    public void sendRequest(@Nullable POBHttpRequest pOBHttpRequest, @Nullable POBNetworkListener<String> pOBNetworkListener, @Nullable POBNetworkRedirectListener pOBNetworkRedirectListener, @Nullable POBNetworkResultListener pOBNetworkResultListener) {
        if (pOBHttpRequest == null || pOBHttpRequest.getUrl() == null || pOBHttpRequest.getRequestMethod() == null) {
            if (pOBNetworkListener != null) {
                pOBNetworkListener.onFailure(new POBError(1001, "Request parameter or URL is null."));
            }
        } else {
            c cVar = new c(this, a(pOBHttpRequest.getRequestMethod()), pOBHttpRequest.getUrl(), new a(pOBNetworkListener), a(pOBHttpRequest, pOBNetworkListener, pOBNetworkRedirectListener, pOBNetworkResultListener), pOBHttpRequest, pOBNetworkResultListener);
            a(pOBHttpRequest, cVar);
            a(cVar, pOBHttpRequest.getRequestTag());
        }
    }

    private void a(Request request, String str) {
        request.setTag(str);
        request.setShouldCache(false);
        this.a.add(request);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Runnable runnable) {
        POBThreadExecutor pOBThreadExecutor = this.b;
        if (pOBThreadExecutor != null) {
            pOBThreadExecutor.execute(runnable);
        } else {
            runnable.run();
        }
    }

    private int a(POBHttpRequest.HTTP_METHOD http_method) {
        int i2 = b.a[http_method.ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    return 0;
                }
            }
        }
        return i3;
    }

    private Response.ErrorListener a(POBHttpRequest pOBHttpRequest, POBNetworkListener pOBNetworkListener, POBNetworkRedirectListener pOBNetworkRedirectListener, POBNetworkResultListener pOBNetworkResultListener) {
        return new i(pOBNetworkResultListener, pOBHttpRequest, pOBNetworkListener, pOBNetworkRedirectListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public NetworkResponse a(VolleyError volleyError, POBHttpRequest pOBHttpRequest) {
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse == null) {
            networkResponse = new NetworkResponse(0, (byte[]) null, false, volleyError.getNetworkTimeMs(), (List<Header>) new ArrayList());
        }
        return networkResponse.networkTimeMs > ((long) pOBHttpRequest.getTimeout()) ? new NetworkResponse(networkResponse.statusCode, networkResponse.data, networkResponse.notModified, pOBHttpRequest.getTimeout(), networkResponse.allHeaders) : networkResponse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public POBError a(VolleyError volleyError) {
        int i2;
        String message = volleyError.getMessage() != null ? volleyError.getMessage() : "Unknown error message.";
        if (volleyError instanceof TimeoutError) {
            return new POBError(1005, message);
        }
        if (volleyError instanceof ParseError) {
            if (volleyError.networkResponse != null) {
                String str = "Parsing error with HTTP status code: " + volleyError.networkResponse.statusCode;
                if (volleyError.networkResponse.statusCode == 204) {
                    return new POBError(1002, str);
                }
                return new POBError(1007, str);
            }
            return new POBError(1007, message);
        }
        NetworkResponse networkResponse = volleyError.networkResponse;
        if (networkResponse != null && (i2 = networkResponse.statusCode) >= 500 && i2 < 600) {
            return new POBError(1004, message);
        }
        return new POBError(1006, message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public POBHttpRequest a(VolleyError volleyError, POBHttpRequest pOBHttpRequest, POBNetworkRedirectListener pOBNetworkRedirectListener) {
        if (!b(volleyError)) {
            return null;
        }
        Map<String, String> map = volleyError.networkResponse.headers;
        String str = map != null ? map.get(NetworkUtils.HEADER_LOCATION) : null;
        if (str != null) {
            try {
                POBHttpRequest m6452clone = pOBHttpRequest.m6452clone();
                m6452clone.setUrl(str);
                if (pOBNetworkRedirectListener != null) {
                    POBHttpRequest onRedirect = pOBNetworkRedirectListener.onRedirect(m6452clone);
                    if (onRedirect != null) {
                        return onRedirect;
                    }
                }
                return m6452clone;
            } catch (CloneNotSupportedException e2) {
                throw new VolleyError(e2);
            }
        }
        throw new VolleyError("Location header does not exists for Redirection");
    }
}
