package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public final class zzcix extends zzchl implements TextureView.SurfaceTextureListener, zzchv {
    private final zzcif zzc;
    private final zzcig zzd;
    private final zzcie zze;

    @Nullable
    private final zzeaj zzf;
    private zzchk zzg;
    private Surface zzh;
    private zzchw zzi;
    private String zzj;
    private String[] zzk;
    private boolean zzl;
    private int zzm;
    private zzcid zzn;
    private final boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private float zzt;

    public zzcix(Context context, zzcig zzcigVar, zzcif zzcifVar, boolean z, boolean z2, zzcie zzcieVar, @Nullable zzeaj zzeajVar) {
        super(context);
        this.zzm = 1;
        this.zzc = zzcifVar;
        this.zzd = zzcigVar;
        this.zzo = z;
        this.zze = zzcieVar;
        zzcigVar.zza(this);
        this.zzf = zzeajVar;
    }

    private final boolean zzT() {
        zzchw zzchwVar = this.zzi;
        return (zzchwVar == null || !zzchwVar.zzB() || this.zzl) ? false : true;
    }

    private final boolean zzU() {
        return zzT() && this.zzm != 1;
    }

    private final void zzV(boolean z, @Nullable Integer num) {
        zzchw zzchwVar = this.zzi;
        if (zzchwVar != null && !z) {
            zzchwVar.zzn(num);
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
                zzchwVar.zzw();
                zzW();
            }
        }
        if (this.zzj.startsWith("cache:")) {
            zzcjs zzr = this.zzc.zzr(this.zzj);
            if (zzr instanceof zzckb) {
                zzchw zza = ((zzckb) zzr).zza();
                this.zzi = zza;
                zza.zzn(num);
                if (!this.zzi.zzB()) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzr instanceof zzcjy)) {
                    String valueOf = String.valueOf(this.zzj);
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache miss: ".concat(valueOf));
                    return;
                }
                zzcjy zzcjyVar = (zzcjy) zzr;
                String zzF = zzF();
                ByteBuffer zzu = zzcjyVar.zzu();
                boolean zzt = zzcjyVar.zzt();
                String zzs = zzcjyVar.zzs();
                if (zzs == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Stream cache URL is null.");
                    return;
                } else {
                    zzchw zzE = zzE(num);
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
            zzchw zzchwVar = this.zzi;
            if (zzchwVar != null) {
                zzchwVar.zzs(null);
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
        zzchw zzchwVar = this.zzi;
        if (zzchwVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzchwVar.zzu(surface, z);
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
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcik
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcix.this.zzH();
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
        sb.append(":");
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
        zzchw zzchwVar = this.zzi;
        if (zzchwVar != null) {
            zzchwVar.zzM(true);
        }
    }

    private final void zzad() {
        zzchw zzchwVar = this.zzi;
        if (zzchwVar != null) {
            zzchwVar.zzM(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.h, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // com.google.android.gms.internal.ads.zzchl, android.view.View
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
        zzcid zzcidVar = this.zzn;
        if (zzcidVar != null) {
            zzcidVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzeaj zzeajVar;
        if (this.zzo) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzpc)).booleanValue() && (zzeajVar = this.zzf) != null) {
                zzeai zza = zzeajVar.zza();
                zza.zzc("action", "svp_aepv");
                zza.zzd();
            }
            zzcid zzcidVar = new zzcid(getContext());
            this.zzn = zzcidVar;
            zzcidVar.zzb(surfaceTexture, i, i2);
            zzcid zzcidVar2 = this.zzn;
            zzcidVar2.start();
            SurfaceTexture zze = zzcidVar2.zze();
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
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcir
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcix.this.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzf();
        zzcid zzcidVar = this.zzn;
        if (zzcidVar != null) {
            zzcidVar.zzd();
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
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcit
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcix.this.zzO();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        zzcid zzcidVar = this.zzn;
        if (zzcidVar != null) {
            zzcidVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcis
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcix.this.zzN(i, i2);
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
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcix.this.zzP(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzA(int i) {
        zzchw zzchwVar = this.zzi;
        if (zzchwVar != null) {
            zzchwVar.zzy(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzB(int i) {
        zzchw zzchwVar = this.zzi;
        if (zzchwVar != null) {
            zzchwVar.zzz(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzC(int i) {
        zzchw zzchwVar = this.zzi;
        if (zzchwVar != null) {
            zzchwVar.zzA(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzD() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcim
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcix.this.zzS();
            }
        });
    }

    final zzchw zzE(@Nullable Integer num) {
        zzcie zzcieVar = this.zze;
        zzcif zzcifVar = this.zzc;
        zzcku zzckuVar = new zzcku(zzcifVar.getContext(), zzcieVar, zzcifVar, num);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("ExoPlayerAdapter initialized.");
        return zzckuVar;
    }

    final String zzF() {
        zzcif zzcifVar = this.zzc;
        return com.google.android.gms.ads.internal.zzt.zzc().zze(zzcifVar.getContext(), zzcifVar.zzs().afmaVersion);
    }

    final /* synthetic */ void zzG() {
        float zzc = this.zzb.zzc();
        zzchw zzchwVar = this.zzi;
        if (zzchwVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzchwVar.zzv(zzc, false);
        } catch (IOException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e);
        }
    }

    final /* synthetic */ void zzH() {
        zzchk zzchkVar = this.zzg;
        if (zzchkVar != null) {
            zzchkVar.zzb();
        }
    }

    final /* synthetic */ void zzI() {
        zzchk zzchkVar = this.zzg;
        if (zzchkVar != null) {
            zzchkVar.zze();
        }
    }

    final /* synthetic */ void zzJ(String str) {
        zzchk zzchkVar = this.zzg;
        if (zzchkVar != null) {
            zzchkVar.zzf("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void zzK() {
        zzchk zzchkVar = this.zzg;
        if (zzchkVar != null) {
            zzchkVar.zzc();
        }
    }

    final /* synthetic */ void zzL() {
        zzchk zzchkVar = this.zzg;
        if (zzchkVar != null) {
            zzchkVar.zzd();
        }
    }

    final /* synthetic */ void zzM() {
        zzchk zzchkVar = this.zzg;
        if (zzchkVar != null) {
            zzchkVar.zza();
        }
    }

    final /* synthetic */ void zzN(int i, int i2) {
        zzchk zzchkVar = this.zzg;
        if (zzchkVar != null) {
            zzchkVar.zzj(i, i2);
        }
    }

    final /* synthetic */ void zzO() {
        zzchk zzchkVar = this.zzg;
        if (zzchkVar != null) {
            zzchkVar.zzh();
        }
    }

    final /* synthetic */ void zzP(int i) {
        zzchk zzchkVar = this.zzg;
        if (zzchkVar != null) {
            zzchkVar.onWindowVisibilityChanged(i);
        }
    }

    final /* synthetic */ void zzQ(boolean z, long j) {
        this.zzc.zzu(z, j);
    }

    final /* synthetic */ void zzR(String str) {
        zzchk zzchkVar = this.zzg;
        if (zzchkVar != null) {
            zzchkVar.zzg("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void zzS() {
        zzchk zzchkVar = this.zzg;
        if (zzchkVar != null) {
            zzchkVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final String zza() {
        return "ExoPlayer/2".concat(true != this.zzo ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzb(zzchk zzchkVar) {
        this.zzg = zzchkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzc(@Nullable String str) {
        if (str != null) {
            zzx(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzd() {
        if (zzT()) {
            this.zzi.zzw();
            zzW();
        }
        zzcig zzcigVar = this.zzd;
        zzcigVar.zzf();
        this.zzb.zze();
        zzcigVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzchl
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
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcip
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcix.this.zzK();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzf() {
        if (zzU()) {
            if (this.zze.zza) {
                zzad();
            }
            this.zzi.zzE(false);
            this.zzd.zzf();
            this.zzb.zze();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcix.this.zzL();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int zzg() {
        if (zzU()) {
            return (int) this.zzi.zzH();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int zzh() {
        if (zzU()) {
            return (int) this.zzi.zzD();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzi(int i) {
        if (zzU()) {
            this.zzi.zzx(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzj(float f, float f2) {
        zzcid zzcidVar = this.zzn;
        if (zzcidVar != null) {
            zzcidVar.zzf(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int zzk() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int zzl() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long zzm() {
        zzchw zzchwVar = this.zzi;
        if (zzchwVar != null) {
            return zzchwVar.zzI();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long zzn() {
        zzchw zzchwVar = this.zzi;
        if (zzchwVar != null) {
            return zzchwVar.zzJ();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long zzo() {
        zzchw zzchwVar = this.zzi;
        if (zzchwVar != null) {
            return zzchwVar.zzK();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int zzp() {
        zzchw zzchwVar = this.zzi;
        if (zzchwVar != null) {
            return zzchwVar.zzL();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzchl, com.google.android.gms.internal.ads.zzcii
    public final void zzq() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcix.this.zzG();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzr(final boolean z, final long j) {
        if (this.zzc != null) {
            zzcgj.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzciv
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcix.this.zzQ(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchv
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
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcin
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcix.this.zzI();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzt(int i, int i2) {
        this.zzr = i;
        this.zzs = i2;
        zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzu(String str, Exception exc) {
        final String zzZ = zzZ(str, exc);
        String concat = "ExoPlayerAdapter error: ".concat(zzZ);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
        this.zzl = true;
        if (this.zze.zza) {
            zzad();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcio
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcix.this.zzJ(zzZ);
            }
        });
        com.google.android.gms.ads.internal.zzt.zzh().zzi(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzchv
    public final void zzv(String str, Exception exc) {
        final String zzZ = zzZ("onLoadException", exc);
        String concat = "ExoPlayerAdapter exception: ".concat(zzZ);
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(concat);
        com.google.android.gms.ads.internal.zzt.zzh().zzi(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcil
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcix.this.zzR(zzZ);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    @Nullable
    public final Integer zzw() {
        zzchw zzchwVar = this.zzi;
        if (zzchwVar != null) {
            return zzchwVar.zzj();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzy(int i) {
        zzchw zzchwVar = this.zzi;
        if (zzchwVar != null) {
            zzchwVar.zzF(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzz(int i) {
        zzchw zzchwVar = this.zzi;
        if (zzchwVar != null) {
            zzchwVar.zzG(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzx(@Nullable String str, @Nullable String[] strArr, @Nullable Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzk = new String[]{str};
        } else {
            this.zzk = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzj;
        boolean z = false;
        if (this.zze.zzk && str2 != null && !str.equals(str2) && this.zzm == 4) {
            z = true;
        }
        this.zzj = str;
        zzV(z, num);
    }
}
