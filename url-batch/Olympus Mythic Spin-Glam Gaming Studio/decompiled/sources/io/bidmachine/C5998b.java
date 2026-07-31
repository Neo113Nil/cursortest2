package io.bidmachine;

import com.explorestack.protobuf.openrtb.Response;
import io.bidmachine.ApiRequest;
import io.bidmachine.B;
import io.bidmachine.core.Logger;
import io.bidmachine.core.NetworkRequest;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.Tag;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.bidmachine.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C5998b {
    private final Tag a = new Tag("AdResponseLoader");
    private final String b;
    private a c;
    private C1773b d;

    /* renamed from: io.bidmachine.b$a */
    interface a {
        void a();

        void a(AdResponse adResponse);

        void a(BMError bMError);
    }

    /* renamed from: io.bidmachine.b$b, reason: collision with other inner class name */
    static class C1773b implements NetworkRequest.Callback, NetworkRequest.CancelCallback {
        private final String a;
        private final String b;
        private final AdRequestParameters c;
        private final NetworkAdUnitManager d;
        private final WeakReference e;
        private final AtomicBoolean f = new AtomicBoolean(false);
        private final AtomicBoolean g = new AtomicBoolean(false);

        public C1773b(String str, String str2, AdRequestParameters adRequestParameters, NetworkAdUnitManager networkAdUnitManager, a aVar) {
            this.a = str;
            this.b = str2;
            this.c = adRequestParameters;
            this.d = networkAdUnitManager;
            this.e = new WeakReference(aVar);
        }

        private a c() {
            if (a()) {
                return null;
            }
            this.f.set(true);
            return (a) this.e.get();
        }

        private void d() {
            a c = c();
            if (c != null) {
                c.a();
            }
            b();
        }

        @Override // io.bidmachine.core.NetworkRequest.CancelCallback
        public void onCanceled() {
            z.a().a(this.a);
            this.d.notifyNetworkClearAuction();
            d();
        }

        public void b() {
            this.g.set(true);
            this.e.clear();
        }

        @Override // io.bidmachine.core.NetworkRequest.Callback
        public void onFail(BMError bMError) {
            z.a().a(this.a);
            this.d.notifyNetworkAuctionResult(null);
            this.d.notifyNetworkClearAuction();
            AdResponse f = C5999c.a().f(this.c);
            if (f != null) {
                a(f);
            } else {
                a(bMError);
            }
        }

        @Override // io.bidmachine.core.NetworkRequest.Callback
        public void onSuccess(Response response) {
            z.a().a(this.a);
            UrlProvider.setAuctionUrlFromSuccessRequest(this.b);
            B.a(this.c, this.d, response, new a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a() {
            return this.g.get() || this.f.get() || this.e.get() == null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(AdResponse adResponse) {
            a c = c();
            if (c != null) {
                c.a(adResponse);
            } else {
                adResponse.setStatus(d.Idle);
            }
            b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(BMError bMError) {
            a c = c();
            if (c != null) {
                c.a(bMError);
            }
            b();
        }

        /* renamed from: io.bidmachine.b$b$a */
        class a implements B.a {
            a() {
            }

            @Override // io.bidmachine.B.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(AdResponse adResponse) {
                boolean a = C1773b.this.a();
                adResponse.setStatus(a ? d.Idle : d.Busy);
                C5999c.a().f(adResponse);
                if (a) {
                    adResponse.release();
                } else {
                    C1773b.this.d.notifyNetworkAuctionResult(adResponse.getWinnerNetworkAdUnit());
                    C1773b.this.a(adResponse);
                }
            }

            @Override // io.bidmachine.B.a
            public void a(BMError bMError) {
                C1773b.this.d.notifyNetworkAuctionResult(null);
                C1773b.this.d.notifyNetworkClearAuction();
                C1773b.this.a(bMError);
            }
        }
    }

    public C5998b(String str) {
        this.b = str;
    }

    public void a(AdRequestParameters adRequestParameters, NetworkAdUnitManager networkAdUnitManager, ApiRequest.Builder builder, a aVar) {
        Logger.d(this.a, "load");
        C1773b c1773b = this.d;
        if (c1773b != null) {
            c1773b.b();
        }
        this.c = aVar;
        C1773b c1773b2 = new C1773b(this.b, builder.getUrl(), adRequestParameters, networkAdUnitManager, aVar);
        this.d = c1773b2;
        builder.setCallback(c1773b2);
        builder.setCancelCallback(this.d);
        z.a().a(this.b, builder.request());
    }

    public void a() {
        Logger.d(this.a, "cancel");
        this.c = null;
        C1773b c1773b = this.d;
        if (c1773b != null) {
            c1773b.b();
            this.d = null;
        }
    }
}
