package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.h2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4673h2 implements Wc {

    @NotNull
    private final V0 a;

    @NotNull
    private final com.ironsource.mediationsdk.e b;
    private boolean c;

    public C4673h2(@NotNull V0 adTools, @NotNull com.ironsource.mediationsdk.e auctionHandler) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(auctionHandler, "auctionHandler");
        this.a = adTools;
        this.b = auctionHandler;
    }

    @Override // com.ironsource.Wc
    public void a(@NotNull B instance, @Nullable String str, @NotNull C4770ma publisherDataHolder) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.b.a(instance.h(), instance.r(), instance.m(), str);
        a(publisherDataHolder, instance);
    }

    @Override // com.ironsource.Wc
    public void a(@NotNull List<? extends B> waterfallInstances, @NotNull B winnerInstance) {
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        Intrinsics.checkNotNullParameter(winnerInstance, "winnerInstance");
        if (this.c) {
            return;
        }
        this.c = true;
        C4834q2 h = winnerInstance.h();
        this.b.a(h, winnerInstance.r(), winnerInstance.m());
        ArrayList<String> arrayList = new ArrayList<>();
        ConcurrentHashMap<String, C4834q2> concurrentHashMap = new ConcurrentHashMap<>();
        for (B b : waterfallInstances) {
            arrayList.add(b.p());
            concurrentHashMap.put(b.p(), b.h());
        }
        this.b.a(arrayList, concurrentHashMap, winnerInstance.r(), winnerInstance.m(), h);
    }

    private final void a(C4770ma c4770ma, B b) {
        final W8 w8 = new W8(b.e());
        for (final ImpressionDataListener impressionDataListener : new HashSet(c4770ma.a())) {
            this.a.d(new Runnable() { // from class: com.ironsource.h2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C4673h2.a(C4673h2.this, impressionDataListener, w8);
                }
            });
            this.a.f().h().a(w8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4673h2 this$0, ImpressionDataListener listener, W8 impressionData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(impressionData, "$impressionData");
        IronLog.CALLBACK.verbose(C4814p0.a(this$0.a, "onImpressionSuccess " + listener.getClass().getSimpleName() + ": " + impressionData, (String) null, 2, (Object) null));
        listener.onImpressionSuccess(impressionData);
    }
}
