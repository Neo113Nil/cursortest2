package com.inmobi.media;

import android.app.Activity;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class F0 {
    public static B0 b;
    public static CoroutineScope e;
    public static CoroutineScope f;
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.F0$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return F0.a();
        }
    });
    public static final Lazy c = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.F0$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return F0.b();
        }
    });
    public static final C0 d = new C0();

    public static final I0 a() {
        return new I0(AbstractC4334s9.b());
    }

    public static final CopyOnWriteArrayList b() {
        return new CopyOnWriteArrayList();
    }

    public static void a(Activity activity, GestureDetectorOnGestureListenerC4476xi renderView, String beaconUrl, boolean z, JSONObject extras, C4055hi listener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(beaconUrl, "url");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(listener, "listener");
        renderView.getAdQualityManager().a(activity, beaconUrl, z, extras, listener);
        B0 b0 = b;
        if (b0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            b0 = null;
        }
        b0.getClass();
        Intrinsics.checkNotNullParameter(beaconUrl, "beaconUrl");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b0.c.put(beaconUrl, new WeakReference(listener));
        String creativeID = renderView.getCreativeID();
        if (creativeID.length() > 0) {
            C4277q4 c4277q4 = AbstractC4015g4.a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            AdConfig adConfig = (AdConfig) AbstractC4015g4.a.a(AdConfig.class);
            Lazy lazy = c;
            if (((CopyOnWriteArrayList) lazy.getValue()).size() < adConfig.getAdReport().getCridls()) {
                ((CopyOnWriteArrayList) lazy.getValue()).add(creativeID);
            }
        }
    }

    public static void a(GestureDetectorOnGestureListenerC4476xi adView, GestureDetectorOnGestureListenerC4476xi renderView, String beaconUrl, boolean z, JSONObject extras, C4055hi listener) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(beaconUrl, "url");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(listener, "listener");
        renderView.getAdQualityManager().a(adView, beaconUrl, z, extras, listener);
        B0 b0 = b;
        if (b0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            b0 = null;
        }
        b0.getClass();
        Intrinsics.checkNotNullParameter(beaconUrl, "beaconUrl");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b0.c.put(beaconUrl, new WeakReference(listener));
        String creativeID = renderView.getCreativeID();
        if (creativeID.length() > 0) {
            C4277q4 c4277q4 = AbstractC4015g4.a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            AdConfig adConfig = (AdConfig) AbstractC4015g4.a.a(AdConfig.class);
            Lazy lazy = c;
            if (((CopyOnWriteArrayList) lazy.getValue()).size() < adConfig.getAdReport().getCridls()) {
                ((CopyOnWriteArrayList) lazy.getValue()).add(creativeID);
            }
        }
    }
}
