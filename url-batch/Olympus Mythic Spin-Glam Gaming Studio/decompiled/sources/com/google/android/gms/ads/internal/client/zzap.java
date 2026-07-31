package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzcaq;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzap extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbvu zzc;
    final /* synthetic */ zzaw zzd;

    zzap(zzaw zzawVar, Context context, String str, zzbvu zzbvuVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbvuVar;
        Objects.requireNonNull(zzawVar);
        this.zzd = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzl(this.zza, "native_ad");
        return new zzff();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        Context context = this.zza;
        zzbjg.zza(context);
        if (!((Boolean) zzba.zzc().zzd(zzbjg.zzmo)).booleanValue()) {
            return this.zzd.zzn().zza(this.zza, this.zzb, this.zzc);
        }
        try {
            IBinder zze = ((zzbr) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", zzao.zza)).zze(ObjectWrapper.wrap(context), this.zzb, this.zzc, ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(zze);
        } catch (RemoteException e) {
            e = e;
            zzaw zzawVar = this.zzd;
            zzawVar.zzs(zzcaq.zza(this.zza));
            zzawVar.zzr().zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            e = e2;
            zzaw zzawVar2 = this.zzd;
            zzawVar2.zzs(zzcaq.zza(this.zza));
            zzawVar2.zzr().zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            zzaw zzawVar22 = this.zzd;
            zzawVar22.zzs(zzcaq.zza(this.zza));
            zzawVar22.zzr().zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzc(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, ModuleDescriptor.MODULE_VERSION);
    }
}
