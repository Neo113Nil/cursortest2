package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.SieveCacheKt;
import androidx.media3.common.C;
import androidx.media3.common.MimeTypes;
import androidx.media3.container.Mp4Box;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzaim implements zzacu, zzadv {
    public static final /* synthetic */ int zza = 0;
    private int zzA;
    private long zzB;
    private int zzC;
    private zzago zzD;
    private final zzajt zzb;
    private final int zzc;
    private final zzef zzd;
    private final zzef zze;
    private final zzef zzf;
    private final zzef zzg;
    private final ArrayDeque zzh;
    private final zzaiq zzi;
    private final List zzj;
    private zzgjz zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;
    private zzef zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private long zzw;
    private zzacx zzx;
    private zzail[] zzy;
    private long[][] zzz;

    static {
        int i = zzaij.zza;
    }

    @Deprecated
    public zzaim() {
        this(zzajt.zza, 16);
    }

    private final void zzj() {
        this.zzl = 0;
        this.zzo = 0;
    }

    private final void zzk(long j) throws zzas {
        zzao zzaoVar;
        int i;
        ArrayDeque arrayDeque;
        List list;
        int i2;
        while (true) {
            ArrayDeque arrayDeque2 = this.zzh;
            if (arrayDeque2.isEmpty() || ((zzet) arrayDeque2.peek()).zza != j) {
                break;
            }
            zzet zzetVar = (zzet) arrayDeque2.pop();
            if (zzetVar.zzd == 1836019574) {
                zzet zzd = zzetVar.zzd(Mp4Box.TYPE_meta);
                new ArrayList();
                zzao zze = zzd != null ? zzahy.zze(zzd) : null;
                ArrayList arrayList = new ArrayList();
                int i3 = 0;
                boolean z = this.zzC == 1;
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
                int i4 = this.zzc;
                List zzb = zzahy.zzb(zzetVar, zzadkVar, C.TIME_UNSET, null, 1 == (i4 & 1), z, zzaik.zza, false);
                String zza2 = zzaii.zza(zzb);
                int i5 = 0;
                int i6 = 0;
                long j2 = -9223372036854775807L;
                int i7 = -1;
                while (i5 < zzb.size()) {
                    zzaiv zzaivVar = (zzaiv) zzb.get(i5);
                    int i8 = i3;
                    if (zzaivVar.zzb == 0) {
                        arrayDeque = arrayDeque2;
                        i2 = i5;
                        i = i6;
                        list = zzb;
                    } else {
                        zzais zzaisVar = zzaivVar.zza;
                        zzacx zzacxVar = this.zzx;
                        i = i6 + 1;
                        arrayDeque = arrayDeque2;
                        int i9 = zzaisVar.zzb;
                        zzail zzailVar = new zzail(zzaisVar, zzaivVar, zzacxVar.zzu(i6, i9));
                        list = zzb;
                        long j3 = zzaisVar.zze;
                        if (j3 == C.TIME_UNSET) {
                            j3 = zzaivVar.zzh;
                        }
                        i2 = i5;
                        zzaeb zzaebVar = zzailVar.zzc;
                        long max = Math.max(j2, j3);
                        zzu zzuVar = zzaisVar.zzg;
                        String str = zzuVar.zzo;
                        int i10 = MimeTypes.AUDIO_TRUEHD.equals(str) ? zzaivVar.zze * 16 : zzaivVar.zze + 30;
                        zzs zza3 = zzuVar.zza();
                        zza3.zzn(i10);
                        if (i9 == 2) {
                            int i11 = zzuVar.zzf;
                            if ((i4 & 8) != 0) {
                                i11 |= i7 == -1 ? 1 : 2;
                            }
                            zza3.zzg(i11);
                            i9 = 2;
                        }
                        zzaih.zzb(i9, zzadkVar, zza3);
                        zzao zzaoVar3 = zzuVar.zzl;
                        List list2 = this.zzj;
                        zzao[] zzaoVarArr = new zzao[3];
                        zzaoVarArr[i8] = list2.isEmpty() ? null : new zzao(list2);
                        zzaoVarArr[1] = zzaoVar;
                        zzaoVarArr[2] = zzaoVar2;
                        zzaih.zza(i9, zze, zza3, zzaoVar3, zzaoVarArr);
                        zza3.zzl(zza2);
                        if (Objects.equals(str, MimeTypes.AUDIO_MPEG)) {
                            zzailVar.zzf = zza3.zzM();
                        } else {
                            zzaebVar.zzu(zza3.zzM());
                        }
                        if (i9 == 2 && i7 == -1) {
                            i7 = arrayList.size();
                        }
                        arrayList.add(zzailVar);
                        j2 = max;
                    }
                    i5 = i2 + 1;
                    zzb = list;
                    i3 = i8;
                    i6 = i;
                    arrayDeque2 = arrayDeque;
                }
                ArrayDeque arrayDeque3 = arrayDeque2;
                this.zzA = i7;
                this.zzB = j2;
                zzail[] zzailVarArr = (zzail[]) arrayList.toArray(new zzail[i3]);
                this.zzy = zzailVarArr;
                int length = zzailVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i12 = 0; i12 < zzailVarArr.length; i12++) {
                    jArr[i12] = new long[zzailVarArr[i12].zzb.zzb];
                    jArr2[i12] = zzailVarArr[i12].zzb.zzf[0];
                }
                long j4 = 0;
                int i13 = 0;
                while (i13 < zzailVarArr.length) {
                    long j5 = Long.MAX_VALUE;
                    int i14 = -1;
                    for (int i15 = 0; i15 < zzailVarArr.length; i15++) {
                        if (!zArr[i15]) {
                            long j6 = jArr2[i15];
                            if (j6 <= j5) {
                                i14 = i15;
                                j5 = j6;
                            }
                        }
                    }
                    int i16 = iArr[i14];
                    long[] jArr3 = jArr[i14];
                    jArr3[i16] = j4;
                    zzaiv zzaivVar2 = zzailVarArr[i14].zzb;
                    j4 += zzaivVar2.zzd[i16];
                    int i17 = i16 + 1;
                    iArr[i14] = i17;
                    if (i17 < jArr3.length) {
                        jArr2[i14] = zzaivVar2.zzf[i17];
                    } else {
                        zArr[i14] = true;
                        i13++;
                    }
                }
                this.zzz = jArr;
                this.zzx.zzv();
                this.zzx.zzw(this);
                arrayDeque3.clear();
                this.zzl = 2;
            } else if (!arrayDeque2.isEmpty()) {
                ((zzet) arrayDeque2.peek()).zzb(zzetVar);
            }
        }
        if (this.zzl != 2) {
            zzj();
        }
    }

    private static long zzl(zzaiv zzaivVar, long j, long j2) {
        int zzm = zzm(zzaivVar, j);
        return zzm == -1 ? j2 : Math.min(zzaivVar.zzc[zzm], j2);
    }

    private static int zzm(zzaiv zzaivVar, long j) {
        int zza2 = zzaivVar.zza(j);
        return zza2 == -1 ? zzaivVar.zzb(j) : zza2;
    }

    private static int zzn(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int zzb;
        long j6 = j;
        zzail[] zzailVarArr = this.zzy;
        if (zzailVarArr.length == 0) {
            zzadw zzadwVar = zzadw.zza;
            return new zzadt(zzadwVar, zzadwVar);
        }
        int i = this.zzA;
        if (i != -1) {
            zzaiv zzaivVar = zzailVarArr[i].zzb;
            int zzm = zzm(zzaivVar, j6);
            if (zzm == -1) {
                zzadw zzadwVar2 = zzadw.zza;
                return new zzadt(zzadwVar2, zzadwVar2);
            }
            long[] jArr = zzaivVar.zzf;
            long j7 = jArr[zzm];
            long[] jArr2 = zzaivVar.zzc;
            j2 = jArr2[zzm];
            if (j7 >= j6 || zzm >= zzaivVar.zzb - 1 || (zzb = zzaivVar.zzb(j6)) == -1 || zzb == zzm) {
                j5 = -9223372036854775807L;
                j4 = -1;
            } else {
                j5 = jArr[zzb];
                j4 = jArr2[zzb];
            }
            j3 = j5;
            j6 = j7;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
            j4 = -1;
        }
        int i2 = 0;
        while (true) {
            zzail[] zzailVarArr2 = this.zzy;
            if (i2 >= zzailVarArr2.length) {
                break;
            }
            if (i2 != this.zzA) {
                zzaiv zzaivVar2 = zzailVarArr2[i2].zzb;
                long zzl = zzl(zzaivVar2, j6, j2);
                if (j3 != C.TIME_UNSET) {
                    j4 = zzl(zzaivVar2, j3, j4);
                }
                j2 = zzl;
            }
            i2++;
        }
        zzadw zzadwVar3 = new zzadw(j6, j2);
        return j3 == C.TIME_UNSET ? new zzadt(zzadwVar3, zzadwVar3) : new zzadt(zzadwVar3, new zzadw(j3, j4));
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        zzadz zzb = zzair.zzb(zzacvVar, (this.zzc & 2) != 0);
        this.zzk = zzb != null ? zzgjz.zzj(zzb) : zzgjz.zzi();
        return zzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ List zze() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        if ((this.zzc & 16) == 0) {
            zzacxVar = new zzajw(zzacxVar, this.zzb);
        }
        this.zzx = zzacxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = false;
        if (j == 0) {
            if (this.zzl != 3) {
                zzj();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (zzail zzailVar : this.zzy) {
            zzaiv zzaivVar = zzailVar.zzb;
            int zza2 = zzaivVar.zza(j2);
            if (zza2 == -1) {
                zza2 = zzaivVar.zzb(j2);
            }
            zzailVar.zze = zza2;
            zzaec zzaecVar = zzailVar.zzd;
            if (zzaecVar != null) {
                zzaecVar.zza();
            }
        }
    }

    public zzaim(zzajt zzajtVar, int i) {
        this.zzb = zzajtVar;
        this.zzc = i;
        this.zzk = zzgjz.zzi();
        this.zzl = (i & 4) != 0 ? 3 : 0;
        this.zzi = new zzaiq();
        this.zzj = new ArrayList();
        this.zzg = new zzef(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzef(zzfl.zza);
        this.zze = new zzef(6);
        this.zzf = new zzef();
        this.zzq = -1;
        this.zzx = zzacx.zza;
        this.zzy = new zzail[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x04a2, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x009a A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzg(zzacv zzacvVar, zzads zzadsVar) throws IOException {
        long j;
        long j2;
        zzaeb zzaebVar;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        while (true) {
            int i4 = this.zzl;
            long j3 = 0;
            if (i4 == 0) {
                if (this.zzo == 0) {
                    zzef zzefVar = this.zzg;
                    if (!zzacvVar.zzb(zzefVar.zzi(), 0, 8, true)) {
                        if (this.zzC != 2 || (this.zzc & 2) == 0) {
                            return -1;
                        }
                        zzaeb zzu = this.zzx.zzu(0, 4);
                        zzago zzagoVar = this.zzD;
                        zzao zzaoVar = zzagoVar == null ? null : new zzao(C.TIME_UNSET, zzagoVar);
                        zzs zzsVar = new zzs();
                        zzsVar.zzk(zzaoVar);
                        zzu.zzu(zzsVar.zzM());
                        this.zzx.zzv();
                        this.zzx.zzw(new zzadu(C.TIME_UNSET, 0L));
                        return -1;
                    }
                    this.zzo = 8;
                    zzefVar.zzh(0);
                    this.zzn = zzefVar.zzz();
                    this.zzm = zzefVar.zzB();
                }
                long j4 = this.zzn;
                if (j4 == 1) {
                    zzef zzefVar2 = this.zzg;
                    zzacvVar.zzc(zzefVar2.zzi(), 8, 8);
                    this.zzo += 8;
                    this.zzn = zzefVar2.zzJ();
                } else if (j4 == 0) {
                    long zzo = zzacvVar.zzo();
                    if (zzo == -1) {
                        zzet zzetVar = (zzet) this.zzh.peek();
                        zzo = zzetVar != null ? zzetVar.zza : -1L;
                    }
                    if (zzo != -1) {
                        this.zzn = (zzo - zzacvVar.zzn()) + this.zzo;
                    }
                }
                long j5 = this.zzn;
                int i5 = this.zzo;
                if (j5 < i5) {
                    throw zzas.zzc("Atom size less than header length (unsupported).");
                }
                int i6 = this.zzm;
                if (i6 == 1836019574 || i6 == 1953653099 || i6 == 1835297121 || i6 == 1835626086 || i6 == 1937007212 || i6 == 1701082227 || i6 == 1835365473 || i6 == 1635284069) {
                    long zzn = zzacvVar.zzn();
                    long j6 = this.zzn;
                    long j7 = zzn + j6;
                    long j8 = this.zzo;
                    if (j6 != j8 && this.zzm == 1835365473) {
                        zzef zzefVar3 = this.zzf;
                        zzefVar3.zza(8);
                        zzacvVar.zzi(zzefVar3.zzi(), 0, 8);
                        zzahy.zzf(zzefVar3);
                        zzacvVar.zzf(zzefVar3.zzg());
                        zzacvVar.zzl();
                    }
                    long j9 = j7 - j8;
                    this.zzh.push(new zzet(this.zzm, j9));
                    if (this.zzn == this.zzo) {
                        zzk(j9);
                    } else {
                        zzj();
                    }
                } else if (i6 == 1835296868 || i6 == 1836476516 || i6 == 1751411826 || i6 == 1937011556 || i6 == 1937011827 || i6 == 1937011571 || i6 == 1668576371 || i6 == 1701606260 || i6 == 1937011555 || i6 == 1937011578 || i6 == 1937013298 || i6 == 1937007471 || i6 == 1668232756 || i6 == 1953196132 || i6 == 1718909296 || i6 == 1969517665 || i6 == 1801812339 || i6 == 1768715124) {
                    boolean z3 = false;
                    zzghc.zzh(z3);
                    zzghc.zzh(this.zzn <= SieveCacheKt.NodeLinkMask);
                    zzef zzefVar4 = new zzef((int) this.zzn);
                    System.arraycopy(this.zzg.zzi(), 0, zzefVar4.zzi(), 0, 8);
                    this.zzp = zzefVar4;
                    this.zzl = 1;
                } else {
                    long zzn2 = zzacvVar.zzn();
                    long j10 = this.zzo;
                    long j11 = zzn2 - j10;
                    if (this.zzm == 1836086884) {
                        this.zzD = new zzago(0L, j11, C.TIME_UNSET, j11 + j10, this.zzn - j10);
                    }
                    this.zzp = null;
                    this.zzl = 1;
                }
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        this.zzi.zzb(zzacvVar, zzadsVar, this.zzj);
                        if (zzadsVar.zza == 0) {
                            zzj();
                        }
                        return 1;
                    }
                    long zzn3 = zzacvVar.zzn();
                    int i7 = this.zzq;
                    if (i7 == -1) {
                        int i8 = -1;
                        int i9 = -1;
                        boolean z4 = true;
                        boolean z5 = true;
                        long j12 = Long.MAX_VALUE;
                        long j13 = Long.MAX_VALUE;
                        long j14 = Long.MAX_VALUE;
                        int i10 = 0;
                        j2 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                        while (true) {
                            zzail[] zzailVarArr = this.zzy;
                            if (i10 >= zzailVarArr.length) {
                                break;
                            }
                            zzail zzailVar = zzailVarArr[i10];
                            int i11 = zzailVar.zze;
                            zzaiv zzaivVar = zzailVar.zzb;
                            long j15 = j3;
                            if (i11 != zzaivVar.zzb) {
                                long j16 = zzaivVar.zzc[i11];
                                long[][] jArr = this.zzz;
                                jArr.getClass();
                                long j17 = jArr[i10][i11];
                                long j18 = j16 - zzn3;
                                boolean z6 = j18 < j15 || j18 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                                if (z6) {
                                    z = z5;
                                } else {
                                    if (!z5) {
                                        z = false;
                                    }
                                    z5 = z6;
                                    i9 = i10;
                                    j13 = j17;
                                    j14 = j18;
                                    if (j17 < j12) {
                                        z4 = z6;
                                        i8 = i10;
                                        j12 = j17;
                                    }
                                }
                                if (z6 != z || j18 >= j14) {
                                    z5 = z;
                                    if (j17 < j12) {
                                    }
                                }
                                z5 = z6;
                                i9 = i10;
                                j13 = j17;
                                j14 = j18;
                                if (j17 < j12) {
                                }
                            }
                            i10++;
                            j3 = j15;
                        }
                        j = j3;
                        i7 = (j12 == Long.MAX_VALUE || !z4 || j13 < j12 + 10485760) ? i9 : i8;
                        this.zzq = i7;
                        if (i7 == -1) {
                            return -1;
                        }
                    } else {
                        j = 0;
                        j2 = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                    }
                    zzail zzailVar2 = this.zzy[i7];
                    zzaeb zzaebVar2 = zzailVar2.zzc;
                    int i12 = zzailVar2.zze;
                    zzaiv zzaivVar2 = zzailVar2.zzb;
                    long j19 = zzaivVar2.zzc[i12] + this.zzw;
                    int[] iArr = zzaivVar2.zzd;
                    int i13 = iArr[i12];
                    zzaec zzaecVar = zzailVar2.zzd;
                    zzaeb zzaebVar3 = zzaebVar2;
                    int i14 = 0;
                    long j20 = (j19 - zzn3) + this.zzr;
                    if (j20 < j || j20 >= j2) {
                        zzadsVar.zza = j19;
                        return 1;
                    }
                    zzais zzaisVar = zzailVar2.zza;
                    if (zzaisVar.zzh == 1) {
                        j20 += 8;
                        i13 -= 8;
                    }
                    int i15 = i13;
                    zzacvVar.zzf((int) j20);
                    zzu zzuVar = zzaisVar.zzg;
                    String str = zzuVar.zzo;
                    if (!Objects.equals(str, MimeTypes.VIDEO_H264)) {
                        Objects.equals(str, MimeTypes.VIDEO_H265);
                    }
                    this.zzu = true;
                    int i16 = zzaisVar.zzk;
                    if (i16 == 0) {
                        zzaebVar = zzaebVar3;
                        if (MimeTypes.AUDIO_AC4.equals(str)) {
                            if (this.zzs == 0) {
                                zzef zzefVar5 = this.zzf;
                                zzaby.zzc(i15, zzefVar5);
                                zzaebVar.zzz(zzefVar5, 7);
                                this.zzs += 7;
                            }
                            i15 += 7;
                        } else if (zzailVar2.zzf != null && Objects.equals(str, MimeTypes.AUDIO_MPEG)) {
                            zzu zzuVar2 = zzailVar2.zzf;
                            zzef zzefVar6 = this.zzf;
                            zzefVar6.zza(4);
                            zzacvVar.zzi(zzefVar6.zzi(), 0, 4);
                            zzacvVar.zzl();
                            zzado zzadoVar = new zzado();
                            if (zzadoVar.zza(zzefVar6.zzB()) && !Objects.equals(zzuVar2.zzo, zzadoVar.zzb)) {
                                zzs zza2 = zzuVar2.zza();
                                String str2 = zzadoVar.zzb;
                                str2.getClass();
                                zza2.zzm(str2);
                                zzuVar2 = zza2.zzM();
                            }
                            zzaebVar.zzu(zzuVar2);
                            zzailVar2.zzf = null;
                        } else if (zzaecVar != null) {
                            zzaecVar.zzb(zzacvVar);
                        }
                        while (true) {
                            int i17 = this.zzs;
                            if (i17 >= i15) {
                                break;
                            }
                            int zzy = zzaebVar.zzy(zzacvVar, i15 - i17, false);
                            this.zzr += zzy;
                            this.zzs += zzy;
                            this.zzt -= zzy;
                        }
                    } else {
                        zzef zzefVar7 = this.zze;
                        byte[] zzi = zzefVar7.zzi();
                        zzi[0] = 0;
                        zzi[1] = 0;
                        zzi[2] = 0;
                        int i18 = 4 - i16;
                        i15 += i18;
                        while (this.zzs < i15) {
                            int i19 = this.zzt;
                            if (i19 == 0) {
                                if (this.zzu || zzfl.zzb(zzuVar) + i16 > iArr[i12] - this.zzr) {
                                    i2 = i16;
                                    i3 = i14;
                                } else {
                                    i3 = zzfl.zzb(zzuVar);
                                    i2 = i16 + i3;
                                }
                                zzacvVar.zzc(zzi, i18, i2);
                                this.zzr += i2;
                                int i20 = i14;
                                zzefVar7.zzh(i20);
                                int zzB = zzefVar7.zzB();
                                if (zzB < 0) {
                                    throw zzas.zzb("Invalid NAL length", null);
                                }
                                this.zzt = zzB - i3;
                                zzef zzefVar8 = this.zzd;
                                zzefVar8.zzh(i20);
                                i = i16;
                                zzaeb zzaebVar4 = zzaebVar3;
                                zzaebVar4.zzz(zzefVar8, 4);
                                this.zzs += 4;
                                if (i3 > 0) {
                                    zzaebVar4.zzz(zzefVar7, i3);
                                    this.zzs += i3;
                                    if (zzfl.zzc(zzi, 4, i3, zzuVar)) {
                                        this.zzu = true;
                                        zzaebVar3 = zzaebVar4;
                                        i16 = i;
                                        i14 = 0;
                                    }
                                }
                                zzaebVar3 = zzaebVar4;
                            } else {
                                i = i16;
                                int zzy2 = zzaebVar3.zzy(zzacvVar, i19, i14);
                                this.zzr += zzy2;
                                this.zzs += zzy2;
                                this.zzt -= zzy2;
                            }
                            i16 = i;
                            i14 = 0;
                        }
                        zzaebVar = zzaebVar3;
                    }
                    int i21 = i15;
                    long j21 = zzaivVar2.zzf[i12];
                    int i22 = zzaivVar2.zzg[i12];
                    if (!this.zzu) {
                        i22 |= 67108864;
                    }
                    int i23 = i22;
                    if (zzaecVar != null) {
                        zzaeb zzaebVar5 = zzaebVar;
                        zzaecVar.zzc(zzaebVar5, j21, i23, i21, 0, null);
                        if (i12 + 1 == zzaivVar2.zzb) {
                            zzaecVar.zzd(zzaebVar5, null);
                        }
                    } else {
                        zzaebVar.zzx(j21, i23, i21, 0, null);
                    }
                    zzailVar2.zze++;
                    this.zzq = -1;
                    this.zzr = 0;
                    this.zzs = 0;
                    this.zzt = 0;
                    this.zzu = false;
                    return 0;
                }
                long j22 = this.zzn - this.zzo;
                long zzn4 = zzacvVar.zzn() + j22;
                zzef zzefVar9 = this.zzp;
                if (zzefVar9 != null) {
                    zzacvVar.zzc(zzefVar9.zzi(), this.zzo, (int) j22);
                    if (this.zzm == 1718909296) {
                        this.zzv = true;
                        zzefVar9.zzh(8);
                        int zzn5 = zzn(zzefVar9.zzB());
                        if (zzn5 == 0) {
                            zzefVar9.zzk(4);
                            while (true) {
                                if (zzefVar9.zzd() <= 0) {
                                    zzn5 = 0;
                                    break;
                                }
                                zzn5 = zzn(zzefVar9.zzB());
                                if (zzn5 != 0) {
                                    break;
                                }
                            }
                        }
                        this.zzC = zzn5;
                    } else {
                        ArrayDeque arrayDeque = this.zzh;
                        if (!arrayDeque.isEmpty()) {
                            ((zzet) arrayDeque.peek()).zza(new zzeu(this.zzm, zzefVar9));
                        }
                    }
                } else {
                    if (!this.zzv && this.zzm == 1835295092) {
                        this.zzC = 1;
                    }
                    if (j22 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        zzacvVar.zzf((int) j22);
                    } else {
                        zzadsVar.zza = zzacvVar.zzn() + j22;
                        z2 = true;
                        zzk(zzn4);
                        if (z2 && this.zzl != 2) {
                            return 1;
                        }
                    }
                }
                z2 = false;
                zzk(zzn4);
                if (z2) {
                    return 1;
                }
                continue;
            }
        }
    }
}
