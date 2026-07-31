package yads;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.RangesKt;

/* loaded from: classes3.dex */
public final class s4 {
    public final u4 a;
    public final t4 b;

    public s4() {
        u4 u4Var;
        u4 u4Var2 = u4.d;
        if (u4Var2 == null) {
            synchronized (u4.c) {
                u4Var = u4.d;
                if (u4Var == null) {
                    u4Var = new u4();
                    u4.d = u4Var;
                }
            }
            u4Var2 = u4Var;
        }
        t4 t4Var = new t4();
        this.a = u4Var2;
        this.b = t4Var;
    }

    public final String a(Context context) {
        List list;
        u4 u4Var = this.a;
        u4Var.getClass();
        synchronized (u4.c) {
            list = CollectionsKt.toList(u4Var.b);
        }
        return a(context, list);
    }

    public final String b(Context context) {
        List list;
        u4 u4Var = this.a;
        u4Var.getClass();
        synchronized (u4.c) {
            list = CollectionsKt.toList(u4Var.a);
        }
        return a(context, list);
    }

    public final String a(Context context, List list) {
        int i;
        vw2 vw2Var;
        this.b.getClass();
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        bu2 a = vw2Var2.a(context);
        if (a == null || (i = a.a) == 0) {
            i = 5;
        }
        return CollectionsKt.joinToString$default(list.subList(list.size() - RangesKt.coerceAtMost(i, list.size()), list.size()), StringUtils.COMMA, null, null, 0, null, null, 62, null);
    }
}
