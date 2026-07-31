package com.smaato.sdk.ng.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.C4701ic;
import com.safedk.android.internal.partials.SmaatoNetworkBridge;
import com.smaato.sdk.ng.network.NGSDKHttpClient;
import com.smaato.sdk.ng.utils.Logger;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public class NGSDKHttpClient {
    private static final String a = "NGSDKHttpClient";
    private static final Handler b = new Handler(Looper.getMainLooper());
    private static final Queue<PendingRequest> c = new ArrayDeque();
    private static final Queue<PendingRequest> d = new ArrayDeque();

    public interface Listener {
        void onFailure(Throwable th);

        default void onFinally(String str, int i) {
        }

        void onSuccess(String str, Map<String, List<String>> map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class a {
        private int a;
        private String b;
        private Map<String, List<String>> c;
        private Exception d;

        private a() {
        }

        public int a() {
            return this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(String str, Map map, String str2, boolean z, boolean z2, final Listener listener, Context context) {
        final a a2 = a(str, map, str2);
        if (a2.d != null) {
            if (z && !TextUtils.isEmpty(str)) {
                c.add(new PendingRequest(str, str2, map, 5, 2));
            }
            if (z2) {
                b.post(new Runnable() { // from class: com.smaato.sdk.ng.network.NGSDKHttpClient$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        NGSDKHttpClient.a(NGSDKHttpClient.Listener.this, a2);
                    }
                });
            } else if (listener != null) {
                listener.onFailure(a2.d);
            }
        } else if (z2) {
            b.post(new Runnable() { // from class: com.smaato.sdk.ng.network.NGSDKHttpClient$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    NGSDKHttpClient.b(NGSDKHttpClient.Listener.this, a2);
                }
            });
        } else if (listener != null) {
            listener.onSuccess(a2.b, a2.c);
        }
        if (listener != null) {
            listener.onFinally(str, a2.a);
        }
        b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Listener listener, a aVar) {
        if (listener != null) {
            listener.onSuccess(aVar.b, aVar.c);
        }
    }

    public static synchronized void makePendingRequest(Context context, final PendingRequest pendingRequest) {
        synchronized (NGSDKHttpClient.class) {
            if (pendingRequest != null) {
                if (!pendingRequest.shouldRetry()) {
                    pendingRequest.countAttempt();
                    c.add(pendingRequest);
                    return;
                }
                NetworkInfo a2 = a(context);
                if (a2 != null && a2.isConnected() && (a2.getType() == 1 || a2.getType() == 0)) {
                    try {
                        ApiExecutor.getInstance().execute(new Runnable() { // from class: com.smaato.sdk.ng.network.NGSDKHttpClient$$ExternalSyntheticLambda3
                            @Override // java.lang.Runnable
                            public final void run() {
                                NGSDKHttpClient.a(PendingRequest.this);
                            }
                        });
                    } catch (RejectedExecutionException e) {
                        Logger.e(a, pendingRequest.getUrl(), e);
                    }
                }
            }
        }
    }

    public static void makeRequest(Context context, String str, Map<String, String> map, String str2, Listener listener) {
        makeRequest(context, str, map, str2, true, listener);
    }

    private static void b(Context context) {
        Queue<PendingRequest> queue = d;
        if (queue.isEmpty()) {
            Queue<PendingRequest> queue2 = c;
            if (!queue2.isEmpty()) {
                queue.addAll(queue2);
                queue2.clear();
            }
        }
        if (queue.isEmpty()) {
            return;
        }
        Iterator<PendingRequest> it = queue.iterator();
        while (it.hasNext()) {
            makePendingRequest(context, it.next());
        }
        d.clear();
    }

    public static void makeRequest(Context context, String str, Map<String, String> map, String str2, boolean z, Listener listener) {
        makeRequest(context, str, map, str2, z, false, listener);
    }

    public static void makeRequest(final Context context, final String str, final Map<String, String> map, final String str2, final boolean z, final boolean z2, final Listener listener) {
        NetworkInfo a2 = a(context);
        if (a2 == null || !a2.isConnected() || (a2.getType() != 1 && a2.getType() != 0)) {
            if (listener != null) {
                listener.onFailure(new Exception("{\"status\": \"error\", \"error_message\": \"Unable to connect to URL. No network connection.\"}"));
            }
        } else {
            try {
                ApiExecutor.getInstance().execute(new Runnable() { // from class: com.smaato.sdk.ng.network.NGSDKHttpClient$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        NGSDKHttpClient.a(str, map, str2, z2, z, listener, context);
                    }
                });
            } catch (RejectedExecutionException e) {
                Logger.e(a, str, e);
                listener.onFailure(new Exception("{\"status\": \"error\", \"error_message\": \"Unable to connect to URL. Too many requests.\"}"));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(Listener listener, a aVar) {
        if (listener != null) {
            listener.onFailure(aVar.d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.smaato.sdk.ng.network.NGSDKHttpClient$a-IA] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v5 */
    private static a a(String str, Map<String, String> map, String str2) {
        HttpURLConnection httpURLConnection;
        ?? r1 = 0;
        HttpURLConnection httpURLConnection2 = null;
        a aVar = new a();
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setRequestMethod(C4701ic.a);
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                DataOutputStream dataOutputStream = new DataOutputStream(SmaatoNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
                dataOutputStream.writeBytes(str2);
                dataOutputStream.flush();
                dataOutputStream.close();
            }
            int httpUrlConnectionGetResponseCode = SmaatoNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            aVar.a = httpUrlConnectionGetResponseCode;
            String.valueOf(aVar.a());
            if (a(httpUrlConnectionGetResponseCode)) {
                InputStream urlConnectionGetInputStream = SmaatoNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                aVar.b = a(urlConnectionGetInputStream);
                urlConnectionGetInputStream.close();
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                if (headerFields != null && !headerFields.isEmpty()) {
                    aVar.c = new HashMap(headerFields);
                }
            } else {
                aVar.d = new Exception(String.format(Locale.ENGLISH, "Network request failed with code: %s", Integer.valueOf(httpUrlConnectionGetResponseCode)));
            }
            SmaatoNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            return aVar;
        } catch (Exception e2) {
            e = e2;
            r1 = httpURLConnection;
            aVar.d = e;
            if (r1 != 0) {
                SmaatoNetworkBridge.httpUrlConnectionDisconnect(r1);
            }
            return aVar;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                SmaatoNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection2);
            }
            throw th;
        }
    }

    private static boolean a(int i) {
        return i / 100 == 2;
    }

    private static String a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toString("UTF-8");
            }
        }
    }

    private static NetworkInfo a(Context context) {
        if (context == null) {
            return null;
        }
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(PendingRequest pendingRequest) {
        pendingRequest.countRetry();
        if (a(pendingRequest.getUrl(), pendingRequest.getHeaders(), pendingRequest.getPostBody()).d == null || pendingRequest.isLimitReached() || TextUtils.isEmpty(pendingRequest.getUrl())) {
            return;
        }
        c.add(pendingRequest);
    }
}
