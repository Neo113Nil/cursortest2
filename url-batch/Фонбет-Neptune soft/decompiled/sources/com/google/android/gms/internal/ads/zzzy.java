package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.google.firebase.messaging.Constants;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzzy {
    public static boolean zza(Context context) {
        boolean isHdr;
        Display.HdrCapabilities hdrCapabilities;
        int[] supportedHdrTypes;
        DisplayManager displayManager = (DisplayManager) context.getSystemService(Constants.ScionAnalytics.MessageType.DISPLAY_NOTIFICATION);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            return false;
        }
        isHdr = display.isHdr();
        if (!isHdr) {
            return false;
        }
        hdrCapabilities = display.getHdrCapabilities();
        supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
        for (int i : supportedHdrTypes) {
            if (i == 1) {
                return true;
            }
        }
        return false;
    }
}
