package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.json.JSONArray;

/* loaded from: classes13.dex */
public final class S4 {
    public static final S4 a;
    public static final Lazy b;
    public static LinkedList c;
    public static LinkedList d;
    public static byte[] e;
    public static String f;

    static {
        S4 s4 = new S4();
        a = s4;
        b = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.S4$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final Object mo4828invoke() {
                return S4.b();
            }
        });
        LinkedList linkedList = new LinkedList();
        c = linkedList;
        Object clone = linkedList.clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        d = (LinkedList) clone;
        P4 p4 = new P4();
        M4 m4 = new M4();
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        C4277q4 c4277q42 = AbstractC4015g4.a;
        e = AbstractC3989f6.a(((SignalsConfig) c4277q42.a(SignalsConfig.class)).getKA());
        List<String> skipFields = c().getContextualData().getSkipFields();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(T4.j);
        arrayList.removeAll(skipFields);
        f = CollectionsKt.joinToString$default(arrayList, StringUtils.COMMA, null, null, 0, null, null, 62, null);
        Context context = AbstractC4002fj.a;
        if (context != null) {
            Intrinsics.checkNotNullExpressionValue("S4", "TAG");
            ConcurrentHashMap concurrentHashMap = Qa.b;
            Qa a2 = Pa.a(context, "c_data_store");
            Context context2 = AbstractC4002fj.a;
            int i = 1;
            if (context2 != null) {
                Qa a3 = Pa.a(context2, "c_data_store");
                Intrinsics.checkNotNullParameter("akv", "key");
                i = a3.a.getInt("akv", 1);
            }
            Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
            if (((SignalsConfig) c4277q42.a(SignalsConfig.class)).getVAK() != i) {
                Intrinsics.checkNotNullExpressionValue("S4", "TAG");
                Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
                a2.a("akv", ((SignalsConfig) c4277q42.a(SignalsConfig.class)).getVAK(), false);
                s4.f();
            }
        }
        AbstractC4015g4.a("ads", m4);
        AbstractC4015g4.a("signals", p4);
    }

    public static final K4 b() {
        return new K4(AbstractC4334s9.b());
    }

    public static AdConfig c() {
        C4277q4 c4277q4 = AbstractC4015g4.a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return (AdConfig) AbstractC4015g4.a.a(AdConfig.class);
    }

    public static String d() {
        Intrinsics.checkNotNullExpressionValue("S4", "TAG");
        if (f.length() == 0) {
            return "";
        }
        JSONArray jSONArray = new JSONArray();
        long currentTimeMillis = System.currentTimeMillis() - (c().getContextualData().getExpiryTime() * 1000);
        LinkedList linkedList = d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedList) {
            if (((C3961e6) obj).b >= currentTimeMillis) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(StringsKt.trim(((C3961e6) it.next()).a).toString());
        }
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    public static boolean e() {
        boolean z;
        AdConfig.ContextualDataConfig contextualData;
        Context context = AbstractC4002fj.a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Qa.b;
            Qa a2 = Pa.a(context, "c_data_store");
            Intrinsics.checkNotNullParameter("isEnabled", "key");
            z = a2.a.getBoolean("isEnabled", true);
        } else {
            z = true;
        }
        if (!z) {
            Intrinsics.checkNotNullExpressionValue("S4", "TAG");
            return false;
        }
        AdConfig c2 = c();
        boolean z2 = ((c2 == null || (contextualData = c2.getContextualData()) == null) ? 1 : contextualData.getMaxAdRecords()) > 0;
        Intrinsics.checkNotNullExpressionValue("S4", "TAG");
        return z2;
    }

    public final void a(boolean z) {
        Context context = AbstractC4002fj.a;
        if (context != null) {
            Intrinsics.checkNotNullExpressionValue("S4", "TAG");
            if (z != e()) {
                Intrinsics.checkNotNullExpressionValue("S4", "TAG");
                ConcurrentHashMap concurrentHashMap = Qa.b;
                Qa.a(Pa.a(context, "c_data_store"), "isEnabled", z);
                if (z) {
                    return;
                }
                f();
            }
        }
    }

    public final void f() {
        synchronized (this) {
            Intrinsics.checkNotNullExpressionValue("S4", "TAG");
            BuildersKt__BuildersKt.runBlocking$default(null, new O4(null), 1, null);
            LinkedList linkedList = new LinkedList();
            c = linkedList;
            Object clone = linkedList.clone();
            Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
            d = (LinkedList) clone;
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final void a() {
        Intrinsics.checkNotNullExpressionValue("S4", "TAG");
        long currentTimeMillis = System.currentTimeMillis() - (c().getContextualData().getExpiryTime() * 1000);
        a(currentTimeMillis, c().getContextualData().getMaxAdRecords());
        Object clone = c.clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        d = (LinkedList) clone;
        BuildersKt__BuildersKt.runBlocking$default(null, new R4(currentTimeMillis, null), 1, null);
    }

    public static void a(long j, int i) {
        Intrinsics.checkNotNullExpressionValue("S4", "TAG");
        for (int size = c.size(); size > i; size--) {
            c.remove();
        }
        Intrinsics.checkNotNullExpressionValue("S4", "TAG");
        Iterator it = c.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            if (((C3961e6) next).b >= j) {
                return;
            } else {
                it.remove();
            }
        }
    }
}
