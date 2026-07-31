package io.bidmachine.rendering.ad.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.rendering.Rendering;
import io.bidmachine.rendering.internal.animation.i;
import io.bidmachine.rendering.internal.controller.e;
import io.bidmachine.rendering.internal.k;
import io.bidmachine.rendering.internal.v;
import io.bidmachine.rendering.internal.view.f;
import io.bidmachine.rendering.internal.w;
import io.bidmachine.rendering.model.AdParams;
import io.bidmachine.rendering.model.Background;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.Orientation;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.model.WatermarkParams;
import io.bidmachine.rendering.view.SdkWatermarkView;
import io.bidmachine.rendering.view.WatermarkView;
import io.bidmachine.util.SystemComponent;
import io.bidmachine.util.Tag;
import io.bidmachine.util.UiUtils;
import io.bidmachine.util.UiUtilsKt;
import io.bidmachine.util.ViewShowState;
import io.bidmachine.util.ViewUtils;
import io.bidmachine.util.ViewUtilsKt;
import io.bidmachine.util.cache.MediaFileCacheManager;
import io.bidmachine.util.viewabilityhandler.ViewabilityHandler;
import io.bidmachine.util.viewabilityhandler.ViewabilityHandlerListener;
import io.bidmachine.util.viewabilitytracker.model.ActionEvent;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0003\"\u0012\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\r\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\nJ\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\nJ\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\nJ\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\r\u0010\u001fJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010\r\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020 H\u0002¢\u0006\u0004\b\r\u0010#J\u000f\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010\nJ\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b\"\u0010(J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b\u0018\u0010+J\u0017\u0010\r\u001a\u00020\b2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b\r\u0010+J\u0017\u0010\"\u001a\u00020\b2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b\"\u0010+J\u000f\u0010,\u001a\u00020\bH\u0002¢\u0006\u0004\b,\u0010\nJ\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b-\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\r\u0010\u0013J\u000f\u0010.\u001a\u00020\bH\u0002¢\u0006\u0004\b.\u0010\nJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\"\u0010\u0013J\u0019\u0010\r\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010/H\u0002¢\u0006\u0004\b\r\u00101J\u000f\u00102\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u0010\nJ\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\nJ\u000f\u00103\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u0010\nJ\u000f\u00104\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b\r\u0010(J\u0017\u0010\r\u001a\u00020\b2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b\r\u00107J#\u0010\r\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u000108H\u0002¢\u0006\u0004\b\r\u00109J\u000f\u0010:\u001a\u00020\bH\u0014¢\u0006\u0004\b:\u0010\nJ\u001f\u0010?\u001a\u00020\b2\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=H\u0014¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020 ¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020 ¢\u0006\u0004\bC\u0010BJ\r\u0010D\u001a\u00020\b¢\u0006\u0004\bD\u0010\nJ\u0017\u0010G\u001a\u00020\b2\b\u0010F\u001a\u0004\u0018\u00010E¢\u0006\u0004\bG\u0010HJ+\u0010O\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020I0L2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020IH\u0001¢\u0006\u0004\bM\u0010NJ\u000f\u0010Q\u001a\u0004\u0018\u00010P¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020\b¢\u0006\u0004\bS\u0010\nJ\r\u0010T\u001a\u00020\b¢\u0006\u0004\bT\u0010\nJ\u0015\u0010W\u001a\u00020\b2\u0006\u0010V\u001a\u00020U¢\u0006\u0004\bW\u0010XJ\u0015\u0010Y\u001a\u00020\b2\u0006\u0010V\u001a\u00020U¢\u0006\u0004\bY\u0010XJ\r\u0010Z\u001a\u00020\b¢\u0006\u0004\bZ\u0010\nJ\u000f\u0010[\u001a\u0004\u0018\u00010U¢\u0006\u0004\b[\u0010\\J\r\u0010]\u001a\u00020\b¢\u0006\u0004\b]\u0010\nJ\r\u0010^\u001a\u00020\b¢\u0006\u0004\b^\u0010\nJ\u000f\u0010_\u001a\u00020IH\u0016¢\u0006\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010bR\u0014\u0010f\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010eR\u0014\u0010h\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010gR\u0014\u0010k\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010jR\u0014\u0010n\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010mR\u0014\u0010q\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010pR\u0014\u0010t\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010sR\u0014\u0010w\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010vR\u0014\u0010z\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010yR\u0016\u0010}\u001a\u0004\u0018\u00010{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010|R)\u0010\u0084\u0001\u001a\u0004\u0018\u00010~8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\b\u0019\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\t\u0010\u0085\u0001R\u0018\u0010\u0087\u0001\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0014\u0010\u0085\u0001R!\u0010\u008a\u0001\u001a\u000b\u0012\u0004\u0012\u00020U\u0018\u00010\u0088\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b%\u0010\u0089\u0001¨\u0006\u008b\u0001"}, d2 = {"Lio/bidmachine/rendering/ad/view/AdView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lio/bidmachine/rendering/model/AdParams;", "adParams", "<init>", "(Landroid/content/Context;Lio/bidmachine/rendering/model/AdParams;)V", "", "l", "()V", "Lio/bidmachine/rendering/model/WatermarkParams;", "watermarkParams", "a", "(Lio/bidmachine/rendering/model/WatermarkParams;)V", j.b, "Lio/bidmachine/rendering/model/Error;", "error", "c", "(Lio/bidmachine/rendering/model/Error;)V", "m", "Lio/bidmachine/rendering/internal/controller/e;", "adPhaseController", "(Lio/bidmachine/rendering/internal/controller/e;)V", "d", CampaignEx.JSON_KEY_AD_K, CampaignEx.JSON_KEY_AD_Q, "p", "o", "Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;", "actionEvent", "(Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;)V", "", X3.i.o, "b", "(Z)V", "isViewability", "n", "Lio/bidmachine/rendering/model/PrivacySheetParams;", "privacySheetParams", "(Lio/bidmachine/rendering/model/PrivacySheetParams;)V", "Lio/bidmachine/rendering/internal/view/f;", "placeholderView", "(Lio/bidmachine/rendering/internal/view/f;)V", "r", "h", "i", "Lio/bidmachine/util/SystemComponent;", "systemComponent", "(Lio/bidmachine/util/SystemComponent;)V", "g", EidRequestBuilder.REQUEST_FIELD_EMAIL, InneractiveMediationDefs.GENDER_FEMALE, "Lio/bidmachine/rendering/model/BrokenCreativeEvent;", "brokenCreativeEvent", "(Lio/bidmachine/rendering/model/BrokenCreativeEvent;)V", "Lio/bidmachine/util/Error;", "(Lio/bidmachine/util/viewabilitytracker/model/ActionEvent;Lio/bidmachine/util/Error;)V", "onAttachedToWindow", "Landroid/view/View;", "changedView", "", ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, "onVisibilityChanged", "(Landroid/view/View;I)V", "isLoaded", "()Z", "isCompleted", "load", "Landroid/graphics/drawable/Drawable;", "drawable", "setWatermark", "(Landroid/graphics/drawable/Drawable;)V", "", "timestamp", "payload", "Lkotlin/Function1;", "createPayloadProvider$bidmachine_android_sdk_bb_3_7_1", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/jvm/functions/Function1;", "createPayloadProvider", "Lio/bidmachine/rendering/model/Orientation;", "getRequiredOrientation", "()Lio/bidmachine/rendering/model/Orientation;", "onExpanded", "collapse", "Landroid/app/Activity;", "activity", "showInActivity", "(Landroid/app/Activity;)V", "attachActivity", "detachActivity", "getAttachedActivity", "()Landroid/app/Activity;", "closeActivity", "destroy", "toString", "()Ljava/lang/String;", "Lio/bidmachine/util/Tag;", "Lio/bidmachine/util/Tag;", "tag", "Lio/bidmachine/util/ViewShowState;", "Lio/bidmachine/util/ViewShowState;", "viewShowState", "Landroid/widget/FrameLayout;", "adLayer", "Lio/bidmachine/rendering/view/WatermarkView;", "Lio/bidmachine/rendering/view/WatermarkView;", "watermarkLayer", "Lio/bidmachine/rendering/view/SdkWatermarkView;", "Lio/bidmachine/rendering/view/SdkWatermarkView;", "sdkWatermarkLayer", "Lio/bidmachine/rendering/internal/state/a;", "Lio/bidmachine/rendering/internal/state/a;", "adState", "Lio/bidmachine/rendering/internal/controller/a;", "Lio/bidmachine/rendering/internal/controller/a;", "adController", "Lio/bidmachine/rendering/internal/view/d;", "Lio/bidmachine/rendering/internal/view/d;", "loadingView", "Lio/bidmachine/util/viewabilityhandler/ViewabilityHandler;", "Lio/bidmachine/util/viewabilityhandler/ViewabilityHandler;", "viewabilityHandler", "Lio/bidmachine/rendering/internal/v;", "Lio/bidmachine/rendering/internal/v;", "viewBackgroundSetter", "Lio/bidmachine/rendering/ad/view/AdViewListener;", "Lio/bidmachine/rendering/ad/view/AdViewListener;", "getAdViewListener", "()Lio/bidmachine/rendering/ad/view/AdViewListener;", "setAdViewListener", "(Lio/bidmachine/rendering/ad/view/AdViewListener;)V", "adViewListener", "Z", "isAttachedToWindow", "isAdPhaseShown", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "weakShowActivity", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes13.dex */
public final class AdView extends FrameLayout {

    /* renamed from: a, reason: from kotlin metadata */
    private final Tag tag;

    /* renamed from: b, reason: from kotlin metadata */
    private final ViewShowState viewShowState;

    /* renamed from: c, reason: from kotlin metadata */
    private final FrameLayout adLayer;

    /* renamed from: d, reason: from kotlin metadata */
    private final WatermarkView watermarkLayer;

    /* renamed from: e, reason: from kotlin metadata */
    private final SdkWatermarkView sdkWatermarkLayer;

    /* renamed from: f, reason: from kotlin metadata */
    private final io.bidmachine.rendering.internal.state.a adState;

    /* renamed from: g, reason: from kotlin metadata */
    private final io.bidmachine.rendering.internal.controller.a adController;

    /* renamed from: h, reason: from kotlin metadata */
    private final io.bidmachine.rendering.internal.view.d loadingView;

    /* renamed from: i, reason: from kotlin metadata */
    private final ViewabilityHandler viewabilityHandler;

    /* renamed from: j, reason: from kotlin metadata */
    private final v viewBackgroundSetter;

    /* renamed from: k, reason: from kotlin metadata */
    private AdViewListener adViewListener;

    /* renamed from: l, reason: from kotlin metadata */
    private boolean isAttachedToWindow;

    /* renamed from: m, reason: from kotlin metadata */
    private boolean isAdPhaseShown;

    /* renamed from: n, reason: from kotlin metadata */
    private WeakReference weakShowActivity;

    static final class a extends Lambda implements Function0 {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediaFileCacheManager mo4828invoke() {
            Function0 mediaFileCacheManagerProvider = Rendering.getMediaFileCacheManagerProvider();
            if (mediaFileCacheManagerProvider != null) {
                return (MediaFileCacheManager) mediaFileCacheManagerProvider.mo4828invoke();
            }
            return null;
        }
    }

    private static final class b implements io.bidmachine.rendering.internal.controller.c {
        private final WeakReference a;

        public b(AdView adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            this.a = new WeakReference(adView);
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void a(io.bidmachine.rendering.internal.controller.a adController, Error error) {
            Intrinsics.checkNotNullParameter(adController, "adController");
            Intrinsics.checkNotNullParameter(error, "error");
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.c(error);
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void b(io.bidmachine.rendering.internal.controller.a adController) {
            Intrinsics.checkNotNullParameter(adController, "adController");
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.j();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void c(io.bidmachine.rendering.internal.controller.a adController) {
            Intrinsics.checkNotNullParameter(adController, "adController");
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.i();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void e() {
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.r();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void f() {
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.c();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void g() {
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.m();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void h() {
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.b(new Error("Ad loading timeout after display"));
                adView.a();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void a(io.bidmachine.rendering.internal.controller.a adController) {
            Intrinsics.checkNotNullParameter(adController, "adController");
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.f();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void b(f placeholderView) {
            Intrinsics.checkNotNullParameter(placeholderView, "placeholderView");
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.a(placeholderView);
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void c(f placeholderView) {
            Intrinsics.checkNotNullParameter(placeholderView, "placeholderView");
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.b(placeholderView);
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void a(io.bidmachine.rendering.internal.controller.e adPhaseController) {
            Intrinsics.checkNotNullParameter(adPhaseController, "adPhaseController");
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.a(adPhaseController);
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void b() {
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.collapse();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void c() {
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.b();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void a(io.bidmachine.rendering.internal.controller.e eVar, Error error) {
            Intrinsics.checkNotNullParameter(error, "error");
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.d(error);
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void a(f placeholderView) {
            Intrinsics.checkNotNullParameter(placeholderView, "placeholderView");
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.d(placeholderView);
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void a(SystemComponent systemComponent) {
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.a(systemComponent);
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void a() {
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.a();
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void a(PrivacySheetParams privacySheetParams) {
            Intrinsics.checkNotNullParameter(privacySheetParams, "privacySheetParams");
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.b(privacySheetParams);
            }
        }

        @Override // io.bidmachine.rendering.internal.controller.c
        public void a(BrokenCreativeEvent brokenCreativeEvent) {
            Intrinsics.checkNotNullParameter(brokenCreativeEvent, "brokenCreativeEvent");
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.a(brokenCreativeEvent);
            }
        }
    }

    private final class c extends View {
        final /* synthetic */ AdView a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AdView adView, Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.a = adView;
        }

        @Override // android.view.View
        public boolean dispatchTouchEvent(MotionEvent me) {
            DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
            return super.dispatchTouchEvent(me);
        }

        @Override // android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.a.l();
        }

        @Override // android.view.View
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            if (1 == 0) {
                setMeasuredDimension(0, 0);
            } else {
                super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            }
        }
    }

    private static final class d implements ViewabilityHandlerListener {
        private final WeakReference a;

        public d(AdView adView) {
            Intrinsics.checkNotNullParameter(adView, "adView");
            this.a = new WeakReference(adView);
        }

        @Override // io.bidmachine.util.viewabilityhandler.ViewabilityHandlerListener
        public void onViewabilityChanged(boolean z) {
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.b(z);
            }
        }

        @Override // io.bidmachine.util.viewabilityhandler.ViewabilityHandlerListener
        public void onViewabilityError(ActionEvent actionEvent, io.bidmachine.util.Error error) {
            Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
            Intrinsics.checkNotNullParameter(error, "error");
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.a(actionEvent, error);
            }
        }

        @Override // io.bidmachine.util.viewabilityhandler.ViewabilityHandlerListener
        public void onViewabilityEvent(ActionEvent actionEvent) {
            Intrinsics.checkNotNullParameter(actionEvent, "actionEvent");
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.a(actionEvent);
            }
        }

        @Override // io.bidmachine.util.viewabilityhandler.ViewabilityHandlerListener
        public void onViewabilityTracked() {
            AdView adView = (AdView) this.a.get();
            if (adView != null) {
                adView.o();
            }
        }
    }

    static final class e extends Lambda implements Function1 {
        final /* synthetic */ String a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, String str2, String str3) {
            super(1);
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final String a(int i) {
            if (i == 0) {
                return "";
            }
            if (i < this.a.length() + this.b.length() + this.c.length()) {
                return StringsKt.reversed(StringsKt.take(StringsKt.reversed(this.a).toString(), Math.min(i, this.a.length()))).toString();
            }
            return this.b + this.c + this.a;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdView(@NotNull Context context, @NotNull AdParams adParams) {
        super(context);
        v vVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adParams, "adParams");
        Tag tag = new Tag("AdView");
        this.tag = tag;
        this.viewShowState = new ViewShowState();
        FrameLayout frameLayout = new FrameLayout(context);
        this.adLayer = frameLayout;
        WatermarkView watermarkView = new WatermarkView(context);
        this.watermarkLayer = watermarkView;
        SdkWatermarkView sdkWatermarkView = new SdkWatermarkView(context);
        sdkWatermarkView.setVisibility(8);
        this.sdkWatermarkLayer = sdkWatermarkView;
        this.viewabilityHandler = new ViewabilityHandler(adParams.getViewabilityTrackerParams(), adParams.getVisibilityParams(), new d(this));
        addView(new c(this, context));
        addView(frameLayout, ViewUtils.createMatchParentParams());
        addView(sdkWatermarkView, ViewUtils.createMatchParentParams());
        addView(watermarkView, ViewUtils.createMatchParentParams());
        io.bidmachine.rendering.internal.f a2 = io.bidmachine.rendering.internal.f.i.a();
        io.bidmachine.rendering.internal.state.c cVar = new io.bidmachine.rendering.internal.state.c(tag.toString(), a2);
        this.adState = cVar;
        io.bidmachine.rendering.internal.state.b r = cVar.r();
        this.adController = new io.bidmachine.rendering.internal.controller.b(context, adParams, new b(this), new i(r, a2));
        io.bidmachine.rendering.internal.view.d dVar = new io.bidmachine.rendering.internal.view.d(context);
        this.loadingView = dVar;
        addView(dVar, ViewUtils.createMatchParentParams());
        dVar.a();
        Context appContext = context.getApplicationContext();
        Background background = adParams.getBackground();
        if (background != null) {
            Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
            vVar = w.a(background, appContext, new io.bidmachine.rendering.internal.repository.a(a.a, r, a2));
        } else {
            vVar = null;
        }
        this.viewBackgroundSetter = vVar;
        a(adParams.getWatermarkParams());
        this.isAttachedToWindow = false;
        setBackgroundColor(-16777216);
    }

    private final void a(WatermarkParams watermarkParams) {
        if (watermarkParams == null) {
            this.sdkWatermarkLayer.setVisibility(8);
            return;
        }
        Duration.Companion companion = Duration.Companion;
        String valueOf = String.valueOf(Duration.m8150getInWholeSecondsimpl(DurationKt.toDuration(System.currentTimeMillis(), DurationUnit.MILLISECONDS)));
        SdkWatermarkView sdkWatermarkView = this.sdkWatermarkLayer;
        sdkWatermarkView.setVisibility(0);
        sdkWatermarkView.setLocation(watermarkParams.getLocation());
        sdkWatermarkView.setBaseColor(watermarkParams.getBaseColor());
        sdkWatermarkView.setPayloadProvider(createPayloadProvider$bidmachine_android_sdk_bb_3_7_1(valueOf, watermarkParams.getPayload()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AdView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.adLayer.removeAllViews();
        this$0.removeAllViews();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(Error error) {
        a(error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(Error error) {
        k.a(this.tag, "onPreparingForShowFail - %s", error);
        b(new Error("No phase loaded"));
    }

    private final void e() {
        if (this.adState.b(false)) {
            k.b(this.tag, "notifyAdDisappeared", new Object[0]);
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.AdView$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    AdView.e(AdView.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        if (this.adState.n()) {
            k.b(this.tag, "notifyAdExpired", new Object[0]);
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.AdView$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    AdView.f(AdView.this);
                }
            });
        }
    }

    private final void g() {
        if (this.adState.m()) {
            k.b(this.tag, "notifyAdFinished", new Object[0]);
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.AdView$$ExternalSyntheticLambda9
                @Override // java.lang.Runnable
                public final void run() {
                    AdView.g(AdView.this);
                }
            });
        }
    }

    private final void h() {
        if (this.adState.a(true)) {
            k.b(this.tag, "notifyAdLoaded", new Object[0]);
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.AdView$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    AdView.h(AdView.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        if (this.adState.k()) {
            k.b(this.tag, "notifyAdShown", new Object[0]);
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.AdView$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    AdView.i(AdView.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        h();
    }

    private final void k() {
        if (this.adState.i()) {
            if (this.viewabilityHandler.isViewabilityTracked()) {
                o();
            }
            if (this.viewabilityHandler.isViewable()) {
                a(this, false, 1, null);
            }
        }
        this.viewabilityHandler.start(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        k.b(this.tag, "onDetachedFromWindow", new Object[0]);
        this.isAttachedToWindow = false;
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        k.b(this.tag, "onPreparingForShowStarted", new Object[0]);
    }

    private final void n() {
        k.b(this.tag, "onViewOutOfScreen", new Object[0]);
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        k.b(this.tag, "onViewabilityShown", new Object[0]);
        a(true);
    }

    private final void p() {
        if (!this.isAttachedToWindow || !ViewUtilsKt.isViewVisible(this)) {
            this.viewabilityHandler.stop();
        }
        this.adController.e();
        e();
    }

    private final void q() {
        if (this.isAttachedToWindow && ViewUtilsKt.isViewVisible(this)) {
            this.adState.o();
            if (this.isAdPhaseShown) {
                k();
            } else {
                this.adController.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        this.loadingView.c();
    }

    public final void attachActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.weakShowActivity = new WeakReference(activity);
    }

    public final void closeActivity() {
        UiUtilsKt.finishActivityWithoutAnimationSafely(getAttachedActivity());
        detachActivity();
    }

    public final void collapse() {
        closeActivity();
        UiUtils.onUiThread(new io.bidmachine.rendering.internal.j() { // from class: io.bidmachine.rendering.ad.view.AdView$$ExternalSyntheticLambda12
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                AdView.a(AdView.this);
            }
        });
    }

    @VisibleForTesting
    @NotNull
    public final Function1 createPayloadProvider$bidmachine_android_sdk_bb_3_7_1(@NotNull String timestamp, @NotNull String payload) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(payload, "payload");
        return new e(payload, timestamp, ":");
    }

    public final void destroy() {
        k.b(this.tag, "destroy", new Object[0]);
        v vVar = this.viewBackgroundSetter;
        if (vVar != null) {
            vVar.a();
        }
        this.adViewListener = null;
        this.viewShowState.clear();
        this.adController.destroy();
        this.viewabilityHandler.destroy();
        UiUtils.onUiThread(new io.bidmachine.rendering.internal.j() { // from class: io.bidmachine.rendering.ad.view.AdView$$ExternalSyntheticLambda10
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                AdView.b(AdView.this);
            }
        });
        this.adState.destroy();
        closeActivity();
    }

    public final void detachActivity() {
        WeakReference weakReference = this.weakShowActivity;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.weakShowActivity = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me);
        return super.dispatchTouchEvent(me);
    }

    @Nullable
    public final AdViewListener getAdViewListener() {
        return this.adViewListener;
    }

    @Nullable
    public final Activity getAttachedActivity() {
        WeakReference weakReference = this.weakShowActivity;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    @Nullable
    public final Orientation getRequiredOrientation() {
        return this.adController.g();
    }

    public final boolean isCompleted() {
        return this.adState.isCompleted();
    }

    public final boolean isLoaded() {
        return this.adState.a();
    }

    public final void load() {
        if (this.adState.b()) {
            v vVar = this.viewBackgroundSetter;
            if (vVar != null) {
                vVar.a(this.tag, this, (r16 & 4) != 0 ? null : null, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0, (r16 & 32) != 0 ? null : null);
            }
            this.adController.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.b(this.tag, "onAttachedToWindow", new Object[0]);
        this.isAttachedToWindow = true;
        q();
    }

    public final void onExpanded() {
        this.adController.f();
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
    protected void onVisibilityChanged(View changedView, int visibility) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, visibility);
        k.b(this.tag, "onVisibilityChanged - %s", io.bidmachine.rendering.utils.UiUtils.toString(visibility));
        if (ViewUtils.isViewVisible(visibility)) {
            q();
        } else {
            p();
        }
    }

    public final void setAdViewListener(@Nullable AdViewListener adViewListener) {
        this.adViewListener = adViewListener;
    }

    public final void setWatermark(@Nullable Drawable drawable) {
        this.watermarkLayer.setWatermark(drawable);
    }

    public final void showInActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        closeActivity();
        attachActivity(activity);
        io.bidmachine.rendering.utils.UiUtilsKt.setupActivityOrientation(activity, getRequiredOrientation());
        UiUtilsKt.prepareFullscreen(activity);
        ViewUtilsKt.removeFromParent(this);
        io.bidmachine.rendering.utils.UiUtilsKt.applyInsets(activity, this, false);
        activity.setContentView(this, ViewUtils.createMatchParentParams());
        UiUtilsKt.applyFullscreen(activity);
    }

    @Override // android.view.View
    @NotNull
    public String toString() {
        return this.tag.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(AdView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.viewShowState.saveViewShowState(this$0);
        ExpandActivityKt.startExpandActivity(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(boolean isViewable) {
        if (isViewable) {
            a(this, false, 1, null);
        } else {
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(f placeholderView) {
        Intrinsics.checkNotNullParameter(placeholderView, "$placeholderView");
        ViewUtilsKt.removeFromParent(placeholderView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(final f placeholderView) {
        k.b(this.tag, "showPlaceholder (%s)", placeholderView);
        UiUtils.onUiThread(new io.bidmachine.rendering.internal.j() { // from class: io.bidmachine.rendering.ad.view.AdView$$ExternalSyntheticLambda1
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                AdView.a(AdView.this, placeholderView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        this.loadingView.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        UiUtils.onUiThread(new io.bidmachine.rendering.internal.j() { // from class: io.bidmachine.rendering.ad.view.AdView$$ExternalSyntheticLambda15
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                AdView.c(AdView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(PrivacySheetParams privacySheetParams) {
        k.b(this.tag, "onOpenPrivacySheet", new Object[0]);
        a(privacySheetParams);
    }

    private final void d() {
        if (this.adState.b(true)) {
            k.b(this.tag, "notifyAdAppeared", new Object[0]);
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.AdView$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    AdView.d(AdView.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AdView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AdViewListener adViewListener = this$0.adViewListener;
        if (adViewListener != null) {
            adViewListener.onAdDisappeared(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(AdView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AdViewListener adViewListener = this$0.adViewListener;
        if (adViewListener != null) {
            adViewListener.onAdExpired(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(AdView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AdViewListener adViewListener = this$0.adViewListener;
        if (adViewListener != null) {
            adViewListener.onAdFinished(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(AdView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AdViewListener adViewListener = this$0.adViewListener;
        if (adViewListener != null) {
            adViewListener.onAdLoaded(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(AdView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AdViewListener adViewListener = this$0.adViewListener;
        if (adViewListener != null) {
            adViewListener.onAdShown(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final f placeholderView) {
        k.b(this.tag, "removePlaceholder (%s)", placeholderView);
        UiUtils.onUiThread(new io.bidmachine.rendering.internal.j() { // from class: io.bidmachine.rendering.ad.view.AdView$$ExternalSyntheticLambda7
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                AdView.c(f.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AdView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.viewShowState.restoreViewShowState(this$0);
        this$0.adController.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(final Error error) {
        if (this.adState.e()) {
            k.a(this.tag, "notifyAdFailToShow - %s", error);
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.AdView$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    AdView.b(AdView.this, error);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final io.bidmachine.rendering.internal.controller.e adPhaseController) {
        k.b(this.tag, "onPreparingForShowComplete", new Object[0]);
        UiUtils.onUiThread(new io.bidmachine.rendering.internal.j() { // from class: io.bidmachine.rendering.ad.view.AdView$$ExternalSyntheticLambda5
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                AdView.a(e.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AdView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AdViewListener adViewListener = this$0.adViewListener;
        if (adViewListener != null) {
            adViewListener.onAdAppeared(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(io.bidmachine.rendering.internal.controller.e adPhaseController, AdView this$0) {
        Intrinsics.checkNotNullParameter(adPhaseController, "$adPhaseController");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (adPhaseController.a(this$0, this$0.adLayer)) {
            this$0.isAdPhaseShown = true;
            this$0.c();
            this$0.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AdView this$0, Error error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        AdViewListener adViewListener = this$0.adViewListener;
        if (adViewListener != null) {
            adViewListener.onAdFailToShow(this$0, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(ActionEvent actionEvent) {
        k.b(this.tag, "onViewabilityEvent (%s)", actionEvent);
        a(this, actionEvent, null, 2, null);
    }

    static /* synthetic */ void a(AdView adView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        adView.a(z);
    }

    private final void a(boolean isViewability) {
        k.b(this.tag, "onViewOnScreen (isViewability - %s)", Boolean.valueOf(isViewability));
        v vVar = this.viewBackgroundSetter;
        if (vVar != null) {
            vVar.a(this.tag, this, (r16 & 4) != 0 ? null : null, (r16 & 8) != 0 ? null : null, (r16 & 16) != 0, (r16 & 32) != 0 ? null : new v.a(0L, null, 3, null));
        }
        this.adController.c();
        this.adController.a(isViewability);
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        this.adState.l();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AdView this$0, f placeholderView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(placeholderView, "$placeholderView");
        if (!ViewUtilsKt.contains(this$0, placeholderView)) {
            ViewUtilsKt.addViewSafely$default(this$0, placeholderView, 0, ViewUtils.createMatchParentParams(), 2, null);
        }
        ViewUtilsKt.showViewSafely(placeholderView);
        placeholderView.bringToFront();
        placeholderView.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(f placeholderView) {
        k.b(this.tag, "hidePlaceholder (%s)", placeholderView);
        ViewUtilsKt.hideViewSafely(placeholderView);
    }

    private final void a(final Error error) {
        if (this.adState.a(false)) {
            k.a(this.tag, "notifyAdFailToLoad - %s", error);
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.AdView$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    AdView.a(AdView.this, error);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AdView this$0, Error error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        AdViewListener adViewListener = this$0.adViewListener;
        if (adViewListener != null) {
            adViewListener.onAdFailToLoad(this$0, error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final SystemComponent systemComponent) {
        this.adState.d();
        k.b(this.tag, "notifyAdClicked", new Object[0]);
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.AdView$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                AdView.a(AdView.this, systemComponent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AdView this$0, SystemComponent systemComponent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AdViewListener adViewListener = this$0.adViewListener;
        if (adViewListener != null) {
            adViewListener.onAdClicked(this$0, systemComponent);
        }
    }

    private final void a(final PrivacySheetParams privacySheetParams) {
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.AdView$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                AdView.a(AdView.this, privacySheetParams);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AdView this$0, PrivacySheetParams privacySheetParams) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(privacySheetParams, "$privacySheetParams");
        AdViewListener adViewListener = this$0.adViewListener;
        if (adViewListener != null) {
            adViewListener.onOpenPrivacySheet(this$0, privacySheetParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final BrokenCreativeEvent brokenCreativeEvent) {
        if (this.adState.j()) {
            return;
        }
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.AdView$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                AdView.a(AdView.this, brokenCreativeEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AdView this$0, BrokenCreativeEvent brokenCreativeEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(brokenCreativeEvent, "$brokenCreativeEvent");
        AdViewListener adViewListener = this$0.adViewListener;
        if (adViewListener != null) {
            adViewListener.onBrokenCreativeEvent(this$0, brokenCreativeEvent);
        }
    }

    static /* synthetic */ void a(AdView adView, ActionEvent actionEvent, io.bidmachine.util.Error error, int i, Object obj) {
        if ((i & 2) != 0) {
            error = null;
        }
        adView.a(actionEvent, error);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final ActionEvent actionEvent, final io.bidmachine.util.Error error) {
        if (this.adState.j()) {
            return;
        }
        if (error != null) {
            k.a(this.tag, "notifyViewabilityEvent - %s, error - %s", actionEvent, error);
        } else {
            k.b(this.tag, "notifyViewabilityEvent - %s", actionEvent);
        }
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.ad.view.AdView$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                AdView.a(AdView.this, actionEvent, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(AdView this$0, ActionEvent actionEvent, io.bidmachine.util.Error error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(actionEvent, "$actionEvent");
        AdViewListener adViewListener = this$0.adViewListener;
        if (adViewListener != null) {
            adViewListener.onViewabilityEvent(this$0, actionEvent, error);
        }
    }
}
