package com.facebook.appevents.integrity;

import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.ironsource.X3;
import com.ironsource.mediationsdk.metadata.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SensitiveParamsManager.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u000eH\u0007J\b\u0010\u0010\u001a\u00020\u000eH\u0002J&\u0010\u0011\u001a\u00020\u000e2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\f2\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J,\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00042\u001a\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0007j\b\u0012\u0004\u0012\u00020\u0004`\b0\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/facebook/appevents/integrity/SensitiveParamsManager;", "", "()V", "DEFAULT_SENSITIVE_PARAMS_KEY", "", "SENSITIVE_PARAMS_KEY", "defaultSensitiveParameters", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "enabled", "", "sensitiveParameters", "", "disable", "", a.k, "loadSensitiveParameters", "processFilterSensitiveParams", "parameters", X3.i.j0, "shouldFilterOut", "parameterKey", "sensitiveParamsForEvent", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class SensitiveParamsManager {

    @NotNull
    private static final String DEFAULT_SENSITIVE_PARAMS_KEY = "_MTSDK_Default_";

    @NotNull
    private static final String SENSITIVE_PARAMS_KEY = "_filteredKey";
    private static boolean enabled;

    @NotNull
    public static final SensitiveParamsManager INSTANCE = new SensitiveParamsManager();

    @NotNull
    private static HashSet<String> defaultSensitiveParameters = new HashSet<>();

    @NotNull
    private static Map<String, HashSet<String>> sensitiveParameters = new HashMap();

    private SensitiveParamsManager() {
    }

    public static final void enable() {
        if (CrashShieldHandler.isObjectCrashing(SensitiveParamsManager.class)) {
            return;
        }
        try {
            INSTANCE.loadSensitiveParameters();
            HashSet<String> hashSet = defaultSensitiveParameters;
            if (hashSet != null) {
                if (hashSet.isEmpty()) {
                }
                enabled = true;
                return;
            }
            Map<String, HashSet<String>> map = sensitiveParameters;
            if (map != null) {
                if (map.isEmpty()) {
                }
                enabled = true;
                return;
            }
            enabled = false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SensitiveParamsManager.class);
        }
    }

    public static final void disable() {
        if (CrashShieldHandler.isObjectCrashing(SensitiveParamsManager.class)) {
            return;
        }
        try {
            enabled = false;
            sensitiveParameters = new HashMap();
            defaultSensitiveParameters = new HashSet<>();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SensitiveParamsManager.class);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void loadSensitiveParameters() {
        HashSet<String> convertJSONArrayToHashSet;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.INSTANCE;
            int i = 0;
            FetchedAppSettings queryAppSettings = FetchedAppSettingsManager.queryAppSettings(FacebookSdk.getApplicationId(), false);
            if (queryAppSettings == null) {
                return;
            }
            try {
                defaultSensitiveParameters = new HashSet<>();
                sensitiveParameters = new HashMap();
                JSONArray sensitiveParams = queryAppSettings.getSensitiveParams();
                if (sensitiveParams == null || sensitiveParams.length() == 0 || (r4 = sensitiveParams.length()) <= 0) {
                    return;
                }
                while (true) {
                    int i2 = i + 1;
                    JSONObject jSONObject = sensitiveParams.getJSONObject(i);
                    boolean has = jSONObject.has("key");
                    boolean has2 = jSONObject.has("value");
                    if (has && has2) {
                        String sensitiveParamsScope = jSONObject.getString("key");
                        JSONArray jSONArray = jSONObject.getJSONArray("value");
                        if (sensitiveParamsScope != null && jSONArray != null && (convertJSONArrayToHashSet = Utility.convertJSONArrayToHashSet(jSONArray)) != null) {
                            if (sensitiveParamsScope.equals(DEFAULT_SENSITIVE_PARAMS_KEY)) {
                                defaultSensitiveParameters = convertJSONArrayToHashSet;
                            } else {
                                Map<String, HashSet<String>> map = sensitiveParameters;
                                Intrinsics.checkNotNullExpressionValue(sensitiveParamsScope, "sensitiveParamsScope");
                                map.put(sensitiveParamsScope, convertJSONArrayToHashSet);
                            }
                        }
                    }
                    i = i2;
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:9|(9:11|(1:13)|14|15|16|(4:19|(3:21|22|23)(1:25)|24|17)|26|27|(2:29|30)(1:32))|35|(1:37)|14|15|16|(1:17)|26|27|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[Catch: all -> 0x0023, Exception -> 0x0065, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0009, B:9:0x0018, B:11:0x001c, B:14:0x002e, B:16:0x0033, B:17:0x004a, B:19:0x0050, B:22:0x005e, B:27:0x0065, B:29:0x006b, B:35:0x0025), top: B:5:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b A[Catch: all -> 0x0023, TRY_LEAVE, TryCatch #0 {all -> 0x0023, blocks: (B:6:0x0009, B:9:0x0018, B:11:0x001c, B:14:0x002e, B:16:0x0033, B:17:0x004a, B:19:0x0050, B:22:0x005e, B:27:0x0065, B:29:0x006b, B:35:0x0025), top: B:5:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void processFilterSensitiveParams(@NotNull Map<String, String> parameters, @NotNull String eventName) {
        JSONArray jSONArray;
        if (CrashShieldHandler.isObjectCrashing(SensitiveParamsManager.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            if (!enabled) {
                return;
            }
            HashSet<String> hashSet = defaultSensitiveParameters;
            if (hashSet != null) {
                if (hashSet.isEmpty()) {
                }
                jSONArray = new JSONArray();
                HashSet<String> hashSet2 = sensitiveParameters.get(eventName);
                for (String str : new ArrayList(parameters.keySet())) {
                    if (INSTANCE.shouldFilterOut(str, hashSet2)) {
                        parameters.remove(str);
                        jSONArray.put(str);
                    }
                }
                if (jSONArray.length() <= 0) {
                    parameters.put(SENSITIVE_PARAMS_KEY, jSONArray.toString());
                    return;
                }
                return;
            }
            if (!sensitiveParameters.containsKey(eventName)) {
                return;
            }
            jSONArray = new JSONArray();
            HashSet<String> hashSet22 = sensitiveParameters.get(eventName);
            while (r2.hasNext()) {
            }
            if (jSONArray.length() <= 0) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, SensitiveParamsManager.class);
        }
    }

    private final boolean shouldFilterOut(String parameterKey, HashSet<String> sensitiveParamsForEvent) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (!defaultSensitiveParameters.contains(parameterKey)) {
                if (sensitiveParamsForEvent != null && !sensitiveParamsForEvent.isEmpty()) {
                    if (!sensitiveParamsForEvent.contains(parameterKey)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
