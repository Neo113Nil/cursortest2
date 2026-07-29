package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzcdr implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcds zza;
    private final String zzb;

    public zzcdr(zzcds zzcdsVar, String str) {
        this.zza = zzcdsVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzcdq> list;
        synchronized (this.zza) {
            list = this.zza.zzb;
            for (zzcdq zzcdqVar : list) {
                zzcdqVar.zza.zzb(zzcdqVar.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
