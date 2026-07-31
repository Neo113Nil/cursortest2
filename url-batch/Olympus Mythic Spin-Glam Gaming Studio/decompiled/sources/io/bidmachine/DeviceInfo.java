package io.bidmachine;

import android.content.Context;
import android.media.AudioManager;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.ironsource.C4834q2;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.util.DeviceType;
import io.bidmachine.util.DeviceUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 a2\u00020\u0001:\u0005bacdeB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u001b\u0010\u0015\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\bR\u001b\u0010\u0018\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\bR\u001b\u0010\u001b\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\bR\u001b\u0010 \u001a\u00020\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010)R\u001b\u0010-\u001a\u00020+8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0013\u001a\u0004\b-\u0010.R\u001d\u00101\u001a\u0004\u0018\u00010\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0013\u001a\u0004\b0\u0010\bR\u001d\u00104\u001a\u0004\u0018\u00010\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0013\u001a\u0004\b3\u0010\bR\u001d\u00107\u001a\u0004\u0018\u00010\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u0013\u001a\u0004\b6\u0010\bR\u001d\u0010:\u001a\u0004\u0018\u00010\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u0013\u001a\u0004\b9\u0010\bR\u001d\u0010<\u001a\u0004\u0018\u00010+8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\u0013\u001a\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010@\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010\u0010R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0017\u0010E\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010J\u001a\u00020I8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0017\u0010R\u001a\u00020Q8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0017\u0010W\u001a\u00020V8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0011\u0010[\u001a\u00020+8F¢\u0006\u0006\u001a\u0004\b[\u0010.R\u0013\u0010^\u001a\u0004\u0018\u00010A8F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0013\u0010`\u001a\u0004\u0018\u00010A8F¢\u0006\u0006\u001a\u0004\b_\u0010]¨\u0006f"}, d2 = {"Lio/bidmachine/DeviceInfo;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getKernelVersionThroughProcVersion", "()Ljava/lang/String;", "getKernelVersionThroughUName", "getHWV", "", "updateHwInfo", "appContext", "Landroid/content/Context;", "osName", "Ljava/lang/String;", "getOsName", "osVersion$delegate", "Lkotlin/Lazy;", "getOsVersion", "osVersion", "manufacturer$delegate", "getManufacturer", CommonUrlParts.MANUFACTURER, "model$delegate", "getModel", "model", "", "screenDpi$delegate", "getScreenDpi", "()I", "screenDpi", "", "screenDensity$delegate", "getScreenDensity", "()F", "screenDensity", "Lio/bidmachine/util/DeviceType;", "deviceType$delegate", "getDeviceType", "()Lio/bidmachine/util/DeviceType;", "deviceType", "", "isTablet$delegate", "isTablet", "()Z", "phoneMCCMNC$delegate", "getPhoneMCCMNC", "phoneMCCMNC", "phoneCarrier$delegate", "getPhoneCarrier", "phoneCarrier", "simCarrier$delegate", "getSimCarrier", "simCarrier", "simCountry$delegate", "getSimCountry", "simCountry", "isNetworkInRoaming$delegate", "isNetworkInRoaming", "()Ljava/lang/Boolean;", "isRooted", "Ljava/lang/Boolean;", POBConstants.KEY_HWV, "", "totalDiskSpaceInMBValue", "Ljava/lang/Long;", "Lio/bidmachine/DeviceInfo$Audio;", "audio", "Lio/bidmachine/DeviceInfo$Audio;", "getAudio", "()Lio/bidmachine/DeviceInfo$Audio;", "Lio/bidmachine/DeviceInfo$Ram;", "ram", "Lio/bidmachine/DeviceInfo$Ram;", "getRam", "()Lio/bidmachine/DeviceInfo$Ram;", "Lio/bidmachine/q;", "cache", "Lio/bidmachine/q;", "Lio/bidmachine/DeviceInfo$Cpu;", "cpu", "Lio/bidmachine/DeviceInfo$Cpu;", "getCpu", "()Lio/bidmachine/DeviceInfo$Cpu;", "Lio/bidmachine/DeviceInfo$Gpu;", "gpu", "Lio/bidmachine/DeviceInfo$Gpu;", "getGpu", "()Lio/bidmachine/DeviceInfo$Gpu;", "isDeviceRooted", "getTotalDiskSpaceInMB", "()Ljava/lang/Long;", "totalDiskSpaceInMB", "getAvailableDiskSpaceInMB", "availableDiskSpaceInMB", "Companion", "Audio", "Cpu", "Gpu", "Ram", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes10.dex */
public final class DeviceInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String OS_NAME = "android";

    @Nullable
    private static volatile DeviceInfo instance;

    @NotNull
    private final Context appContext;

    @NotNull
    private final Audio audio;

    @NotNull
    private final q cache;

    @NotNull
    private final Cpu cpu;

    /* renamed from: deviceType$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceType;

    @NotNull
    private final Gpu gpu;

    @Nullable
    private String hwv;

    /* renamed from: isNetworkInRoaming$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isNetworkInRoaming;

    @Nullable
    private Boolean isRooted;

    /* renamed from: isTablet$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy isTablet;

    /* renamed from: manufacturer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy manufacturer;

    /* renamed from: model$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy model;

    @NotNull
    private final String osName;

    /* renamed from: osVersion$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy osVersion;

    /* renamed from: phoneCarrier$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy phoneCarrier;

    /* renamed from: phoneMCCMNC$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy phoneMCCMNC;

    @NotNull
    private final Ram ram;

    /* renamed from: screenDensity$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy screenDensity;

    /* renamed from: screenDpi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy screenDpi;

    /* renamed from: simCarrier$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy simCarrier;

    /* renamed from: simCountry$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy simCountry;

    @Nullable
    private Long totalDiskSpaceInMBValue;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lio/bidmachine/DeviceInfo$Audio;", "", "()V", "getAudioManager", "Landroid/media/AudioManager;", "context", "Landroid/content/Context;", "getVolumeLevel", "", "(Landroid/content/Context;)Ljava/lang/Float;", "isRingMuted", "", "(Landroid/content/Context;)Ljava/lang/Boolean;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Audio {
        private final AudioManager getAudioManager(Context context) {
            Object systemService = context.getSystemService("audio");
            if (systemService instanceof AudioManager) {
                return (AudioManager) systemService;
            }
            return null;
        }

        @Nullable
        public final Float getVolumeLevel(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AudioManager audioManager = getAudioManager(context);
            if (audioManager == null) {
                return null;
            }
            int streamVolume = audioManager.getStreamVolume(3);
            int streamMaxVolume = audioManager.getStreamMaxVolume(3) - (Build.VERSION.SDK_INT >= 28 ? audioManager.getStreamMinVolume(3) : 0);
            return Float.valueOf(streamMaxVolume == 0 ? 0.0f : (streamVolume - r6) / streamMaxVolume);
        }

        @Nullable
        public final Boolean isRingMuted(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AudioManager audioManager = getAudioManager(context);
            if (audioManager == null) {
                return null;
            }
            int ringerMode = audioManager.getRingerMode();
            boolean z = true;
            if (ringerMode != 0 && ringerMode != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lio/bidmachine/DeviceInfo$Companion;", "", "()V", "OS_NAME", "", C4834q2.p, "Lio/bidmachine/DeviceInfo;", "obtain", "context", "Landroid/content/Context;", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final DeviceInfo obtain(@NotNull Context context) {
            DeviceInfo deviceInfo;
            Intrinsics.checkNotNullParameter(context, "context");
            DeviceInfo deviceInfo2 = DeviceInfo.instance;
            if (deviceInfo2 != null) {
                return deviceInfo2;
            }
            synchronized (DeviceInfo.class) {
                deviceInfo = DeviceInfo.instance;
                if (deviceInfo == null) {
                    deviceInfo = new DeviceInfo(context, null);
                    DeviceInfo.instance = deviceInfo;
                }
            }
            return deviceInfo;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\u0014R(\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R(\u0010\u001a\u001a\u0004\u0018\u00010\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001d"}, d2 = {"Lio/bidmachine/DeviceInfo$Cpu;", "", "<init>", "()V", "", "extract", "read", "", "raw", "findValue", "(Ljava/lang/String;)Ljava/lang/String;", "Lio/bidmachine/q;", "cache", "attach$bidmachine_android_sdk_ba_3_7_1", "(Lio/bidmachine/q;)V", "attach", "Landroid/content/Context;", "context", "update", "(Landroid/content/Context;)V", "Lio/bidmachine/q;", "<set-?>", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", VastAttributes.VENDOR, "getVendor", "Companion", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Cpu {

        @NotNull
        public static final String KEY_NAME = "cpu_name";

        @NotNull
        public static final String KEY_VENDOR = "cpu_vendor";

        @NotNull
        private static final Pattern VALUE_PATTERN;
        private q cache;

        @Nullable
        private String name;

        @Nullable
        private String vendor;

        static {
            Pattern compile = Pattern.compile(":\\s*(.*)");
            Intrinsics.checkNotNullExpressionValue(compile, "compile(\":\\\\s*(.*)\")");
            VALUE_PATTERN = compile;
        }

        private final void extract() {
            read();
            if (TextUtils.isEmpty(this.name)) {
                this.name = Build.BOARD;
            }
            if (TextUtils.isEmpty(this.vendor)) {
                this.vendor = Build.HARDWARE;
            }
        }

        private final String findValue(String raw) {
            Matcher matcher = VALUE_PATTERN.matcher(raw);
            if (matcher.find()) {
                return matcher.group(1);
            }
            return null;
        }

        private final void read() {
            RandomAccessFile randomAccessFile = null;
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile("/proc/cpuinfo", "r");
                while (true) {
                    try {
                        String readLine = randomAccessFile2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (!StringsKt.startsWith$default(readLine, "model name:", false, 2, (Object) null) && !StringsKt.startsWith$default(readLine, "Hardware:", false, 2, (Object) null)) {
                            if (StringsKt.startsWith$default(readLine, "vendor_id:", false, 2, (Object) null)) {
                                this.vendor = findValue(readLine);
                            }
                            if (this.name == null && this.vendor != null) {
                                break;
                            }
                        }
                        this.name = findValue(readLine);
                        if (this.name == null) {
                        }
                    } catch (Exception unused) {
                        randomAccessFile = randomAccessFile2;
                        Utils.close(randomAccessFile);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile = randomAccessFile2;
                        Utils.close(randomAccessFile);
                        throw th;
                    }
                }
                Utils.close(randomAccessFile2);
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }

        public final void attach$bidmachine_android_sdk_ba_3_7_1(@NotNull q cache) {
            Intrinsics.checkNotNullParameter(cache, "cache");
            this.cache = cache;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getVendor() {
            return this.vendor;
        }

        public final void update(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            q qVar = null;
            if (TextUtils.isEmpty(this.name)) {
                q qVar2 = this.cache;
                if (qVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cache");
                    qVar2 = null;
                }
                this.name = qVar2.a(context, KEY_NAME);
            }
            if (TextUtils.isEmpty(this.vendor)) {
                q qVar3 = this.cache;
                if (qVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cache");
                    qVar3 = null;
                }
                this.vendor = qVar3.a(context, KEY_VENDOR);
            }
            if (TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.vendor)) {
                extract();
                q qVar4 = this.cache;
                if (qVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cache");
                    qVar4 = null;
                }
                qVar4.a(context, KEY_NAME, this.name);
                q qVar5 = this.cache;
                if (qVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cache");
                } else {
                    qVar = qVar5;
                }
                qVar.a(context, KEY_VENDOR, this.vendor);
            }
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 +2\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0016\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u0018\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\"R(\u0010%\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R(\u0010)\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(¨\u0006,"}, d2 = {"Lio/bidmachine/DeviceInfo$Gpu;", "", "<init>", "()V", "", "extract", "Landroid/opengl/EGLDisplay;", "initEGLDisplay", "()Landroid/opengl/EGLDisplay;", "eglDisplay", "Landroid/opengl/EGLConfig;", "chooseEGLConfig", "(Landroid/opengl/EGLDisplay;)Landroid/opengl/EGLConfig;", "eglConfig", "Landroid/opengl/EGLSurface;", "createEGLSurface", "(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;)Landroid/opengl/EGLSurface;", "Landroid/opengl/EGLContext;", "createEGLContext", "(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;)Landroid/opengl/EGLContext;", "eglSurface", "eglContext", "makeCurrent", "(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)V", "cleanUpEGL", "Lio/bidmachine/q;", "cache", "attach$bidmachine_android_sdk_ba_3_7_1", "(Lio/bidmachine/q;)V", "attach", "Landroid/content/Context;", "context", "update", "(Landroid/content/Context;)V", "Lio/bidmachine/q;", "", "<set-?>", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", VastAttributes.VENDOR, "getVendor", "Companion", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Gpu {

        @NotNull
        public static final String KEY_NAME = "gpu_name";

        @NotNull
        public static final String KEY_VENDOR = "gpu_vendor";
        private q cache;

        @Nullable
        private String name;

        @Nullable
        private String vendor;

        private final EGLConfig chooseEGLConfig(EGLDisplay eglDisplay) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr = new int[1];
            EGL14.eglChooseConfig(eglDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr, 0);
            if (iArr[0] == 0) {
                return null;
            }
            return eGLConfigArr[0];
        }

        private final void cleanUpEGL(EGLDisplay eglDisplay, EGLSurface eglSurface, EGLContext eglContext) {
            if (eglDisplay != null) {
                makeCurrent(eglDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                if (eglSurface != null) {
                    EGL14.eglDestroySurface(eglDisplay, eglSurface);
                }
                if (eglContext != null) {
                    EGL14.eglDestroyContext(eglDisplay, eglContext);
                }
                EGL14.eglTerminate(eglDisplay);
            }
        }

        private final EGLContext createEGLContext(EGLDisplay eglDisplay, EGLConfig eglConfig) {
            EGLContext eglCreateContext = EGL14.eglCreateContext(eglDisplay, eglConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
            Intrinsics.checkNotNullExpressionValue(eglCreateContext, "eglCreateContext(\n      …          0\n            )");
            return eglCreateContext;
        }

        private final EGLSurface createEGLSurface(EGLDisplay eglDisplay, EGLConfig eglConfig) {
            EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglDisplay, eglConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
            Intrinsics.checkNotNullExpressionValue(eglCreatePbufferSurface, "eglCreatePbufferSurface(…eglConfig, attributes, 0)");
            return eglCreatePbufferSurface;
        }

        private final void extract() {
            EGLContext eGLContext;
            EGLSurface eGLSurface;
            EGLContext eGLContext2;
            EGLDisplay eGLDisplay;
            EGLDisplay initEGLDisplay;
            EGLConfig chooseEGLConfig;
            EGLDisplay eGLDisplay2 = null;
            r0 = null;
            EGLContext eGLContext3 = null;
            EGLSurface eGLSurface2 = null;
            EGLDisplay eGLDisplay3 = null;
            try {
                initEGLDisplay = initEGLDisplay();
                try {
                    chooseEGLConfig = chooseEGLConfig(initEGLDisplay);
                } catch (Exception unused) {
                    eGLSurface = null;
                    eGLDisplay3 = initEGLDisplay;
                    eGLContext2 = null;
                } catch (Throwable th) {
                    th = th;
                    eGLSurface = null;
                    eGLDisplay2 = initEGLDisplay;
                    eGLContext = null;
                }
            } catch (Exception unused2) {
                eGLContext2 = null;
                eGLSurface = null;
            } catch (Throwable th2) {
                th = th2;
                eGLContext = null;
                eGLSurface = null;
            }
            if (chooseEGLConfig == null) {
                eGLDisplay = initEGLDisplay;
                eGLContext2 = null;
                cleanUpEGL(eGLDisplay, eGLSurface2, eGLContext2);
            }
            eGLSurface = createEGLSurface(initEGLDisplay, chooseEGLConfig);
            try {
                eGLContext3 = createEGLContext(initEGLDisplay, chooseEGLConfig);
                makeCurrent(initEGLDisplay, eGLSurface, eGLContext3);
                this.name = GLES20.glGetString(7937);
                this.vendor = GLES20.glGetString(7936);
                eGLDisplay = initEGLDisplay;
                eGLContext2 = eGLContext3;
            } catch (Exception unused3) {
                eGLContext2 = eGLContext3;
                eGLDisplay3 = initEGLDisplay;
                eGLDisplay = eGLDisplay3;
                eGLSurface2 = eGLSurface;
                cleanUpEGL(eGLDisplay, eGLSurface2, eGLContext2);
            } catch (Throwable th3) {
                th = th3;
                eGLContext = eGLContext3;
                eGLDisplay2 = initEGLDisplay;
                cleanUpEGL(eGLDisplay2, eGLSurface, eGLContext);
                throw th;
            }
            eGLSurface2 = eGLSurface;
            cleanUpEGL(eGLDisplay, eGLSurface2, eGLContext2);
        }

        private final EGLDisplay initEGLDisplay() {
            EGLDisplay eglDisplay = EGL14.eglGetDisplay(0);
            int[] iArr = new int[2];
            EGL14.eglInitialize(eglDisplay, iArr, 0, iArr, 1);
            Intrinsics.checkNotNullExpressionValue(eglDisplay, "eglDisplay");
            return eglDisplay;
        }

        private final void makeCurrent(EGLDisplay eglDisplay, EGLSurface eglSurface, EGLContext eglContext) {
            EGL14.eglMakeCurrent(eglDisplay, eglSurface, eglSurface, eglContext);
        }

        public final void attach$bidmachine_android_sdk_ba_3_7_1(@NotNull q cache) {
            Intrinsics.checkNotNullParameter(cache, "cache");
            this.cache = cache;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @Nullable
        public final String getVendor() {
            return this.vendor;
        }

        public final void update(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            q qVar = null;
            if (TextUtils.isEmpty(this.name)) {
                q qVar2 = this.cache;
                if (qVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cache");
                    qVar2 = null;
                }
                this.name = qVar2.a(context, KEY_NAME);
            }
            if (TextUtils.isEmpty(this.vendor)) {
                q qVar3 = this.cache;
                if (qVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cache");
                    qVar3 = null;
                }
                this.vendor = qVar3.a(context, KEY_VENDOR);
            }
            if (TextUtils.isEmpty(this.name) || TextUtils.isEmpty(this.vendor)) {
                extract();
                q qVar4 = this.cache;
                if (qVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cache");
                    qVar4 = null;
                }
                qVar4.a(context, KEY_NAME, this.name);
                q qVar5 = this.cache;
                if (qVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cache");
                } else {
                    qVar = qVar5;
                }
                qVar.a(context, KEY_VENDOR, this.vendor);
            }
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012R$\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R$\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007¨\u0006\u0014"}, d2 = {"Lio/bidmachine/DeviceInfo$Ram;", "", "()V", "<set-?>", "", "freeMemBytes", "getFreeMemBytes", "()Ljava/lang/Long;", "Ljava/lang/Long;", "totalMemBytes", "getTotalMemBytes", "findValue", "", "line", "parseValue", "value", "(Ljava/lang/String;)Ljava/lang/Long;", "update", "", "Companion", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Ram {

        @NotNull
        private static final Pattern DIGITS_PATTERN;

        @Nullable
        private Long freeMemBytes;

        @Nullable
        private Long totalMemBytes;

        static {
            Pattern compile = Pattern.compile("(\\d+)");
            Intrinsics.checkNotNullExpressionValue(compile, "compile(\"(\\\\d+)\")");
            DIGITS_PATTERN = compile;
        }

        private final String findValue(String line) {
            if (line == null) {
                return null;
            }
            Matcher matcher = DIGITS_PATTERN.matcher(line);
            if (matcher.find()) {
                return matcher.group(1);
            }
            return null;
        }

        private final Long parseValue(String value) {
            if (value != null) {
                try {
                    return Long.valueOf(Long.parseLong(value) * 1024);
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }

        @Nullable
        public final Long getFreeMemBytes() {
            return this.freeMemBytes;
        }

        @Nullable
        public final Long getTotalMemBytes() {
            return this.totalMemBytes;
        }

        public final void update() {
            RandomAccessFile randomAccessFile = null;
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO, "r");
                while (true) {
                    try {
                        String readLine = randomAccessFile2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (StringsKt.startsWith$default(readLine, "MemTotal:", false, 2, (Object) null)) {
                            this.totalMemBytes = parseValue(findValue(readLine));
                        } else if (StringsKt.startsWith$default(readLine, "MemAvailable:", false, 2, (Object) null)) {
                            this.freeMemBytes = parseValue(findValue(readLine));
                        }
                        if (this.totalMemBytes != null && this.freeMemBytes != null) {
                            break;
                        }
                    } catch (Exception unused) {
                        randomAccessFile = randomAccessFile2;
                        Utils.close(randomAccessFile);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        randomAccessFile = randomAccessFile2;
                        Utils.close(randomAccessFile);
                        throw th;
                    }
                }
                Utils.close(randomAccessFile2);
            } catch (Exception unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DeviceType mo4828invoke() {
            return DeviceUtils.getDeviceType(DeviceInfo.this.appContext);
        }
    }

    static final class b extends Lambda implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo4828invoke() {
            return DeviceUtils.isNetworkRoaming(DeviceInfo.this.appContext);
        }
    }

    static final class c extends Lambda implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo4828invoke() {
            return Boolean.valueOf(DeviceUtils.isTablet(DeviceInfo.this.appContext));
        }
    }

    static final class d extends Lambda implements Function0 {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return DeviceUtils.getManufacturer();
        }
    }

    static final class e extends Lambda implements Function0 {
        public static final e a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return DeviceUtils.getModel();
        }
    }

    static final class f extends Lambda implements Function0 {
        public static final f a = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return String.valueOf(Build.VERSION.SDK_INT);
        }
    }

    static final class g extends Lambda implements Function0 {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return DeviceUtils.getPhoneNetworkOperatorName(DeviceInfo.this.appContext);
        }
    }

    static final class h extends Lambda implements Function0 {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return DeviceUtils.getPhoneMCCMNC(DeviceInfo.this.appContext);
        }
    }

    static final class i extends Lambda implements Function0 {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float mo4828invoke() {
            return Float.valueOf(DeviceUtils.getScreenDensity(DeviceInfo.this.appContext));
        }
    }

    static final class j extends Lambda implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo4828invoke() {
            return Integer.valueOf(io.bidmachine.utils.DeviceUtils.getScreenDpi(DeviceInfo.this.appContext));
        }
    }

    static final class k extends Lambda implements Function0 {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return DeviceUtils.getPhoneSimOperatorName(DeviceInfo.this.appContext);
        }
    }

    static final class l extends Lambda implements Function0 {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo4828invoke() {
            return DeviceUtils.getPhoneSimCountryIso(DeviceInfo.this.appContext);
        }
    }

    public /* synthetic */ DeviceInfo(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final String getKernelVersionThroughProcVersion() {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        String str = null;
        try {
            randomAccessFile = new RandomAccessFile("/proc/version", "r");
            try {
                str = randomAccessFile.readLine();
                Utils.close(randomAccessFile);
            } catch (Exception unused) {
                Utils.close(randomAccessFile);
                return str;
            } catch (Throwable th) {
                th = th;
                randomAccessFile2 = randomAccessFile;
                Utils.close(randomAccessFile2);
                throw th;
            }
        } catch (Exception unused2) {
            randomAccessFile = null;
        } catch (Throwable th2) {
            th = th2;
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String getKernelVersionThroughUName() {
        Process process;
        Process process2;
        BufferedReader bufferedReader;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2 = null;
        r0 = null;
        String str = null;
        try {
            process2 = Runtime.getRuntime().exec("uname -a");
            try {
                inputStreamReader = new InputStreamReader(process2.getInputStream());
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        str = bufferedReader.readLine();
                        Utils.close(bufferedReader);
                        Utils.close(inputStreamReader);
                        process2.destroy();
                    } catch (Exception unused) {
                        Utils.close(bufferedReader);
                        Utils.close(inputStreamReader);
                        if (process2 != null) {
                            process2.destroy();
                        }
                        return str;
                    } catch (Throwable th) {
                        th = th;
                        inputStreamReader2 = inputStreamReader;
                        process = process2;
                        Utils.close(bufferedReader);
                        Utils.close(inputStreamReader2);
                        if (process != null) {
                            throw th;
                        }
                        process.destroy();
                        throw th;
                    }
                } catch (Exception unused2) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    bufferedReader = null;
                    inputStreamReader2 = inputStreamReader;
                    process = process2;
                    th = th2;
                }
            } catch (Exception unused3) {
                inputStreamReader = null;
                bufferedReader = null;
                Utils.close(bufferedReader);
                Utils.close(inputStreamReader);
                if (process2 != null) {
                }
                return str;
            } catch (Throwable th3) {
                process = process2;
                th = th3;
                bufferedReader = null;
                Utils.close(bufferedReader);
                Utils.close(inputStreamReader2);
                if (process != null) {
                }
            }
        } catch (Exception unused4) {
            process2 = null;
        } catch (Throwable th4) {
            th = th4;
            process = null;
        }
        return str;
    }

    @NotNull
    public static final DeviceInfo obtain(@NotNull Context context) {
        return INSTANCE.obtain(context);
    }

    @NotNull
    public final Audio getAudio() {
        return this.audio;
    }

    @Nullable
    public final Long getAvailableDiskSpaceInMB() {
        if (!Utils.isExternalMemoryAvailable()) {
            return null;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        return Long.valueOf((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / 1048576);
    }

    @NotNull
    public final Cpu getCpu() {
        return this.cpu;
    }

    @NotNull
    public final DeviceType getDeviceType() {
        return (DeviceType) this.deviceType.getValue();
    }

    @NotNull
    public final Gpu getGpu() {
        return this.gpu;
    }

    @Nullable
    public final String getHWV() {
        String str = this.hwv;
        if (str != null) {
            return str;
        }
        String kernelVersionThroughProcVersion = getKernelVersionThroughProcVersion();
        if (!TextUtils.isEmpty(kernelVersionThroughProcVersion)) {
            this.hwv = kernelVersionThroughProcVersion;
            return kernelVersionThroughProcVersion;
        }
        String kernelVersionThroughUName = getKernelVersionThroughUName();
        this.hwv = kernelVersionThroughUName;
        return kernelVersionThroughUName;
    }

    @NotNull
    public final String getManufacturer() {
        return (String) this.manufacturer.getValue();
    }

    @NotNull
    public final String getModel() {
        return (String) this.model.getValue();
    }

    @NotNull
    public final String getOsName() {
        return this.osName;
    }

    @NotNull
    public final String getOsVersion() {
        return (String) this.osVersion.getValue();
    }

    @Nullable
    public final String getPhoneCarrier() {
        return (String) this.phoneCarrier.getValue();
    }

    @Nullable
    public final String getPhoneMCCMNC() {
        return (String) this.phoneMCCMNC.getValue();
    }

    @NotNull
    public final Ram getRam() {
        return this.ram;
    }

    public final float getScreenDensity() {
        return ((Number) this.screenDensity.getValue()).floatValue();
    }

    public final int getScreenDpi() {
        return ((Number) this.screenDpi.getValue()).intValue();
    }

    @Nullable
    public final String getSimCarrier() {
        return (String) this.simCarrier.getValue();
    }

    @Nullable
    public final String getSimCountry() {
        return (String) this.simCountry.getValue();
    }

    @Nullable
    public final Long getTotalDiskSpaceInMB() {
        Long l2 = this.totalDiskSpaceInMBValue;
        if (l2 != null) {
            return Long.valueOf(l2.longValue());
        }
        if (!Utils.isExternalMemoryAvailable()) {
            return null;
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long blockSizeLong = (statFs.getBlockSizeLong() * statFs.getBlockCountLong()) / 1048576;
        Long valueOf = Long.valueOf(blockSizeLong);
        this.totalDiskSpaceInMBValue = Long.valueOf(blockSizeLong);
        return valueOf;
    }

    public final boolean isDeviceRooted() {
        Boolean bool = this.isRooted;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = true;
        try {
            String[] strArr = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
            for (int i2 = 0; i2 < 8; i2++) {
                if (new File(strArr[i2]).exists()) {
                    this.isRooted = Boolean.TRUE;
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        Process process = null;
        try {
            try {
                process = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
                if (new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() == null) {
                    z = false;
                }
                this.isRooted = Boolean.valueOf(z);
                process.destroy();
                return z;
            } catch (Exception unused2) {
                this.isRooted = Boolean.FALSE;
                if (process == null) {
                    return false;
                }
                process.destroy();
                return false;
            }
        } catch (Throwable th) {
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
    }

    @Nullable
    public final Boolean isNetworkInRoaming() {
        return (Boolean) this.isNetworkInRoaming.getValue();
    }

    public final boolean isTablet() {
        return ((Boolean) this.isTablet.getValue()).booleanValue();
    }

    public final void updateHwInfo(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.cpu.update(context);
        this.gpu.update(context);
        this.ram.update();
    }

    private DeviceInfo(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.appContext = applicationContext != null ? applicationContext : context;
        this.osName = "android";
        this.osVersion = LazyKt.lazy(f.a);
        this.manufacturer = LazyKt.lazy(d.a);
        this.model = LazyKt.lazy(e.a);
        this.screenDpi = LazyKt.lazy(new j());
        this.screenDensity = LazyKt.lazy(new i());
        this.deviceType = LazyKt.lazy(new a());
        this.isTablet = LazyKt.lazy(new c());
        this.phoneMCCMNC = LazyKt.lazy(new h());
        this.phoneCarrier = LazyKt.lazy(new g());
        this.simCarrier = LazyKt.lazy(new k());
        this.simCountry = LazyKt.lazy(new l());
        this.isNetworkInRoaming = LazyKt.lazy(new b());
        this.audio = new Audio();
        this.ram = new Ram();
        q qVar = new q();
        this.cache = qVar;
        Cpu cpu = new Cpu();
        cpu.attach$bidmachine_android_sdk_ba_3_7_1(qVar);
        this.cpu = cpu;
        Gpu gpu = new Gpu();
        gpu.attach$bidmachine_android_sdk_ba_3_7_1(qVar);
        this.gpu = gpu;
    }
}
