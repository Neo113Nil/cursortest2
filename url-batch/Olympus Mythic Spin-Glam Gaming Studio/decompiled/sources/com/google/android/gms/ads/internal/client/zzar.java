package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzcaq;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzar extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvu zzb;
    final /* synthetic */ zzaw zzc;

    zzar(zzaw zzawVar, Context context, zzbvu zzbvuVar) {
        this.zza = context;
        this.zzb = zzbvuVar;
        Objects.requireNonNull(zzawVar);
        this.zzc = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzl(this.zza, "ads_preloader");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    protected final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        zzch zzcfVar;
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbjg.zza(context);
        if (!((Boolean) zzba.zzc().zzd(zzbjg.zzmo)).booleanValue()) {
            return this.zzc.zzt().zza(this.zza, this.zzb);
        }
        try {
            zzci zzciVar = (zzci) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", zzaq.zza);
            zzbvu zzbvuVar = this.zzb;
            IBinder zze = zzciVar.zze(wrap, zzbvuVar, ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                zzcfVar = null;
            } else {
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzcfVar = queryLocalInterface instanceof zzch ? (zzch) queryLocalInterface : new zzcf(zze);
            }
            zzcfVar.zzl(zzbvuVar);
            return zzcfVar;
        } catch (RemoteException e) {
            e = e;
            zzaw zzawVar = this.zzc;
            zzawVar.zzs(zzcaq.zza(this.zza));
            zzawVar.zzr().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            e = e2;
            zzaw zzawVar2 = this.zzc;
            zzawVar2.zzs(zzcaq.zza(this.zza));
            zzawVar2.zzr().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            zzaw zzawVar22 = this.zzc;
            zzawVar22.zzs(zzcaq.zza(this.zza));
            zzawVar22.zzr().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzg(ObjectWrapper.wrap(this.zza), this.zzb, ModuleDescriptor.MODULE_VERSION);
    }
}
