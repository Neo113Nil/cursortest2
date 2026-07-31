package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.inmobi.media.core.config.models.AdConfig;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes8.dex */
public final class zzajy {
    public static final zzajv zza = zzajw.zza;

    /* JADX WARN: Removed duplicated region for block: B:6:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b6  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zzap zza(byte[] bArr, int i, zzajv zzajvVar, zzajj zzajjVar) {
        zzajx zzajxVar;
        ArrayList arrayList = new ArrayList();
        zzeu zzeuVar = new zzeu(bArr, i);
        boolean z = false;
        if (zzeuVar.zzd() < 10) {
            zzeh.zzc("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int zzx = zzeuVar.zzx();
            if (zzx == 4801587) {
                int zzs = zzeuVar.zzs();
                zzeuVar.zzk(1);
                int zzs2 = zzeuVar.zzs();
                int zzG = zzeuVar.zzG();
                if (zzs == 2) {
                    if ((zzs2 & 64) != 0) {
                        zzeh.zzc("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    zzajxVar = new zzajx(zzs, zzs >= 4 && (zzs2 & 128) != 0, zzG);
                } else {
                    if (zzs == 3) {
                        if ((zzs2 & 64) != 0) {
                            int zzB = zzeuVar.zzB();
                            zzeuVar.zzk(zzB);
                            zzG -= zzB + 4;
                        }
                    } else if (zzs == 4) {
                        if ((zzs2 & 64) != 0) {
                            int zzG2 = zzeuVar.zzG();
                            zzeuVar.zzk(zzG2 - 4);
                            zzG -= zzG2;
                        }
                        if ((zzs2 & 16) != 0) {
                            zzG -= 10;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(String.valueOf(zzs).length() + 46);
                        sb.append("Skipped ID3 tag with unsupported majorVersion=");
                        sb.append(zzs);
                        zzeh.zzc("Id3Decoder", sb.toString());
                    }
                    zzajxVar = new zzajx(zzs, zzs >= 4 && (zzs2 & 128) != 0, zzG);
                }
                if (zzajxVar != null) {
                    return null;
                }
                int zzg = zzeuVar.zzg();
                int i2 = zzajxVar.zza() == 2 ? 6 : 10;
                boolean zzb = zzajxVar.zzb();
                int zzc = zzajxVar.zzc();
                if (zzb) {
                    zzc = zze(zzeuVar, zzajxVar.zzc());
                }
                zzeuVar.zzf(zzg + zzc);
                if (!zzb(zzeuVar, zzajxVar.zza(), i2, false)) {
                    if (zzajxVar.zza() != 4 || !zzb(zzeuVar, 4, i2, true)) {
                        int zza2 = zzajxVar.zza();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(zza2).length() + 45);
                        sb2.append("Failed to validate ID3 tag with majorVersion=");
                        sb2.append(zza2);
                        zzeh.zzc("Id3Decoder", sb2.toString());
                        return null;
                    }
                    z = true;
                }
                while (zzeuVar.zzd() >= i2) {
                    zzajz zzc2 = zzc(zzajxVar.zza(), zzeuVar, z, i2, zzajvVar);
                    if (zzc2 != null) {
                        arrayList.add(zzc2);
                    }
                }
                return new zzap(arrayList);
            }
            zzeh.zzc("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(zzx))));
        }
        zzajxVar = null;
        if (zzajxVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzb(zzeu zzeuVar, int i, int i2, boolean z) {
        boolean z2;
        int zzx;
        long zzx2;
        int i3;
        int i4;
        int zzg = zzeuVar.zzg();
        while (true) {
            try {
                z2 = true;
                z2 = true;
                int i5 = 1;
                int i6 = 1;
                if (zzeuVar.zzd() < i2) {
                    break;
                }
                if (i >= 3) {
                    zzx = zzeuVar.zzB();
                    zzx2 = zzeuVar.zzz();
                    i3 = zzeuVar.zzt();
                } else {
                    zzx = zzeuVar.zzx();
                    zzx2 = zzeuVar.zzx();
                    i3 = 0;
                }
                if (zzx != 0 || zzx2 != 0 || i3 != 0) {
                    if (i == 4 && !z) {
                        if ((8421504 & zzx2) != 0) {
                            break;
                        }
                        zzx2 = ((zzx2 >> 24) << 21) | (((zzx2 >> 16) & 255) << 14) | (zzx2 & 255) | (((zzx2 >> 8) & 255) << 7);
                    }
                    if (i == 4) {
                        if ((i3 & 64) == 0) {
                            i5 = 0;
                        }
                        int i7 = i5;
                        i6 = i3 & 1;
                        i4 = i7;
                    } else if (i == 3) {
                        i4 = (i3 & 32) != 0 ? 1 : 0;
                        if ((i3 & 128) == 0) {
                            i6 = 0;
                        }
                    } else {
                        i4 = 0;
                        i6 = 0;
                    }
                    if (i6 != 0) {
                        i4 += 4;
                    }
                    if (zzx2 >= i4 && zzeuVar.zzd() >= zzx2) {
                        zzeuVar.zzk((int) zzx2);
                    }
                }
            } finally {
                zzeuVar.zzh(zzg);
            }
        }
        return z2;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @androidx.annotation.Nullable
    private static com.google.android.gms.internal.ads.zzajz zzc(int r35, com.google.android.gms.internal.ads.zzeu r36, boolean r37, int r38, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzajv r39) {
        /*
            Method dump skipped, instructions count: 1588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajy.zzc(int, com.google.android.gms.internal.ads.zzeu, boolean, int, com.google.android.gms.internal.ads.zzajv):com.google.android.gms.internal.ads.zzajz");
    }

    private static zzgxm zzd(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return zzgxm.zzj("");
        }
        int i3 = zzgxm.zzd;
        zzgxj zzgxjVar = new zzgxj();
        int zzh = zzh(bArr, i2, i);
        while (i2 < zzh) {
            zzgxjVar.zzf(new String(bArr, i2, zzh - i2, zzf(i)));
            i2 = zzj(i) + zzh;
            zzh = zzh(bArr, i2, i);
        }
        zzgxm zzi = zzgxjVar.zzi();
        return zzi.isEmpty() ? zzgxm.zzj("") : zzi;
    }

    private static int zze(zzeu zzeuVar, int i) {
        byte[] zzi = zzeuVar.zzi();
        int zzg = zzeuVar.zzg();
        int i2 = zzg;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= zzg + i) {
                return i;
            }
            if ((zzi[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) == 255 && zzi[i3] == 0) {
                System.arraycopy(zzi, i2 + 2, zzi, i3, (i - (i2 - zzg)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    private static String zzg(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static int zzh(byte[] bArr, int i, int i2) {
        int zzi = zzi(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return zzi;
        }
        while (true) {
            int length = bArr.length;
            if (zzi >= length - 1) {
                return length;
            }
            int i3 = zzi + 1;
            if ((zzi - i) % 2 == 0 && bArr[i3] == 0) {
                return zzi;
            }
            zzi = zzi(bArr, i3);
        }
    }

    private static int zzi(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int zzj(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static byte[] zzk(byte[] bArr, int i, int i2) {
        return i2 <= i ? zzfm.zzb : Arrays.copyOfRange(bArr, i, i2);
    }

    private static String zzl(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    private static Charset zzf(int i) {
        return i != 1 ? i != 2 ? i != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }
}
