package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzahh implements zzahc {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzair zzb;
    private final zzef zzc;
    private final boolean[] zzd;
    private final zzahf zze;
    private final zzahr zzf;
    private zzahg zzg;
    private long zzh;
    private String zzi;
    private zzaap zzj;
    private boolean zzk;
    private long zzl;

    public zzahh() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0191  */
    @Override // com.google.android.gms.internal.ads.zzahc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzef zzefVar) {
        int i;
        int i2;
        int i3;
        zzdd.zzb(this.zzg);
        zzdd.zzb(this.zzj);
        int zzc = zzefVar.zzc();
        int zzd = zzefVar.zzd();
        byte[] zzH = zzefVar.zzH();
        this.zzh += zzefVar.zza();
        this.zzj.zzq(zzefVar, zzefVar.zza());
        while (true) {
            int zza2 = zzaaf.zza(zzH, zzc, zzd, this.zzd);
            if (zza2 == zzd) {
                break;
            }
            int i4 = zza2 + 3;
            int i5 = zzefVar.zzH()[i4] & UByte.MAX_VALUE;
            int i6 = zza2 - zzc;
            if (!this.zzk) {
                if (i6 > 0) {
                    this.zze.zza(zzH, zzc, zza2);
                }
                if (this.zze.zzc(i5, i6 < 0 ? -i6 : 0)) {
                    zzaap zzaapVar = this.zzj;
                    zzahf zzahfVar = this.zze;
                    int i7 = zzahfVar.zzb;
                    String str = this.zzi;
                    Objects.requireNonNull(str);
                    byte[] copyOf = Arrays.copyOf(zzahfVar.zzc, zzahfVar.zza);
                    zzee zzeeVar = new zzee(copyOf, copyOf.length);
                    zzeeVar.zzk(i7);
                    zzeeVar.zzk(4);
                    zzeeVar.zzi();
                    zzeeVar.zzj(8);
                    if (zzeeVar.zzl()) {
                        zzeeVar.zzj(4);
                        zzeeVar.zzj(3);
                    }
                    int zzc2 = zzeeVar.zzc(4);
                    float f = 1.0f;
                    i = i4;
                    if (zzc2 == 15) {
                        int zzc3 = zzeeVar.zzc(8);
                        int zzc4 = zzeeVar.zzc(8);
                        if (zzc4 == 0) {
                            zzdw.zze("H263Reader", "Invalid aspect ratio");
                        } else {
                            f = zzc3 / zzc4;
                        }
                    } else if (zzc2 < 7) {
                        f = zza[zzc2];
                    } else {
                        zzdw.zze("H263Reader", "Invalid aspect ratio");
                    }
                    float f2 = f;
                    if (zzeeVar.zzl()) {
                        zzeeVar.zzj(2);
                        zzeeVar.zzj(1);
                        if (zzeeVar.zzl()) {
                            zzeeVar.zzj(15);
                            zzeeVar.zzi();
                            zzeeVar.zzj(15);
                            zzeeVar.zzi();
                            zzeeVar.zzj(15);
                            zzeeVar.zzi();
                            zzeeVar.zzj(3);
                            zzeeVar.zzj(11);
                            zzeeVar.zzi();
                            zzeeVar.zzj(15);
                            zzeeVar.zzi();
                            i3 = 2;
                            if (zzeeVar.zzc(i3) != 0) {
                                zzdw.zze("H263Reader", "Unhandled video object layer shape");
                            }
                            zzeeVar.zzi();
                            int zzc5 = zzeeVar.zzc(16);
                            zzeeVar.zzi();
                            if (zzeeVar.zzl()) {
                                if (zzc5 == 0) {
                                    zzdw.zze("H263Reader", "Invalid vop_increment_time_resolution");
                                } else {
                                    int i8 = 0;
                                    for (int i9 = zzc5 - 1; i9 > 0; i9 >>= 1) {
                                        i8++;
                                    }
                                    zzeeVar.zzj(i8);
                                }
                            }
                            zzeeVar.zzi();
                            int zzc6 = zzeeVar.zzc(13);
                            zzeeVar.zzi();
                            int zzc7 = zzeeVar.zzc(13);
                            zzeeVar.zzi();
                            zzeeVar.zzi();
                            zzad zzadVar = new zzad();
                            zzadVar.zzH(str);
                            zzadVar.zzS("video/mp4v-es");
                            zzadVar.zzX(zzc6);
                            zzadVar.zzF(zzc7);
                            zzadVar.zzP(f2);
                            zzadVar.zzI(Collections.singletonList(copyOf));
                            zzaapVar.zzk(zzadVar.zzY());
                            this.zzk = true;
                            this.zzg.zza(zzH, zzc, zza2);
                            zzahr zzahrVar = this.zzf;
                            if (i6 > 0) {
                                zzahrVar.zza(zzH, zzc, zza2);
                                i2 = 0;
                            } else {
                                i2 = -i6;
                            }
                            if (this.zzf.zzd(i2)) {
                                zzahr zzahrVar2 = this.zzf;
                                int zzb = zzaaf.zzb(zzahrVar2.zza, zzahrVar2.zzb);
                                zzef zzefVar2 = this.zzc;
                                int i10 = zzen.zza;
                                zzefVar2.zzD(this.zzf.zza, zzb);
                                this.zzb.zza(this.zzl, this.zzc);
                            }
                            if (i5 == 178) {
                                if (zzefVar.zzH()[zza2 + 2] == 1) {
                                    this.zzf.zzc(178);
                                }
                                i5 = 178;
                            }
                            int i11 = zzd - zza2;
                            this.zzg.zzb(this.zzh - i11, i11, this.zzk);
                            this.zzg.zzc(i5, this.zzl);
                            zzc = i;
                        }
                    }
                    i3 = 2;
                    if (zzeeVar.zzc(i3) != 0) {
                    }
                    zzeeVar.zzi();
                    int zzc52 = zzeeVar.zzc(16);
                    zzeeVar.zzi();
                    if (zzeeVar.zzl()) {
                    }
                    zzeeVar.zzi();
                    int zzc62 = zzeeVar.zzc(13);
                    zzeeVar.zzi();
                    int zzc72 = zzeeVar.zzc(13);
                    zzeeVar.zzi();
                    zzeeVar.zzi();
                    zzad zzadVar2 = new zzad();
                    zzadVar2.zzH(str);
                    zzadVar2.zzS("video/mp4v-es");
                    zzadVar2.zzX(zzc62);
                    zzadVar2.zzF(zzc72);
                    zzadVar2.zzP(f2);
                    zzadVar2.zzI(Collections.singletonList(copyOf));
                    zzaapVar.zzk(zzadVar2.zzY());
                    this.zzk = true;
                    this.zzg.zza(zzH, zzc, zza2);
                    zzahr zzahrVar3 = this.zzf;
                    if (i6 > 0) {
                    }
                    if (this.zzf.zzd(i2)) {
                    }
                    if (i5 == 178) {
                    }
                    int i112 = zzd - zza2;
                    this.zzg.zzb(this.zzh - i112, i112, this.zzk);
                    this.zzg.zzc(i5, this.zzl);
                    zzc = i;
                }
            }
            i = i4;
            this.zzg.zza(zzH, zzc, zza2);
            zzahr zzahrVar32 = this.zzf;
            if (i6 > 0) {
            }
            if (this.zzf.zzd(i2)) {
            }
            if (i5 == 178) {
            }
            int i1122 = zzd - zza2;
            this.zzg.zzb(this.zzh - i1122, i1122, this.zzk);
            this.zzg.zzc(i5, this.zzl);
            zzc = i;
        }
        if (!this.zzk) {
            this.zze.zza(zzH, zzc, zzd);
        }
        this.zzg.zza(zzH, zzc, zzd);
        this.zzf.zza(zzH, zzc, zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzb(zzzl zzzlVar, zzaio zzaioVar) {
        zzaioVar.zzc();
        this.zzi = zzaioVar.zzb();
        this.zzj = zzzlVar.zzv(zzaioVar.zza(), 2);
        this.zzg = new zzahg(this.zzj);
        this.zzb.zzb(zzzlVar, zzaioVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zze() {
        zzaaf.zze(this.zzd);
        this.zze.zzb();
        zzahg zzahgVar = this.zzg;
        if (zzahgVar != null) {
            zzahgVar.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    zzahh(zzair zzairVar) {
        this.zzb = zzairVar;
        this.zzd = new boolean[4];
        this.zze = new zzahf(128);
        this.zzl = -9223372036854775807L;
        this.zzf = new zzahr(178, 128);
        this.zzc = new zzef();
    }
}
