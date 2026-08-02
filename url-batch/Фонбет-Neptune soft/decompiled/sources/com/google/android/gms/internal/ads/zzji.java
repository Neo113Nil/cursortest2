package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzji implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzaay, zzpe, zzwl, zztg, zzhk, zzhg {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzjm zza;

    /* synthetic */ zzji(zzjm zzjmVar, zzjh zzjhVar) {
        this.zza = zzjmVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzjm.zzK(this.zza, surfaceTexture);
        this.zza.zzaa(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzad(null);
        this.zza.zzaa(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzaa(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzaa(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzaa(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zza(Exception exc) {
        zzln zzlnVar;
        zzlnVar = this.zza.zzq;
        zzlnVar.zzv(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzb(String str, long j, long j2) {
        zzln zzlnVar;
        zzlnVar = this.zza.zzq;
        zzlnVar.zzw(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzc(String str) {
        zzln zzlnVar;
        zzlnVar = this.zza.zzq;
        zzlnVar.zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzd(zzhn zzhnVar) {
        zzln zzlnVar;
        zzlnVar = this.zza.zzq;
        zzlnVar.zzy(zzhnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zze(zzhn zzhnVar) {
        zzln zzlnVar;
        zzlnVar = this.zza.zzq;
        zzlnVar.zzz(zzhnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzf(zzaf zzafVar, zzho zzhoVar) {
        zzln zzlnVar;
        zzlnVar = this.zza.zzq;
        zzlnVar.zzA(zzafVar, zzhoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzg(long j) {
        zzln zzlnVar;
        zzlnVar = this.zza.zzq;
        zzlnVar.zzB(j);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzh(Exception exc) {
        zzln zzlnVar;
        zzlnVar = this.zza.zzq;
        zzlnVar.zzC(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzi(zzpf zzpfVar) {
        zzln zzlnVar;
        zzlnVar = this.zza.zzq;
        zzlnVar.zzD(zzpfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzj(zzpf zzpfVar) {
        zzln zzlnVar;
        zzlnVar = this.zza.zzq;
        zzlnVar.zzE(zzpfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzk(int i, long j, long j2) {
        zzln zzlnVar;
        zzlnVar = this.zza.zzq;
        zzlnVar.zzF(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzl(int i, long j) {
        zzln zzlnVar;
        zzlnVar = this.zza.zzq;
        zzlnVar.zzG(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzm(Object obj, long j) {
        zzln zzlnVar;
        Object obj2;
        zzdz zzdzVar;
        zzlnVar = this.zza.zzq;
        zzlnVar.zzH(obj, j);
        zzjm zzjmVar = this.zza;
        obj2 = zzjmVar.zzG;
        if (obj2 == obj) {
            zzdzVar = zzjmVar.zzl;
            zzdzVar.zzd(26, new zzdw() { // from class: com.google.android.gms.internal.ads.zzjg
                @Override // com.google.android.gms.internal.ads.zzdw
                public final void zza(Object obj3) {
                }
            });
            zzdzVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpe
    public final void zzn(final boolean z) {
        boolean z2;
        zzdz zzdzVar;
        zzjm zzjmVar = this.zza;
        z2 = zzjmVar.zzN;
        if (z2 == z) {
            return;
        }
        zzjmVar.zzN = z;
        zzdzVar = this.zza.zzl;
        zzdzVar.zzd(23, new zzdw() { // from class: com.google.android.gms.internal.ads.zzje
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                int i = zzji.zzb;
                ((zzbu) obj).zzn(z);
            }
        });
        zzdzVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzo(Exception exc) {
        zzln zzlnVar;
        zzlnVar = this.zza.zzq;
        zzlnVar.zzI(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzp(String str, long j, long j2) {
        zzln zzlnVar;
        zzlnVar = this.zza.zzq;
        zzlnVar.zzJ(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzq(String str) {
        zzln zzlnVar;
        zzlnVar = this.zza.zzq;
        zzlnVar.zzK(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzr(zzhn zzhnVar) {
        zzln zzlnVar;
        zzlnVar = this.zza.zzq;
        zzlnVar.zzL(zzhnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzs(zzhn zzhnVar) {
        zzln zzlnVar;
        zzlnVar = this.zza.zzq;
        zzlnVar.zzM(zzhnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzt(long j, int i) {
        zzln zzlnVar;
        zzlnVar = this.zza.zzq;
        zzlnVar.zzN(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzu(zzaf zzafVar, zzho zzhoVar) {
        zzln zzlnVar;
        zzlnVar = this.zza.zzq;
        zzlnVar.zzO(zzafVar, zzhoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaay
    public final void zzv(final zzcp zzcpVar) {
        zzdz zzdzVar;
        zzdzVar = this.zza.zzl;
        zzdzVar.zzd(25, new zzdw() { // from class: com.google.android.gms.internal.ads.zzjf
            @Override // com.google.android.gms.internal.ads.zzdw
            public final void zza(Object obj) {
                int i = zzji.zzb;
                ((zzbu) obj).zzr(zzcp.this);
            }
        });
        zzdzVar.zzc();
    }
}
