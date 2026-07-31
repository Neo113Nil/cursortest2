package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbro;
import com.google.android.gms.internal.ads.zzbrs;
import com.google.android.gms.internal.ads.zzbvu;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzak extends zzax {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvu zzb;
    final /* synthetic */ OnH5AdsEventListener zzc;

    zzak(zzaw zzawVar, Context context, zzbvu zzbvuVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzbvuVar;
        this.zzc = onH5AdsEventListener;
        Objects.requireNonNull(zzawVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @NonNull
    protected final /* synthetic */ Object zza() {
        return new zzbrs();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        Context context = this.zza;
        try {
            return ((zzbro) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", zzaj.zza)).zze(ObjectWrapper.wrap(context), this.zzb, ModuleDescriptor.MODULE_VERSION, new zzbrf(this.zzc));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzo(ObjectWrapper.wrap(this.zza), this.zzb, ModuleDescriptor.MODULE_VERSION, new zzbrf(this.zzc));
    }
}
