package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes3.dex */
public final class zzclb extends zzchl {
    private final zzcig zzc;

    @Nullable
    private zzclc zzd;
    private Uri zze;
    private zzchk zzf;
    private boolean zzg;
    private int zzh;

    public zzclb(Context context, zzcig zzcigVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzcigVar;
        zzcigVar.zza(this);
    }

    private final boolean zzu() {
        int i = this.zzh;
        return (i == 1 || i == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i) {
        if (i == 4) {
            this.zzc.zze();
            this.zzb.zzd();
        } else if (this.zzh == 4) {
            this.zzc.zzf();
            this.zzb.zze();
        }
        this.zzh = i;
    }

    @Override // com.google.android.gms.internal.ads.zzchl, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.h, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.google.android.gms.internal.ads.zzchl, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzclb.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final String zza() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzb(zzchk zzchkVar) {
        this.zzf = zzchkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzc(@Nullable String str) {
        if (str != null) {
            Uri parse = Uri.parse(str);
            this.zze = parse;
            this.zzd = new zzclc(parse.toString());
            zzv(3);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcla
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzclb.this.zzr();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzd() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView stop");
        zzclc zzclcVar = this.zzd;
        if (zzclcVar != null) {
            zzclcVar.zzd();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zze() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView play");
        if (zzu()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zza();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcky
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzclb.this.zzs();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzf() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView pause");
        if (zzu() && this.zzd.zza()) {
            this.zzd.zzc();
            zzv(5);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzclb.this.zzt();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int zzg() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int zzh() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzi(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("AdImmersivePlayerView seek ");
        sb.append(i);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final void zzj(float f, float f2) {
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int zzk() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int zzl() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long zzm() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long zzn() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final long zzo() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzchl
    public final int zzp() {
        return zzu() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzchl, com.google.android.gms.internal.ads.zzcii
    public final void zzq() {
        if (this.zzd != null) {
            this.zzb.zzc();
        }
    }

    final /* synthetic */ void zzr() {
        zzchk zzchkVar = this.zzf;
        if (zzchkVar != null) {
            zzchkVar.zzb();
        }
    }

    final /* synthetic */ void zzs() {
        zzchk zzchkVar = this.zzf;
        if (zzchkVar != null) {
            if (!this.zzg) {
                zzchkVar.zzk();
                this.zzg = true;
            }
            this.zzf.zzc();
        }
    }

    final /* synthetic */ void zzt() {
        zzchk zzchkVar = this.zzf;
        if (zzchkVar != null) {
            zzchkVar.zzd();
        }
    }
}
