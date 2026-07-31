package org.chromium.base;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import internal.org.chromium.build.BuildConfig;
import internal.org.jni_zero.CalledByNative;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class ApkAssets {
    private static String sLastError;

    @CalledByNative
    public static long[] open(String str, String str2) {
        String maybeAddSuffix = maybeAddSuffix(str);
        AssetFileDescriptor assetFileDescriptor = null;
        sLastError = null;
        try {
            try {
                Context applicationContext = ContextUtils.getApplicationContext();
                if (!TextUtils.isEmpty(str2) && BundleUtils.isIsolatedSplitInstalled(str2)) {
                    applicationContext = BundleUtils.createIsolatedSplitContext(str2);
                }
                assetFileDescriptor = applicationContext.getAssets().openNonAssetFd(maybeAddSuffix);
                long[] jArr = {assetFileDescriptor.getParcelFileDescriptor().detachFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength()};
                try {
                    assetFileDescriptor.close();
                } catch (IOException e) {
                    Log.e("ApkAssets", "Unable to close AssetFileDescriptor", (Throwable) e);
                }
                return jArr;
            } catch (IOException e2) {
                sLastError = "Error while loading asset " + maybeAddSuffix + " from " + str2 + ": " + String.valueOf(e2);
                if (!TextUtils.isEmpty(e2.getMessage()) && !e2.getMessage().equals(maybeAddSuffix)) {
                    Log.e("ApkAssets", sLastError);
                }
                long[] jArr2 = {-1, -1, -1};
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException e3) {
                        Log.e("ApkAssets", "Unable to close AssetFileDescriptor", (Throwable) e3);
                    }
                }
                return jArr2;
            }
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e4) {
                    Log.e("ApkAssets", "Unable to close AssetFileDescriptor", (Throwable) e4);
                }
            }
            throw th;
        }
    }

    private static String maybeAddSuffix(String str) {
        if (BuildConfig.APK_ASSETS_SUFFIX == null || Arrays.binarySearch(BuildConfig.APK_ASSETS_SUFFIXED_LIST, str) < 0) {
            return str;
        }
        return str + BuildConfig.APK_ASSETS_SUFFIX;
    }

    @CalledByNative
    private static String takeLastErrorString() {
        String str = sLastError;
        sLastError = null;
        return str;
    }
}
