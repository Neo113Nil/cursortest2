package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import androidx.core.view.PointerIconCompat;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzms implements zzko {
    private final zzde zza;
    private final zzck zzb;
    private final zzcm zzc;
    private final zzmr zzd;
    private final SparseArray zze;
    private zzdt zzf;
    private zzcg zzg;
    private zzdn zzh;
    private boolean zzi;

    public static /* synthetic */ void zzW(zzms zzmsVar) {
        final zzkp zzU = zzmsVar.zzU();
        zzmsVar.zzZ(zzU, 1028, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlo
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
        zzmsVar.zzf.zze();
    }

    private final zzkp zzab(int i, zzsi zzsiVar) {
        zzcg zzcgVar = this.zzg;
        Objects.requireNonNull(zzcgVar);
        if (zzsiVar != null) {
            return this.zzd.zza(zzsiVar) != null ? zzaa(zzsiVar) : zzV(zzcn.zza, i, zzsiVar);
        }
        zzcn zzn = zzcgVar.zzn();
        if (i >= zzn.zzc()) {
            zzn = zzcn.zza;
        }
        return zzV(zzn, i, null);
    }

    private final zzkp zzac() {
        return zzaa(this.zzd.zzd());
    }

    private final zzkp zzad() {
        return zzaa(this.zzd.zze());
    }

    private final zzkp zzae(zzbw zzbwVar) {
        zzbn zzbnVar;
        return (!(zzbwVar instanceof zzha) || (zzbnVar = ((zzha) zzbwVar).zzj) == null) ? zzU() : zzaa(new zzsi(zzbnVar));
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzA(final String str) {
        final zzkp zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_NO_DROP, new zzdq() { // from class: com.google.android.gms.internal.ads.zzmq
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzB(final zzgs zzgsVar) {
        final zzkp zzac = zzac();
        zzZ(zzac, PointerIconCompat.TYPE_ALL_SCROLL, new zzdq() { // from class: com.google.android.gms.internal.ads.zzmg
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzC(final zzgs zzgsVar) {
        final zzkp zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_CROSSHAIR, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlv
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzD(final zzaf zzafVar, final zzgt zzgtVar) {
        final zzkp zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_VERTICAL_TEXT, new zzdq() { // from class: com.google.android.gms.internal.ads.zzmf
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzkr) obj).zze(zzkp.this, zzafVar, zzgtVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzE(final long j) {
        final zzkp zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_ALIAS, new zzdq(j) { // from class: com.google.android.gms.internal.ads.zzmi
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzF(final Exception exc) {
        final zzkp zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, new zzdq() { // from class: com.google.android.gms.internal.ads.zzld
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzG(final int i, final long j, final long j2) {
        final zzkp zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_COPY, new zzdq(i, j, j2) { // from class: com.google.android.gms.internal.ads.zzkv
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzH(final int i, final long j) {
        final zzkp zzac = zzac();
        zzZ(zzac, PointerIconCompat.TYPE_ZOOM_IN, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlq
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzkr) obj).zzh(zzkp.this, i, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzI(final Object obj, final long j) {
        final zzkp zzad = zzad();
        zzZ(zzad, 26, new zzdq() { // from class: com.google.android.gms.internal.ads.zzmm
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj2) {
                ((zzkr) obj2).zzn(zzkp.this, obj, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzJ(final Exception exc) {
        final zzkp zzad = zzad();
        zzZ(zzad, 1030, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlb
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzK(final String str, final long j, final long j2) {
        final zzkp zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, new zzdq(str, j2, j) { // from class: com.google.android.gms.internal.ads.zzlm
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzL(final String str) {
        final zzkp zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_ZOOM_OUT, new zzdq() { // from class: com.google.android.gms.internal.ads.zzku
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzM(final zzgs zzgsVar) {
        final zzkp zzac = zzac();
        zzZ(zzac, PointerIconCompat.TYPE_GRAB, new zzdq() { // from class: com.google.android.gms.internal.ads.zzml
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzkr) obj).zzo(zzkp.this, zzgsVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzN(final zzgs zzgsVar) {
        final zzkp zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlr
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzO(final long j, final int i) {
        final zzkp zzac = zzac();
        zzZ(zzac, PointerIconCompat.TYPE_GRABBING, new zzdq(j, i) { // from class: com.google.android.gms.internal.ads.zzle
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzP(final zzaf zzafVar, final zzgt zzgtVar) {
        final zzkp zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, new zzdq() { // from class: com.google.android.gms.internal.ads.zzkt
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzkr) obj).zzp(zzkp.this, zzafVar, zzgtVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzQ() {
        zzdn zzdnVar = this.zzh;
        zzdd.zzb(zzdnVar);
        zzdnVar.zzg(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmh
            @Override // java.lang.Runnable
            public final void run() {
                zzms.zzW(zzms.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzR(zzkr zzkrVar) {
        this.zzf.zzf(zzkrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzS(final zzcg zzcgVar, Looper looper) {
        zzfvn zzfvnVar;
        boolean z = true;
        if (this.zzg != null) {
            zzfvnVar = this.zzd.zzb;
            if (!zzfvnVar.isEmpty()) {
                z = false;
            }
        }
        zzdd.zzf(z);
        Objects.requireNonNull(zzcgVar);
        this.zzg = zzcgVar;
        this.zzh = this.zza.zzb(looper, null);
        this.zzf = this.zzf.zza(looper, new zzdr() { // from class: com.google.android.gms.internal.ads.zzll
            @Override // com.google.android.gms.internal.ads.zzdr
            public final void zza(Object obj, zzaa zzaaVar) {
                zzms.this.zzX(zzcgVar, (zzkr) obj, zzaaVar);
            }
        });
    }

    protected final zzkp zzU() {
        return zzaa(this.zzd.zzb());
    }

    @RequiresNonNull({"player"})
    protected final zzkp zzV(zzcn zzcnVar, int i, zzsi zzsiVar) {
        zzsi zzsiVar2 = true == zzcnVar.zzo() ? null : zzsiVar;
        long zza = this.zza.zza();
        boolean z = zzcnVar.equals(this.zzg.zzn()) && i == this.zzg.zzf();
        long j = 0;
        if (zzsiVar2 == null || !zzsiVar2.zzb()) {
            if (z) {
                j = this.zzg.zzk();
            } else if (!zzcnVar.zzo()) {
                long j2 = zzcnVar.zze(i, this.zzc, 0L).zzm;
                j = zzen.zzz(0L);
            }
        } else if (z && this.zzg.zzd() == zzsiVar2.zzb && this.zzg.zze() == zzsiVar2.zzc) {
            j = this.zzg.zzl();
        }
        return new zzkp(zza, zzcnVar, i, zzsiVar2, j, this.zzg.zzn(), this.zzg.zzf(), this.zzd.zzb(), this.zzg.zzl(), this.zzg.zzm());
    }

    final /* synthetic */ void zzX(zzcg zzcgVar, zzkr zzkrVar, zzaa zzaaVar) {
        zzkrVar.zzi(zzcgVar, new zzkq(zzaaVar, this.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zzY(final int i, final long j, final long j2) {
        final zzkp zzaa = zzaa(this.zzd.zzc());
        zzZ(zzaa, PointerIconCompat.TYPE_CELL, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlc
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzkr) obj).zzf(zzkp.this, i, j, j2);
            }
        });
    }

    protected final void zzZ(zzkp zzkpVar, int i, zzdq zzdqVar) {
        this.zze.put(i, zzkpVar);
        zzdt zzdtVar = this.zzf;
        zzdtVar.zzd(i, zzdqVar);
        zzdtVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zza(final zzcc zzccVar) {
        final zzkp zzU = zzU();
        zzZ(zzU, 13, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlg
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzaf(int i, zzsi zzsiVar, final zzse zzseVar) {
        final zzkp zzab = zzab(i, zzsiVar);
        zzZ(zzab, PointerIconCompat.TYPE_WAIT, new zzdq() { // from class: com.google.android.gms.internal.ads.zzla
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzkr) obj).zzg(zzkp.this, zzseVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzag(int i, zzsi zzsiVar, final zzrz zzrzVar, final zzse zzseVar) {
        final zzkp zzab = zzab(i, zzsiVar);
        zzZ(zzab, PointerIconCompat.TYPE_HAND, new zzdq() { // from class: com.google.android.gms.internal.ads.zzls
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzah(int i, zzsi zzsiVar, final zzrz zzrzVar, final zzse zzseVar) {
        final zzkp zzab = zzab(i, zzsiVar);
        zzZ(zzab, PointerIconCompat.TYPE_CONTEXT_MENU, new zzdq() { // from class: com.google.android.gms.internal.ads.zzmc
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzai(int i, zzsi zzsiVar, final zzrz zzrzVar, final zzse zzseVar, final IOException iOException, final boolean z) {
        final zzkp zzab = zzab(i, zzsiVar);
        zzZ(zzab, PointerIconCompat.TYPE_HELP, new zzdq() { // from class: com.google.android.gms.internal.ads.zzln
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzkr) obj).zzj(zzkp.this, zzrzVar, zzseVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzss
    public final void zzaj(int i, zzsi zzsiVar, final zzrz zzrzVar, final zzse zzseVar) {
        final zzkp zzab = zzab(i, zzsiVar);
        zzZ(zzab, 1000, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlw
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzb(final zzt zztVar) {
        final zzkp zzU = zzU();
        zzZ(zzU, 29, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlh
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzc(final int i, final boolean z) {
        final zzkp zzU = zzU();
        zzZ(zzU, 30, new zzdq(i, z) { // from class: com.google.android.gms.internal.ads.zzlk
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzd(final boolean z) {
        final zzkp zzU = zzU();
        zzZ(zzU, 3, new zzdq(z) { // from class: com.google.android.gms.internal.ads.zzmp
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zze(final boolean z) {
        final zzkp zzU = zzU();
        zzZ(zzU, 7, new zzdq(z) { // from class: com.google.android.gms.internal.ads.zzly
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzf(final zzbg zzbgVar, final int i) {
        final zzkp zzU = zzU();
        zzZ(zzU, 1, new zzdq(zzbgVar, i) { // from class: com.google.android.gms.internal.ads.zzmb
            public final /* synthetic */ zzbg zzb;

            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzg(final zzbm zzbmVar) {
        final zzkp zzU = zzU();
        zzZ(zzU, 14, new zzdq() { // from class: com.google.android.gms.internal.ads.zzme
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzh(final boolean z, final int i) {
        final zzkp zzU = zzU();
        zzZ(zzU, 5, new zzdq(z, i) { // from class: com.google.android.gms.internal.ads.zzlx
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzi(final zzby zzbyVar) {
        final zzkp zzU = zzU();
        zzZ(zzU, 12, new zzdq() { // from class: com.google.android.gms.internal.ads.zzkx
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzj(final int i) {
        final zzkp zzU = zzU();
        zzZ(zzU, 4, new zzdq() { // from class: com.google.android.gms.internal.ads.zzma
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzkr) obj).zzk(zzkp.this, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzk(final int i) {
        final zzkp zzU = zzU();
        zzZ(zzU, 6, new zzdq(i) { // from class: com.google.android.gms.internal.ads.zzmo
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzl(final zzbw zzbwVar) {
        final zzkp zzae = zzae(zzbwVar);
        zzZ(zzae, 10, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlt
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                ((zzkr) obj).zzl(zzkp.this, zzbwVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzm(final zzbw zzbwVar) {
        final zzkp zzae = zzae(zzbwVar);
        zzZ(zzae, 10, new zzdq() { // from class: com.google.android.gms.internal.ads.zzmd
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzn(final boolean z, final int i) {
        final zzkp zzU = zzU();
        zzZ(zzU, -1, new zzdq(z, i) { // from class: com.google.android.gms.internal.ads.zzks
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzp() {
        final zzkp zzU = zzU();
        zzZ(zzU, -1, new zzdq() { // from class: com.google.android.gms.internal.ads.zzkz
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzq(final boolean z) {
        final zzkp zzad = zzad();
        zzZ(zzad, 23, new zzdq(z) { // from class: com.google.android.gms.internal.ads.zzlz
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzr(final int i, final int i2) {
        final zzkp zzad = zzad();
        zzZ(zzad, 24, new zzdq(i, i2) { // from class: com.google.android.gms.internal.ads.zzmn
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzt(final zzcy zzcyVar) {
        final zzkp zzU = zzU();
        zzZ(zzU, 2, new zzdq() { // from class: com.google.android.gms.internal.ads.zzli
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzu(final zzda zzdaVar) {
        final zzkp zzad = zzad();
        zzZ(zzad, 25, new zzdq() { // from class: com.google.android.gms.internal.ads.zzmk
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                zzkp zzkpVar = zzkp.this;
                zzda zzdaVar2 = zzdaVar;
                ((zzkr) obj).zzq(zzkpVar, zzdaVar2);
                int i = zzdaVar2.zzc;
                int i2 = zzdaVar2.zzd;
                int i3 = zzdaVar2.zze;
                float f = zzdaVar2.zzf;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzv(final float f) {
        final zzkp zzad = zzad();
        zzZ(zzad, 22, new zzdq(f) { // from class: com.google.android.gms.internal.ads.zzkw
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzw(zzkr zzkrVar) {
        this.zzf.zzb(zzkrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzx() {
        if (this.zzi) {
            return;
        }
        final zzkp zzU = zzU();
        this.zzi = true;
        zzZ(zzU, -1, new zzdq() { // from class: com.google.android.gms.internal.ads.zzmj
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzy(final Exception exc) {
        final zzkp zzad = zzad();
        zzZ(zzad, 1029, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlj
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzz(final String str, final long j, final long j2) {
        final zzkp zzad = zzad();
        zzZ(zzad, PointerIconCompat.TYPE_TEXT, new zzdq(str, j2, j) { // from class: com.google.android.gms.internal.ads.zzlu
            public final /* synthetic */ String zzb;

            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    private final zzkp zzaa(zzsi zzsiVar) {
        Objects.requireNonNull(this.zzg);
        zzcn zza = zzsiVar == null ? null : this.zzd.zza(zzsiVar);
        if (zzsiVar != null && zza != null) {
            return zzV(zza, zza.zzn(zzsiVar.zza, this.zzb).zzd, zzsiVar);
        }
        int zzf = this.zzg.zzf();
        zzcn zzn = this.zzg.zzn();
        if (zzf >= zzn.zzc()) {
            zzn = zzcn.zza;
        }
        return zzV(zzn, zzf, null);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzT(List list, zzsi zzsiVar) {
        zzmr zzmrVar = this.zzd;
        zzcg zzcgVar = this.zzg;
        Objects.requireNonNull(zzcgVar);
        zzmrVar.zzh(list, zzsiVar, zzcgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzo(final zzcf zzcfVar, final zzcf zzcfVar2, final int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zzmr zzmrVar = this.zzd;
        zzcg zzcgVar = this.zzg;
        Objects.requireNonNull(zzcgVar);
        zzmrVar.zzg(zzcgVar);
        final zzkp zzU = zzU();
        zzZ(zzU, 11, new zzdq() { // from class: com.google.android.gms.internal.ads.zzlf
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                zzkr zzkrVar = (zzkr) obj;
                zzkrVar.zzm(zzkp.this, zzcfVar, zzcfVar2, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcd
    public final void zzs(zzcn zzcnVar, final int i) {
        zzmr zzmrVar = this.zzd;
        zzcg zzcgVar = this.zzg;
        Objects.requireNonNull(zzcgVar);
        zzmrVar.zzi(zzcgVar);
        final zzkp zzU = zzU();
        zzZ(zzU, 0, new zzdq(i) { // from class: com.google.android.gms.internal.ads.zzlp
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
            }
        });
    }

    public zzms(zzde zzdeVar) {
        Objects.requireNonNull(zzdeVar);
        this.zza = zzdeVar;
        this.zzf = new zzdt(zzen.zzE(), zzdeVar, new zzdr() { // from class: com.google.android.gms.internal.ads.zzky
            @Override // com.google.android.gms.internal.ads.zzdr
            public final void zza(Object obj, zzaa zzaaVar) {
            }
        });
        zzck zzckVar = new zzck();
        this.zzb = zzckVar;
        this.zzc = new zzcm();
        this.zzd = new zzmr(zzckVar);
        this.zze = new SparseArray();
    }
}
