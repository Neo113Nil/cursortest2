package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzdvb extends zzbni {

    @Nullable
    private final String zza;
    private final zzdqm zzb;
    private final zzdqr zzc;

    public zzdvb(@Nullable String str, zzdqm zzdqmVar, zzdqr zzdqrVar) {
        this.zza = str;
        this.zzb = zzdqmVar;
        this.zzc = zzdqrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final IObjectWrapper zza() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final String zzb() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final List zzc() throws RemoteException {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final String zzd() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final zzbmv zze() throws RemoteException {
        return this.zzc.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final String zzf() throws RemoteException {
        return this.zzc.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final String zzg() throws RemoteException {
        return this.zzc.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final Bundle zzh() throws RemoteException {
        return this.zzc.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzi() throws RemoteException {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final com.google.android.gms.ads.internal.client.zzea zzj() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzk(Bundle bundle) throws RemoteException {
        this.zzb.zzc(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final boolean zzl(Bundle bundle) throws RemoteException {
        return this.zzb.zze(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final void zzm(Bundle bundle) throws RemoteException {
        this.zzb.zzf(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final zzbmo zzn() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final IObjectWrapper zzo() throws RemoteException {
        return this.zzc.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzbnj
    public final String zzp() throws RemoteException {
        return this.zza;
    }
}
