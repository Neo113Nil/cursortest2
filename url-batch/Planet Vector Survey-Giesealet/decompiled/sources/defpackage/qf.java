package defpackage;

import android.os.Bundle;
import com.vectorharbor.planetvectorsurvey.MainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class qf implements hn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hn0
    public final Bundle a() {
        pd0[] pd0VarArr;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return zf.a((MainActivity) obj);
            case 1:
                Map c = ((ym0) obj).c();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : c.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            default:
                e10 e10Var = (e10) obj;
                for (Map.Entry entry2 : x40.S((LinkedHashMap) e10Var.d).entrySet()) {
                    e10Var.d(((et0) ((g70) entry2.getValue())).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : x40.S((LinkedHashMap) e10Var.b).entrySet()) {
                    e10Var.d(((hn0) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) e10Var.a;
                if (linkedHashMap.isEmpty()) {
                    pd0VarArr = new pd0[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList.add(new pd0((String) entry4.getKey(), entry4.getValue()));
                    }
                    pd0VarArr = (pd0[]) arrayList.toArray(new pd0[0]);
                }
                return x40.r((pd0[]) Arrays.copyOf(pd0VarArr, pd0VarArr.length));
        }
    }
}
