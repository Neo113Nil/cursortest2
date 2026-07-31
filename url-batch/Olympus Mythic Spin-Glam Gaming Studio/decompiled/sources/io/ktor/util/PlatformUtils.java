package io.ktor.util;

import io.ktor.util.Platform;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlatformUtils.kt */
/* loaded from: classes6.dex */
public final class PlatformUtils {
    public static final PlatformUtils INSTANCE;
    private static final boolean IS_BROWSER;
    private static final boolean IS_DEVELOPMENT_MODE;
    private static final boolean IS_JS;
    private static final boolean IS_JVM;
    private static final boolean IS_NATIVE;
    private static final boolean IS_NEW_MM_ENABLED;
    private static final boolean IS_NODE;
    private static final boolean IS_WASM_JS;

    private PlatformUtils() {
    }

    static {
        PlatformUtils platformUtils = new PlatformUtils();
        INSTANCE = platformUtils;
        PlatformUtilsJvmKt.getPlatform(platformUtils);
        IS_BROWSER = false;
        PlatformUtilsJvmKt.getPlatform(platformUtils);
        IS_NODE = false;
        PlatformUtilsJvmKt.getPlatform(platformUtils);
        IS_JS = false;
        PlatformUtilsJvmKt.getPlatform(platformUtils);
        IS_WASM_JS = false;
        IS_JVM = Intrinsics.areEqual(PlatformUtilsJvmKt.getPlatform(platformUtils), Platform.Jvm.INSTANCE);
        IS_NATIVE = Intrinsics.areEqual(PlatformUtilsJvmKt.getPlatform(platformUtils), Platform.Native.INSTANCE);
        IS_DEVELOPMENT_MODE = PlatformUtilsJvmKt.isDevelopmentMode(platformUtils);
        IS_NEW_MM_ENABLED = true;
    }

    public final boolean getIS_BROWSER() {
        return IS_BROWSER;
    }

    public final boolean getIS_DEVELOPMENT_MODE() {
        return IS_DEVELOPMENT_MODE;
    }
}
