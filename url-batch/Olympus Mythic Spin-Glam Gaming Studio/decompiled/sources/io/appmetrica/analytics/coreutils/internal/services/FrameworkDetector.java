package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes4.dex */
public class FrameworkDetector {
    private static final String a = new FrameworkDetector().detectFramework();

    @VisibleForTesting
    public FrameworkDetector() {
    }

    @NonNull
    public static String framework() {
        return a;
    }

    public static boolean isNative() {
        return "native".equals(a);
    }

    @NonNull
    @VisibleForTesting
    public String detectFramework() {
        if (ReflectionUtils.detectClassExists(MadeWithUnityDetector.UNITY_PLAYER_CLASS_NAME)) {
            return "unity";
        }
        if (ReflectionUtils.detectClassExists("mono.MonoPackageManager")) {
            return PluginErrorDetails.Platform.XAMARIN;
        }
        if (ReflectionUtils.detectClassExists("org.apache.cordova.CordovaPlugin")) {
            return PluginErrorDetails.Platform.CORDOVA;
        }
        if (ReflectionUtils.detectClassExists("com.facebook.react.ReactRootView")) {
            return "react";
        }
        if (!ReflectionUtils.detectClassExists("io.flutter.embedding.engine.FlutterEngine")) {
            return "native";
        }
        return PluginErrorDetails.Platform.FLUTTER;
    }
}
