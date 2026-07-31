package com.moloco.sdk.internal.publisher.nativead;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.C;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.nativead.ui.e;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes10.dex */
public final class a implements NativeAd.Assets {

    @NotNull
    public static final C1543a m = new C1543a(null);
    public static final int n = 8;

    @NotNull
    public static final String o = "NativeAdAssetsProvider";

    @NotNull
    public final Context a;

    @NotNull
    public final Q b;

    @NotNull
    public final C c;

    @NotNull
    public final y d;

    @NotNull
    public final Function1 e;

    @NotNull
    public final MetricsRecorder f;

    @Nullable
    public Function0 g;
    public boolean h;

    @Nullable
    public com.moloco.sdk.internal.publisher.nativead.model.d i;

    @Nullable
    public final Uri j;

    @Nullable
    public ViewGroup k;

    @Nullable
    public FrameLayout l;

    /* renamed from: com.moloco.sdk.internal.publisher.nativead.a$a, reason: collision with other inner class name */
    public static final class C1543a {
        public /* synthetic */ C1543a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C1543a() {
        }
    }

    public a(@NotNull Context context, @NotNull Q viewVisibilityTracker, @NotNull C viewLifecycleOwner, @NotNull y watermark, @NotNull Function1 vastAdPlaylistController, @NotNull MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(vastAdPlaylistController, "vastAdPlaylistController");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.a = context;
        this.b = viewVisibilityTracker;
        this.c = viewLifecycleOwner;
        this.d = watermark;
        this.e = vastAdPlaylistController;
        this.f = metricsRecorder;
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.i;
        this.j = dVar != null ? dVar.b(1) : null;
    }

    @VisibleForTesting
    public static /* synthetic */ void f() {
    }

    public final void a(@Nullable Function0 function0) {
        this.g = function0;
    }

    public final boolean b() {
        return this.h;
    }

    @Nullable
    public final Function0 c() {
        return this.g;
    }

    @Nullable
    public final com.moloco.sdk.internal.publisher.nativead.model.d d() {
        return this.i;
    }

    @Nullable
    public final FrameLayout e() {
        return this.l;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    @Nullable
    public String getCallToActionText() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.i;
        if (dVar != null) {
            return dVar.a(7);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    @Nullable
    public String getDescription() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.i;
        if (dVar != null) {
            return dVar.a(5);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    @Nullable
    public Uri getIconUri() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.i;
        if (dVar != null) {
            return dVar.b(0);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    @Nullable
    public Uri getMainImageUri() {
        return this.j;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    @Nullable
    public View getMediaView() {
        Uri b;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a d;
        FrameLayout frameLayout = this.l;
        if (frameLayout != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, o, "Using cached video view", null, false, 12, null);
            a((ViewGroup) frameLayout);
            return frameLayout;
        }
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.i;
        if (dVar != null && (d = dVar.d(2)) != null) {
            try {
                FrameLayout a = a(d);
                this.l = a;
                return a;
            } catch (NoClassDefFoundError e) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, o, "Compose dependency not available for native video rendering, falling back to image", e, false, 8, null);
                this.f.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.e0.c()));
            }
        }
        ViewGroup viewGroup = this.k;
        if (viewGroup != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, o, "Using cached image view", null, false, 12, null);
            a(viewGroup);
            return viewGroup;
        }
        com.moloco.sdk.internal.publisher.nativead.model.d dVar2 = this.i;
        if (dVar2 == null || (b = dVar2.b(1)) == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, o, "Missing video and image asset", new Exception(), false, 8, null);
            return null;
        }
        ViewGroup a2 = a(b);
        this.k = a2;
        return a2;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    @Nullable
    public Float getRating() {
        String a;
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.i;
        if (dVar == null || (a = dVar.a(6)) == null) {
            return null;
        }
        return StringsKt.toFloatOrNull(a);
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    @Nullable
    public String getSponsorText() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.i;
        if (dVar != null) {
            return dVar.a(4);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    @Nullable
    public String getTitle() {
        com.moloco.sdk.internal.publisher.nativead.model.d dVar = this.i;
        if (dVar != null) {
            return dVar.c(3);
        }
        return null;
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public final void a(@Nullable com.moloco.sdk.internal.publisher.nativead.model.d dVar) {
        this.i = dVar;
    }

    public final void a(@Nullable FrameLayout frameLayout) {
        this.l = frameLayout;
    }

    public final FrameLayout a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a) this.e.invoke(aVar);
        aVar2.d();
        if (this.h) {
            return new e(this.a, aVar2, this.b, this.d, this.g);
        }
        return new com.moloco.sdk.internal.publisher.nativead.ui.d(this.a, aVar2, this.b, this.c, this.d, this.g);
    }

    public final ViewGroup a(Uri uri) {
        return new com.moloco.sdk.internal.publisher.nativead.ui.c(this.a, uri, this.d, this.g, null, null, 48, null);
    }

    public final void a() {
        ViewParent viewParent = this.l;
        k kVar = viewParent instanceof k ? (k) viewParent : null;
        if (kVar != null) {
            kVar.destroy();
        }
        this.l = null;
    }

    public final void a(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, o, "Detaching view " + viewGroup.getClass().getSimpleName() + " from parent " + viewGroup2.getClass().getSimpleName(), null, false, 12, null);
            viewGroup2.removeView(viewGroup);
        }
    }
}
