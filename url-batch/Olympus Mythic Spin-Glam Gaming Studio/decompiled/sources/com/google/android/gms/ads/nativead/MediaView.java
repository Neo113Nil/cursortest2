package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbmj;
import com.google.android.gms.internal.ads.zzbnm;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes6.dex */
public class MediaView extends FrameLayout {

    @Nullable
    private MediaContent zza;
    private boolean zzb;
    private zzbmh zzc;
    private ImageView.ScaleType zzd;
    private boolean zze;
    private zzbmj zzf;

    public MediaView(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.h, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public MediaContent getMediaContent() {
        return this.zza;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setImageScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.zze = true;
        this.zzd = scaleType;
        zzbmj zzbmjVar = this.zzf;
        if (zzbmjVar != null) {
            zzbmjVar.zza(scaleType);
        }
    }

    public void setMediaContent(@Nullable MediaContent mediaContent) {
        boolean zzt;
        this.zzb = true;
        this.zza = mediaContent;
        zzbmh zzbmhVar = this.zzc;
        if (zzbmhVar != null) {
            zzbmhVar.zza(mediaContent);
        }
        if (mediaContent == null) {
            return;
        }
        try {
            zzbnm zzb = mediaContent.zzb();
            if (zzb != null) {
                if (!mediaContent.hasVideoContent()) {
                    if (mediaContent.zza()) {
                        zzt = zzb.zzt(ObjectWrapper.wrap(this));
                    }
                    removeAllViews();
                }
                zzt = zzb.zzn(ObjectWrapper.wrap(this));
                if (zzt) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e) {
            removeAllViews();
            zzo.zzg("", e);
        }
    }

    protected final synchronized void zza(zzbmh zzbmhVar) {
        this.zzc = zzbmhVar;
        if (this.zzb) {
            zzbmhVar.zza(this.zza);
        }
    }

    protected final synchronized void zzb(zzbmj zzbmjVar) {
        this.zzf = zzbmjVar;
        if (this.zze) {
            zzbmjVar.zza(this.zzd);
        }
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
