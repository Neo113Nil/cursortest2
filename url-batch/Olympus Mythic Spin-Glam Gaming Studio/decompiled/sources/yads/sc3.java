package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class sc3 {
    public final mt1 a;
    public final rp3 b;
    public final lg0 c;
    public final wi0 d;

    public sc3(mt1 mt1Var) {
        rp3 rp3Var = new rp3();
        lg0 lg0Var = new lg0();
        wi0 wi0Var = new wi0(mt1Var);
        this.a = mt1Var;
        this.b = rp3Var;
        this.c = lg0Var;
        this.d = wi0Var;
    }

    public final List a(String str, boolean z) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            IntRange until = RangesKt.until(0, jSONArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator it = until.iterator();
            while (it.hasNext()) {
                fg0 a = this.c.a(jSONArray.getJSONObject(((IntIterator) it).nextInt()));
                if (a != null) {
                    arrayList.add(a);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ri0 a2 = this.d.a((fg0) it2.next(), z);
                if (a2 != null) {
                    arrayList2.add(a2);
                }
            }
            arrayList2.size();
            boolean z2 = ob1.a;
            return arrayList2;
        } catch (Exception e) {
            this.a.reportError("Failed to parse DivKit designs JSON array", e);
            return CollectionsKt.emptyList();
        }
    }
}
