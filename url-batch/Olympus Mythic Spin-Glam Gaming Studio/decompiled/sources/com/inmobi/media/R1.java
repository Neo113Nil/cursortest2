package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes13.dex */
public final class R1 extends C3956e2 {
    public final X1 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(Context context, C4431w0 placement, C3853a2 c3853a2) {
        super(context, placement, c3853a2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.K = new X1();
    }

    @Override // com.inmobi.media.C3956e2
    public final boolean W() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
            c4493y9.c("m1", "canProceedToLoad");
        }
        F();
        if (1 == this.b || 2 == this.b) {
            Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
            Xb.a((byte) 1, "m1", "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                c4493y92.b("m1", "ad load in progress. ignore load");
            }
            b((short) 53);
            return false;
        }
        if (7 == this.b) {
            b(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_ACTIVE), false, (short) 15);
            Xb.a((byte) 1, "InMobi", "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: " + this.l.a);
            C4493y9 c4493y93 = this.i;
            if (c4493y93 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                c4493y93.b("m1", "Ad is active. ignore load");
            }
            return false;
        }
        if (this.b == 4) {
            if (!A()) {
                C4493y9 c4493y94 = this.i;
                if (c4493y94 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                    c4493y94.c("m1", "signalCanShowForStateReady");
                }
                C4493y9 c4493y95 = this.i;
                if (c4493y95 != null) {
                    Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                    c4493y95.a("m1", "An ad is ready with the ad unit. Signaling ad load success ...");
                }
                AbstractC4038h1 n = n();
                if (n == null) {
                    Xb.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
                    C4493y9 c4493y96 = this.i;
                    if (c4493y96 != null) {
                        Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                        c4493y96.b("m1", "listener is null. load show callback missed");
                    }
                } else {
                    C4493y9 c4493y97 = this.i;
                    if (c4493y97 != null) {
                        Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                        c4493y97.a("m1", "callback - onLoadSuccess");
                    }
                    d(n);
                }
                return false;
            }
            C4493y9 c4493y98 = this.i;
            if (c4493y98 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                c4493y98.b("m1", "ad is expired, clearing");
            }
            d();
        }
        E();
        return true;
    }

    @Override // com.inmobi.media.C3956e2, com.inmobi.media.AbstractC4528zi
    public final void a(Z1 audioStatusInternal) {
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        AbstractC4038h1 n = n();
        if (n != null) {
            n.a(audioStatusInternal);
        }
        X1 x1 = this.K;
        x1.getClass();
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
        if (!x1.a && audioStatusInternal == Z1.e) {
            x1.a = true;
            C3938d9 c3938d9 = C3938d9.c;
            c3938d9.a = System.currentTimeMillis();
            c3938d9.b++;
        }
    }

    public final void d0() {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
            c4493y9.d("m1", "AdUnit " + this + " state - CREATED");
        }
        c((byte) 0);
        f((short) 2153);
    }

    public final void f(short s) {
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
            c4493y9.c("m1", "onShowFailure");
        }
        AbstractC4038h1 n = n();
        if (n == null) {
            Xb.a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                c4493y92.b("m1", "listener is null. show fail callback missed. ");
            }
        } else {
            C4493y9 c4493y93 = this.i;
            if (c4493y93 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                c4493y93.b("m1", "callback - onAdShowFailed");
            }
            n.b();
        }
        if (s != 0) {
            C4493y9 c4493y94 = this.i;
            if (c4493y94 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                c4493y94.b("m1", "show failed - " + ((int) s));
            }
            d(s);
        }
    }

    @Override // com.inmobi.media.C3956e2, com.inmobi.media.AbstractC4168m1, com.inmobi.media.AbstractC4528zi
    public final void i(GestureDetectorOnGestureListenerC4476xi renderView) {
        AbstractC4038h1 n;
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        C4493y9 c4493y9 = this.i;
        if (c4493y9 != null) {
            Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
            c4493y9.c("m1", "onRenderViewVisible");
        }
        if (this.b == 4 && (n = n()) != null) {
            C4493y9 c4493y92 = this.i;
            if (c4493y92 != null) {
                Intrinsics.checkNotNullExpressionValue("m1", "<get-TAG>(...)");
                c4493y92.a("m1", "callback - onAdDisplayed");
            }
            a(n);
        }
        super.i(renderView);
    }

    @Override // com.inmobi.media.C3956e2, com.inmobi.media.AbstractC4168m1
    public final String m() {
        return "audio";
    }

    @Override // com.inmobi.media.C3956e2, com.inmobi.media.AbstractC4528zi
    public final void a(boolean z) {
        Context context = AbstractC4002fj.a;
        if (context == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Qa a = Pa.a(context, "audio_pref_file");
        Intrinsics.checkNotNullParameter("user_mute_count", "key");
        int i = a.a.getInt("user_mute_count", 0);
        a.a("user_mute_count", z ? Math.max(0, i - 1) : i + 1, false);
    }
}
