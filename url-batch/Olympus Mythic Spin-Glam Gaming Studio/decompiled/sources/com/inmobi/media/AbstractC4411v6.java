package com.inmobi.media;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.v6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4411v6 {
    public static final Lazy a = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.v6$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final Object mo4828invoke() {
            return AbstractC4411v6.a();
        }
    });

    public static final CoroutineScope a() {
        Intrinsics.checkNotNullExpressionValue("v6", "TAG");
        Intrinsics.checkNotNullParameter("v6", "name");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new M9("v6", false));
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        return CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(newSingleThreadExecutor));
    }

    public static void a(C4173m6 eventPayload, String url, int i, int i2, long j, Zk zk, C4358t6 c4358t6, boolean z) {
        long j2;
        long j3;
        Intrinsics.checkNotNullExpressionValue("v6", "TAG");
        if (AbstractC3998ff.a() != null || !AbstractC4002fj.d.get()) {
            Intrinsics.checkNotNullExpressionValue("v6", "TAG");
            c4358t6.getClass();
            Intrinsics.checkNotNullParameter(eventPayload, "eventPayload");
            String TAG = c4358t6.e;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            BuildersKt__BuildersKt.runBlocking$default(null, new C4253p6(eventPayload, false, c4358t6, null), 1, null);
            c4358t6.a(System.currentTimeMillis());
            if (c4358t6.d != null) {
                ArrayList eventIds = eventPayload.a;
                Intrinsics.checkNotNullParameter(eventIds, "eventIds");
                Integer num = Ak.c;
                if (num != null && eventIds.contains(Integer.valueOf(num.intValue()))) {
                    Ak.c = null;
                }
            }
            c4358t6.f.set(false);
            return;
        }
        if (url != null) {
            String payload = eventPayload.b;
            int i3 = i - i2;
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(payload, "payload");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(url, "url");
            HashMap hashMapOf = MapsKt.hashMapOf(TuplesKt.to("payload", payload));
            Intrinsics.checkNotNullParameter(hashMapOf, "<this>");
            JSONObject b = AbstractC3962e7.b();
            if (b != null) {
                String jSONObject = b.toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
                hashMapOf.put("consentObject", jSONObject);
            }
            Ze ze = new Ze(url, i3 > 0 ? MapsKt.mapOf(TuplesKt.to("X-im-retry-count", String.valueOf(i3))) : null, null, new C4018g7(hashMapOf, 0), null, 52);
            if (z) {
                if (i2 != i) {
                    j3 = ((long) Math.pow(2.0d, i3)) * j;
                    j2 = j3;
                    BuildersKt__Builders_commonKt.launch$default((CoroutineScope) a.getValue(), null, null, new C4384u6(j2, ze, i2, eventPayload, url, i, j, zk, c4358t6, z, null), 3, null);
                }
            } else if (i2 != i) {
                j2 = j;
                BuildersKt__Builders_commonKt.launch$default((CoroutineScope) a.getValue(), null, null, new C4384u6(j2, ze, i2, eventPayload, url, i, j, zk, c4358t6, z, null), 3, null);
            }
            j3 = 0;
            j2 = j3;
            BuildersKt__Builders_commonKt.launch$default((CoroutineScope) a.getValue(), null, null, new C4384u6(j2, ze, i2, eventPayload, url, i, j, zk, c4358t6, z, null), 3, null);
        }
    }
}
