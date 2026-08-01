package S0;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final List f1080a = W0.k.s0(new n(0, "tier_spark", 0, 2000, 2000, new int[]{-16718337, -16711681}), new n(1, "tier_pulse", 3, 2200, 2500, new int[]{-16718337, -60269}), new n(2, "tier_blaze", 7, 2500, 3000, new int[]{-65408, -60269}), new n(3, "tier_nova", 14, 2800, 3500, new int[]{-60269, -16711681}), new n(4, "tier_apex", 30, 3000, 4000, new int[]{-60269, -16711681, -4259585}));

    public static n a(int i) {
        Object obj;
        List list = f1080a;
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (i >= ((n) obj).f1094c) {
                break;
            }
        }
        n nVar = (n) obj;
        return nVar == null ? (n) W0.j.v0(list) : nVar;
    }
}
