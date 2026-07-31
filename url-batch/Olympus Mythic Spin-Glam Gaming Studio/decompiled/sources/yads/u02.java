package yads;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes15.dex */
public final class u02 {
    public static List b(m12 m12Var) {
        if (!(m12Var instanceof k32)) {
            return CollectionsKt.listOfNotNull(m12Var != null ? m12Var.e() : null);
        }
        ArrayList k = ((k32) m12Var).k();
        ArrayList arrayList = new ArrayList();
        Iterator it = k.iterator();
        while (it.hasNext()) {
            j00 e = ((m12) it.next()).e();
            if (e != null) {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    public final String a(m12 m12Var) {
        ?? listOfNotNull;
        if (m12Var instanceof k32) {
            ArrayList k = ((k32) m12Var).k();
            listOfNotNull = new ArrayList();
            Iterator it = k.iterator();
            while (it.hasNext()) {
                String a = ((m12) it.next()).a();
                if (a != null) {
                    listOfNotNull.add(a);
                }
            }
        } else {
            listOfNotNull = CollectionsKt.listOfNotNull(m12Var != null ? m12Var.a() : null);
        }
        List list = listOfNotNull;
        if (list.isEmpty()) {
            return null;
        }
        return CollectionsKt.joinToString$default(list, StringUtils.COMMA, X3.j.d, X3.j.e, 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    public final String c(m12 m12Var) {
        ?? listOfNotNull;
        if (m12Var instanceof k32) {
            ArrayList k = ((k32) m12Var).k();
            listOfNotNull = new ArrayList();
            Iterator it = k.iterator();
            while (it.hasNext()) {
                String info = ((m12) it.next()).getInfo();
                if (info != null) {
                    listOfNotNull.add(info);
                }
            }
        } else {
            listOfNotNull = CollectionsKt.listOfNotNull(m12Var != null ? m12Var.getInfo() : null);
        }
        List list = listOfNotNull;
        if (list.isEmpty()) {
            return null;
        }
        return CollectionsKt.joinToString$default(list, StringUtils.COMMA, X3.j.d, X3.j.e, 0, null, null, 56, null);
    }
}
