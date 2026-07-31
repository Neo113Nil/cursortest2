package com.google.android.play.core.hsdp.service;

import android.os.IBinder;
import java.util.Map;

/* compiled from: com.google.android.play:hsdp@@2.0.1 */
/* loaded from: classes14.dex */
final class zzd extends HsdpPrewarmRequest {
    private final String zza;
    private final String zzb;
    private final Map zzc;
    private final IBinder zzd;

    /* synthetic */ zzd(String str, String str2, Map map, IBinder iBinder, zzc zzcVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = map;
        this.zzd = iBinder;
    }

    public final boolean equals(Object obj) {
        IBinder iBinder;
        if (obj == this) {
            return true;
        }
        if (obj instanceof HsdpPrewarmRequest) {
            HsdpPrewarmRequest hsdpPrewarmRequest = (HsdpPrewarmRequest) obj;
            if (this.zza.equals(hsdpPrewarmRequest.targetAppPackageName()) && this.zzb.equals(hsdpPrewarmRequest.referrer()) && this.zzc.equals(hsdpPrewarmRequest.extraQueryParams()) && ((iBinder = this.zzd) != null ? iBinder.equals(hsdpPrewarmRequest.windowToken()) : hsdpPrewarmRequest.windowToken() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpPrewarmRequest
    public final Map extraQueryParams() {
        return this.zzc;
    }

    public final int hashCode() {
        int hashCode = ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb.hashCode()) * 1000003) ^ this.zzc.hashCode();
        IBinder iBinder = this.zzd;
        return (hashCode * 1000003) ^ (iBinder == null ? 0 : iBinder.hashCode());
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpPrewarmRequest
    public final String referrer() {
        return this.zzb;
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpPrewarmRequest
    public final String targetAppPackageName() {
        return this.zza;
    }

    public final String toString() {
        IBinder iBinder = this.zzd;
        return "HsdpPrewarmRequest{targetAppPackageName=" + this.zza + ", referrer=" + this.zzb + ", extraQueryParams=" + this.zzc.toString() + ", windowToken=" + String.valueOf(iBinder) + "}";
    }

    @Override // com.google.android.play.core.hsdp.service.HsdpPrewarmRequest
    public final IBinder windowToken() {
        return this.zzd;
    }
}
