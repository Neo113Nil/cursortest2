package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcdq;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    private final zzcdq zzc;
    private final zzcaq zzd = new zzcaq(false, Collections.emptyList());

    public zzb(Context context, zzcdq zzcdqVar, zzcaq zzcaqVar) {
        this.zza = context;
        this.zzc = zzcdqVar;
    }

    private final boolean zzd() {
        zzcdq zzcdqVar = this.zzc;
        return (zzcdqVar != null && zzcdqVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzcdq zzcdqVar = this.zzc;
            if (zzcdqVar != null) {
                zzcdqVar.zzd(str, null, 3);
                return;
            }
            zzcaq zzcaqVar = this.zzd;
            if (!zzcaqVar.zza || (list = zzcaqVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    zzt.zzp();
                    com.google.android.gms.ads.internal.util.zzs.zzH(this.zza, "", replace);
                }
            }
        }
    }

    public final boolean zzc() {
        return !zzd() || this.zzb;
    }
}
