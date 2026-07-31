package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* renamed from: com.ironsource.d8, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C4607d8 extends C4763m3 {
    private static final C4607d8 d = new C4607d8();
    private InterfaceC4646fb b = null;
    private InterfaceC4646fb c = null;

    /* renamed from: com.ironsource.d8$a */
    class a implements Runnable {
        final /* synthetic */ AdInfo a;

        a(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4607d8 c4607d8 = C4607d8.this;
            InterfaceC4646fb interfaceC4646fb = c4607d8.b;
            if (interfaceC4646fb != null) {
                interfaceC4646fb.e(c4607d8.a(this.a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C4607d8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.d8$b */
    class b implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        b(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4607d8 c4607d8 = C4607d8.this;
            InterfaceC4646fb interfaceC4646fb = c4607d8.c;
            if (interfaceC4646fb != null) {
                interfaceC4646fb.a(this.a, c4607d8.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C4607d8.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.d8$c */
    class c implements Runnable {
        final /* synthetic */ IronSourceError a;
        final /* synthetic */ AdInfo b;

        c(IronSourceError ironSourceError, AdInfo adInfo) {
            this.a = ironSourceError;
            this.b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4607d8 c4607d8 = C4607d8.this;
            InterfaceC4646fb interfaceC4646fb = c4607d8.b;
            if (interfaceC4646fb != null) {
                interfaceC4646fb.a(this.a, c4607d8.a(this.b));
                IronLog.CALLBACK.info("onAdShowFailed() adInfo = " + C4607d8.this.a(this.b) + ", error = " + this.a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.d8$d */
    class d implements Runnable {
        final /* synthetic */ AdInfo a;

        d(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4607d8 c4607d8 = C4607d8.this;
            InterfaceC4646fb interfaceC4646fb = c4607d8.c;
            if (interfaceC4646fb != null) {
                interfaceC4646fb.d(c4607d8.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4607d8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.d8$e */
    class e implements Runnable {
        final /* synthetic */ AdInfo a;

        e(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4607d8 c4607d8 = C4607d8.this;
            InterfaceC4646fb interfaceC4646fb = c4607d8.b;
            if (interfaceC4646fb != null) {
                interfaceC4646fb.d(c4607d8.a(this.a));
                IronLog.CALLBACK.info("onAdClicked() adInfo = " + C4607d8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.d8$f */
    class f implements Runnable {
        final /* synthetic */ AdInfo a;

        f(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4607d8 c4607d8 = C4607d8.this;
            InterfaceC4646fb interfaceC4646fb = c4607d8.c;
            if (interfaceC4646fb != null) {
                interfaceC4646fb.a(c4607d8.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C4607d8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.d8$g */
    class g implements Runnable {
        final /* synthetic */ AdInfo a;

        g(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4607d8 c4607d8 = C4607d8.this;
            InterfaceC4646fb interfaceC4646fb = c4607d8.b;
            if (interfaceC4646fb != null) {
                interfaceC4646fb.a(c4607d8.a(this.a));
                IronLog.CALLBACK.info("onAdReady() adInfo = " + C4607d8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.d8$h */
    class h implements Runnable {
        final /* synthetic */ IronSourceError a;

        h(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4646fb interfaceC4646fb = C4607d8.this.c;
            if (interfaceC4646fb != null) {
                interfaceC4646fb.b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.d8$i */
    class i implements Runnable {
        final /* synthetic */ IronSourceError a;

        i(IronSourceError ironSourceError) {
            this.a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4646fb interfaceC4646fb = C4607d8.this.b;
            if (interfaceC4646fb != null) {
                interfaceC4646fb.b(this.a);
                IronLog.CALLBACK.info("onAdLoadFailed() error = " + this.a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.d8$j */
    class j implements Runnable {
        final /* synthetic */ AdInfo a;

        j(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4607d8 c4607d8 = C4607d8.this;
            InterfaceC4646fb interfaceC4646fb = c4607d8.c;
            if (interfaceC4646fb != null) {
                interfaceC4646fb.c(c4607d8.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C4607d8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.d8$k */
    class k implements Runnable {
        final /* synthetic */ AdInfo a;

        k(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4607d8 c4607d8 = C4607d8.this;
            InterfaceC4646fb interfaceC4646fb = c4607d8.b;
            if (interfaceC4646fb != null) {
                interfaceC4646fb.c(c4607d8.a(this.a));
                IronLog.CALLBACK.info("onAdOpened() adInfo = " + C4607d8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.d8$l */
    class l implements Runnable {
        final /* synthetic */ AdInfo a;

        l(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4607d8 c4607d8 = C4607d8.this;
            InterfaceC4646fb interfaceC4646fb = c4607d8.c;
            if (interfaceC4646fb != null) {
                interfaceC4646fb.b(c4607d8.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C4607d8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.d8$m */
    class m implements Runnable {
        final /* synthetic */ AdInfo a;

        m(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4607d8 c4607d8 = C4607d8.this;
            InterfaceC4646fb interfaceC4646fb = c4607d8.b;
            if (interfaceC4646fb != null) {
                interfaceC4646fb.b(c4607d8.a(this.a));
                IronLog.CALLBACK.info("onAdClosed() adInfo = " + C4607d8.this.a(this.a));
            }
        }
    }

    /* renamed from: com.ironsource.d8$n */
    class n implements Runnable {
        final /* synthetic */ AdInfo a;

        n(AdInfo adInfo) {
            this.a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4607d8 c4607d8 = C4607d8.this;
            InterfaceC4646fb interfaceC4646fb = c4607d8.c;
            if (interfaceC4646fb != null) {
                interfaceC4646fb.e(c4607d8.a(this.a));
                IronLog.CALLBACK.info("onAdShowSucceeded() adInfo = " + C4607d8.this.a(this.a));
            }
        }
    }

    private C4607d8() {
    }

    public static synchronized C4607d8 a() {
        C4607d8 c4607d8;
        synchronized (C4607d8.class) {
            c4607d8 = d;
        }
        return c4607d8;
    }

    public synchronized void b(InterfaceC4646fb interfaceC4646fb) {
        this.c = interfaceC4646fb;
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
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new j(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new k(adInfo));
        }
    }

    public void e(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new f(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new g(adInfo));
        }
    }

    public void f(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new n(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(adInfo));
        }
    }

    public synchronized void a(InterfaceC4646fb interfaceC4646fb) {
        this.b = interfaceC4646fb;
    }

    public void b(AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new d(adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new e(adInfo));
        }
    }

    public void a(IronSourceError ironSourceError) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new h(ironSourceError));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new i(ironSourceError));
        }
    }

    public void a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new b(ironSourceError, adInfo));
        } else if (this.b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new c(ironSourceError, adInfo));
        }
    }

    private void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
