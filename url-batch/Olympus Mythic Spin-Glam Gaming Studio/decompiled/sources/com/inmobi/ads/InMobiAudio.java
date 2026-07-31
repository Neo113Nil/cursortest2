package com.inmobi.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import androidx.annotation.IntRange;
import androidx.annotation.UiThread;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.exceptions.InvalidPlacementIdException;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.ads.listeners.AudioAdEventListener;
import com.inmobi.media.AbstractC4002fj;
import com.inmobi.media.AbstractC4015g4;
import com.inmobi.media.AbstractC4030gj;
import com.inmobi.media.AbstractC4214nk;
import com.inmobi.media.C3853a2;
import com.inmobi.media.C3868ah;
import com.inmobi.media.C4277q4;
import com.inmobi.media.F5;
import com.inmobi.media.N3;
import com.inmobi.media.R1;
import com.inmobi.media.R5;
import com.inmobi.media.T5;
import com.inmobi.media.V1;
import com.inmobi.media.ViewTreeObserverOnGlobalLayoutListenerC3912c9;
import com.inmobi.media.Xb;
import com.inmobi.media.core.config.models.AdConfig;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001)B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0012\u001a\u00020\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001e\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001f\u0010\rJ!\u0010#\u001a\u00020\u000b2\b\b\u0001\u0010!\u001a\u00020 2\b\b\u0001\u0010\"\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u000bH\u0007¢\u0006\u0004\b%\u0010\rJ\r\u0010&\u001a\u00020\u000b¢\u0006\u0004\b&\u0010\rJ\r\u0010'\u001a\u00020\u000b¢\u0006\u0004\b'\u0010\rJ\u000f\u0010(\u001a\u00020\u000bH\u0007¢\u0006\u0004\b(\u0010\rR$\u0010.\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010\u001cR$\u00106\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0014\u00109\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/inmobi/ads/InMobiAudio;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "placementId", "(Landroid/content/Context;J)V", "", "load", "()V", "show", "", "", "extras", "setExtras", "(Ljava/util/Map;)V", "keywords", "setKeywords", "(Ljava/lang/String;)V", "contentUrl", "setContentUrl", "Lcom/inmobi/ads/listeners/AudioAdEventListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Lcom/inmobi/ads/listeners/AudioAdEventListener;)V", "disableHardwareAcceleration", "onAttachedToWindow", "onDetachedFromWindow", "", "widthInDp", "heightInDp", "setAudioSize", "(II)V", "setupViewSizeObserver", "resume", "pause", "destroy", "a", "Lcom/inmobi/ads/listeners/AudioAdEventListener;", "getMPubListener$media_release", "()Lcom/inmobi/ads/listeners/AudioAdEventListener;", "setMPubListener$media_release", "mPubListener", "Lcom/inmobi/media/a2;", "b", "Lcom/inmobi/media/a2;", "getMAdManager$media_release", "()Lcom/inmobi/media/a2;", "setMAdManager$media_release", "(Lcom/inmobi/media/a2;)V", "mAdManager", "getFrameSizeString", "()Ljava/lang/String;", "frameSizeString", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InMobiAudio extends RelativeLayout {

    /* renamed from: a, reason: from kotlin metadata */
    public AudioAdEventListener mPubListener;

    /* renamed from: b, reason: from kotlin metadata */
    public C3853a2 mAdManager;
    public final WeakReference c;
    public final C3868ah d;
    public long e;
    public int f;
    public int g;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/inmobi/ads/InMobiAudio$a;", "Lcom/inmobi/media/V1;", "Lcom/inmobi/ads/InMobiAudio;", "audio", "<init>", "(Lcom/inmobi/ads/InMobiAudio;)V", "Lcom/inmobi/ads/AdMetaInfo;", "info", "", "onAdFetchSuccessful", "(Lcom/inmobi/ads/AdMetaInfo;)V", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "status", "onAdFetchFailed", "(Lcom/inmobi/ads/InMobiAdRequestStatus;)V", "", "getType", "()B", "type", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends V1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull InMobiAudio audio) {
            super(audio);
            Intrinsics.checkNotNullParameter(audio, "audio");
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public byte getType() {
            return (byte) 0;
        }

        @Override // com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchFailed(@NotNull InMobiAdRequestStatus status) {
            AudioAdEventListener mPubListener;
            Intrinsics.checkNotNullParameter(status, "status");
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio == null || (mPubListener = inMobiAudio.getMPubListener()) == null) {
                return;
            }
            mPubListener.onAdLoadFailed(inMobiAudio, status);
        }

        @Override // com.inmobi.media.V1, com.inmobi.ads.controllers.PublisherCallbacks
        public void onAdFetchSuccessful(@NotNull AdMetaInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            super.onAdFetchSuccessful(info);
            InMobiAudio inMobiAudio = a().get();
            if (inMobiAudio == null) {
                return;
            }
            try {
                C3853a2 mAdManager = inMobiAudio.getMAdManager();
                if (mAdManager != null) {
                    mAdManager.k();
                }
            } catch (IllegalStateException e) {
                Xb.a((byte) 1, "InMobiAudio", e.getMessage());
                AudioAdEventListener mPubListener = inMobiAudio.getMPubListener();
                if (mPubListener != null) {
                    mPubListener.onAdLoadFailed(inMobiAudio, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attributeSet");
        a aVar = new a(this);
        C3868ah c3868ah = new C3868ah();
        this.d = c3868ah;
        if (!AbstractC4002fj.d()) {
            throw new SdkNotInitializedException("InMobiAudio");
        }
        if (context instanceof Activity) {
            this.c = new WeakReference(context);
        }
        this.mAdManager = new C3853a2(aVar);
        String attributeValue = attributeSet.getAttributeValue("http://schemas.android.com/apk/lib/com.inmobi.ads", "placementId");
        if (attributeValue != null) {
            long a2 = a(attributeValue);
            if (a2 == Long.MIN_VALUE) {
                throw new InvalidPlacementIdException();
            }
            c3868ah.a = a2;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        C3853a2 c3853a2 = this.mAdManager;
        if (c3853a2 != null) {
            c3853a2.a(context2, c3868ah, getFrameSizeString());
        }
    }

    public static final boolean access$hasValidSize(InMobiAudio inMobiAudio) {
        return inMobiAudio.f > 0 && inMobiAudio.g > 0;
    }

    private final String getFrameSizeString() {
        return this.f + VastAttributes.HORIZONTAL_POSITION + this.g;
    }

    public final boolean a() {
        if (this.f <= 0 || this.g <= 0) {
            if (getLayoutParams() == null) {
                Xb.a((byte) 1, "InMobiAudio", "The layout params of the audio ad view must be set before calling load or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
            if (getLayoutParams().width == -2 || getLayoutParams().height == -2) {
                Xb.a((byte) 1, "InMobiAudio", "The height or width of a Audio ad can't be WRAP_CONTENT or call setAudioSize(int widthInDp, int heightInDp) before load");
                return false;
            }
            if (getLayoutParams() != null) {
                this.f = N3.b(getLayoutParams().width / R5.b());
                this.g = N3.b(getLayoutParams().height / R5.b());
            }
        }
        return true;
    }

    public final void b() {
        C3853a2 c3853a2;
        R1 r1;
        try {
            C4277q4 c4277q4 = AbstractC4015g4.a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            C4277q4 c4277q42 = AbstractC4015g4.a;
            if (!((AdConfig) c4277q42.a(AdConfig.class)).getAudio().getIsAudioEnabled()) {
                C3853a2 c3853a22 = this.mAdManager;
                if (c3853a22 != null) {
                    c3853a22.a((short) 107);
                }
                C3853a2 c3853a23 = this.mAdManager;
                if (c3853a23 != null) {
                    c3853a23.a(c3853a23.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.FEATURE_DISABLED));
                }
                Xb.a((byte) 1, "InMobi", "");
                return;
            }
            C3868ah c3868ah = this.d;
            c3868ah.getClass();
            Intrinsics.checkNotNullParameter("NonAB", "<set-?>");
            c3868ah.h = "NonAB";
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            C3853a2 c3853a24 = this.mAdManager;
            if (c3853a24 != null) {
                c3853a24.a(context, this.d, getFrameSizeString());
            }
            C3853a2 c3853a25 = this.mAdManager;
            if (c3853a25 != null && (r1 = c3853a25.j) != null && r1.b == 7) {
                C3853a2 c3853a26 = this.mAdManager;
                if (c3853a26 != null) {
                    c3853a26.b((short) 15);
                }
                AudioAdEventListener audioAdEventListener = this.mPubListener;
                if (audioAdEventListener != null) {
                    audioAdEventListener.onAdLoadFailed(this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE));
                }
                Xb.a((byte) 1, "InMobiAudio", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad.");
                return;
            }
            if (!a()) {
                C3853a2 c3853a27 = this.mAdManager;
                if (c3853a27 != null) {
                    c3853a27.a((short) 108);
                }
                C3853a2 c3853a28 = this.mAdManager;
                if (c3853a28 != null) {
                    c3853a28.a(c3853a28.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.REQUEST_INVALID));
                    return;
                }
                return;
            }
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            if (((AdConfig) c4277q42.a(AdConfig.class)).getAudio().getMinDeviceVolume() > F5.a.a(AbstractC4002fj.a, AbstractC4002fj.f)) {
                C3853a2 c3853a29 = this.mAdManager;
                if (c3853a29 != null) {
                    c3853a29.a((short) 106);
                }
                C3853a2 c3853a210 = this.mAdManager;
                if (c3853a210 != null) {
                    c3853a210.a(c3853a210.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.DEVICE_AUDIO_LEVEL_LOW));
                    return;
                }
                return;
            }
            if (this.f <= 0 || this.g <= 0) {
                Runnable runnable = new Runnable() { // from class: com.inmobi.ads.InMobiAudio$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        InMobiAudio.a(InMobiAudio.this);
                    }
                };
                Lazy lazy = AbstractC4214nk.a;
                Intrinsics.checkNotNullParameter(runnable, "runnable");
                ((Handler) AbstractC4214nk.a.getValue()).postDelayed(runnable, 200L);
                return;
            }
            long j = this.e;
            if (j == 0 || (c3853a2 = this.mAdManager) == null || c3853a2.a(j)) {
                this.e = SystemClock.elapsedRealtime();
                C3853a2 c3853a211 = this.mAdManager;
                if (c3853a211 != null) {
                    c3853a211.b(getFrameSizeString());
                }
            }
        } catch (Exception e) {
            C3853a2 c3853a212 = this.mAdManager;
            if (c3853a212 != null) {
                c3853a212.a((short) 105);
            }
            Xb.a((byte) 1, "InMobiAudio", "Unable to load ad; SDK encountered an unexpected error");
            e.getMessage();
        }
    }

    @UiThread
    public final void destroy() {
        removeAllViews();
        C3853a2 c3853a2 = this.mAdManager;
        if (c3853a2 != null) {
            c3853a2.h();
        }
        this.mPubListener = null;
    }

    public final void disableHardwareAcceleration() {
        this.d.e = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.i, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    /* renamed from: getMAdManager$media_release, reason: from getter */
    public final C3853a2 getMAdManager() {
        return this.mAdManager;
    }

    @Nullable
    /* renamed from: getMPubListener$media_release, reason: from getter */
    public final AudioAdEventListener getMPubListener() {
        return this.mPubListener;
    }

    @UiThread
    public final void load() {
        C3853a2 c3853a2 = this.mAdManager;
        if (c3853a2 != null) {
            c3853a2.g();
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            C3853a2 c3853a2 = this.mAdManager;
            if (c3853a2 != null) {
                c3853a2.j();
            }
            if (getLayoutParams() != null) {
                this.f = N3.b(getLayoutParams().width / R5.b());
                this.g = N3.b(getLayoutParams().height / R5.b());
            }
            if (this.f <= 0 || this.g <= 0) {
                setupViewSizeObserver();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                T5 t5 = R5.a;
                Context context = getContext();
                WindowInsets rootWindowInsets = getRootWindowInsets();
                Intrinsics.checkNotNullExpressionValue(rootWindowInsets, "getRootWindowInsets(...)");
                R5.a(rootWindowInsets, context);
            }
        } catch (Exception e) {
            Xb.a((byte) 1, "InMobiAudio", "InMobiAudio#onAttachedToWindow() handler threw unexpected error");
            e.getMessage();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            C3853a2 c3853a2 = this.mAdManager;
            if (c3853a2 != null) {
                c3853a2.p();
            }
        } catch (Exception e) {
            Xb.a((byte) 1, "InMobiAudio", "InMobiAudio.onDetachedFromWindow() handler threw unexpected error");
            e.getMessage();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void pause() {
        C3853a2 c3853a2;
        try {
            if (this.c != null || (c3853a2 = this.mAdManager) == null) {
                return;
            }
            c3853a2.i();
        } catch (Exception e) {
            Xb.a((byte) 1, "InMobi", "Could not pause ad; SDK encountered an unexpected error");
            e.getMessage();
        }
    }

    public final void resume() {
        C3853a2 c3853a2;
        try {
            if (this.c != null || (c3853a2 = this.mAdManager) == null) {
                return;
            }
            c3853a2.l();
        } catch (Exception e) {
            Xb.a((byte) 1, "InMobi", "Could not resume ad; SDK encountered an unexpected error");
            e.getMessage();
        }
    }

    public final void setAudioSize(@IntRange int widthInDp, @IntRange int heightInDp) {
        this.f = widthInDp;
        this.g = heightInDp;
    }

    public final void setContentUrl(@NotNull String contentUrl) {
        Intrinsics.checkNotNullParameter(contentUrl, "contentUrl");
        this.d.f = contentUrl;
    }

    public final void setExtras(@Nullable Map<String, String> extras) {
        if (extras != null) {
            String str = extras.get("tp");
            if (str != null && !TextUtils.isEmpty(str)) {
                AbstractC4030gj.b = str;
            }
            String str2 = extras.get("tp-v");
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                AbstractC4030gj.a = str2;
            }
        }
        this.d.d = extras;
    }

    public final void setKeywords(@Nullable String keywords) {
        this.d.c = keywords;
    }

    public final void setListener(@NotNull AudioAdEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mPubListener = listener;
    }

    public final void setMAdManager$media_release(@Nullable C3853a2 c3853a2) {
        this.mAdManager = c3853a2;
    }

    public final void setMPubListener$media_release(@Nullable AudioAdEventListener audioAdEventListener) {
        this.mPubListener = audioAdEventListener;
    }

    @TargetApi(16)
    public final void setupViewSizeObserver() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC3912c9(this));
    }

    @UiThread
    public final void show() {
        C3853a2 c3853a2 = this.mAdManager;
        if (c3853a2 != null) {
            c3853a2.n();
        }
        C3853a2 c3853a22 = this.mAdManager;
        if (c3853a22 != null) {
            c3853a22.a(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InMobiAudio(@NotNull Context context, long j) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        a aVar = new a(this);
        C3868ah c3868ah = new C3868ah();
        this.d = c3868ah;
        if (AbstractC4002fj.d()) {
            if (context instanceof Activity) {
                this.c = new WeakReference(context);
            }
            C3853a2 c3853a2 = new C3853a2(aVar);
            this.mAdManager = c3853a2;
            c3868ah.a = j;
            c3853a2.a(context, c3868ah, getFrameSizeString());
            return;
        }
        throw new SdkNotInitializedException("InMobiAudio");
    }

    public static final void a(InMobiAudio inMobiAudio) {
        C3853a2 c3853a2;
        try {
            if (inMobiAudio.f > 0 && inMobiAudio.g > 0) {
                long j = inMobiAudio.e;
                if (j == 0 || (c3853a2 = inMobiAudio.mAdManager) == null || c3853a2.a(j)) {
                    inMobiAudio.e = SystemClock.elapsedRealtime();
                    C3853a2 c3853a22 = inMobiAudio.mAdManager;
                    if (c3853a22 != null) {
                        c3853a22.b(inMobiAudio.getFrameSizeString());
                        return;
                    }
                    return;
                }
                return;
            }
            Xb.a((byte) 1, "InMobiAudio", "The height or width of the audio ad can not be determined");
            C3853a2 c3853a23 = inMobiAudio.mAdManager;
            if (c3853a23 != null) {
                c3853a23.a((short) 108);
            }
            C3853a2 c3853a24 = inMobiAudio.mAdManager;
            if (c3853a24 != null) {
                c3853a24.a(c3853a24.f(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        } catch (Exception e) {
            C3853a2 c3853a25 = inMobiAudio.mAdManager;
            if (c3853a25 != null) {
                c3853a25.a((short) 105);
            }
            Xb.a((byte) 1, "InMobiAudio", "SDK encountered unexpected error while loading an ad");
            e.getMessage();
        }
    }

    public static long a(String str) {
        try {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            StringBuilder sb = new StringBuilder(str.subSequence(i, length + 1).toString());
            if (StringsKt.equals("plid-", sb.substring(0, 5), true)) {
                String substring = sb.substring(5, sb.length());
                Intrinsics.checkNotNull(substring);
                int length2 = substring.length() - 1;
                int i2 = 0;
                boolean z3 = false;
                while (i2 <= length2) {
                    boolean z4 = Intrinsics.compare((int) substring.charAt(!z3 ? i2 : length2), 32) <= 0;
                    if (z3) {
                        if (!z4) {
                            break;
                        }
                        length2--;
                    } else if (z4) {
                        i2++;
                    } else {
                        z3 = true;
                    }
                }
                return Long.parseLong(substring.subSequence(i2, length2 + 1).toString());
            }
            Xb.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
            Xb.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        } catch (NumberFormatException unused) {
            Xb.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Audio creation failed.");
            Xb.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        } catch (StringIndexOutOfBoundsException unused2) {
            Xb.a((byte) 1, "InMobiAudio", "Placement id value supplied in XML layout is not valid. Please make sure placement id is in plid-0123456789 format.");
            Xb.a((byte) 1, "InMobiAudio", "Invalid Placement id: " + str);
            return Long.MIN_VALUE;
        }
    }
}
