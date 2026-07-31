package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzduz extends zzbng {

    @Nullable
    private final String zza;
    private final zzdqm zzb;
    private final zzdqr zzc;

    public zzduz(@Nullable String str, zzdqm zzdqmVar, zzdqr zzdqrVar) {
        this.zza = str;
        this.zzb = zzdqmVar;
        this.zzc = zzdqrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final IObjectWrapper zza() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final String zzb() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final List zzc() throws RemoteException {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final String zzd() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final zzbmv zze() throws RemoteException {
        return this.zzc.zzP();
    }

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final String zzf() throws RemoteException {
        return this.zzc.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final double zzg() throws RemoteException {
        return this.zzc.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final String zzh() throws RemoteException {
        return this.zzc.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final String zzi() throws RemoteException {
        return this.zzc.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final Bundle zzj() throws RemoteException {
        return this.zzc.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final void zzk() throws RemoteException {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final com.google.android.gms.ads.internal.client.zzea zzl() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final void zzm(Bundle bundle) throws RemoteException {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final boolean zzn(Bundle bundle) throws RemoteException {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final void zzo(Bundle bundle) throws RemoteException {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final zzbmo zzp() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final IObjectWrapper zzq() throws RemoteException {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final String zzr() throws RemoteException {
        return this.zza;
    }
}
