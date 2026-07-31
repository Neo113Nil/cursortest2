package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes10.dex */
final class zzamt {
    private static final zzguz zza = zzguz.zza(zzgty.zzd(':'));
    private static final zzguz zzb = zzguz.zza(zzgty.zzd('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    public final void zza() {
        this.zzc.clear();
        this.zzd = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int zzb(zzagi zzagiVar, zzahh zzahhVar, List list) throws IOException {
        int i;
        char c;
        char c2;
        int i2 = this.zzd;
        if (i2 == 0) {
            long zzo = zzagiVar.zzo();
            zzahhVar.zza = (zzo == -1 || zzo < 8) ? 0L : zzo - 8;
            this.zzd = 1;
            return 1;
        }
        int i3 = 2;
        if (i2 != 1) {
            short s = 2817;
            short s2 = 2816;
            short s3 = 2192;
            if (i2 != 2) {
                long zzn = zzagiVar.zzn();
                int zzo2 = (int) ((zzagiVar.zzo() - zzagiVar.zzn()) - this.zze);
                zzeu zzeuVar = new zzeu(zzo2);
                zzagiVar.zzc(zzeuVar.zzi(), 0, zzo2);
                int i4 = 0;
                while (true) {
                    List list2 = this.zzc;
                    if (i4 >= list2.size()) {
                        zzahhVar.zza = 0L;
                        return 1;
                    }
                    zzams zzamsVar = (zzams) list2.get(i4);
                    zzeuVar.zzh((int) (zzamsVar.zza - zzn));
                    zzeuVar.zzk(4);
                    int zzC = zzeuVar.zzC();
                    Charset charset = StandardCharsets.UTF_8;
                    String zzK = zzeuVar.zzK(zzC, charset);
                    switch (zzK.hashCode()) {
                        case -1711564334:
                            if (zzK.equals("SlowMotion_Data")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1332107749:
                            if (zzK.equals("Super_SlowMotion_Edit_Data")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1251387154:
                            if (zzK.equals("Super_SlowMotion_Data")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -830665521:
                            if (zzK.equals("Super_SlowMotion_Deflickering_On")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1760745220:
                            if (zzK.equals("Super_SlowMotion_BGM")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        c2 = 2192;
                    } else if (c == 1) {
                        c2 = 2816;
                    } else if (c == 2) {
                        c2 = 2817;
                    } else if (c == 3) {
                        c2 = 2819;
                    } else {
                        if (c != 4) {
                            throw zzat.zzb("Invalid SEF name", null);
                        }
                        c2 = 2820;
                    }
                    int i5 = zzamsVar.zzb - (zzC + 8);
                    if (c2 == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List zzg = zzb.zzg(zzeuVar.zzK(i5, charset));
                        for (int i6 = 0; i6 < zzg.size(); i6++) {
                            List zzg2 = zza.zzg((CharSequence) zzg.get(i6));
                            if (zzg2.size() != 3) {
                                throw zzat.zzb(null, null);
                            }
                            try {
                                arrayList.add(new zzakg(Long.parseLong((String) zzg2.get(0)), Long.parseLong((String) zzg2.get(1)), 1 << (Integer.parseInt((String) zzg2.get(2)) - 1)));
                            } catch (NumberFormatException e) {
                                throw zzat.zzb(null, e);
                            }
                        }
                        list.add(new zzakh(arrayList));
                    } else if (c2 != 2816 && c2 != 2817 && c2 != 2819 && c2 != 2820) {
                        throw new IllegalStateException();
                    }
                    i4++;
                }
            } else {
                long zzo3 = zzagiVar.zzo();
                int i7 = this.zze - 20;
                zzeu zzeuVar2 = new zzeu(i7);
                zzagiVar.zzc(zzeuVar2.zzi(), 0, i7);
                int i8 = 0;
                while (i8 < i7 / 12) {
                    zzeuVar2.zzk(i3);
                    short zzw = zzeuVar2.zzw();
                    if (zzw == s3 || zzw == s2 || zzw == s || zzw == 2819 || zzw == 2820) {
                        i = i7;
                        this.zzc.add(new zzams(zzw, (zzo3 - this.zze) - zzeuVar2.zzC(), zzeuVar2.zzC()));
                    } else {
                        zzeuVar2.zzk(8);
                        i = i7;
                    }
                    i8++;
                    i7 = i;
                    i3 = 2;
                    s = 2817;
                    s2 = 2816;
                    s3 = 2192;
                }
                List list3 = this.zzc;
                if (list3.isEmpty()) {
                    zzahhVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzahhVar.zza = ((zzams) list3.get(0)).zza;
                }
            }
        } else {
            zzeu zzeuVar3 = new zzeu(8);
            zzagiVar.zzc(zzeuVar3.zzi(), 0, 8);
            this.zze = zzeuVar3.zzC() + 8;
            if (zzeuVar3.zzB() != 1397048916) {
                zzahhVar.zza = 0L;
            } else {
                zzahhVar.zza = zzagiVar.zzn() - (this.zze - 12);
                this.zzd = 2;
            }
        }
        return 1;
    }
}
