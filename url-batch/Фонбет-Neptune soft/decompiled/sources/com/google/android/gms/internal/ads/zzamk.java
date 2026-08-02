package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import org.objectweb.asm.Opcodes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzamk implements zzamf {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzanv zzb;
    private final zzek zzc;
    private final boolean[] zzd;
    private final zzami zze;
    private final zzamx zzf;
    private zzamj zzg;
    private long zzh;
    private String zzi;
    private zzadp zzj;
    private boolean zzk;
    private long zzl;

    public zzamk() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(zzek zzekVar) {
        int i;
        float f;
        float f2;
        zzdi.zzb(this.zzg);
        zzdi.zzb(this.zzj);
        int zzd = zzekVar.zzd();
        int zze = zzekVar.zze();
        byte[] zzM = zzekVar.zzM();
        this.zzh += zzekVar.zzb();
        this.zzj.zzq(zzekVar, zzekVar.zzb());
        while (true) {
            int zza2 = zzfh.zza(zzM, zzd, zze, this.zzd);
            if (zza2 == zze) {
                break;
            }
            int i2 = zza2 + 3;
            int i3 = zzekVar.zzM()[i2] & 255;
            int i4 = zza2 - zzd;
            if (!this.zzk) {
                if (i4 > 0) {
                    this.zze.zza(zzM, zzd, zza2);
                }
                if (this.zze.zzc(i3, i4 < 0 ? -i4 : 0)) {
                    zzadp zzadpVar = this.zzj;
                    zzami zzamiVar = this.zze;
                    int i5 = zzamiVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(zzamiVar.zzc, zzamiVar.zza);
                    zzej zzejVar = new zzej(copyOf, copyOf.length);
                    zzejVar.zzo(i5);
                    zzejVar.zzo(4);
                    zzejVar.zzm();
                    zzejVar.zzn(8);
                    if (zzejVar.zzp()) {
                        zzejVar.zzn(4);
                        zzejVar.zzn(3);
                    }
                    int zzd2 = zzejVar.zzd(4);
                    if (zzd2 == 15) {
                        int zzd3 = zzejVar.zzd(8);
                        int zzd4 = zzejVar.zzd(8);
                        if (zzd4 == 0) {
                            zzea.zzf("H263Reader", "Invalid aspect ratio");
                            f2 = 1.0f;
                        } else {
                            f = zzd3 / zzd4;
                            f2 = f;
                        }
                    } else if (zzd2 < 7) {
                        f = zza[zzd2];
                        f2 = f;
                    } else {
                        zzea.zzf("H263Reader", "Invalid aspect ratio");
                        f2 = 1.0f;
                    }
                    if (zzejVar.zzp()) {
                        zzejVar.zzn(2);
                        zzejVar.zzn(1);
                        if (zzejVar.zzp()) {
                            zzejVar.zzn(15);
                            zzejVar.zzm();
                            zzejVar.zzn(15);
                            zzejVar.zzm();
                            zzejVar.zzn(15);
                            zzejVar.zzm();
                            zzejVar.zzn(3);
                            zzejVar.zzn(11);
                            zzejVar.zzm();
                            zzejVar.zzn(15);
                            zzejVar.zzm();
                        }
                    }
                    if (zzejVar.zzd(2) != 0) {
                        zzea.zzf("H263Reader", "Unhandled video object layer shape");
                    }
                    zzejVar.zzm();
                    int zzd5 = zzejVar.zzd(16);
                    zzejVar.zzm();
                    if (zzejVar.zzp()) {
                        if (zzd5 == 0) {
                            zzea.zzf("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i6 = zzd5 - 1;
                            int i7 = 0;
                            while (i6 > 0) {
                                i6 >>= 1;
                                i7++;
                            }
                            zzejVar.zzn(i7);
                        }
                    }
                    zzejVar.zzm();
                    int zzd6 = zzejVar.zzd(13);
                    zzejVar.zzm();
                    int zzd7 = zzejVar.zzd(13);
                    zzejVar.zzm();
                    zzejVar.zzm();
                    zzad zzadVar = new zzad();
                    zzadVar.zzK(str);
                    zzadVar.zzX("video/mp4v-es");
                    zzadVar.zzac(zzd6);
                    zzadVar.zzI(zzd7);
                    zzadVar.zzT(f2);
                    zzadVar.zzL(Collections.singletonList(copyOf));
                    zzadpVar.zzl(zzadVar.zzad());
                    this.zzk = true;
                }
            }
            this.zzg.zza(zzM, zzd, zza2);
            zzamx zzamxVar = this.zzf;
            if (zzamxVar != null) {
                if (i4 > 0) {
                    zzamxVar.zza(zzM, zzd, zza2);
                    i = 0;
                } else {
                    i = -i4;
                }
                if (this.zzf.zzd(i)) {
                    zzamx zzamxVar2 = this.zzf;
                    int zzb = zzfh.zzb(zzamxVar2.zza, zzamxVar2.zzb);
                    zzek zzekVar2 = this.zzc;
                    int i8 = zzet.zza;
                    zzekVar2.zzI(this.zzf.zza, zzb);
                    this.zzb.zza(this.zzl, this.zzc);
                }
                if (i3 == 178) {
                    if (zzekVar.zzM()[zza2 + 2] == 1) {
                        this.zzf.zzc(Opcodes.GETSTATIC);
                    }
                    i3 = Opcodes.GETSTATIC;
                }
            }
            int i9 = zze - zza2;
            this.zzg.zzb(this.zzh - i9, i9, this.zzk);
            this.zzg.zzc(i3, this.zzl);
            zzd = i2;
        }
        if (!this.zzk) {
            this.zze.zza(zzM, zzd, zze);
        }
        this.zzg.zza(zzM, zzd, zze);
        zzamx zzamxVar3 = this.zzf;
        if (zzamxVar3 != null) {
            zzamxVar3.zza(zzM, zzd, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzb(zzacn zzacnVar, zzans zzansVar) {
        zzansVar.zzc();
        this.zzi = zzansVar.zzb();
        zzadp zzw = zzacnVar.zzw(zzansVar.zza(), 2);
        this.zzj = zzw;
        this.zzg = new zzamj(zzw);
        zzanv zzanvVar = this.zzb;
        if (zzanvVar != null) {
            zzanvVar.zzb(zzacnVar, zzansVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzc(boolean z) {
        zzdi.zzb(this.zzg);
        if (z) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zzd(long j, int i) {
        this.zzl = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zze() {
        zzfh.zzf(this.zzd);
        this.zze.zzb();
        zzamj zzamjVar = this.zzg;
        if (zzamjVar != null) {
            zzamjVar.zzd();
        }
        zzamx zzamxVar = this.zzf;
        if (zzamxVar != null) {
            zzamxVar.zzb();
        }
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    zzamk(zzanv zzanvVar) {
        zzek zzekVar;
        this.zzb = zzanvVar;
        this.zzd = new boolean[4];
        this.zze = new zzami(128);
        this.zzl = -9223372036854775807L;
        if (zzanvVar != null) {
            this.zzf = new zzamx(Opcodes.GETSTATIC, 128);
            zzekVar = new zzek();
        } else {
            zzekVar = null;
            this.zzf = null;
        }
        this.zzc = zzekVar;
    }
}
