package org.chromium.net;

import androidx.annotation.VisibleForTesting;

/* loaded from: classes14.dex */
public final class GURLUtils {

    @VisibleForTesting
    public interface Natives {
        String getOrigin(String str);
    }

    public static String getOrigin(String str) {
        return GURLUtilsJni.get().getOrigin(str);
    }
}
