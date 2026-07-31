package yads;

import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class ou1 {
    public static nu1 a(Context context) {
        au1 au1Var = new au1();
        c2 c2Var = new c2();
        rf rfVar = new rf(context);
        ja1 e = null;
        try {
            au1Var.a(ju1.b);
            e = null;
        } catch (ja1 e2) {
            e = e2;
        }
        try {
            c2Var.a(context);
            e = null;
        } catch (ja1 e3) {
            e = e3;
        }
        try {
            uc2.a(context);
            e = null;
        } catch (ja1 e4) {
            e = e4;
        }
        try {
            rfVar.a();
        } catch (ja1 e5) {
            e = e5;
        }
        List listOfNotNull = CollectionsKt.listOfNotNull((Object[]) new ja1[]{e, e, e, e});
        return !listOfNotNull.isEmpty() ? new mu1(listOfNotNull) : lu1.a;
    }
}
