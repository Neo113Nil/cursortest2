package com.pubmatic.sdk.common.cache;

import android.content.Context;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.pubmatic.sdk.common.OpenWrapSDKConfig;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.POBCrashAnalysing;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.log.POBLogConstants;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import com.pubmatic.sdk.common.network.POBHttpRequest;
import com.pubmatic.sdk.common.network.POBMultipleRequestsHandler;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.network.POBNetworkMonitor;
import com.pubmatic.sdk.common.network.POBResponse;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.viewability.POBMeasurementProvider;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class POBCacheManager {
    private final Context b;
    private final POBNetworkHandler c;
    private volatile String g;
    private volatile String h;
    private String i;
    private String j;
    private final POBSdkConfigHelper o;
    private boolean r;
    private volatile Boolean t;
    private final String a = "POBCacheManager";
    private final Object k = new Object();
    private final Object l = new Object();
    private final Object m = new Object();
    private final Object n = new Object();
    private final Queue p = new ArrayDeque(3);
    private final Queue q = new ArrayDeque(3);
    private final AtomicBoolean s = new AtomicBoolean();
    private final Map d = Collections.synchronizedMap(new HashMap());
    private final Set e = Collections.synchronizedSet(new HashSet());
    private final AtomicReference f = new AtomicReference(null);

    public interface ProfileResultListener {
        void onProfileResult(boolean z);
    }

    public interface UserAgentListener {
        void onUserAgentReceived(@NonNull String str);
    }

    class a implements POBNetworkHandler.POBNetworkListener {
        final /* synthetic */ ProfileResultListener a;

        a(ProfileResultListener profileResultListener) {
            this.a = profileResultListener;
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
        public void onFailure(POBError pOBError) {
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
        public void onSuccess(Map map) {
            if (map == null || map.isEmpty()) {
                POBLog.error("POBCacheManager", "Failed to fetch profile info from CDN. Empty response.", new Object[0]);
            } else {
                POBCacheManager.this.a(map, this.a);
            }
        }
    }

    public POBCacheManager(@NonNull Context context, @NonNull POBNetworkHandler pOBNetworkHandler) {
        this.b = context.getApplicationContext();
        this.c = pOBNetworkHandler;
        this.o = new POBSdkConfigHelper(pOBNetworkHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(final POBMeasurementProvider.POBScriptListener pOBScriptListener) {
        MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.f, null, POBUtils.readFromAssets(this.b, POBCommonConstants.INTERNAL_SERVICE_FILE_NAME));
        POBTaskHandler.getInstance().runOnMainThread(new Runnable() { // from class: com.pubmatic.sdk.common.cache.POBCacheManager$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                POBCacheManager.this.a(pOBScriptListener);
            }
        });
    }

    private void c(final POBMeasurementProvider.POBScriptListener pOBScriptListener) {
        POBTaskHandler.getInstance().runOnBackgroundThread(new Runnable() { // from class: com.pubmatic.sdk.common.cache.POBCacheManager$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                POBCacheManager.this.b(pOBScriptListener);
            }
        });
    }

    public void fetchProfileConfigs(@NonNull final Context context, @NonNull OpenWrapSDKConfig openWrapSDKConfig) {
        HashSet hashSet = new HashSet(openWrapSDKConfig.getProfileIds());
        final boolean z = !POBUtils.isDebugBuild(context);
        a(openWrapSDKConfig.getPublisherId(), hashSet, new ProfileResultListener() { // from class: com.pubmatic.sdk.common.cache.POBCacheManager$$ExternalSyntheticLambda0
            @Override // com.pubmatic.sdk.common.cache.POBCacheManager.ProfileResultListener
            public final void onProfileResult(boolean z2) {
                POBCacheManager.this.a(z, context, z2);
            }
        });
    }

    @NonNull
    @WorkerThread
    public String fetchUserAgent() {
        String str = this.j;
        if (str != null) {
            return str;
        }
        try {
            return WebSettings.getDefaultUserAgent(this.b);
        } catch (Exception e) {
            POBLog.error("POBCacheManager", "Failed to retrieve user agent from web view, %s", e.getLocalizedMessage());
            try {
                String property = System.getProperty("http.agent");
                return property != null ? property : "";
            } catch (Exception e2) {
                POBLog.error("POBCacheManager", "Failed to retrieve user agent (using http.agent) from WebView, %s", e2.getLocalizedMessage());
                return "";
            }
        }
    }

    public void generateUserAgent(@NonNull final UserAgentListener userAgentListener) {
        String str = this.j;
        if (str != null) {
            userAgentListener.onUserAgentReceived(str);
        }
        POBTaskHandler.getInstance().runOnBackgroundThread(new Runnable() { // from class: com.pubmatic.sdk.common.cache.POBCacheManager$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                POBCacheManager.this.a(userAgentListener);
            }
        });
    }

    public boolean getAppInstallStatus() {
        return this.t != null ? this.t.booleanValue() : a();
    }

    @Nullable
    public JSONObject getAppStatusSchemes() {
        return this.o.getAppStatusSchemes();
    }

    @NonNull
    public JSONArray getCachedBidResponses() {
        JSONArray jSONArray;
        synchronized (this.n) {
            try {
                jSONArray = new JSONArray();
                Iterator it = this.q.iterator();
                while (it.hasNext()) {
                    jSONArray.put((JSONObject) it.next());
                }
                Iterator it2 = this.p.iterator();
                while (it2.hasNext()) {
                    jSONArray.put((JSONObject) it2.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONArray;
    }

    @Nullable
    public String getMraidJs() {
        if (this.g == null) {
            this.g = POBUtils.readFromAssets(this.b, POBCommonConstants.POB_MRAID_JS);
        }
        return this.g;
    }

    @Nullable
    public String getOpenWrapJs() {
        if (this.h == null) {
            this.h = POBUtils.readFromAssets(this.b, POBCommonConstants.OPENWRAP_JS);
        }
        return this.h;
    }

    @Nullable
    public POBProfileInfo getProfileInfo(@NonNull String str) {
        return (POBProfileInfo) this.d.get(str);
    }

    @Nullable
    public String getPublisherId() {
        return this.i;
    }

    public void loadAssets() {
        loadMraidJs();
        loadOpenWrapJs();
    }

    public void loadInternalServiceJS(@NonNull POBMeasurementProvider.POBScriptListener pOBScriptListener) {
        String str = (String) this.f.get();
        if (str != null) {
            pOBScriptListener.onMeasurementScriptReceived(str);
        } else {
            c(pOBScriptListener);
        }
    }

    public void loadMraidJs() {
        if (this.g != null) {
            return;
        }
        POBTaskHandler.getInstance().runOnBackgroundThread(new Runnable() { // from class: com.pubmatic.sdk.common.cache.POBCacheManager$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                POBCacheManager.this.b();
            }
        });
    }

    public void loadOpenWrapJs() {
        if (this.h != null) {
            return;
        }
        POBTaskHandler.getInstance().runOnBackgroundThread(new Runnable() { // from class: com.pubmatic.sdk.common.cache.POBCacheManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                POBCacheManager.this.c();
            }
        });
    }

    public void loadSDKConfig() {
        this.o.loadSDKConfig();
    }

    public void saveReceivedBid(@NonNull JSONObject jSONObject) {
        synchronized (this.n) {
            try {
                if (this.p.size() >= 3) {
                    this.p.poll();
                }
                this.p.add(jSONObject);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void saveRenderedBid(@NonNull JSONObject jSONObject) {
        synchronized (this.n) {
            try {
                this.p.remove(jSONObject);
                if (this.q.size() >= 3) {
                    this.q.poll();
                }
                this.q.add(jSONObject);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean verifyCrashAnalyticsStatus() {
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            if (!((POBProfileInfo) it.next()).isCrashAnalyticsEnabled()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(POBMeasurementProvider.POBScriptListener pOBScriptListener) {
        String str = (String) this.f.get();
        if (str != null) {
            pOBScriptListener.onMeasurementScriptReceived(str);
        } else {
            pOBScriptListener.onFailedToReceiveMeasurementScript(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.m) {
            try {
                if (this.h != null) {
                    return;
                }
                this.h = POBUtils.readFromAssets(this.b, POBCommonConstants.OPENWRAP_JS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        synchronized (this.l) {
            try {
                if (this.g != null) {
                    return;
                }
                this.g = POBUtils.readFromAssets(this.b, POBCommonConstants.POB_MRAID_JS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean a() {
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            if (!((POBProfileInfo) it.next()).isAppInstallStatusEnabled()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(UserAgentListener userAgentListener) {
        synchronized (this.k) {
            String fetchUserAgent = fetchUserAgent();
            this.j = fetchUserAgent;
            userAgentListener.onUserAgentReceived(fetchUserAgent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, Context context, boolean z2) {
        if (z2) {
            this.t = Boolean.valueOf(a());
            if (z) {
                a(context, verifyCrashAnalyticsStatus());
            }
        }
    }

    private void a(Context context, boolean z) {
        POBCrashAnalysing crashAnalytics = POBInstanceProvider.getCrashAnalytics();
        if (crashAnalytics == null) {
            POBLog.debug("POBCacheManager", POBLogConstants.CRASHANALYTICS_NOT_INITIALISED, new Object[0]);
            return;
        }
        boolean z2 = this.r;
        if (!z2 && z) {
            this.r = true;
            crashAnalytics.initialize(context);
        } else if (z2 && !z) {
            this.r = false;
            crashAnalytics.invalidate();
        }
        POBLog.debug("POBCacheManager", "%s%b", POBLogConstants.CRASHANALYTICS_ENABLED, Boolean.valueOf(this.r));
    }

    private void a(String str, Set set, ProfileResultListener profileResultListener) {
        this.i = str;
        this.s.set(false);
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            String valueOf = String.valueOf(intValue);
            if (!this.e.contains(valueOf)) {
                POBProfileInfo pOBProfileInfo = (POBProfileInfo) this.d.get(valueOf);
                if (pOBProfileInfo != null && !pOBProfileInfo.isProfileInfoExpired()) {
                    POBLog.debug("POBCacheManager", POBLogConstants.PROFILE_INFO_ALREADY_AVAILABLE, valueOf);
                } else if (!POBNetworkMonitor.isNetworkAvailable(this.b)) {
                    a(new POBError(1003, "No network available"), valueOf);
                } else {
                    String buildConfigURL = POBUtils.buildConfigURL(str, intValue);
                    POBHttpRequest pOBHttpRequest = new POBHttpRequest();
                    pOBHttpRequest.setUrl(buildConfigURL);
                    pOBHttpRequest.setRequestTag(valueOf);
                    POBLog.debug("POBCacheManager", "Requesting profile config with url - : %s", buildConfigURL);
                    pOBHttpRequest.setTimeout(5000);
                    this.e.add(valueOf);
                    arrayList.add(pOBHttpRequest);
                }
            }
        }
        new POBMultipleRequestsHandler(this.c).sendRequests(arrayList, new a(profileResultListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map map, ProfileResultListener profileResultListener) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            POBResponse pOBResponse = (POBResponse) entry.getValue();
            if (pOBResponse instanceof POBResponse.Success) {
                POBLog.debug("POBCacheManager", POBLogConstants.PROFILE_CONFIG_FETCH_SUCCESSFUL, str, pOBResponse);
                try {
                    this.d.put(str, POBProfileInfo.build(new JSONObject(((POBResponse.Success) pOBResponse).getResponse())));
                    this.e.remove(str);
                    this.s.set(true);
                } catch (JSONException e) {
                    a(new POBError(1007, e.getMessage() != null ? e.getMessage() : "Error while parsing profile info."), str);
                }
            } else if (pOBResponse instanceof POBResponse.Error) {
                a(((POBResponse.Error) pOBResponse).getError(), str);
            }
        }
        if (profileResultListener != null) {
            profileResultListener.onProfileResult(this.s.get());
        }
    }

    private void a(POBError pOBError, String str) {
        POBLog.debug("POBCacheManager", POBLogConstants.PROFILE_CONFIG_FAILED_STATUS, Integer.valueOf(pOBError.getErrorCode()), str);
        POBLog.info("POBCacheManager", POBLogConstants.PROFILE_CONFIG_FETCH_FAILED, str);
        if (pOBError.getErrorCode() != 1003) {
            this.d.put(str, new POBProfileInfo());
            this.s.set(true);
        }
        this.e.remove(str);
    }
}
