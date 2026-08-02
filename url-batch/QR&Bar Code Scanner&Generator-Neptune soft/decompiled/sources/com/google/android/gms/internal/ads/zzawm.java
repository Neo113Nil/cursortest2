package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzawm implements zzauz, zzavg {
    public static final zzavb zza = new zzawk();
    private static final int zzb = zzbar.zzg("qt  ");
    private int zzg;
    private int zzh;
    private long zzi;
    private int zzj;
    private zzbak zzk;
    private int zzl;
    private int zzm;
    private zzava zzn;
    private zzawl[] zzo;
    private long zzp;
    private boolean zzq;
    private final zzbak zze = new zzbak(16);
    private final Stack zzf = new Stack();
    private final zzbak zzc = new zzbak(zzbai.zza);
    private final zzbak zzd = new zzbak(4);

    private final void zzh() {
        this.zzg = 0;
        this.zzj = 0;
    }

    private final void zzi(long j) throws zzasz {
        zzaxh zzaxhVar;
        zzavd zzavdVar;
        zzaxh zzaxhVar2;
        zzawo zza2;
        while (!this.zzf.isEmpty() && ((zzavu) this.zzf.peek()).zza == j) {
            zzavu zzavuVar = (zzavu) this.zzf.pop();
            if (zzavuVar.zzaR == zzavw.zzE) {
                ArrayList arrayList = new ArrayList();
                zzavd zzavdVar2 = new zzavd();
                zzavv zzb2 = zzavuVar.zzb(zzavw.zzaC);
                if (zzb2 != null) {
                    zzaxhVar = zzawd.zzc(zzb2, this.zzq);
                    if (zzaxhVar != null) {
                        zzavdVar2.zzb(zzaxhVar);
                    }
                } else {
                    zzaxhVar = null;
                }
                long j2 = -9223372036854775807L;
                long j3 = Long.MAX_VALUE;
                int i = 0;
                while (i < zzavuVar.zzc.size()) {
                    zzavu zzavuVar2 = (zzavu) zzavuVar.zzc.get(i);
                    if (zzavuVar2.zzaR == zzavw.zzG && (zza2 = zzawd.zza(zzavuVar2, zzavuVar.zzb(zzavw.zzF), -9223372036854775807L, null, this.zzq)) != null) {
                        zzawr zzb3 = zzawd.zzb(zza2, zzavuVar2.zza(zzavw.zzH).zza(zzavw.zzI).zza(zzavw.zzJ), zzavdVar2);
                        if (zzb3.zza != 0) {
                            zzawl zzawlVar = new zzawl(zza2, zzb3, this.zzn.zzbi(i, zza2.zzb));
                            zzasw zze = zza2.zzf.zze(zzb3.zzd + 30);
                            if (zza2.zzb == 1) {
                                if (zzavdVar2.zza()) {
                                    zze = zze.zzd(zzavdVar2.zzb, zzavdVar2.zzc);
                                }
                                if (zzaxhVar != null) {
                                    zze = zze.zzf(zzaxhVar);
                                }
                            }
                            zzawlVar.zzc.zza(zze);
                            zzavdVar = zzavdVar2;
                            zzaxhVar2 = zzaxhVar;
                            long max = Math.max(j2, zza2.zze);
                            arrayList.add(zzawlVar);
                            long j4 = zzb3.zzb[0];
                            if (j4 < j3) {
                                j2 = max;
                                j3 = j4;
                            } else {
                                j2 = max;
                            }
                            i++;
                            zzavdVar2 = zzavdVar;
                            zzaxhVar = zzaxhVar2;
                        }
                    }
                    zzavdVar = zzavdVar2;
                    zzaxhVar2 = zzaxhVar;
                    i++;
                    zzavdVar2 = zzavdVar;
                    zzaxhVar = zzaxhVar2;
                }
                this.zzp = j2;
                this.zzo = (zzawl[]) arrayList.toArray(new zzawl[arrayList.size()]);
                this.zzn.zzb();
                this.zzn.zzc(this);
                this.zzf.clear();
                this.zzg = 2;
            } else if (!this.zzf.isEmpty()) {
                ((zzavu) this.zzf.peek()).zzc(zzavuVar);
            }
        }
        if (this.zzg != 2) {
            zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final long zza() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final long zzb(long j) {
        long j2 = Long.MAX_VALUE;
        for (zzawl zzawlVar : this.zzo) {
            zzawr zzawrVar = zzawlVar.zzb;
            int zza2 = zzawrVar.zza(j);
            if (zza2 == -1) {
                zza2 = zzawrVar.zzb(j);
            }
            long j3 = zzawrVar.zzb[zza2];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final boolean zzc() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzauz
    public final void zzd(zzava zzavaVar) {
        this.zzn = zzavaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzauz
    public final void zze(long j, long j2) {
        this.zzf.clear();
        this.zzj = 0;
        this.zzl = 0;
        this.zzm = 0;
        if (j == 0) {
            zzh();
            return;
        }
        zzawl[] zzawlVarArr = this.zzo;
        if (zzawlVarArr != null) {
            for (zzawl zzawlVar : zzawlVarArr) {
                zzawr zzawrVar = zzawlVar.zzb;
                int zza2 = zzawrVar.zza(j2);
                if (zza2 == -1) {
                    zza2 = zzawrVar.zzb(j2);
                }
                zzawlVar.zzd = zza2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauz
    public final boolean zzg(zzauy zzauyVar) throws IOException, InterruptedException {
        return zzawn.zzb(zzauyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzauz
    public final int zzf(zzauy zzauyVar, zzave zzaveVar) throws IOException, InterruptedException {
        zzawl[] zzawlVarArr;
        boolean z;
        boolean z2;
        while (true) {
            int i = this.zzg;
            if (i == 0) {
                if (this.zzj == 0) {
                    if (!zzauyVar.zzh(this.zze.zza, 0, 8, true)) {
                        return -1;
                    }
                    this.zzj = 8;
                    this.zze.zzv(0);
                    this.zzi = this.zze.zzm();
                    this.zzh = this.zze.zze();
                }
                if (this.zzi == 1) {
                    zzauyVar.zzh(this.zze.zza, 8, 8, false);
                    this.zzj += 8;
                    this.zzi = this.zze.zzn();
                }
                int i2 = this.zzh;
                if (i2 == zzavw.zzE || i2 == zzavw.zzG || i2 == zzavw.zzH || i2 == zzavw.zzI || i2 == zzavw.zzJ || i2 == zzavw.zzS) {
                    long zzd = (zzauyVar.zzd() + this.zzi) - this.zzj;
                    this.zzf.add(new zzavu(this.zzh, zzd));
                    if (this.zzi == this.zzj) {
                        zzi(zzd);
                    } else {
                        zzh();
                    }
                } else {
                    int i3 = this.zzh;
                    if (i3 == zzavw.zzU || i3 == zzavw.zzF || i3 == zzavw.zzV || i3 == zzavw.zzW || i3 == zzavw.zzao || i3 == zzavw.zzap || i3 == zzavw.zzaq || i3 == zzavw.zzT || i3 == zzavw.zzar || i3 == zzavw.zzas || i3 == zzavw.zzat || i3 == zzavw.zzau || i3 == zzavw.zzav || i3 == zzavw.zzR || i3 == zzavw.zzd || i3 == zzavw.zzaC) {
                        zzbac.zze(this.zzj == 8);
                        zzbac.zze(this.zzi <= 2147483647L);
                        this.zzk = new zzbak((int) this.zzi);
                        System.arraycopy(this.zze.zza, 0, this.zzk.zza, 0, 8);
                    } else {
                        this.zzk = null;
                    }
                    this.zzg = 1;
                }
            } else {
                if (i != 1) {
                    long j = Long.MAX_VALUE;
                    int i4 = -1;
                    int i5 = 0;
                    while (true) {
                        zzawlVarArr = this.zzo;
                        if (i5 >= zzawlVarArr.length) {
                            break;
                        }
                        zzawl zzawlVar = zzawlVarArr[i5];
                        int i6 = zzawlVar.zzd;
                        zzawr zzawrVar = zzawlVar.zzb;
                        if (i6 != zzawrVar.zza) {
                            long j2 = zzawrVar.zzb[i6];
                            if (j2 < j) {
                                i4 = i5;
                                j = j2;
                            }
                        }
                        i5++;
                    }
                    if (i4 == -1) {
                        return -1;
                    }
                    zzawl zzawlVar2 = zzawlVarArr[i4];
                    zzavi zzaviVar = zzawlVar2.zzc;
                    int i7 = zzawlVar2.zzd;
                    zzawr zzawrVar2 = zzawlVar2.zzb;
                    long j3 = zzawrVar2.zzb[i7];
                    int i8 = zzawrVar2.zzc[i7];
                    if (zzawlVar2.zza.zzg == 1) {
                        j3 += 8;
                        i8 -= 8;
                    }
                    long zzd2 = (j3 - zzauyVar.zzd()) + this.zzl;
                    if (zzd2 < 0 || zzd2 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                        zzaveVar.zza = j3;
                        return 1;
                    }
                    int i9 = (int) zzd2;
                    boolean z3 = false;
                    zzauyVar.zzi(i9, false);
                    int i10 = zzawlVar2.zza.zzk;
                    if (i10 == 0) {
                        while (true) {
                            int i11 = this.zzl;
                            if (i11 >= i8) {
                                break;
                            }
                            int zzd3 = zzaviVar.zzd(zzauyVar, i8 - i11, false);
                            this.zzl += zzd3;
                            this.zzm -= zzd3;
                        }
                    } else {
                        byte[] bArr = this.zzd.zza;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i12 = 4 - i10;
                        while (this.zzl < i8) {
                            int i13 = this.zzm;
                            if (i13 == 0) {
                                zzauyVar.zzh(this.zzd.zza, i12, i10, z3);
                                this.zzd.zzv(z3 ? 1 : 0);
                                this.zzm = this.zzd.zzi();
                                this.zzc.zzv(z3 ? 1 : 0);
                                zzaviVar.zzb(this.zzc, 4);
                                this.zzl += 4;
                                i8 += i12;
                            } else {
                                int zzd4 = zzaviVar.zzd(zzauyVar, i13, z3);
                                this.zzl += zzd4;
                                this.zzm -= zzd4;
                                z3 = false;
                            }
                        }
                    }
                    int i14 = i8;
                    zzawr zzawrVar3 = zzawlVar2.zzb;
                    zzaviVar.zzc(zzawrVar3.zze[i7], zzawrVar3.zzf[i7], i14, 0, null);
                    zzawlVar2.zzd++;
                    this.zzl = 0;
                    this.zzm = 0;
                    return 0;
                }
                long j4 = this.zzi;
                int i15 = this.zzj;
                long j5 = j4 - i15;
                long zzd5 = zzauyVar.zzd() + j5;
                zzbak zzbakVar = this.zzk;
                if (zzbakVar != null) {
                    zzauyVar.zzh(zzbakVar.zza, i15, (int) j5, false);
                    if (this.zzh == zzavw.zzd) {
                        zzbak zzbakVar2 = this.zzk;
                        zzbakVar2.zzv(8);
                        if (zzbakVar2.zze() != zzb) {
                            zzbakVar2.zzw(4);
                            while (zzbakVar2.zza() > 0) {
                                if (zzbakVar2.zze() == zzb) {
                                }
                            }
                            z2 = false;
                            this.zzq = z2;
                        }
                        z2 = true;
                        this.zzq = z2;
                    } else if (!this.zzf.isEmpty()) {
                        ((zzavu) this.zzf.peek()).zzd(new zzavv(this.zzh, this.zzk));
                    }
                } else if (j5 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                    zzauyVar.zzi((int) j5, false);
                } else {
                    zzaveVar.zza = zzauyVar.zzd() + j5;
                    z = true;
                    zzi(zzd5);
                    if (z && this.zzg != 2) {
                        return 1;
                    }
                }
                z = false;
                zzi(zzd5);
                if (z) {
                    return 1;
                }
                continue;
            }
        }
    }
}
