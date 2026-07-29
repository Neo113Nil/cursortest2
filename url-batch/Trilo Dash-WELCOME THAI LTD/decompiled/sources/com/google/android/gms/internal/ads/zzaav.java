package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzaav implements zzys {
    private zzyv zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzacs zzg;
    private zzyt zzh;
    private zzaay zzi;
    private zzaeo zzj;
    private final zzdy zza = new zzdy(6);
    private long zzf = -1;

    private final int zze(zzyt zzytVar) throws IOException {
        this.zza.zzC(2);
        ((zzym) zzytVar).zzm(this.zza.zzH(), 0, 2, false);
        return this.zza.zzo();
    }

    private final void zzf() {
        zzg(new zzbk[0]);
        zzyv zzyvVar = this.zzb;
        Objects.requireNonNull(zzyvVar);
        zzyvVar.zzB();
        this.zzb.zzL(new zzzu(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x015e  */
    @Override // com.google.android.gms.internal.ads.zzys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzyt zzytVar, zzzs zzzsVar) throws IOException {
        int i;
        String zzv;
        zzaax zza;
        zzacs zzacsVar;
        long j;
        int i2 = this.zzc;
        if (i2 == 0) {
            this.zza.zzC(2);
            ((zzym) zzytVar).zzn(this.zza.zzH(), 0, 2, false);
            int zzo = this.zza.zzo();
            this.zzd = zzo;
            if (zzo == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                    return 0;
                }
                zzf();
                return 0;
            }
            if ((zzo >= 65488 && zzo <= 65497) || zzo == 65281) {
                return 0;
            }
            this.zzc = 1;
            return 0;
        }
        if (i2 == 1) {
            this.zza.zzC(2);
            ((zzym) zzytVar).zzn(this.zza.zzH(), 0, 2, false);
            this.zze = this.zza.zzo() - 2;
            this.zzc = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzytVar != this.zzh) {
                    this.zzh = zzytVar;
                    this.zzi = new zzaay(zzytVar, this.zzf);
                }
                zzaeo zzaeoVar = this.zzj;
                Objects.requireNonNull(zzaeoVar);
                int zza2 = zzaeoVar.zza(this.zzi, zzzsVar);
                if (zza2 == 1) {
                    zzzsVar.zza += this.zzf;
                }
                return zza2;
            }
            long zzf = zzytVar.zzf();
            long j2 = this.zzf;
            if (zzf != j2) {
                zzzsVar.zza = j2;
                return 1;
            }
            if (zzytVar.zzm(this.zza.zzH(), 0, 1, true)) {
                zzytVar.zzj();
                if (this.zzj == null) {
                    this.zzj = new zzaeo(0);
                }
                zzaay zzaayVar = new zzaay(zzytVar, this.zzf);
                this.zzi = zzaayVar;
                if (this.zzj.zzd(zzaayVar)) {
                    zzaeo zzaeoVar2 = this.zzj;
                    long j3 = this.zzf;
                    zzyv zzyvVar = this.zzb;
                    Objects.requireNonNull(zzyvVar);
                    zzaeoVar2.zzb(new zzaba(j3, zzyvVar));
                    zzacs zzacsVar2 = this.zzg;
                    Objects.requireNonNull(zzacsVar2);
                    zzg(zzacsVar2);
                    this.zzc = 5;
                } else {
                    zzf();
                }
            } else {
                zzf();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzdy zzdyVar = new zzdy(this.zze);
            ((zzym) zzytVar).zzn(zzdyVar.zzH(), 0, this.zze, false);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzdyVar.zzv((char) 0)) && (zzv = zzdyVar.zzv((char) 0)) != null) {
                long zzd = zzytVar.zzd();
                if (zzd != -1 && (zza = zzabb.zza(zzv)) != null && zza.zzb.size() >= 2) {
                    long j4 = -1;
                    long j5 = -1;
                    long j6 = -1;
                    long j7 = -1;
                    boolean z = false;
                    for (int size = zza.zzb.size() - 1; size >= 0; size--) {
                        zzaaw zzaawVar = (zzaaw) zza.zzb.get(size);
                        boolean equals = "video/mp4".equals(zzaawVar.zza) | z;
                        if (size == 0) {
                            zzd -= zzaawVar.zzd;
                            j = 0;
                        } else {
                            j = zzd - zzaawVar.zzc;
                        }
                        long j8 = zzd;
                        zzd = j;
                        if (!equals || zzd == j8) {
                            z = equals;
                        } else {
                            j7 = j8 - zzd;
                            j6 = zzd;
                            z = false;
                        }
                        if (size == 0) {
                            j5 = j8;
                        }
                        if (size == 0) {
                            j4 = zzd;
                        }
                    }
                    if (j6 != -1 && j7 != -1 && j4 != -1 && j5 != -1) {
                        zzacsVar = new zzacs(j4, j5, zza.zza, j6, j7);
                        this.zzg = zzacsVar;
                        if (zzacsVar != null) {
                            this.zzf = zzacsVar.zzd;
                        }
                    }
                }
                zzacsVar = null;
                this.zzg = zzacsVar;
                if (zzacsVar != null) {
                }
            }
            i = 0;
        } else {
            i = 0;
            ((zzym) zzytVar).zzo(this.zze, false);
        }
        this.zzc = i;
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzb(zzyv zzyvVar) {
        this.zzb = zzyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final boolean zzd(zzyt zzytVar) throws IOException {
        if (zze(zzytVar) != 65496) {
            return false;
        }
        int zze = zze(zzytVar);
        this.zzd = zze;
        if (zze == 65504) {
            this.zza.zzC(2);
            zzym zzymVar = (zzym) zzytVar;
            zzymVar.zzm(this.zza.zzH(), 0, 2, false);
            zzymVar.zzl(this.zza.zzo() - 2, false);
            zze = zze(zzytVar);
            this.zzd = zze;
        }
        if (zze == 65505) {
            zzym zzymVar2 = (zzym) zzytVar;
            zzymVar2.zzl(2, false);
            this.zza.zzC(6);
            zzymVar2.zzm(this.zza.zzH(), 0, 6, false);
            if (this.zza.zzs() == 1165519206 && this.zza.zzo() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzys
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzaeo zzaeoVar = this.zzj;
            Objects.requireNonNull(zzaeoVar);
            zzaeoVar.zzc(j, j2);
        }
    }

    private final void zzg(zzbk... zzbkVarArr) {
        zzyv zzyvVar = this.zzb;
        Objects.requireNonNull(zzyvVar);
        zzzz zzv = zzyvVar.zzv(1024, 4);
        zzab zzabVar = new zzab();
        zzabVar.zzz("image/jpeg");
        zzabVar.zzM(new zzbl(zzbkVarArr));
        zzv.zzk(zzabVar.zzY());
    }
}
