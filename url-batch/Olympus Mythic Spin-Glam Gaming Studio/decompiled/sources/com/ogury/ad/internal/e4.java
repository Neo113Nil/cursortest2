package com.ogury.ad.internal;

import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class e4 extends Lambda implements Function1 {
    public final /* synthetic */ f4 a;
    public final /* synthetic */ y7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(f4 f4Var, y7 y7Var) {
        super(1);
        this.a = f4Var;
        this.b = y7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        d adExposure = (d) obj;
        Intrinsics.checkNotNullParameter(adExposure, "it");
        f4 f4Var = this.a;
        y7 child = this.b;
        Intrinsics.checkNotNullExpressionValue(child, "$child");
        if (child.k && !child.l) {
            ji jiVar = f4Var.g;
            jiVar.getClass();
            Intrinsics.checkNotNullParameter(adExposure, "adExposure");
            ViewParent parent = jiVar.a.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null && viewGroup.getVisibility() != 0) {
                adExposure.c = 0.0f;
            }
            child.getMraidCommandExecutor().a(adExposure);
            b3 b3Var = f4Var.f;
            if (b3Var != null) {
                ((f) b3Var).a(child, adExposure.c);
            }
        }
        return Unit.INSTANCE;
    }
}
