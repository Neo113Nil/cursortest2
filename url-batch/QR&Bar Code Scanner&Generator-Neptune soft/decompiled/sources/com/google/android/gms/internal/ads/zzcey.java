package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzcey implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcez zza;
    private final String zzb;

    public zzcey(zzcez zzcezVar, String str) {
        this.zza = zzcezVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        List<zzcex> list;
        synchronized (this.zza) {
            list = this.zza.zzb;
            for (zzcex zzcexVar : list) {
                zzcexVar.zza.zzb(zzcexVar.zzb, sharedPreferences, this.zzb, str);
            }
        }
    }
}
