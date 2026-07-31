package io.bidmachine.internal;

import android.view.View;
import android.view.ViewGroup;
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
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.measurer.AdMeasurer;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public abstract class r implements AdMeasurer {
    private final boolean a;
    private final AtomicBoolean b;
    private final AtomicBoolean c;
    private AdSession d;
    private AdEvents e;
    private MediaEvents f;
    private WeakReference g;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (r.this.f != null) {
                    r.this.f.resume();
                    r.this.b("onMediaResumed");
                }
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ float a;

        b(float f) {
            this.a = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (r.this.f != null) {
                    r.this.f.volumeChange(this.a);
                    r.this.b("onMediaVolumeChanged");
                }
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (r.this.f != null) {
                    r.this.f.skipped();
                    r.this.b("onMediaSkipped");
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
                r.this.f = null;
                r.this.e = null;
                if (r.this.d != null) {
                    r.this.d.finish();
                }
                r.this.b("destroy");
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
                if (r.this.d != null) {
                    r.this.d.error(this.a, this.b);
                    r.this.b("error");
                }
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    class f implements Runnable {
        final /* synthetic */ ViewGroup a;

        f(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (r.this.d != null) {
                    r rVar = r.this;
                    rVar.a(rVar.d, this.a);
                } else {
                    r.this.g = new WeakReference(this.a);
                }
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (r.this.e != null) {
                    r.this.e.impressionOccurred();
                    r.this.b("onAdShown");
                }
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (r.this.f != null) {
                    r.this.f.adUserInteraction(InteractionType.CLICK);
                    r.this.b(Zf.f);
                }
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    class i implements Runnable {
        final /* synthetic */ float a;
        final /* synthetic */ float b;

        i(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (r.this.f != null) {
                    r.this.f.start(this.a / 1000.0f, this.b);
                    r.this.b("onMediaStarted");
                }
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (r.this.f != null) {
                    r.this.f.firstQuartile();
                    r.this.b("onMediaFirstQuartile");
                }
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (r.this.f != null) {
                    r.this.f.midpoint();
                    r.this.b("onMediaMidpoint");
                }
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (r.this.f != null) {
                    r.this.f.thirdQuartile();
                    r.this.b("onMediaThirdQuartile");
                }
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                r.this.onMediaSkipped();
                if (r.this.f != null) {
                    r.this.f.complete();
                    r.this.b("onMediaCompleted");
                }
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (r.this.f != null) {
                    r.this.f.pause();
                    r.this.b("onMediaPaused");
                }
            } catch (Throwable th) {
                Logger.w(th);
            }
        }
    }

    public r() {
        this(false);
    }

    protected abstract void a(AdEvents adEvents);

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    public void onAdClicked() {
        Utils.onUiThread(new h());
    }

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    public void onAdShown() {
        if (this.a) {
            return;
        }
        c();
    }

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    public void onAdViewReady(View view) {
    }

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    public void onError(IabError iabError) {
        a(iabError.getMessage());
    }

    public void onMediaCompleted() {
        Utils.onUiThread(new m());
    }

    public void onMediaFirstQuartile() {
        Utils.onUiThread(new j());
    }

    public void onMediaMidpoint() {
        Utils.onUiThread(new k());
    }

    public void onMediaPaused() {
        Utils.onUiThread(new n());
    }

    public void onMediaResumed() {
        Utils.onUiThread(new a());
    }

    public void onMediaSkipped() {
        if (this.c.compareAndSet(false, true)) {
            Utils.onUiThread(new c());
        }
    }

    public void onMediaStarted(float f2, float f3) {
        Utils.onUiThread(new i(f2, f3));
    }

    public void onMediaThirdQuartile() {
        Utils.onUiThread(new l());
    }

    public void onMediaVolumeChanged(float f2) {
        Utils.onUiThread(new b(f2));
    }

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    public void registerAdContainer(ViewGroup viewGroup) {
        Utils.onUiThread(new f(viewGroup));
    }

    @Override // io.bidmachine.iab.measurer.AdMeasurer
    public void registerAdView(View view) {
    }

    public r(boolean z) {
        this.a = z;
        this.b = new AtomicBoolean(false);
        this.c = new AtomicBoolean(false);
    }

    protected boolean b() {
        return this.d != null;
    }

    public void c() {
        if (this.b.compareAndSet(false, true)) {
            Utils.onUiThread(new g());
        }
    }

    protected void b(String str) {
        Logger.d("AdMeasurer", str);
    }

    protected void a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        try {
            AdSession createAdSession = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
            this.d = createAdSession;
            this.e = AdEvents.createAdEvents(createAdSession);
            if (adSessionConfiguration.isNativeMediaEventsOwner()) {
                this.f = MediaEvents.createMediaEvents(this.d);
            }
            a(this.d);
            this.d.start();
            a(this.e);
            b("prepareAdSession");
        } catch (Throwable th) {
            Logger.w(th);
        }
    }

    private void a(AdSession adSession) {
        WeakReference weakReference = this.g;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view != null) {
            a(adSession, view);
        }
        this.g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AdSession adSession, View view) {
        adSession.registerAdView(view);
        b("registerAdView");
    }

    public void a() {
        Utils.onUiThread(new d());
    }

    public void a(String str) {
        a(ErrorType.GENERIC, str);
    }

    private void a(ErrorType errorType, String str) {
        Utils.onUiThread(new e(errorType, str));
    }
}
