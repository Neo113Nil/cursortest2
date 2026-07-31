package com.pubmatic.sdk.webrendering.mraid;

import android.webkit.JavascriptInterface;
import androidx.annotation.AnyThread;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.pubmatic.sdk.common.POBCommonConstants;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBLocation;
import com.pubmatic.sdk.common.taskhandler.POBTaskHandler;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.pubmatic.sdk.webrendering.ui.POBAdViewContainer;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.partials.PubMaticNetworkBridge;
import com.safedk.android.utils.Logger;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
@MainThread
/* loaded from: classes12.dex */
public class POBMraidBridge {
    private static final String JS_CLASS = "mraidService";
    private static final String MRAID_MAPPING = "nativeBridge";
    private static final String TAG = "POBMraidBridge";

    @NonNull
    protected final POBAdViewContainer adViewContainer;

    @NonNull
    private final Map<String, g> commandHandlingMap;

    @Nullable
    private n mraidBridgeListener;

    @NonNull
    private com.pubmatic.sdk.webrendering.mraid.b mraidState = com.pubmatic.sdk.webrendering.mraid.b.LOADING;

    @NonNull
    private final Map<b, String> propertyMap;

    @NonNull
    protected final POBWebView webView;

    class a implements Runnable {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMraidBridge.this.acknowledgeMraidCommand();
            POBLog.debug(POBMraidBridge.TAG, "Received MRAID event : %s", this.a);
            try {
                POBMraidBridge.this.invokeMraidCommands(new JSONObject(this.a));
            } catch (JSONException e) {
                POBLog.error(POBMraidBridge.TAG, "Failed to parse MRAID event. Error : %s", e.getLocalizedMessage());
                POBMraidBridge.this.notifyError("Not supported", this.a);
            }
        }
    }

    private enum b {
        CURRENT_POSITION,
        DEFAULT_POSITION,
        SCREEN_SIZE,
        MAX_SIZE,
        STATE,
        VIEWABLE
    }

    POBMraidBridge(@NonNull POBAdViewContainer pOBAdViewContainer) {
        this.adViewContainer = pOBAdViewContainer;
        POBWebView adView = pOBAdViewContainer.getAdView();
        this.webView = adView;
        PubMaticNetworkBridge.webviewAddJavascriptInterface(adView, this, MRAID_MAPPING);
        this.propertyMap = new HashMap(5);
        this.commandHandlingMap = new HashMap(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void acknowledgeMraidCommand() {
        injectProperties("mraidService.nativeCallComplete();");
    }

    private void injectProperties(String str) {
        POBLog.debug(TAG, "Injecting JS property : %s", str);
        PubMaticNetworkBridge.webviewLoadUrl(this.webView, "javascript:" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void invokeMraidCommands(@NonNull JSONObject jSONObject) {
        POBError pOBError;
        String optString = jSONObject.optString("name");
        g gVar = this.commandHandlingMap.get(optString);
        if (gVar == null) {
            pOBError = new POBError(1009, "Not supported");
        } else if (this.mraidBridgeListener == null || gVar.a()) {
            n nVar = this.mraidBridgeListener;
            pOBError = (nVar == null || !nVar.isUserInteracted(true)) ? new POBError(1009, "Illegal state of command execution without user interaction") : gVar.a(jSONObject, this.mraidBridgeListener, true);
        } else {
            pOBError = gVar.a(jSONObject, this.mraidBridgeListener, this.mraidBridgeListener.isUserInteracted(false));
        }
        if (pOBError != null) {
            notifyError(pOBError.getErrorMessage(), optString);
        }
    }

    private boolean isPropertyUpdated(b bVar, String str) {
        String str2 = this.propertyMap.get(bVar);
        if (str2 != null && str2.equals(str)) {
            return false;
        }
        this.propertyMap.put(bVar, str);
        return true;
    }

    protected void addCommandHandler(@NonNull g gVar) {
        this.commandHandlingMap.put(gVar.b(), gVar);
    }

    @JavascriptInterface
    public void error(String str) {
        POBLog.error(TAG, "Error message from JS :%s", str);
    }

    @NonNull
    protected com.pubmatic.sdk.webrendering.mraid.b getMraidState() {
        return this.mraidState;
    }

    @JavascriptInterface
    public void log(String str) {
        POBLog.debug(TAG, "Received MRAID log :%s", str);
    }

    @AnyThread
    @JavascriptInterface
    public void nativeCall(@Nullable String str) {
        Logger.d("PubMatic|SafeDK: Execution> Lcom/pubmatic/sdk/webrendering/mraid/POBMraidBridge;->nativeCall(Ljava/lang/String;)V");
        BrandSafetyUtils.onPubmaticNativeCall(this.webView, str);
        safedk_POBMraidBridge_nativeCall_54ce7b1977e6fbdc8dde9c2cd3accf6f(str);
    }

    protected void notifyAppInstallStatus(@NonNull String str, int i) {
        injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".onAppInstallStatusReceived('%s', %d);", str, Integer.valueOf(i)));
    }

    protected void notifyError(@Nullable String str, @Nullable String str2) {
        POBLog.debug(TAG, "JS called MRAID event without user interaction. Event : %s", str2);
        injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".fireErrorEvent('%s', '%s');", str, str2));
    }

    protected void resetPropertyMap() {
        this.propertyMap.clear();
    }

    @AnyThread
    @JavascriptInterface
    public void safedk_POBMraidBridge_nativeCall_54ce7b1977e6fbdc8dde9c2cd3accf6f(String p0) {
        POBTaskHandler.getInstance().runOnMainThread(new a(p0));
    }

    protected void setAudioVolumePercentage(@Nullable Double d) {
        injectProperties(JS_CLASS + (d != null ? String.format(Locale.getDefault(), ".fireEvent('audioVolumeChange', %.2f);", d) : String.format(Locale.getDefault(), ".fireEvent('audioVolumeChange', %s);", POBCommonConstants.NULL_VALUE)));
    }

    protected boolean setCurrentPosition(int i, int i2, int i3, int i4) {
        JSONObject rectJson = POBMRAIDUtil.getRectJson(i, i2, i3, i4);
        if (!isPropertyUpdated(b.CURRENT_POSITION, rectJson.toString())) {
            return false;
        }
        injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".setCurrentPosition(%s);", rectJson));
        return true;
    }

    protected void setDefaultPosition(int i, int i2, int i3, int i4) {
        JSONObject rectJson = POBMRAIDUtil.getRectJson(i, i2, i3, i4);
        if (isPropertyUpdated(b.DEFAULT_POSITION, rectJson.toString())) {
            injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".setDefaultPosition(%s);", rectJson));
        }
    }

    protected void setLocation(POBLocation pOBLocation) {
        String str;
        if (pOBLocation != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("lat", pOBLocation.getLatitude());
                jSONObject.put(POBConstants.KEY_LONGITUDE, pOBLocation.getLongitude());
                POBLocation.Source source = pOBLocation.getSource();
                if (source != null) {
                    jSONObject.put("type", String.valueOf(source.getValue()));
                }
                str = String.format(Locale.getDefault(), ".setLocation(%s);", jSONObject);
            } catch (Exception unused) {
                POBLog.error(TAG, "Not able to inject setLocation property!", new Object[0]);
                str = null;
            }
        } else {
            str = String.format(Locale.getDefault(), ".setLocation(%s);", JsonUtils.EMPTY_JSON);
        }
        injectProperties(JS_CLASS + str);
    }

    protected boolean setMaxSize(int i, int i2) {
        JSONObject heightWidthJson = POBMRAIDUtil.getHeightWidthJson(i, i2);
        if (!isPropertyUpdated(b.MAX_SIZE, heightWidthJson.toString())) {
            return false;
        }
        injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".setMaxSize(%s);", heightWidthJson));
        return true;
    }

    protected void setMraidBridgeListener(@Nullable n nVar) {
        this.mraidBridgeListener = nVar;
    }

    protected void setMraidState(@NonNull com.pubmatic.sdk.webrendering.mraid.b bVar) {
        this.mraidState = bVar;
    }

    protected void setPlacementType(@NonNull String str) {
        injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".setPlacementType('%s');", str));
    }

    protected void setScreenSize(int i, int i2) {
        JSONObject heightWidthJson = POBMRAIDUtil.getHeightWidthJson(i, i2);
        if (isPropertyUpdated(b.SCREEN_SIZE, heightWidthJson.toString())) {
            injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".setScreenSize(%s);", heightWidthJson));
        }
    }

    protected void setSizeChange(int i, int i2) {
        injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".fireEvent('%s', %d, %d);", com.pubmatic.sdk.webrendering.mraid.a.SIZE_CHANGE.b(), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    protected void setSupportedFeatures(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sms", z);
            jSONObject.put("tel", z2);
            jSONObject.put("calendar", z3);
            jSONObject.put("storePicture", z4);
            jSONObject.put("inlineVideo", z5);
            jSONObject.put("location", z6);
            jSONObject.put("vpaid", z7);
            injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".setSupports(%s);", jSONObject));
        } catch (JSONException unused) {
            POBLog.error(TAG, "Not able to inject setSupports property!", new Object[0]);
        }
    }

    protected void updateEvent(@NonNull com.pubmatic.sdk.webrendering.mraid.a aVar) {
        injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".fireEvent('%s');", aVar.b()));
    }

    protected void updateExposureChangeData(Float f, JSONObject jSONObject) {
        if (f == null || jSONObject == null) {
            return;
        }
        injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".fireEvent('exposureChange', %.1f, %s, null);", f, jSONObject));
    }

    protected void updateMraidState(@NonNull com.pubmatic.sdk.webrendering.mraid.b bVar) {
        if (isPropertyUpdated(b.STATE, bVar.b())) {
            injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".setState('%s');", bVar.b()));
        }
    }

    protected void updateViewable(boolean z) {
        if (isPropertyUpdated(b.VIEWABLE, String.valueOf(z))) {
            injectProperties(JS_CLASS + String.format(Locale.getDefault(), ".setViewable(%b);", Boolean.valueOf(z)));
        }
    }
}
