package org.chromium.net.impl;

import android.content.Context;
import android.net.http.HttpEngine;
import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.RequiresExtension;
import org.chromium.base.metrics.ScopedSysTraceEvent;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* loaded from: classes12.dex */
public class HttpEngineNativeProvider extends CronetProvider {
    static final int EXT_API_LEVEL = 31;
    static final int EXT_VERSION = 7;
    public static final String PROVIDER_NAME_HTTPENGINE_NATIVE = "HttpEngine-Native-Provider";

    public HttpEngineNativeProvider(Context context) {
        super(context);
    }

    @Override // org.chromium.net.CronetProvider
    @RequiresExtension
    public CronetEngine.Builder createBuilder() {
        ScopedSysTraceEvent scoped = ScopedSysTraceEvent.scoped("HttpEngineNativeProvider#createBuilder");
        try {
            HttpEngineNativeProvider$$ExternalSyntheticApiModelOutline1.m();
            ExperimentalCronetEngine.Builder builder = new ExperimentalCronetEngine.Builder(new AndroidHttpEngineBuilderWrapper(HttpEngineNativeProvider$$ExternalSyntheticApiModelOutline0.m(this.mContext)));
            if (scoped != null) {
                scoped.close();
            }
            return builder;
        } catch (Throwable th) {
            if (scoped != null) {
                try {
                    scoped.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // org.chromium.net.CronetProvider
    public String getName() {
        return PROVIDER_NAME_HTTPENGINE_NATIVE;
    }

    @Override // org.chromium.net.CronetProvider
    @RequiresExtension
    public String getVersion() {
        String versionString;
        versionString = HttpEngine.getVersionString();
        return versionString;
    }

    @Override // org.chromium.net.CronetProvider
    public boolean isEnabled() {
        return isHttpEngineAvailable();
    }

    static boolean isHttpEngineAvailable() {
        int extensionVersion;
        if (Build.VERSION.SDK_INT >= 30) {
            extensionVersion = SdkExtensions.getExtensionVersion(31);
            if (extensionVersion >= 7) {
                return true;
            }
        }
        return false;
    }
}
