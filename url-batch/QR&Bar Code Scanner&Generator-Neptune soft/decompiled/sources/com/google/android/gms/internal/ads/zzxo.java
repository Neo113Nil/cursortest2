package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzxo implements zzxn {
    private final WindowManager zza;

    private zzxo(WindowManager windowManager) {
        this.zza = windowManager;
    }

    public static zzxn zzc(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            return new zzxo(windowManager);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzxn
    public final void zzb(zzxl zzxlVar) {
        zzxr.zzb(zzxlVar.zza, this.zza.getDefaultDisplay());
    }
}
