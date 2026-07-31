package com.inmobi.media;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.QueryPurchasesParams;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes11.dex */
public final class Ah {
    public Function1 a;
    public BillingClient b;
    public final AtomicInteger c = new AtomicInteger(0);
    public final C4211nh d = new C4211nh();
    public final int e = 2;

    public static final void a(BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
    }

    public static final void b(BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
    }

    public static BillingClient b(Context context) {
        try {
            return BillingClient.newBuilder(context).enablePendingPurchases(PendingPurchasesParams.newBuilder().enableOneTimeProducts().build()).setListener(new PurchasesUpdatedListener() { // from class: com.inmobi.media.Ah$$ExternalSyntheticLambda0
                @Override // com.android.billingclient.api.PurchasesUpdatedListener
                public final void onPurchasesUpdated(BillingResult billingResult, List list) {
                    Ah.b(billingResult, list);
                }
            }).build();
        } catch (Exception e) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC3861aa.a(new Q2(e));
            e.getMessage();
            return null;
        } catch (NoClassDefFoundError e2) {
            Lazy lazy2 = AbstractC3861aa.a;
            AbstractC3861aa.a(new Q2(e2));
            e2.getMessage();
            return null;
        }
    }

    public final void a(Context context, Function1 onComplete) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        try {
            this.a = onComplete;
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            String string = bundle != null ? bundle.getString("com.google.android.play.billingclient.version") : null;
            if (string == null) {
                a(new C4264ph((short) 2236), (C4211nh) null);
                return;
            }
            BillingClient billingClient = (BillingClient) a(string).invoke(context);
            if (billingClient == null) {
                a(new C4264ph((short) 2233), (C4211nh) null);
                return;
            }
            this.b = billingClient;
            Function1 onComplete2 = new Function1() { // from class: com.inmobi.media.Ah$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Ah.a(Ah.this, (AbstractC4422vh) obj);
                }
            };
            Intrinsics.checkNotNullParameter(onComplete2, "onComplete");
            BillingClient billingClient2 = this.b;
            if (billingClient2 != null) {
                billingClient2.startConnection(new C4448wh(onComplete2, this));
            }
        } catch (Exception e) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC3861aa.a(new Q2(e));
            e.getMessage();
            a(new C4264ph((short) 2237), (C4211nh) null);
        }
    }

    public static final void b(final Ah ah, final Function1 function1, BillingResult billingResult, List purchasesResult) {
        Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
        Intrinsics.checkNotNullParameter(purchasesResult, "purchasesResult");
        C4211nh c4211nh = ah.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : purchasesResult) {
            Purchase purchase = (Purchase) obj;
            if (purchase.getPurchaseState() == 1 && purchase.isAcknowledged()) {
                arrayList.add(obj);
            }
        }
        c4211nh.a = arrayList.size();
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Ah$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                Ah.b(Function1.this, ah);
            }
        };
        Context context = AbstractC4002fj.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC4002fj.g.submit(runnable);
    }

    public static final Unit a(final Ah ah, AbstractC4422vh result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof C4369th) {
            ah.a(new C4238oh(String.valueOf(((C4369th) result).a)), (C4211nh) null);
            return Unit.INSTANCE;
        }
        ah.a(new Function1() { // from class: com.inmobi.media.Ah$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Ah.a(Ah.this, (C4211nh) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void b(Function1 function1, Ah ah) {
        function1.invoke(ah.d);
    }

    public static final Unit a(Ah ah, C4211nh data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (ah.c.incrementAndGet() != ah.e) {
            return Unit.INSTANCE;
        }
        int i = data.a;
        if (i == 0 && data.b == 0) {
            ah.a(new C4264ph((short) 2234), (C4211nh) null);
            return Unit.INSTANCE;
        }
        StringsKt.trimMargin$default("No of In-App Purchases: " + i + "\n                                    | and No of Subscriptions: " + data.b + "\n                                ", null, 1, null);
        ah.a(C4290qh.a, data);
        return Unit.INSTANCE;
    }

    public final Function1 a(String str) {
        if (StringsKt.startsWith$default(str, "6", false, 2, (Object) null)) {
            return new C4475xh(this);
        }
        if (StringsKt.startsWith$default(str, "7", false, 2, (Object) null)) {
            return new C4501yh(this);
        }
        return new C4527zh(this);
    }

    public final void a(AbstractC4316rh abstractC4316rh, C4211nh c4211nh) {
        AbstractC4342sh.a(abstractC4316rh);
        Function1 function1 = this.a;
        if (function1 != null) {
            function1.invoke(c4211nh);
        }
    }

    public static BillingClient a(Context context) {
        try {
            return BillingClient.newBuilder(context).enablePendingPurchases().setListener(new PurchasesUpdatedListener() { // from class: com.inmobi.media.Ah$$ExternalSyntheticLambda3
                @Override // com.android.billingclient.api.PurchasesUpdatedListener
                public final void onPurchasesUpdated(BillingResult billingResult, List list) {
                    Ah.a(billingResult, list);
                }
            }).build();
        } catch (Exception e) {
            Lazy lazy = AbstractC3861aa.a;
            AbstractC3861aa.a(new Q2(e));
            e.getMessage();
            return null;
        } catch (NoClassDefFoundError e2) {
            Lazy lazy2 = AbstractC3861aa.a;
            AbstractC3861aa.a(new Q2(e2));
            e2.getMessage();
            return null;
        }
    }

    public final void a(final Function1 onComplete) {
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        QueryPurchasesParams.Builder newBuilder = QueryPurchasesParams.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        newBuilder.setProductType("inapp");
        QueryPurchasesParams.Builder newBuilder2 = QueryPurchasesParams.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder2, "newBuilder(...)");
        newBuilder2.setProductType("subs");
        BillingClient billingClient = this.b;
        if (billingClient != null) {
            billingClient.queryPurchasesAsync(newBuilder.build(), new PurchasesResponseListener() { // from class: com.inmobi.media.Ah$$ExternalSyntheticLambda4
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    Ah.b(Ah.this, onComplete, billingResult, list);
                }
            });
        }
        BillingClient billingClient2 = this.b;
        if (billingClient2 != null) {
            billingClient2.queryPurchasesAsync(newBuilder2.build(), new PurchasesResponseListener() { // from class: com.inmobi.media.Ah$$ExternalSyntheticLambda5
                @Override // com.android.billingclient.api.PurchasesResponseListener
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    Ah.a(Ah.this, onComplete, billingResult, list);
                }
            });
        }
    }

    public static final void a(final Ah ah, final Function1 function1, BillingResult billingResult, List purchasesResult) {
        Intrinsics.checkNotNullParameter(billingResult, "<unused var>");
        Intrinsics.checkNotNullParameter(purchasesResult, "purchasesResult");
        C4211nh c4211nh = ah.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : purchasesResult) {
            Purchase purchase = (Purchase) obj;
            if (purchase.getPurchaseState() == 1 && purchase.isAcknowledged()) {
                arrayList.add(obj);
            }
        }
        c4211nh.b = arrayList.size();
        Runnable runnable = new Runnable() { // from class: com.inmobi.media.Ah$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                Ah.a(Function1.this, ah);
            }
        };
        Context context = AbstractC4002fj.a;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        AbstractC4002fj.g.submit(runnable);
    }

    public static final void a(Function1 function1, Ah ah) {
        function1.invoke(ah.d);
    }
}
