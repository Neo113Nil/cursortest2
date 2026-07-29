package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzxd implements DisplayManager.DisplayListener, zzxb {
    private final DisplayManager zza;
    private zzwz zzb;

    private zzxd(DisplayManager displayManager) {
        this.zza = displayManager;
    }

    public static zzxb zzc(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return new zzxd(displayManager);
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
        zzwz zzwzVar = this.zzb;
        if (zzwzVar == null || i != 0) {
            return;
        }
        zzxf.zzb(zzwzVar.zza, zzd());
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final void zza() {
        this.zza.unregisterDisplayListener(this);
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzxb
    public final void zzb(zzwz zzwzVar) {
        this.zzb = zzwzVar;
        this.zza.registerDisplayListener(this, zzeg.zzC(null));
        zzxf.zzb(zzwzVar.zza, zzd());
    }
}
