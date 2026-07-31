package sg.bigo.ads.ad.splash;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.SplashAdInteractionListener;

/* loaded from: classes6.dex */
public class c implements SplashAdInteractionListener {
    private boolean a;

    @Nullable
    SplashAdInteractionListener b;

    @Nullable
    SplashAdInteractionListener c;
    private boolean d = false;

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdClicked() {
        SplashAdInteractionListener splashAdInteractionListener = this.b;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdClicked();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.c;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdClicked();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdClosed() {
        SplashAdInteractionListener splashAdInteractionListener = this.b;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdClosed();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.c;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdClosed();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdError(@NonNull AdError adError) {
        if (adError.getCode() == 2002 && this.d) {
            return;
        }
        SplashAdInteractionListener splashAdInteractionListener = this.b;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdError(adError);
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.c;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdError(adError);
        }
    }

    @Override // sg.bigo.ads.api.SplashAdInteractionListener
    public void onAdFinished() {
        if (this.a) {
            return;
        }
        SplashAdInteractionListener splashAdInteractionListener = this.b;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdFinished();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.c;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdFinished();
        }
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdImpression() {
        SplashAdInteractionListener splashAdInteractionListener = this.b;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdImpression();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.c;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdImpression();
        }
        this.d = true;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public void onAdOpened() {
        SplashAdInteractionListener splashAdInteractionListener = this.b;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdOpened();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.c;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdOpened();
        }
    }

    @Override // sg.bigo.ads.api.SplashAdInteractionListener
    public void onAdSkipped() {
        SplashAdInteractionListener splashAdInteractionListener = this.b;
        if (splashAdInteractionListener != null) {
            splashAdInteractionListener.onAdSkipped();
        }
        SplashAdInteractionListener splashAdInteractionListener2 = this.c;
        if (splashAdInteractionListener2 != null) {
            splashAdInteractionListener2.onAdSkipped();
        }
        this.a = true;
    }
}
