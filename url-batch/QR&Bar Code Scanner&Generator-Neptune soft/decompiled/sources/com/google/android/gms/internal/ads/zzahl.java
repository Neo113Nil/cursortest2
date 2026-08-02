package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzahl implements zzahc {
    private final zzaid zza;
    private long zze;
    private String zzg;
    private zzaap zzh;
    private zzahk zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzahr zzb = new zzahr(7, 128);
    private final zzahr zzc = new zzahr(8, 128);
    private final zzahr zzd = new zzahr(6, 128);
    private long zzk = -9223372036854775807L;
    private final zzef zzm = new zzef();

    public zzahl(zzaid zzaidVar, boolean z, boolean z2) {
        this.zza = zzaidVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i, i2);
            this.zzc.zza(bArr, i, i2);
        }
        this.zzd.zza(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0181 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzahc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(zzef zzefVar) {
        int i;
        int i2;
        zzdd.zzb(this.zzh);
        int i3 = zzen.zza;
        int zzc = zzefVar.zzc();
        int zzd = zzefVar.zzd();
        byte[] zzH = zzefVar.zzH();
        this.zze += zzefVar.zza();
        this.zzh.zzq(zzefVar, zzefVar.zza());
        while (true) {
            int zza = zzaaf.zza(zzH, zzc, zzd, this.zzf);
            if (zza == zzd) {
                zzf(zzH, zzc, zzd);
                return;
            }
            int i4 = zza + 3;
            int i5 = zzH[i4] & 31;
            int i6 = zza - zzc;
            if (i6 > 0) {
                zzf(zzH, zzc, zza);
            }
            int i7 = zzd - zza;
            long j = this.zze - i7;
            int i8 = i6 < 0 ? -i6 : 0;
            long j2 = this.zzk;
            if (!this.zzj) {
                this.zzb.zzd(i8);
                this.zzc.zzd(i8);
                if (this.zzj) {
                    i = zzd;
                    i2 = i4;
                    zzahr zzahrVar = this.zzb;
                    if (zzahrVar.zze()) {
                        this.zzi.zzb(zzaaf.zzd(zzahrVar.zza, 4, zzahrVar.zzb));
                        this.zzb.zzb();
                    } else {
                        zzahr zzahrVar2 = this.zzc;
                        if (zzahrVar2.zze()) {
                            this.zzi.zza(zzaaf.zzc(zzahrVar2.zza, 4, zzahrVar2.zzb));
                            this.zzc.zzb();
                        }
                    }
                } else if (this.zzb.zze() && this.zzc.zze()) {
                    ArrayList arrayList = new ArrayList();
                    zzahr zzahrVar3 = this.zzb;
                    arrayList.add(Arrays.copyOf(zzahrVar3.zza, zzahrVar3.zzb));
                    zzahr zzahrVar4 = this.zzc;
                    arrayList.add(Arrays.copyOf(zzahrVar4.zza, zzahrVar4.zzb));
                    zzahr zzahrVar5 = this.zzb;
                    zzaae zzd2 = zzaaf.zzd(zzahrVar5.zza, 4, zzahrVar5.zzb);
                    zzahr zzahrVar6 = this.zzc;
                    zzaad zzc2 = zzaaf.zzc(zzahrVar6.zza, 4, zzahrVar6.zzb);
                    i2 = i4;
                    String zza2 = zzdf.zza(zzd2.zza, zzd2.zzb, zzd2.zzc);
                    zzaap zzaapVar = this.zzh;
                    zzad zzadVar = new zzad();
                    i = zzd;
                    zzadVar.zzH(this.zzg);
                    zzadVar.zzS("video/avc");
                    zzadVar.zzx(zza2);
                    zzadVar.zzX(zzd2.zze);
                    zzadVar.zzF(zzd2.zzf);
                    zzadVar.zzP(zzd2.zzg);
                    zzadVar.zzI(arrayList);
                    zzaapVar.zzk(zzadVar.zzY());
                    this.zzj = true;
                    this.zzi.zzb(zzd2);
                    this.zzi.zza(zzc2);
                    this.zzb.zzb();
                    this.zzc.zzb();
                }
                if (this.zzd.zzd(i8)) {
                    zzahr zzahrVar7 = this.zzd;
                    this.zzm.zzD(this.zzd.zza, zzaaf.zzb(zzahrVar7.zza, zzahrVar7.zzb));
                    this.zzm.zzF(4);
                    this.zza.zza(j2, this.zzm);
                }
                if (this.zzi.zze(j, i7, this.zzj, this.zzl)) {
                    this.zzl = false;
                }
                long j3 = this.zzk;
                if (this.zzj) {
                    this.zzb.zzc(i5);
                    this.zzc.zzc(i5);
                }
                this.zzd.zzc(i5);
                this.zzi.zzd(j, i5, j3);
                zzc = i2;
                zzd = i;
            }
            i = zzd;
            i2 = i4;
            if (this.zzd.zzd(i8)) {
            }
            if (this.zzi.zze(j, i7, this.zzj, this.zzl)) {
            }
            long j32 = this.zzk;
            if (this.zzj) {
            }
            this.zzd.zzc(i5);
            this.zzi.zzd(j, i5, j32);
            zzc = i2;
            zzd = i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzb(zzzl zzzlVar, zzaio zzaioVar) {
        zzaioVar.zzc();
        this.zzg = zzaioVar.zzb();
        this.zzh = zzzlVar.zzv(zzaioVar.zza(), 2);
        this.zzi = new zzahk(this.zzh, false, false);
        this.zza.zzb(zzzlVar, zzaioVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzk = j;
        }
        this.zzl |= (i & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzahc
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzaaf.zze(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzahk zzahkVar = this.zzi;
        if (zzahkVar != null) {
            zzahkVar.zzc();
        }
    }
}
