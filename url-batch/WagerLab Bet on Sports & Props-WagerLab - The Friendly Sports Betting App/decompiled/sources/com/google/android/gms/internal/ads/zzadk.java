package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzadk {
    private static final Pattern zzc = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int zza = -1;
    public int zzb = -1;

    private final boolean zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            String str2 = zzeo.zza;
            String str3 = group;
            int parseInt = Integer.parseInt(group, 16);
            String group2 = matcher.group(2);
            String str4 = group2;
            int parseInt2 = Integer.parseInt(group2, 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.zza = parseInt;
            this.zzb = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean zza(zzao zzaoVar) {
        for (int i = 0; i < zzaoVar.zza(); i++) {
            zzan zzb = zzaoVar.zzb(i);
            if (zzb instanceof zzagb) {
                zzagb zzagbVar = (zzagb) zzb;
                if ("iTunSMPB".equals(zzagbVar.zzb) && zzc(zzagbVar.zzc)) {
                    return true;
                }
            } else if (zzb instanceof zzagj) {
                zzagj zzagjVar = (zzagj) zzb;
                if ("com.apple.iTunes".equals(zzagjVar.zza) && "iTunSMPB".equals(zzagjVar.zzb) && zzc(zzagjVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final boolean zzb() {
        return (this.zza == -1 || this.zzb == -1) ? false : true;
    }
}
