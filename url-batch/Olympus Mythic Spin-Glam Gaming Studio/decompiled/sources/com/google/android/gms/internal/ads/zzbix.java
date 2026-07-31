package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes13.dex */
public abstract class zzbix {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    /* synthetic */ zzbix(int i, String str, Object obj, Object obj2, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        com.google.android.gms.ads.internal.client.zzba.zzb().zza(this);
    }

    public static zzbix zzh(int i, String str, int i2, int i3) {
        return new zzbit(1, str, Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static zzbix zzi(int i, String str, long j, long j2) {
        return new zzbiu(1, str, Long.valueOf(j), Long.valueOf(j2));
    }

    public static zzbix zzj(int i, String str, float f, float f2) {
        return new zzbiv(1, str, Float.valueOf(f), Float.valueOf(f2));
    }

    public static zzbix zzk(int i, String str) {
        zzbiw zzbiwVar = new zzbiw(1, "gads:sdk_core_constants:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzba.zzb().zzb(zzbiwVar);
        return zzbiwVar;
    }

    public static zzbix zzl(int i, String str) {
        zzbiw zzbiwVar = new zzbiw(1, "gads:sdk_core_constants_service:experiment_id", null, null);
        com.google.android.gms.ads.internal.client.zzba.zzb().zzc(zzbiwVar);
        return zzbiwVar;
    }

    public abstract Object zza(Bundle bundle);

    public abstract void zzb(SharedPreferences.Editor editor, Object obj);

    protected abstract Object zzc(JSONObject jSONObject);

    protected abstract Object zzd(SharedPreferences sharedPreferences);

    public final String zze() {
        return this.zzb;
    }

    public final Object zzf() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().zzb() ? this.zzd : this.zzc;
    }

    public final Object zzg() {
        return com.google.android.gms.ads.internal.client.zzba.zzc().zzd(this);
    }

    public final int zzm() {
        return this.zza;
    }
}
