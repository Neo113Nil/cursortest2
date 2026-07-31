package com.ogury.ad.internal;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class og {
    public final hb a;
    public final le b;
    public final q0 c;
    public final h2 d;
    public final r0 e;
    public final c3 f;

    public og(Context context, hb permissionType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(permissionType, "permissionType");
        le leVar = le.a;
        q0 q0Var = new q0(context);
        h2 h2Var = new h2(context);
        r0 r0Var = new r0(context);
        c3 c3Var = c3.a;
        this.a = permissionType;
        this.b = leVar;
        this.c = q0Var;
        this.d = h2Var;
        this.e = r0Var;
        this.f = c3Var;
    }

    public final Object a(g2 g2Var, Function0 function0) {
        int i;
        int ordinal = this.a.ordinal();
        if (ordinal == 0) {
            i = Integer.MAX_VALUE;
        } else if (ordinal == 1) {
            this.b.getClass();
            i = le.b.d.b;
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.b.getClass();
            i = le.b.e.a;
        }
        int i2 = (i >> g2Var.a) & 1;
        this.f.getClass();
        Boolean a = c3.a("IS_CHILD_UNDER_COPPA");
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(a, bool) || Intrinsics.areEqual(c3.a("IS_UNDER_AGE_OF_GDPR_CONSENT"), bool)) {
            this.b.getClass();
            i2 &= (le.b.b.b >> g2Var.a) & 1;
        }
        if (i2 == 1) {
            return function0.mo4828invoke();
        }
        return null;
    }
}
