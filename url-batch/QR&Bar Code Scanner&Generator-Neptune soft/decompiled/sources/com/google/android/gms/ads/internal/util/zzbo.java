package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzajl;
import com.google.android.gms.internal.ads.zzakg;
import com.google.android.gms.internal.ads.zzalk;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzchh;
import com.google.android.gms.internal.ads.zzfzp;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbo {
    private static zzakg zzb;
    private static final Object zzc = new Object();

    @Deprecated
    public static final zzbj zza = new zzbg();

    public zzbo(Context context) {
        zzakg zza2;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzc) {
            if (zzb == null) {
                zzbjc.zzc(context);
                if (!ClientLibraryUtils.isPackageSide()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdC)).booleanValue()) {
                        zza2 = zzax.zzb(context);
                        zzb = zza2;
                    }
                }
                zza2 = zzalk.zza(context, null);
                zzb = zza2;
            }
        }
    }

    public final zzfzp zza(String str) {
        zzchh zzchhVar = new zzchh();
        zzb.zza(new zzbn(str, null, zzchhVar));
        return zzchhVar;
    }

    public final zzfzp zzb(int i, String str, Map map, byte[] bArr) {
        zzbl zzblVar = new zzbl(null);
        zzbh zzbhVar = new zzbh(this, str, zzblVar);
        zzcgo zzcgoVar = new zzcgo(null);
        zzbi zzbiVar = new zzbi(this, i, str, zzblVar, zzbhVar, bArr, map, zzcgoVar);
        if (zzcgo.zzl()) {
            try {
                zzcgoVar.zzd(str, ShareTarget.METHOD_GET, zzbiVar.zzl(), zzbiVar.zzx());
            } catch (zzajl e) {
                zze.zzj(e.getMessage());
            }
        }
        zzb.zza(zzbiVar);
        return zzblVar;
    }
}
