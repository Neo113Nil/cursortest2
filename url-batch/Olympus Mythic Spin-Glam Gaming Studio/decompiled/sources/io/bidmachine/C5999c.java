package io.bidmachine;

import android.util.Pair;
import io.bidmachine.core.Logger;
import io.bidmachine.internal.InterfaceC6006a;
import io.bidmachine.protobuf.AdCachePlacementControl;
import io.bidmachine.utils.lazy.LazyValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: io.bidmachine.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C5999c implements InterfaceC6006a {
    private static volatile C5999c c;
    private static final Map d = new ConcurrentHashMap();
    private final Object a = new Object();
    private final List b = new ArrayList();

    /* renamed from: io.bidmachine.c$a */
    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AdResponse adResponse, AdResponse adResponse2) {
            return -Double.compare(adResponse.getPrice(), adResponse2.getPrice());
        }
    }

    C5999c() {
    }

    public static C5999c a() {
        C5999c c5999c = c;
        if (c5999c == null) {
            synchronized (C5999c.class) {
                try {
                    c5999c = c;
                    if (c5999c == null) {
                        c5999c = new C5999c();
                        c = c5999c;
                    }
                } finally {
                }
            }
        }
        return c5999c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String b(AdResponse adResponse) {
        return String.format("receive - %s", adResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c(AdResponse adResponse) {
        return String.format("remove - %s", adResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d(AdResponse adResponse) {
        return String.format("store - %s", adResponse);
    }

    List e(AdRequestParameters adRequestParameters) {
        synchronized (this.a) {
            try {
                ArrayList arrayList = new ArrayList();
                for (AdResponse adResponse : this.b) {
                    if (adResponse.getStatus() == d.Idle && adRequestParameters.isParametersMatched(adResponse.getAdRequestParameters())) {
                        arrayList.add(adResponse);
                    }
                }
                if (arrayList.isEmpty()) {
                    return arrayList;
                }
                Collections.sort(arrayList, new a());
                return arrayList.subList(0, Math.min(c(adRequestParameters), arrayList.size()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x009e A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:8:0x0014, B:9:0x0023, B:11:0x0029, B:14:0x003a, B:30:0x0046, B:17:0x0057, B:20:0x005f, B:42:0x0065, B:45:0x006f, B:47:0x0075, B:49:0x007c, B:52:0x008a, B:55:0x0092, B:57:0x009e, B:58:0x00a8, B:60:0x00aa, B:61:0x00af), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8 A[Catch: all -> 0x0053, DONT_GENERATE, TryCatch #0 {all -> 0x0053, blocks: (B:8:0x0014, B:9:0x0023, B:11:0x0029, B:14:0x003a, B:30:0x0046, B:17:0x0057, B:20:0x005f, B:42:0x0065, B:45:0x006f, B:47:0x0075, B:49:0x007c, B:52:0x008a, B:55:0x0092, B:57:0x009e, B:58:0x00a8, B:60:0x00aa, B:61:0x00af), top: B:7:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void f(final AdResponse adResponse) {
        if (adResponse.canCache()) {
            Logger.d("AdResponseManager", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.c$$ExternalSyntheticLambda1
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    String d2;
                    d2 = C5999c.d(AdResponse.this);
                    return d2;
                }
            });
            synchronized (this.a) {
                try {
                    AdRequestParameters adRequestParameters = adResponse.getAdRequestParameters();
                    AdResponse adResponse2 = null;
                    int i = 0;
                    int i2 = 0;
                    AdResponse adResponse3 = null;
                    for (AdResponse adResponse4 : this.b) {
                        if (adRequestParameters.isParametersMatched(adResponse4.getAdRequestParameters())) {
                            i2++;
                            if (adResponse4.getStatus() == d.Idle) {
                                if (adResponse3 != null && adResponse3.getPrice() <= adResponse4.getPrice()) {
                                }
                                adResponse3 = adResponse4;
                            } else if (adResponse4.getStatus() == d.Busy) {
                                i++;
                                if (adResponse2 == null) {
                                    adResponse2 = adResponse4;
                                }
                            }
                        }
                    }
                    if (adResponse.getStatus() == d.Busy && adResponse2 != null && i >= c(adRequestParameters)) {
                        adResponse2.setStatus(d.Idle);
                        if (adResponse3 != null) {
                            if (adResponse3.getPrice() > adResponse2.getPrice()) {
                            }
                        }
                        if (i2 >= d(adRequestParameters) && adResponse2 != null) {
                            if (adResponse.getPrice() >= adResponse2.getPrice()) {
                                return;
                            }
                            adResponse2.notifyExpired(true);
                            this.b.remove(adResponse2);
                        }
                        this.b.add(adResponse);
                    }
                    adResponse2 = adResponse3;
                    if (i2 >= d(adRequestParameters)) {
                        if (adResponse.getPrice() >= adResponse2.getPrice()) {
                        }
                    }
                    this.b.add(adResponse);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private AdCachePlacementControl b(AdRequestParameters adRequestParameters) {
        return (AdCachePlacementControl) d.get(adRequestParameters.getAdsType().getName());
    }

    int c(AdRequestParameters adRequestParameters) {
        AdCachePlacementControl b = b(adRequestParameters);
        int maxRetainCount = b != null ? b.getMaxRetainCount() : 0;
        if (maxRetainCount > 0) {
            return maxRetainCount;
        }
        return 2;
    }

    int d(AdRequestParameters adRequestParameters) {
        AdCachePlacementControl b = b(adRequestParameters);
        int maxCacheSize = b != null ? b.getMaxCacheSize() : 0;
        if (maxCacheSize > 0) {
            return maxCacheSize;
        }
        return 8;
    }

    boolean a(AdResponse adResponse) {
        boolean contains;
        synchronized (this.a) {
            contains = this.b.contains(adResponse);
        }
        return contains;
    }

    @Override // io.bidmachine.internal.InterfaceC6006a
    public final List a(AdRequestParameters adRequestParameters) {
        ArrayList arrayList;
        synchronized (this.a) {
            try {
                arrayList = new ArrayList();
                for (AdResponse adResponse : this.b) {
                    if (adRequestParameters.isParametersMatched(adResponse.getAdRequestParameters())) {
                        arrayList.add(new Pair(Double.valueOf(adResponse.getPrice()), adResponse.responseId));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    static void a(Map map) {
        Map map2 = d;
        map2.clear();
        if (map != null) {
            map2.putAll(map);
        }
    }

    void e(final AdResponse adResponse) {
        Logger.d("AdResponseManager", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.c$$ExternalSyntheticLambda0
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                String c2;
                c2 = C5999c.c(AdResponse.this);
                return c2;
            }
        });
        adResponse.setCached(false);
        synchronized (this.a) {
            this.b.remove(adResponse);
        }
    }

    AdResponse f(AdRequestParameters adRequestParameters) {
        synchronized (this.a) {
            try {
                int c2 = c(adRequestParameters);
                int i = 0;
                final AdResponse adResponse = null;
                AdResponse adResponse2 = null;
                for (AdResponse adResponse3 : this.b) {
                    if (!adResponse3.wasShown() && adRequestParameters.isParametersMatched(adResponse3.getAdRequestParameters())) {
                        d status = adResponse3.getStatus();
                        d dVar = d.Idle;
                        if (status == dVar) {
                            if (adResponse != null && adResponse3.getPrice() <= adResponse.getPrice()) {
                            }
                            adResponse = adResponse3;
                        } else if (adResponse3.getStatus() == d.Busy) {
                            i++;
                            if (adResponse2 == null) {
                                adResponse2 = adResponse3;
                            }
                            if (i >= c2) {
                                adResponse2.expireAdRequests(null);
                                adResponse2.clearAdRequestList();
                                adResponse2.setStatus(dVar);
                                if (adResponse == null || adResponse2.getPrice() >= adResponse.getPrice()) {
                                    adResponse = adResponse2;
                                }
                            }
                        }
                    }
                }
                if (adResponse == null || !adRequestParameters.isPricePassedByPriceFloor(adResponse.getPrice())) {
                    return null;
                }
                adResponse.setCached(true);
                adResponse.setStatus(d.Busy);
                Logger.d("AdResponseManager", (LazyValue<String>) new LazyValue() { // from class: io.bidmachine.c$$ExternalSyntheticLambda2
                    @Override // io.bidmachine.utils.lazy.LazyValue
                    public final Object get() {
                        String b;
                        b = C5999c.b(AdResponse.this);
                        return b;
                    }
                });
                this.b.remove(adResponse);
                this.b.add(adResponse);
                return adResponse;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
