package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzajz;
import com.google.android.gms.internal.ads.zzakd;
import com.google.android.gms.internal.ads.zzakg;
import com.google.android.gms.internal.ads.zzakm;
import com.google.android.gms.internal.ads.zzakr;
import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzakz;
import com.google.android.gms.internal.ads.zzale;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbrp;
import com.google.android.gms.internal.ads.zzcgi;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes.dex */
public final class zzax extends zzaks {
    private final Context zzc;

    private zzax(Context context, zzakr zzakrVar) {
        super(zzakrVar);
        this.zzc = context;
    }

    public static zzakg zzb(Context context) {
        zzakg zzakgVar = new zzakg(new zzakz(new File(context.getCacheDir(), "admob_volley"), 20971520), new zzax(context, new zzale(null, null)), 4);
        zzakgVar.zzd();
        return zzakgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaks, com.google.android.gms.internal.ads.zzajw
    public final zzajz zza(zzakd zzakdVar) throws zzakm {
        if (zzakdVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbjc.zzdD), zzakdVar.zzk())) {
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                if (zzcgi.zzr(this.zzc, 13400000)) {
                    zzajz zza = new zzbrp(this.zzc).zza(zzakdVar);
                    if (zza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzakdVar.zzk())));
                        return zza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzakdVar.zzk())));
                }
            }
        }
        return super.zza(zzakdVar);
    }
}
