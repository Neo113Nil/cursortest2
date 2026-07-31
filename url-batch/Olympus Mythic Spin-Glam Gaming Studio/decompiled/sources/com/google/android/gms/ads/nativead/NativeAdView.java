package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzfb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbmj;
import com.google.android.gms.internal.ads.zzbmz;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes10.dex */
public final class NativeAdView extends FrameLayout {
    private final FrameLayout zza;

    @Nullable
    private final zzbmz zzb;

    public NativeAdView(@NonNull Context context) {
        super(context);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    private final void zzd(String str, @Nullable View view) {
        zzbmz zzbmzVar = this.zzb;
        if (zzbmzVar == null) {
            return;
        }
        try {
            zzbmzVar.zza(str, ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzo.zzg("Unable to call setAssetView on delegate", e);
        }
    }

    private final FrameLayout zze(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    @Nullable
    private final zzbmz zzf() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.zza;
        return zzay.zzb().zze(frameLayout.getContext(), this, frameLayout);
    }

    @Override // android.view.ViewGroup
    public final void addView(@NonNull View view, int i, @NonNull ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(@NonNull View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.zza;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public void destroy() {
        zzbmz zzbmzVar = this.zzb;
        if (zzbmzVar == null) {
            return;
        }
        try {
            zzbmzVar.zzd();
        } catch (RemoteException e) {
            zzo.zzg("Unable to destroy native ad view", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/ads/nativead/NativeAdView;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(h.h, this, motionEvent);
        return safedk_NativeAdView_dispatchTouchEvent_c091b7c3fd67ff5951c333eacf8b784c(motionEvent);
    }

    @Nullable
    public AdChoicesView getAdChoicesView() {
        View zza = zza("3011");
        if (zza instanceof AdChoicesView) {
            return (AdChoicesView) zza;
        }
        return null;
    }

    @Nullable
    public final View getAdvertiserView() {
        return zza("3005");
    }

    @Nullable
    public final View getBodyView() {
        return zza("3004");
    }

    @Nullable
    public final View getCallToActionView() {
        return zza("3002");
    }

    @Nullable
    public final View getHeadlineView() {
        return zza("3001");
    }

    @Nullable
    public final View getIconView() {
        return zza("3003");
    }

    @Nullable
    public final View getImageView() {
        return zza("3008");
    }

    @Nullable
    public final MediaView getMediaView() {
        View zza = zza("3010");
        if (zza instanceof MediaView) {
            return (MediaView) zza;
        }
        if (zza == null) {
            return null;
        }
        zzo.zzd("View is not an instance of MediaView");
        return null;
    }

    @Nullable
    public final View getPriceView() {
        return zza("3007");
    }

    @Nullable
    public final View getStarRatingView() {
        return zza("3009");
    }

    @Nullable
    public final View getStoreView() {
        return zza("3006");
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        zzbmz zzbmzVar = this.zzb;
        if (zzbmzVar == null) {
            return;
        }
        try {
            zzbmzVar.zze(ObjectWrapper.wrap(view), i);
        } catch (RemoteException e) {
            zzo.zzg("Unable to call onVisibilityChanged on delegate", e);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.zza);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(@NonNull View view) {
        if (this.zza == view) {
            return;
        }
        super.removeView(view);
    }

    public boolean safedk_NativeAdView_dispatchTouchEvent_c091b7c3fd67ff5951c333eacf8b784c(MotionEvent p0) {
        zzbmz zzbmzVar = this.zzb;
        if (zzbmzVar != null) {
            if (((Boolean) zzba.zzc().zzd(zzbjg.zznj)).booleanValue()) {
                try {
                    zzbmzVar.zzdD(ObjectWrapper.wrap(p0));
                } catch (RemoteException e) {
                    zzo.zzg("Unable to call handleTouchEvent on delegate", e);
                }
            }
        }
        return super.dispatchTouchEvent(p0);
    }

    public void setAdChoicesView(@Nullable AdChoicesView adChoicesView) {
        zzd("3011", adChoicesView);
    }

    public final void setAdvertiserView(@Nullable View view) {
        zzd("3005", view);
    }

    public final void setBodyView(@Nullable View view) {
        zzd("3004", view);
    }

    public final void setCallToActionView(@Nullable View view) {
        zzd("3002", view);
    }

    public final void setClickConfirmingView(@Nullable View view) {
        zzbmz zzbmzVar = this.zzb;
        if (zzbmzVar == null) {
            return;
        }
        try {
            zzbmzVar.zzdB(ObjectWrapper.wrap(view));
        } catch (RemoteException e) {
            zzo.zzg("Unable to call setClickConfirmingView on delegate", e);
        }
    }

    public final void setHeadlineView(@Nullable View view) {
        zzd("3001", view);
    }

    public final void setIconView(@Nullable View view) {
        zzd("3003", view);
    }

    public final void setImageView(@Nullable View view) {
        zzd("3008", view);
    }

    public final void setMediaView(@Nullable MediaView mediaView) {
        zzd("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.zza(new zzbmh() { // from class: com.google.android.gms.ads.nativead.zzb
            @Override // com.google.android.gms.internal.ads.zzbmh
            public final /* synthetic */ void zza(MediaContent mediaContent) {
                NativeAdView.this.zzb(mediaContent);
            }
        });
        mediaView.zzb(new zzbmj() { // from class: com.google.android.gms.ads.nativead.zza
            @Override // com.google.android.gms.internal.ads.zzbmj
            public final /* synthetic */ void zza(ImageView.ScaleType scaleType) {
                NativeAdView.this.zzc(scaleType);
            }
        });
    }

    public void setNativeAd(@NonNull NativeAd nativeAd) {
        zzbmz zzbmzVar = this.zzb;
        if (zzbmzVar == null) {
            return;
        }
        try {
            zzbmzVar.zzc((IObjectWrapper) nativeAd.zza());
        } catch (RemoteException e) {
            zzo.zzg("Unable to call setNativeAd on delegate", e);
        }
    }

    public final void setPriceView(@Nullable View view) {
        zzd("3007", view);
    }

    public final void setStarRatingView(@Nullable View view) {
        zzd("3009", view);
    }

    public final void setStoreView(@Nullable View view) {
        zzd("3006", view);
    }

    @Nullable
    protected final View zza(@NonNull String str) {
        zzbmz zzbmzVar = this.zzb;
        if (zzbmzVar != null) {
            try {
                IObjectWrapper zzb = zzbmzVar.zzb(str);
                if (zzb != null) {
                    return (View) ObjectWrapper.unwrap(zzb);
                }
            } catch (RemoteException e) {
                zzo.zzg("Unable to call getAssetView on delegate", e);
            }
        }
        return null;
    }

    final /* synthetic */ void zzb(MediaContent mediaContent) {
        zzbmz zzbmzVar = this.zzb;
        if (zzbmzVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzfb) {
                zzbmzVar.zzdE(((zzfb) mediaContent).zzc());
            } else if (mediaContent == null) {
                zzbmzVar.zzdE(null);
            } else {
                zzo.zzd("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e) {
            zzo.zzg("Unable to call setMediaContent on delegate", e);
        }
    }

    final /* synthetic */ void zzc(ImageView.ScaleType scaleType) {
        zzbmz zzbmzVar = this.zzb;
        if (zzbmzVar == null || scaleType == null) {
            return;
        }
        try {
            zzbmzVar.zzdC(ObjectWrapper.wrap(scaleType));
        } catch (RemoteException e) {
            zzo.zzg("Unable to call setMediaViewImageScaleType on delegate", e);
        }
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zza = zze(context);
        this.zzb = zzf();
    }

    public NativeAdView(@NonNull Context context, @NonNull AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.zza = zze(context);
        this.zzb = zzf();
    }
}
