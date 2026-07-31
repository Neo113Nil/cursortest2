package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzoj implements zzmd {
    private final zzdb zza;
    private final zzbc zzb;
    private final zzbd zzc;
    private final zzoi zzd;
    private final SparseArray zze;
    private zzdr zzf;
    private zzba zzg;
    private zzdl zzh;
    private boolean zzi;

    private final zzme zzae() {
        return zzad(this.zzd.zzb());
    }

    private final zzme zzaf() {
        return zzad(this.zzd.zzc());
    }

    private final zzme zzag(int i, zzup zzupVar) {
        zzba zzbaVar = this.zzg;
        zzbaVar.getClass();
        if (zzupVar != null) {
            return this.zzd.zze(zzupVar) != null ? zzad(zzupVar) : zzaa(zzbe.zza, i, zzupVar);
        }
        zzbe zzo = zzbaVar.zzo();
        if (i >= zzo.zza()) {
            zzo = zzbe.zza;
        }
        return zzaa(zzo, i, null);
    }

    private final zzme zzah(zzat zzatVar) {
        zzup zzupVar;
        return (!(zzatVar instanceof zzhz) || (zzupVar = ((zzhz) zzatVar).zzh) == null) ? zzZ() : zzad(zzupVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzA() {
        if (this.zzi) {
            return;
        }
        final zzme zzZ = zzZ();
        this.zzi = true;
        zzY(zzZ, -1, new zzdm(zzZ) { // from class: com.google.android.gms.internal.ads.zznd
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzB(final int i, final int i2, final boolean z) {
        final zzme zzaf = zzaf();
        zzY(zzaf, AnalyticsListener.EVENT_RENDERER_READY_CHANGED, new zzdm(zzaf, i, i2, z) { // from class: com.google.android.gms.internal.ads.zzno
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzC(final zzhr zzhrVar) {
        final zzme zzaf = zzaf();
        zzY(zzaf, 1007, new zzdm(zzaf, zzhrVar) { // from class: com.google.android.gms.internal.ads.zznz
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzD(final String str, final long j, final long j2) {
        final zzme zzaf = zzaf();
        zzY(zzaf, 1008, new zzdm(zzaf, str, j2, j) { // from class: com.google.android.gms.internal.ads.zzoc
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzE(final zzu zzuVar, final zzhs zzhsVar) {
        final zzme zzaf = zzaf();
        zzY(zzaf, 1009, new zzdm() { // from class: com.google.android.gms.internal.ads.zzod
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzmg) obj).zzk(zzme.this, zzuVar, zzhsVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzF(final long j) {
        final zzme zzaf = zzaf();
        zzY(zzaf, 1010, new zzdm(zzaf, j) { // from class: com.google.android.gms.internal.ads.zzoe
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzG(final int i, final long j, final long j2) {
        final zzme zzaf = zzaf();
        zzY(zzaf, 1011, new zzdm(zzaf, i, j, j2) { // from class: com.google.android.gms.internal.ads.zzof
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzH(final String str) {
        final zzme zzaf = zzaf();
        zzY(zzaf, 1012, new zzdm(zzaf, str) { // from class: com.google.android.gms.internal.ads.zzog
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzI(final zzhr zzhrVar) {
        final zzme zzae = zzae();
        zzY(zzae, 1013, new zzdm(zzae, zzhrVar) { // from class: com.google.android.gms.internal.ads.zzmi
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzJ(final Exception exc) {
        final zzme zzaf = zzaf();
        zzY(zzaf, 1014, new zzdm(zzaf, exc) { // from class: com.google.android.gms.internal.ads.zzmj
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzK(final Exception exc) {
        final zzme zzaf = zzaf();
        zzY(zzaf, AnalyticsListener.EVENT_AUDIO_CODEC_ERROR, new zzdm(zzaf, exc) { // from class: com.google.android.gms.internal.ads.zzmk
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzL(final zzpw zzpwVar) {
        final zzme zzaf = zzaf();
        zzY(zzaf, AnalyticsListener.EVENT_AUDIO_TRACK_INITIALIZED, new zzdm(zzaf, zzpwVar) { // from class: com.google.android.gms.internal.ads.zzml
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzM(final zzpw zzpwVar) {
        final zzme zzaf = zzaf();
        zzY(zzaf, AnalyticsListener.EVENT_AUDIO_TRACK_RELEASED, new zzdm(zzaf, zzpwVar) { // from class: com.google.android.gms.internal.ads.zzmm
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzN(final zzhr zzhrVar) {
        final zzme zzaf = zzaf();
        zzY(zzaf, 1015, new zzdm(zzaf, zzhrVar) { // from class: com.google.android.gms.internal.ads.zzmo
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzO(final String str, final long j, final long j2) {
        final zzme zzaf = zzaf();
        zzY(zzaf, 1016, new zzdm(zzaf, str, j2, j) { // from class: com.google.android.gms.internal.ads.zzmp
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzP(final zzu zzuVar, final zzhs zzhsVar) {
        final zzme zzaf = zzaf();
        zzY(zzaf, 1017, new zzdm() { // from class: com.google.android.gms.internal.ads.zzmq
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzmg) obj).zzl(zzme.this, zzuVar, zzhsVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzQ(final int i, final long j) {
        final zzme zzae = zzae();
        zzY(zzae, 1018, new zzdm() { // from class: com.google.android.gms.internal.ads.zzmr
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzmg) obj).zzm(zzme.this, i, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzR(final String str) {
        final zzme zzaf = zzaf();
        zzY(zzaf, 1019, new zzdm(zzaf, str) { // from class: com.google.android.gms.internal.ads.zzmt
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzS(final zzhr zzhrVar) {
        final zzme zzae = zzae();
        zzY(zzae, 1020, new zzdm() { // from class: com.google.android.gms.internal.ads.zzmu
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzmg) obj).zzdm(zzme.this, zzhrVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzT(final Object obj, final long j) {
        final zzme zzaf = zzaf();
        zzY(zzaf, 26, new zzdm() { // from class: com.google.android.gms.internal.ads.zzmv
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj2) {
                ((zzmg) obj2).zzo(zzme.this, obj, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzU(final long j, final int i) {
        final zzme zzae = zzae();
        zzY(zzae, 1021, new zzdm(zzae, j, i) { // from class: com.google.android.gms.internal.ads.zzmw
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzV(final Exception exc) {
        final zzme zzaf = zzaf();
        zzY(zzaf, AnalyticsListener.EVENT_VIDEO_CODEC_ERROR, new zzdm(zzaf, exc) { // from class: com.google.android.gms.internal.ads.zzmx
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzW(final int i) {
        final zzme zzZ = zzZ();
        zzY(zzZ, 1034, new zzdm(zzZ, i) { // from class: com.google.android.gms.internal.ads.zzmy
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final void zzX(final int i, final long j, final long j2) {
        final zzme zzad = zzad(this.zzd.zzd());
        zzY(zzad, 1006, new zzdm() { // from class: com.google.android.gms.internal.ads.zzoa
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzmg) obj).zzdl(zzme.this, i, j, j2);
            }
        });
    }

    protected final void zzY(zzme zzmeVar, int i, zzdm zzdmVar) {
        this.zze.put(i, zzmeVar);
        zzdr zzdrVar = this.zzf;
        zzdrVar.zzd(i, zzdmVar);
        zzdrVar.zze();
    }

    protected final zzme zzZ() {
        return zzad(this.zzd.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zza(zzba zzbaVar, zzax zzaxVar) {
    }

    @RequiresNonNull({"player"})
    protected final zzme zzaa(zzbe zzbeVar, int i, zzup zzupVar) {
        zzup zzupVar2 = true == zzbeVar.zzg() ? null : zzupVar;
        long zzb = this.zza.zzb();
        boolean z = zzbeVar.equals(this.zzg.zzo()) && i == this.zzg.zzq();
        long j = 0;
        if (zzupVar2 == null || !zzupVar2.zzb()) {
            if (z) {
                j = this.zzg.zzy();
            } else if (!zzbeVar.zzg()) {
                long j2 = zzbeVar.zzb(i, this.zzc, 0L).zzl;
                j = zzeo.zzp(0L);
            }
        } else if (z && this.zzg.zzw() == zzupVar2.zzb && this.zzg.zzx() == zzupVar2.zzc) {
            j = this.zzg.zzs();
        }
        return new zzme(zzb, zzbeVar, i, zzupVar2, j, this.zzg.zzo(), this.zzg.zzq(), this.zzd.zza(), this.zzg.zzs(), this.zzg.zzu());
    }

    final /* synthetic */ void zzab(zzba zzbaVar, zzmg zzmgVar, zzr zzrVar) {
        zzmgVar.zzdn(zzbaVar, new zzmf(zzrVar, this.zze));
    }

    final /* synthetic */ void zzac() {
        final zzme zzZ = zzZ();
        zzY(zzZ, AnalyticsListener.EVENT_PLAYER_RELEASED, new zzdm(zzZ) { // from class: com.google.android.gms.internal.ads.zzob
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        this.zzf.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzc(final zzaj zzajVar, final int i) {
        final zzme zzZ = zzZ();
        zzY(zzZ, 1, new zzdm(zzZ, zzajVar, i) { // from class: com.google.android.gms.internal.ads.zznh
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcT(int i, zzup zzupVar, final zzug zzugVar, final zzul zzulVar, final int i2) {
        final zzme zzag = zzag(i, zzupVar);
        zzY(zzag, 1000, new zzdm(zzag, zzugVar, zzulVar, i2) { // from class: com.google.android.gms.internal.ads.zzna
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcU(int i, zzup zzupVar, final zzug zzugVar, final zzul zzulVar) {
        final zzme zzag = zzag(i, zzupVar);
        zzY(zzag, 1001, new zzdm(zzag, zzugVar, zzulVar) { // from class: com.google.android.gms.internal.ads.zznb
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcV(int i, zzup zzupVar, final zzug zzugVar, final zzul zzulVar) {
        final zzme zzag = zzag(i, zzupVar);
        zzY(zzag, 1002, new zzdm(zzag, zzugVar, zzulVar) { // from class: com.google.android.gms.internal.ads.zznc
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcW(int i, zzup zzupVar, final zzug zzugVar, final zzul zzulVar, final IOException iOException, final boolean z) {
        final zzme zzag = zzag(i, zzupVar);
        zzY(zzag, 1003, new zzdm() { // from class: com.google.android.gms.internal.ads.zzne
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzmg) obj).zzh(zzme.this, zzugVar, zzulVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcX(int i, zzup zzupVar, final zzul zzulVar) {
        final zzme zzag = zzag(i, zzupVar);
        zzY(zzag, 1004, new zzdm() { // from class: com.google.android.gms.internal.ads.zznf
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzmg) obj).zzdk(zzme.this, zzulVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzd(final zzbm zzbmVar) {
        final zzme zzZ = zzZ();
        zzY(zzZ, 2, new zzdm(zzZ, zzbmVar) { // from class: com.google.android.gms.internal.ads.zzni
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zze(final zzam zzamVar) {
        final zzme zzZ = zzZ();
        zzY(zzZ, 14, new zzdm(zzZ, zzamVar) { // from class: com.google.android.gms.internal.ads.zznv
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzf(final boolean z) {
        final zzme zzZ = zzZ();
        zzY(zzZ, 3, new zzdm(zzZ, z) { // from class: com.google.android.gms.internal.ads.zznj
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzg(final zzaw zzawVar) {
        final zzme zzZ = zzZ();
        zzY(zzZ, 13, new zzdm(zzZ, zzawVar) { // from class: com.google.android.gms.internal.ads.zznk
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzh(final boolean z, final int i) {
        final zzme zzZ = zzZ();
        zzY(zzZ, -1, new zzdm(zzZ, z, i) { // from class: com.google.android.gms.internal.ads.zznl
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzi(final int i) {
        final zzme zzZ = zzZ();
        zzY(zzZ, 4, new zzdm() { // from class: com.google.android.gms.internal.ads.zznm
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzmg) obj).zze(zzme.this, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzj(final boolean z, final int i) {
        final zzme zzZ = zzZ();
        zzY(zzZ, 5, new zzdm(zzZ, z, i) { // from class: com.google.android.gms.internal.ads.zznn
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzk(final int i) {
        final zzme zzZ = zzZ();
        zzY(zzZ, 6, new zzdm(zzZ, i) { // from class: com.google.android.gms.internal.ads.zznp
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzl(final boolean z) {
        final zzme zzZ = zzZ();
        zzY(zzZ, 7, new zzdm(zzZ, z) { // from class: com.google.android.gms.internal.ads.zznq
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzm(final zzat zzatVar) {
        final zzme zzah = zzah(zzatVar);
        zzY(zzah, 10, new zzdm() { // from class: com.google.android.gms.internal.ads.zznr
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzmg) obj).zzg(zzme.this, zzatVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzn(final zzat zzatVar) {
        final zzme zzah = zzah(zzatVar);
        zzY(zzah, 10, new zzdm(zzah, zzatVar) { // from class: com.google.android.gms.internal.ads.zzns
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzp(final zzau zzauVar) {
        final zzme zzZ = zzZ();
        zzY(zzZ, 12, new zzdm(zzZ, zzauVar) { // from class: com.google.android.gms.internal.ads.zznu
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzq(final int i) {
        final zzme zzaf = zzaf();
        zzY(zzaf, 21, new zzdm(zzaf, i) { // from class: com.google.android.gms.internal.ads.zznx
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzr(final float f) {
        final zzme zzaf = zzaf();
        zzY(zzaf, 22, new zzdm(zzaf, f) { // from class: com.google.android.gms.internal.ads.zzmn
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzs(final boolean z) {
        final zzme zzaf = zzaf();
        zzY(zzaf, 23, new zzdm(zzaf, z) { // from class: com.google.android.gms.internal.ads.zznw
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzt(final zzbu zzbuVar) {
        final zzme zzaf = zzaf();
        zzY(zzaf, 25, new zzdm() { // from class: com.google.android.gms.internal.ads.zzny
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                zzme zzmeVar = zzme.this;
                zzbu zzbuVar2 = zzbuVar;
                ((zzmg) obj).zzp(zzmeVar, zzbuVar2);
                int i = zzbuVar2.zzb;
                int i2 = zzbuVar2.zzc;
                float f = zzbuVar2.zzd;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzu(final int i, final int i2) {
        final zzme zzaf = zzaf();
        zzY(zzaf, 24, new zzdm(zzaf, i, i2) { // from class: com.google.android.gms.internal.ads.zzmz
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzv(zzmg zzmgVar) {
        this.zzf.zzb(zzmgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzw(zzmg zzmgVar) {
        this.zzf.zzc(zzmgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzx(final zzba zzbaVar, Looper looper) {
        boolean z = true;
        if (this.zzg != null && !this.zzd.zzi().isEmpty()) {
            z = false;
        }
        zzghc.zzh(z);
        zzbaVar.getClass();
        this.zzg = zzbaVar;
        this.zzh = this.zza.zzd(looper, null);
        this.zzf = this.zzf.zza(looper, new zzdn() { // from class: com.google.android.gms.internal.ads.zzmh
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj, zzr zzrVar) {
                zzoj.this.zzab(zzbaVar, (zzmg) obj, zzrVar);
            }
        });
    }

    private final zzme zzad(zzup zzupVar) {
        this.zzg.getClass();
        zzbe zze = zzupVar == null ? null : this.zzd.zze(zzupVar);
        if (zzupVar != null && zze != null) {
            return zzaa(zze, zze.zzo(zzupVar.zza, this.zzb).zzc, zzupVar);
        }
        int zzq = this.zzg.zzq();
        zzbe zzo = this.zzg.zzo();
        if (zzq >= zzo.zza()) {
            zzo = zzbe.zza;
        }
        return zzaa(zzo, zzq, null);
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzy() {
        zzdl zzdlVar = this.zzh;
        zzdlVar.getClass();
        zzdlVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzms
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzoj.this.zzac();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzz(List list, zzup zzupVar) {
        zzba zzbaVar = this.zzg;
        zzbaVar.getClass();
        this.zzd.zzh(list, zzupVar, zzbaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzb(zzbe zzbeVar, final int i) {
        zzba zzbaVar = this.zzg;
        zzbaVar.getClass();
        this.zzd.zzg(zzbaVar);
        final zzme zzZ = zzZ();
        zzY(zzZ, 0, new zzdm(zzZ, i) { // from class: com.google.android.gms.internal.ads.zzng
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzo(final zzaz zzazVar, final zzaz zzazVar2, final int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zzoi zzoiVar = this.zzd;
        zzba zzbaVar = this.zzg;
        zzbaVar.getClass();
        zzoiVar.zzf(zzbaVar);
        final zzme zzZ = zzZ();
        zzY(zzZ, 11, new zzdm() { // from class: com.google.android.gms.internal.ads.zznt
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzmg) obj).zzdj(zzme.this, zzazVar, zzazVar2, i);
            }
        });
    }

    public zzoj(zzdb zzdbVar) {
        zzdbVar.getClass();
        this.zza = zzdbVar;
        this.zzf = new zzdr(zzeo.zze(), zzdbVar, zzoh.zza);
        zzbc zzbcVar = new zzbc();
        this.zzb = zzbcVar;
        this.zzc = new zzbd();
        this.zzd = new zzoi(zzbcVar);
        this.zze = new SparseArray();
    }
}
