package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
final class zzip implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzyd, zzns, zzuj, zzri, zzgp, zzgl, zzkh, zzhb {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzit zza;

    /* synthetic */ zzip(zzit zzitVar, zzio zzioVar) {
        this.zza = zzitVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzit.zzN(this.zza, surfaceTexture);
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

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zza(boolean z) {
        this.zza.zzaw();
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final void zzb(Exception exc) {
        zzko zzkoVar;
        zzkoVar = this.zza.zzr;
        zzkoVar.zzy(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final void zzc(String str, long j, long j2) {
        zzko zzkoVar;
        zzkoVar = this.zza.zzr;
        zzkoVar.zzz(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final void zzd(String str) {
        zzko zzkoVar;
        zzkoVar = this.zza.zzr;
        zzkoVar.zzA(str);
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final void zze(zzgs zzgsVar) {
        zzko zzkoVar;
        zzkoVar = this.zza.zzr;
        zzkoVar.zzB(zzgsVar);
        this.zza.zzM = null;
        this.zza.zzU = null;
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final void zzf(zzgs zzgsVar) {
        zzko zzkoVar;
        this.zza.zzU = zzgsVar;
        zzkoVar = this.zza.zzr;
        zzkoVar.zzC(zzgsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final void zzg(zzaf zzafVar, zzgt zzgtVar) {
        zzko zzkoVar;
        this.zza.zzM = zzafVar;
        zzkoVar = this.zza.zzr;
        zzkoVar.zzD(zzafVar, zzgtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final void zzh(long j) {
        zzko zzkoVar;
        zzkoVar = this.zza.zzr;
        zzkoVar.zzE(j);
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final void zzi(Exception exc) {
        zzko zzkoVar;
        zzkoVar = this.zza.zzr;
        zzkoVar.zzF(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final void zzj(int i, long j, long j2) {
        zzko zzkoVar;
        zzkoVar = this.zza.zzr;
        zzkoVar.zzG(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zzk(int i, long j) {
        zzko zzkoVar;
        zzkoVar = this.zza.zzr;
        zzkoVar.zzH(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zzl(Object obj, long j) {
        zzko zzkoVar;
        Object obj2;
        zzdt zzdtVar;
        zzkoVar = this.zza.zzr;
        zzkoVar.zzI(obj, j);
        zzit zzitVar = this.zza;
        obj2 = zzitVar.zzO;
        if (obj2 == obj) {
            zzdtVar = zzitVar.zzl;
            zzdtVar.zzd(26, new zzdq() { // from class: com.google.android.gms.internal.ads.zzij
                @Override // com.google.android.gms.internal.ads.zzdq
                public final void zza(Object obj3) {
                }
            });
            zzdtVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzns
    public final void zzm(final boolean z) {
        boolean z2;
        zzdt zzdtVar;
        zzit zzitVar = this.zza;
        z2 = zzitVar.zzY;
        if (z2 == z) {
            return;
        }
        zzitVar.zzY = z;
        zzdtVar = this.zza.zzl;
        zzdtVar.zzd(23, new zzdq() { // from class: com.google.android.gms.internal.ads.zzim
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                boolean z3 = z;
                int i = zzip.zzb;
                ((zzcd) obj).zzq(z3);
            }
        });
        zzdtVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zzn(Exception exc) {
        zzko zzkoVar;
        zzkoVar = this.zza.zzr;
        zzkoVar.zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zzo(String str, long j, long j2) {
        zzko zzkoVar;
        zzkoVar = this.zza.zzr;
        zzkoVar.zzK(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zzp(String str) {
        zzko zzkoVar;
        zzkoVar = this.zza.zzr;
        zzkoVar.zzL(str);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zzq(zzgs zzgsVar) {
        zzko zzkoVar;
        zzkoVar = this.zza.zzr;
        zzkoVar.zzM(zzgsVar);
        this.zza.zzL = null;
        this.zza.zzT = null;
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zzr(zzgs zzgsVar) {
        zzko zzkoVar;
        this.zza.zzT = zzgsVar;
        zzkoVar = this.zza.zzr;
        zzkoVar.zzN(zzgsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zzs(long j, int i) {
        zzko zzkoVar;
        zzkoVar = this.zza.zzr;
        zzkoVar.zzO(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zzt(zzaf zzafVar, zzgt zzgtVar) {
        zzko zzkoVar;
        this.zza.zzL = zzafVar;
        zzkoVar = this.zza.zzr;
        zzkoVar.zzP(zzafVar, zzgtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyd
    public final void zzu(final zzda zzdaVar) {
        zzdt zzdtVar;
        this.zza.zzad = zzdaVar;
        zzdtVar = this.zza.zzl;
        zzdtVar.zzd(25, new zzdq() { // from class: com.google.android.gms.internal.ads.zzin
            @Override // com.google.android.gms.internal.ads.zzdq
            public final void zza(Object obj) {
                zzda zzdaVar2 = zzda.this;
                int i = zzip.zzb;
                ((zzcd) obj).zzu(zzdaVar2);
            }
        });
        zzdtVar.zzc();
    }
}
