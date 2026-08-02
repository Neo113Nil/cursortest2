package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaeb implements zzack {
    private final zzek zza;
    private final zzaea zzb;
    private final boolean zzc;
    private final zzajy zzd;
    private int zze;
    private zzacn zzf;
    private zzaec zzg;
    private long zzh;
    private zzaee[] zzi;
    private long zzj;
    private zzaee zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzaeb() {
        this(1, zzajy.zza);
    }

    private final zzaee zzg(int i) {
        for (zzaee zzaeeVar : this.zzi) {
            if (zzaeeVar.zzg(i)) {
                return zzaeeVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ zzack zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        this.zze = 0;
        if (this.zzc) {
            zzacnVar = new zzakc(zzacnVar, this.zzd);
        }
        this.zzf = zzacnVar;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j, long j2) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzaee zzaeeVar : this.zzi) {
            zzaeeVar.zzf(j);
        }
        if (j == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) throws IOException {
        ((zzaby) zzaclVar).zzm(this.zza.zzM(), 0, 12, false);
        this.zza.zzK(0);
        if (this.zza.zzi() != 1179011410) {
            return false;
        }
        this.zza.zzL(4);
        return this.zza.zzi() == 541677121;
    }

    public zzaeb(int i, zzajy zzajyVar) {
        this.zzd = zzajyVar;
        this.zzc = 1 == (i ^ 1);
        this.zza = new zzek(12);
        this.zzb = new zzaea(null);
        this.zzf = new zzaci();
        this.zzi = new zzaee[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    @Override // com.google.android.gms.internal.ads.zzack
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) throws IOException {
        boolean z;
        int i;
        int i2;
        int i3;
        zzaee zzaeeVar;
        long j;
        long j2 = this.zzj;
        int i4 = 0;
        if (j2 != -1) {
            long zzf = zzaclVar.zzf();
            if (j2 < zzf || j2 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + zzf) {
                zzadfVar.zza = j2;
                z = true;
                this.zzj = -1L;
                if (!z) {
                    return 1;
                }
                int i5 = this.zze;
                zzaee zzaeeVar2 = null;
                if (i5 == 0) {
                    if (!zzj(zzaclVar)) {
                        throw zzbo.zza("AVI Header List not found", null);
                    }
                    ((zzaby) zzaclVar).zzo(12, false);
                    this.zze = 1;
                    return 0;
                }
                if (i5 == 1) {
                    ((zzaby) zzaclVar).zzn(this.zza.zzM(), 0, 12, false);
                    this.zza.zzK(0);
                    zzaea zzaeaVar = this.zzb;
                    zzek zzekVar = this.zza;
                    zzaeaVar.zza(zzekVar);
                    int i6 = zzaeaVar.zza;
                    if (i6 != 1414744396) {
                        throw zzbo.zza("LIST expected, found: " + i6, null);
                    }
                    zzaeaVar.zzc = zzekVar.zzi();
                    zzaea zzaeaVar2 = this.zzb;
                    int i7 = zzaeaVar2.zzc;
                    if (i7 == 1819436136) {
                        this.zzl = zzaeaVar2.zzb;
                        this.zze = 2;
                        return 0;
                    }
                    throw zzbo.zza("hdrl expected, found: " + i7, null);
                }
                if (i5 == 2) {
                    int i8 = this.zzl - 4;
                    zzek zzekVar2 = new zzek(i8);
                    ((zzaby) zzaclVar).zzn(zzekVar2.zzM(), 0, i8, false);
                    zzaef zzc = zzaef.zzc(1819436136, zzekVar2);
                    if (zzc.zza() != 1819436136) {
                        throw zzbo.zza("Unexpected header list type " + zzc.zza(), null);
                    }
                    zzaec zzaecVar = (zzaec) zzc.zzb(zzaec.class);
                    if (zzaecVar == null) {
                        throw zzbo.zza("AviHeader not found", null);
                    }
                    this.zzg = zzaecVar;
                    this.zzh = zzaecVar.zzc * zzaecVar.zza;
                    ArrayList arrayList = new ArrayList();
                    zzfxr zzfxrVar = zzc.zza;
                    int size = zzfxrVar.size();
                    int i9 = 0;
                    int i10 = 0;
                    while (i9 < size) {
                        zzadx zzadxVar = (zzadx) zzfxrVar.get(i9);
                        if (zzadxVar.zza() == 1819440243) {
                            zzaef zzaefVar = (zzaef) zzadxVar;
                            int i11 = i10 + 1;
                            zzaed zzaedVar = (zzaed) zzaefVar.zzb(zzaed.class);
                            zzaeg zzaegVar = (zzaeg) zzaefVar.zzb(zzaeg.class);
                            if (zzaedVar == null) {
                                zzea.zzf("AviExtractor", "Missing Stream Header");
                            } else if (zzaegVar == null) {
                                zzea.zzf("AviExtractor", "Missing Stream Format");
                            } else {
                                i = i9;
                                i2 = i11;
                                long zzt = zzet.zzt(zzaedVar.zzd, zzaedVar.zzb * 1000000, zzaedVar.zzc, RoundingMode.FLOOR);
                                zzaf zzafVar = zzaegVar.zza;
                                zzad zzb = zzafVar.zzb();
                                zzb.zzJ(i10);
                                int i12 = zzaedVar.zze;
                                if (i12 != 0) {
                                    zzb.zzP(i12);
                                }
                                zzaeh zzaehVar = (zzaeh) zzaefVar.zzb(zzaeh.class);
                                if (zzaehVar != null) {
                                    zzb.zzM(zzaehVar.zza);
                                }
                                int zzb2 = zzbn.zzb(zzafVar.zzm);
                                if (zzb2 == 1) {
                                    i3 = zzb2;
                                } else if (zzb2 == 2) {
                                    i3 = 2;
                                } else {
                                    zzaeeVar = null;
                                    if (zzaeeVar != null) {
                                        arrayList.add(zzaeeVar);
                                    }
                                    i10 = i2;
                                }
                                zzadp zzw = this.zzf.zzw(i10, i3);
                                zzw.zzl(zzb.zzad());
                                zzaeeVar = new zzaee(i10, i3, zzt, zzaedVar.zzd, zzw);
                                this.zzh = zzt;
                                if (zzaeeVar != null) {
                                }
                                i10 = i2;
                            }
                            i = i9;
                            zzaeeVar = zzaeeVar2;
                            i2 = i11;
                            if (zzaeeVar != null) {
                            }
                            i10 = i2;
                        } else {
                            i = i9;
                        }
                        i9 = i + 1;
                        i4 = 0;
                        zzaeeVar2 = null;
                    }
                    this.zzi = (zzaee[]) arrayList.toArray(new zzaee[i4]);
                    this.zzf.zzD();
                    this.zze = 3;
                    return i4;
                }
                if (i5 == 3) {
                    long j3 = this.zzm;
                    if (j3 != -1 && zzaclVar.zzf() != j3) {
                        this.zzj = j3;
                        return 0;
                    }
                    zzaby zzabyVar = (zzaby) zzaclVar;
                    zzabyVar.zzm(this.zza.zzM(), 0, 12, false);
                    zzaclVar.zzj();
                    this.zza.zzK(0);
                    this.zzb.zza(this.zza);
                    zzek zzekVar3 = this.zza;
                    zzaea zzaeaVar3 = this.zzb;
                    int zzi = zzekVar3.zzi();
                    int i13 = zzaeaVar3.zza;
                    if (i13 == 1179011410) {
                        zzabyVar.zzo(12, false);
                        return 0;
                    }
                    if (i13 != 1414744396 || zzi != 1769369453) {
                        this.zzj = zzaclVar.zzf() + zzaeaVar3.zzb + 8;
                        return 0;
                    }
                    long zzf2 = zzaclVar.zzf();
                    this.zzm = zzf2;
                    long j4 = zzf2 + zzaeaVar3.zzb + 8;
                    this.zzn = j4;
                    if (!this.zzp) {
                        zzaec zzaecVar2 = this.zzg;
                        zzaecVar2.getClass();
                        if ((zzaecVar2.zzb & 16) == 16) {
                            this.zze = 4;
                            this.zzj = j4;
                            return 0;
                        }
                        this.zzf.zzO(new zzadh(this.zzh, 0L));
                        this.zzp = true;
                    }
                    this.zzj = zzaclVar.zzf() + 12;
                    this.zze = 6;
                    return 0;
                }
                if (i5 == 4) {
                    ((zzaby) zzaclVar).zzn(this.zza.zzM(), 0, 8, false);
                    this.zza.zzK(0);
                    zzek zzekVar4 = this.zza;
                    int zzi2 = zzekVar4.zzi();
                    int zzi3 = zzekVar4.zzi();
                    if (zzi2 == 829973609) {
                        this.zze = 5;
                        this.zzo = zzi3;
                    } else {
                        this.zzj = zzaclVar.zzf() + zzi3;
                    }
                    return 0;
                }
                if (i5 == 5) {
                    zzek zzekVar5 = new zzek(this.zzo);
                    ((zzaby) zzaclVar).zzn(zzekVar5.zzM(), 0, this.zzo, false);
                    if (zzekVar5.zzb() < 16) {
                        j = 0;
                    } else {
                        int zzd = zzekVar5.zzd();
                        zzekVar5.zzL(8);
                        long zzi4 = zzekVar5.zzi();
                        long j5 = this.zzm;
                        j = zzi4 > j5 ? 0L : j5 + 8;
                        zzekVar5.zzK(zzd);
                    }
                    while (zzekVar5.zzb() >= 16) {
                        int zzi5 = zzekVar5.zzi();
                        int zzi6 = zzekVar5.zzi();
                        long zzi7 = zzekVar5.zzi() + j;
                        zzekVar5.zzi();
                        zzaee zzg = zzg(zzi5);
                        if (zzg != null) {
                            if ((zzi6 & 16) == 16) {
                                zzg.zzb(zzi7);
                            }
                            zzg.zzd();
                        }
                    }
                    for (zzaee zzaeeVar3 : this.zzi) {
                        zzaeeVar3.zzc();
                    }
                    this.zzp = true;
                    this.zzf.zzO(new zzady(this, this.zzh));
                    this.zze = 6;
                    this.zzj = this.zzm;
                    return 0;
                }
                if (zzaclVar.zzf() >= this.zzn) {
                    return -1;
                }
                zzaee zzaeeVar4 = this.zzk;
                if (zzaeeVar4 != null) {
                    if (!zzaeeVar4.zzh(zzaclVar)) {
                        return 0;
                    }
                    this.zzk = null;
                    return 0;
                }
                if ((zzaclVar.zzf() & 1) == 1) {
                    ((zzaby) zzaclVar).zzo(1, false);
                }
                zzaby zzabyVar2 = (zzaby) zzaclVar;
                zzabyVar2.zzm(this.zza.zzM(), 0, 12, false);
                this.zza.zzK(0);
                int zzi8 = this.zza.zzi();
                if (zzi8 == 1414744396) {
                    this.zza.zzK(8);
                    zzabyVar2.zzo(this.zza.zzi() != 1769369453 ? 8 : 12, false);
                    zzaclVar.zzj();
                    return 0;
                }
                int zzi9 = this.zza.zzi();
                if (zzi8 == 1263424842) {
                    this.zzj = zzaclVar.zzf() + zzi9 + 8;
                    return 0;
                }
                zzabyVar2.zzo(8, false);
                zzaclVar.zzj();
                zzaee zzg2 = zzg(zzi8);
                if (zzg2 == null) {
                    this.zzj = zzaclVar.zzf() + zzi9;
                    return 0;
                }
                zzg2.zze(zzi9);
                this.zzk = zzg2;
                return 0;
            }
            ((zzaby) zzaclVar).zzo((int) (j2 - zzf), false);
        }
        z = false;
        this.zzj = -1L;
        if (!z) {
        }
    }
}
