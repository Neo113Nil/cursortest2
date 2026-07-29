package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import kotlin.UByte;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzagf implements zzaga {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzahp zzb;
    private final zzdy zzc;
    private final boolean[] zzd;
    private final zzagd zze;
    private final zzagp zzf;
    private zzage zzg;
    private long zzh;
    private String zzi;
    private zzzz zzj;
    private boolean zzk;
    private long zzl;

    public zzagf() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0191  */
    @Override // com.google.android.gms.internal.ads.zzaga
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzdy zzdyVar) {
        int i;
        int i2;
        float f;
        float f2;
        zzcw.zzb(this.zzg);
        zzcw.zzb(this.zzj);
        int zzc = zzdyVar.zzc();
        int zzd = zzdyVar.zzd();
        byte[] zzH = zzdyVar.zzH();
        this.zzh += zzdyVar.zza();
        zzzx.zzb(this.zzj, zzdyVar, zzdyVar.zza());
        while (true) {
            int zza2 = zzzp.zza(zzH, zzc, zzd, this.zzd);
            if (zza2 == zzd) {
                break;
            }
            int i3 = zza2 + 3;
            int i4 = zzdyVar.zzH()[i3] & UByte.MAX_VALUE;
            int i5 = zza2 - zzc;
            if (!this.zzk) {
                if (i5 > 0) {
                    this.zze.zza(zzH, zzc, zza2);
                }
                if (this.zze.zzc(i4, i5 < 0 ? -i5 : 0)) {
                    zzzz zzzzVar = this.zzj;
                    zzagd zzagdVar = this.zze;
                    int i6 = zzagdVar.zzb;
                    String str = this.zzi;
                    Objects.requireNonNull(str);
                    byte[] copyOf = Arrays.copyOf(zzagdVar.zzc, zzagdVar.zza);
                    zzdx zzdxVar = new zzdx(copyOf, copyOf.length);
                    zzdxVar.zzk(i6);
                    zzdxVar.zzk(4);
                    zzdxVar.zzi();
                    zzdxVar.zzj(8);
                    if (zzdxVar.zzl()) {
                        zzdxVar.zzj(4);
                        zzdxVar.zzj(3);
                    }
                    int zzc2 = zzdxVar.zzc(4);
                    i = i3;
                    if (zzc2 == 15) {
                        int zzc3 = zzdxVar.zzc(8);
                        int zzc4 = zzdxVar.zzc(8);
                        if (zzc4 == 0) {
                            Log.w("H263Reader", "Invalid aspect ratio");
                            f2 = 1.0f;
                        } else {
                            f = zzc3 / zzc4;
                            f2 = f;
                        }
                    } else if (zzc2 < 7) {
                        f = zza[zzc2];
                        f2 = f;
                    } else {
                        Log.w("H263Reader", "Invalid aspect ratio");
                        f2 = 1.0f;
                    }
                    if (zzdxVar.zzl()) {
                        zzdxVar.zzj(2);
                        zzdxVar.zzj(1);
                        if (zzdxVar.zzl()) {
                            zzdxVar.zzj(15);
                            zzdxVar.zzi();
                            zzdxVar.zzj(15);
                            zzdxVar.zzi();
                            zzdxVar.zzj(15);
                            zzdxVar.zzi();
                            zzdxVar.zzj(3);
                            zzdxVar.zzj(11);
                            zzdxVar.zzi();
                            zzdxVar.zzj(15);
                            zzdxVar.zzi();
                        }
                    }
                    if (zzdxVar.zzc(2) != 0) {
                        Log.w("H263Reader", "Unhandled video object layer shape");
                    }
                    zzdxVar.zzi();
                    int zzc5 = zzdxVar.zzc(16);
                    zzdxVar.zzi();
                    if (zzdxVar.zzl()) {
                        if (zzc5 == 0) {
                            Log.w("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i7 = 0;
                            for (int i8 = zzc5 - 1; i8 > 0; i8 >>= 1) {
                                i7++;
                            }
                            zzdxVar.zzj(i7);
                        }
                    }
                    zzdxVar.zzi();
                    int zzc6 = zzdxVar.zzc(13);
                    zzdxVar.zzi();
                    int zzc7 = zzdxVar.zzc(13);
                    zzdxVar.zzi();
                    zzdxVar.zzi();
                    zzab zzabVar = new zzab();
                    zzabVar.zzH(str);
                    zzabVar.zzS("video/mp4v-es");
                    zzabVar.zzX(zzc6);
                    zzabVar.zzF(zzc7);
                    zzabVar.zzP(f2);
                    zzabVar.zzI(Collections.singletonList(copyOf));
                    zzzzVar.zzk(zzabVar.zzY());
                    this.zzk = true;
                    this.zzg.zza(zzH, zzc, zza2);
                    zzagp zzagpVar = this.zzf;
                    if (i5 <= 0) {
                        zzagpVar.zza(zzH, zzc, zza2);
                        i2 = 0;
                    } else {
                        i2 = -i5;
                    }
                    if (this.zzf.zzd(i2)) {
                        zzagp zzagpVar2 = this.zzf;
                        int zzb = zzzp.zzb(zzagpVar2.zza, zzagpVar2.zzb);
                        zzdy zzdyVar2 = this.zzc;
                        int i9 = zzeg.zza;
                        zzdyVar2.zzD(this.zzf.zza, zzb);
                        this.zzb.zza(this.zzl, this.zzc);
                    }
                    if (i4 == 178) {
                        if (zzdyVar.zzH()[zza2 + 2] == 1) {
                            this.zzf.zzc(178);
                        }
                        i4 = 178;
                    }
                    int i10 = zzd - zza2;
                    this.zzg.zzb(this.zzh - i10, i10, this.zzk);
                    this.zzg.zzc(i4, this.zzl);
                    zzc = i;
                }
            }
            i = i3;
            this.zzg.zza(zzH, zzc, zza2);
            zzagp zzagpVar3 = this.zzf;
            if (i5 <= 0) {
            }
            if (this.zzf.zzd(i2)) {
            }
            if (i4 == 178) {
            }
            int i102 = zzd - zza2;
            this.zzg.zzb(this.zzh - i102, i102, this.zzk);
            this.zzg.zzc(i4, this.zzl);
            zzc = i;
        }
        if (!this.zzk) {
            this.zze.zza(zzH, zzc, zzd);
        }
        this.zzg.zza(zzH, zzc, zzd);
        this.zzf.zza(zzH, zzc, zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyv zzyvVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zzi = zzahmVar.zzb();
        zzzz zzv = zzyvVar.zzv(zzahmVar.zza(), 2);
        this.zzj = zzv;
        this.zzg = new zzage(zzv);
        this.zzb.zzb(zzyvVar, zzahmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        zzzp.zze(this.zzd);
        this.zze.zzb();
        zzage zzageVar = this.zzg;
        if (zzageVar != null) {
            zzageVar.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    zzagf(zzahp zzahpVar) {
        this.zzb = zzahpVar;
        this.zzd = new boolean[4];
        this.zze = new zzagd(128);
        this.zzl = -9223372036854775807L;
        this.zzf = new zzagp(178, 128);
        this.zzc = new zzdy();
    }
}
