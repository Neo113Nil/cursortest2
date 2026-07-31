package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzakj implements zzao {
    public final String zza;
    public final String zzb;

    public zzakj(String str, String str2) {
        this.zza = zzgts.zzb(str);
        this.zzb = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzakj.class == obj.getClass()) {
            zzakj zzakjVar = (zzakj) obj;
            if (this.zza.equals(zzakjVar.zza) && this.zzb.equals(zzakjVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 5 + String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        char c;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 905239725:
                if (str.equals("DISCSUBTITLE")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                zzamVar.zza(this.zzb);
                break;
            case 1:
                zzamVar.zzb(this.zzb);
                break;
            case 2:
                zzamVar.zzc(this.zzb);
                break;
            case 3:
                zzamVar.zzd(this.zzb);
                break;
            case 4:
                Integer zzh = zzhbj.zzh(this.zzb, 10);
                if (zzh != null) {
                    zzamVar.zzg(zzh);
                    break;
                }
                break;
            case 5:
                Integer zzh2 = zzhbj.zzh(this.zzb, 10);
                if (zzh2 != null) {
                    zzamVar.zzh(zzh2);
                    break;
                }
                break;
            case 6:
                zzamVar.zzr(this.zzb);
                break;
            case 7:
                Integer zzh3 = zzhbj.zzh(this.zzb, 10);
                if (zzh3 != null) {
                    zzamVar.zzs(zzh3);
                    break;
                }
                break;
            case '\b':
                Integer zzh4 = zzhbj.zzh(this.zzb, 10);
                if (zzh4 != null) {
                    zzamVar.zzt(zzh4);
                    break;
                }
                break;
            case '\t':
                zzamVar.zzu(this.zzb);
                break;
            case '\n':
                zzamVar.zze(this.zzb);
                break;
        }
    }
}
