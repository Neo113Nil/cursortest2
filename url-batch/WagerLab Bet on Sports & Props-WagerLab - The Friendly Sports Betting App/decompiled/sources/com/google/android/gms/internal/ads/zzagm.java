package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzagm extends zzagh {
    public final String zza;
    public final zzgjz zzb;

    public zzagm(String str, String str2, List list) {
        super(str);
        zzghc.zza(!list.isEmpty());
        this.zza = str2;
        zzgjz zzq = zzgjz.zzq(list);
        this.zzb = zzq;
    }

    private static List zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzagm zzagmVar = (zzagm) obj;
            if (Objects.equals(this.zzf, zzagmVar.zzf) && Objects.equals(this.zza, zzagmVar.zza) && this.zzb.equals(zzagmVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.zzb.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        String valueOf = String.valueOf(this.zzb);
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 14 + String.valueOf(str2).length() + 9 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": values=");
        sb.append(valueOf);
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzan
    public final void zza(zzal zzalVar) {
        char c;
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
            case 2583398:
                if (str.equals("TRCK")) {
                    c = '\t';
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
        try {
            switch (c) {
                case 0:
                case 1:
                    zzalVar.zza((CharSequence) this.zzb.get(0));
                    break;
                case 2:
                case 3:
                    zzalVar.zzb((CharSequence) this.zzb.get(0));
                    break;
                case 4:
                case 5:
                    zzalVar.zzd((CharSequence) this.zzb.get(0));
                    break;
                case 6:
                case 7:
                    zzalVar.zzc((CharSequence) this.zzb.get(0));
                    break;
                case '\b':
                case '\t':
                    String str2 = (String) this.zzb.get(0);
                    String str3 = zzeo.zza;
                    String[] split = str2.split("/", -1);
                    int parseInt = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    zzalVar.zzg(Integer.valueOf(parseInt));
                    zzalVar.zzh(valueOf);
                    break;
                case '\n':
                case 11:
                    zzalVar.zzi(Integer.valueOf(Integer.parseInt((String) this.zzb.get(0))));
                    break;
                case '\f':
                case '\r':
                    String str4 = (String) this.zzb.get(0);
                    int parseInt2 = Integer.parseInt(str4.substring(2, 4));
                    int parseInt3 = Integer.parseInt(str4.substring(0, 2));
                    zzalVar.zzj(Integer.valueOf(parseInt2));
                    zzalVar.zzk(Integer.valueOf(parseInt3));
                    break;
                case 14:
                    List zzb = zzb((String) this.zzb.get(0));
                    int size = zzb.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                zzalVar.zzk((Integer) zzb.get(2));
                            }
                        }
                        zzalVar.zzj((Integer) zzb.get(1));
                    }
                    zzalVar.zzi((Integer) zzb.get(0));
                    break;
                case 15:
                    List zzb2 = zzb((String) this.zzb.get(0));
                    int size2 = zzb2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                zzalVar.zzn((Integer) zzb2.get(2));
                            }
                        }
                        zzalVar.zzm((Integer) zzb2.get(1));
                    }
                    zzalVar.zzl((Integer) zzb2.get(0));
                    break;
                case 16:
                case 17:
                    zzalVar.zzp((CharSequence) this.zzb.get(0));
                    break;
                case 18:
                case 19:
                    zzalVar.zzq((CharSequence) this.zzb.get(0));
                    break;
                case 20:
                case 21:
                    zzalVar.zzo((CharSequence) this.zzb.get(0));
                    break;
                case 22:
                    zzgjz zzgjzVar = this.zzb;
                    Integer zzh = zzgne.zzh((String) zzgjzVar.get(0), 10);
                    if (zzh != null) {
                        String zza = zzagi.zza(zzh.intValue());
                        if (zza != null) {
                            zzalVar.zzt(zza);
                            break;
                        }
                    } else {
                        zzalVar.zzt((CharSequence) zzgjzVar.get(0));
                        break;
                    }
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
