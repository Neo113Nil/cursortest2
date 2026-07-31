package com.google.android.gms.ads.internal.client;

import android.content.Context;
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
final class zzae extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvu zzb;

    zzae(zzaw zzawVar, Context context, zzbvu zzbvuVar) {
        this.zza = context;
        this.zzb = zzbvuVar;
        Objects.requireNonNull(zzawVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    protected final /* bridge */ /* synthetic */ Object zza() {
        zzaw.zzl(this.zza, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbjg.zza(context);
        if (!((Boolean) zzba.zzc().zzd(zzbjg.zzkU)).booleanValue()) {
            return null;
        }
        try {
            return ((zzdu) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", zzad.zza)).zze(wrap, this.zzb, ModuleDescriptor.MODULE_VERSION);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
            zzcaq.zza(this.zza).zzh(e, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc(zzco zzcoVar) throws RemoteException {
        Context context = this.zza;
        IObjectWrapper wrap = ObjectWrapper.wrap(context);
        zzbjg.zza(context);
        if (((Boolean) zzba.zzc().zzd(zzbjg.zzkU)).booleanValue()) {
            return zzcoVar.zzp(wrap, this.zzb, ModuleDescriptor.MODULE_VERSION);
        }
        return null;
    }
}
