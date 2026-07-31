package com.ogury.ad.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class g4 implements z {
    public final /* synthetic */ z a;
    public final /* synthetic */ i4 b;

    public g4(z zVar, i4 i4Var) {
        this.a = zVar;
        this.b = i4Var;
    }

    @Override // com.ogury.ad.internal.z
    public final void a(g adLayout, t6 adController) {
        Intrinsics.checkNotNullParameter(adLayout, "adLayout");
        Intrinsics.checkNotNullParameter(adController, "adController");
        z zVar = this.a;
        if (zVar != null) {
            zVar.a(adLayout, adController);
        }
        this.b.a.finish();
    }
}
