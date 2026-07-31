package com.ironsource;

import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class Kd {

    @NotNull
    private final Map<String, C5009zc> a;

    static final class a extends Lambda implements Function1 {
        final /* synthetic */ JSONObject a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(JSONObject jSONObject) {
            super(1);
            this.a = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<String, C5009zc> invoke(String networkName) {
            Intrinsics.checkNotNullExpressionValue(networkName, "networkName");
            JSONObject jSONObject = this.a.getJSONObject(networkName);
            Intrinsics.checkNotNullExpressionValue(jSONObject, "providerSettings.getJSONObject(networkName)");
            return TuplesKt.to(networkName, new C5009zc(networkName, jSONObject));
        }
    }

    public Kd(@NotNull JSONObject providerSettings) {
        Intrinsics.checkNotNullParameter(providerSettings, "providerSettings");
        Iterator<String> keys = providerSettings.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "providerSettings\n          .keys()");
        Map<String, C5009zc> map = MapsKt.toMap(SequencesKt.map(SequencesKt.asSequence(keys), new a(providerSettings)));
        this.a = map;
        for (Map.Entry<String, C5009zc> entry : map.entrySet()) {
            entry.getKey();
            C5009zc value = entry.getValue();
            if (b(value)) {
                value.b(a(value));
            }
        }
    }

    private final boolean b(C5009zc c5009zc) {
        return c5009zc.o() && c5009zc.l().length() > 0;
    }

    @NotNull
    public final Map<String, C5009zc> a() {
        return this.a;
    }

    private final C5009zc a(C5009zc c5009zc) {
        return this.a.get(c5009zc.h());
    }
}
