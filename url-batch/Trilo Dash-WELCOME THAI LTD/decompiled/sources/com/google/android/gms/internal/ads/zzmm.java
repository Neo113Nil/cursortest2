package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import androidx.core.view.PointerIconCompat;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes.dex */
public final class zzmm implements zzki {
    private final zzcx zza;
    private final zzcf zzb;
    private final zzch zzc;
    private final zzml zzd;
    private final SparseArray zze;
    private zzdm zzf;
    private zzcb zzg;
    private zzdg zzh;
    private boolean zzi;

    public static /* synthetic */ void zzW(zzmm zzmmVar) {
        final zzkj zzU = zzmmVar.zzU();
        zzmmVar.zzZ(zzU, 1028, new zzdj() { // from class: com.google.android.gms.internal.ads.zzlg
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
        zzmmVar.zzf.zze();
    }

    private final zzkj zzab(int i, zzsb zzsbVar) {
        zzcb zzcbVar = this.zzg;
        Objects.requireNonNull(zzcbVar);
        if (zzsbVar != null) {
            return this.zzd.zza(zzsbVar) != null ? zzaa(zzsbVar) : zzV(zzci.zza, i, zzsbVar);
        }
        zzci zzn = zzcbVar.zzn();
        if (i >= zzn.zzc()) {
            zzn = zzci.zza;
        }
        return zzV(zzn, i, null);
    }

    private final zzkj zzac() {
        return zzaa(this.zzd.zzd());
    }

    private final zzkj zzad() {
        return zzaa(this.zzd.zze());
    }

    private final zzkj zzae(zzbr zzbrVar) {
        zzbi zzbiVar;
        return (!(zzbrVar instanceof zzgu) || (zzbiVar = ((zzgu) zzbrVar).zzj) == null) ? zzU() : zzaa(new zzsb(zzbiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzA(final String str) {
        final zzkj zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_NO_DROP, new zzdj() { // from class: com.google.android.gms.internal.ads.zzmk
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzB(final zzgm zzgmVar) {
        final zzkj zzac = zzac();
        zzZ(zzac, PointerIconCompat.TYPE_ALL_SCROLL, new zzdj() { // from class: com.google.android.gms.internal.ads.zzma
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzC(final zzgm zzgmVar) {
        final zzkj zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_CROSSHAIR, new zzdj() { // from class: com.google.android.gms.internal.ads.zzlo
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzD(final zzad zzadVar, final zzgn zzgnVar) {
        final zzkj zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_VERTICAL_TEXT, new zzdj() { // from class: com.google.android.gms.internal.ads.zzlz
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzkl) obj).zze(zzkj.this, zzadVar, zzgnVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzE(final long j) {
        final zzkj zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_ALIAS, new zzdj(j) { // from class: com.google.android.gms.internal.ads.zzmc
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzF(final Exception exc) {
        final zzkj zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, new zzdj() { // from class: com.google.android.gms.internal.ads.zzkx
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzG(final int i, final long j, final long j2) {
        final zzkj zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_COPY, new zzdj(i, j, j2) { // from class: com.google.android.gms.internal.ads.zzkp
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzH(final int i, final long j) {
        final zzkj zzac = zzac();
        zzZ(zzac, PointerIconCompat.TYPE_ZOOM_IN, new zzdj() { // from class: com.google.android.gms.internal.ads.zzlj
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzkl) obj).zzh(zzkj.this, i, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzI(final Object obj, final long j) {
        final zzkj zzad = zzad();
        zzZ(zzad, 26, new zzdj() { // from class: com.google.android.gms.internal.ads.zzmg
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj2) {
                ((zzkl) obj2).zzn(zzkj.this, obj, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzJ(final Exception exc) {
        final zzkj zzad = zzad();
        zzZ(zzad, 1030, new zzdj() { // from class: com.google.android.gms.internal.ads.zzkv
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzK(final String str, final long j, final long j2) {
        final zzkj zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, new zzdj(str, j2, j) { // from class: com.google.android.gms.internal.ads.zzlf
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzL(final String str) {
        final zzkj zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_ZOOM_OUT, new zzdj() { // from class: com.google.android.gms.internal.ads.zzko
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzM(final zzgm zzgmVar) {
        final zzkj zzac = zzac();
        zzZ(zzac, PointerIconCompat.TYPE_GRAB, new zzdj() { // from class: com.google.android.gms.internal.ads.zzmf
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzkl) obj).zzo(zzkj.this, zzgmVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzN(final zzgm zzgmVar) {
        final zzkj zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, new zzdj() { // from class: com.google.android.gms.internal.ads.zzlk
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzO(final long j, final int i) {
        final zzkj zzac = zzac();
        zzZ(zzac, PointerIconCompat.TYPE_GRABBING, new zzdj(j, i) { // from class: com.google.android.gms.internal.ads.zzky
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzP(final zzad zzadVar, final zzgn zzgnVar) {
        final zzkj zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, new zzdj() { // from class: com.google.android.gms.internal.ads.zzkn
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzkl) obj).zzp(zzkj.this, zzadVar, zzgnVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzQ() {
        zzdg zzdgVar = this.zzh;
        zzcw.zzb(zzdgVar);
        zzdgVar.zzg(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmb
            @Override // java.lang.Runnable
            public final void run() {
                zzmm.zzW(zzmm.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzR(zzkl zzklVar) {
        this.zzf.zzf(zzklVar);
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzS(final zzcb zzcbVar, Looper looper) {
        zzfrh zzfrhVar;
        boolean z = true;
        if (this.zzg != null) {
            zzfrhVar = this.zzd.zzb;
            if (!zzfrhVar.isEmpty()) {
                z = false;
            }
        }
        zzcw.zzf(z);
        Objects.requireNonNull(zzcbVar);
        this.zzg = zzcbVar;
        this.zzh = this.zza.zzb(looper, null);
        this.zzf = this.zzf.zza(looper, new zzdk() { // from class: com.google.android.gms.internal.ads.zzle
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(Object obj, zzy zzyVar) {
                zzmm.this.zzX(zzcbVar, (zzkl) obj, zzyVar);
            }
        });
    }

    protected final zzkj zzU() {
        return zzaa(this.zzd.zzb());
    }

    @RequiresNonNull({"player"})
    protected final zzkj zzV(zzci zzciVar, int i, zzsb zzsbVar) {
        zzsb zzsbVar2 = true == zzciVar.zzo() ? null : zzsbVar;
        long zza = this.zza.zza();
        boolean z = zzciVar.equals(this.zzg.zzn()) && i == this.zzg.zzf();
        long j = 0;
        if (zzsbVar2 == null || !zzsbVar2.zzb()) {
            if (z) {
                j = this.zzg.zzk();
            } else if (!zzciVar.zzo()) {
                long j2 = zzciVar.zze(i, this.zzc, 0L).zzm;
                j = zzeg.zzz(0L);
            }
        } else if (z && this.zzg.zzd() == zzsbVar2.zzb && this.zzg.zze() == zzsbVar2.zzc) {
            j = this.zzg.zzl();
        }
        return new zzkj(zza, zzciVar, i, zzsbVar2, j, this.zzg.zzn(), this.zzg.zzf(), this.zzd.zzb(), this.zzg.zzl(), this.zzg.zzm());
    }

    final /* synthetic */ void zzX(zzcb zzcbVar, zzkl zzklVar, zzy zzyVar) {
        zzklVar.zzi(zzcbVar, new zzkk(zzyVar, this.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzvu
    public final void zzY(final int i, final long j, final long j2) {
        final zzkj zzaa = zzaa(this.zzd.zzc());
        zzZ(zzaa, PointerIconCompat.TYPE_CELL, new zzdj() { // from class: com.google.android.gms.internal.ads.zzkw
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzkl) obj).zzf(zzkj.this, i, j, j2);
            }
        });
    }

    protected final void zzZ(zzkj zzkjVar, int i, zzdj zzdjVar) {
        this.zze.put(i, zzkjVar);
        zzdm zzdmVar = this.zzf;
        zzdmVar.zzd(i, zzdjVar);
        zzdmVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zza(final zzbx zzbxVar) {
        final zzkj zzU = zzU();
        zzZ(zzU, 13, new zzdj() { // from class: com.google.android.gms.internal.ads.zzla
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final void zzaf(int i, zzsb zzsbVar, final zzrx zzrxVar) {
        final zzkj zzab = zzab(i, zzsbVar);
        zzZ(zzab, PointerIconCompat.TYPE_WAIT, new zzdj() { // from class: com.google.android.gms.internal.ads.zzku
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzkl) obj).zzg(zzkj.this, zzrxVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final void zzag(int i, zzsb zzsbVar, final zzrs zzrsVar, final zzrx zzrxVar) {
        final zzkj zzab = zzab(i, zzsbVar);
        zzZ(zzab, PointerIconCompat.TYPE_HAND, new zzdj() { // from class: com.google.android.gms.internal.ads.zzll
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final void zzah(int i, zzsb zzsbVar, final zzrs zzrsVar, final zzrx zzrxVar) {
        final zzkj zzab = zzab(i, zzsbVar);
        zzZ(zzab, PointerIconCompat.TYPE_CONTEXT_MENU, new zzdj() { // from class: com.google.android.gms.internal.ads.zzlv
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final void zzai(int i, zzsb zzsbVar, final zzrs zzrsVar, final zzrx zzrxVar, final IOException iOException, final boolean z) {
        final zzkj zzab = zzab(i, zzsbVar);
        zzZ(zzab, PointerIconCompat.TYPE_HELP, new zzdj() { // from class: com.google.android.gms.internal.ads.zzlh
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzkl) obj).zzj(zzkj.this, zzrsVar, zzrxVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzsl
    public final void zzaj(int i, zzsb zzsbVar, final zzrs zzrsVar, final zzrx zzrxVar) {
        final zzkj zzab = zzab(i, zzsbVar);
        zzZ(zzab, 1000, new zzdj() { // from class: com.google.android.gms.internal.ads.zzlr
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zzb(final zzr zzrVar) {
        final zzkj zzU = zzU();
        zzZ(zzU, 29, new zzdj() { // from class: com.google.android.gms.internal.ads.zzlb
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zzc(final int i, final boolean z) {
        final zzkj zzU = zzU();
        zzZ(zzU, 30, new zzdj(i, z) { // from class: com.google.android.gms.internal.ads.zzld
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zzd(final boolean z) {
        final zzkj zzU = zzU();
        zzZ(zzU, 3, new zzdj(z) { // from class: com.google.android.gms.internal.ads.zzmj
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zze(final boolean z) {
        final zzkj zzU = zzU();
        zzZ(zzU, 7, new zzdj(z) { // from class: com.google.android.gms.internal.ads.zzlq
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zzf(final zzbb zzbbVar, final int i) {
        final zzkj zzU = zzU();
        zzZ(zzU, 1, new zzdj(zzbbVar, i) { // from class: com.google.android.gms.internal.ads.zzlu
            public final /* synthetic */ zzbb zzb;

            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zzg(final zzbh zzbhVar) {
        final zzkj zzU = zzU();
        zzZ(zzU, 14, new zzdj() { // from class: com.google.android.gms.internal.ads.zzly
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zzh(final boolean z, final int i) {
        final zzkj zzU = zzU();
        zzZ(zzU, 5, new zzdj(z, i) { // from class: com.google.android.gms.internal.ads.zzlp
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zzi(final zzbt zzbtVar) {
        final zzkj zzU = zzU();
        zzZ(zzU, 12, new zzdj() { // from class: com.google.android.gms.internal.ads.zzkr
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zzj(final int i) {
        final zzkj zzU = zzU();
        zzZ(zzU, 4, new zzdj() { // from class: com.google.android.gms.internal.ads.zzlt
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzkl) obj).zzk(zzkj.this, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zzk(final int i) {
        final zzkj zzU = zzU();
        zzZ(zzU, 6, new zzdj(i) { // from class: com.google.android.gms.internal.ads.zzmi
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zzl(final zzbr zzbrVar) {
        final zzkj zzae = zzae(zzbrVar);
        zzZ(zzae, 10, new zzdj() { // from class: com.google.android.gms.internal.ads.zzlm
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzkl) obj).zzl(zzkj.this, zzbrVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zzm(final zzbr zzbrVar) {
        final zzkj zzae = zzae(zzbrVar);
        zzZ(zzae, 10, new zzdj() { // from class: com.google.android.gms.internal.ads.zzlx
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zzn(final boolean z, final int i) {
        final zzkj zzU = zzU();
        zzZ(zzU, -1, new zzdj(z, i) { // from class: com.google.android.gms.internal.ads.zzkm
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zzp() {
        final zzkj zzU = zzU();
        zzZ(zzU, -1, new zzdj() { // from class: com.google.android.gms.internal.ads.zzkt
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zzq(final boolean z) {
        final zzkj zzad = zzad();
        zzZ(zzad, 23, new zzdj(z) { // from class: com.google.android.gms.internal.ads.zzls
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zzr(final int i, final int i2) {
        final zzkj zzad = zzad();
        zzZ(zzad, 24, new zzdj(i, i2) { // from class: com.google.android.gms.internal.ads.zzmh
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zzt(final zzct zzctVar) {
        final zzkj zzU = zzU();
        zzZ(zzU, 2, new zzdj() { // from class: com.google.android.gms.internal.ads.zzlw
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zzu(final zzcv zzcvVar) {
        final zzkj zzad = zzad();
        zzZ(zzad, 25, new zzdj() { // from class: com.google.android.gms.internal.ads.zzme
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                zzkj zzkjVar = zzkj.this;
                zzcv zzcvVar2 = zzcvVar;
                ((zzkl) obj).zzq(zzkjVar, zzcvVar2);
                int i = zzcvVar2.zzc;
                int i2 = zzcvVar2.zzd;
                int i3 = zzcvVar2.zze;
                float f = zzcvVar2.zzf;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zzv(final float f) {
        final zzkj zzad = zzad();
        zzZ(zzad, 22, new zzdj(f) { // from class: com.google.android.gms.internal.ads.zzkq
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzw(zzkl zzklVar) {
        this.zzf.zzb(zzklVar);
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzx() {
        if (this.zzi) {
            return;
        }
        final zzkj zzU = zzU();
        this.zzi = true;
        zzZ(zzU, -1, new zzdj() { // from class: com.google.android.gms.internal.ads.zzmd
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzy(final Exception exc) {
        final zzkj zzad = zzad();
        zzZ(zzad, 1029, new zzdj() { // from class: com.google.android.gms.internal.ads.zzlc
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzz(final String str, final long j, final long j2) {
        final zzkj zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_TEXT, new zzdj(str, j2, j) { // from class: com.google.android.gms.internal.ads.zzln
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    private final zzkj zzaa(zzsb zzsbVar) {
        Objects.requireNonNull(this.zzg);
        zzci zza = zzsbVar == null ? null : this.zzd.zza(zzsbVar);
        if (zzsbVar != null && zza != null) {
            return zzV(zza, zza.zzn(zzsbVar.zza, this.zzb).zzd, zzsbVar);
        }
        int zzf = this.zzg.zzf();
        zzci zzn = this.zzg.zzn();
        if (zzf >= zzn.zzc()) {
            zzn = zzci.zza;
        }
        return zzV(zzn, zzf, null);
    }

    @Override // com.google.android.gms.internal.ads.zzki
    public final void zzT(List list, zzsb zzsbVar) {
        zzml zzmlVar = this.zzd;
        zzcb zzcbVar = this.zzg;
        Objects.requireNonNull(zzcbVar);
        zzmlVar.zzh(list, zzsbVar, zzcbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zzo(final zzca zzcaVar, final zzca zzcaVar2, final int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zzml zzmlVar = this.zzd;
        zzcb zzcbVar = this.zzg;
        Objects.requireNonNull(zzcbVar);
        zzmlVar.zzg(zzcbVar);
        final zzkj zzU = zzU();
        zzZ(zzU, 11, new zzdj() { // from class: com.google.android.gms.internal.ads.zzkz
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                zzkl zzklVar = (zzkl) obj;
                zzklVar.zzm(zzkj.this, zzcaVar, zzcaVar2, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzby
    public final void zzs(zzci zzciVar, final int i) {
        zzml zzmlVar = this.zzd;
        zzcb zzcbVar = this.zzg;
        Objects.requireNonNull(zzcbVar);
        zzmlVar.zzi(zzcbVar);
        final zzkj zzU = zzU();
        zzZ(zzU, 0, new zzdj(i) { // from class: com.google.android.gms.internal.ads.zzli
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
            }
        });
    }

    public zzmm(zzcx zzcxVar) {
        Objects.requireNonNull(zzcxVar);
        this.zza = zzcxVar;
        this.zzf = new zzdm(zzeg.zzD(), zzcxVar, new zzdk() { // from class: com.google.android.gms.internal.ads.zzks
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(Object obj, zzy zzyVar) {
            }
        });
        zzcf zzcfVar = new zzcf();
        this.zzb = zzcfVar;
        this.zzc = new zzch();
        this.zzd = new zzml(zzcfVar);
        this.zze = new SparseArray();
    }
}
