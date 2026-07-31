package net.pubnative.lite.sdk.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C4701ic;
import com.safedk.android.internal.partials.VerveNetworkBridge;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
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
import net.pubnative.lite.sdk.network.PNHttpClient;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes13.dex */
public class PNHttpClient {
    private static final int CONNECT_TIMEOUT = 10000;
    private static final int MAX_RETRIES = 5;
    private static final int READ_TIMEOUT = 10000;
    private static final int RETRY_MULTIPLIER = 2;
    private static final String TAG = "PNHttpClient";
    private static final Handler sUiHandler = new Handler(Looper.getMainLooper());
    private static final Queue<PendingRequest> sPendingRequests = new ArrayDeque();
    private static final Queue<PendingRequest> sCurrentRequests = new ArrayDeque();

    public interface Listener {
        void onFailure(Throwable th);

        default void onFinally(String str, int i) {
        }

        void onSuccess(String str, Map<String, List<String>> map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class Response {
        private Exception exception;
        private Map<String, List<String>> headers;
        private String response;
        private int responseCode;

        public Exception getException() {
            return this.exception;
        }

        public String getResponse() {
            return this.response;
        }

        public int getResponseCode() {
            return this.responseCode;
        }

        private Response() {
        }
    }

    private static NetworkInfo getActiveNetworkInfo(Context context) {
        if (context == null) {
            return null;
        }
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    private static String getStringFromStream(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private static boolean isHttpSuccess(int i) {
        return i / 100 == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$makePendingRequest$3(PendingRequest pendingRequest) {
        pendingRequest.countRetry();
        if (sendRequest(pendingRequest.getUrl(), pendingRequest.getHeaders(), pendingRequest.getPostBody()).exception == null || pendingRequest.isLimitReached() || TextUtils.isEmpty(pendingRequest.getUrl())) {
            return;
        }
        sPendingRequests.add(pendingRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$makeRequest$0(Listener listener, Response response) {
        if (listener != null) {
            listener.onFailure(response.exception);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$makeRequest$1(Listener listener, Response response) {
        if (listener != null) {
            listener.onSuccess(response.response, response.headers);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$makeRequest$2(String str, Map map, String str2, boolean z, boolean z2, final Listener listener, Context context) {
        final Response sendRequest = sendRequest(str, map, str2);
        if (sendRequest.exception != null) {
            if (z && !TextUtils.isEmpty(str)) {
                sPendingRequests.add(new PendingRequest(str, str2, map, 5, 2));
            }
            if (z2) {
                sUiHandler.post(new Runnable() { // from class: net.pubnative.lite.sdk.network.PNHttpClient$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        PNHttpClient.lambda$makeRequest$0(PNHttpClient.Listener.this, sendRequest);
                    }
                });
            } else if (listener != null) {
                listener.onFailure(sendRequest.exception);
            }
        } else if (z2) {
            sUiHandler.post(new Runnable() { // from class: net.pubnative.lite.sdk.network.PNHttpClient$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    PNHttpClient.lambda$makeRequest$1(PNHttpClient.Listener.this, sendRequest);
                }
            });
        } else if (listener != null) {
            listener.onSuccess(sendRequest.response, sendRequest.headers);
        }
        if (listener != null) {
            listener.onFinally(str, sendRequest.responseCode);
        }
        performPendingRequests(context);
    }

    public static synchronized void makePendingRequest(Context context, final PendingRequest pendingRequest) {
        synchronized (PNHttpClient.class) {
            if (pendingRequest != null) {
                if (!pendingRequest.shouldRetry()) {
                    pendingRequest.countAttempt();
                    sPendingRequests.add(pendingRequest);
                    return;
                }
                NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && (activeNetworkInfo.getType() == 1 || activeNetworkInfo.getType() == 0)) {
                    try {
                        ApiExecutor.getInstance().execute(new Runnable() { // from class: net.pubnative.lite.sdk.network.PNHttpClient$$ExternalSyntheticLambda3
                            @Override // java.lang.Runnable
                            public final void run() {
                                PNHttpClient.lambda$makePendingRequest$3(PendingRequest.this);
                            }
                        });
                    } catch (RejectedExecutionException e) {
                        Logger.e(TAG, pendingRequest.getUrl(), e);
                    }
                }
            }
        }
    }

    public static void makeRequest(Context context, String str, Map<String, String> map, String str2, Listener listener) {
        makeRequest(context, str, map, str2, true, listener);
    }

    private static void performPendingRequests(Context context) {
        Queue<PendingRequest> queue = sCurrentRequests;
        if (queue.isEmpty()) {
            Queue<PendingRequest> queue2 = sPendingRequests;
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
        sCurrentRequests.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [net.pubnative.lite.sdk.network.PNHttpClient$1] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    private static Response sendRequest(String str, Map<String, String> map, String str2) {
        HttpURLConnection httpURLConnection;
        ?? r1 = 0;
        r1 = 0;
        Response response = new Response();
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
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
                DataOutputStream dataOutputStream = new DataOutputStream(VerveNetworkBridge.urlConnectionGetOutputStream(httpURLConnection));
                dataOutputStream.writeBytes(str2);
                dataOutputStream.flush();
                dataOutputStream.close();
            }
            int httpUrlConnectionGetResponseCode = VerveNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
            response.responseCode = httpUrlConnectionGetResponseCode;
            Log.d("Response Code: ", String.valueOf(response.getResponseCode()));
            if (isHttpSuccess(httpUrlConnectionGetResponseCode)) {
                InputStream urlConnectionGetInputStream = VerveNetworkBridge.urlConnectionGetInputStream(httpURLConnection);
                response.response = getStringFromStream(urlConnectionGetInputStream);
                urlConnectionGetInputStream.close();
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                if (headerFields != null && !headerFields.isEmpty()) {
                    response.headers = new HashMap(headerFields);
                }
            } else {
                response.exception = new Exception(String.format(Locale.ENGLISH, "Network request failed with code: %s", Integer.valueOf(httpUrlConnectionGetResponseCode)));
            }
            VerveNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
            return response;
        } catch (Exception e2) {
            e = e2;
            r1 = httpURLConnection;
            response.exception = e;
            if (r1 != 0) {
                VerveNetworkBridge.httpUrlConnectionDisconnect(r1);
            }
            return response;
        } catch (Throwable th2) {
            th = th2;
            r1 = httpURLConnection;
            if (r1 != 0) {
                VerveNetworkBridge.httpUrlConnectionDisconnect(r1);
            }
            throw th;
        }
    }

    public static void makeRequest(Context context, String str, Map<String, String> map, String str2, boolean z, Listener listener) {
        makeRequest(context, str, map, str2, z, false, listener);
    }

    public static void makeRequest(final Context context, final String str, final Map<String, String> map, final String str2, final boolean z, final boolean z2, final Listener listener) {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || (activeNetworkInfo.getType() != 1 && activeNetworkInfo.getType() != 0)) {
            if (listener != null) {
                listener.onFailure(new Exception("{\"status\": \"error\", \"error_message\": \"Unable to connect to URL. No network connection.\"}"));
            }
        } else {
            try {
                ApiExecutor.getInstance().execute(new Runnable() { // from class: net.pubnative.lite.sdk.network.PNHttpClient$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        PNHttpClient.lambda$makeRequest$2(str, map, str2, z2, z, listener, context);
                    }
                });
            } catch (RejectedExecutionException e) {
                Logger.e(TAG, str, e);
                listener.onFailure(new Exception("{\"status\": \"error\", \"error_message\": \"Unable to connect to URL. Too many requests.\"}"));
            }
        }
    }
}
