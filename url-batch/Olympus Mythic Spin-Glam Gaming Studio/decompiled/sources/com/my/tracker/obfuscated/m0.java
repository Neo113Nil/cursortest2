package com.my.tracker.obfuscated;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class m0 {
    public static final Boolean g;
    private static final Set h;
    final BillingClientStateListener a;
    private final AtomicBoolean b = new AtomicBoolean();
    private final List c;
    private final String d;
    private final b e;
    private final BillingClient f;

    class a implements BillingClientStateListener {
        final AtomicInteger a = new AtomicInteger(0);
        final /* synthetic */ b b;

        a(b bVar) {
            this.b = bVar;
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingServiceDisconnected() {
            if (this.a.incrementAndGet() >= 3 || !m0.this.c()) {
                x2.a("GooglePlayProductHelper: exceeded numbers of billing client connection attempts");
                this.b.a(1, Collections.EMPTY_MAP);
                m0.this.a();
            }
        }

        @Override // com.android.billingclient.api.BillingClientStateListener
        public void onBillingSetupFinished(BillingResult billingResult) {
            if (billingResult == null || billingResult.getResponseCode() != 0) {
                x2.a("GooglePlayProductHelper: error while connecting with billing client");
                onBillingServiceDisconnected();
            } else {
                x2.a("GooglePlayProductHelper: connection with billing client has been established");
                this.a.set(0);
                m0.this.b();
            }
        }
    }

    public interface b {
        void a(int i, Map map);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    static {
        boolean z;
        if (Purchase.class.equals(Purchase.class)) {
            if (BillingClient.class.equals(BillingClient.class)) {
                z = true;
                g = Boolean.valueOf(z);
                if (z) {
                    h = Collections.EMPTY_SET;
                    return;
                } else {
                    h = new HashSet();
                    return;
                }
            }
        }
        z = false;
        g = Boolean.valueOf(z);
        if (z) {
        }
    }

    private m0(List list, String str, b bVar, Context context) {
        this.c = list;
        this.e = bVar;
        this.f = BillingClient.newBuilder(context).setListener(new PurchasesUpdatedListener() { // from class: com.my.tracker.obfuscated.m0$$ExternalSyntheticLambda3
            @Override // com.android.billingclient.api.PurchasesUpdatedListener
            public final void onPurchasesUpdated(BillingResult billingResult, List list2) {
                m0.a(billingResult, list2);
            }
        }).enablePendingPurchases().build();
        this.d = str;
        this.a = new a(bVar);
    }

    public static o0 a(Object obj) {
        if (!g.booleanValue()) {
            x2.b("GooglePlayProductHelper: purchase helper is disabled");
            return null;
        }
        try {
            if (obj instanceof Purchase) {
                Purchase purchase = (Purchase) obj;
                return o0.a(purchase.getOriginalJson(), purchase.getSignature(), v2.a());
            }
        } catch (Throwable th) {
            x2.b("GooglePlayProductHelper error: exception occurred while processing uncasted object", th);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(BillingResult billingResult, List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(final BillingResult billingResult, final List list) {
        m.a(new Runnable() { // from class: com.my.tracker.obfuscated.m0$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                m0.this.b(billingResult, list);
            }
        });
        a();
    }

    void b() {
        try {
            x2.a("GooglePlayProductHelper: querying for " + this.d);
            this.f.querySkuDetailsAsync(SkuDetailsParams.newBuilder().setSkusList(this.c).setType(this.d).build(), new SkuDetailsResponseListener() { // from class: com.my.tracker.obfuscated.m0$$ExternalSyntheticLambda0
                @Override // com.android.billingclient.api.SkuDetailsResponseListener
                public final void onSkuDetailsResponse(BillingResult billingResult, List list) {
                    m0.this.c(billingResult, list);
                }
            });
        } catch (Throwable th) {
            x2.b("GooglePlayProductHelper error: exception while querying details for " + this.d, th);
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(BillingResult billingResult, List list) {
        if (!this.b.compareAndSet(false, true)) {
            x2.a("GooglePlayProductHelper: skuDetails has already been received");
            return;
        }
        int responseCode = billingResult != null ? billingResult.getResponseCode() : 6;
        if (responseCode != 0) {
            x2.a("GooglePlayProductHelper: getSkuDetails completed with errorCode: " + responseCode + ", message: " + (billingResult != null ? billingResult.getDebugMessage() : "{empty message}"));
            this.e.a(1, Collections.EMPTY_MAP);
            return;
        }
        if (list == null || list.isEmpty()) {
            x2.a("GooglePlayProductHelper: null list of skuDetail has been received");
            this.e.a(0, Collections.EMPTY_MAP);
            return;
        }
        HashMap hashMap = new HashMap();
        x2.a("GooglePlayProductHelper: populating map of skuDetails data");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SkuDetails skuDetails = (SkuDetails) it.next();
            try {
                hashMap.put(skuDetails.getSku(), new JSONObject(skuDetails.getOriginalJson()));
            } catch (Throwable th) {
                x2.b("GooglePlayProductHelper error: exception while parsing skuData", th);
            }
        }
        this.e.a(0, hashMap);
    }

    boolean c() {
        try {
            x2.a("GooglePlayProductHelper: start connection with billing client");
            this.f.startConnection(this.a);
            h.add(this);
            return true;
        } catch (Throwable th) {
            x2.b("GooglePlayProductHelper error: exception while start connection:", th);
            return false;
        }
    }

    public static void a(List list, boolean z, final b bVar, final Context context) {
        if (list.isEmpty()) {
            x2.a("GooglePlayProductHelper: empty purchases list");
            bVar.a(0, Collections.EMPTY_MAP);
            return;
        }
        final String str = z ? "subs" : "inapp";
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String c = ((o0) it.next()).c();
            if (!arrayList.contains(c)) {
                arrayList.add(c);
            }
        }
        m.f(new Runnable() { // from class: com.my.tracker.obfuscated.m0$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                m0.a(arrayList, str, bVar, context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(List list, String str, b bVar, Context context) {
        m0 m0Var;
        try {
            m0Var = new m0(list, str, bVar, context);
        } catch (Throwable th) {
            x2.b("GooglePlayProductHelper error: error while creating ProductHelper", th);
        }
        if (m0Var.c()) {
            return;
        }
        m0Var.a();
        bVar.a(1, Collections.EMPTY_MAP);
    }

    void a() {
        try {
            x2.a("GooglePlayProductHelper: end connection with billing client");
            h.remove(this);
            this.f.endConnection();
        } catch (Throwable th) {
            x2.b("GooglePlayProductHelper error: exception while end connection:", th);
        }
    }
}
