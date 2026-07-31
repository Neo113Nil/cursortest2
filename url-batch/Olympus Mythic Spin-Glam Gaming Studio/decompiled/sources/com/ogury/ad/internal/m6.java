package com.ogury.ad.internal;

import android.net.Uri;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class m6 extends Lambda implements Function2 {
    public final /* synthetic */ t6 a;
    public final /* synthetic */ b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(t6 t6Var, b bVar) {
        super(2);
        this.a = t6Var;
        this.b = bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Uri failingUri = (Uri) obj2;
        Intrinsics.checkNotNullParameter(failingUri, "failingUri");
        u5 u5Var = this.a.m;
        ob obVar = ob.F;
        b bVar = this.b;
        Pair pair = TuplesKt.to("from_ad_markup", Boolean.valueOf(bVar.H));
        b5 b5Var = this.b.A.a;
        Intrinsics.checkNotNullParameter(b5Var, "<this>");
        int ordinal = b5Var.ordinal();
        if (ordinal == 0) {
            str = POBConstants.KEY_FORMAT;
        } else {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            str = "sdk";
        }
        Pair pair2 = TuplesKt.to("loaded_source", str);
        Pair pair3 = TuplesKt.to("reload", Boolean.valueOf(this.b.J));
        int i = this.b.K;
        Uri uri = null;
        Pair pair4 = TuplesKt.to("webview_termination", i > 0 ? Integer.valueOf(i) : null);
        Pair pair5 = TuplesKt.to("cause", booleanValue ? "WebView crash" : "WebView removed");
        if (booleanValue) {
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(failingUri.getScheme());
            builder.authority(failingUri.getAuthority());
            builder.path(failingUri.getPath());
            Unit unit = Unit.INSTANCE;
            uri = builder.build();
        }
        u5Var.a(obVar, bVar, pb.a(pair, pair2, pair3, pair4, pair5, TuplesKt.to("failing_url", uri)));
        t6 t6Var = this.a;
        t6Var.n = true;
        t6Var.a(false);
        return Unit.INSTANCE;
    }
}
