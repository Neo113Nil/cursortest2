package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.revenuecat.purchases.common.Constants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes5.dex */
public final class zzcbv extends zzcaj implements TextureView.SurfaceTextureListener, zzcat {
    private final zzcbd zzc;
    private final zzcbe zzd;
    private final zzcbc zze;
    private final zzdsm zzf;
    private zzcai zzg;
    private Surface zzh;
    private zzcau zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm;
    private zzcbb zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    public zzcbv(Context context, zzcbe zzcbeVar, zzcbd zzcbdVar, boolean z, boolean z2, zzcbc zzcbcVar, zzdsm zzdsmVar) {
        super(context);
        this.zzm = 1;
        this.zzc = zzcbdVar;
        this.zzd = zzcbeVar;
        this.zzo = z;
        this.zze = zzcbcVar;
        zzcbeVar.zza(this);
        this.zzf = zzdsmVar;
    }

    private final boolean zzT() {
        zzcau zzcauVar = this.zzi;
        return (zzcauVar == null || !zzcauVar.zzB() || this.zzl) ? false : true;
    }

    private final boolean zzU() {
        return zzT() && this.zzm != 1;
    }

    private final void zzV(boolean z, Integer num) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null && !z) {
            zzcauVar.zzn(num);
            return;
        }
        if (this.zzj == null || this.zzh == null) {
            return;
        }
        if (z) {
            if (!zzT()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzcauVar.zzw();
                zzW();
            }
        }
        if (this.zzj.startsWith("cache:")) {
            zzccq zzr = this.zzc.zzr(this.zzj);
            if (zzr instanceof zzccz) {
                zzcau zza = ((zzccz) zzr).zza();
                this.zzi = zza;
                zza.zzn(num);
                if (!this.zzi.zzB()) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzr instanceof zzccw)) {
                    String str = this.zzj;
                    String.valueOf(str);
                    String valueOf = String.valueOf(str);
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache miss: ".concat(valueOf));
                    return;
                }
                zzccw zzccwVar = (zzccw) zzr;
                String zzF = zzF();
                ByteBuffer zzu = zzccwVar.zzu();
                boolean zzt = zzccwVar.zzt();
                String zzs = zzccwVar.zzs();
                if (zzs == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache URL is null.");
                    return;
                } else {
                    zzcau zzE = zzE(num);
                    this.zzi = zzE;
                    zzE.zzr(new Uri[]{Uri.parse(zzs)}, zzF, zzu, zzt);
                }
            }
        } else {
            this.zzi = zzE(num);
            String zzF2 = zzF();
            Uri[] uriArr = new Uri[this.zzk.length];
            int i5 = 0;
            while (true) {
                String[] strArr = this.zzk;
                if (i5 >= strArr.length) {
                    break;
                }
                uriArr[i5] = Uri.parse(strArr[i5]);
                i5++;
            }
            this.zzi.zzq(uriArr, zzF2);
        }
        this.zzi.zzs(this);
        zzX(this.zzh, false);
        if (this.zzi.zzB()) {
            int zzC = this.zzi.zzC();
            this.zzm = zzC;
            if (zzC == 3) {
                zzY();
            }
        }
    }

    private final void zzW() {
        if (this.zzi != null) {
            zzX(null, true);
            zzcau zzcauVar = this.zzi;
            if (zzcauVar != null) {
                zzcauVar.zzs(null);
                this.zzi.zzt();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzX(Surface surface, boolean z) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcauVar.zzu(surface, z);
        } catch (IOException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
        }
    }

    private final void zzY() {
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcbv.this.zzH();
            }
        });
        zzq();
        this.zzd.zzb();
        if (this.zzq) {
            zze();
        }
    }

    private static String zzZ(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        sb.append(message);
        return sb.toString();
    }

    private final void zzaa() {
        zzab(this.zzr, this.zzs);
    }

    private final void zzab(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.zzt != f) {
            this.zzt = f;
            requestLayout();
        }
    }

    private final void zzac() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzM(true);
        }
    }

    private final void zzad() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzM(false);
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzt;
        if (f != 0.0f && this.zzn == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcbb zzcbbVar = this.zzn;
        if (zzcbbVar != null) {
            zzcbbVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzdsm zzdsmVar;
        if (this.zzo) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoc)).booleanValue() && (zzdsmVar = this.zzf) != null) {
                zzdsl zza = zzdsmVar.zza();
                zza.zzc("action", "svp_aepv");
                zza.zzd();
            }
            zzcbb zzcbbVar = new zzcbb(getContext());
            this.zzn = zzcbbVar;
            zzcbbVar.zzb(surfaceTexture, i, i2);
            zzcbb zzcbbVar2 = this.zzn;
            zzcbbVar2.start();
            SurfaceTexture zze = zzcbbVar2.zze();
            if (zze != null) {
                surfaceTexture = zze;
            } else {
                this.zzn.zzd();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzV(false, null);
        } else {
            zzX(surface, true);
            if (!this.zze.zza) {
                zzac();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzab(i, i2);
        } else {
            zzaa();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcbv.this.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzf();
        zzcbb zzcbbVar = this.zzn;
        if (zzcbbVar != null) {
            zzcbbVar.zzd();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzad();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzX(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcbv.this.zzO();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        zzcbb zzcbbVar = this.zzn;
        if (zzcbbVar != null) {
            zzcbbVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcbv.this.zzN(i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzd(this);
        this.zza.zzb(surfaceTexture, this.zzg);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 46);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcbv.this.zzP(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzA(int i) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzy(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzB(int i) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzz(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzC(int i) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzA(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzD() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcbv.this.zzS();
            }
        });
    }

    final zzcau zzE(Integer num) {
        zzcbc zzcbcVar = this.zze;
        zzcbd zzcbdVar = this.zzc;
        zzcds zzcdsVar = new zzcds(zzcbdVar.getContext(), zzcbcVar, zzcbdVar, num);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        return zzcdsVar;
    }

    final String zzF() {
        zzcbd zzcbdVar = this.zzc;
        return com.google.android.gms.ads.internal.zzt.zzc().zze(zzcbdVar.getContext(), zzcbdVar.zzs().afmaVersion);
    }

    final /* synthetic */ void zzG() {
        float zzc = this.zzb.zzc();
        zzcau zzcauVar = this.zzi;
        if (zzcauVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcauVar.zzv(zzc, false);
        } catch (IOException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
        }
    }

    final /* synthetic */ void zzH() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzb();
        }
    }

    final /* synthetic */ void zzI() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zze();
        }
    }

    final /* synthetic */ void zzJ(String str) {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzf("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void zzK() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzc();
        }
    }

    final /* synthetic */ void zzL() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzd();
        }
    }

    final /* synthetic */ void zzM() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zza();
        }
    }

    final /* synthetic */ void zzN(int i, int i2) {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzj(i, i2);
        }
    }

    final /* synthetic */ void zzO() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzh();
        }
    }

    final /* synthetic */ void zzP(int i) {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.onWindowVisibilityChanged(i);
        }
    }

    final /* synthetic */ void zzQ(boolean z, long j) {
        this.zzc.zzu(z, j);
    }

    final /* synthetic */ void zzR(String str) {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzg("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void zzS() {
        zzcai zzcaiVar = this.zzg;
        if (zzcaiVar != null) {
            zzcaiVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final String zza() {
        return "ExoPlayer/2".concat(true != this.zzo ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzb(zzcai zzcaiVar) {
        this.zzg = zzcaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzc(String str) {
        if (str != null) {
            zzx(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzd() {
        if (zzT()) {
            this.zzi.zzw();
            zzW();
        }
        zzcbe zzcbeVar = this.zzd;
        zzcbeVar.zzf();
        this.zzb.zze();
        zzcbeVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zze() {
        if (!zzU()) {
            this.zzq = true;
            return;
        }
        if (this.zze.zza) {
            zzac();
        }
        this.zzi.zzE(true);
        this.zzd.zze();
        this.zzb.zzd();
        this.zza.zza();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcbv.this.zzK();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzf() {
        if (zzU()) {
            if (this.zze.zza) {
                zzad();
            }
            this.zzi.zzE(false);
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcbv.this.zzL();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzg() {
        if (zzU()) {
            return (int) this.zzi.zzH();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzh() {
        if (zzU()) {
            return (int) this.zzi.zzD();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzi(int i) {
        if (zzU()) {
            this.zzi.zzx(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzj(float f, float f2) {
        zzcbb zzcbbVar = this.zzn;
        if (zzcbbVar != null) {
            zzcbbVar.zzf(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzk() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final long zzm() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            return zzcauVar.zzI();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final long zzn() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            return zzcauVar.zzJ();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final long zzo() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            return zzcauVar.zzK();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final int zzp() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            return zzcauVar.zzL();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj, com.google.android.gms.internal.ads.zzcbg
    public final void zzq() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcbv.this.zzG();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzr(final boolean z, final long j) {
        if (this.zzc != null) {
            zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcbv.this.zzQ(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzs(int i) {
        if (this.zzm != i) {
            this.zzm = i;
            if (i == 3) {
                zzY();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.zze.zza) {
                zzad();
            }
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbl
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcbv.this.zzI();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzt(int i, int i2) {
        this.zzr = i;
        this.zzs = i2;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzu(String str, Exception exc) {
        final String zzZ = zzZ(str, exc);
        String concat = "ExoPlayerAdapter error: ".concat(zzZ);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
        this.zzl = true;
        if (this.zze.zza) {
            zzad();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbm
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcbv.this.zzJ(zzZ);
            }
        });
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcat
    public final void zzv(String str, Exception exc) {
        final String zzZ = zzZ("onLoadException", exc);
        String concat = "ExoPlayerAdapter exception: ".concat(zzZ);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
        com.google.android.gms.ads.internal.zzt.zzh().zzh(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcbv.this.zzR(zzZ);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final Integer zzw() {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            return zzcauVar.zzj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzy(int i) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzF(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzz(int i) {
        zzcau zzcauVar = this.zzi;
        if (zzcauVar != null) {
            zzcauVar.zzG(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final void zzx(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzk = new String[]{str};
        } else {
            this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzj;
        boolean z = this.zze.zzk && str2 != null && !str.equals(str2) && this.zzm == 4;
        this.zzj = str;
        zzV(z, num);
    }
}
