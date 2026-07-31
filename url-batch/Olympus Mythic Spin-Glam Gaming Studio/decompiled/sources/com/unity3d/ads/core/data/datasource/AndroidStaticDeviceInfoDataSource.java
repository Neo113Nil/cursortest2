package com.unity3d.ads.core.data.datasource;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.SystemClock;
import android.os.ext.SdkExtensions;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import android.webkit.WebSettings;
import com.unity3d.ads.core.data.model.StorageType;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.core.utils.GetMemoryValueFromStringKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.OpenAdvertisingId;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.StaticDeviceInfoKt;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import io.appmetrica.analytics.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import javax.security.auth.x500.X500Principal;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidStaticDeviceInfoDataSource.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 t2\u00020\u0001:\u0001tB9\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0096@¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0019H\u0016J\b\u0010!\u001a\u00020\u0019H\u0016J\b\u0010\"\u001a\u00020\u0019H\u0016J\b\u0010#\u001a\u00020\u001fH\u0002J\u0006\u0010$\u001a\u00020\u0019J\b\u0010%\u001a\u00020\u0019H\u0002J\u0006\u0010&\u001a\u00020'J\u000e\u0010(\u001a\u00020\u0019H\u0096@¢\u0006\u0002\u0010)J\b\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u0004\u0018\u00010\u0019H\u0096@¢\u0006\u0002\u0010)J\u0010\u00100\u001a\u0004\u0018\u00010\u0019H\u0096@¢\u0006\u0002\u0010)J\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020\u001fH\u0002J\b\u00104\u001a\u00020\u001fH\u0002J\b\u00105\u001a\u00020\u001fH\u0002J\b\u00106\u001a\u00020'H\u0002J\u0010\u00107\u001a\u00020'2\u0006\u00108\u001a\u00020\u0019H\u0002J\b\u00109\u001a\u00020\u0019H\u0003J\u0006\u0010:\u001a\u00020\u0019J\u0006\u0010;\u001a\u00020\u0019J\u0006\u0010<\u001a\u00020\u0019J\u0006\u0010=\u001a\u00020\u0019J\u0006\u0010>\u001a\u00020\u0019J\u0006\u0010?\u001a\u00020\u0019J\u0006\u0010@\u001a\u00020\u0019J\u0006\u0010A\u001a\u00020\u0019J\b\u0010B\u001a\u00020\u0019H\u0002J\b\u0010C\u001a\u00020\u0019H\u0003J\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\f\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u0018J\b\u0010G\u001a\u00020\u0019H\u0002J\b\u0010H\u001a\u00020.H\u0002J\b\u0010I\u001a\u00020.H\u0002J\u0010\u0010J\u001a\u0004\u0018\u00010\u0019H\u0082@¢\u0006\u0002\u0010)J\b\u0010K\u001a\u0004\u0018\u00010\u0019J\b\u0010L\u001a\u0004\u0018\u00010\u0019J\u000e\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\u000e\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00190OH\u0003J\b\u0010P\u001a\u00020\u0019H\u0002J\b\u0010Q\u001a\u00020\u001fH\u0002J\u001e\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\b\u0010S\u001a\u00020.H\u0002J\b\u0010T\u001a\u00020\u0019H\u0002J\b\u0010U\u001a\u00020'H\u0002J\b\u0010V\u001a\u00020\u0019H\u0002J\b\u0010W\u001a\u00020\u0019H\u0002J\u0006\u0010X\u001a\u00020.J\u0010\u0010Y\u001a\u00020.2\u0006\u0010Z\u001a\u00020[H\u0002J\u0010\u0010\\\u001a\u00020.2\b\u0010]\u001a\u0004\u0018\u00010^J\u0012\u0010_\u001a\u00020.2\b\u0010]\u001a\u0004\u0018\u00010^H\u0002J\u000e\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002J\u0012\u0010a\u001a\u0004\u0018\u00010^2\u0006\u0010b\u001a\u00020cH\u0002J\b\u0010d\u001a\u00020\u0019H\u0016J\b\u0010e\u001a\u00020\u0019H\u0002J\b\u0010f\u001a\u00020'H\u0002J\b\u0010g\u001a\u00020\u001fH\u0002J\u0006\u0010h\u001a\u00020'J\u0006\u0010i\u001a\u00020'J\u0018\u0010j\u001a\b\u0012\u0004\u0012\u00020k0\u00182\b\u0010l\u001a\u0004\u0018\u00010\u0019H\u0002J\u001a\u0010m\u001a\u00020'2\u0006\u0010n\u001a\u00020k2\b\u0010l\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010o\u001a\u00020'2\u0006\u0010n\u001a\u00020kH\u0003J\u001a\u0010p\u001a\u00020'2\u0006\u0010n\u001a\u00020k2\b\u0010l\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010q\u001a\u00020'2\u0006\u0010n\u001a\u00020kH\u0003J\b\u0010r\u001a\u00020\u001fH\u0002J\b\u0010s\u001a\u00020\u0019H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010*\u001a\u0004\u0018\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006u"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidStaticDeviceInfoDataSource;", "Lcom/unity3d/ads/core/data/datasource/StaticDeviceInfoDataSource;", "context", "Landroid/content/Context;", "glInfoStore", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "analyticsDataSource", "Lcom/unity3d/ads/core/data/datasource/AnalyticsDataSource;", "storeDataSource", "Lcom/unity3d/ads/core/data/datasource/StoreDataSource;", "unityBootConfigDataSource", "Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "<init>", "(Landroid/content/Context;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/AnalyticsDataSource;Lcom/unity3d/ads/core/data/datasource/StoreDataSource;Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;Lcom/unity3d/ads/core/log/Logger;)V", "getContext", "()Landroid/content/Context;", "DEBUG_CERT", "Ljavax/security/auth/x500/X500Principal;", "staticDeviceInfo", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", "fetch", "additionalStores", "", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchCached", "fetchAndroidStaticDeviceInfo", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "getApiLevel", "", "getOsVersion", "getManufacturer", "getModel", "getScreenLayout", "getAdvertisingTrackingId", "getOpenAdvertisingTrackingId", "isLimitOpenAdTrackingEnabled", "", "getIdfi", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "analyticsUserId", "getAnalyticsUserId", "()Ljava/lang/String;", "getSystemBootTime", "", "getAuid", "getUnityBuildGuid", "getDisplayMetricDensity", "", "getScreenDensity", "getScreenWidth", "getScreenHeight", "isRooted", "searchPathForBinary", BuildConfig.SDK_DEPENDENCY, "getCertificateFingerprint", "getBoard", "getBootloader", "getBrand", "getDisplay", "getDevice", "getHardware", "getHost", "getProduct", "getFingerprint", "getInstallerPackageName", "getSupportedAbis", "getSensorList", "Landroid/hardware/Sensor;", "getCPUModel", "getCPUCount", "getJvmMaxMemory", "getGPUModel", "getBuildId", "getBuildVersionIncremental", "getOldAbiList", "getNewAbiList", "Ljava/util/ArrayList;", "getWebViewUserAgent", "getVersionCode", "getStores", "getAppStartTime", "getVersionName", "isTestMode", "getPlatform", "getGameId", "getTotalMemory", "getMemoryInfo", "infoType", "Lcom/unity3d/services/core/device/Device$MemoryInfoType;", "getTotalSpace", "file", "Ljava/io/File;", "getTotalSpaceBytes", "getKeyboardLanguages", "getFileForStorageType", "storageType", "Lcom/unity3d/ads/core/data/model/StorageType;", "getAppName", "getAppVersion", "isAppDebuggable", "getExtensionVersion", "hasX264Decoder", "hasX265Decoder", "selectAllDecodeCodecs", "Landroid/media/MediaCodecInfo;", "mimeType", "isHardwareAccelerated", "codecInfo", "isHardwareAcceleratedV29", "isSoftwareOnly", "isSoftwareOnlyV29", "getPhoneType", "getSimOperator", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AndroidStaticDeviceInfoDataSource implements StaticDeviceInfoDataSource {

    @NotNull
    public static final String ALGORITHM_SHA1 = "SHA-1";

    @NotNull
    public static final String APP_VERSION_FAKE = "FakeVersionName";

    @NotNull
    public static final String BINARY_SU = "su";

    @NotNull
    public static final String CERTIFICATE_TYPE_X509 = "X.509";

    @NotNull
    public static final String ENVIRONMENT_VARIABLE_PATH = "PATH";

    @NotNull
    public static final String PLATFORM_ANDROID = "android";

    @NotNull
    public static final String STORE_GOOGLE = "google";

    @NotNull
    private final X500Principal DEBUG_CERT;

    @NotNull
    private final AnalyticsDataSource analyticsDataSource;

    @NotNull
    private final Context context;

    @NotNull
    private final ByteStringDataSource glInfoStore;

    @NotNull
    private final Logger logger;

    @NotNull
    private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo;

    @NotNull
    private final StoreDataSource storeDataSource;

    @NotNull
    private final UnityBootConfigDataSource unityBootConfigDataSource;

    /* compiled from: AndroidStaticDeviceInfoDataSource.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Device.MemoryInfoType.values().length];
            try {
                iArr[Device.MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Device.MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StorageType.values().length];
            try {
                iArr2[StorageType.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[StorageType.EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final int getVersionCode() {
        return 41900;
    }

    public AndroidStaticDeviceInfoDataSource(@NotNull Context context, @NotNull ByteStringDataSource glInfoStore, @NotNull AnalyticsDataSource analyticsDataSource, @NotNull StoreDataSource storeDataSource, @NotNull UnityBootConfigDataSource unityBootConfigDataSource, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(glInfoStore, "glInfoStore");
        Intrinsics.checkNotNullParameter(analyticsDataSource, "analyticsDataSource");
        Intrinsics.checkNotNullParameter(storeDataSource, "storeDataSource");
        Intrinsics.checkNotNullParameter(unityBootConfigDataSource, "unityBootConfigDataSource");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.context = context;
        this.glInfoStore = glInfoStore;
        this.analyticsDataSource = analyticsDataSource;
        this.storeDataSource = storeDataSource;
        this.unityBootConfigDataSource = unityBootConfigDataSource;
        this.logger = logger;
        this.DEBUG_CERT = new X500Principal("CN=Android Debug,O=Android,C=US");
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder newBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        StaticDeviceInfoKt.Dsl _create = companion._create(newBuilder);
        _create.setBundleId(getAppName());
        _create.setBundleVersion(getAppVersion());
        _create.setAppDebuggable(isAppDebuggable());
        _create.setRooted(isRooted());
        _create.setOsVersion(getOsVersion());
        _create.setDeviceMake(getManufacturer());
        _create.setDeviceModel(getModel());
        _create.setWebviewUa(getWebViewUserAgent());
        _create.setScreenDensity(getScreenDensity());
        _create.setScreenWidth(getScreenWidth());
        _create.setScreenHeight(getScreenHeight());
        _create.setScreenSize(getScreenLayout());
        _create.addAllStores(_create.getStores(), getStores$default(this, null, 1, null));
        StorageType storageType = StorageType.EXTERNAL;
        _create.setTotalDiskSpace(getTotalSpace(getFileForStorageType(storageType)));
        _create.setTotalDiskSpaceBytes(getTotalSpaceBytes(getFileForStorageType(storageType)));
        _create.addAllKeyboardLanguages(_create.getKeyboardLanguages(), getKeyboardLanguages());
        _create.setTotalRamMemory(getTotalMemory());
        _create.setCpuModel(getCPUModel());
        _create.setCpuCount(getCPUCount());
        _create.setAndroid(fetchAndroidStaticDeviceInfo());
        _create.setMadeWithUnity(MadeWithUnityDetector.isMadeWithUnity());
        this.staticDeviceInfo = _create._build();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetch(@NotNull List<String> list, @NotNull Continuation continuation) {
        AndroidStaticDeviceInfoDataSource$fetch$1 androidStaticDeviceInfoDataSource$fetch$1;
        int i;
        String str;
        if (continuation instanceof AndroidStaticDeviceInfoDataSource$fetch$1) {
            androidStaticDeviceInfoDataSource$fetch$1 = (AndroidStaticDeviceInfoDataSource$fetch$1) continuation;
            int i2 = androidStaticDeviceInfoDataSource$fetch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidStaticDeviceInfoDataSource$fetch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidStaticDeviceInfoDataSource$fetch$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidStaticDeviceInfoDataSource$fetch$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String gpuModel = this.staticDeviceInfo.getGpuModel();
                    if (gpuModel != null && gpuModel.length() != 0) {
                        return this.staticDeviceInfo;
                    }
                    androidStaticDeviceInfoDataSource$fetch$1.L$0 = list;
                    androidStaticDeviceInfoDataSource$fetch$1.label = 1;
                    obj = getGPUModel(androidStaticDeviceInfoDataSource$fetch$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) androidStaticDeviceInfoDataSource$fetch$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                str = (String) obj;
                if (str != null || str.length() == 0) {
                    return this.staticDeviceInfo;
                }
                StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = this.staticDeviceInfo;
                StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.INSTANCE;
                StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder = staticDeviceInfo.toBuilder();
                Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
                StaticDeviceInfoKt.Dsl _create = companion._create(builder);
                _create.setGpuModel(str);
                _create.clearStores(_create.getStores());
                _create.addAllStores(_create.getStores(), getStores(list));
                StaticDeviceInfoOuterClass.StaticDeviceInfo _build = _create._build();
                this.staticDeviceInfo = _build;
                return _build;
            }
        }
        androidStaticDeviceInfoDataSource$fetch$1 = new AndroidStaticDeviceInfoDataSource$fetch$1(this, continuation);
        Object obj2 = androidStaticDeviceInfoDataSource$fetch$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidStaticDeviceInfoDataSource$fetch$1.label;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        return this.staticDeviceInfo;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @NotNull
    /* renamed from: fetchCached, reason: from getter */
    public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
        return this.staticDeviceInfo;
    }

    private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android fetchAndroidStaticDeviceInfo() {
        StaticDeviceInfoKt staticDeviceInfoKt = StaticDeviceInfoKt.INSTANCE;
        StaticDeviceInfoKt.AndroidKt.Dsl.Companion companion = StaticDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder newBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        StaticDeviceInfoKt.AndroidKt.Dsl _create = companion._create(newBuilder);
        _create.setApiLevel(getApiLevel());
        _create.setVersionCode(getVersionCode());
        _create.setAndroidFingerprint(getFingerprint());
        _create.setAppInstaller(getInstallerPackageName());
        _create.setApkDeveloperSigningCertificateHash(getCertificateFingerprint());
        _create.setBuildBoard(getBoard());
        _create.setBuildBrand(getBrand());
        _create.setBuildDevice(getDevice());
        _create.setBuildDisplay(getDisplay());
        _create.setBuildFingerprint(getFingerprint());
        _create.setBuildHardware(getHardware());
        _create.setBuildHost(getHost());
        _create.setBuildBootloader(getBootloader());
        _create.setBuildProduct(getProduct());
        _create.setExtensionVersion(getExtensionVersion());
        String buildId = getBuildId();
        if (buildId != null) {
            _create.setBuildId(buildId);
        }
        _create.setPhoneType(getPhoneType());
        _create.setSimOperator(getSimOperator());
        _create.setJvmMaxMemory(getJvmMaxMemory());
        return _create._build();
    }

    private final int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @NotNull
    public String getOsVersion() {
        String str = Build.VERSION.RELEASE;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @NotNull
    public String getManufacturer() {
        String str = Build.MANUFACTURER;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @NotNull
    public String getModel() {
        String str = Build.MODEL;
        return str == null ? "" : str;
    }

    private final int getScreenLayout() {
        return this.context.getResources().getConfiguration().screenLayout;
    }

    @NotNull
    public final String getAdvertisingTrackingId() {
        String advertisingTrackingId = AdvertisingId.getAdvertisingTrackingId();
        return advertisingTrackingId == null ? "" : advertisingTrackingId;
    }

    private final String getOpenAdvertisingTrackingId() {
        String openAdvertisingTrackingId = OpenAdvertisingId.getOpenAdvertisingTrackingId();
        return openAdvertisingTrackingId == null ? "" : openAdvertisingTrackingId;
    }

    public final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @Nullable
    public Object getIdfi(@NotNull Continuation continuation) {
        String string = AndroidPreferences.getString("unityads-installinfo", UnityAdsConstants.Preferences.PREF_KEY_IDFI);
        if (string == null) {
            string = null;
        }
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        AndroidPreferences.setString("unityads-installinfo", UnityAdsConstants.Preferences.PREF_KEY_IDFI, uuid);
        return uuid;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @Nullable
    public String getAnalyticsUserId() {
        return this.analyticsDataSource.getUserId();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public long getSystemBootTime() {
        return (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / 1000;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @Nullable
    public Object getAuid(@NotNull Continuation continuation) {
        String string = AndroidPreferences.getString("supersonic_shared_preferen", "auid");
        if (string == null) {
            return null;
        }
        return string;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @Nullable
    public Object getUnityBuildGuid(@NotNull Continuation continuation) {
        return this.unityBootConfigDataSource.getValue("build-guid");
    }

    private final float getDisplayMetricDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return 0.0f;
        }
        return displayMetrics.density;
    }

    private final int getScreenDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.densityDpi;
    }

    private final int getScreenWidth() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.widthPixels;
    }

    private final int getScreenHeight() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.heightPixels;
    }

    private final boolean isRooted() {
        try {
            return searchPathForBinary("su");
        } catch (Exception e) {
            this.logger.error("Rooted check failed", e);
            return false;
        }
    }

    private final boolean searchPathForBinary(String binary) {
        List<String> split;
        List emptyList;
        String[] strArr;
        File[] listFiles;
        String str = System.getenv(ENVIRONMENT_VARIABLE_PATH);
        if (str != null && (split = new Regex(":").split(str, 0)) != null) {
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        emptyList = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            emptyList = CollectionsKt.emptyList();
            if (emptyList != null && (strArr = (String[]) emptyList.toArray(new String[0])) != null) {
                for (String str2 : strArr) {
                    File file = new File(str2);
                    if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                        Iterator it = ArrayIteratorKt.iterator(listFiles);
                        while (it.hasNext()) {
                            if (Intrinsics.areEqual(((File) it.next()).getName(), binary)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Deprecated
    @SuppressLint({"PackageManagerGetSignatures"})
    private final String getCertificateFingerprint() {
        try {
            Signature[] signatureArr = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 64).signatures;
            if (signatureArr != null) {
                if (!(signatureArr.length == 0)) {
                    Certificate generateCertificate = CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
                    Intrinsics.checkNotNull(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    String hexString = Utilities.toHexString(MessageDigest.getInstance(ALGORITHM_SHA1).digest(((X509Certificate) generateCertificate).getEncoded()));
                    Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(...)");
                    return hexString;
                }
                return "";
            }
            return "";
        } catch (Exception e) {
            this.logger.error("Exception when signing certificate fingerprint", e);
            return "";
        }
    }

    @NotNull
    public final String getBoard() {
        String str = Build.BOARD;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getBootloader() {
        String str = Build.BOOTLOADER;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getBrand() {
        String str = Build.BRAND;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getDisplay() {
        String str = Build.DISPLAY;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getDevice() {
        String str = Build.DEVICE;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getHardware() {
        String str = Build.HARDWARE;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getHost() {
        String str = Build.HOST;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getProduct() {
        String str = Build.PRODUCT;
        return str == null ? "" : str;
    }

    private final String getFingerprint() {
        String str = Build.FINGERPRINT;
        return str == null ? "" : str;
    }

    @Deprecated
    private final String getInstallerPackageName() {
        String installerPackageName = this.context.getPackageManager().getInstallerPackageName(this.context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    @NotNull
    public final List<String> getSupportedAbis() {
        if (getApiLevel() < 21) {
            return getOldAbiList();
        }
        return getNewAbiList();
    }

    @NotNull
    public final List<Sensor> getSensorList() {
        Object systemService = this.context.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        List<Sensor> sensorList = ((SensorManager) systemService).getSensorList(-1);
        Intrinsics.checkNotNullExpressionValue(sensorList, "getSensorList(...)");
        return sensorList;
    }

    private final String getCPUModel() {
        String str;
        if (Build.VERSION.SDK_INT >= 31) {
            str = Build.SOC_MODEL;
            Intrinsics.checkNotNull(str);
            return str;
        }
        try {
            return (String) CollectionsKt.last(FilesKt.readLines$default(new File("/proc/cpuinfo"), null, 1, null));
        } catch (FileNotFoundException e) {
            this.logger.error("Error reading CPU model", e);
            return "";
        }
    }

    private final long getCPUCount() {
        return Runtime.getRuntime().availableProcessors();
    }

    private final long getJvmMaxMemory() {
        return Runtime.getRuntime().maxMemory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getGPUModel(Continuation continuation) {
        AndroidStaticDeviceInfoDataSource$getGPUModel$1 androidStaticDeviceInfoDataSource$getGPUModel$1;
        int i;
        if (continuation instanceof AndroidStaticDeviceInfoDataSource$getGPUModel$1) {
            androidStaticDeviceInfoDataSource$getGPUModel$1 = (AndroidStaticDeviceInfoDataSource$getGPUModel$1) continuation;
            int i2 = androidStaticDeviceInfoDataSource$getGPUModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidStaticDeviceInfoDataSource$getGPUModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidStaticDeviceInfoDataSource$getGPUModel$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidStaticDeviceInfoDataSource$getGPUModel$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ByteStringDataSource byteStringDataSource = this.glInfoStore;
                    androidStaticDeviceInfoDataSource$getGPUModel$1.label = 1;
                    obj = byteStringDataSource.get(androidStaticDeviceInfoDataSource$getGPUModel$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((ByteStringStoreOuterClass.ByteStringStore) obj).getData().toString(Charsets.UTF_8);
            }
        }
        androidStaticDeviceInfoDataSource$getGPUModel$1 = new AndroidStaticDeviceInfoDataSource$getGPUModel$1(this, continuation);
        Object obj2 = androidStaticDeviceInfoDataSource$getGPUModel$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidStaticDeviceInfoDataSource$getGPUModel$1.label;
        if (i != 0) {
        }
        return ((ByteStringStoreOuterClass.ByteStringStore) obj2).getData().toString(Charsets.UTF_8);
    }

    @Nullable
    public final String getBuildId() {
        return Build.ID;
    }

    @Nullable
    public final String getBuildVersionIncremental() {
        return Build.VERSION.INCREMENTAL;
    }

    private final List<String> getOldAbiList() {
        ArrayList arrayList = new ArrayList();
        String CPU_ABI = Build.CPU_ABI;
        Intrinsics.checkNotNullExpressionValue(CPU_ABI, "CPU_ABI");
        arrayList.add(CPU_ABI);
        String CPU_ABI2 = Build.CPU_ABI2;
        Intrinsics.checkNotNullExpressionValue(CPU_ABI2, "CPU_ABI2");
        arrayList.add(CPU_ABI2);
        return arrayList;
    }

    @TargetApi(21)
    private final ArrayList<String> getNewAbiList() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] strArr = Build.SUPPORTED_ABIS;
        arrayList.addAll(CollectionsKt.listOf(Arrays.copyOf(strArr, strArr.length)));
        return arrayList;
    }

    private final String getWebViewUserAgent() {
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.context);
            Intrinsics.checkNotNull(defaultUserAgent);
            return defaultUserAgent;
        } catch (Exception e) {
            this.logger.error("Exception getting webview user agent", e);
            return "";
        }
    }

    private final List<String> getStores(List<String> additionalStores) {
        return this.storeDataSource.fetchStores(additionalStores);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List getStores$default(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        return androidStaticDeviceInfoDataSource.getStores(list);
    }

    private final long getAppStartTime() {
        return SdkProperties.getInitializationTimeEpoch();
    }

    private final String getVersionName() {
        return "4.19.0";
    }

    private final boolean isTestMode() {
        return SdkProperties.isTestMode();
    }

    private final String getPlatform() {
        return "android";
    }

    private final String getGameId() {
        String gameId = ClientProperties.getGameId();
        return gameId == null ? "" : gameId;
    }

    public final long getTotalMemory() {
        return getMemoryInfo(Device.MemoryInfoType.TOTAL_MEMORY);
    }

    private final long getMemoryInfo(Device.MemoryInfoType infoType) {
        int i;
        String str;
        FileNotFoundException e;
        int i2 = WhenMappings.$EnumSwitchMapping$0[infoType.ordinal()];
        if (i2 != 1) {
            i = 2;
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i = 1;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO, "r");
            str = null;
            for (int i3 = 0; i3 < i; i3++) {
                try {
                    try {
                        str = randomAccessFile.readLine();
                    } finally {
                    }
                } catch (FileNotFoundException e2) {
                    e = e2;
                    this.logger.error("Error reading memory info", e);
                    return GetMemoryValueFromStringKt.getMemoryValueFromString(str);
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(randomAccessFile, null);
        } catch (FileNotFoundException e3) {
            str = null;
            e = e3;
        }
        return GetMemoryValueFromStringKt.getMemoryValueFromString(str);
    }

    public final long getTotalSpace(@Nullable File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return MathKt.roundToInt(file.getTotalSpace() / 1024);
    }

    private final long getTotalSpaceBytes(File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return file.getTotalSpace();
    }

    private final List<String> getKeyboardLanguages() {
        try {
            Object systemService = this.context.getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                List<InputMethodInfo> inputMethodList = inputMethodManager.getInputMethodList();
                Intrinsics.checkNotNullExpressionValue(inputMethodList, "getInputMethodList(...)");
                Iterator<T> it = inputMethodList.iterator();
                while (it.hasNext()) {
                    List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList((InputMethodInfo) it.next(), true);
                    Intrinsics.checkNotNull(enabledInputMethodSubtypeList);
                    Iterator<T> it2 = enabledInputMethodSubtypeList.iterator();
                    while (it2.hasNext()) {
                        String locale = ((InputMethodSubtype) it2.next()).getLocale();
                        Intrinsics.checkNotNullExpressionValue(locale, "getLocale(...)");
                        if (locale.length() > 0) {
                            linkedHashSet.add(locale);
                        }
                    }
                }
                return CollectionsKt.toList(linkedHashSet);
            }
            return CollectionsKt.emptyList();
        } catch (Exception e) {
            this.logger.error("Error getting keyboard languages", e);
            return CollectionsKt.emptyList();
        }
    }

    private final File getFileForStorageType(StorageType storageType) {
        int i = WhenMappings.$EnumSwitchMapping$1[storageType.ordinal()];
        if (i == 1) {
            return this.context.getCacheDir();
        }
        if (i == 2) {
            return this.context.getExternalCacheDir();
        }
        Logger.DefaultImpls.error$default(this.logger, "Unhandled storagetype: " + storageType, null, 2, null);
        return null;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @NotNull
    public String getAppName() {
        String packageName = this.context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return packageName;
    }

    private final String getAppVersion() {
        String str;
        String packageName = this.context.getPackageName();
        PackageManager packageManager = this.context.getPackageManager();
        try {
            if (packageManager.getPackageInfo(packageName, 0).versionName == null) {
                str = APP_VERSION_FAKE;
            } else {
                str = packageManager.getPackageInfo(packageName, 0).versionName;
            }
            Intrinsics.checkNotNull(str);
            return str;
        } catch (PackageManager.NameNotFoundException e) {
            this.logger.error("Error getting package info", e);
            return "";
        }
    }

    private final boolean isAppDebuggable() {
        PackageManager packageManager = this.context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        String packageName = this.context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        boolean z = true;
        boolean z2 = false;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            int i = applicationInfo.flags & 2;
            applicationInfo.flags = i;
            if (i != 0) {
                z2 = true;
                z = false;
            } else {
                z = false;
            }
        } catch (PackageManager.NameNotFoundException e) {
            this.logger.error("Could not find name", e);
        }
        if (z) {
            try {
                Iterator it = ArrayIteratorKt.iterator(packageManager.getPackageInfo(packageName, 64).signatures);
                while (it.hasNext()) {
                    Certificate generateCertificate = CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(((Signature) it.next()).toByteArray()));
                    Intrinsics.checkNotNull(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    z2 = Intrinsics.areEqual(((X509Certificate) generateCertificate).getSubjectX500Principal(), this.DEBUG_CERT);
                    if (z2) {
                        break;
                    }
                }
            } catch (PackageManager.NameNotFoundException e2) {
                this.logger.error("Could not find name", e2);
            } catch (CertificateException e3) {
                this.logger.error("Certificate exception", e3);
            }
        }
        return z2;
    }

    private final int getExtensionVersion() {
        int extensionVersion;
        if (Build.VERSION.SDK_INT < 30) {
            return -1;
        }
        extensionVersion = SdkExtensions.getExtensionVersion(30);
        return extensionVersion;
    }

    public final boolean hasX264Decoder() {
        return !selectAllDecodeCodecs("video/avc").isEmpty();
    }

    public final boolean hasX265Decoder() {
        return !selectAllDecodeCodecs("video/hevc").isEmpty();
    }

    private final List<MediaCodecInfo> selectAllDecodeCodecs(String mimeType) {
        ArrayList arrayList = new ArrayList();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                for (String str : codecInfoAt.getSupportedTypes()) {
                    if (StringsKt.equals(str, mimeType, true)) {
                        Intrinsics.checkNotNull(codecInfoAt);
                        if (isHardwareAccelerated(codecInfoAt, mimeType)) {
                            arrayList.add(codecInfoAt);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final boolean isHardwareAccelerated(MediaCodecInfo codecInfo, String mimeType) {
        if (getApiLevel() >= 29) {
            return isHardwareAcceleratedV29(codecInfo);
        }
        return !isSoftwareOnly(codecInfo, mimeType);
    }

    @TargetApi(29)
    private final boolean isHardwareAcceleratedV29(MediaCodecInfo codecInfo) {
        boolean isHardwareAccelerated;
        isHardwareAccelerated = codecInfo.isHardwareAccelerated();
        return isHardwareAccelerated;
    }

    private final boolean isSoftwareOnly(MediaCodecInfo codecInfo, String mimeType) {
        if (getApiLevel() >= 29) {
            return isSoftwareOnlyV29(codecInfo);
        }
        String name = codecInfo.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String lowerCase = name.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (StringsKt.startsWith$default(lowerCase, "arc.", false, 2, (Object) null)) {
            return false;
        }
        return StringsKt.startsWith$default(lowerCase, "omx.google.", false, 2, (Object) null) || StringsKt.startsWith$default(lowerCase, "omx.ffmpeg.", false, 2, (Object) null) || (StringsKt.startsWith$default(lowerCase, "omx.sec.", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) ".sw.", false, 2, (Object) null)) || Intrinsics.areEqual(lowerCase, "omx.qcom.video.decoder.hevcswvdec") || StringsKt.startsWith$default(lowerCase, "c2.android.", false, 2, (Object) null) || StringsKt.startsWith$default(lowerCase, "c2.google.", false, 2, (Object) null) || !(StringsKt.startsWith$default(lowerCase, "omx.", false, 2, (Object) null) || StringsKt.startsWith$default(lowerCase, "c2.", false, 2, (Object) null));
    }

    @TargetApi(29)
    private final boolean isSoftwareOnlyV29(MediaCodecInfo codecInfo) {
        boolean isSoftwareOnly;
        isSoftwareOnly = codecInfo.isSoftwareOnly();
        return isSoftwareOnly;
    }

    private final int getPhoneType() {
        Object systemService = this.context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return ((TelephonyManager) systemService).getPhoneType();
    }

    private final String getSimOperator() {
        Object systemService = this.context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String simOperator = ((TelephonyManager) systemService).getSimOperator();
        Intrinsics.checkNotNullExpressionValue(simOperator, "getSimOperator(...)");
        return simOperator;
    }
}
