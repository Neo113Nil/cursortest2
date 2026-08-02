package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzaop;
import com.google.android.gms.internal.ads.zzapk;
import com.google.android.gms.internal.ads.zzaqo;
import com.google.android.gms.internal.ads.zzbbw;
import com.google.android.gms.internal.ads.zzbzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbo {
    private static zzapk zza;
    private static final Object zzb = new Object();

    public zzbo(Context context) {
        zzapk zza2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzb) {
            if (zza == null) {
                zzbbw.zza(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbbw.zzdW)).booleanValue()) {
                        zza2 = zzaz.zzb(context);
                        zza = zza2;
                    }
                }
                zza2 = zzaqo.zza(context, null);
                zza = zza2;
            }
        }
    }

    public final ListenableFuture zza(String str) {
        zzbzt zzbztVar = new zzbzt();
        zza.zza(new zzbn(str, null, zzbztVar));
        return zzbztVar;
    }

    public final ListenableFuture zzb(int i, String str, Map map, byte[] bArr) {
        zzbl zzblVar = new zzbl(null);
        zzbi zzbiVar = new zzbi(this, str, zzblVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbj zzbjVar = new zzbj(this, i, str, zzblVar, zzbiVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
            try {
                zzlVar.zzd(str, ShareTarget.METHOD_GET, zzbjVar.zzl(), zzbjVar.zzx());
            } catch (zzaop e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj(e.getMessage());
            }
        }
        zza.zza(zzbjVar);
        return zzblVar;
    }
}
