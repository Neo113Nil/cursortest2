package yads;

import android.content.Context;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* loaded from: classes4.dex */
public final class pm0 {
    public static pm0 c;
    public static final Object d = new Object();
    public final om0 a;
    public final f21 b;

    public pm0(Context context) {
        Object obj;
        om0 om0Var = new om0();
        y51 y51Var = of.a;
        nf nfVar = new nf(context);
        Object obj2 = y51Var.a;
        if (obj2 == null) {
            synchronized (y51Var.b) {
                Object obj3 = y51Var.a;
                if (obj3 == null) {
                    obj = nfVar.mo4828invoke();
                    y51Var.a = obj;
                } else {
                    obj = obj3;
                }
            }
            obj2 = obj;
        }
        this.a = om0Var;
        CollectionsKt.emptyList();
        MapsKt.emptyMap();
        this.b = (f21) obj2;
    }

    public final om0 a() {
        return this.a;
    }
}
