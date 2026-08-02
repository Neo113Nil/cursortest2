package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzxp implements DisplayManager.DisplayListener, zzxn {
    private final DisplayManager zza;
    private zzxl zzb;

    private zzxp(DisplayManager displayManager) {
        this.zza = displayManager;
    }

    public static zzxn zzc(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new zzxp(displayManager);
        }
        return null;
    }

    private final Display zzd() {
        return this.zza.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        zzxl zzxlVar = this.zzb;
        if (zzxlVar == null || i != 0) {
            return;
        }
        zzxr.zzb(zzxlVar.zza, zzd());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zza() {
        this.zza.unregisterDisplayListener(this);
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzb(zzxl zzxlVar) {
        this.zzb = zzxlVar;
        this.zza.registerDisplayListener(this, zzen.zzD(null));
        zzxr.zzb(zzxlVar.zza, zzd());
    }
}
