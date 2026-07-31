package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes5.dex */
public abstract class zzchl extends TextureView implements zzcii {
    protected final zzchz zza;
    protected final zzcij zzb;

    public zzchl(Context context) {
        super(context);
        this.zza = new zzchz();
        this.zzb = new zzcij(context, this);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.h, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void zzA(int i) {
    }

    public void zzB(int i) {
    }

    public void zzC(int i) {
    }

    public abstract String zza();

    public abstract void zzb(zzchk zzchkVar);

    public abstract void zzc(@Nullable String str);

    public abstract void zzd();

    public abstract void zze();

    public abstract void zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract void zzi(int i);

    public abstract void zzj(float f, float f2);

    public abstract int zzk();

    public abstract int zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract int zzp();

    public abstract void zzq();

    @Nullable
    public Integer zzw() {
        return null;
    }

    public void zzx(@Nullable String str, @Nullable String[] strArr, @Nullable Integer num) {
        zzc(str);
    }

    public void zzy(int i) {
    }

    public void zzz(int i) {
    }
}
