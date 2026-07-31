package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbvu;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes10.dex */
public final class zzi extends RemoteCreator {
    public zzi() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof zzbr ? (zzbr) queryLocalInterface : new zzbr(iBinder);
    }

    @Nullable
    public final zzbq zza(Context context, String str, zzbvu zzbvuVar) {
        try {
            IBinder zze = ((zzbr) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), str, zzbvuVar, ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzbq ? (zzbq) queryLocalInterface : new zzbo(zze);
        } catch (RemoteException e) {
            e = e;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
