package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzats;
import com.google.android.gms.internal.ads.zzatv;
import com.google.android.gms.internal.ads.zzaub;
import com.google.android.gms.internal.ads.zzaug;
import com.google.android.gms.internal.ads.zzauh;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzaut;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzgam;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes4.dex */
public final class zzay extends zzauh {
    private final Context zzb;

    private zzay(Context context, zzaug zzaugVar) {
        super(zzaugVar);
        this.zzb = context;
    }

    public static zzatv zzb(Context context) {
        zzatv zzatvVar = new zzatv(new zzauo(new File(zzgam.zza().zza(context.getCacheDir(), "admob_volley")), 20971520), new zzay(context, new zzaut(null, null)), 4);
        zzatvVar.zza();
        return zzatvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzauh, com.google.android.gms.internal.ads.zzatl
    public final zzato zza(zzats zzatsVar) throws zzaub {
        if (zzatsVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzfz), zzatsVar.zzh())) {
                Context context = this.zzb;
                com.google.android.gms.ads.internal.client.zzay.zza();
                if (com.google.android.gms.ads.internal.util.client.zzf.zzz(context, 13400000)) {
                    zzato zza = new zzbsg(context).zza(zzatsVar);
                    if (zza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzatsVar.zzh())));
                        return zza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzatsVar.zzh())));
                }
            }
        }
        return super.zza(zzatsVar);
    }
}
