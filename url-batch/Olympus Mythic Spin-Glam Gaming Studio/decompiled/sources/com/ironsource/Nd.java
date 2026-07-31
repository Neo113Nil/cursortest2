package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* loaded from: classes11.dex */
public class Nd extends C4763m3 {
    private static final Nd d = new Nd();
    private InterfaceC4860rb b = null;
    private InterfaceC4860rb c = null;

    class a implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ AdInfo b;

        a(boolean z, AdInfo adInfo) {
            this.a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Nd nd = Nd.this;
            InterfaceC4860rb interfaceC4860rb = nd.b;
            if (interfaceC4860rb != null) {
                if (!this.a) {
                    ((InterfaceC4878sb) interfaceC4860rb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC4878sb) interfaceC4860rb).d(nd.a(this.b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Nd.this.a(this.b));
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ C4684hd a;
        final /* synthetic */ AdInfo b;

        b(C4684hd c4684hd, AdInfo adInfo) {
            this.a = c4684hd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Nd nd = Nd.this;
            InterfaceC4860rb interfaceC4860rb = nd.c;
            if (interfaceC4860rb != null) {
                interfaceC4860rb.b(this.a, nd.a(this.b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.a + ", adInfo = " + Nd.this.a(this.b));
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ C4684hd a;
        final /* synthetic */ AdInfo b;

        c(C4684hd c4684hd, AdInfo adInfo) {
            this.a = c4684hd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Nd nd = Nd.this;
            InterfaceC4860rb interfaceC4860rb = nd.b;
            if (interfaceC4860rb != null) {
                interfaceC4860rb.b(this.a, nd.a(this.b));
                IronLog.CALLBACK.info("onAdRewarded() placement = " + this.a + ", adInfo = " + Nd.this.a(this.b));
            }
        }
    }

    class d implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Nd nd = Nd.this;
            InterfaceC4860rb interfaceC4860rb = nd.c;
            if (interfaceC4860rb != null) {
                interfaceC4860rb.a(this.a, nd.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Nd.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    class e implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        e(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Nd nd = Nd.this;
            InterfaceC4860rb interfaceC4860rb = nd.b;
            if (interfaceC4860rb != null) {
                interfaceC4860rb.a(this.a, nd.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + Nd.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    class f implements Runnable {
        final /* synthetic */ C4684hd a;
        final /* synthetic */ AdInfo b;

        f(C4684hd c4684hd, AdInfo adInfo) {
            this.a = c4684hd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Nd nd = Nd.this;
            InterfaceC4860rb interfaceC4860rb = nd.c;
            if (interfaceC4860rb != null) {
                interfaceC4860rb.a(this.a, nd.a(this.b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.a + ", adInfo = " + Nd.this.a(this.b));
            }
        }
    }

    class g implements Runnable {
        final /* synthetic */ C4684hd a;
        final /* synthetic */ AdInfo b;

        g(C4684hd c4684hd, AdInfo adInfo) {
            this.a = c4684hd;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Nd nd = Nd.this;
            InterfaceC4860rb interfaceC4860rb = nd.b;
            if (interfaceC4860rb != null) {
                interfaceC4860rb.a(this.a, nd.a(this.b));
                IronLog.CALLBACK.info("onAdClicked() placement = " + this.a + ", adInfo = " + Nd.this.a(this.b));
            }
        }
    }

    class h implements Runnable {
        final /* synthetic */ AdInfo a;

        h(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Nd nd = Nd.this;
            InterfaceC4860rb interfaceC4860rb = nd.c;
            if (interfaceC4860rb != null) {
                ((InterfaceC4896tb) interfaceC4860rb).a(nd.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Nd.this.a(this.a));
            }
        }
    }

    class i implements Runnable {
        final /* synthetic */ AdInfo a;

        i(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Nd nd = Nd.this;
            InterfaceC4860rb interfaceC4860rb = nd.b;
            if (interfaceC4860rb != null) {
                ((InterfaceC4896tb) interfaceC4860rb).a(nd.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + Nd.this.a(this.a));
            }
        }
    }

    class j implements Runnable {
        final /* synthetic */ IronSourceError a;

        j(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4860rb interfaceC4860rb = Nd.this.c;
            if (interfaceC4860rb != null) {
                ((InterfaceC4896tb) interfaceC4860rb).b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    class k implements Runnable {
        final /* synthetic */ IronSourceError a;

        k(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4860rb interfaceC4860rb = Nd.this.b;
            if (interfaceC4860rb != null) {
                ((InterfaceC4896tb) interfaceC4860rb).b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    class l implements Runnable {
        final /* synthetic */ AdInfo a;

        l(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Nd nd = Nd.this;
            InterfaceC4860rb interfaceC4860rb = nd.c;
            if (interfaceC4860rb != null) {
                interfaceC4860rb.c(nd.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Nd.this.a(this.a));
            }
        }
    }

    class m implements Runnable {
        final /* synthetic */ AdInfo a;

        m(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Nd nd = Nd.this;
            InterfaceC4860rb interfaceC4860rb = nd.b;
            if (interfaceC4860rb != null) {
                interfaceC4860rb.c(nd.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + Nd.this.a(this.a));
            }
        }
    }

    class n implements Runnable {
        final /* synthetic */ AdInfo a;

        n(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Nd nd = Nd.this;
            InterfaceC4860rb interfaceC4860rb = nd.c;
            if (interfaceC4860rb != null) {
                interfaceC4860rb.b(nd.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Nd.this.a(this.a));
            }
        }
    }

    class o implements Runnable {
        final /* synthetic */ AdInfo a;

        o(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Nd nd = Nd.this;
            InterfaceC4860rb interfaceC4860rb = nd.b;
            if (interfaceC4860rb != null) {
                interfaceC4860rb.b(nd.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + Nd.this.a(this.a));
            }
        }
    }

    class p implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ AdInfo b;

        p(boolean z, AdInfo adInfo) {
            this.a = z;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            Nd nd = Nd.this;
            InterfaceC4860rb interfaceC4860rb = nd.c;
            if (interfaceC4860rb != null) {
                if (!this.a) {
                    ((InterfaceC4878sb) interfaceC4860rb).a();
                    IronLog.CALLBACK.info("onAdUnavailable()");
                    return;
                }
                ((InterfaceC4878sb) interfaceC4860rb).d(nd.a(this.b));
                IronLog.CALLBACK.info("onAdAvailable() adInfo = " + Nd.this.a(this.b));
            }
        }
    }

    private Nd() {
    }

    public void b() {
    }

    public void c() {
    }

    public static Nd a() {
        return d;
    }

    public void b(InterfaceC4860rb interfaceC4860rb) {
        this.c = interfaceC4860rb;
    }

    public void c(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new l(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new m(adInfo));
        }
    }

    public void d(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(adInfo));
            return;
        }
        InterfaceC4860rb interfaceC4860rb = this.b;
        if (interfaceC4860rb == null || !(interfaceC4860rb instanceof InterfaceC4896tb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(adInfo));
    }

    public void a(InterfaceC4860rb interfaceC4860rb) {
        this.b = interfaceC4860rb;
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new o(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(ironSourceError));
            return;
        }
        InterfaceC4860rb interfaceC4860rb = this.b;
        if (interfaceC4860rb == null || !(interfaceC4860rb instanceof InterfaceC4896tb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(ironSourceError));
    }

    public void b(C4684hd c4684hd, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(c4684hd, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(c4684hd, adInfo));
        }
    }

    public void a(boolean z, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new p(z, adInfo));
            return;
        }
        InterfaceC4860rb interfaceC4860rb = this.b;
        if (interfaceC4860rb == null || !(interfaceC4860rb instanceof InterfaceC4878sb)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(z, adInfo));
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(ironSourceError, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(ironSourceError, adInfo));
        }
    }

    public void a(C4684hd c4684hd, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(c4684hd, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(c4684hd, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
