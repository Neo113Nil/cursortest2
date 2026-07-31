package com.ysocorp.ysonetwork;

import android.app.Activity;
import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.pubmatic.sdk.omsdk.POBOMSDKLogConstants;
import com.ysocorp.ysonetwork.YsoNetwork;
import com.ysocorp.ysonetwork.enums.YNEnumActionError;
import com.ysocorp.ysonetwork.enums.YNEnumInitializationStatus;
import com.ysocorp.ysonetwork.enums.YNEnumPlacementType;
import com.ysocorp.ysonetwork.enums.YNEnumRequestStatus;
import com.ysocorp.ysonetwork.http.YNHttpClient;
import com.ysocorp.ysonetwork.utils.YNFileManager;
import com.ysocorp.ysonetwork.utils.YNLog;
import com.ysocorp.ysonetwork.utils.YNQueue;
import com.ysocorp.ysonetwork.utils.YNUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class YNManager {
    private ScheduledFuture<?> requestObserverScheduledFuture;
    private static final YNManager instance = new YNManager();
    private static final AtomicBoolean mIsInitialized = new AtomicBoolean();
    public static Application mInitApplication = null;
    private static YNHttpClient mHttpClient = null;
    private final Map<String, YNQueue<YNRequest>> _requests = new ConcurrentHashMap();
    ScheduledExecutorService requestObserverScheduler = Executors.newScheduledThreadPool(1);

    @Deprecated
    public interface ActionDisplay extends YsoNetwork.ActionDisplay {
    }

    @Deprecated
    public interface ActionLoad extends YsoNetwork.ActionLoad {
    }

    public static class Identifiable {
        public String key = null;
        public String id = "";
        public YNEnumRequestStatus status = YNEnumRequestStatus.Free;
    }

    public static class YNRequest extends Identifiable {
        public YsoNetwork.ActionDisplay actionDisplay;
        public JSONObject data;
        public boolean isVisible;
        public String webViewState;
        public int nbWaitingAsset = 0;
        public boolean isWebViewDisplayed = false;
        public boolean isWebViewDestroyed = false;

        public YNRequest(String str) {
            this.key = str;
            this.id = YNUtils.generateRandomString(8);
        }
    }

    public static YNManager getInstance() {
        return instance;
    }

    private YNManager() {
    }

    private void stopRequestObserver() {
        ScheduledFuture<?> scheduledFuture = this.requestObserverScheduledFuture;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            return;
        }
        this.requestObserverScheduledFuture.cancel(true);
    }

    private void startRequestObserver(final YNRequest yNRequest, final YNEnumPlacementType yNEnumPlacementType, final String str, final Activity activity) {
        JSONObject optJSONObject;
        if (yNRequest != null && (optJSONObject = yNRequest.data.optJSONObject("setting")) != null && optJSONObject.has("rso") && optJSONObject.optInt("rso", 0) == 1) {
            YNLog.Info("[RequestObserver] :: req setting skip observing");
        } else {
            this.requestObserverScheduledFuture = this.requestObserverScheduler.scheduleWithFixedDelay(new Runnable() { // from class: com.ysocorp.ysonetwork.YNManager$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    YNManager.this.lambda$startRequestObserver$1(yNRequest, activity, yNEnumPlacementType, str);
                }
            }, 0L, 250L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRequestObserver$1(final YNRequest yNRequest, final Activity activity, final YNEnumPlacementType yNEnumPlacementType, final String str) {
        if (yNRequest != null && getInstance().getRequestById(yNRequest.key, yNRequest.id) != null) {
            YNLog.Info("[RequestObserver] :: req observing");
            if (yNRequest.isWebViewDestroyed) {
                YNLog.Info("[RequestObserver] :: req destroyed, reopening ad");
                yNRequest.isWebViewDestroyed = false;
                activity.runOnUiThread(new Runnable() { // from class: com.ysocorp.ysonetwork.YNManager$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        YNManager.lambda$startRequestObserver$0(activity, yNRequest, yNEnumPlacementType, str);
                    }
                });
                return;
            }
            return;
        }
        YNLog.Info("[RequestObserver] :: req is null, stop observing");
        stopRequestObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$startRequestObserver$0(Activity activity, YNRequest yNRequest, YNEnumPlacementType yNEnumPlacementType, String str) {
        new YNAdsDisplay(activity).show(yNRequest, yNEnumPlacementType, str);
    }

    private YNRequest initRequest(@NonNull String str) {
        YNRequest yNRequest = new YNRequest(str);
        YNQueue<YNRequest> yNQueue = this._requests.get(str);
        if (yNQueue == null) {
            yNQueue = new YNQueue<>();
            this._requests.put(str, yNQueue);
        }
        yNQueue.enqueue(yNRequest);
        YNLog.Info("[QUEUE] :: _InitRequest key = " + yNRequest.key + ", id = " + yNRequest.id + ", status = " + yNRequest.status);
        return yNRequest;
    }

    private YNRequest getRequestToShow(@NonNull String str) {
        YNEnumRequestStatus yNEnumRequestStatus;
        YNQueue<YNRequest> yNQueue = this._requests.get(str);
        if (yNQueue == null) {
            return null;
        }
        YNRequest peek = yNQueue.peek();
        if (peek != null && ((yNEnumRequestStatus = peek.status) == YNEnumRequestStatus.WillVisible || yNEnumRequestStatus == YNEnumRequestStatus.Visible)) {
            YNLog.Info("[QUEUE] :: _GetRequestToShow WillVisible || Visible, key = " + peek.key + ", id = " + peek.id + ", status = " + peek.status);
            deleteRequest(peek, "Get Request To Show");
        }
        yNQueue.moveFirstReadyElementToFront();
        YNRequest peek2 = yNQueue.peek();
        if (peek2 == null) {
            return null;
        }
        YNLog.Info("[QUEUE] :: _GetRequestToShow, key = " + peek2.key + ", id = " + peek2.id + ", status = " + peek2.status);
        return peek2;
    }

    public YNRequest getRequestById(@NonNull String str, String str2) {
        YNRequest elementById;
        YNQueue<YNRequest> yNQueue = this._requests.get(str);
        if (yNQueue == null || (elementById = yNQueue.getElementById(str2)) == null) {
            return null;
        }
        YNLog.Info("[QUEUE] :: _GetRequestById key = " + elementById.key + ", id = " + elementById.id + ", status = " + elementById.status);
        return elementById;
    }

    public void deleteRequest(@NonNull YNRequest yNRequest, String str) {
        YNQueue<YNRequest> yNQueue = this._requests.get(yNRequest.key);
        if (yNQueue != null) {
            yNQueue.dequeueElement(yNRequest);
            YNFileManager.getInstance().deleteDirectory(yNRequest.id + "-" + yNRequest.key);
            YNLog.Info("[QUEUE] :: _DeleteRequest from = " + str + ", key = " + yNRequest.key + ", id = " + yNRequest.id + ", status = " + yNRequest.status);
        }
    }

    private void doActionLoad(YsoNetwork.ActionLoad actionLoad, Exception exc) {
        if (exc == null) {
            YNLog.Info("[Load] :: OK");
            actionLoad.onLoad(YNEnumActionError.None);
            return;
        }
        try {
            throw exc;
        } catch (IOException e) {
            if (Objects.equals(e.getMessage(), "HTTP request failed")) {
                YNLog.Error("[Load] :: Error :: Server");
                actionLoad.onLoad(YNEnumActionError.Server);
            } else {
                YNLog.Error("[Load] :: Error :: Load");
                actionLoad.onLoad(YNEnumActionError.Load);
            }
        } catch (TimeoutException unused) {
            YNLog.Error("[Load] :: Error :: Timeout");
            actionLoad.onLoad(YNEnumActionError.Timeout);
        } catch (JSONException unused2) {
            YNLog.Error("[Load] :: Error :: InvalidConfig");
            actionLoad.onLoad(YNEnumActionError.InvalidConfig);
        } catch (Exception e2) {
            YNLog.Error("[Load] :: Error :: Internal, Exception: " + e2.getClass().getName());
            actionLoad.onLoad(YNEnumActionError.Internal);
        }
    }

    private void createFileFromUrl(final YNRequest yNRequest, String str, final String str2, final YsoNetwork.ActionLoad actionLoad, final long j, final ExecutorService executorService, final JSONObject jSONObject) {
        yNRequest.nbWaitingAsset++;
        final String fileTmp = YNFileManager.getInstance().getFileTmp(yNRequest.id + "-" + yNRequest.key, str);
        executorService.submit(new Runnable() { // from class: com.ysocorp.ysonetwork.YNManager$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                YNManager.this.lambda$createFileFromUrl$2(jSONObject, str2, fileTmp, yNRequest, actionLoad, j, executorService);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createFileFromUrl$2(JSONObject jSONObject, String str, String str2, YNRequest yNRequest, YsoNetwork.ActionLoad actionLoad, long j, ExecutorService executorService) {
        try {
            mHttpClient.downloadAndSaveToFile(jSONObject, str, str2);
            e = null;
        } catch (Exception e) {
            e = e;
        }
        int i = yNRequest.nbWaitingAsset - 1;
        yNRequest.nbWaitingAsset = i;
        if (e == null) {
            if (i == 0 && yNRequest.status == YNEnumRequestStatus.Loading) {
                yNRequest.status = YNEnumRequestStatus.Ready;
                doActionLoad(actionLoad, null);
                mHttpClient.requestTrackUrl(yNRequest.data, "Load", "END", (String) null, Boolean.FALSE, Long.valueOf(System.currentTimeMillis() - j));
                YNLog.Info("[Load] :: Assets Downloaded : time = " + (System.currentTimeMillis() - j) + "ms");
                return;
            }
            return;
        }
        if (yNRequest.status == YNEnumRequestStatus.Loading) {
            YNLog.Error("[Load] :: Assets Download Error : " + e.getMessage() + ", time = " + (System.currentTimeMillis() - j) + "ms");
            yNRequest.status = YNEnumRequestStatus.Error;
            executorService.shutdownNow();
            doActionLoad(actionLoad, e);
            mHttpClient.requestTrackUrl(yNRequest.data, "Load", "END", e.getMessage(), Boolean.TRUE, Long.valueOf(System.currentTimeMillis() - j));
            deleteRequest(yNRequest, "Load Assets Download Error");
        }
    }

    private void downloadAssetsLegacy(YNRequest yNRequest, long j, YsoNetwork.ActionLoad actionLoad, JSONObject jSONObject, JSONObject jSONObject2, Iterator<String> it, int i) throws JSONException, InterruptedException, TimeoutException {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1);
        createFileFromUrl(yNRequest, "index.html", yNRequest.data.getString("url"), actionLoad, j, newFixedThreadPool, jSONObject);
        while (it.hasNext()) {
            String next = it.next();
            createFileFromUrl(yNRequest, next, jSONObject2.getString(next), actionLoad, j, newFixedThreadPool, jSONObject);
        }
        newFixedThreadPool.shutdown();
        if (newFixedThreadPool.awaitTermination(i, TimeUnit.MILLISECONDS) || yNRequest.status != YNEnumRequestStatus.Loading) {
            return;
        }
        yNRequest.status = YNEnumRequestStatus.Error;
        newFixedThreadPool.shutdownNow();
        throw new TimeoutException("Assets Download Timeout");
    }

    @RequiresApi
    private CompletableFuture<?> makeFuture(final ArrayList<CompletableFuture<?>> arrayList, final int i, final JSONObject jSONObject, final String str, final String str2) {
        return CompletableFuture.runAsync(new Runnable() { // from class: com.ysocorp.ysonetwork.YNManager$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                YNManager.lambda$makeFuture$3(jSONObject, str, str2, arrayList, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$makeFuture$3(JSONObject jSONObject, String str, String str2, ArrayList arrayList, int i) {
        try {
            mHttpClient.downloadAndSaveToFile(jSONObject, str, str2);
        } catch (Exception e) {
            if (arrayList.get(i) != null) {
                ((CompletableFuture) arrayList.get(i)).completeExceptionally(e);
            }
        }
    }

    @RequiresApi
    private void downloadAssetsAndroid24(final YNRequest yNRequest, final long j, final YsoNetwork.ActionLoad actionLoad, JSONObject jSONObject, JSONObject jSONObject2, Iterator<String> it, int i) throws JSONException, InterruptedException, ExecutionException, TimeoutException {
        ArrayList<CompletableFuture<?>> arrayList = new ArrayList<>(jSONObject2.length() + 1);
        arrayList.add(0, makeFuture(arrayList, 0, jSONObject, yNRequest.data.getString("url"), YNFileManager.getInstance().getFileTmp(yNRequest.id + "-" + yNRequest.key, "index.html")));
        int i2 = 1;
        while (it.hasNext()) {
            String next = it.next();
            arrayList.add(i2, makeFuture(arrayList, i2, jSONObject, jSONObject2.getString(next), YNFileManager.getInstance().getFileTmp(yNRequest.id + "-" + yNRequest.key, next)));
            i2++;
        }
        final CompletableFuture<Void> allOf = CompletableFuture.allOf((CompletableFuture[]) arrayList.toArray(new CompletableFuture[0]));
        allOf.thenRun(new Runnable() { // from class: com.ysocorp.ysonetwork.YNManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                YNManager.this.lambda$downloadAssetsAndroid24$4(yNRequest, actionLoad, j);
            }
        }).exceptionally(new Function() { // from class: com.ysocorp.ysonetwork.YNManager$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Void lambda$downloadAssetsAndroid24$5;
                lambda$downloadAssetsAndroid24$5 = YNManager.this.lambda$downloadAssetsAndroid24$5(yNRequest, j, allOf, actionLoad, (Throwable) obj);
                return lambda$downloadAssetsAndroid24$5;
            }
        });
        try {
            allOf.get(i, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            if (yNRequest.status != YNEnumRequestStatus.Loading) {
                return;
            }
            yNRequest.status = YNEnumRequestStatus.Error;
            allOf.cancel(true);
            throw new TimeoutException("Assets Download Timeout");
        } catch (Exception e) {
            if (yNRequest.status != YNEnumRequestStatus.Loading) {
                return;
            }
            yNRequest.status = YNEnumRequestStatus.Error;
            allOf.cancel(true);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$downloadAssetsAndroid24$4(YNRequest yNRequest, YsoNetwork.ActionLoad actionLoad, long j) {
        if (yNRequest.status == YNEnumRequestStatus.Loading) {
            yNRequest.status = YNEnumRequestStatus.Ready;
            doActionLoad(actionLoad, null);
            mHttpClient.requestTrackUrl(yNRequest.data, "Load", "END", (String) null, Boolean.FALSE, Long.valueOf(System.currentTimeMillis() - j));
            YNLog.Info("[Load] :: Assets Downloaded : time = " + (System.currentTimeMillis() - j) + "ms");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void lambda$downloadAssetsAndroid24$5(YNRequest yNRequest, long j, CompletableFuture completableFuture, YsoNetwork.ActionLoad actionLoad, Throwable th) {
        if (yNRequest.status != YNEnumRequestStatus.Loading) {
            return null;
        }
        YNLog.Error("[Load] :: Assets Download Error : " + th.getMessage() + ", time = " + (System.currentTimeMillis() - j) + "ms");
        yNRequest.status = YNEnumRequestStatus.Error;
        completableFuture.cancel(true);
        doActionLoad(actionLoad, (Exception) th.getCause());
        mHttpClient.requestTrackUrl(yNRequest.data, "Load", "END", th.getMessage(), Boolean.TRUE, Long.valueOf(System.currentTimeMillis() - j));
        deleteRequest(yNRequest, "Load Assets Download Error");
        return null;
    }

    private void downloadAssets(YNRequest yNRequest, long j, YsoNetwork.ActionLoad actionLoad) throws JSONException, InterruptedException, ExecutionException, TimeoutException {
        JSONObject optJSONObject = yNRequest.data.optJSONObject("setting");
        int i = 30000;
        if (optJSONObject != null && optJSONObject.has("tlo")) {
            i = optJSONObject.optInt("tlo", 30000);
        }
        JSONObject jSONObject = yNRequest.data.getJSONObject("assets");
        downloadAssetsAndroid24(yNRequest, j, actionLoad, optJSONObject, jSONObject, jSONObject.keys(), i);
    }

    private static String requestDecryptJsonString(String str) {
        YNLog.Info("[Load] :: _RequestDecryptJsonString :: Json String :: " + str);
        String ungzipString = YNUtils.ungzipString(YNUtils.replaceGzipYsoCharsIfNeeded(str));
        if (ungzipString != null) {
            YNLog.Info("[Load] :: _RequestDecryptJsonString :: Decompressed Json String :: " + ungzipString);
            str = ungzipString;
        } else {
            YNLog.Warning("[Load] :: _RequestDecryptJsonString :: Decompression failed");
        }
        try {
            str = YNUtils.decryptString(str, "$#!<-({ysonetwork})->!#$");
            String ungzipString2 = YNUtils.ungzipString(YNUtils.replaceGzipYsoCharsIfNeeded(str));
            if (ungzipString2 != null) {
                YNLog.Info("[Load] :: _RequestDecryptJsonString :: Decrypted Decompressed Json String :: " + ungzipString2);
                str = ungzipString2;
            } else {
                YNLog.Warning("[Load] :: _RequestDecryptJsonString :: Decrypted Decompression failed");
            }
        } catch (Exception unused) {
            YNLog.Warning("[Load] :: _RequestDecryptJsonString :: Decryption failed");
        }
        YNLog.Info("[Load] :: _RequestDecryptJsonString :: Decrypted Json String :: " + str);
        return str;
    }

    private boolean requestCheck(JSONObject jSONObject) {
        try {
            if (jSONObject.has("url") && (jSONObject.get("url") instanceof String)) {
                if (jSONObject.has("assets") && (jSONObject.get("assets") instanceof JSONObject)) {
                    if (jSONObject.has("config") && (jSONObject.get("config") instanceof JSONObject)) {
                        return true;
                    }
                    YNLog.Warning("[Load] :: JSON missing config");
                    return false;
                }
                YNLog.Warning("[Load] :: JSON missing assets");
                return false;
            }
            YNLog.Warning("[Load] :: JSON missing url");
            return false;
        } catch (JSONException e) {
            YNLog.Warning("[Load] :: JSON missing config " + e.getMessage());
            return false;
        }
    }

    public static void initialize(Application application) throws Exception {
        if (mIsInitialized.compareAndSet(false, true)) {
            YNLog.Info("[SDK] :: Initialize :: Initializing");
            try {
                mInitApplication = application;
                mHttpClient = YNHttpClient.getInstance();
                YNFileManager.getInstance().deleteAndCreateRootDirectory();
                return;
            } catch (Exception e) {
                mIsInitialized.set(false);
                YNLog.Error("[SDK] :: Initialize :: Error :: " + e.getMessage());
                throw new Exception("Initialize Error");
            }
        }
        YNLog.Info("[SDK] :: Initialize :: Already Initializing");
    }

    public static YNEnumInitializationStatus initializationStatus() {
        AtomicBoolean atomicBoolean = mIsInitialized;
        if (atomicBoolean.get()) {
            int i = AnonymousClass1.$SwitchMap$com$ysocorp$ysonetwork$enums$YNEnumInitializationStatus[mHttpClient.initializationStatus().ordinal()];
            if (i == 1) {
                YNLog.Info("[SDK] :: Initialization Status :: Initialized");
                return YNEnumInitializationStatus.Initialized;
            }
            if (i == 2) {
                YNLog.Info("[SDK] :: Initialization Status :: Initializing");
                return YNEnumInitializationStatus.Initializing;
            }
            if (i == 3) {
                atomicBoolean.set(false);
                YNLog.Info("[SDK] :: Initialization Status :: Error");
                return YNEnumInitializationStatus.Error;
            }
        }
        YNLog.Info("[SDK] :: Initialization Status :: Not Initialized");
        return YNEnumInitializationStatus.NotInitialized;
    }

    /* renamed from: com.ysocorp.ysonetwork.YNManager$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ysocorp$ysonetwork$enums$YNEnumInitializationStatus;

        static {
            int[] iArr = new int[YNEnumInitializationStatus.values().length];
            $SwitchMap$com$ysocorp$ysonetwork$enums$YNEnumInitializationStatus = iArr;
            try {
                iArr[YNEnumInitializationStatus.Initialized.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ysocorp$ysonetwork$enums$YNEnumInitializationStatus[YNEnumInitializationStatus.Initializing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ysocorp$ysonetwork$enums$YNEnumInitializationStatus[YNEnumInitializationStatus.Error.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static boolean isInitialized() {
        return initializationStatus() == YNEnumInitializationStatus.Initialized;
    }

    public static void destroy() {
        YNLog.Info("[SDK] :: Destroy");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [long] */
    /* JADX WARN: Type inference failed for: r14v3, types: [com.ysocorp.ysonetwork.YNManager] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x010d -> B:10:0x018f). Please report as a decompilation issue!!! */
    public static void load(String str, String str2, YsoNetwork.ActionLoad actionLoad) {
        String str3 = "ms";
        YNLog.Info("[Load] :: Request : key = " + str);
        long currentTimeMillis = System.currentTimeMillis();
        String requestDecryptJsonString = requestDecryptJsonString(str2);
        mHttpClient.requestTrackUrl(requestDecryptJsonString, "Load", POBOMSDKLogConstants.MSG_OMSDK_START_EVENT, (String) null, (Boolean) null, (Long) null);
        if (isInitialized()) {
            YNRequest initRequest = getInstance().initRequest(str);
            YNEnumRequestStatus yNEnumRequestStatus = initRequest.status;
            YNEnumRequestStatus yNEnumRequestStatus2 = YNEnumRequestStatus.Loading;
            if (yNEnumRequestStatus != yNEnumRequestStatus2) {
                initRequest.status = yNEnumRequestStatus2;
            }
            try {
                initRequest.data = new JSONObject(requestDecryptJsonString);
                if (getInstance().requestCheck(initRequest.data)) {
                    YNFileManager.getInstance().deleteAndCreateDirectory(initRequest.id + "-" + initRequest.key);
                    String jSONObject = initRequest.data.getJSONObject("config").toString();
                    YNFileManager.getInstance().createFileFromString(initRequest.id + "-" + initRequest.key, "config.js", "const YA_CONFIG = " + jSONObject);
                    getInstance().downloadAssets(initRequest, currentTimeMillis, actionLoad);
                    YNLog.Info("[Load] :: Waiting : key = " + initRequest.key + ", time = " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
                    str3 = str3;
                    requestDecryptJsonString = requestDecryptJsonString;
                    actionLoad = actionLoad;
                } else {
                    YNLog.Error("[Load] :: Error :: Invalid Request");
                    actionLoad.onLoad(YNEnumActionError.InvalidRequest);
                    mHttpClient.requestTrackUrl(initRequest.data, "Load", "END", "YNManager::Load::RequestCheck", Boolean.TRUE, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                    getInstance().deleteRequest(initRequest, "Load Invalid Request");
                    str3 = str3;
                    requestDecryptJsonString = requestDecryptJsonString;
                    actionLoad = actionLoad;
                }
            } catch (Exception e) {
                YNLog.Error("[Load] :: Error :: " + e.getMessage() + ", time = " + (System.currentTimeMillis() - currentTimeMillis) + str3);
                getInstance().doActionLoad(actionLoad, e);
                YNHttpClient yNHttpClient = mHttpClient;
                StringBuilder sb = new StringBuilder();
                sb.append("YNManager::Load: ");
                sb.append(e.getMessage());
                String sb2 = sb.toString();
                Boolean bool = Boolean.TRUE;
                ?? currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                yNHttpClient.requestTrackUrl(requestDecryptJsonString, "Load", "END", sb2, bool, Long.valueOf((long) currentTimeMillis2));
                ?? yNManager = getInstance();
                yNManager.deleteRequest(initRequest, "Load Error");
                str3 = currentTimeMillis2;
                requestDecryptJsonString = yNManager;
                actionLoad = "Load Error";
            }
            return;
        }
        YNLog.Error("[Load] :: Error :: Not Initialized");
        actionLoad.onLoad(YNEnumActionError.SdkNotInitialized);
        mHttpClient.requestTrackUrl(requestDecryptJsonString, "Load", "END", "YNManager::Load: Not Initialized", Boolean.TRUE, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
    }

    public static void show(String str, YNEnumPlacementType yNEnumPlacementType, YsoNetwork.ActionDisplay actionDisplay, Activity activity) {
        YNLog.Info("[Show] :: Request : key = " + str);
        if (isInitialized()) {
            YNRequest requestToShow = getInstance().getRequestToShow(str);
            if (requestToShow != null) {
                try {
                    mHttpClient.requestTrackUrl(requestToShow.data, "Show", POBOMSDKLogConstants.MSG_OMSDK_START_EVENT, (String) null, (Boolean) null, (Long) null);
                    if (requestToShow.status == YNEnumRequestStatus.Ready) {
                        requestToShow.status = YNEnumRequestStatus.WillVisible;
                        requestToShow.actionDisplay = actionDisplay;
                        YNAdsDisplay yNAdsDisplay = new YNAdsDisplay(activity);
                        StringBuilder sb = new StringBuilder();
                        sb.append("file://");
                        sb.append(YNFileManager.getInstance().getFileTmp(requestToShow.id + "-" + requestToShow.key, "index.html"));
                        String sb2 = sb.toString();
                        if (yNEnumPlacementType == YNEnumPlacementType.Banner) {
                            requestToShow.status = YNEnumRequestStatus.Visible;
                            requestToShow.isVisible = true;
                            yNAdsDisplay.load(requestToShow, yNEnumPlacementType, sb2);
                        } else {
                            getInstance().startRequestObserver(requestToShow, yNEnumPlacementType, sb2, activity);
                            yNAdsDisplay.show(requestToShow, yNEnumPlacementType, sb2);
                        }
                    } else {
                        YNLog.Error("[Show] :: Not Ready");
                        actionDisplay.onClose(false, false);
                        mHttpClient.requestTrackUrl(requestToShow.data, "Show", "END", "YNManager::Show: Ad not ready", Boolean.TRUE, (Long) null);
                        getInstance().deleteRequest(requestToShow, "Show Not Ready");
                    }
                    return;
                } catch (Exception e) {
                    YNLog.Error("[Show] :: Display Error :" + e.getMessage());
                    actionDisplay.onClose(false, false);
                    mHttpClient.requestTrackUrl(requestToShow.data, "Show", "END", "YNManager::Show: " + e.getMessage(), Boolean.TRUE, (Long) null);
                    getInstance().deleteRequest(requestToShow, "Show Display Error");
                    return;
                }
            }
            YNLog.Error("[Show] :: Nothing To Display");
            actionDisplay.onClose(false, false);
            return;
        }
        YNLog.Error("[Show] :: Not Initialized");
        actionDisplay.onClose(false, false);
    }

    private void displayCallback(YNRequest yNRequest, String str) {
        YNLog.Info(str);
        yNRequest.status = YNEnumRequestStatus.Visible;
        yNRequest.isVisible = true;
        YsoNetwork.ActionDisplay actionDisplay = yNRequest.actionDisplay;
        if (actionDisplay != null) {
            actionDisplay.onDisplay(null);
        }
    }

    private void clickCallback(YNRequest yNRequest, String str) {
        YNLog.Info(str);
        YsoNetwork.ActionDisplay actionDisplay = yNRequest.actionDisplay;
        if (actionDisplay != null) {
            actionDisplay.onClick();
        }
    }

    private void closeCallback(YNRequest yNRequest, String str) {
        YNLog.Info(str);
        yNRequest.status = YNEnumRequestStatus.Free;
        yNRequest.isVisible = false;
        YsoNetwork.ActionDisplay actionDisplay = yNRequest.actionDisplay;
        if (actionDisplay != null) {
            actionDisplay.onClose(true, true);
        }
        deleteRequest(yNRequest, "Close Back");
    }

    public void interstitialDisplayCallback(YNRequest yNRequest) {
        displayCallback(yNRequest, "InterstitialDisplayBack");
    }

    public void interstitialClickCallback(YNRequest yNRequest) {
        clickCallback(yNRequest, "InterstitialClickBack");
    }

    public void interstitialCloseCallback(YNRequest yNRequest) {
        closeCallback(yNRequest, "InterstitialCloseBack");
    }

    public void rewardedDisplayCallback(YNRequest yNRequest) {
        displayCallback(yNRequest, "RewardedDisplayBack");
    }

    public void rewardedClickCallback(YNRequest yNRequest) {
        clickCallback(yNRequest, "RewardedClickBack");
    }

    public void rewardedCloseCallback(YNRequest yNRequest) {
        closeCallback(yNRequest, "RewardedCloseBack");
    }

    public void bannerDisplayCallback(YNRequest yNRequest) {
        displayCallback(yNRequest, "BannerDisplayBack");
    }

    public void bannerClickCallback(YNRequest yNRequest) {
        clickCallback(yNRequest, "BannerClickBack");
    }

    public void bannerCloseCallback(YNRequest yNRequest) {
        closeCallback(yNRequest, "BannerCloseBack");
    }
}
