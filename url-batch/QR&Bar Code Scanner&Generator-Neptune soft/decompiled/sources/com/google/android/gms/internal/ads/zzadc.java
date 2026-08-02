package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzadc {
    public static final zzada zza = new zzada() { // from class: com.google.android.gms.internal.ads.zzacz
    };

    /* JADX WARN: Removed duplicated region for block: B:6:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zzbq zza(byte[] bArr, int i, zzada zzadaVar, zzacd zzacdVar) {
        zzadb zzadbVar;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        zzef zzefVar = new zzef(bArr, i);
        boolean z2 = false;
        if (zzefVar.zza() < 10) {
            zzdw.zze("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int zzm = zzefVar.zzm();
            if (zzm == 4801587) {
                int zzk = zzefVar.zzk();
                zzefVar.zzG(1);
                int zzk2 = zzefVar.zzk();
                int zzj = zzefVar.zzj();
                if (zzk == 2) {
                    if ((zzk2 & 64) != 0) {
                        zzdw.zze("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    zzadbVar = new zzadb(zzk, zzk >= 4 && (zzk2 & 128) != 0, zzj);
                } else {
                    if (zzk == 3) {
                        if ((zzk2 & 64) != 0) {
                            int zze = zzefVar.zze();
                            zzefVar.zzG(zze);
                            zzj -= zze + 4;
                        }
                    } else if (zzk == 4) {
                        if ((zzk2 & 64) != 0) {
                            int zzj2 = zzefVar.zzj();
                            zzefVar.zzG(zzj2 - 4);
                            zzj -= zzj2;
                        }
                        if ((zzk2 & 16) != 0) {
                            zzj -= 10;
                        }
                    } else {
                        zzdw.zze("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + zzk);
                    }
                    zzadbVar = new zzadb(zzk, zzk >= 4 && (zzk2 & 128) != 0, zzj);
                }
                if (zzadbVar != null) {
                    return null;
                }
                int zzc = zzefVar.zzc();
                i2 = zzadbVar.zza;
                int i9 = i2 == 2 ? 6 : 10;
                i3 = zzadbVar.zzc;
                z = zzadbVar.zzb;
                if (z) {
                    i8 = zzadbVar.zzc;
                    i3 = zze(zzefVar, i8);
                }
                zzefVar.zzE(zzc + i3);
                i4 = zzadbVar.zza;
                if (!zzj(zzefVar, i4, i9, false)) {
                    i6 = zzadbVar.zza;
                    if (i6 != 4 || !zzj(zzefVar, 4, i9, true)) {
                        i7 = zzadbVar.zza;
                        zzdw.zze("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + i7);
                        return null;
                    }
                    z2 = true;
                }
                while (zzefVar.zza() >= i9) {
                    i5 = zzadbVar.zza;
                    zzadd zzf = zzf(i5, zzefVar, z2, i9, zzadaVar);
                    if (zzf != null) {
                        arrayList.add(zzf);
                    }
                }
                return new zzbq(arrayList);
            }
            zzdw.zze("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.valueOf(String.format("%06X", Integer.valueOf(zzm)))));
        }
        zzadbVar = null;
        if (zzadbVar != null) {
        }
    }

    private static int zzb(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i, int i2) {
        int zzd = zzd(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return zzd;
        }
        while (true) {
            int length = bArr.length;
            if (zzd >= length - 1) {
                return length;
            }
            if ((zzd - i) % 2 == 0 && bArr[zzd + 1] == 0) {
                return zzd;
            }
            zzd = zzd(bArr, zzd + 1);
        }
    }

    private static int zzd(byte[] bArr, int i) {
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

    private static int zze(zzef zzefVar, int i) {
        byte[] zzH = zzefVar.zzH();
        int zzc = zzefVar.zzc();
        int i2 = zzc;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= zzc + i) {
                return i;
            }
            if ((zzH[i2] & UByte.MAX_VALUE) == 255 && zzH[i3] == 0) {
                System.arraycopy(zzH, i2 + 2, zzH, i3, (i - (i2 - zzc)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x0273, code lost:
    
        if (r9 == 67) goto L143;
     */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x0542: MOVE (r2 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:225:0x0540 */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzadd zzf(int i, zzef zzefVar, boolean z, int i2, zzada zzadaVar) {
        int zzn;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        boolean z4;
        String str;
        int i5;
        int i6;
        String str2;
        int i7;
        String str3;
        int i8;
        int i9;
        int i10;
        zzadd zzacsVar;
        int zzd;
        String zza2;
        zzadd zzadjVar;
        int zzk = zzefVar.zzk();
        int zzk2 = zzefVar.zzk();
        int zzk3 = zzefVar.zzk();
        int zzk4 = i >= 3 ? zzefVar.zzk() : 0;
        if (i == 4) {
            zzn = zzefVar.zzn();
            if (!z) {
                zzn = ((zzn >> 24) << 21) | (zzn & 255) | (((zzn >> 8) & 255) << 7) | (((zzn >> 16) & 255) << 14);
            }
        } else {
            zzn = i == 3 ? zzefVar.zzn() : zzefVar.zzm();
        }
        int zzo = i >= 3 ? zzefVar.zzo() : 0;
        zzadd zzaddVar = null;
        if (zzk == 0 && zzk2 == 0 && zzk3 == 0 && zzk4 == 0 && zzn == 0 && zzo == 0) {
            zzefVar.zzF(zzefVar.zzd());
            return null;
        }
        int zzc = zzefVar.zzc() + zzn;
        if (zzc > zzefVar.zzd()) {
            zzdw.zze("Id3Decoder", "Frame size exceeds remaining tag data");
            zzefVar.zzF(zzefVar.zzd());
            return null;
        }
        if (zzadaVar != null) {
            zzefVar.zzF(zzc);
            return null;
        }
        if (i == 3) {
            i3 = (zzo & 128) != 0 ? 1 : 0;
            boolean z5 = (zzo & 64) != 0;
            z2 = (zzo & 32) != 0;
            z3 = z5;
            z4 = false;
            i4 = i3;
        } else if (i == 4) {
            boolean z6 = (zzo & 64) != 0;
            i4 = (zzo & 8) != 0 ? 1 : 0;
            z3 = (zzo & 4) != 0;
            z4 = (zzo & 2) != 0;
            int i11 = zzo & 1;
            z2 = z6;
            i3 = i11;
        } else {
            i3 = 0;
            z2 = false;
            i4 = 0;
            z3 = false;
            z4 = false;
        }
        if (i4 != 0 || z3) {
            zzdw.zze("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            zzefVar.zzF(zzc);
            return null;
        }
        if (z2) {
            zzn--;
            zzefVar.zzG(1);
        }
        if (i3 != 0) {
            zzn -= 4;
            zzefVar.zzG(4);
        }
        if (z4) {
            zzn = zze(zzefVar, zzn);
        }
        try {
            try {
                try {
                    if (zzk == 84 && zzk2 == 88 && zzk3 == 88 && (i == 2 || zzk4 == 88)) {
                        if (zzn > 0) {
                            int zzk5 = zzefVar.zzk();
                            String zzh = zzh(zzk5);
                            int i12 = zzn - 1;
                            byte[] bArr = new byte[i12];
                            zzefVar.zzB(bArr, 0, i12);
                            int zzc2 = zzc(bArr, 0, zzk5);
                            String str4 = new String(bArr, 0, zzc2, zzh);
                            int zzb = zzc2 + zzb(zzk5);
                            zzadjVar = new zzadl("TXXX", str4, zzg(bArr, zzb, zzc(bArr, zzb, zzk5), zzh));
                            zzaddVar = zzadjVar;
                        }
                        i7 = zzk;
                        i10 = zzk2;
                        i9 = zzk3;
                        str3 = "Id3Decoder";
                        i8 = zzk4;
                        i6 = zzc;
                    } else if (zzk == 84) {
                        String zzi = zzi(i, 84, zzk2, zzk3, zzk4);
                        if (zzn > 0) {
                            int zzk6 = zzefVar.zzk();
                            String zzh2 = zzh(zzk6);
                            int i13 = zzn - 1;
                            byte[] bArr2 = new byte[i13];
                            zzefVar.zzB(bArr2, 0, i13);
                            zzadjVar = new zzadl(zzi, null, new String(bArr2, 0, zzc(bArr2, 0, zzk6), zzh2));
                            zzaddVar = zzadjVar;
                        }
                        i7 = zzk;
                        i10 = zzk2;
                        i9 = zzk3;
                        str3 = "Id3Decoder";
                        i8 = zzk4;
                        i6 = zzc;
                    } else {
                        if (zzk != 87) {
                            i5 = zzk;
                        } else if (zzk2 == 88 && zzk3 == 88 && (i == 2 || zzk4 == 88)) {
                            if (zzn > 0) {
                                int zzk7 = zzefVar.zzk();
                                String zzh3 = zzh(zzk7);
                                int i14 = zzn - 1;
                                byte[] bArr3 = new byte[i14];
                                zzefVar.zzB(bArr3, 0, i14);
                                int zzc3 = zzc(bArr3, 0, zzk7);
                                String str5 = new String(bArr3, 0, zzc3, zzh3);
                                int zzb2 = zzc3 + zzb(zzk7);
                                zzadjVar = new zzadn("WXXX", str5, zzg(bArr3, zzb2, zzd(bArr3, zzb2), "ISO-8859-1"));
                                zzaddVar = zzadjVar;
                            }
                            i7 = zzk;
                            i10 = zzk2;
                            i9 = zzk3;
                            str3 = "Id3Decoder";
                            i8 = zzk4;
                            i6 = zzc;
                        } else {
                            i5 = 87;
                        }
                        if (i5 == 87) {
                            String zzi2 = zzi(i, 87, zzk2, zzk3, zzk4);
                            byte[] bArr4 = new byte[zzn];
                            zzefVar.zzB(bArr4, 0, zzn);
                            zzadjVar = new zzadn(zzi2, null, new String(bArr4, 0, zzd(bArr4, 0), "ISO-8859-1"));
                        } else {
                            if (i5 == 80) {
                                if (zzk2 == 82 && zzk3 == 73 && zzk4 == 86) {
                                    byte[] bArr5 = new byte[zzn];
                                    zzefVar.zzB(bArr5, 0, zzn);
                                    int zzd2 = zzd(bArr5, 0);
                                    zzadjVar = new zzadj(new String(bArr5, 0, zzd2, "ISO-8859-1"), zzk(bArr5, zzd2 + 1, zzn));
                                } else {
                                    i5 = 80;
                                }
                            }
                            try {
                                try {
                                    if (i5 == 71) {
                                        if (zzk2 == 69 && zzk3 == 79) {
                                            if (zzk4 != 66 && i != 2) {
                                                i5 = 71;
                                            }
                                            int zzk8 = zzefVar.zzk();
                                            String zzh4 = zzh(zzk8);
                                            int i15 = zzn - 1;
                                            byte[] bArr6 = new byte[i15];
                                            zzefVar.zzB(bArr6, 0, i15);
                                            int zzd3 = zzd(bArr6, 0);
                                            i6 = zzc;
                                            String str6 = new String(bArr6, 0, zzd3, "ISO-8859-1");
                                            int i16 = zzd3 + 1;
                                            int zzc4 = zzc(bArr6, i16, zzk8);
                                            String zzg = zzg(bArr6, i16, zzc4, zzh4);
                                            int zzb3 = zzc4 + zzb(zzk8);
                                            int zzc5 = zzc(bArr6, zzb3, zzk8);
                                            zzadd zzacyVar = new zzacy(str6, zzg, zzg(bArr6, zzb3, zzc5, zzh4), zzk(bArr6, zzc5 + zzb(zzk8), i15));
                                            i7 = zzk;
                                            i10 = zzk2;
                                            i9 = zzk3;
                                            zzaddVar = zzacyVar;
                                            str3 = "Id3Decoder";
                                            i8 = zzk4;
                                        } else {
                                            i6 = zzc;
                                            i5 = 71;
                                            if (i != 2) {
                                                if (i5 == 80 && zzk2 == 73 && zzk3 == 67) {
                                                    int zzk9 = zzefVar.zzk();
                                                    String zzh5 = zzh(zzk9);
                                                    int i17 = zzn - 1;
                                                    byte[] bArr7 = new byte[i17];
                                                    zzefVar.zzB(bArr7, 0, i17);
                                                    if (i == 2) {
                                                        zza2 = "image/".concat(String.valueOf(zzfse.zza(new String(bArr7, 0, 3, "ISO-8859-1"))));
                                                        if ("image/jpg".equals(zza2)) {
                                                            zza2 = "image/jpeg";
                                                        }
                                                        zzd = 2;
                                                    } else {
                                                        zzd = zzd(bArr7, 0);
                                                        zza2 = zzfse.zza(new String(bArr7, 0, zzd, "ISO-8859-1"));
                                                        if (zza2.indexOf(47) == -1) {
                                                            zza2 = "image/".concat(String.valueOf(zza2));
                                                        }
                                                    }
                                                    int i18 = bArr7[zzd + 1] & UByte.MAX_VALUE;
                                                    int i19 = zzd + 2;
                                                    int zzc6 = zzc(bArr7, i19, zzk9);
                                                    str3 = "Id3Decoder";
                                                    i7 = zzk;
                                                    zzacsVar = new zzaco(zza2, new String(bArr7, i19, zzc6 - i19, zzh5), i18, zzk(bArr7, zzc6 + zzb(zzk9), i17));
                                                    zzaddVar = zzacsVar;
                                                    i10 = zzk2;
                                                    i9 = zzk3;
                                                    i8 = zzk4;
                                                }
                                                i7 = zzk;
                                                str3 = "Id3Decoder";
                                                if (i5 != 67 && zzk2 == 79 && zzk3 == 77 && (zzk4 == 77 || i == 2)) {
                                                    if (zzn < 4) {
                                                        i10 = zzk2;
                                                        i9 = zzk3;
                                                        i8 = zzk4;
                                                        zzaddVar = null;
                                                    } else {
                                                        int zzk10 = zzefVar.zzk();
                                                        String zzh6 = zzh(zzk10);
                                                        byte[] bArr8 = new byte[3];
                                                        zzefVar.zzB(bArr8, 0, 3);
                                                        String str7 = new String(bArr8, 0, 3);
                                                        int i20 = zzn - 4;
                                                        byte[] bArr9 = new byte[i20];
                                                        zzefVar.zzB(bArr9, 0, i20);
                                                        int zzc7 = zzc(bArr9, 0, zzk10);
                                                        String str8 = new String(bArr9, 0, zzc7, zzh6);
                                                        int zzb4 = zzc7 + zzb(zzk10);
                                                        zzacsVar = new zzacw(str7, str8, zzg(bArr9, zzb4, zzc(bArr9, zzb4, zzk10), zzh6));
                                                        zzaddVar = zzacsVar;
                                                        i10 = zzk2;
                                                        i9 = zzk3;
                                                        i8 = zzk4;
                                                    }
                                                } else if (i5 != 67 && zzk2 == 72 && zzk3 == 65 && zzk4 == 80) {
                                                    int zzc8 = zzefVar.zzc();
                                                    int zzd4 = zzd(zzefVar.zzH(), zzc8);
                                                    String str9 = new String(zzefVar.zzH(), zzc8, zzd4 - zzc8, "ISO-8859-1");
                                                    zzefVar.zzF(zzd4 + 1);
                                                    int zze = zzefVar.zze();
                                                    int zze2 = zzefVar.zze();
                                                    long zzs = zzefVar.zzs();
                                                    if (zzs == 4294967295L) {
                                                        zzs = -1;
                                                    }
                                                    long j = zzs;
                                                    long zzs2 = zzefVar.zzs();
                                                    if (zzs2 == 4294967295L) {
                                                        zzs2 = -1;
                                                    }
                                                    long j2 = zzs2;
                                                    ArrayList arrayList = new ArrayList();
                                                    int i21 = zzc8 + zzn;
                                                    while (zzefVar.zzc() < i21) {
                                                        zzadd zzf = zzf(i, zzefVar, z, i2, null);
                                                        if (zzf != null) {
                                                            arrayList.add(zzf);
                                                        }
                                                    }
                                                    zzacsVar = new zzacs(str9, zze, zze2, j, j2, (zzadd[]) arrayList.toArray(new zzadd[0]));
                                                    zzaddVar = zzacsVar;
                                                    i10 = zzk2;
                                                    i9 = zzk3;
                                                    i8 = zzk4;
                                                } else if (i5 != 67 && zzk2 == 84 && zzk3 == 79 && zzk4 == 67) {
                                                    int zzc9 = zzefVar.zzc();
                                                    int zzd5 = zzd(zzefVar.zzH(), zzc9);
                                                    String str10 = new String(zzefVar.zzH(), zzc9, zzd5 - zzc9, "ISO-8859-1");
                                                    zzefVar.zzF(zzd5 + 1);
                                                    int zzk11 = zzefVar.zzk();
                                                    boolean z7 = (zzk11 & 2) != 0;
                                                    int i22 = zzk11 & 1;
                                                    int zzk12 = zzefVar.zzk();
                                                    String[] strArr = new String[zzk12];
                                                    int i23 = 0;
                                                    while (i23 < zzk12) {
                                                        int zzc10 = zzefVar.zzc();
                                                        int i24 = zzk12;
                                                        int zzd6 = zzd(zzefVar.zzH(), zzc10);
                                                        strArr[i23] = new String(zzefVar.zzH(), zzc10, zzd6 - zzc10, "ISO-8859-1");
                                                        zzefVar.zzF(zzd6 + 1);
                                                        i23++;
                                                        zzk12 = i24;
                                                        zzk4 = zzk4;
                                                        zzk3 = zzk3;
                                                        zzk2 = zzk2;
                                                    }
                                                    int i25 = zzk2;
                                                    int i26 = zzk3;
                                                    int i27 = zzk4;
                                                    ArrayList arrayList2 = new ArrayList();
                                                    int i28 = zzc9 + zzn;
                                                    while (zzefVar.zzc() < i28) {
                                                        zzadd zzf2 = zzf(i, zzefVar, z, i2, null);
                                                        if (zzf2 != null) {
                                                            arrayList2.add(zzf2);
                                                        }
                                                    }
                                                    zzaddVar = new zzacu(str10, z7, 1 == i22, strArr, (zzadd[]) arrayList2.toArray(new zzadd[0]));
                                                    i8 = i27;
                                                    i9 = i26;
                                                    i10 = i25;
                                                } else {
                                                    int i29 = zzk4;
                                                    if (i5 != 77) {
                                                        i10 = zzk2;
                                                        if (i10 == 76) {
                                                            i9 = zzk3;
                                                            i8 = i29;
                                                            if (i9 == 76 && i8 == 84) {
                                                                int zzo2 = zzefVar.zzo();
                                                                int zzm = zzefVar.zzm();
                                                                int zzm2 = zzefVar.zzm();
                                                                int zzk13 = zzefVar.zzk();
                                                                int zzk14 = zzefVar.zzk();
                                                                zzee zzeeVar = new zzee();
                                                                zzeeVar.zzg(zzefVar.zzH(), zzefVar.zzd());
                                                                zzeeVar.zzh(zzefVar.zzc() * 8);
                                                                int i30 = ((zzn - 10) * 8) / (zzk13 + zzk14);
                                                                int[] iArr = new int[i30];
                                                                int[] iArr2 = new int[i30];
                                                                for (int i31 = 0; i31 < i30; i31++) {
                                                                    int zzc11 = zzeeVar.zzc(zzk13);
                                                                    int zzc12 = zzeeVar.zzc(zzk14);
                                                                    iArr[i31] = zzc11;
                                                                    iArr2[i31] = zzc12;
                                                                }
                                                                zzaddVar = new zzadh(zzo2, zzm, zzm2, iArr, iArr2);
                                                            }
                                                        } else {
                                                            i8 = i29;
                                                            i9 = zzk3;
                                                        }
                                                    } else {
                                                        i8 = i29;
                                                        i9 = zzk3;
                                                        i10 = zzk2;
                                                    }
                                                    String zzi3 = zzi(i, i5, i10, i9, i8);
                                                    byte[] bArr10 = new byte[zzn];
                                                    zzefVar.zzB(bArr10, 0, zzn);
                                                    zzaddVar = new zzacq(zzi3, bArr10);
                                                }
                                            } else {
                                                if (i5 == 65) {
                                                    if (zzk2 == 80) {
                                                        if (zzk3 == 73) {
                                                        }
                                                    }
                                                }
                                                i7 = zzk;
                                                str3 = "Id3Decoder";
                                                if (i5 != 67) {
                                                }
                                                if (i5 != 67) {
                                                }
                                                if (i5 != 67) {
                                                }
                                                int i292 = zzk4;
                                                if (i5 != 77) {
                                                }
                                                String zzi32 = zzi(i, i5, i10, i9, i8);
                                                byte[] bArr102 = new byte[zzn];
                                                zzefVar.zzB(bArr102, 0, zzn);
                                                zzaddVar = new zzacq(zzi32, bArr102);
                                            }
                                        }
                                    }
                                    if (i != 2) {
                                    }
                                } catch (UnsupportedEncodingException unused) {
                                    zzc = i6;
                                    str = str2;
                                    zzdw.zze(str, "Unsupported character encoding");
                                    zzefVar.zzF(zzc);
                                    return null;
                                }
                                i6 = zzc;
                            } catch (UnsupportedEncodingException unused2) {
                                str = "Id3Decoder";
                                zzc = i6;
                                zzdw.zze(str, "Unsupported character encoding");
                                zzefVar.zzF(zzc);
                                return null;
                            }
                        }
                        zzaddVar = zzadjVar;
                        i7 = zzk;
                        i10 = zzk2;
                        i9 = zzk3;
                        str3 = "Id3Decoder";
                        i8 = zzk4;
                        i6 = zzc;
                    }
                    if (zzaddVar == null) {
                        try {
                            str = str3;
                            try {
                                zzdw.zze(str, "Failed to decode frame: id=" + zzi(i, i7, i10, i9, i8) + ", frameSize=" + zzn);
                            } catch (UnsupportedEncodingException unused3) {
                                zzc = i6;
                                zzdw.zze(str, "Unsupported character encoding");
                                zzefVar.zzF(zzc);
                                return null;
                            }
                        } catch (UnsupportedEncodingException unused4) {
                            str = str3;
                        }
                    }
                    zzefVar.zzF(i6);
                    return zzaddVar;
                } catch (Throwable th) {
                    th = th;
                    zzc = i6;
                    zzefVar.zzF(zzc);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                zzefVar.zzF(zzc);
                throw th;
            }
        } catch (UnsupportedEncodingException unused5) {
            str = "Id3Decoder";
        }
    }

    private static String zzg(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    private static String zzh(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static String zzi(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    private static boolean zzj(zzef zzefVar, int i, int i2, boolean z) {
        int zzm;
        long zzm2;
        int i3;
        int i4;
        int zzc = zzefVar.zzc();
        while (true) {
            try {
                if (zzefVar.zza() < i2) {
                    return true;
                }
                if (i >= 3) {
                    zzm = zzefVar.zze();
                    zzm2 = zzefVar.zzs();
                    i3 = zzefVar.zzo();
                } else {
                    zzm = zzefVar.zzm();
                    zzm2 = zzefVar.zzm();
                    i3 = 0;
                }
                if (zzm == 0 && zzm2 == 0 && i3 == 0) {
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & zzm2) != 0) {
                        return false;
                    }
                    zzm2 = ((zzm2 >> 24) << 21) | ((255 & (zzm2 >> 16)) << 14) | (zzm2 & 255) | (((zzm2 >> 8) & 255) << 7);
                }
                if (i == 4) {
                    r4 = i3 & 1;
                    i4 = (i3 & 64) == 0 ? 0 : 1;
                } else if (i == 3) {
                    i4 = (i3 & 32) != 0 ? 1 : 0;
                    if ((i3 & 128) == 0) {
                        r4 = 0;
                    }
                } else {
                    i4 = 0;
                    r4 = 0;
                }
                if (r4 != 0) {
                    i4 += 4;
                }
                if (zzm2 < i4) {
                    return false;
                }
                if (zzefVar.zza() < zzm2) {
                    return false;
                }
                zzefVar.zzG((int) zzm2);
            } finally {
                zzefVar.zzF(zzc);
            }
        }
    }

    private static byte[] zzk(byte[] bArr, int i, int i2) {
        return i2 <= i ? zzen.zzf : Arrays.copyOfRange(bArr, i, i2);
    }
}
