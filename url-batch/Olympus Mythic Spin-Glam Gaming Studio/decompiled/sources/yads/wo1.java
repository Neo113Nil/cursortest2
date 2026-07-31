package yads;

import android.content.Context;
import java.util.Map;
import kotlin.collections.MapsKt;

/* loaded from: classes3.dex */
public final class wo1 extends ap1 {
    public wo1(v3 v3Var) {
        super(v3Var);
    }

    @Override // yads.ap1
    public final Map a(Context context) {
        Map mutableMap = MapsKt.toMutableMap(super.a(context));
        l03 l03Var = this.a.d.a;
        if (l03Var != null) {
            mutableMap.put("width", Integer.valueOf(l03Var.c(context)));
            mutableMap.put("height", Integer.valueOf(l03Var.a(context)));
        }
        return mutableMap;
    }
}
