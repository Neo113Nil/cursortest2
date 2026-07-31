package com.my.target;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.my.target.z;
import java.util.Map;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes4.dex */
public class y6 extends z.a {
    private final int b;

    private y6(int i) {
        this.b = i;
    }

    public static z a(int i) {
        return new y6(i);
    }

    @Override // com.my.target.z.a
    protected Map a(n nVar, tb tbVar, Context context) {
        Map a = super.a(nVar, tbVar, context);
        a.put(IronSourceConstants.EVENTS_DURATION, Integer.toString(this.b));
        return a;
    }
}
