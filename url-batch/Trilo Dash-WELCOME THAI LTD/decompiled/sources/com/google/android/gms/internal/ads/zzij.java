package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@21.0.0 */
/* loaded from: classes2.dex */
final class zzij implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzxr, zznl, zzub, zzrb, zzgj, zzgf, zzkb, zzgv {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzin zza;

    /* synthetic */ zzij(zzin zzinVar, zzii zziiVar) {
        this.zza = zzinVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzin.zzN(this.zza, surfaceTexture);
        this.zza.zzap(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzas(null);
        this.zza.zzap(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzap(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzap(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzap(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final /* synthetic */ void zza(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public final void zzb(boolean z) {
        this.zza.zzaw();
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzc(Exception exc) {
        zzki zzkiVar;
        zzkiVar = this.zza.zzr;
        zzkiVar.zzy(exc);
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzd(String str, long j, long j2) {
        zzki zzkiVar;
        zzkiVar = this.zza.zzr;
        zzkiVar.zzz(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zze(String str) {
        zzki zzkiVar;
        zzkiVar = this.zza.zzr;
        zzkiVar.zzA(str);
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzf(zzgm zzgmVar) {
        zzki zzkiVar;
        zzkiVar = this.zza.zzr;
        zzkiVar.zzB(zzgmVar);
        this.zza.zzM = null;
        this.zza.zzU = null;
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzg(zzgm zzgmVar) {
        zzki zzkiVar;
        this.zza.zzU = zzgmVar;
        zzkiVar = this.zza.zzr;
        zzkiVar.zzC(zzgmVar);
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzh(zzad zzadVar, zzgn zzgnVar) {
        zzki zzkiVar;
        this.zza.zzM = zzadVar;
        zzkiVar = this.zza.zzr;
        zzkiVar.zzD(zzadVar, zzgnVar);
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzi(long j) {
        zzki zzkiVar;
        zzkiVar = this.zza.zzr;
        zzkiVar.zzE(j);
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzj(Exception exc) {
        zzki zzkiVar;
        zzkiVar = this.zza.zzr;
        zzkiVar.zzF(exc);
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzk(int i, long j, long j2) {
        zzki zzkiVar;
        zzkiVar = this.zza.zzr;
        zzkiVar.zzG(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzl(int i, long j) {
        zzki zzkiVar;
        zzkiVar = this.zza.zzr;
        zzkiVar.zzH(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzm(Object obj, long j) {
        zzki zzkiVar;
        Object obj2;
        zzdm zzdmVar;
        zzkiVar = this.zza.zzr;
        zzkiVar.zzI(obj, j);
        zzin zzinVar = this.zza;
        obj2 = zzinVar.zzO;
        if (obj2 == obj) {
            zzdmVar = zzinVar.zzl;
            zzdmVar.zzd(26, new zzdj() { // from class: com.google.android.gms.internal.ads.zzid
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj3) {
                }
            });
            zzdmVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznl
    public final void zzn(final boolean z) {
        boolean z2;
        zzdm zzdmVar;
        zzin zzinVar = this.zza;
        z2 = zzinVar.zzY;
        if (z2 == z) {
            return;
        }
        zzinVar.zzY = z;
        zzdmVar = this.zza.zzl;
        zzdmVar.zzd(23, new zzdj() { // from class: com.google.android.gms.internal.ads.zzig
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                boolean z3 = z;
                int i = zzij.zzb;
                ((zzby) obj).zzq(z3);
            }
        });
        zzdmVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzo(Exception exc) {
        zzki zzkiVar;
        zzkiVar = this.zza.zzr;
        zzkiVar.zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzp(String str, long j, long j2) {
        zzki zzkiVar;
        zzkiVar = this.zza.zzr;
        zzkiVar.zzK(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzq(String str) {
        zzki zzkiVar;
        zzkiVar = this.zza.zzr;
        zzkiVar.zzL(str);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzr(zzgm zzgmVar) {
        zzki zzkiVar;
        zzkiVar = this.zza.zzr;
        zzkiVar.zzM(zzgmVar);
        this.zza.zzL = null;
        this.zza.zzT = null;
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzs(zzgm zzgmVar) {
        zzki zzkiVar;
        this.zza.zzT = zzgmVar;
        zzkiVar = this.zza.zzr;
        zzkiVar.zzN(zzgmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzt(long j, int i) {
        zzki zzkiVar;
        zzkiVar = this.zza.zzr;
        zzkiVar.zzO(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzu(zzad zzadVar, zzgn zzgnVar) {
        zzki zzkiVar;
        this.zza.zzL = zzadVar;
        zzkiVar = this.zza.zzr;
        zzkiVar.zzP(zzadVar, zzgnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxr
    public final void zzv(final zzcv zzcvVar) {
        zzdm zzdmVar;
        this.zza.zzad = zzcvVar;
        zzdmVar = this.zza.zzl;
        zzdmVar.zzd(25, new zzdj() { // from class: com.google.android.gms.internal.ads.zzih
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                zzcv zzcvVar2 = zzcv.this;
                int i = zzij.zzb;
                ((zzby) obj).zzu(zzcvVar2);
            }
        });
        zzdmVar.zzc();
    }
}
