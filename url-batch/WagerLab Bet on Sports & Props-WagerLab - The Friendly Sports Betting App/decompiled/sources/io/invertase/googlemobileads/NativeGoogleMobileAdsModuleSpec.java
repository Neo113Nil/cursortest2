package io.invertase.googlemobileads;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes8.dex */
public abstract class NativeGoogleMobileAdsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNGoogleMobileAdsModule";

    protected abstract Map<String, Object> getTypedExportedConstants();

    @ReactMethod
    public abstract void initialize(Promise promise);

    @ReactMethod
    public abstract void openAdInspector(Promise promise);

    @ReactMethod
    public abstract void openDebugMenu(String str);

    @ReactMethod
    public abstract void setAppMuted(boolean z);

    @ReactMethod
    public abstract void setAppVolume(double d);

    @ReactMethod
    public abstract void setRequestConfiguration(@Nullable ReadableMap readableMap, Promise promise);

    public NativeGoogleMobileAdsModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "RNGoogleMobileAdsModule";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public final Map<String, Object> getConstants() {
        Map<String, Object> typedExportedConstants = getTypedExportedConstants();
        if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
            HashSet hashSet = new HashSet(Arrays.asList("REVENUE_PRECISION_ESTIMATED", "REVENUE_PRECISION_PRECISE", "REVENUE_PRECISION_PUBLISHER_PROVIDED", "REVENUE_PRECISION_UNKNOWN"));
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet(typedExportedConstants.keySet());
            hashSet3.removeAll(hashSet);
            hashSet3.removeAll(hashSet2);
            if (!hashSet3.isEmpty()) {
                throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", hashSet3));
            }
            hashSet.removeAll(typedExportedConstants.keySet());
            if (!hashSet.isEmpty()) {
                throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", hashSet));
            }
        }
        return typedExportedConstants;
    }
}
