package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzeyl extends zzext {
    public zzeyl(Context context, Executor executor, zzcgv zzcgvVar, zzfab zzfabVar, zzeyj zzeyjVar, zzfdb zzfdbVar, VersionInfoParcel versionInfoParcel) {
        super(context, executor, zzcgvVar, zzfabVar, zzeyjVar, zzfdbVar, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.zzext
    protected final /* bridge */ /* synthetic */ zzcuy zzc(zzcoh zzcohVar, zzcvb zzcvbVar, zzdbs zzdbsVar) {
        zzcnx zzi = this.zza.zzi();
        zzi.zzd(zzcvbVar);
        zzi.zze(zzdbsVar);
        return zzi;
    }
}
