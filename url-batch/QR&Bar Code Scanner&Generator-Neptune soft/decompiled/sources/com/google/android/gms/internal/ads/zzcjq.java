package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
/* loaded from: classes2.dex */
public final class zzcjq extends zzcie implements TextureView.SurfaceTextureListener, zzcio {
    private final zzciy zzd;
    private final zzciz zze;
    private final zzcix zzf;
    private zzcid zzg;
    private Surface zzh;
    private zzcip zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm;
    private zzciw zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    public zzcjq(Context context, zzciz zzcizVar, zzciy zzciyVar, boolean z, boolean z2, zzcix zzcixVar, Integer num) {
        super(context, num);
        this.zzm = 1;
        this.zzd = zzciyVar;
        this.zze = zzcizVar;
        this.zzo = z;
        this.zzf = zzcixVar;
        setSurfaceTextureListener(this);
        zzcizVar.zza(this);
    }

    private static String zzS(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzT() {
        zzcip zzcipVar = this.zzi;
        if (zzcipVar != null) {
            zzcipVar.zzM(true);
        }
    }

    private final void zzU() {
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjk
            @Override // java.lang.Runnable
            public final void run() {
                zzcjq.this.zzH();
            }
        });
        zzn();
        this.zze.zzb();
        if (this.zzq) {
            zzp();
        }
    }

    private final void zzV(boolean z) {
        zzcip zzcipVar = this.zzi;
        if ((zzcipVar != null && !z) || this.zzj == null || this.zzh == null) {
            return;
        }
        if (z) {
            if (!zzad()) {
                com.google.android.gms.ads.internal.util.zze.zzj("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzcipVar.zzQ();
                zzX();
            }
        }
        if (this.zzj.startsWith("cache:")) {
            zzclb zzr = this.zzd.zzr(this.zzj);
            if (zzr instanceof zzclk) {
                zzcip zzj = ((zzclk) zzr).zzj();
                this.zzi = zzj;
                if (!zzj.zzR()) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzr instanceof zzclh)) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Stream cache miss: ".concat(String.valueOf(this.zzj)));
                    return;
                }
                zzclh zzclhVar = (zzclh) zzr;
                String zzE = zzE();
                ByteBuffer zzl = zzclhVar.zzl();
                boolean zzm = zzclhVar.zzm();
                String zzi = zzclhVar.zzi();
                if (zzi == null) {
                    com.google.android.gms.ads.internal.util.zze.zzj("Stream cache URL is null.");
                    return;
                } else {
                    zzcip zzD = zzD();
                    this.zzi = zzD;
                    zzD.zzD(new Uri[]{Uri.parse(zzi)}, zzE, zzl, zzm);
                }
            }
        } else {
            this.zzi = zzD();
            String zzE2 = zzE();
            Uri[] uriArr = new Uri[this.zzk.length];
            int i = 0;
            while (true) {
                String[] strArr = this.zzk;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            this.zzi.zzC(uriArr, zzE2);
        }
        this.zzi.zzI(this);
        zzZ(this.zzh, false);
        if (this.zzi.zzR()) {
            int zzt = this.zzi.zzt();
            this.zzm = zzt;
            if (zzt == 3) {
                zzU();
            }
        }
    }

    private final void zzW() {
        zzcip zzcipVar = this.zzi;
        if (zzcipVar != null) {
            zzcipVar.zzM(false);
        }
    }

    private final void zzX() {
        if (this.zzi != null) {
            zzZ(null, true);
            zzcip zzcipVar = this.zzi;
            if (zzcipVar != null) {
                zzcipVar.zzI(null);
                this.zzi.zzE();
                this.zzi = null;
            }
            this.zzm = 1;
            this.zzl = false;
            this.zzp = false;
            this.zzq = false;
        }
    }

    private final void zzY(float f, boolean z) {
        zzcip zzcipVar = this.zzi;
        if (zzcipVar == null) {
            com.google.android.gms.ads.internal.util.zze.zzj("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcipVar.zzP(f, false);
        } catch (IOException e) {
            zzcgp.zzk("", e);
        }
    }

    private final void zzZ(Surface surface, boolean z) {
        zzcip zzcipVar = this.zzi;
        if (zzcipVar == null) {
            com.google.android.gms.ads.internal.util.zze.zzj("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcipVar.zzO(surface, z);
        } catch (IOException e) {
            zzcgp.zzk("", e);
        }
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

    private final boolean zzac() {
        return zzad() && this.zzm != 1;
    }

    private final boolean zzad() {
        zzcip zzcipVar = this.zzi;
        return (zzcipVar == null || !zzcipVar.zzR() || this.zzl) ? false : true;
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
        zzciw zzciwVar = this.zzn;
        if (zzciwVar != null) {
            zzciwVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.zzo) {
            zzciw zzciwVar = new zzciw(getContext());
            this.zzn = zzciwVar;
            zzciwVar.zzd(surfaceTexture, i, i2);
            this.zzn.start();
            SurfaceTexture zzb = this.zzn.zzb();
            if (zzb != null) {
                surfaceTexture = zzb;
            } else {
                this.zzn.zze();
                this.zzn = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzh = surface;
        if (this.zzi == null) {
            zzV(false);
        } else {
            zzZ(surface, true);
            if (!this.zzf.zza) {
                zzT();
            }
        }
        if (this.zzr == 0 || this.zzs == 0) {
            zzab(i, i2);
        } else {
            zzaa();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjl
            @Override // java.lang.Runnable
            public final void run() {
                zzcjq.this.zzL();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzciw zzciwVar = this.zzn;
        if (zzciwVar != null) {
            zzciwVar.zze();
            this.zzn = null;
        }
        if (this.zzi != null) {
            zzW();
            Surface surface = this.zzh;
            if (surface != null) {
                surface.release();
            }
            this.zzh = null;
            zzZ(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjo
            @Override // java.lang.Runnable
            public final void run() {
                zzcjq.this.zzM();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        zzciw zzciwVar = this.zzn;
        if (zzciwVar != null) {
            zzciwVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjn
            @Override // java.lang.Runnable
            public final void run() {
                zzcjq.this.zzN(i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zze.zzf(this);
        this.zza.zza(surfaceTexture, this.zzg);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdExoPlayerView3 window visibility changed to " + i);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjm
            @Override // java.lang.Runnable
            public final void run() {
                zzcjq.this.zzP(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final void zzA(int i) {
        zzcip zzcipVar = this.zzi;
        if (zzcipVar != null) {
            zzcipVar.zzN(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final void zzC(int i, int i2) {
        this.zzr = i;
        this.zzs = i2;
        zzaa();
    }

    final zzcip zzD() {
        return this.zzf.zzm ? new zzcmc(this.zzd.getContext(), this.zzf, this.zzd) : new zzckg(this.zzd.getContext(), this.zzf, this.zzd);
    }

    final String zzE() {
        return com.google.android.gms.ads.internal.zzt.zzp().zzc(this.zzd.getContext(), this.zzd.zzp().zza);
    }

    final /* synthetic */ void zzF(String str) {
        zzcid zzcidVar = this.zzg;
        if (zzcidVar != null) {
            zzcidVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void zzG() {
        zzcid zzcidVar = this.zzg;
        if (zzcidVar != null) {
            zzcidVar.zza();
        }
    }

    final /* synthetic */ void zzH() {
        zzcid zzcidVar = this.zzg;
        if (zzcidVar != null) {
            zzcidVar.zzf();
        }
    }

    final /* synthetic */ void zzI(boolean z, long j) {
        this.zzd.zzx(z, j);
    }

    final /* synthetic */ void zzJ(String str) {
        zzcid zzcidVar = this.zzg;
        if (zzcidVar != null) {
            zzcidVar.zzc("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void zzK() {
        zzcid zzcidVar = this.zzg;
        if (zzcidVar != null) {
            zzcidVar.zzg();
        }
    }

    final /* synthetic */ void zzL() {
        zzcid zzcidVar = this.zzg;
        if (zzcidVar != null) {
            zzcidVar.zzh();
        }
    }

    final /* synthetic */ void zzM() {
        zzcid zzcidVar = this.zzg;
        if (zzcidVar != null) {
            zzcidVar.zzi();
        }
    }

    final /* synthetic */ void zzN(int i, int i2) {
        zzcid zzcidVar = this.zzg;
        if (zzcidVar != null) {
            zzcidVar.zzj(i, i2);
        }
    }

    final /* synthetic */ void zzO() {
        zzY(this.zzb.zza(), false);
    }

    final /* synthetic */ void zzP(int i) {
        zzcid zzcidVar = this.zzg;
        if (zzcidVar != null) {
            zzcidVar.onWindowVisibilityChanged(i);
        }
    }

    final /* synthetic */ void zzQ() {
        zzcid zzcidVar = this.zzg;
        if (zzcidVar != null) {
            zzcidVar.zzd();
        }
    }

    final /* synthetic */ void zzR() {
        zzcid zzcidVar = this.zzg;
        if (zzcidVar != null) {
            zzcidVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final int zza() {
        if (zzac()) {
            return (int) this.zzi.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final int zzb() {
        zzcip zzcipVar = this.zzi;
        if (zzcipVar != null) {
            return zzcipVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final int zzc() {
        if (zzac()) {
            return (int) this.zzi.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final int zzd() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final int zze() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final long zzf() {
        zzcip zzcipVar = this.zzi;
        if (zzcipVar != null) {
            return zzcipVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final long zzg() {
        zzcip zzcipVar = this.zzi;
        if (zzcipVar != null) {
            return zzcipVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final long zzh() {
        zzcip zzcipVar = this.zzi;
        if (zzcipVar != null) {
            return zzcipVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final void zzi(final boolean z, final long j) {
        if (this.zzd != null) {
            zzchc.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjd
                @Override // java.lang.Runnable
                public final void run() {
                    zzcjq.this.zzI(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final String zzj() {
        return "ExoPlayer/3".concat(true != this.zzo ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final void zzk(String str, Exception exc) {
        final String zzS = zzS(str, exc);
        com.google.android.gms.ads.internal.util.zze.zzj("ExoPlayerAdapter error: ".concat(zzS));
        this.zzl = true;
        if (this.zzf.zza) {
            zzW();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjg
            @Override // java.lang.Runnable
            public final void run() {
                zzcjq.this.zzF(zzS);
            }
        });
        com.google.android.gms.ads.internal.zzt.zzo().zzs(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final void zzl(String str, Exception exc) {
        final String zzS = zzS("onLoadException", exc);
        com.google.android.gms.ads.internal.util.zze.zzj("ExoPlayerAdapter exception: ".concat(zzS));
        com.google.android.gms.ads.internal.zzt.zzo().zzs(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjf
            @Override // java.lang.Runnable
            public final void run() {
                zzcjq.this.zzJ(zzS);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final void zzm(int i) {
        if (this.zzm != i) {
            this.zzm = i;
            if (i == 3) {
                zzU();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.zzf.zza) {
                zzW();
            }
            this.zze.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcje
                @Override // java.lang.Runnable
                public final void run() {
                    zzcjq.this.zzG();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcie, com.google.android.gms.internal.ads.zzcjb
    public final void zzn() {
        if (this.zzf.zzm) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcji
                @Override // java.lang.Runnable
                public final void run() {
                    zzcjq.this.zzO();
                }
            });
        } else {
            zzY(this.zzb.zza(), false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final void zzo() {
        if (zzac()) {
            if (this.zzf.zza) {
                zzW();
            }
            this.zzi.zzL(false);
            this.zze.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjj
                @Override // java.lang.Runnable
                public final void run() {
                    zzcjq.this.zzQ();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final void zzp() {
        if (!zzac()) {
            this.zzq = true;
            return;
        }
        if (this.zzf.zza) {
            zzT();
        }
        this.zzi.zzL(true);
        this.zze.zzc();
        this.zzb.zzb();
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
            @Override // java.lang.Runnable
            public final void run() {
                zzcjq.this.zzR();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final void zzq(int i) {
        if (zzac()) {
            this.zzi.zzF(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final void zzr(zzcid zzcidVar) {
        this.zzg = zzcidVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final void zzs(String str) {
        if (str != null) {
            zzB(str, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final void zzt() {
        if (zzad()) {
            this.zzi.zzQ();
            zzX();
        }
        this.zze.zze();
        this.zzb.zzc();
        this.zze.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final void zzu(float f, float f2) {
        zzciw zzciwVar = this.zzn;
        if (zzciwVar != null) {
            zzciwVar.zzf(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final void zzv() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjh
            @Override // java.lang.Runnable
            public final void run() {
                zzcjq.this.zzK();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final void zzw(int i) {
        zzcip zzcipVar = this.zzi;
        if (zzcipVar != null) {
            zzcipVar.zzG(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final void zzx(int i) {
        zzcip zzcipVar = this.zzi;
        if (zzcipVar != null) {
            zzcipVar.zzH(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final void zzy(int i) {
        zzcip zzcipVar = this.zzi;
        if (zzcipVar != null) {
            zzcipVar.zzJ(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final void zzz(int i) {
        zzcip zzcipVar = this.zzi;
        if (zzcipVar != null) {
            zzcipVar.zzK(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcie
    public final void zzB(String str, String[] strArr) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzk = new String[]{str};
        } else {
            this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzj;
        boolean z = this.zzf.zzn && str2 != null && !str.equals(str2) && this.zzm == 4;
        this.zzj = str;
        zzV(z);
    }
}
