package com.google.android.gms.internal.ads;

import com.amazon.a.a.o.b.f;
import com.facebook.share.internal.ShareConstants;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
@Deprecated
/* loaded from: classes5.dex */
public class zzafv implements zzan {
    public final String zza;
    public final String zzb;

    public zzafv(String str, String str2) {
        this.zza = zzggj.zzb(str);
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzafv zzafvVar = (zzafv) obj;
            if (this.zza.equals(zzafvVar.zza) && this.zzb.equals(zzafvVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 5 + String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append(f.b);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzan
    public final void zza(zzal zzalVar) {
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
                    c = 7;
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
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 79833656:
                if (str.equals(ShareConstants.TITLE)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 428414940:
                if (str.equals(ShareConstants.DESCRIPTION)) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c = 6;
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
                zzalVar.zza(this.zzb);
                break;
            case 1:
                zzalVar.zzb(this.zzb);
                break;
            case 2:
                zzalVar.zzc(this.zzb);
                break;
            case 3:
                zzalVar.zzd(this.zzb);
                break;
            case 4:
                Integer zzh = zzgne.zzh(this.zzb, 10);
                if (zzh != null) {
                    zzalVar.zzg(zzh);
                    break;
                }
                break;
            case 5:
                Integer zzh2 = zzgne.zzh(this.zzb, 10);
                if (zzh2 != null) {
                    zzalVar.zzh(zzh2);
                    break;
                }
                break;
            case 6:
                Integer zzh3 = zzgne.zzh(this.zzb, 10);
                if (zzh3 != null) {
                    zzalVar.zzr(zzh3);
                    break;
                }
                break;
            case 7:
                Integer zzh4 = zzgne.zzh(this.zzb, 10);
                if (zzh4 != null) {
                    zzalVar.zzs(zzh4);
                    break;
                }
                break;
            case '\b':
                zzalVar.zzt(this.zzb);
                break;
            case '\t':
                zzalVar.zze(this.zzb);
                break;
        }
    }
}
