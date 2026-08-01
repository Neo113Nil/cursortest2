package defpackage;

import android.content.res.Resources;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class tn0 implements mu {
    public final /* synthetic */ int d;

    public /* synthetic */ tn0(int i) {
        this.d = i;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        switch (this.d) {
            case 0:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                Boolean bool = obj2 != null ? (Boolean) obj2 : null;
                bool.getClass();
                boolean booleanValue = bool.booleanValue();
                Object obj3 = list.get(1);
                (obj3 != null ? (qp) obj3 : null).getClass();
                return new lg0(booleanValue);
            case 1:
                obj.getClass();
                return new u20(((Integer) obj).intValue());
            case 2:
                obj.getClass();
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                vv0 vv0Var = obj4 != null ? (vv0) obj4 : null;
                vv0Var.getClass();
                int i = vv0Var.a;
                Object obj5 = list2.get(1);
                Boolean bool2 = obj5 != null ? (Boolean) obj5 : null;
                bool2.getClass();
                return new wv0(i, bool2.booleanValue());
            case 3:
                return Boolean.valueOf(obj == null);
            case 4:
                tn0 tn0Var = ur0.a;
                return ky0.a;
            default:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
        }
    }
}
