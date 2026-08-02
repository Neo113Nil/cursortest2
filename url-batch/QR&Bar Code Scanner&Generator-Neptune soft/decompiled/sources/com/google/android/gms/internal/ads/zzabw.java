package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzabw implements zzzi {
    private zzzl zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzadt zzg;
    private zzzj zzh;
    private zzabz zzi;
    private zzafq zzj;
    private final zzef zza = new zzef(6);
    private long zzf = -1;

    private final int zze(zzzj zzzjVar) throws IOException {
        this.zza.zzC(2);
        ((zzyy) zzzjVar).zzm(this.zza.zzH(), 0, 2, false);
        return this.zza.zzo();
    }

    private final void zzf() {
        zzg(new zzbp[0]);
        zzzl zzzlVar = this.zzb;
        Objects.requireNonNull(zzzlVar);
        zzzlVar.zzC();
        this.zzb.zzN(new zzaak(-9223372036854775807L, 0L));
        this.zzc = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x015c  */
    @Override // com.google.android.gms.internal.ads.zzzi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzzj zzzjVar, zzaai zzaaiVar) throws IOException {
        int i;
        String zzv;
        zzaby zza;
        zzadt zzadtVar;
        long j;
        int i2 = this.zzc;
        if (i2 == 0) {
            this.zza.zzC(2);
            ((zzyy) zzzjVar).zzn(this.zza.zzH(), 0, 2, false);
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
            ((zzyy) zzzjVar).zzn(this.zza.zzH(), 0, 2, false);
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
                if (this.zzi == null || zzzjVar != this.zzh) {
                    this.zzh = zzzjVar;
                    this.zzi = new zzabz(zzzjVar, this.zzf);
                }
                zzafq zzafqVar = this.zzj;
                Objects.requireNonNull(zzafqVar);
                int zza2 = zzafqVar.zza(this.zzi, zzaaiVar);
                if (zza2 == 1) {
                    zzaaiVar.zza += this.zzf;
                }
                return zza2;
            }
            long zzf = zzzjVar.zzf();
            long j2 = this.zzf;
            if (zzf != j2) {
                zzaaiVar.zza = j2;
                return 1;
            }
            if (zzzjVar.zzm(this.zza.zzH(), 0, 1, true)) {
                zzzjVar.zzj();
                if (this.zzj == null) {
                    this.zzj = new zzafq(0);
                }
                zzabz zzabzVar = new zzabz(zzzjVar, this.zzf);
                this.zzi = zzabzVar;
                if (this.zzj.zzd(zzabzVar)) {
                    zzafq zzafqVar2 = this.zzj;
                    long j3 = this.zzf;
                    zzzl zzzlVar = this.zzb;
                    Objects.requireNonNull(zzzlVar);
                    zzafqVar2.zzb(new zzacb(j3, zzzlVar));
                    zzadt zzadtVar2 = this.zzg;
                    Objects.requireNonNull(zzadtVar2);
                    zzg(zzadtVar2);
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
            zzef zzefVar = new zzef(this.zze);
            ((zzyy) zzzjVar).zzn(zzefVar.zzH(), 0, this.zze, false);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzefVar.zzv((char) 0)) && (zzv = zzefVar.zzv((char) 0)) != null) {
                long zzd = zzzjVar.zzd();
                if (zzd != -1 && (zza = zzacc.zza(zzv)) != null && zza.zzb.size() >= 2) {
                    long j4 = -1;
                    long j5 = -1;
                    long j6 = -1;
                    long j7 = -1;
                    boolean z = false;
                    for (int size = zza.zzb.size() - 1; size >= 0; size--) {
                        zzabx zzabxVar = (zzabx) zza.zzb.get(size);
                        z |= "video/mp4".equals(zzabxVar.zza);
                        if (size == 0) {
                            zzd -= zzabxVar.zzd;
                            j = 0;
                        } else {
                            j = zzd - zzabxVar.zzc;
                        }
                        long j8 = zzd;
                        zzd = j;
                        if (z && zzd != j8) {
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
                        zzadtVar = new zzadt(j4, j5, zza.zza, j6, j7);
                        this.zzg = zzadtVar;
                        if (zzadtVar != null) {
                            this.zzf = zzadtVar.zzd;
                        }
                        i = 0;
                    }
                }
                zzadtVar = null;
                this.zzg = zzadtVar;
                if (zzadtVar != null) {
                }
                i = 0;
            } else {
                i = 0;
            }
        } else {
            i = 0;
            ((zzyy) zzzjVar).zzo(this.zze, false);
        }
        this.zzc = i;
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzb(zzzl zzzlVar) {
        this.zzb = zzzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final boolean zzd(zzzj zzzjVar) throws IOException {
        if (zze(zzzjVar) != 65496) {
            return false;
        }
        int zze = zze(zzzjVar);
        this.zzd = zze;
        if (zze == 65504) {
            this.zza.zzC(2);
            zzyy zzyyVar = (zzyy) zzzjVar;
            zzyyVar.zzm(this.zza.zzH(), 0, 2, false);
            zzyyVar.zzl(this.zza.zzo() - 2, false);
            zze = zze(zzzjVar);
            this.zzd = zze;
        }
        if (zze == 65505) {
            zzyy zzyyVar2 = (zzyy) zzzjVar;
            zzyyVar2.zzl(2, false);
            this.zza.zzC(6);
            zzyyVar2.zzm(this.zza.zzH(), 0, 6, false);
            if (this.zza.zzs() == 1165519206 && this.zza.zzo() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzzi
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzafq zzafqVar = this.zzj;
            Objects.requireNonNull(zzafqVar);
            zzafqVar.zzc(j, j2);
        }
    }

    private final void zzg(zzbp... zzbpVarArr) {
        zzzl zzzlVar = this.zzb;
        Objects.requireNonNull(zzzlVar);
        zzaap zzv = zzzlVar.zzv(1024, 4);
        zzad zzadVar = new zzad();
        zzadVar.zzz("image/jpeg");
        zzadVar.zzM(new zzbq(-9223372036854775807L, zzbpVarArr));
        zzv.zzk(zzadVar.zzY());
    }
}
