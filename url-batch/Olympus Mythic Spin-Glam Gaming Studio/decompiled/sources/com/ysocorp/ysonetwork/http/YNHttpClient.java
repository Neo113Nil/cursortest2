package com.ysocorp.ysonetwork.http;

import com.ysocorp.ysonetwork.YNManager;
import com.ysocorp.ysonetwork.enums.YNEnumInitializationStatus;
import com.ysocorp.ysonetwork.http.YNHttpClient;
import com.ysocorp.ysonetwork.http.callbacks.YNFileRequestCallback;
import com.ysocorp.ysonetwork.http.callbacks.YNRequestCallback;
import com.ysocorp.ysonetwork.utils.YNLog;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class YNHttpClient {
    private static final String CRONET_EXPERIMENTAL_OPTIONS = "{\"AsyncDNS\":{\"enable\":true}}";
    private static final int DEFAULT_DOWNLOAD_TIMEOUT = 10000;
    private static final int MAX_QUIC_HINT_ENGINES = 10;
    private static final int QUIC_DOWNLOAD_ATTEMPTS = 2;
    private static final int QUIC_TRACK_ATTEMPTS = 2;
    private static final int TOTAL_DOWNLOAD_ATTEMPTS = 3;
    private static final int TOTAL_TRACK_ATTEMPTS = 5;
    private static final YNHttpClient instance = new YNHttpClient();
    private CronetEngine cronetEngineHttp2;
    private CronetEngine cronetEngineQuic;
    private volatile YNEnumInitializationStatus initializationStatus;
    private final ConcurrentHashMap<String, Boolean> requestMap = new ConcurrentHashMap<>();
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    private final Object quicEnginesLock = new Object();
    private final LinkedHashMap<String, CronetEngine> quicEnginesByHost = new LinkedHashMap<>(16, 0.75f, true);
    private final Executor executor = Executors.newCachedThreadPool();

    public static YNHttpClient getInstance() {
        return instance;
    }

    private YNHttpClient() {
        this.initializationStatus = YNEnumInitializationStatus.NotInitialized;
        this.initializationStatus = YNEnumInitializationStatus.Initializing;
        try {
            this.cronetEngineQuic = buildCronetEngine(true, null);
            CronetEngine buildCronetEngine = buildCronetEngine(false, null);
            this.cronetEngineHttp2 = buildCronetEngine;
            if (this.cronetEngineQuic == null && buildCronetEngine == null) {
                this.initializationStatus = YNEnumInitializationStatus.Error;
                YNLog.Error("CronetEngine init failed: no engine available");
            } else {
                this.initializationStatus = YNEnumInitializationStatus.Initialized;
            }
        } catch (Throwable th) {
            YNLog.Error("CronetEngine init failed: " + th.getMessage());
            this.initializationStatus = YNEnumInitializationStatus.Error;
        }
    }

    private CronetEngine buildCronetEngine(boolean z, String str) {
        try {
            CronetEngine.Builder enableHttpCache = new CronetEngine.Builder(YNManager.mInitApplication).enableHttp2(true).enableQuic(z).enableBrotli(true).enableHttpCache(1, 33554432L);
            applyExperimentalOptionsIfSupported(enableHttpCache);
            if (z && str != null && !str.isEmpty()) {
                enableHttpCache.addQuicHint(str, 443, 443);
            }
            return enableHttpCache.build();
        } catch (Throwable th) {
            YNLog.Error("CronetEngine init failed: " + th.getMessage());
            return null;
        }
    }

    private void applyExperimentalOptionsIfSupported(CronetEngine.Builder builder) {
        try {
            builder.getClass().getMethod("setExperimentalOptions", String.class).invoke(builder, CRONET_EXPERIMENTAL_OPTIONS);
            YNLog.Info("CronetEngine experimental options applied");
        } catch (Throwable unused) {
            YNLog.Warning("CronetEngine experimental options not supported");
        }
    }

    private String extractHttpsHost(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                URI uri = new URI(str);
                String scheme = uri.getScheme();
                if (scheme != null && "https".equalsIgnoreCase(scheme)) {
                    return uri.getHost();
                }
            } catch (URISyntaxException unused) {
            }
        }
        return null;
    }

    private CronetEngine getQuicEngineForUrl(String str) {
        String extractHttpsHost = extractHttpsHost(str);
        if (extractHttpsHost == null || extractHttpsHost.isEmpty()) {
            return this.cronetEngineQuic;
        }
        synchronized (this.quicEnginesLock) {
            try {
                CronetEngine cronetEngine = this.quicEnginesByHost.get(extractHttpsHost);
                if (cronetEngine != null) {
                    return cronetEngine;
                }
                if (this.quicEnginesByHost.size() >= 10) {
                    YNLog.Warning("YNHttpClient QUIC hint limit reached, using default QUIC engine for host: " + extractHttpsHost);
                    return this.cronetEngineQuic;
                }
                CronetEngine buildCronetEngine = buildCronetEngine(true, extractHttpsHost);
                if (buildCronetEngine != null) {
                    this.quicEnginesByHost.put(extractHttpsHost, buildCronetEngine);
                    YNLog.Info("YNHttpClient QUIC hint engine created for host: " + extractHttpsHost);
                    return buildCronetEngine;
                }
                return this.cronetEngineQuic;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private CronetEngine getCronetEngine(boolean z, String str) {
        CronetEngine cronetEngine = this.cronetEngineHttp2;
        if (cronetEngine != null && (this.cronetEngineQuic == null || !z)) {
            return cronetEngine;
        }
        CronetEngine quicEngineForUrl = getQuicEngineForUrl(str);
        return quicEngineForUrl != null ? quicEngineForUrl : this.cronetEngineQuic;
    }

    public YNEnumInitializationStatus initializationStatus() {
        return this.initializationStatus;
    }

    public boolean isInitialized() {
        return initializationStatus() == YNEnumInitializationStatus.Initialized;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void downloadAndSaveToFile(JSONObject jSONObject, String str, String str2) throws IOException, InterruptedException, TimeoutException {
        if (!isInitialized()) {
            throw new IllegalStateException("YNHttpClient not initialized");
        }
        boolean z = false;
        boolean z2 = jSONObject == null || !jSONObject.has("quic") || jSONObject.optInt("quic", 0) == 1;
        int i = 10000;
        if (jSONObject != null && jSONObject.has("tre")) {
            i = jSONObject.optInt("tre", 10000);
        }
        Throwable e = null;
        int i2 = 1;
        while (i2 <= 3) {
            try {
                CronetEngine cronetEngine = getCronetEngine((!z2 || i2 > 2) ? z : true, str);
                if (cronetEngine == null) {
                    throw new IOException("YNHttpClient no CronetEngine available");
                }
                CountDownLatch countDownLatch = new CountDownLatch(1);
                YNFileRequestCallback buildFileRequestCallback = YNRequestCallback.buildFileRequestCallback(str2, str, countDownLatch);
                if (buildFileRequestCallback == null) {
                    YNLog.Error("YNHttpClient could not create file: " + str2);
                    throw new FileNotFoundException("YNHttpClient could not create file: " + str2);
                }
                UrlRequest build = cronetEngine.newUrlRequestBuilder(str, buildFileRequestCallback, this.executor).build();
                build.start();
                if (!countDownLatch.await(i, TimeUnit.MILLISECONDS)) {
                    build.cancel();
                    YNLog.Error("YNHttpClient request timed out");
                    throw new TimeoutException("HTTP request timed out");
                }
                String requestError = buildFileRequestCallback.getRequestError();
                if (requestError == null) {
                    return;
                }
                YNLog.Error("YNHttpClient request failed: " + requestError);
                throw new IOException("HTTP request failed");
            } catch (IOException e2) {
                e = e2;
                if (i2 >= 3) {
                    YNLog.Warning("YNHttpClient download failed (attempt " + i2 + "/3), retrying: " + e.getMessage());
                }
                i2++;
                z = false;
            } catch (TimeoutException e3) {
                e = e3;
                if (i2 >= 3) {
                }
                i2++;
                z = false;
            }
        }
        if (e instanceof TimeoutException) {
            throw ((TimeoutException) e);
        }
        if (e instanceof IOException) {
            throw ((IOException) e);
        }
        throw new IOException("HTTP request failed");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r0.optInt("quic", 0) == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void tryRequestTrackUrl(JSONObject jSONObject, String str, String str2, String str3, Boolean bool, Long l) throws IOException, JSONException {
        boolean z;
        JSONObject optJSONObject = jSONObject.optJSONObject("setting");
        if (optJSONObject != null && optJSONObject.has("quic")) {
            z = false;
        }
        z = true;
        StringBuilder sb = new StringBuilder(jSONObject.getString("trackUrl"));
        sb.append("&method=");
        sb.append(str);
        if (str2 != null && !str2.isEmpty()) {
            sb.append("&key=");
            sb.append(str2);
        }
        if (str3 != null && !str3.isEmpty()) {
            sb.append("&message=");
            sb.append(URLEncoder.encode(str3, "UTF-8"));
        }
        if (bool != null) {
            sb.append("&error=");
            sb.append(bool.booleanValue() ? "true" : "false");
        }
        if (l != null) {
            sb.append("&elapsedTime=");
            sb.append(l);
        }
        long currentTimeMillis = System.currentTimeMillis();
        sb.append("&timestamp=");
        sb.append(currentTimeMillis);
        String sb2 = sb.toString();
        if (this.requestMap.putIfAbsent(sb2, Boolean.TRUE) == null) {
            sendTrackRequest(sb2, 1, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendTrackRequest(String str, int i, boolean z) {
        if (!isInitialized()) {
            YNLog.Error("YNHttpClient not initialized");
            return;
        }
        CronetEngine cronetEngine = getCronetEngine(z && i <= 2, str);
        if (cronetEngine == null) {
            YNLog.Error("YNHttpClient no CronetEngine available");
        } else {
            cronetEngine.newUrlRequestBuilder(str, new AnonymousClass1(i, str, z), this.executor).build().start();
        }
    }

    /* renamed from: com.ysocorp.ysonetwork.http.YNHttpClient$1, reason: invalid class name */
    class AnonymousClass1 extends YNRequestCallback {
        final /* synthetic */ int val$attempt;
        final /* synthetic */ boolean val$preferQuic;
        final /* synthetic */ String val$url;

        @Override // org.chromium.net.UrlRequest.Callback
        public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        }

        AnonymousClass1(int i, String str, boolean z) {
            this.val$attempt = i;
            this.val$url = str;
            this.val$preferQuic = z;
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            int httpStatusCode = urlResponseInfo.getHttpStatusCode();
            if (httpStatusCode >= 400) {
                YNLog.Error("Track request failed (attempt " + this.val$attempt + "/5, status " + httpStatusCode + "): " + this.val$url);
                int i = this.val$attempt;
                if (i < 5) {
                    int pow = (int) Math.pow(1.33d, i);
                    ScheduledExecutorService scheduledExecutorService = YNHttpClient.this.scheduler;
                    final String str = this.val$url;
                    final int i2 = this.val$attempt;
                    final boolean z = this.val$preferQuic;
                    scheduledExecutorService.schedule(new Runnable() { // from class: com.ysocorp.ysonetwork.http.YNHttpClient$1$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            YNHttpClient.AnonymousClass1.this.lambda$onResponseStarted$0(str, i2, z);
                        }
                    }, pow, TimeUnit.SECONDS);
                } else {
                    YNLog.Error("Max retry reached for track URL: " + this.val$url);
                }
                urlRequest.cancel();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onResponseStarted$0(String str, int i, boolean z) {
            YNHttpClient.this.sendTrackRequest(str, i + 1, z);
        }

        @Override // org.chromium.net.UrlRequest.Callback
        public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
            YNLog.Error("Track request exception (attempt " + this.val$attempt + "/5): " + cronetException.getMessage());
            int i = this.val$attempt;
            if (i < 5) {
                int pow = (int) Math.pow(1.33d, i);
                ScheduledExecutorService scheduledExecutorService = YNHttpClient.this.scheduler;
                final String str = this.val$url;
                final int i2 = this.val$attempt;
                final boolean z = this.val$preferQuic;
                scheduledExecutorService.schedule(new Runnable() { // from class: com.ysocorp.ysonetwork.http.YNHttpClient$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        YNHttpClient.AnonymousClass1.this.lambda$onFailed$1(str, i2, z);
                    }
                }, pow, TimeUnit.SECONDS);
                return;
            }
            YNLog.Error("Max retry reached for track URL: " + this.val$url);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFailed$1(String str, int i, boolean z) {
            YNHttpClient.this.sendTrackRequest(str, i + 1, z);
        }
    }

    public void requestTrackUrl(JSONObject jSONObject, String str, String str2, String str3, Boolean bool, Long l) {
        try {
            tryRequestTrackUrl(jSONObject, str, str2, str3, bool, l);
        } catch (Exception e) {
            YNLog.Error("RequestTrackUrl::Error: " + e.getMessage());
        }
    }

    public void requestTrackUrl(String str, String str2, String str3, String str4, Boolean bool, Long l) {
        try {
            requestTrackUrl(new JSONObject(str), str2, str3, str4, bool, l);
        } catch (JSONException e) {
            YNLog.Error("RequestTrackUrlString::Error: " + e.getMessage());
        }
    }
}
