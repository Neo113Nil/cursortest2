package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class af3 {
    public final yg3 a;
    public final nd3 b;
    public final ye3 c;

    public af3(Context context, qf3 qf3Var) {
        yg3 yg3Var = new yg3();
        nd3 nd3Var = new nd3(context);
        ye3 ye3Var = new ye3(qf3Var);
        this.a = yg3Var;
        this.b = nd3Var;
        this.c = ye3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0194 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0199 A[EDGE_INSN: B:81:0x0199->B:82:0x0199 BREAK  A[LOOP:0: B:7:0x0062->B:18:0x0062], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a(List list) {
        List sortedWith;
        Iterator it;
        int i;
        Iterator it2;
        md3 md3Var;
        Object obj;
        Object obj2;
        this.a.getClass();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                if (((fe3) it3.next()).k != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (((fe3) obj3).k != null) {
                            arrayList.add(obj3);
                        }
                    }
                    sortedWith = CollectionsKt.sortedWith(arrayList, new xg3());
                    nd3 nd3Var = this.b;
                    nd3Var.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    it = sortedWith.iterator();
                    while (true) {
                        i = 0;
                        if (it.hasNext()) {
                            break;
                        }
                        fe3 fe3Var = (fe3) it.next();
                        d20 d20Var = (d20) CollectionsKt.firstOrNull((List) fe3Var.b);
                        if (d20Var != null) {
                            if (d20Var.b.isEmpty()) {
                                bu2 bu2Var = nd3Var.e;
                                if (bu2Var != null && bu2Var.E0 && fe3Var.a) {
                                    String str = fe3Var.i;
                                    if (str == null) {
                                        str = "";
                                    }
                                    md3Var = new md3(fe3Var, d20Var, new gl1(str, null, null, null, null, null, 0, 0, 0, null), null, null, null, null);
                                } else {
                                    gl1 a = nd3Var.a.a(d20Var.a);
                                    if (a != null) {
                                        ne3 ne3Var = fe3Var.d;
                                        nd3Var.b.getClass();
                                        Iterator it4 = ne3Var.a.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                obj = null;
                                                break;
                                            }
                                            obj = it4.next();
                                            op0 op0Var = (op0) obj;
                                            if (Intrinsics.areEqual(op0Var.a, "social_ad_info") && op0Var.b.length() > 0) {
                                                break;
                                            }
                                        }
                                        op0 op0Var2 = (op0) obj;
                                        String str2 = op0Var2 != null ? op0Var2.b : null;
                                        l23 l23Var = str2 != null ? new l23(str2) : null;
                                        nd3Var.c.getClass();
                                        String a2 = b5.a(ne3Var);
                                        nd3Var.c.getClass();
                                        String a3 = b5.a(ne3Var);
                                        JSONObject a4 = a3 != null ? ad1.a(a3) : null;
                                        nd3Var.d.getClass();
                                        Iterator it5 = ne3Var.a.iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                obj2 = null;
                                                break;
                                            }
                                            obj2 = it5.next();
                                            if (Intrinsics.areEqual(((op0) obj2).a, "AdTune")) {
                                                break;
                                            }
                                        }
                                        op0 op0Var3 = (op0) obj2;
                                        String str3 = op0Var3 != null ? op0Var3.b : null;
                                        JSONObject a5 = str3 != null ? ad1.a(str3) : null;
                                        md3Var = new md3(fe3Var, d20Var, a, l23Var, a2, a4, a5 != null ? new w9(a5.optString("token"), a5.optString("advertiserInfo"), a5.optInt("show", 0) == 1) : null);
                                    }
                                }
                            } else {
                                md3Var = new md3(fe3Var, d20Var, new gl1("", null, null, null, null, null, 0, 0, 0, null), null, null, null, null);
                            }
                            if (md3Var == null) {
                                arrayList2.add(md3Var);
                            }
                        }
                        md3Var = null;
                        if (md3Var == null) {
                        }
                    }
                    int size = arrayList2.size();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                    it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        md3 md3Var2 = (md3) next;
                        ye3 ye3Var = this.c;
                        ye3Var.getClass();
                        fe3 fe3Var2 = md3Var2.a;
                        d20 d20Var2 = md3Var2.b;
                        gl1 gl1Var = md3Var2.c;
                        l23 l23Var2 = md3Var2.d;
                        String str4 = md3Var2.e;
                        JSONObject jSONObject = md3Var2.f;
                        yf3 yf3Var = new yf3(size, i2);
                        w9 w9Var = md3Var2.g;
                        arrayList3.add(new we3(d20Var2, fe3Var2, gl1Var, ye3Var.a.a(fe3Var2, d20Var2, gl1Var, yf3Var, str4, w9Var != null ? x9.a(w9Var) : null, jSONObject), l23Var2, String.valueOf(c21.a.getAndIncrement()), w9Var));
                        i = i2;
                    }
                    return arrayList3;
                }
            }
        }
        sortedWith = CollectionsKt.toList(list);
        nd3 nd3Var2 = this.b;
        nd3Var2.getClass();
        ArrayList arrayList22 = new ArrayList();
        it = sortedWith.iterator();
        while (true) {
            i = 0;
            if (it.hasNext()) {
            }
        }
        int size2 = arrayList22.size();
        ArrayList arrayList32 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList22, 10));
        it2 = arrayList22.iterator();
        while (it2.hasNext()) {
        }
        return arrayList32;
    }
}
