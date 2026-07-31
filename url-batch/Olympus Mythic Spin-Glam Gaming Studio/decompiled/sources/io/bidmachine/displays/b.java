package io.bidmachine.displays;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.AdContentType;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachineTrackingObject;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import io.bidmachine.NetworkRegistry;
import io.bidmachine.ProtoExtConstants;
import io.bidmachine.TrackEventType;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.displays.b;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingAd;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingPlacement;
import io.bidmachine.tracking.EventData;
import io.bidmachine.tracking.TrackEventInfo;
import io.bidmachine.tracking.TrackingObject;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes14.dex */
class b {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a implements Runnable, HeaderBiddingAdRequestParams, HeaderBiddingCollectParamsCallback {
        private static final Executor k = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 2);
        private final ContextProvider a;
        private final HeaderBiddingAdapter b;
        private final AdsType c;
        private final AdContentType d;
        private final UnifiedAdRequestParams e;
        private final NetworkAdUnit f;
        private CountDownLatch h;
        private HeaderBiddingPlacement.AdUnit i;
        private boolean j = false;
        private final TrackingObject g = new BidMachineTrackingObject();

        a(ContextProvider contextProvider, HeaderBiddingAdapter headerBiddingAdapter, AdsType adsType, AdContentType adContentType, UnifiedAdRequestParams unifiedAdRequestParams, NetworkAdUnit networkAdUnit) {
            this.a = contextProvider;
            this.b = headerBiddingAdapter;
            this.c = adsType;
            this.d = adContentType;
            this.e = unifiedAdRequestParams;
            this.f = networkAdUnit;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String a(BMError bMError) {
            return String.format("%s (%s) - Header bidding collect fail - %s", this.c, this.d, bMError);
        }

        private void b() {
            this.j = true;
            this.h.countDown();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String e() {
            return String.format("%s (%s) - Header bidding collect fail: timeout", this.c, this.d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ String f() {
            return String.format("%s (%s) - Header bidding collect finished", this.c, this.d);
        }

        HeaderBiddingPlacement.AdUnit c() {
            return this.i;
        }

        boolean d() {
            return this.j;
        }

        @Override // io.bidmachine.HeaderBiddingAdRequestParams
        public AdContentType getAdContentType() {
            return this.d;
        }

        @Override // io.bidmachine.HeaderBiddingAdRequestParams
        public AdsType getAdsType() {
            return this.c;
        }

        @Override // io.bidmachine.HeaderBiddingCollectParamsCallback
        public void onCollectFail(final BMError bMError) {
            if (this.j) {
                return;
            }
            Logger.d(this.b.getKey(), (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.displays.b$a$$ExternalSyntheticLambda1
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String a;
                    a = b.a.this.a(bMError);
                    return a;
                }
            });
            b();
            this.g.eventFinish(TrackEventType.HeaderBiddingNetworkPrepare, this.c, new EventData().setNetworkName(this.b.getKey()), bMError);
        }

        @Override // io.bidmachine.HeaderBiddingCollectParamsCallback
        public void onCollectFinished(Map map) {
            if (this.j) {
                return;
            }
            this.i = HeaderBiddingPlacement.AdUnit.newBuilder().setBidder(this.b.getKey()).setBidderSdkver(this.b.obtainNetworkSdkVersion()).putClientParams(ProtoExtConstants.AD_UNIT_ID, this.f.getId()).putAllClientParams(this.f.getMediationConfig()).putAllClientParams(map).build();
            Logger.d(this.b.getKey(), (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.displays.b$a$$ExternalSyntheticLambda2
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String f;
                    f = b.a.this.f();
                    return f;
                }
            });
            b();
            this.g.eventFinish(TrackEventType.HeaderBiddingNetworkPrepare, this.c, new EventData().setNetworkName(this.b.getKey()), null);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.b.collectHeaderBiddingParams(this.a, this.e, this.f, this, this);
            } catch (Throwable th) {
                Logger.w(th);
                onCollectFail(BMError.throwable("Exception collecting header bidding parameters", th));
            }
        }

        void a(CountDownLatch countDownLatch) {
            this.g.eventStart(TrackEventType.HeaderBiddingNetworkPrepare, new TrackEventInfo().withParameter("HB_NETWORK", this.b.getKey()).withParameter("BM_AD_TYPE", this.c.getName()));
            this.h = countDownLatch;
            k.execute(this);
        }

        void a() {
            if (this.j) {
                return;
            }
            Logger.d(this.b.getKey(), (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.displays.b$a$$ExternalSyntheticLambda0
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String e;
                    e = b.a.this.e();
                    return e;
                }
            });
            b();
        }
    }

    b() {
    }

    HeaderBiddingPlacement.Builder a(ContextProvider contextProvider, UnifiedAdRequestParams unifiedAdRequestParams, AdsType adsType, AdContentType adContentType, Collection collection, List list, int i) {
        ArrayList<a> arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            NetworkConfig networkConfig = (NetworkConfig) it.next();
            NetworkAdapter adapter = NetworkRegistry.getAdapter(networkConfig.getNetworkKey());
            if ((adapter instanceof HeaderBiddingAdapter) && adapter.isInitialized(contextProvider)) {
                for (NetworkAdUnit networkAdUnit : networkConfig.createNetworkAdUnitList(adsType, unifiedAdRequestParams, adContentType, adapter)) {
                    list.add(networkAdUnit);
                    arrayList.add(new a(contextProvider, (HeaderBiddingAdapter) adapter, adsType, adContentType, unifiedAdRequestParams, networkAdUnit));
                    it = it;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            BidMachineTrackingObject bidMachineTrackingObject = new BidMachineTrackingObject();
            bidMachineTrackingObject.eventStart(TrackEventType.HeaderBiddingNetworksPrepare);
            try {
                CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((a) it2.next()).a(countDownLatch);
                }
                try {
                    countDownLatch.await(i > 0 ? i : 10L, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    Logger.w(e);
                }
                ArrayList arrayList2 = null;
                for (a aVar : arrayList) {
                    HeaderBiddingPlacement.AdUnit c = aVar.c();
                    if (c != null) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(c);
                    } else if (!aVar.d()) {
                        aVar.a();
                    }
                }
                if (!Utils.isEmpty(arrayList2)) {
                    HeaderBiddingPlacement.Builder newBuilder = HeaderBiddingPlacement.newBuilder();
                    newBuilder.addAllAdUnits(arrayList2);
                    return newBuilder;
                }
            } finally {
                bidMachineTrackingObject.eventFinish(TrackEventType.HeaderBiddingNetworksPrepare, adsType, null, null);
            }
        }
        return null;
    }

    HeaderBiddingAd b(Ad ad) {
        if (ad.hasDisplay()) {
            Ad.Display display = ad.getDisplay();
            r1 = display.hasBanner() ? a(display.getBanner().getExtProtoList()) : null;
            if (r1 == null && display.hasNative()) {
                r1 = a(display.getNative().getExtProtoList());
            }
        }
        return (r1 == null && ad.hasVideo()) ? a(ad.getVideo().getExtProtoList()) : r1;
    }

    AdObjectParams a(Ad ad) {
        HeaderBiddingAd b = b(ad);
        if (b != null) {
            return new io.bidmachine.displays.a(ad, b);
        }
        return null;
    }

    private HeaderBiddingAd a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Any any = (Any) it.next();
            if (any.is(HeaderBiddingAd.class)) {
                try {
                    return (HeaderBiddingAd) any.unpack(HeaderBiddingAd.class);
                } catch (InvalidProtocolBufferException e) {
                    Logger.w(e);
                }
            }
        }
        return null;
    }
}
