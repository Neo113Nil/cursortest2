package yads;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;

/* loaded from: classes14.dex */
public final class os3 implements x00 {
    public final NativeAdEventListener a;

    public os3(NativeAdEventListener nativeAdEventListener) {
        this.a = nativeAdEventListener;
    }

    @Override // yads.x00
    public final void a() {
    }

    @Override // yads.x00
    public final void a(y4 y4Var) {
        new CallbackStackTraceMarker(new ns3(this, y4Var != null ? new xq3(y4Var) : null));
    }

    @Override // yads.x00
    public final void onAdClicked() {
        new CallbackStackTraceMarker(new ms3(this));
    }

    @Override // yads.x00
    public final void onLeftApplication() {
    }

    @Override // yads.x00
    public final void onReturnedToApplication() {
    }
}
