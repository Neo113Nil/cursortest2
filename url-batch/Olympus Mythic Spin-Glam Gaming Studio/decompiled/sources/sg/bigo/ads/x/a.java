package sg.bigo.ads.x;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.c;
import sg.bigo.ads.ad.interstitial.r;
import sg.bigo.ads.ad.interstitial.t;
import sg.bigo.ads.ad.interstitial.u;
import sg.bigo.ads.ad.interstitial.x;
import sg.bigo.ads.ai.o;
import sg.bigo.ads.api.VideoController;
import sg.bigo.ads.as.a;

/* loaded from: classes10.dex */
public class a extends r {
    protected x a;

    @Nullable
    protected o b;
    private final a.AbstractC1841a c;
    private boolean d;

    protected a(@NonNull Activity activity) {
        super(activity);
        this.c = new a.AbstractC1841a() { // from class: sg.bigo.ads.x.a.1
            @Override // sg.bigo.ads.as.a.AbstractC1841a
            public final void a(boolean z) {
                a aVar = a.this;
                if (z) {
                    aVar.ag();
                } else {
                    aVar.ai();
                }
            }
        };
        this.d = true;
    }

    protected void a() {
        if (this.C == null) {
            return;
        }
        int i = this.a.c;
        if (((t) this.A).f().y() != 4) {
            i = 0;
        }
        this.C.a(i, (AdCountDownButton.b) null);
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public int ac() {
        return R.layout.bigo_ad_activity_interstitial_vpaid;
    }

    @Override // sg.bigo.ads.ad.interstitial.i
    public final boolean ad() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void g(int i) {
        super.g(i);
        if (this.F == null) {
            a("can not find ad root view.");
            return;
        }
        if (this.A == 0) {
            a("Illegal InterstitialAd.");
            return;
        }
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null) {
            sg.bigo.ads.as.a.a(adCountDownButton, this.c);
            this.C.setShowCloseButtonInCountdown(false);
            this.C.setTakeoverTickEvent(false);
            if (this.C.getVisibility() != 0) {
                this.C.setVisibility(0);
                c.b((View) this.C);
            }
            a();
        }
        ViewGroup viewGroup = this.F;
        if (viewGroup != null && this.E != null) {
            TextView textView = (TextView) viewGroup.findViewById(R.id.inter_advertiser);
            TextView textView2 = (TextView) this.F.findViewById(R.id.inter_ad_label);
            String advertiser = this.E.getAdvertiser();
            if (textView != null && textView2 != null) {
                boolean isEmpty = TextUtils.isEmpty(advertiser);
                textView.setVisibility(!isEmpty ? 0 : 8);
                if (!isEmpty) {
                    textView.setText(advertiser);
                    textView2.setText(R.string.bigo_ad_tag);
                }
            }
        }
        u an = an();
        ViewGroup viewGroup2 = this.F;
        an.a(viewGroup2, viewGroup2, am(), 12, this.a.i, this.C);
    }

    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public final void h() {
        super.h();
        VideoController ao = ao();
        if (ao != null && ao.isPaused() && this.d) {
            ao.play();
            this.d = false;
        }
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton == null || adCountDownButton.c) {
            return;
        }
        adCountDownButton.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    @CallSuper
    public final void j() {
        VideoController ao = ao();
        boolean z = ao != null && ao.isPlaying();
        this.d = z;
        if (z) {
            ao.pause();
        }
        AdCountDownButton adCountDownButton = this.C;
        if (adCountDownButton != null && !adCountDownButton.c) {
            adCountDownButton.b();
        }
        super.j();
    }

    @Override // sg.bigo.ads.ad.interstitial.r, sg.bigo.ads.ad.interstitial.i
    public void m() {
        super.m();
        this.b = ((t) this.A).f().e();
        x xVar = new x();
        o oVar = this.b;
        if (oVar != null) {
            xVar.f = oVar.c("video_play_page.media_view_clickable_switch");
            xVar.g = this.b.c("video_play_page.other_space_clickable_switch");
            xVar.i = this.b.a("video_play_page.click_type");
            xVar.c = this.b.a("video_play_page.force_staying_time");
        }
        this.a = xVar;
    }

    @Override // sg.bigo.ads.ad.interstitial.r
    public final int o() {
        return 0;
    }
}
