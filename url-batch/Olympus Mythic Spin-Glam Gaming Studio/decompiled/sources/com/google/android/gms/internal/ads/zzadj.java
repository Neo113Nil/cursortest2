package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.RequiresApi;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@RequiresApi
/* loaded from: classes8.dex */
final class zzadj {
    public static boolean zza(Context context) {
        boolean isHdr;
        Display.HdrCapabilities hdrCapabilities;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null) {
            isHdr = display.isHdr();
            if (!isHdr || (hdrCapabilities = display.getHdrCapabilities()) == null) {
                return false;
            }
            for (int i : hdrCapabilities.getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
