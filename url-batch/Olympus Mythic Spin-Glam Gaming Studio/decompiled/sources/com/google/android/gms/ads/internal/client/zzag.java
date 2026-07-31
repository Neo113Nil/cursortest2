package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbvu;
import com.google.android.gms.internal.ads.zzcfh;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzag extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvu zzb;

    zzag(zzaw zzawVar, Context context, zzbvu zzbvuVar) {
        this.zza = context;
        this.zzb = zzbvuVar;
        Objects.requireNonNull(zzawVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    protected final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        Context context = this.zza;
        try {
            return ((zzcfh) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", zzaf.zza)).zze(ObjectWrapper.wrap(context), this.zzb, ModuleDescriptor.MODULE_VERSION);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzm(ObjectWrapper.wrap(this.zza), this.zzb, ModuleDescriptor.MODULE_VERSION);
    }
}
