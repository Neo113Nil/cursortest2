package io.bidmachine.ads.networks.adaptiverendering.measurer;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.iab.omid.library.appodeal.adsession.AdEvents;
import com.iab.omid.library.appodeal.adsession.AdSession;
import com.iab.omid.library.appodeal.adsession.AdSessionConfiguration;
import com.iab.omid.library.appodeal.adsession.AdSessionContext;
import com.iab.omid.library.appodeal.adsession.ErrorType;
import com.iab.omid.library.appodeal.adsession.media.InteractionType;
import com.iab.omid.library.appodeal.adsession.media.MediaEvents;
import com.ironsource.Zf;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.rendering.measurer.Measurer;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.utils.Tag;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public abstract class OMMeasurer<AdView extends View> implements Measurer<AdView> {

    @Nullable
    private AdEvents adEvents;

    @Nullable
    private AdSession adSession;

    @Nullable
    protected MediaEvents mediaEvents;

    @NonNull
    private final Tag tag = new Tag("OMMeasurer");

    @NonNull
    private final AtomicBoolean isLoadedTracked = new AtomicBoolean(false);

    @NonNull
    private final AtomicBoolean isShownTracked = new AtomicBoolean(false);

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!OMMeasurer.this.isSessionPrepared() || OMMeasurer.this.adEvents == null) {
                    return;
                }
                OMMeasurer.this.adEvents.impressionOccurred();
                OMMeasurer.this.log("onAdShown");
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MediaEvents mediaEvents = OMMeasurer.this.mediaEvents;
                if (mediaEvents != null) {
                    mediaEvents.adUserInteraction(InteractionType.CLICK);
                    OMMeasurer.this.log(Zf.f);
                }
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ Runnable a;
        final /* synthetic */ Handler b;

        c(Runnable runnable, Handler handler) {
            this.a = runnable;
            this.b = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                OMMeasurer oMMeasurer = OMMeasurer.this;
                oMMeasurer.mediaEvents = null;
                oMMeasurer.adEvents = null;
                if (OMMeasurer.this.adSession != null) {
                    OMMeasurer.this.adSession.finish();
                }
                OMMeasurer.this.log("destroy");
                Runnable runnable = this.a;
                if (runnable != null) {
                    this.b.postDelayed(runnable, OMMeasurer.this.getDestroyDelayMs());
                }
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!OMMeasurer.this.isSessionPrepared() || OMMeasurer.this.adEvents == null) {
                    return;
                }
                OMMeasurer oMMeasurer = OMMeasurer.this;
                oMMeasurer.onAdLoaded(oMMeasurer.adEvents);
                OMMeasurer.this.log(Zf.j);
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    class e implements Runnable {
        final /* synthetic */ ErrorType a;
        final /* synthetic */ String b;

        e(ErrorType errorType, String str) {
            this.a = errorType;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (OMMeasurer.this.adSession != null) {
                    OMMeasurer.this.adSession.error(this.a, this.b);
                    OMMeasurer.this.log("error");
                }
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    class f implements Runnable {
        final /* synthetic */ View a;

        f(View view) {
            this.a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (OMMeasurer.this.adSession != null) {
                    OMMeasurer.this.adSession.registerAdView(this.a);
                    OMMeasurer.this.log("registerView");
                }
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void destroy(@Nullable Runnable runnable) {
        Utils.onUiThread(new c(runnable, io.bidmachine.util.Utils.createHandlerWithMyOrMainLooper()));
    }

    protected long getDestroyDelayMs() {
        return 0L;
    }

    protected boolean isSessionPrepared() {
        return this.adSession != null;
    }

    protected void log(@NonNull String str) {
        Logger.d(this.tag, str);
    }

    @UiThread
    protected abstract void onAdLoaded(@NonNull AdEvents adEvents) throws Throwable;

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void onClicked() {
        Utils.onUiThread(new b());
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void onError(@NonNull Error error) {
        trackError(error.getMessage());
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void onShown() {
        if (this.isShownTracked.compareAndSet(false, true)) {
            Utils.onUiThread(new a());
        }
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void onViewAddedToContainer(@NonNull AdView adview, @NonNull ViewGroup viewGroup) {
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void onViewCreated(@NonNull AdView adview) {
    }

    @Override // io.bidmachine.rendering.measurer.Measurer
    public void onViewReady(@NonNull AdView adview) {
    }

    @UiThread
    protected void prepareAdSession(@NonNull AdSessionConfiguration adSessionConfiguration, @NonNull AdSessionContext adSessionContext) {
        try {
            AdSession createAdSession = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
            this.adSession = createAdSession;
            this.adEvents = AdEvents.createAdEvents(createAdSession);
            if (adSessionConfiguration.isNativeMediaEventsOwner()) {
                this.mediaEvents = MediaEvents.createMediaEvents(this.adSession);
            }
            this.adSession.start();
            log("prepareAdSession");
        } catch (Throwable th) {
            Logger.w(th);
        }
    }

    protected void registerView(@NonNull View view) {
        Utils.onUiThread(new f(view));
    }

    public void trackError(@NonNull String str) {
        trackError(ErrorType.GENERIC, str);
    }

    protected void trackLoaded() {
        if (this.isLoadedTracked.compareAndSet(false, true)) {
            Utils.onUiThread(new d());
        }
    }

    public void trackVideoError(@NonNull String str) {
        trackError(ErrorType.VIDEO, str);
    }

    private void trackError(@NonNull ErrorType errorType, @NonNull String str) {
        Utils.onUiThread(new e(errorType, str));
    }
}
