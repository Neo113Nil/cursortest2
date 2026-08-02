package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzafq implements zzzi, zzaal {
    public static final zzzp zza = new zzzp() { // from class: com.google.android.gms.internal.ads.zzafn
        @Override // com.google.android.gms.internal.ads.zzzp
        public final zzzi[] zza() {
            zzzp zzzpVar = zzafq.zza;
            return new zzzi[]{new zzafq(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzzp
        public final /* synthetic */ zzzi[] zzb(Uri uri, Map map) {
            return zzzo.zza(this, uri, map);
        }
    };
    private final zzef zzb;
    private final zzef zzc;
    private final zzef zzd;
    private final zzef zze;
    private final ArrayDeque zzf;
    private final zzaft zzg;
    private final List zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private int zzl;
    private zzef zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private zzzl zzr;
    private zzafp[] zzs;
    private long[][] zzt;
    private int zzu;
    private long zzv;
    private int zzw;
    private zzadt zzx;

    public zzafq() {
        this(0);
    }

    private static int zzf(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzi(zzafy zzafyVar, long j) {
        int zza2 = zzafyVar.zza(j);
        return zza2 == -1 ? zzafyVar.zzb(j) : zza2;
    }

    private static long zzj(zzafy zzafyVar, long j, long j2) {
        int zzi = zzi(zzafyVar, j);
        return zzi == -1 ? j2 : Math.min(zzafyVar.zzc[zzi], j2);
    }

    private final void zzk() {
        this.zzi = 0;
        this.zzl = 0;
    }

    private final void zzl(long j) throws zzbu {
        zzafq zzafqVar;
        zzbq zzbqVar;
        zzbq zzbqVar2;
        long j2;
        List list;
        int i;
        long j3;
        ArrayList arrayList;
        int i2;
        zzafq zzafqVar2 = this;
        while (!zzafqVar2.zzf.isEmpty() && ((zzaev) zzafqVar2.zzf.peek()).zza == j) {
            zzaev zzaevVar = (zzaev) zzafqVar2.zzf.pop();
            if (zzaevVar.zzd == 1836019574) {
                ArrayList arrayList2 = new ArrayList();
                boolean z = zzafqVar2.zzw == 1;
                zzzx zzzxVar = new zzzx();
                zzaew zzb = zzaevVar.zzb(1969517665);
                if (zzb != null) {
                    Pair zza2 = zzaff.zza(zzb);
                    zzbq zzbqVar3 = (zzbq) zza2.first;
                    zzbq zzbqVar4 = (zzbq) zza2.second;
                    if (zzbqVar3 != null) {
                        zzzxVar.zzb(zzbqVar3);
                    }
                    zzbqVar = zzbqVar4;
                    zzbqVar2 = zzbqVar3;
                } else {
                    zzbqVar = null;
                    zzbqVar2 = null;
                }
                zzaev zza3 = zzaevVar.zza(1835365473);
                zzbq zzb2 = zza3 != null ? zzaff.zzb(zza3) : null;
                List zzc = zzaff.zzc(zzaevVar, zzzxVar, -9223372036854775807L, null, false, z, new zzfsm() { // from class: com.google.android.gms.internal.ads.zzafo
                    @Override // com.google.android.gms.internal.ads.zzfsm
                    public final Object apply(Object obj) {
                        zzafv zzafvVar = (zzafv) obj;
                        zzzp zzzpVar = zzafq.zza;
                        return zzafvVar;
                    }
                });
                int size = zzc.size();
                long j4 = -9223372036854775807L;
                long j5 = -9223372036854775807L;
                int i3 = 0;
                int i4 = -1;
                while (true) {
                    j2 = 0;
                    if (i3 >= size) {
                        break;
                    }
                    zzafy zzafyVar = (zzafy) zzc.get(i3);
                    if (zzafyVar.zzb == 0) {
                        list = zzc;
                        i = size;
                        arrayList = arrayList2;
                        j3 = j4;
                    } else {
                        zzafv zzafvVar = zzafyVar.zza;
                        list = zzc;
                        long j6 = zzafvVar.zze;
                        if (j6 == j4) {
                            j6 = zzafyVar.zzh;
                        }
                        long max = Math.max(j5, j6);
                        i = size;
                        zzafp zzafpVar = new zzafp(zzafvVar, zzafyVar, zzafqVar2.zzr.zzv(i3, zzafvVar.zzb));
                        int i5 = "audio/true-hd".equals(zzafvVar.zzf.zzm) ? zzafyVar.zze * 16 : zzafyVar.zze + 30;
                        zzad zzb3 = zzafvVar.zzf.zzb();
                        zzb3.zzL(i5);
                        if (zzafvVar.zzb == 2 && j6 > 0 && (i2 = zzafyVar.zzb) > 1) {
                            zzb3.zzE(i2 / (j6 / 1000000.0f));
                        }
                        int i6 = zzafvVar.zzb;
                        int i7 = zzafm.zzb;
                        if (i6 == 1 && zzzxVar.zza()) {
                            zzb3.zzC(zzzxVar.zza);
                            zzb3.zzD(zzzxVar.zzb);
                        }
                        int i8 = zzafvVar.zzb;
                        zzbq[] zzbqVarArr = new zzbq[2];
                        zzbqVarArr[0] = zzbqVar;
                        zzbqVarArr[1] = zzafqVar2.zzh.isEmpty() ? null : new zzbq(zzafqVar2.zzh);
                        ArrayList arrayList3 = arrayList2;
                        zzbq zzbqVar5 = new zzbq(-9223372036854775807L, new zzbp[0]);
                        if (i8 == 1) {
                            if (zzbqVar2 != null) {
                                zzbqVar5 = zzbqVar2;
                            }
                        } else if (i8 == 2 && zzb2 != null) {
                            for (int i9 = 0; i9 < zzb2.zza(); i9++) {
                                zzbp zzb4 = zzb2.zzb(i9);
                                if (zzb4 instanceof zzadq) {
                                    zzadq zzadqVar = (zzadq) zzb4;
                                    if ("com.android.capture.fps".equals(zzadqVar.zza)) {
                                        zzbqVar5 = new zzbq(-9223372036854775807L, zzadqVar);
                                        j3 = -9223372036854775807L;
                                        break;
                                    }
                                }
                            }
                        }
                        j3 = -9223372036854775807L;
                        for (int i10 = 0; i10 < 2; i10++) {
                            zzbqVar5 = zzbqVar5.zzd(zzbqVarArr[i10]);
                        }
                        if (zzbqVar5.zza() > 0) {
                            zzb3.zzM(zzbqVar5);
                        }
                        zzafpVar.zzc.zzk(zzb3.zzY());
                        if (zzafvVar.zzb == 2 && i4 == -1) {
                            i4 = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(zzafpVar);
                        j5 = max;
                    }
                    i3++;
                    zzafqVar2 = this;
                    j4 = j3;
                    arrayList2 = arrayList;
                    zzc = list;
                    size = i;
                }
                zzafqVar = zzafqVar2;
                zzafqVar.zzu = i4;
                zzafqVar.zzv = j5;
                zzafp[] zzafpVarArr = (zzafp[]) arrayList2.toArray(new zzafp[0]);
                zzafqVar.zzs = zzafpVarArr;
                int length = zzafpVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i11 = 0; i11 < zzafpVarArr.length; i11++) {
                    jArr[i11] = new long[zzafpVarArr[i11].zzb.zzb];
                    jArr2[i11] = zzafpVarArr[i11].zzb.zzf[0];
                }
                int i12 = 0;
                while (i12 < zzafpVarArr.length) {
                    long j7 = Long.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < zzafpVarArr.length; i14++) {
                        if (!zArr[i14]) {
                            long j8 = jArr2[i14];
                            if (j8 <= j7) {
                                i13 = i14;
                                j7 = j8;
                            }
                        }
                    }
                    int i15 = iArr[i13];
                    long[] jArr3 = jArr[i13];
                    jArr3[i15] = j2;
                    zzafy zzafyVar2 = zzafpVarArr[i13].zzb;
                    j2 += zzafyVar2.zzd[i15];
                    int i16 = i15 + 1;
                    iArr[i13] = i16;
                    if (i16 < jArr3.length) {
                        jArr2[i13] = zzafyVar2.zzf[i16];
                    } else {
                        zArr[i13] = true;
                        i12++;
                    }
                }
                zzafqVar.zzt = jArr;
                zzafqVar.zzr.zzC();
                zzafqVar.zzr.zzN(zzafqVar);
                zzafqVar.zzf.clear();
                zzafqVar.zzi = 2;
            } else {
                zzafqVar = zzafqVar2;
                if (!zzafqVar.zzf.isEmpty()) {
                    ((zzaev) zzafqVar.zzf.peek()).zzc(zzaevVar);
                }
            }
            zzafqVar2 = zzafqVar;
        }
        if (zzafqVar2.zzi != 2) {
            zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzb(zzzl zzzlVar) {
        this.zzr = zzzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzc(long j, long j2) {
        this.zzf.clear();
        this.zzl = 0;
        this.zzn = -1;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        if (j == 0) {
            zzk();
            return;
        }
        for (zzafp zzafpVar : this.zzs) {
            zzafy zzafyVar = zzafpVar.zzb;
            int zza2 = zzafyVar.zza(j2);
            if (zza2 == -1) {
                zza2 = zzafyVar.zzb(j2);
            }
            zzafpVar.zze = zza2;
            zzaaq zzaaqVar = zzafpVar.zzd;
            if (zzaaqVar != null) {
                zzaaqVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzzj zzzjVar) throws IOException {
        return zzafu.zzb(zzzjVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final long zze() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final zzaaj zzg(long j) {
        long j2;
        long j3;
        int zzb;
        zzafp[] zzafpVarArr = this.zzs;
        if (zzafpVarArr.length == 0) {
            zzaam zzaamVar = zzaam.zza;
            return new zzaaj(zzaamVar, zzaamVar);
        }
        int i = this.zzu;
        long j4 = -1;
        if (i != -1) {
            zzafy zzafyVar = zzafpVarArr[i].zzb;
            int zzi = zzi(zzafyVar, j);
            if (zzi == -1) {
                zzaam zzaamVar2 = zzaam.zza;
                return new zzaaj(zzaamVar2, zzaamVar2);
            }
            long j5 = zzafyVar.zzf[zzi];
            j2 = zzafyVar.zzc[zzi];
            if (j5 >= j || zzi >= zzafyVar.zzb - 1 || (zzb = zzafyVar.zzb(j)) == -1 || zzb == zzi) {
                j3 = -9223372036854775807L;
            } else {
                j3 = zzafyVar.zzf[zzb];
                j4 = zzafyVar.zzc[zzb];
            }
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            zzafp[] zzafpVarArr2 = this.zzs;
            if (i2 >= zzafpVarArr2.length) {
                break;
            }
            if (i2 != this.zzu) {
                zzafy zzafyVar2 = zzafpVarArr2[i2].zzb;
                long zzj = zzj(zzafyVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = zzj(zzafyVar2, j3, j4);
                }
                j2 = zzj;
            }
            i2++;
        }
        zzaam zzaamVar3 = new zzaam(j, j2);
        return j3 == -9223372036854775807L ? new zzaaj(zzaamVar3, zzaamVar3) : new zzaaj(zzaamVar3, new zzaam(j3, j4));
    }

    @Override // com.google.android.gms.internal.ads.zzaal
    public final boolean zzh() {
        return true;
    }

    public zzafq(int i) {
        this.zzi = 0;
        this.zzg = new zzaft();
        this.zzh = new ArrayList();
        this.zze = new zzef(16);
        this.zzf = new ArrayDeque();
        this.zzb = new zzef(zzaaf.zza);
        this.zzc = new zzef(4);
        this.zzd = new zzef();
        this.zzn = -1;
        this.zzr = zzzl.zza;
        this.zzs = new zzafp[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x037e, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0085 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzzi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzzj zzzjVar, zzaai zzaaiVar) throws IOException {
        boolean z;
        boolean z2;
        while (true) {
            int i = this.zzi;
            if (i == 0) {
                if (this.zzl == 0) {
                    if (!zzzjVar.zzn(this.zze.zzH(), 0, 8, true)) {
                        return -1;
                    }
                    this.zzl = 8;
                    this.zze.zzF(0);
                    this.zzk = this.zze.zzs();
                    this.zzj = this.zze.zze();
                }
                long j = this.zzk;
                if (j == 1) {
                    zzzjVar.zzi(this.zze.zzH(), 8, 8);
                    this.zzl += 8;
                    this.zzk = this.zze.zzt();
                } else if (j == 0) {
                    long zzd = zzzjVar.zzd();
                    if (zzd == -1) {
                        zzaev zzaevVar = (zzaev) this.zzf.peek();
                        zzd = zzaevVar != null ? zzaevVar.zza : -1L;
                    }
                    if (zzd != -1) {
                        this.zzk = (zzd - zzzjVar.zzf()) + this.zzl;
                    }
                }
                long j2 = this.zzk;
                int i2 = this.zzl;
                if (j2 < i2) {
                    throw zzbu.zzc("Atom size less than header length (unsupported).");
                }
                int i3 = this.zzj;
                if (i3 == 1836019574 || i3 == 1953653099 || i3 == 1835297121 || i3 == 1835626086 || i3 == 1937007212 || i3 == 1701082227 || i3 == 1835365473) {
                    long zzf = zzzjVar.zzf();
                    long j3 = this.zzk;
                    long j4 = this.zzl;
                    long j5 = (zzf + j3) - j4;
                    if (j3 != j4 && this.zzj == 1835365473) {
                        this.zzd.zzC(8);
                        zzzjVar.zzh(this.zzd.zzH(), 0, 8);
                        zzaff.zzd(this.zzd);
                        zzzjVar.zzk(this.zzd.zzc());
                        zzzjVar.zzj();
                    }
                    this.zzf.push(new zzaev(this.zzj, j5));
                    if (this.zzk == this.zzl) {
                        zzl(j5);
                    } else {
                        zzk();
                    }
                } else if (i3 == 1835296868 || i3 == 1836476516 || i3 == 1751411826 || i3 == 1937011556 || i3 == 1937011827 || i3 == 1937011571 || i3 == 1668576371 || i3 == 1701606260 || i3 == 1937011555 || i3 == 1937011578 || i3 == 1937013298 || i3 == 1937007471 || i3 == 1668232756 || i3 == 1953196132 || i3 == 1718909296 || i3 == 1969517665 || i3 == 1801812339 || i3 == 1768715124) {
                    boolean z3 = false;
                    zzdd.zzf(z3);
                    zzdd.zzf(this.zzk <= 2147483647L);
                    zzef zzefVar = new zzef((int) this.zzk);
                    System.arraycopy(this.zze.zzH(), 0, zzefVar.zzH(), 0, 8);
                    this.zzm = zzefVar;
                    this.zzi = 1;
                } else {
                    long zzf2 = zzzjVar.zzf();
                    long j6 = this.zzl;
                    long j7 = zzf2 - j6;
                    if (this.zzj == 1836086884) {
                        this.zzx = new zzadt(0L, j7, -9223372036854775807L, j7 + j6, this.zzk - j6);
                    }
                    this.zzm = null;
                    this.zzi = 1;
                }
            } else {
                if (i != 1) {
                    long zzf3 = zzzjVar.zzf();
                    int i4 = this.zzn;
                    if (i4 == -1) {
                        int i5 = -1;
                        int i6 = -1;
                        boolean z4 = true;
                        boolean z5 = true;
                        long j8 = Long.MAX_VALUE;
                        long j9 = Long.MAX_VALUE;
                        long j10 = Long.MAX_VALUE;
                        int i7 = 0;
                        while (true) {
                            zzafp[] zzafpVarArr = this.zzs;
                            if (i7 >= zzafpVarArr.length) {
                                break;
                            }
                            zzafp zzafpVar = zzafpVarArr[i7];
                            int i8 = zzafpVar.zze;
                            zzafy zzafyVar = zzafpVar.zzb;
                            if (i8 != zzafyVar.zzb) {
                                long j11 = zzafyVar.zzc[i8];
                                long j12 = ((long[][]) zzen.zzH(this.zzt))[i7][i8];
                                long j13 = j11 - zzf3;
                                boolean z6 = j13 < 0 || j13 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                if (z6) {
                                    z = z5;
                                } else {
                                    if (!z5) {
                                        z = false;
                                    }
                                    z5 = z6;
                                    i5 = i7;
                                    j9 = j13;
                                    j10 = j12;
                                    if (j12 < j8) {
                                        z4 = z6;
                                        i6 = i7;
                                        j8 = j12;
                                    }
                                }
                                if (z6 != z || j13 >= j9) {
                                    z5 = z;
                                    if (j12 < j8) {
                                    }
                                }
                                z5 = z6;
                                i5 = i7;
                                j9 = j13;
                                j10 = j12;
                                if (j12 < j8) {
                                }
                            }
                            i7++;
                        }
                        i4 = (j8 == Long.MAX_VALUE || !z4 || j10 < j8 + 10485760) ? i5 : i6;
                        this.zzn = i4;
                        if (i4 == -1) {
                            return -1;
                        }
                    }
                    zzafp zzafpVar2 = this.zzs[i4];
                    zzaap zzaapVar = zzafpVar2.zzc;
                    int i9 = zzafpVar2.zze;
                    zzafy zzafyVar2 = zzafpVar2.zzb;
                    long j14 = zzafyVar2.zzc[i9];
                    int i10 = zzafyVar2.zzd[i9];
                    zzaaq zzaaqVar = zzafpVar2.zzd;
                    long j15 = (j14 - zzf3) + this.zzo;
                    if (j15 < 0 || j15 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        zzaaiVar.zza = j14;
                        return 1;
                    }
                    if (zzafpVar2.zza.zzg == 1) {
                        j15 += 8;
                        i10 -= 8;
                    }
                    zzzjVar.zzk((int) j15);
                    zzafv zzafvVar = zzafpVar2.zza;
                    int i11 = zzafvVar.zzj;
                    if (i11 == 0) {
                        if ("audio/ac4".equals(zzafvVar.zzf.zzm)) {
                            if (this.zzp == 0) {
                                zzym.zzb(i10, this.zzd);
                                zzaapVar.zzq(this.zzd, 7);
                                this.zzp += 7;
                            }
                            i10 += 7;
                        } else if (zzaaqVar != null) {
                            zzaaqVar.zzd(zzzjVar);
                        }
                        while (true) {
                            int i12 = this.zzp;
                            if (i12 >= i10) {
                                break;
                            }
                            int zze = zzaapVar.zze(zzzjVar, i10 - i12, false);
                            this.zzo += zze;
                            this.zzp += zze;
                            this.zzq -= zze;
                        }
                    } else {
                        byte[] zzH = this.zzc.zzH();
                        zzH[0] = 0;
                        zzH[1] = 0;
                        zzH[2] = 0;
                        int i13 = 4 - i11;
                        while (this.zzp < i10) {
                            int i14 = this.zzq;
                            if (i14 == 0) {
                                zzzjVar.zzi(zzH, i13, i11);
                                this.zzo += i11;
                                this.zzc.zzF(0);
                                int zze2 = this.zzc.zze();
                                if (zze2 < 0) {
                                    throw zzbu.zza("Invalid NAL length", null);
                                }
                                this.zzq = zze2;
                                this.zzb.zzF(0);
                                zzaapVar.zzq(this.zzb, 4);
                                this.zzp += 4;
                                i10 += i13;
                            } else {
                                int zze3 = zzaapVar.zze(zzzjVar, i14, false);
                                this.zzo += zze3;
                                this.zzp += zze3;
                                this.zzq -= zze3;
                            }
                        }
                    }
                    zzafy zzafyVar3 = zzafpVar2.zzb;
                    long j16 = zzafyVar3.zzf[i9];
                    int i15 = zzafyVar3.zzg[i9];
                    if (zzaaqVar != null) {
                        zzaaqVar.zzc(zzaapVar, j16, i15, i10, 0, null);
                        if (i9 + 1 == zzafpVar2.zzb.zzb) {
                            zzaaqVar.zza(zzaapVar, null);
                        }
                    } else {
                        zzaapVar.zzs(j16, i15, i10, 0, null);
                    }
                    zzafpVar2.zze++;
                    this.zzn = -1;
                    this.zzo = 0;
                    this.zzp = 0;
                    this.zzq = 0;
                    return 0;
                }
                long j17 = this.zzk - this.zzl;
                long zzf4 = zzzjVar.zzf() + j17;
                zzef zzefVar2 = this.zzm;
                if (zzefVar2 != null) {
                    zzzjVar.zzi(zzefVar2.zzH(), this.zzl, (int) j17);
                    if (this.zzj == 1718909296) {
                        zzefVar2.zzF(8);
                        int zzf5 = zzf(zzefVar2.zze());
                        if (zzf5 == 0) {
                            zzefVar2.zzG(4);
                            while (true) {
                                if (zzefVar2.zza() <= 0) {
                                    zzf5 = 0;
                                    break;
                                }
                                zzf5 = zzf(zzefVar2.zze());
                                if (zzf5 != 0) {
                                    break;
                                }
                            }
                        }
                        this.zzw = zzf5;
                    } else if (!this.zzf.isEmpty()) {
                        ((zzaev) this.zzf.peek()).zzd(new zzaew(this.zzj, zzefVar2));
                    }
                } else if (j17 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                    zzzjVar.zzk((int) j17);
                } else {
                    zzaaiVar.zza = zzzjVar.zzf() + j17;
                    z2 = true;
                    zzl(zzf4);
                    if (z2 && this.zzi != 2) {
                        return 1;
                    }
                }
                z2 = false;
                zzl(zzf4);
                if (z2) {
                    return 1;
                }
                continue;
            }
        }
    }
}
