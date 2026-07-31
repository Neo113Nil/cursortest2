package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public interface zzcif extends zzcne, zzcnh, zzbte {
    Context getContext();

    void setBackgroundColor(int i);

    void zzA(int i);

    void zzB(int i);

    @Nullable
    zzchu zzdm();

    void zzdn(boolean z);

    @Nullable
    zzcms zzh();

    @Nullable
    zzbjs zzi();

    @Nullable
    Activity zzj();

    @Nullable
    com.google.android.gms.ads.internal.zza zzk();

    void zzl();

    String zzm();

    @Nullable
    String zzn();

    void zzo(int i);

    int zzp();

    zzbjt zzq();

    @Nullable
    zzcjs zzr(String str);

    VersionInfoParcel zzs();

    void zzt(String str, zzcjs zzcjsVar);

    void zzu(boolean z, long j);

    void zzv(int i);

    void zzw(zzcms zzcmsVar);

    int zzx();

    int zzy();

    void zzz();
}
