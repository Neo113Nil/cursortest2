package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import androidx.collection.SieveCacheKt;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.container.Mp4Box;
import androidx.media3.extractor.ts.PsExtractor;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzaif implements zzacu {
    private static final byte[] zza;
    private static final zzu zzb;
    private long zzA;
    private long zzB;
    private zzaie zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private boolean zzG;
    private boolean zzH;
    private zzacx zzI;
    private zzaeb[] zzJ;
    private zzaeb[] zzK;
    private boolean zzL;
    private long zzM;
    private final zzajt zzc;
    private final int zzd;
    private final List zze;
    private final SparseArray zzf;
    private final zzef zzg;
    private final zzef zzh;
    private final zzef zzi;
    private final byte[] zzj;
    private final zzef zzk;
    private final zzaft zzl;
    private final zzef zzm;
    private final ArrayDeque zzn;
    private final ArrayDeque zzo;
    private final zzfp zzp;
    private final zzacj zzq;
    private zzgjz zzr;
    private int zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private zzef zzw;
    private long zzx;
    private int zzy;
    private long zzz;

    static {
        int i = zzaib.zza;
        zza = new byte[]{-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
        zzs zzsVar = new zzs();
        zzsVar.zzm(MimeTypes.APPLICATION_EMSG);
        zzb = zzsVar.zzM();
    }

    @Deprecated
    public zzaif() {
        this(zzajt.zza, 32, null, null, zzgjz.zzi(), null);
    }

    private final void zzb() {
        this.zzs = 0;
        this.zzv = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x03d7, code lost:
    
        if ((com.google.android.gms.internal.ads.zzeo.zzt(r42, 1000000, r5.zzd, java.math.RoundingMode.DOWN) + com.google.android.gms.internal.ads.zzeo.zzt(r2[0], 1000000, r5.zzc, java.math.RoundingMode.DOWN)) < r5.zze) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x077e, code lost:
    
        zzb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0781, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0412  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzc(long j) throws zzas {
        zzao zzaoVar;
        int i;
        List list;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z4;
        long[] jArr;
        while (true) {
            ArrayDeque arrayDeque = this.zzn;
            if (arrayDeque.isEmpty() || ((zzet) arrayDeque.peek()).zza != j) {
                break;
            }
            zzet zzetVar = (zzet) arrayDeque.pop();
            int i22 = zzetVar.zzd;
            int i23 = 12;
            int i24 = 8;
            boolean z5 = true;
            if (i22 == 1836019574) {
                zzp zzm = zzm(zzetVar.zzb);
                zzet zzd = zzetVar.zzd(Mp4Box.TYPE_mvex);
                zzd.getClass();
                SparseArray sparseArray = new SparseArray();
                List list2 = zzd.zzb;
                int size = list2.size();
                int i25 = 0;
                long j2 = C.TIME_UNSET;
                while (i25 < size) {
                    zzeu zzeuVar = (zzeu) list2.get(i25);
                    int i26 = zzeuVar.zzd;
                    if (i26 == 1953654136) {
                        zzef zzefVar = zzeuVar.zza;
                        zzefVar.zzh(i23);
                        Pair create = Pair.create(Integer.valueOf(zzefVar.zzB()), new zzahz(zzefVar.zzB() - 1, zzefVar.zzB(), zzefVar.zzB(), zzefVar.zzB()));
                        sparseArray.put(((Integer) create.first).intValue(), (zzahz) create.second);
                    } else if (i26 == 1835362404) {
                        zzef zzefVar2 = zzeuVar.zza;
                        zzefVar2.zzh(8);
                        j2 = zzahy.zza(zzefVar2.zzB()) == 0 ? zzefVar2.zzz() : zzefVar2.zzJ();
                    }
                    i25++;
                    i23 = 12;
                }
                zzet zzd2 = zzetVar.zzd(Mp4Box.TYPE_meta);
                zzao zze = zzd2 != null ? zzahy.zze(zzd2) : null;
                zzadk zzadkVar = new zzadk();
                zzeu zzc = zzetVar.zzc(Mp4Box.TYPE_udta);
                if (zzc != null) {
                    zzao zzc2 = zzahy.zzc(zzc);
                    zzadkVar.zza(zzc2);
                    zzaoVar = zzc2;
                } else {
                    zzaoVar = null;
                }
                zzeu zzc3 = zzetVar.zzc(Mp4Box.TYPE_mvhd);
                zzc3.getClass();
                zzao zzaoVar2 = new zzao(C.TIME_UNSET, zzahy.zzd(zzc3.zza));
                List zzb2 = zzahy.zzb(zzetVar, zzadkVar, j2, zzm, (this.zzd & 16) != 0, false, new zzggr(this) { // from class: com.google.android.gms.internal.ads.zzaia
                    @Override // com.google.android.gms.internal.ads.zzggr
                    public final /* synthetic */ Object apply(Object obj) {
                        return (zzais) obj;
                    }
                }, false);
                int size2 = zzb2.size();
                SparseArray sparseArray2 = this.zzf;
                if (sparseArray2.size() == 0) {
                    String zza2 = zzaii.zza(zzb2);
                    int i27 = 0;
                    while (i27 < size2) {
                        zzaiv zzaivVar = (zzaiv) zzb2.get(i27);
                        zzais zzaisVar = zzaivVar.zza;
                        zzacx zzacxVar = this.zzI;
                        int i28 = zzaisVar.zzb;
                        zzaeb zzu = zzacxVar.zzu(i27, i28);
                        boolean z6 = z5;
                        long j3 = zzaisVar.zze;
                        int i29 = i27;
                        zzu zzuVar = zzaisVar.zzg;
                        zzao zzaoVar3 = zzaoVar2;
                        zzs zza3 = zzuVar.zza();
                        zza3.zzl(zza2);
                        zzaih.zzb(i28, zzadkVar, zza3);
                        zzadk zzadkVar2 = zzadkVar;
                        String str = zza2;
                        zzao[] zzaoVarArr = new zzao[2];
                        zzaoVarArr[0] = zzaoVar;
                        zzaoVarArr[z6 ? 1 : 0] = zzaoVar3;
                        zzaih.zza(i28, zze, zza3, zzuVar.zzl, zzaoVarArr);
                        int i30 = zzaisVar.zza;
                        sparseArray2.put(i30, new zzaie(zzu, zzaivVar, zzn(sparseArray, i30), zza3.zzM()));
                        this.zzA = Math.max(this.zzA, j3);
                        i27 = i29 + 1;
                        z5 = z6 ? 1 : 0;
                        zzadkVar = zzadkVar2;
                        zzaoVar2 = zzaoVar3;
                        zza2 = str;
                    }
                    this.zzI.zzv();
                } else {
                    zzghc.zzh(sparseArray2.size() == size2);
                    for (int i31 = 0; i31 < size2; i31++) {
                        zzaiv zzaivVar2 = (zzaiv) zzb2.get(i31);
                        int i32 = zzaivVar2.zza.zza;
                        ((zzaie) sparseArray2.get(i32)).zza(zzaivVar2, zzn(sparseArray, i32));
                    }
                }
            } else {
                boolean z7 = true;
                int i33 = 16;
                int i34 = 0;
                if (i22 == 1836019558) {
                    SparseArray sparseArray3 = this.zzf;
                    int i35 = this.zzd;
                    byte[] bArr2 = this.zzj;
                    List list3 = zzetVar.zzc;
                    int size3 = list3.size();
                    int i36 = 0;
                    while (i36 < size3) {
                        zzet zzetVar2 = (zzet) list3.get(i36);
                        if (zzetVar2.zzd == 1953653094) {
                            zzeu zzc4 = zzetVar2.zzc(Mp4Box.TYPE_tfhd);
                            zzc4.getClass();
                            zzef zzefVar3 = zzc4.zza;
                            zzefVar3.zzh(i24);
                            int zzB = zzefVar3.zzB();
                            int i37 = zzahy.zza;
                            zzaie zzaieVar = (zzaie) sparseArray3.get(zzefVar3.zzB());
                            if (zzaieVar == null) {
                                zzaieVar = null;
                            } else {
                                if ((zzB & 1) != 0) {
                                    long zzJ = zzefVar3.zzJ();
                                    zzaiu zzaiuVar = zzaieVar.zzb;
                                    zzaiuVar.zzb = zzJ;
                                    zzaiuVar.zzc = zzJ;
                                }
                                zzahz zzahzVar = zzaieVar.zze;
                                zzaieVar.zzb.zza = new zzahz((zzB & 2) != 0 ? zzefVar3.zzB() - 1 : zzahzVar.zza, (zzB & 8) != 0 ? zzefVar3.zzB() : zzahzVar.zzb, (zzB & 16) != 0 ? zzefVar3.zzB() : zzahzVar.zzc, (zzB & 32) != 0 ? zzefVar3.zzB() : zzahzVar.zzd);
                            }
                            if (zzaieVar == null) {
                                i = i35;
                                list = list3;
                                i2 = size3;
                                i3 = i36;
                                z = z7;
                                i5 = i33;
                                i6 = i34;
                                i4 = 8;
                            } else {
                                zzaiu zzaiuVar2 = zzaieVar.zzb;
                                long j4 = zzaiuVar2.zzp;
                                boolean z8 = zzaiuVar2.zzq;
                                zzaieVar.zzc();
                                boolean z9 = z7;
                                zzaieVar.zzl(z9);
                                zzeu zzc5 = zzetVar2.zzc(Mp4Box.TYPE_tfdt);
                                if (zzc5 == null || (i35 & 2) != 0) {
                                    zzaiuVar2.zzp = j4;
                                    zzaiuVar2.zzq = z8;
                                } else {
                                    zzef zzefVar4 = zzc5.zza;
                                    zzefVar4.zzh(8);
                                    zzaiuVar2.zzp = zzahy.zza(zzefVar4.zzB()) == z9 ? zzefVar4.zzJ() : zzefVar4.zzz();
                                    zzaiuVar2.zzq = z9;
                                }
                                List list4 = zzetVar2.zzb;
                                int size4 = list4.size();
                                i = i35;
                                int i38 = i34;
                                int i39 = i38;
                                int i40 = i39;
                                while (true) {
                                    i7 = Mp4Box.TYPE_trun;
                                    if (i38 >= size4) {
                                        break;
                                    }
                                    List list5 = list3;
                                    zzeu zzeuVar2 = (zzeu) list4.get(i38);
                                    int i41 = size3;
                                    if (zzeuVar2.zzd == 1953658222) {
                                        zzef zzefVar5 = zzeuVar2.zza;
                                        zzefVar5.zzh(12);
                                        int zzH = zzefVar5.zzH();
                                        if (zzH > 0) {
                                            i40 += zzH;
                                            i39++;
                                        }
                                    }
                                    i38++;
                                    size3 = i41;
                                    list3 = list5;
                                }
                                list = list3;
                                i2 = size3;
                                int i42 = i34;
                                zzaieVar.zzh = i42;
                                zzaieVar.zzg = i42;
                                zzaieVar.zzf = i42;
                                zzaiuVar2.zzd = i39;
                                zzaiuVar2.zze = i40;
                                if (zzaiuVar2.zzg.length < i39) {
                                    zzaiuVar2.zzf = new long[i39];
                                    zzaiuVar2.zzg = new int[i39];
                                }
                                if (zzaiuVar2.zzh.length < i40) {
                                    int i43 = (i40 * 125) / 100;
                                    zzaiuVar2.zzh = new int[i43];
                                    zzaiuVar2.zzi = new long[i43];
                                    zzaiuVar2.zzj = new boolean[i43];
                                    zzaiuVar2.zzl = new boolean[i43];
                                }
                                int i44 = 0;
                                int i45 = 0;
                                int i46 = 0;
                                while (i44 < size4) {
                                    long j5 = 0;
                                    zzeu zzeuVar3 = (zzeu) list4.get(i44);
                                    if (zzeuVar3.zzd == i7) {
                                        int i47 = i45 + 1;
                                        zzef zzefVar6 = zzeuVar3.zza;
                                        zzefVar6.zzh(8);
                                        int zzB2 = zzefVar6.zzB();
                                        i9 = i44;
                                        zzais zzaisVar2 = zzaieVar.zzd.zza;
                                        int i48 = i45;
                                        zzahz zzahzVar2 = zzaiuVar2.zza;
                                        String str2 = zzeo.zza;
                                        i10 = i36;
                                        zzaiuVar2.zzg[i48] = zzefVar6.zzH();
                                        long[] jArr2 = zzaiuVar2.zzf;
                                        int i49 = i46;
                                        long j6 = zzaiuVar2.zzb;
                                        jArr2[i48] = j6;
                                        if ((zzB2 & 1) != 0) {
                                            jArr2[i48] = j6 + zzefVar6.zzB();
                                        }
                                        boolean z10 = (zzB2 & 4) != 0;
                                        int i50 = zzahzVar2.zzd;
                                        int zzB3 = z10 ? zzefVar6.zzB() : i50;
                                        boolean z11 = z10;
                                        int i51 = zzB2 & 256;
                                        int i52 = zzB2 & 512;
                                        int i53 = zzB2 & 1024;
                                        int i54 = zzB2 & 2048;
                                        long[] jArr3 = zzaisVar2.zzi;
                                        if (jArr3 != null) {
                                            i11 = i53;
                                            if (jArr3.length == 1 && (jArr = zzaisVar2.zzj) != null) {
                                                long j7 = jArr3[0];
                                                if (j7 == 0) {
                                                    i12 = i50;
                                                    i13 = zzB3;
                                                } else {
                                                    i12 = i50;
                                                    i13 = zzB3;
                                                }
                                                j5 = jArr[0];
                                                int[] iArr = zzaiuVar2.zzh;
                                                long[] jArr4 = zzaiuVar2.zzi;
                                                boolean[] zArr = zzaiuVar2.zzj;
                                                int i55 = i12;
                                                boolean z12 = (zzaisVar2.zzb == 2 || (i & 1) == 0) ? false : true;
                                                i14 = i49 + zzaiuVar2.zzg[i48];
                                                long j8 = zzaisVar2.zzc;
                                                long j9 = zzaiuVar2.zzp;
                                                i15 = i49;
                                                while (i15 < i14) {
                                                    if (i51 != 0) {
                                                        z3 = z12;
                                                        i16 = zzefVar6.zzB();
                                                    } else {
                                                        z3 = z12;
                                                        i16 = zzahzVar2.zzb;
                                                    }
                                                    zzj(i16);
                                                    if (i52 != 0) {
                                                        i17 = i15;
                                                        i18 = zzefVar6.zzB();
                                                    } else {
                                                        i17 = i15;
                                                        i18 = zzahzVar2.zzc;
                                                    }
                                                    zzj(i18);
                                                    if (i11 != 0) {
                                                        i19 = zzefVar6.zzB();
                                                    } else {
                                                        if (i17 == 0) {
                                                            if (z11) {
                                                                i19 = i13;
                                                                i17 = 0;
                                                            } else {
                                                                i17 = 0;
                                                            }
                                                        }
                                                        i19 = i55;
                                                    }
                                                    if (i54 != 0) {
                                                        i20 = i18;
                                                        i21 = zzefVar6.zzB();
                                                    } else {
                                                        i20 = i18;
                                                        i21 = 0;
                                                    }
                                                    zzahz zzahzVar3 = zzahzVar2;
                                                    long zzt = zzeo.zzt((i21 + j9) - j5, 1000000L, j8, RoundingMode.DOWN);
                                                    jArr4[i17] = zzt;
                                                    if (!zzaiuVar2.zzq) {
                                                        jArr4[i17] = zzt + zzaieVar.zzd.zzh;
                                                    }
                                                    iArr[i17] = i20;
                                                    if (((i19 >> 16) & 1) == 0) {
                                                        if (!z3) {
                                                            z4 = true;
                                                        } else if (i17 == 0) {
                                                            z4 = true;
                                                            i17 = 0;
                                                        }
                                                        zArr[i17] = z4;
                                                        j9 += i16;
                                                        i15 = i17 + 1;
                                                        z12 = z3;
                                                        zzahzVar2 = zzahzVar3;
                                                    }
                                                    z4 = false;
                                                    zArr[i17] = z4;
                                                    j9 += i16;
                                                    i15 = i17 + 1;
                                                    z12 = z3;
                                                    zzahzVar2 = zzahzVar3;
                                                }
                                                zzaiuVar2.zzp = j9;
                                                i46 = i14;
                                                i45 = i47;
                                            }
                                        } else {
                                            i11 = i53;
                                        }
                                        i12 = i50;
                                        i13 = zzB3;
                                        int[] iArr2 = zzaiuVar2.zzh;
                                        long[] jArr42 = zzaiuVar2.zzi;
                                        boolean[] zArr2 = zzaiuVar2.zzj;
                                        int i552 = i12;
                                        if (zzaisVar2.zzb == 2) {
                                        }
                                        i14 = i49 + zzaiuVar2.zzg[i48];
                                        long j82 = zzaisVar2.zzc;
                                        long j92 = zzaiuVar2.zzp;
                                        i15 = i49;
                                        while (i15 < i14) {
                                        }
                                        zzaiuVar2.zzp = j92;
                                        i46 = i14;
                                        i45 = i47;
                                    } else {
                                        i9 = i44;
                                        i10 = i36;
                                    }
                                    i44 = i9 + 1;
                                    i36 = i10;
                                    i7 = Mp4Box.TYPE_trun;
                                }
                                i3 = i36;
                                zzais zzaisVar3 = zzaieVar.zzd.zza;
                                zzahz zzahzVar4 = zzaiuVar2.zza;
                                zzahzVar4.getClass();
                                zzait zza4 = zzaisVar3.zza(zzahzVar4.zza);
                                zzeu zzc6 = zzetVar2.zzc(Mp4Box.TYPE_saiz);
                                if (zzc6 != null) {
                                    zza4.getClass();
                                    int i56 = zza4.zzd;
                                    zzef zzefVar7 = zzc6.zza;
                                    zzefVar7.zzh(8);
                                    if ((zzefVar7.zzB() & 1) == 1) {
                                        zzefVar7.zzk(8);
                                    }
                                    int zzs = zzefVar7.zzs();
                                    int zzH2 = zzefVar7.zzH();
                                    int i57 = zzaiuVar2.zze;
                                    if (zzH2 > i57) {
                                        StringBuilder sb = new StringBuilder(String.valueOf(zzH2).length() + 56 + String.valueOf(i57).length());
                                        sb.append("Saiz sample count ");
                                        sb.append(zzH2);
                                        sb.append(" is greater than fragment sample count");
                                        sb.append(i57);
                                        throw zzas.zzb(sb.toString(), null);
                                    }
                                    if (zzs == 0) {
                                        boolean[] zArr3 = zzaiuVar2.zzl;
                                        i8 = 0;
                                        for (int i58 = 0; i58 < zzH2; i58++) {
                                            int zzs2 = zzefVar7.zzs();
                                            i8 += zzs2;
                                            zArr3[i58] = zzs2 > i56;
                                        }
                                        z2 = false;
                                    } else {
                                        boolean z13 = zzs > i56;
                                        i8 = zzs * zzH2;
                                        z2 = false;
                                        Arrays.fill(zzaiuVar2.zzl, 0, zzH2, z13);
                                    }
                                    Arrays.fill(zzaiuVar2.zzl, zzH2, zzaiuVar2.zze, z2);
                                    if (i8 > 0) {
                                        zzaiuVar2.zza(i8);
                                    }
                                }
                                zzeu zzc7 = zzetVar2.zzc(Mp4Box.TYPE_saio);
                                if (zzc7 != null) {
                                    zzef zzefVar8 = zzc7.zza;
                                    zzefVar8.zzh(8);
                                    int zzB4 = zzefVar8.zzB();
                                    if ((zzB4 & 1) == 1) {
                                        zzefVar8.zzk(8);
                                    }
                                    int zzH3 = zzefVar8.zzH();
                                    if (zzH3 != 1) {
                                        StringBuilder sb2 = new StringBuilder(String.valueOf(zzH3).length() + 29);
                                        sb2.append("Unexpected saio entry count: ");
                                        sb2.append(zzH3);
                                        throw zzas.zzb(sb2.toString(), null);
                                    }
                                    zzaiuVar2.zzc += zzahy.zza(zzB4) == 0 ? zzefVar8.zzz() : zzefVar8.zzJ();
                                }
                                zzeu zzc8 = zzetVar2.zzc(Mp4Box.TYPE_senc);
                                if (zzc8 != null) {
                                    zzk(zzc8.zza, 0, zzaiuVar2);
                                }
                                String str3 = zza4 != null ? zza4.zzb : null;
                                zzef zzefVar9 = null;
                                zzef zzefVar10 = null;
                                for (int i59 = 0; i59 < list4.size(); i59++) {
                                    zzeu zzeuVar4 = (zzeu) list4.get(i59);
                                    zzef zzefVar11 = zzeuVar4.zza;
                                    int i60 = zzeuVar4.zzd;
                                    if (i60 == 1935828848) {
                                        zzefVar11.zzh(12);
                                        if (zzefVar11.zzB() == 1936025959) {
                                            zzefVar9 = zzefVar11;
                                        }
                                    } else if (i60 == 1936158820) {
                                        zzefVar11.zzh(12);
                                        if (zzefVar11.zzB() == 1936025959) {
                                            zzefVar10 = zzefVar11;
                                        }
                                    }
                                }
                                if (zzefVar9 == null || zzefVar10 == null) {
                                    z = true;
                                } else {
                                    zzefVar9.zzh(8);
                                    int zza5 = zzahy.zza(zzefVar9.zzB());
                                    zzefVar9.zzk(4);
                                    if (zza5 == 1) {
                                        zzefVar9.zzk(4);
                                    }
                                    if (zzefVar9.zzB() != 1) {
                                        throw zzas.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    zzefVar10.zzh(8);
                                    int zza6 = zzahy.zza(zzefVar10.zzB());
                                    zzefVar10.zzk(4);
                                    if (zza6 == 1) {
                                        if (zzefVar10.zzz() == 0) {
                                            throw zzas.zzc("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (zza6 >= 2) {
                                        zzefVar10.zzk(4);
                                    }
                                    if (zzefVar10.zzz() != 1) {
                                        throw zzas.zzc("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    z = true;
                                    zzefVar10.zzk(1);
                                    int zzs3 = zzefVar10.zzs();
                                    int i61 = (zzs3 & PsExtractor.VIDEO_STREAM_MASK) >> 4;
                                    int i62 = zzs3 & 15;
                                    if (zzefVar10.zzs() == 1) {
                                        int zzs4 = zzefVar10.zzs();
                                        int i63 = i33;
                                        byte[] bArr3 = new byte[i63];
                                        zzefVar10.zzm(bArr3, 0, i63);
                                        if (zzs4 == 0) {
                                            int zzs5 = zzefVar10.zzs();
                                            byte[] bArr4 = new byte[zzs5];
                                            zzefVar10.zzm(bArr4, 0, zzs5);
                                            bArr = bArr4;
                                        } else {
                                            bArr = null;
                                        }
                                        zzaiuVar2.zzk = true;
                                        zzaiuVar2.zzm = new zzait(true, str3, zzs4, bArr3, i61, i62, bArr);
                                    }
                                }
                                int size5 = list4.size();
                                for (int i64 = 0; i64 < size5; i64++) {
                                    zzeu zzeuVar5 = (zzeu) list4.get(i64);
                                    if (zzeuVar5.zzd == 1970628964) {
                                        zzef zzefVar12 = zzeuVar5.zza;
                                        zzefVar12.zzh(8);
                                        zzefVar12.zzm(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zza)) {
                                            zzk(zzefVar12, 16, zzaiuVar2);
                                        }
                                    }
                                }
                                i4 = 8;
                                i6 = 0;
                                i5 = 16;
                                i36 = i3 + 1;
                                i24 = i4;
                                i34 = i6;
                                z7 = z;
                                i33 = i5;
                                i35 = i;
                                size3 = i2;
                                list3 = list;
                            }
                        } else {
                            i = i35;
                            list = list3;
                            i2 = size3;
                            i3 = i36;
                            i4 = i24;
                            z = z7;
                            i5 = i33;
                            i6 = i34;
                        }
                        i36 = i3 + 1;
                        i24 = i4;
                        i34 = i6;
                        z7 = z;
                        i33 = i5;
                        i35 = i;
                        size3 = i2;
                        list3 = list;
                    }
                    int i65 = i34;
                    zzp zzm2 = zzm(zzetVar.zzb);
                    if (zzm2 != null) {
                        int size6 = sparseArray3.size();
                        for (int i66 = i65; i66 < size6; i66++) {
                            ((zzaie) sparseArray3.valueAt(i66)).zzb(zzm2);
                        }
                    }
                    if (this.zzz != C.TIME_UNSET) {
                        int size7 = sparseArray3.size();
                        for (int i67 = i65; i67 < size7; i67++) {
                            zzaie zzaieVar2 = (zzaie) sparseArray3.valueAt(i67);
                            long j10 = this.zzz;
                            int i68 = zzaieVar2.zzf;
                            while (true) {
                                zzaiu zzaiuVar3 = zzaieVar2.zzb;
                                if (i68 < zzaiuVar3.zze && zzaiuVar3.zzi[i68] <= j10) {
                                    if (zzaiuVar3.zzj[i68]) {
                                        zzaieVar2.zzi = i68;
                                    }
                                    i68++;
                                }
                            }
                        }
                        this.zzz = C.TIME_UNSET;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((zzet) arrayDeque.peek()).zzb(zzetVar);
                }
            }
        }
    }

    private static int zzj(int i) throws zzas {
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("Unexpected negative value: ");
        sb.append(i);
        throw zzas.zzb(sb.toString(), null);
    }

    private static void zzk(zzef zzefVar, int i, zzaiu zzaiuVar) throws zzas {
        zzefVar.zzh(i + 8);
        int zzB = zzefVar.zzB();
        int i2 = zzahy.zza;
        if ((zzB & 1) != 0) {
            throw zzas.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (zzB & 2) != 0;
        int zzH = zzefVar.zzH();
        if (zzH == 0) {
            Arrays.fill(zzaiuVar.zzl, 0, zzaiuVar.zze, false);
            return;
        }
        int i3 = zzaiuVar.zze;
        if (zzH != i3) {
            StringBuilder sb = new StringBuilder(String.valueOf(zzH).length() + 58 + String.valueOf(i3).length());
            sb.append("Senc sample count ");
            sb.append(zzH);
            sb.append(" is different from fragment sample count");
            sb.append(i3);
            throw zzas.zzb(sb.toString(), null);
        }
        Arrays.fill(zzaiuVar.zzl, 0, zzH, z);
        zzaiuVar.zza(zzefVar.zzd());
        zzef zzefVar2 = zzaiuVar.zzn;
        zzefVar.zzm(zzefVar2.zzi(), 0, zzefVar2.zze());
        zzefVar2.zzh(0);
        zzaiuVar.zzo = false;
    }

    private static Pair zzl(zzef zzefVar, long j) throws zzas {
        long zzJ;
        long zzJ2;
        zzef zzefVar2 = zzefVar;
        zzefVar2.zzh(8);
        int zza2 = zzahy.zza(zzefVar2.zzB());
        zzefVar2.zzk(4);
        long zzz = zzefVar2.zzz();
        if (zza2 == 0) {
            zzJ = zzefVar2.zzz();
            zzJ2 = zzefVar2.zzz();
        } else {
            zzJ = zzefVar2.zzJ();
            zzJ2 = zzefVar2.zzJ();
        }
        long j2 = j + zzJ2;
        long zzt = zzeo.zzt(zzJ, 1000000L, zzz, RoundingMode.DOWN);
        zzefVar2.zzk(2);
        int zzt2 = zzefVar2.zzt();
        int[] iArr = new int[zzt2];
        long[] jArr = new long[zzt2];
        long[] jArr2 = new long[zzt2];
        long[] jArr3 = new long[zzt2];
        long j3 = j2;
        long j4 = zzt;
        int i = 0;
        while (i < zzt2) {
            int zzB = zzefVar2.zzB();
            if ((Integer.MIN_VALUE & zzB) != 0) {
                throw zzas.zzb("Unhandled indirect reference", null);
            }
            long zzz2 = zzefVar2.zzz();
            iArr[i] = zzB & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            zzJ += zzz2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long zzt3 = zzeo.zzt(zzJ, 1000000L, zzz, RoundingMode.DOWN);
            jArr4[i] = zzt3 - jArr5[i];
            zzefVar2.zzk(4);
            j3 += iArr[i];
            i++;
            zzefVar2 = zzefVar;
            zzt2 = zzt2;
            j4 = zzt3;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(zzt), new zzaci(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzp zzm(List list) {
        int i;
        UUID[] uuidArr;
        zzaio zzaioVar;
        UUID uuid;
        int size = list.size();
        int i2 = 0;
        ArrayList arrayList = null;
        while (i2 < size) {
            zzeu zzeuVar = (zzeu) list.get(i2);
            if (zzeuVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] zzi = zzeuVar.zza.zzi();
                zzef zzefVar = new zzef(zzi);
                if (zzefVar.zze() >= 32) {
                    zzefVar.zzh(0);
                    int zzd = zzefVar.zzd();
                    int zzB = zzefVar.zzB();
                    if (zzB != zzd) {
                        StringBuilder sb = new StringBuilder(String.valueOf(zzB).length() + 52 + String.valueOf(zzd).length());
                        sb.append("Advertised atom size (");
                        sb.append(zzB);
                        sb.append(") does not match buffer size: ");
                        sb.append(zzd);
                        zzds.zzc("PsshAtomUtil", sb.toString());
                    } else {
                        int zzB2 = zzefVar.zzB();
                        if (zzB2 != 1886614376) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(zzB2).length() + 23);
                            sb2.append("Atom type is not pssh: ");
                            sb2.append(zzB2);
                            zzds.zzc("PsshAtomUtil", sb2.toString());
                        } else {
                            int zza2 = zzahy.zza(zzefVar.zzB());
                            if (zza2 > 1) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(zza2).length() + 26);
                                sb3.append("Unsupported pssh version: ");
                                sb3.append(zza2);
                                zzds.zzc("PsshAtomUtil", sb3.toString());
                            } else {
                                UUID uuid2 = new UUID(zzefVar.zzD(), zzefVar.zzD());
                                if (zza2 == 1) {
                                    int zzH = zzefVar.zzH();
                                    uuidArr = new UUID[zzH];
                                    int i3 = 0;
                                    while (i3 < zzH) {
                                        UUID[] uuidArr2 = uuidArr;
                                        int i4 = i3;
                                        uuidArr2[i4] = new UUID(zzefVar.zzD(), zzefVar.zzD());
                                        i3 = i4 + 1;
                                        i2 = i2;
                                        uuidArr = uuidArr2;
                                    }
                                } else {
                                    uuidArr = null;
                                }
                                i = i2;
                                int zzH2 = zzefVar.zzH();
                                int zzd2 = zzefVar.zzd();
                                if (zzH2 != zzd2) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(zzH2).length() + 49 + String.valueOf(zzd2).length());
                                    sb4.append("Atom data size (");
                                    sb4.append(zzH2);
                                    sb4.append(") does not match the bytes left: ");
                                    sb4.append(zzd2);
                                    zzds.zzc("PsshAtomUtil", sb4.toString());
                                    zzaioVar = null;
                                    uuid = zzaioVar == null ? null : zzaioVar.zza;
                                    if (uuid == null) {
                                        zzds.zzc("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                                    } else {
                                        arrayList.add(new zzo(uuid, null, MimeTypes.VIDEO_MP4, zzi));
                                        i2 = i + 1;
                                    }
                                } else {
                                    byte[] bArr = new byte[zzH2];
                                    zzefVar.zzm(bArr, 0, zzH2);
                                    zzaioVar = new zzaio(uuid2, zza2, bArr, uuidArr);
                                    if (zzaioVar == null) {
                                    }
                                    if (uuid == null) {
                                    }
                                }
                            }
                        }
                    }
                }
                i = i2;
                zzaioVar = null;
                if (zzaioVar == null) {
                }
                if (uuid == null) {
                }
            } else {
                i = i2;
            }
            i2 = i + 1;
        }
        if (arrayList == null) {
            return null;
        }
        return new zzp(arrayList);
    }

    private static final zzahz zzn(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzahz) sparseArray.valueAt(0);
        }
        zzahz zzahzVar = (zzahz) sparseArray.get(i);
        zzahzVar.getClass();
        return zzahzVar;
    }

    final /* synthetic */ void zza(long j, zzef zzefVar) {
        zzach.zza(j, zzefVar, this.zzK);
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        zzadz zza2 = zzair.zza(zzacvVar);
        this.zzr = zza2 != null ? zzgjz.zzj(zza2) : zzgjz.zzi();
        return zza2 == null;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ List zze() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        int i;
        int i2 = this.zzd;
        if ((i2 & 32) == 0) {
            zzacxVar = new zzajw(zzacxVar, this.zzc);
        }
        this.zzI = zzacxVar;
        zzb();
        zzaeb[] zzaebVarArr = new zzaeb[2];
        this.zzJ = zzaebVarArr;
        int i3 = 100;
        int i4 = 0;
        if ((i2 & 4) != 0) {
            zzaebVarArr[0] = this.zzI.zzu(100, 5);
            i = 1;
            i3 = 101;
        } else {
            i = 0;
        }
        zzaeb[] zzaebVarArr2 = (zzaeb[]) zzeo.zzb(this.zzJ, i);
        this.zzJ = zzaebVarArr2;
        for (zzaeb zzaebVar : zzaebVarArr2) {
            zzaebVar.zzu(zzb);
        }
        List list = this.zze;
        this.zzK = new zzaeb[list.size()];
        while (i4 < this.zzK.length) {
            zzaeb zzu = this.zzI.zzu(i3, 3);
            zzu.zzu((zzu) list.get(i4));
            this.zzK[i4] = zzu;
            i4++;
            i3++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:329:0x009c, code lost:
    
        r4 = r31.zzs;
        r10 = androidx.media3.common.MimeTypes.VIDEO_H264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x00a4, code lost:
    
        if (r4 != 3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x00a6, code lost:
    
        r31.zzD = r2.zzf();
        r4 = r2.zzd.zza.zzg.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x00b8, code lost:
    
        if (java.util.Objects.equals(r4, androidx.media3.common.MimeTypes.VIDEO_H264) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x00ba, code lost:
    
        java.util.Objects.equals(r4, androidx.media3.common.MimeTypes.VIDEO_H265);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x00bd, code lost:
    
        r31.zzG = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x00c3, code lost:
    
        if (r2.zzf >= r2.zzi) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x00c5, code lost:
    
        r32.zzf(r31.zzD);
        r1 = r2.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x00ce, code lost:
    
        if (r1 != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x00d1, code lost:
    
        r4 = r2.zzb;
        r6 = r4.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x00d7, code lost:
    
        if (r1 == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x00d9, code lost:
    
        r6.zzk(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x00e2, code lost:
    
        if (r4.zzb(r2.zzf) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x00e4, code lost:
    
        r6.zzk(r6.zzt() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x00f0, code lost:
    
        if (r2.zzh() != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x00f2, code lost:
    
        r31.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x00f4, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0332, code lost:
    
        r31.zzs = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0336, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x00fd, code lost:
    
        if (r2.zzd.zza.zzh != 1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x00ff, code lost:
    
        r31.zzD -= 8;
        r32.zzf(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0116, code lost:
    
        if (androidx.media3.common.MimeTypes.AUDIO_AC4.equals(r2.zzd.zza.zzg.zzo) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0118, code lost:
    
        r31.zzE = r2.zzi(r31.zzD, 7);
        r4 = r31.zzD;
        r12 = r31.zzk;
        com.google.android.gms.internal.ads.zzaby.zzc(r4, r12);
        r2.zza.zzz(r12, 7);
        r4 = r31.zzE + 7;
        r31.zzE = r4;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x013d, code lost:
    
        r31.zzD += r4;
        r31.zzs = 4;
        r31.zzF = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0134, code lost:
    
        r8 = 0;
        r4 = r2.zzi(r31.zzD, 0);
        r31.zzE = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0146, code lost:
    
        r4 = r2.zzd.zza;
        r8 = r2.zza;
        r12 = r2.zzd();
        r14 = r4.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0152, code lost:
    
        if (r14 != 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0154, code lost:
    
        r4 = r31.zzE;
        r5 = r31.zzD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0158, code lost:
    
        if (r4 >= r5) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x015a, code lost:
    
        r31.zzE += r8.zzy(r32, r5 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0166, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x02d1, code lost:
    
        r1 = r28.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x02d7, code lost:
    
        if (r31.zzG != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x02d9, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x02dc, code lost:
    
        r22 = r1;
        r1 = r28.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x02e2, code lost:
    
        if (r1 == null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x02e4, code lost:
    
        r25 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x02eb, code lost:
    
        r8.zzx(r12, r22, r31.zzD, 0, r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x02f8, code lost:
    
        r1 = r31.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x02fe, code lost:
    
        if (r1.isEmpty() != false) goto L454;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0300, code lost:
    
        r1 = (com.google.android.gms.internal.ads.zzaid) r1.removeFirst();
        r2 = r31.zzy;
        r7 = r1.zzc;
        r31.zzy = r2 - r7;
        r2 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0311, code lost:
    
        if (r1.zzb == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0313, code lost:
    
        r2 = r2 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0315, code lost:
    
        r4 = r2;
        r1 = r31.zzJ;
        r2 = r1.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x031a, code lost:
    
        if (r10 >= r2) goto L457;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x031c, code lost:
    
        r1[r10].zzx(r4, 1, r7, r31.zzy, null);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x032c, code lost:
    
        if (r28.zzh() != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x032e, code lost:
    
        r31.zzC = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0331, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x02e9, code lost:
    
        r25 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x016a, code lost:
    
        r15 = r31.zzh;
        r3 = r15.zzi();
        r3[0] = 0;
        r3[1] = 0;
        r3[r17] = 0;
        r7 = 4 - r14;
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0180, code lost:
    
        if (r31.zzE >= r31.zzD) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0182, code lost:
    
        r5 = r31.zzF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0184, code lost:
    
        if (r5 != 0) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0189, code lost:
    
        if (r31.zzK.length > 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x018d, code lost:
    
        if (r31.zzG != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0190, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x01a4, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x01a5, code lost:
    
        r32.zzc(r3, r7, r14 + r5);
        r15.zzh(0);
        r9 = r15.zzB();
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x01b2, code lost:
    
        if (r9 < 0) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x01b4, code lost:
    
        r31.zzF = r9 - r5;
        r9 = r31.zzg;
        r9.zzh(0);
        r8.zzz(r9, 4);
        r31.zzE += 4;
        r31.zzD += r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x01cd, code lost:
    
        if (r31.zzK.length <= 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x01cf, code lost:
    
        if (r5 <= 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x01d1, code lost:
    
        r9 = r4.zzg;
        r11 = r3[4];
        r2 = com.google.android.gms.internal.ads.zzfl.zza;
        r2 = r9.zzo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x01dd, code lost:
    
        if (java.util.Objects.equals(r2, r10) != false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x01df, code lost:
    
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x01e7, code lost:
    
        if (com.google.android.gms.internal.ads.zzar.zze(r9.zzk, r10) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x01ea, code lost:
    
        r21 = r10;
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x01fb, code lost:
    
        if (java.util.Objects.equals(r2, androidx.media3.common.MimeTypes.VIDEO_H265) != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0203, code lost:
    
        if (com.google.android.gms.internal.ads.zzar.zze(r9.zzk, androidx.media3.common.MimeTypes.VIDEO_H265) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0215, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0216, code lost:
    
        r31.zzH = r2;
        r8.zzz(r15, r5);
        r31.zzE += r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0220, code lost:
    
        if (r5 <= 0) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0224, code lost:
    
        if (r31.zzG != false) goto L461;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x022d, code lost:
    
        if (com.google.android.gms.internal.ads.zzfl.zzc(r3, 4, r5, r4.zzg) == false) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x023d, code lost:
    
        r7 = r17;
        r10 = r21;
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x02cd, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x022f, code lost:
    
        r31.zzG = r19;
        r7 = r17;
        r10 = r21;
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x020b, code lost:
    
        if (((r11 & 126) >> 1) != 39) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x020d, code lost:
    
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x01f0, code lost:
    
        r21 = r10;
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x01f5, code lost:
    
        if ((r11 & com.google.common.base.Ascii.US) == 6) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x01ee, code lost:
    
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0210, code lost:
    
        r17 = r7;
        r21 = r10;
        r10 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x024e, code lost:
    
        throw com.google.android.gms.internal.ads.zzas.zzb("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0193, code lost:
    
        r5 = com.google.android.gms.internal.ads.zzfl.zzb(r4.zzg);
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x01a2, code lost:
    
        if ((r14 + r5) <= (r31.zzD - r31.zzE)) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x024f, code lost:
    
        r28 = r2;
        r17 = r7;
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0258, code lost:
    
        if (r31.zzH == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x025a, code lost:
    
        r2 = r31.zzi;
        r2.zza(r5);
        r32.zzc(r2.zzi(), 0, r31.zzF);
        r8.zzz(r2, r31.zzF);
        r5 = r31.zzF;
        r7 = com.google.android.gms.internal.ads.zzfl.zza(r2.zzi(), r2.zze());
        r2.zzh(0);
        r2.zzf(r7);
        r7 = r4.zzg.zzq;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0287, code lost:
    
        if (r7 != (-1)) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0289, code lost:
    
        r7 = r31.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x028f, code lost:
    
        if (r7.zzb() == 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0291, code lost:
    
        r7.zza(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x02a0, code lost:
    
        r7 = r31.zzp;
        r7.zzc(r12, r2);
        r20 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x02ad, code lost:
    
        if ((r28.zzg() & 4) == 0) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x02af, code lost:
    
        r7.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x02ba, code lost:
    
        r31.zzE += r5;
        r31.zzF -= r5;
        r7 = r17;
        r10 = r21;
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0295, code lost:
    
        r9 = r31.zzp;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x029b, code lost:
    
        if (r9.zzb() == r7) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x029d, code lost:
    
        r9.zza(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x02b3, code lost:
    
        r20 = 4;
        r5 = r8.zzy(r32, r5, false);
     */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        char c;
        String zzM;
        String zzM2;
        long zzt;
        long zzz;
        long j;
        long j2;
        while (true) {
            int i = this.zzs;
            char c2 = 2;
            if (i == 0) {
                if (this.zzv == 0) {
                    zzef zzefVar = this.zzm;
                    if (!zzacvVar.zzb(zzefVar.zzi(), 0, 8, true)) {
                        if (this.zzM == -1) {
                            this.zzp.zze();
                            return -1;
                        }
                        zzadsVar.zza = 0L;
                        this.zzM = -1L;
                        this.zzI.zzw(this.zzq.zzb());
                        return 1;
                    }
                    this.zzv = 8;
                    zzefVar.zzh(0);
                    this.zzu = zzefVar.zzz();
                    this.zzt = zzefVar.zzB();
                }
                long j3 = this.zzu;
                if (j3 == 1) {
                    zzef zzefVar2 = this.zzm;
                    zzacvVar.zzc(zzefVar2.zzi(), 8, 8);
                    this.zzv += 8;
                    this.zzu = zzefVar2.zzJ();
                } else if (j3 == 0) {
                    long zzo = zzacvVar.zzo();
                    if (zzo == -1) {
                        ArrayDeque arrayDeque = this.zzn;
                        zzo = !arrayDeque.isEmpty() ? ((zzet) arrayDeque.peek()).zza : -1L;
                    }
                    if (zzo != -1) {
                        this.zzu = (zzo - zzacvVar.zzn()) + this.zzv;
                    }
                }
                long j4 = this.zzu;
                long j5 = this.zzv;
                if (j4 < j5) {
                    throw zzas.zzc("Atom size less than header length (unsupported).");
                }
                if (this.zzM != -1) {
                    if (this.zzt == 1936286840) {
                        zzef zzefVar3 = this.zzk;
                        zzefVar3.zza((int) j4);
                        System.arraycopy(this.zzm.zzi(), 0, zzefVar3.zzi(), 0, 8);
                        zzacvVar.zzc(zzefVar3.zzi(), 8, (int) (this.zzu - this.zzv));
                        this.zzq.zza((zzaci) zzl(new zzeu(Mp4Box.TYPE_sidx, zzefVar3).zza, zzacvVar.zzm()).second);
                    } else {
                        zzacvVar.zze((int) (j4 - j5), true);
                    }
                    zzb();
                } else {
                    long zzn = zzacvVar.zzn() - j5;
                    int i2 = this.zzt;
                    if ((i2 == 1836019558 || i2 == 1835295092) && !this.zzL) {
                        this.zzI.zzw(new zzadu(this.zzA, zzn));
                        this.zzL = true;
                    }
                    if (this.zzt == 1836019558) {
                        SparseArray sparseArray = this.zzf;
                        int size = sparseArray.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            zzaiu zzaiuVar = ((zzaie) sparseArray.valueAt(i3)).zzb;
                            zzaiuVar.zzc = zzn;
                            zzaiuVar.zzb = zzn;
                        }
                    }
                    int i4 = this.zzt;
                    if (i4 == 1835295092) {
                        this.zzC = null;
                        this.zzx = zzn + this.zzu;
                        this.zzs = 2;
                    } else if (i4 == 1836019574 || i4 == 1953653099 || i4 == 1835297121 || i4 == 1835626086 || i4 == 1937007212 || i4 == 1836019558 || i4 == 1953653094 || i4 == 1836475768 || i4 == 1701082227 || i4 == 1835365473) {
                        long zzn2 = zzacvVar.zzn();
                        long j6 = this.zzu;
                        long j7 = zzn2 + j6;
                        if (j6 != this.zzv && i4 == 1835365473) {
                            zzef zzefVar4 = this.zzk;
                            zzefVar4.zza(8);
                            zzacvVar.zzi(zzefVar4.zzi(), 0, 8);
                            zzahy.zzf(zzefVar4);
                            zzacvVar.zzf(zzefVar4.zzg());
                            zzacvVar.zzl();
                        }
                        long j8 = j7 - 8;
                        this.zzn.push(new zzet(this.zzt, j8));
                        if (this.zzu == this.zzv) {
                            zzc(j8);
                        } else {
                            zzb();
                        }
                    } else if (i4 == 1751411826 || i4 == 1835296868 || i4 == 1836476516 || i4 == 1936286840 || i4 == 1937011556 || i4 == 1937011827 || i4 == 1668576371 || i4 == 1937011555 || i4 == 1937011578 || i4 == 1937013298 || i4 == 1937007471 || i4 == 1668232756 || i4 == 1937011571 || i4 == 1952867444 || i4 == 1952868452 || i4 == 1953196132 || i4 == 1953654136 || i4 == 1953658222 || i4 == 1886614376 || i4 == 1935763834 || i4 == 1935763823 || i4 == 1936027235 || i4 == 1970628964 || i4 == 1935828848 || i4 == 1936158820 || i4 == 1701606260 || i4 == 1835362404 || i4 == 1701671783 || i4 == 1969517665 || i4 == 1801812339 || i4 == 1768715124) {
                        if (this.zzv != 8) {
                            throw zzas.zzc("Leaf atom defines extended atom size (unsupported).");
                        }
                        if (this.zzu > SieveCacheKt.NodeLinkMask) {
                            throw zzas.zzc("Leaf atom with length > 2147483647 (unsupported).");
                        }
                        zzef zzefVar5 = new zzef((int) this.zzu);
                        System.arraycopy(this.zzm.zzi(), 0, zzefVar5.zzi(), 0, 8);
                        this.zzw = zzefVar5;
                        this.zzs = 1;
                    } else {
                        if (this.zzu > SieveCacheKt.NodeLinkMask) {
                            throw zzas.zzc("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.zzw = null;
                        this.zzs = 1;
                    }
                }
            } else if (i != 1) {
                long j9 = Long.MAX_VALUE;
                if (i != 2) {
                    zzaie zzaieVar = this.zzC;
                    if (zzaieVar != null) {
                        c = 2;
                        break;
                    }
                    SparseArray sparseArray2 = this.zzf;
                    int size2 = sparseArray2.size();
                    long j10 = Long.MAX_VALUE;
                    int i5 = 0;
                    zzaie zzaieVar2 = null;
                    while (i5 < size2) {
                        char c3 = c2;
                        zzaie zzaieVar3 = (zzaie) sparseArray2.valueAt(i5);
                        if ((zzaieVar3.zzk() || zzaieVar3.zzf != zzaieVar3.zzd.zzb) && (!zzaieVar3.zzk() || zzaieVar3.zzh != zzaieVar3.zzb.zzd)) {
                            long zze = zzaieVar3.zze();
                            if (zze < j10) {
                                zzaieVar2 = zzaieVar3;
                                j10 = zze;
                            }
                        }
                        i5++;
                        c2 = c3;
                    }
                    c = c2;
                    if (zzaieVar2 == null) {
                        int zzn3 = (int) (this.zzx - zzacvVar.zzn());
                        if (zzn3 < 0) {
                            throw zzas.zzb("Offset to end of mdat was negative.", null);
                        }
                        zzacvVar.zzf(zzn3);
                        zzb();
                    } else {
                        int zze2 = (int) (zzaieVar2.zze() - zzacvVar.zzn());
                        if (zze2 < 0) {
                            zzds.zzc("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                            zze2 = 0;
                        }
                        zzacvVar.zzf(zze2);
                        this.zzC = zzaieVar2;
                        zzaieVar = zzaieVar2;
                    }
                } else {
                    SparseArray sparseArray3 = this.zzf;
                    int size3 = sparseArray3.size();
                    zzaie zzaieVar4 = null;
                    for (int i6 = 0; i6 < size3; i6++) {
                        zzaiu zzaiuVar2 = ((zzaie) sparseArray3.valueAt(i6)).zzb;
                        if (zzaiuVar2.zzo) {
                            long j11 = zzaiuVar2.zzc;
                            if (j11 < j9) {
                                zzaieVar4 = (zzaie) sparseArray3.valueAt(i6);
                                j9 = j11;
                            }
                        }
                    }
                    if (zzaieVar4 == null) {
                        this.zzs = 3;
                    } else {
                        int zzn4 = (int) (j9 - zzacvVar.zzn());
                        if (zzn4 < 0) {
                            throw zzas.zzb("Offset to encryption data was negative.", null);
                        }
                        zzacvVar.zzf(zzn4);
                        zzaiu zzaiuVar3 = zzaieVar4.zzb;
                        zzef zzefVar6 = zzaiuVar3.zzn;
                        zzacvVar.zzc(zzefVar6.zzi(), 0, zzefVar6.zze());
                        zzefVar6.zzh(0);
                        zzaiuVar3.zzo = false;
                    }
                }
            } else {
                long j12 = this.zzu - this.zzv;
                zzef zzefVar7 = this.zzw;
                int i7 = (int) j12;
                if (zzefVar7 != null) {
                    zzacvVar.zzc(zzefVar7.zzi(), 8, i7);
                    zzeu zzeuVar = new zzeu(this.zzt, zzefVar7);
                    ArrayDeque arrayDeque2 = this.zzn;
                    if (arrayDeque2.isEmpty()) {
                        int i8 = zzeuVar.zzd;
                        if (i8 == 1936286840) {
                            Pair zzl = zzl(zzeuVar.zza, zzacvVar.zzn());
                            this.zzq.zza((zzaci) zzl.second);
                            if (!this.zzL) {
                                this.zzB = ((Long) zzl.first).longValue();
                                this.zzI.zzw((zzadv) zzl.second);
                                this.zzL = true;
                            }
                        } else if (i8 == 1701671783) {
                            zzef zzefVar8 = zzeuVar.zza;
                            if (this.zzJ.length != 0) {
                                zzefVar8.zzh(8);
                                int zza2 = zzahy.zza(zzefVar8.zzB());
                                if (zza2 == 0) {
                                    zzM = zzefVar8.zzM((char) 0);
                                    zzM.getClass();
                                    zzM2 = zzefVar8.zzM((char) 0);
                                    zzM2.getClass();
                                    long zzz2 = zzefVar8.zzz();
                                    long zzt2 = zzeo.zzt(zzefVar8.zzz(), 1000000L, zzz2, RoundingMode.DOWN);
                                    long j13 = this.zzB;
                                    long j14 = j13 != C.TIME_UNSET ? j13 + zzt2 : -9223372036854775807L;
                                    zzt = zzeo.zzt(zzefVar8.zzz(), 1000L, zzz2, RoundingMode.DOWN);
                                    zzz = zzefVar8.zzz();
                                    j = zzt2;
                                    j2 = j14;
                                } else if (zza2 != 1) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 35);
                                    sb.append("Skipping unsupported emsg version: ");
                                    sb.append(zza2);
                                    zzds.zzc("FragmentedMp4Extractor", sb.toString());
                                } else {
                                    long zzz3 = zzefVar8.zzz();
                                    long zzt3 = zzeo.zzt(zzefVar8.zzJ(), 1000000L, zzz3, RoundingMode.DOWN);
                                    long zzt4 = zzeo.zzt(zzefVar8.zzz(), 1000L, zzz3, RoundingMode.DOWN);
                                    long zzz4 = zzefVar8.zzz();
                                    zzM = zzefVar8.zzM((char) 0);
                                    zzM.getClass();
                                    zzM2 = zzefVar8.zzM((char) 0);
                                    zzM2.getClass();
                                    zzt = zzt4;
                                    zzz = zzz4;
                                    j = -9223372036854775807L;
                                    j2 = zzt3;
                                }
                                String str = zzM;
                                String str2 = zzM2;
                                byte[] bArr = new byte[zzefVar8.zzd()];
                                zzefVar8.zzm(bArr, 0, zzefVar8.zzd());
                                zzef zzefVar9 = new zzef(this.zzl.zza(new zzafs(str, str2, zzt, zzz, bArr)));
                                int zzd = zzefVar9.zzd();
                                for (zzaeb zzaebVar : this.zzJ) {
                                    zzefVar9.zzh(0);
                                    zzaebVar.zzz(zzefVar9, zzd);
                                }
                                if (j2 == C.TIME_UNSET) {
                                    this.zzo.addLast(new zzaid(j, true, zzd));
                                    this.zzy += zzd;
                                } else {
                                    ArrayDeque arrayDeque3 = this.zzo;
                                    if (arrayDeque3.isEmpty()) {
                                        for (zzaeb zzaebVar2 : this.zzJ) {
                                            zzaebVar2.zzx(j2, 1, zzd, 0, null);
                                        }
                                    } else {
                                        arrayDeque3.addLast(new zzaid(j2, false, zzd));
                                        this.zzy += zzd;
                                    }
                                }
                            }
                        }
                    } else {
                        ((zzet) arrayDeque2.peek()).zza(zzeuVar);
                    }
                } else {
                    zzacvVar.zzf(i7);
                }
                zzc(zzacvVar.zzn());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        SparseArray sparseArray = this.zzf;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((zzaie) sparseArray.valueAt(i)).zzc();
        }
        this.zzo.clear();
        this.zzy = 0;
        this.zzp.zzd();
        this.zzz = j2;
        this.zzn.clear();
        zzb();
    }

    public zzaif(zzajt zzajtVar, int i, zzel zzelVar, zzais zzaisVar, List list, zzaeb zzaebVar) {
        this.zzc = zzajtVar;
        this.zzd = i;
        this.zze = Collections.unmodifiableList(list);
        this.zzl = new zzaft();
        this.zzm = new zzef(16);
        this.zzg = new zzef(zzfl.zza);
        this.zzh = new zzef(6);
        this.zzi = new zzef();
        byte[] bArr = new byte[16];
        this.zzj = bArr;
        this.zzk = new zzef(bArr);
        this.zzn = new ArrayDeque();
        this.zzo = new ArrayDeque();
        this.zzf = new SparseArray();
        this.zzr = zzgjz.zzi();
        this.zzA = C.TIME_UNSET;
        this.zzz = C.TIME_UNSET;
        this.zzB = C.TIME_UNSET;
        this.zzI = zzacx.zza;
        this.zzJ = new zzaeb[0];
        this.zzK = new zzaeb[0];
        this.zzp = new zzfp(new zzfo() { // from class: com.google.android.gms.internal.ads.zzaic
            @Override // com.google.android.gms.internal.ads.zzfo
            public final /* synthetic */ void zza(long j, zzef zzefVar) {
                zzaif.this.zza(j, zzefVar);
            }
        });
        this.zzq = new zzacj();
        this.zzM = -1L;
    }
}
