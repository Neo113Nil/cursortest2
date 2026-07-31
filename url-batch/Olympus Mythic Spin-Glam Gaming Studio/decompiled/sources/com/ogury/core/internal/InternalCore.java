package com.ogury.core.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.ironsource.C4901tg;
import com.mobilefuse.sdk.MobileFuseDefaults;
import com.mobilefuse.sdk.config.ExternalUsageInfo;
import com.ogury.core.internal.advertising.AdvertisingInfo;
import com.ogury.core.internal.datastore.datastore.OnDataStoreChangeListener;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-f6b89802f4bb37a88df877e1128ae5b0c949df87377d83c36e528e9a9b869b70 */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u000b\u0012\u0002\b\u00030\n2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0007J\b\u0010\u000f\u001a\u00020\u000bH\u0007J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0007J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0007J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0007J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J \u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0013H\u0007J \u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0016H\u0007J \u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ogury/core/internal/InternalCore;", "", "()V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getAdvertisingInfo", "Lcom/ogury/core/internal/advertising/AdvertisingInfo;", "context", "Landroid/content/Context;", "getAllPublisherData", "", "", "getFrameworkName", "getToken", "keyName", C4901tg.b, "retrieveGppConsentString", "retrieveGppSectionIdsString", "retrievePrivacyDataBoolean", "", "key", "retrievePrivacyDataInt", "", "retrievePrivacyDataString", "retrieveTcfConsentString", "setOnPrivacyDataChangeListener", "", "onConsentDataChanged", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "onOguryPrivacyDataChanged", "Lcom/ogury/core/internal/datastore/datastore/OnDataStoreChangeListener;", "storePrivacyData", "value", "sdk-core_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InternalCore {

    @NotNull
    public static final InternalCore INSTANCE = new InternalCore();

    @NotNull
    private static final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO()));

    private InternalCore() {
    }

    @NotNull
    public static final AdvertisingInfo getAdvertisingInfo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            a a = c.a(context);
            if (a != null) {
                return new AdvertisingInfo(a.a, !a.b);
            }
            throw new IllegalStateException("Advertising Id is null");
        } catch (Exception e) {
            Logger.INSTANCE.e(LogTag.INTERNAL, SourceTag.CORE, e);
            return new AdvertisingInfo(MobileFuseDefaults.ADVERTISING_ID_ZEROS, true);
        }
    }

    @NotNull
    public static final Map<String, ?> getAllPublisherData(@NotNull Context context) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(context, "context");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new i(context, null), 1, null);
        return (Map) runBlocking$default;
    }

    @NotNull
    public static final String getFrameworkName() {
        r0 reflectionUtil = new r0();
        Intrinsics.checkNotNullParameter(reflectionUtil, "reflectionUtil");
        return (r0.a(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME) ? new e(ExternalUsageInfo.SDK_MODULE_UNITY) : r0.a("org.apache.cordova.CordovaWebView") ? new e("Cordova") : r0.a("mono.android.Runtime") ? new e("Xamarin") : r0.a("com.adobe.fre.FREFunction") ? new e("Adobe Air") : r0.a("io.flutter.embedding.android.FlutterActivity") ? new e("Flutter") : r0.a("com.facebook.react.ReactActivity") ? new e("React Native") : r0.a("org.nativescript.NativeScriptActivity") ? new e("NativeScript") : new e("Native")).a;
    }

    @NotNull
    public static final String getToken(@NotNull Context context, @NotNull String keyName) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        w wVar = new w(context);
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new q(wVar, keyName, null), 1, null);
        return (String) runBlocking$default;
    }

    @NotNull
    public static final String getVersion() {
        return "2.2.1";
    }

    @Nullable
    public static final String retrieveGppConsentString(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Intrinsics.checkNotNullParameter("IABGPP_HDR_GppString", "key");
        if (StringsKt.isBlank("IABGPP_HDR_GppString")) {
            throw new IllegalArgumentException("Key cannot be blank");
        }
        return defaultSharedPreferences.getString("IABGPP_HDR_GppString", null);
    }

    @Nullable
    public static final String retrieveGppSectionIdsString(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Intrinsics.checkNotNullParameter("IABGPP_GppSID", "key");
        if (StringsKt.isBlank("IABGPP_GppSID")) {
            throw new IllegalArgumentException("Key cannot be blank");
        }
        return defaultSharedPreferences.getString("IABGPP_GppSID", null);
    }

    public static final boolean retrievePrivacyDataBoolean(@NotNull Context context, @NotNull String key) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new j(context, key, null), 1, null);
        return ((Boolean) runBlocking$default).booleanValue();
    }

    public static final int retrievePrivacyDataInt(@NotNull Context context, @NotNull String key) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new k(context, key, null), 1, null);
        return ((Number) runBlocking$default).intValue();
    }

    @Nullable
    public static final String retrievePrivacyDataString(@NotNull Context context, @NotNull String key) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new l(context, key, null), 1, null);
        return (String) runBlocking$default;
    }

    @Nullable
    public static final String retrieveTcfConsentString(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Intrinsics.checkNotNullParameter("IABTCF_TCString", "key");
        if (StringsKt.isBlank("IABTCF_TCString")) {
            throw new IllegalArgumentException("Key cannot be blank");
        }
        return defaultSharedPreferences.getString("IABTCF_TCString", null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.Map] */
    public static final void setOnPrivacyDataChangeListener(@NotNull Context context, @NotNull SharedPreferences.OnSharedPreferenceChangeListener onConsentDataChanged, @NotNull OnDataStoreChangeListener onOguryPrivacyDataChanged) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onConsentDataChanged, "onConsentDataChanged");
        Intrinsics.checkNotNullParameter(onOguryPrivacyDataChanged, "onOguryPrivacyDataChanged");
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        Intrinsics.checkNotNullParameter(onConsentDataChanged, "onConsentDataChanged");
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(onConsentDataChanged);
        p0 p0Var = new p0(context);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = MapsKt.emptyMap();
        FlowKt.launchIn(FlowKt.onEach(FlowKt.drop(FlowKt.distinctUntilChanged(new n0(p0Var.a().getData(), ref$ObjectRef)), 1), new m(onOguryPrivacyDataChanged, null)), scope);
    }

    public static final void storePrivacyData(@NotNull Context context, @NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new n(context, key, value, null), 3, null);
    }

    public static final void storePrivacyData(@NotNull Context context, @NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new o(context, key, value, null), 3, null);
    }

    public static final void storePrivacyData(@NotNull Context context, @NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new p(context, key, value, null), 3, null);
    }
}
