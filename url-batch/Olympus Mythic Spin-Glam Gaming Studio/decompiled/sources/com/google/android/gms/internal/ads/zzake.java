package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzake extends zzajz {

    @Nullable
    public final String zza;
    public final zzgxm zzb;

    public zzake(String str, @Nullable String str2, List list) {
        super(str);
        zzguk.zza(!list.isEmpty());
        this.zza = str2;
        zzgxm zzq = zzgxm.zzq(list);
        this.zzb = zzq;
    }

    private static List zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzake.class == obj.getClass()) {
            zzake zzakeVar = (zzake) obj;
            if (Objects.equals(this.zzf, zzakeVar.zzf) && Objects.equals(this.zza, zzakeVar.zza) && this.zzb.equals(zzakeVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.zza;
        return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.zzb.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 14 + String.valueOf(str2).length() + 9 + valueOf.length());
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": values=");
        sb.append(valueOf);
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        char c;
        Integer valueOf;
        String str = this.zzf;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2581856:
                if (str.equals("TPOS")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2584864:
                if (str.equals("TSST")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 11;
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
            case 1:
                zzamVar.zza((CharSequence) this.zzb.get(0));
                break;
            case 2:
            case 3:
                zzamVar.zzb((CharSequence) this.zzb.get(0));
                break;
            case 4:
            case 5:
                zzamVar.zzd((CharSequence) this.zzb.get(0));
                break;
            case 6:
            case 7:
                zzamVar.zzc((CharSequence) this.zzb.get(0));
                break;
            case '\b':
            case '\t':
                String str2 = (String) this.zzb.get(0);
                String str3 = zzfm.zza;
                String[] split = str2.split("/", -1);
                try {
                    int parseInt = Integer.parseInt(split[0]);
                    valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    zzamVar.zzg(Integer.valueOf(parseInt));
                    zzamVar.zzh(valueOf);
                    break;
                } catch (NumberFormatException unused) {
                    return;
                }
            case '\n':
            case 11:
                try {
                    zzamVar.zzi(Integer.valueOf(Integer.parseInt((String) this.zzb.get(0))));
                    break;
                } catch (NumberFormatException unused2) {
                    return;
                }
            case '\f':
            case '\r':
                try {
                    String str4 = (String) this.zzb.get(0);
                    int parseInt2 = Integer.parseInt(str4.substring(2, 4));
                    int parseInt3 = Integer.parseInt(str4.substring(0, 2));
                    zzamVar.zzj(Integer.valueOf(parseInt2));
                    zzamVar.zzk(Integer.valueOf(parseInt3));
                    break;
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
            case 14:
                List zzb = zzb((String) this.zzb.get(0));
                int size = zzb.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size == 3) {
                            zzamVar.zzk((Integer) zzb.get(2));
                        }
                    }
                    zzamVar.zzj((Integer) zzb.get(1));
                }
                zzamVar.zzi((Integer) zzb.get(0));
                break;
            case 15:
                List zzb2 = zzb((String) this.zzb.get(0));
                int size2 = zzb2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 == 3) {
                            zzamVar.zzn((Integer) zzb2.get(2));
                        }
                    }
                    zzamVar.zzm((Integer) zzb2.get(1));
                }
                zzamVar.zzl((Integer) zzb2.get(0));
                break;
            case 16:
            case 17:
                zzamVar.zzp((CharSequence) this.zzb.get(0));
                break;
            case 18:
            case 19:
                zzamVar.zzq((CharSequence) this.zzb.get(0));
                break;
            case 20:
            case 21:
                zzamVar.zzo((CharSequence) this.zzb.get(0));
                break;
            case 22:
                zzgxm zzgxmVar = this.zzb;
                Integer zzh = zzhbj.zzh((String) zzgxmVar.get(0), 10);
                if (zzh != null) {
                    String zza = zzaka.zza(zzh.intValue());
                    if (zza != null) {
                        zzamVar.zzu(zza);
                        break;
                    }
                } else {
                    zzamVar.zzu((CharSequence) zzgxmVar.get(0));
                    break;
                }
                break;
            case 23:
                zzamVar.zzr((CharSequence) this.zzb.get(0));
                break;
            case 24:
                String str5 = (String) this.zzb.get(0);
                String str6 = zzfm.zza;
                String[] split2 = str5.split("/", -1);
                try {
                    int parseInt4 = Integer.parseInt(split2[0]);
                    valueOf = split2.length > 1 ? Integer.valueOf(Integer.parseInt(split2[1])) : null;
                    zzamVar.zzs(Integer.valueOf(parseInt4));
                    zzamVar.zzt(valueOf);
                    break;
                } catch (NumberFormatException unused4) {
                    return;
                }
        }
    }
}
