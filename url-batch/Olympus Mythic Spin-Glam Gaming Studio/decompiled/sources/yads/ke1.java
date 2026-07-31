package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$layout;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class ke1 {
    public final yu2 a;

    public ke1(yu2 yu2Var) {
        this.a = yu2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final md1 a(Context context, t8 t8Var, v3 v3Var, m12 m12Var, x00 x00Var, d2 d2Var, s3 s3Var) {
        String str;
        List list;
        ry1 ry1Var;
        List list2;
        Object obj;
        ij1 ij1Var;
        s12 b = m12Var.b();
        if (b != null && (list = b.a) != null && (ry1Var = (ry1) CollectionsKt.firstOrNull(list)) != null && (list2 = ry1Var.b) != null) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((ph) obj).a, "media")) {
                    break;
                }
            }
            ph phVar = (ph) obj;
            if (phVar != null) {
                Object obj2 = phVar.c;
                dn1 dn1Var = obj2 instanceof dn1 ? (dn1) obj2 : null;
                if (dn1Var != null && (ij1Var = dn1Var.a) != null) {
                    al1 al1Var = ij1Var.a;
                    yk1 yk1Var = al1Var instanceof yk1 ? (yk1) al1Var : null;
                    if (yk1Var != null) {
                        str = yk1Var.a;
                        if (str != null) {
                            return null;
                        }
                        xe1 xe1Var = new xe1(context.getApplicationContext());
                        ku kuVar = new ku(gg0.b);
                        oe1 oe1Var = new oe1(context, t8Var, v3Var, this.a, x00Var);
                        ae1 ae1Var = new ae1(kuVar);
                        Context context2 = ((nt3) this.a).a;
                        return new md1(R$layout.monetization_ads_internal_divkit, new ie1(m12Var, x00Var, kuVar, ae1Var, oe1Var, xe1Var, str, pr.a(context2, context2), d2Var, s3Var), new je1(t8Var));
                    }
                }
            }
        }
        str = null;
        if (str != null) {
        }
    }
}
