package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* renamed from: com.inmobi.media.jd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC4102jd {
    public static final List a(C4106jh c4106jh) {
        Intrinsics.checkNotNullParameter(c4106jh, "<this>");
        return CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to(c4106jh.b, (short) 0), TuplesKt.to(c4106jh.a.getTitleView(), (short) 3), TuplesKt.to(c4106jh.a.getDescriptionView(), (short) 4), TuplesKt.to(c4106jh.a.getIconView(), (short) 5), TuplesKt.to(c4106jh.a.getCtaView(), (short) 6), TuplesKt.to(c4106jh.c, (short) 7), TuplesKt.to(c4106jh.a.getRatingView(), (short) 8), TuplesKt.to(c4106jh.a.getAdvertiserView(), (short) 9)});
    }

    public static final void a(C4106jh c4106jh, InterfaceC4466x9 interfaceC4466x9) {
        Intrinsics.checkNotNullParameter(c4106jh, "<this>");
        Intrinsics.checkNotNullParameter("NativeRenderedState", "tag");
        if (interfaceC4466x9 == null) {
            return;
        }
        List<Pair> a = a(c4106jh);
        ViewGroup parentView = c4106jh.a.getParentView();
        JSONArray jSONArray = new JSONArray();
        for (Pair pair : a) {
            View view = (View) pair.component1();
            short shortValue = ((Number) pair.component2()).shortValue();
            if (view != null) {
                boolean z = view.getVisibility() == 0;
                jSONArray.put(((int) shortValue) + " - " + z + " " + Un.a(view, parentView));
            }
        }
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
        ((C4493y9) interfaceC4466x9).a("NativeRenderedState", jSONArray2);
    }
}
