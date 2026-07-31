package com.pubmatic.sdk.common.cache;

import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBHttpRequest;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/pubmatic/sdk/common/cache/POBSdkConfigHelper;", "", "Lcom/pubmatic/sdk/common/network/POBNetworkHandler;", "networkHandler", "<init>", "(Lcom/pubmatic/sdk/common/network/POBNetworkHandler;)V", "", "a", "()Z", "", "b", "()V", "loadSDKConfig", "Lorg/json/JSONObject;", "getAppStatusSchemes", "()Lorg/json/JSONObject;", "Lcom/pubmatic/sdk/common/network/POBNetworkHandler;", "Lorg/json/JSONObject;", "appStatusSchemes", "", "c", "J", "appStatusSdkConfigCreatedDateTime", "Ljava/util/concurrent/atomic/AtomicBoolean;", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "appStatusConfigFetchInFlight", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class POBSdkConfigHelper {

    /* renamed from: a, reason: from kotlin metadata */
    private final POBNetworkHandler networkHandler;

    /* renamed from: b, reason: from kotlin metadata */
    private volatile JSONObject appStatusSchemes;

    /* renamed from: c, reason: from kotlin metadata */
    private volatile long appStatusSdkConfigCreatedDateTime;

    /* renamed from: d, reason: from kotlin metadata */
    private final AtomicBoolean appStatusConfigFetchInFlight;

    public POBSdkConfigHelper(@NotNull POBNetworkHandler networkHandler) {
        Intrinsics.checkNotNullParameter(networkHandler, "networkHandler");
        this.networkHandler = networkHandler;
        this.appStatusConfigFetchInFlight = new AtomicBoolean(false);
    }

    private final boolean a() {
        if (this.appStatusConfigFetchInFlight.get()) {
            return false;
        }
        boolean isExpired = POBUtils.isExpired(this.appStatusSdkConfigCreatedDateTime, 86400000L);
        POBLog.debug("POBCacheManager", "Remote App Scheme has expired: %d", Integer.valueOf(isExpired ? 1 : 0));
        if (isExpired) {
            return this.appStatusConfigFetchInFlight.compareAndSet(false, true);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        this.appStatusConfigFetchInFlight.set(false);
    }

    @Nullable
    public final JSONObject getAppStatusSchemes() {
        return this.appStatusSchemes;
    }

    public final void loadSDKConfig() {
        if (a()) {
            POBHttpRequest pOBHttpRequest = new POBHttpRequest();
            pOBHttpRequest.setUrl(POBCommonConstants.SDK_CONFIG_URL);
            pOBHttpRequest.setRequestMethod(POBHttpRequest.HTTP_METHOD.GET);
            pOBHttpRequest.setRequestTag(POBCommonConstants.FETCH_APP_SCHEME_TAG);
            pOBHttpRequest.setTimeout(5000);
            POBLog.debug("POBCacheManager", POBCommonConstants.MSG_FETCHING_SDK_CONFIG_FROM_URL, POBCommonConstants.SDK_CONFIG_URL);
            this.networkHandler.sendJSONRequest(pOBHttpRequest, new POBNetworkHandler.POBNetworkListener<JSONObject>() { // from class: com.pubmatic.sdk.common.cache.POBSdkConfigHelper$loadSDKConfig$1
                @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
                public void onFailure(@NotNull POBError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    POBLog.debug("POBCacheManager", POBCommonConstants.MSG_APP_DOMAIN_CONFIG_FETCH_FAILED, error.toString());
                    POBSdkConfigHelper.this.b();
                }

                @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
                public void onSuccess(@Nullable JSONObject response) {
                    try {
                        if (response == null) {
                            POBLog.info("POBCacheManager", POBCommonConstants.MSG_APP_DOMAIN_CONFIG_RESPONSE_NOT_AVAILABLE, new Object[0]);
                            return;
                        }
                        JSONObject optJSONObject = response.optJSONObject(POBCommonConstants.APP_INSTALL_STATUS_KEY);
                        if (optJSONObject == null) {
                            return;
                        }
                        JSONObject optJSONObject2 = optJSONObject.optJSONObject("android");
                        POBLog.debug("POBCacheManager", "Allowed SDK Application Scheme: %s", optJSONObject2);
                        if (optJSONObject2 != null) {
                            JSONObject jSONObject = new JSONObject(optJSONObject2.toString());
                            POBSdkConfigHelper.this.appStatusSchemes = jSONObject;
                            POBSdkConfigHelper.this.appStatusSdkConfigCreatedDateTime = System.currentTimeMillis();
                            POBLog.debug("POBCacheManager", POBCommonConstants.MSG_APP_DOMAIN_CONFIG_CACHED, Integer.valueOf(jSONObject.length()));
                        }
                    } catch (JSONException e) {
                        POBLog.debug("POBCacheManager", POBCommonConstants.MSG_APP_DOMAIN_CONFIG_PARSE_FAILED, e.getMessage());
                    } finally {
                        POBSdkConfigHelper.this.b();
                    }
                }
            });
        }
    }
}
