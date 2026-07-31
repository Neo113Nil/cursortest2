package sg.bigo.ads.q;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.v;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* loaded from: classes15.dex */
public class b extends e {
    public b(@NonNull Activity activity) {
        super(activity);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final int a() {
        return R.layout.bigo_ad_activity_interstitial_landingpage_7_8;
    }

    @Override // sg.bigo.ads.q.e, sg.bigo.ads.controller.landing.c, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void b() {
        super.b();
        View q = q(R.id.inter_webview_close);
        LandingPageStyleConfig landingPageStyleConfig = ((e) this).a;
        if (landingPageStyleConfig == null || q == null || landingPageStyleConfig.a != 8) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q.getLayoutParams();
        layoutParams.gravity = 8388661;
        layoutParams.rightMargin = sg.bigo.ads.common.utils.f.a(this.N, 20);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void c() {
        final View q = q(R.id.inter_webview_close);
        v.a(q, new v.a() { // from class: sg.bigo.ads.q.b.1
            @Override // sg.bigo.ads.common.utils.v.a
            public final void a(View view, @NonNull Rect rect) {
                if (b.this.P != null) {
                    b.this.P.a(q, 1);
                }
            }
        });
    }
}
