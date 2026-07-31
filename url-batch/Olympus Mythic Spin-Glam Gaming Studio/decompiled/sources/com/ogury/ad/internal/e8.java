package com.ogury.ad.internal;

import com.pubmatic.sdk.openwrap.core.POBConstants;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class e8 {
    public final b a;
    public final Map b;
    public final Map c;
    public final v1 d;
    public final f8 e;
    public final z9 f;
    public final u5 g;
    public final g3 h;
    public final c2 i;
    public h8 j;
    public final Pattern k;

    public e8(b bVar, Map map, Map map2, v1 v1Var, f8 f8Var, z9 z9Var, u5 u5Var, g3 g3Var, c2 c2Var) {
        g5 g5Var = g5.a;
        this.a = bVar;
        this.b = map;
        this.c = map2;
        this.d = v1Var;
        this.e = f8Var;
        this.f = z9Var;
        this.g = u5Var;
        this.h = g3Var;
        this.i = c2Var;
        this.k = Pattern.compile(bVar.j);
    }

    public final void a(String str, ob obVar) {
        String str2;
        if (Intrinsics.areEqual(str, "browser-landing-page")) {
            u5 u5Var = this.g;
            b bVar = this.a;
            Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(bVar.H));
            b5 b5Var = this.a.A.a;
            Intrinsics.checkNotNullParameter(b5Var, "<this>");
            int ordinal = b5Var.ordinal();
            if (ordinal == 0) {
                str2 = POBConstants.KEY_FORMAT;
            } else {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "sdk";
            }
            Pair pair2 = TuplesKt.to("loaded_source", str2);
            Pair pair3 = TuplesKt.to("reload", Boolean.valueOf(this.a.J));
            int i = this.a.K;
            u5Var.a(obVar, bVar, pb.a(pair, pair2, pair3, TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null)));
        }
    }
}
