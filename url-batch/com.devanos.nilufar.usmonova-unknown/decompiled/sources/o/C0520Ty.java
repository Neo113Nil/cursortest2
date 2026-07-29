package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.Ty, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0520Ty extends AbstractC1596ny implements InterfaceC1455lp {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0546Uy i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0520Ty(C0546Uy c0546Uy, int i) {
        super(0);
        this.h = i;
        this.i = c0546Uy;
    }

    @Override // o.InterfaceC1455lp
    public final Object invoke() {
        switch (this.h) {
            case 0:
                C0546Uy c0546Uy = this.i;
                HO ho = ((C1198hu) c0546Uy.f117o.i).l;
                c0546Uy.l.b();
                ho.getClass();
                return EB.V(new ArrayList());
            case 1:
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((Map) AbstractC0772bO.o(this.i.p, C0546Uy.t[0])).entrySet()) {
                    String str = (String) entry.getKey();
                    OM om = (OM) entry.getValue();
                    C0870cv d = C0870cv.d(str);
                    C0202Hr c0202Hr = om.b;
                    EnumC0571Vx enumC0571Vx = (EnumC0571Vx) c0202Hr.c;
                    int ordinal = enumC0571Vx.ordinal();
                    if (ordinal == 2) {
                        hashMap.put(d, d);
                    } else if (ordinal == 5) {
                        String str2 = (String) c0202Hr.h;
                        if (enumC0571Vx != EnumC0571Vx.MULTIFILE_CLASS_PART) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            hashMap.put(d, C0870cv.d(str2));
                        }
                    }
                }
                return hashMap;
            default:
                this.i.n.getClass();
                return new ArrayList(AbstractC0786bc.d0(C1318jk.h));
        }
    }
}
