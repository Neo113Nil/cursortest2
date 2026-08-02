package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzabc implements zzzi {
    private int zzc;
    private zzabd zze;
    private long zzh;
    private zzabf zzi;
    private int zzm;
    private boolean zzn;
    private final zzef zza = new zzef(12);
    private final zzabb zzb = new zzabb(null);
    private zzzl zzd = new zzzg();
    private zzabf[] zzg = new zzabf[0];
    private long zzk = -1;
    private long zzl = -1;
    private int zzj = -1;
    private long zzf = -9223372036854775807L;

    private final zzabf zzf(int i) {
        for (zzabf zzabfVar : this.zzg) {
            if (zzabfVar.zzg(i)) {
                return zzabfVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzb(zzzl zzzlVar) {
        this.zzc = 0;
        this.zzd = zzzlVar;
        this.zzh = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzc(long j, long j2) {
        int i;
        this.zzh = -1L;
        this.zzi = null;
        for (zzabf zzabfVar : this.zzg) {
            zzabfVar.zzf(j);
        }
        if (j != 0) {
            i = 6;
        } else {
            if (this.zzg.length == 0) {
                this.zzc = 0;
                return;
            }
            i = 3;
        }
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzzj zzzjVar) throws IOException {
        ((zzyy) zzzjVar).zzm(this.zza.zzH(), 0, 12, false);
        this.zza.zzF(0);
        if (this.zza.zzg() != 1179011410) {
            return false;
        }
        this.zza.zzG(4);
        return this.zza.zzg() == 541677121;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    @Override // com.google.android.gms.internal.ads.zzzi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzzj zzzjVar, zzaai zzaaiVar) throws IOException {
        boolean z;
        int i;
        int i2;
        zzabf zzabfVar;
        long j;
        long j2 = this.zzh;
        int i3 = 0;
        if (j2 != -1) {
            long zzf = zzzjVar.zzf();
            if (j2 < zzf || j2 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + zzf) {
                zzaaiVar.zza = j2;
                z = true;
                this.zzh = -1L;
                if (!z) {
                    return 1;
                }
                int i4 = this.zzc;
                if (i4 == 0) {
                    if (!zzd(zzzjVar)) {
                        throw zzbu.zza("AVI Header List not found", null);
                    }
                    ((zzyy) zzzjVar).zzo(12, false);
                    this.zzc = 1;
                    return 0;
                }
                if (i4 == 1) {
                    ((zzyy) zzzjVar).zzn(this.zza.zzH(), 0, 12, false);
                    this.zza.zzF(0);
                    zzabb zzabbVar = this.zzb;
                    zzef zzefVar = this.zza;
                    zzabbVar.zza(zzefVar);
                    int i5 = zzabbVar.zza;
                    if (i5 != 1414744396) {
                        throw zzbu.zza("LIST expected, found: " + i5, null);
                    }
                    zzabbVar.zzc = zzefVar.zzg();
                    zzabb zzabbVar2 = this.zzb;
                    int i6 = zzabbVar2.zzc;
                    if (i6 == 1819436136) {
                        this.zzj = zzabbVar2.zzb;
                        this.zzc = 2;
                        return 0;
                    }
                    throw zzbu.zza("hdrl expected, found: " + i6, null);
                }
                if (i4 == 2) {
                    int i7 = this.zzj - 4;
                    zzef zzefVar2 = new zzef(i7);
                    ((zzyy) zzzjVar).zzn(zzefVar2.zzH(), 0, i7, false);
                    zzabg zzc = zzabg.zzc(1819436136, zzefVar2);
                    if (zzc.zza() != 1819436136) {
                        throw zzbu.zza("Unexpected header list type " + zzc.zza(), null);
                    }
                    zzabd zzabdVar = (zzabd) zzc.zzb(zzabd.class);
                    if (zzabdVar == null) {
                        throw zzbu.zza("AviHeader not found", null);
                    }
                    this.zze = zzabdVar;
                    this.zzf = zzabdVar.zzc * zzabdVar.zza;
                    ArrayList arrayList = new ArrayList();
                    zzfvn zzfvnVar = zzc.zza;
                    int size = zzfvnVar.size();
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < size) {
                        zzaay zzaayVar = (zzaay) zzfvnVar.get(i8);
                        if (zzaayVar.zza() == 1819440243) {
                            zzabg zzabgVar = (zzabg) zzaayVar;
                            int i10 = i9 + 1;
                            zzabe zzabeVar = (zzabe) zzabgVar.zzb(zzabe.class);
                            zzabh zzabhVar = (zzabh) zzabgVar.zzb(zzabh.class);
                            if (zzabeVar == null) {
                                zzdw.zze("AviExtractor", "Missing Stream Header");
                            } else if (zzabhVar == null) {
                                zzdw.zze("AviExtractor", "Missing Stream Format");
                            } else {
                                i = i10;
                                long zzw = zzen.zzw(zzabeVar.zzd, zzabeVar.zzb * 1000000, zzabeVar.zzc);
                                zzaf zzafVar = zzabhVar.zza;
                                zzad zzb = zzafVar.zzb();
                                zzb.zzG(i9);
                                int i11 = zzabeVar.zze;
                                if (i11 != 0) {
                                    zzb.zzL(i11);
                                }
                                zzabi zzabiVar = (zzabi) zzabgVar.zzb(zzabi.class);
                                if (zzabiVar != null) {
                                    zzb.zzJ(zzabiVar.zza);
                                }
                                int zzb2 = zzbt.zzb(zzafVar.zzm);
                                if (zzb2 == 1) {
                                    i2 = zzb2;
                                } else if (zzb2 == 2) {
                                    i2 = 2;
                                } else {
                                    zzabfVar = null;
                                    if (zzabfVar != null) {
                                        arrayList.add(zzabfVar);
                                    }
                                    i9 = i;
                                }
                                zzaap zzv = this.zzd.zzv(i9, i2);
                                zzv.zzk(zzb.zzY());
                                zzabfVar = new zzabf(i9, i2, zzw, zzabeVar.zzd, zzv);
                                this.zzf = zzw;
                                if (zzabfVar != null) {
                                }
                                i9 = i;
                            }
                            zzabfVar = null;
                            i = i10;
                            if (zzabfVar != null) {
                            }
                            i9 = i;
                        }
                        i8++;
                        i3 = 0;
                    }
                    int i12 = i3;
                    this.zzg = (zzabf[]) arrayList.toArray(new zzabf[i12]);
                    this.zzd.zzC();
                    this.zzc = 3;
                    return i12;
                }
                if (i4 == 3) {
                    long j3 = this.zzk;
                    if (j3 != -1 && zzzjVar.zzf() != j3) {
                        this.zzh = j3;
                        return 0;
                    }
                    zzyy zzyyVar = (zzyy) zzzjVar;
                    zzyyVar.zzm(this.zza.zzH(), 0, 12, false);
                    zzzjVar.zzj();
                    this.zza.zzF(0);
                    this.zzb.zza(this.zza);
                    int zzg = this.zza.zzg();
                    int i13 = this.zzb.zza;
                    if (i13 == 1179011410) {
                        zzyyVar.zzo(12, false);
                        return 0;
                    }
                    if (i13 != 1414744396 || zzg != 1769369453) {
                        this.zzh = zzzjVar.zzf() + r6.zzb + 8;
                        return 0;
                    }
                    long zzf2 = zzzjVar.zzf();
                    this.zzk = zzf2;
                    long j4 = zzf2 + r6.zzb + 8;
                    this.zzl = j4;
                    if (!this.zzn) {
                        zzabd zzabdVar2 = this.zze;
                        Objects.requireNonNull(zzabdVar2);
                        if ((zzabdVar2.zzb & 16) == 16) {
                            this.zzc = 4;
                            this.zzh = j4;
                            return 0;
                        }
                        this.zzd.zzN(new zzaak(this.zzf, 0L));
                        this.zzn = true;
                    }
                    this.zzh = zzzjVar.zzf() + 12;
                    this.zzc = 6;
                    return 0;
                }
                if (i4 == 4) {
                    ((zzyy) zzzjVar).zzn(this.zza.zzH(), 0, 8, false);
                    this.zza.zzF(0);
                    int zzg2 = this.zza.zzg();
                    int zzg3 = this.zza.zzg();
                    if (zzg2 == 829973609) {
                        this.zzc = 5;
                        this.zzm = zzg3;
                    } else {
                        this.zzh = zzzjVar.zzf() + zzg3;
                    }
                    return 0;
                }
                if (i4 == 5) {
                    zzef zzefVar3 = new zzef(this.zzm);
                    ((zzyy) zzzjVar).zzn(zzefVar3.zzH(), 0, this.zzm, false);
                    if (zzefVar3.zza() < 16) {
                        j = 0;
                    } else {
                        int zzc2 = zzefVar3.zzc();
                        zzefVar3.zzG(8);
                        int zzg4 = zzefVar3.zzg();
                        long j5 = this.zzk;
                        j = ((long) zzg4) > j5 ? 0L : j5 + 8;
                        zzefVar3.zzF(zzc2);
                    }
                    while (zzefVar3.zza() >= 16) {
                        int zzg5 = zzefVar3.zzg();
                        int zzg6 = zzefVar3.zzg();
                        long zzg7 = zzefVar3.zzg() + j;
                        zzefVar3.zzg();
                        zzabf zzf3 = zzf(zzg5);
                        if (zzf3 != null) {
                            if ((zzg6 & 16) == 16) {
                                zzf3.zzb(zzg7);
                            }
                            zzf3.zzd();
                        }
                    }
                    for (zzabf zzabfVar2 : this.zzg) {
                        zzabfVar2.zzc();
                    }
                    this.zzn = true;
                    this.zzd.zzN(new zzaaz(this, this.zzf));
                    this.zzc = 6;
                    this.zzh = this.zzk;
                    return 0;
                }
                if (zzzjVar.zzf() >= this.zzl) {
                    return -1;
                }
                zzabf zzabfVar3 = this.zzi;
                if (zzabfVar3 != null) {
                    if (!zzabfVar3.zzh(zzzjVar)) {
                        return 0;
                    }
                    this.zzi = null;
                    return 0;
                }
                if ((zzzjVar.zzf() & 1) == 1) {
                    ((zzyy) zzzjVar).zzo(1, false);
                }
                zzyy zzyyVar2 = (zzyy) zzzjVar;
                zzyyVar2.zzm(this.zza.zzH(), 0, 12, false);
                this.zza.zzF(0);
                int zzg8 = this.zza.zzg();
                if (zzg8 == 1414744396) {
                    this.zza.zzF(8);
                    zzyyVar2.zzo(this.zza.zzg() != 1769369453 ? 8 : 12, false);
                    zzzjVar.zzj();
                    return 0;
                }
                int zzg9 = this.zza.zzg();
                if (zzg8 == 1263424842) {
                    this.zzh = zzzjVar.zzf() + zzg9 + 8;
                    return 0;
                }
                zzyyVar2.zzo(8, false);
                zzzjVar.zzj();
                zzabf zzf4 = zzf(zzg8);
                if (zzf4 == null) {
                    this.zzh = zzzjVar.zzf() + zzg9;
                    return 0;
                }
                zzf4.zze(zzg9);
                this.zzi = zzf4;
                return 0;
            }
            ((zzyy) zzzjVar).zzo((int) (j2 - zzf), false);
        }
        z = false;
        this.zzh = -1L;
        if (!z) {
        }
    }
}
