package o;

import java.util.ArrayList;

/* renamed from: o.Uo, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0536Uo implements InterfaceC0510To {
    public final int a;
    public final /* synthetic */ AbstractC0588Wo b;

    public C0536Uo(AbstractC0588Wo abstractC0588Wo, int i) {
        this.b = abstractC0588Wo;
        this.a = i;
    }

    @Override // o.InterfaceC0510To
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        AbstractC0588Wo abstractC0588Wo = this.b;
        AbstractComponentCallbacksC0069Co abstractComponentCallbacksC0069Co = abstractC0588Wo.y;
        int i = this.a;
        if (abstractComponentCallbacksC0069Co == null || i >= 0 || !abstractComponentCallbacksC0069Co.c().Q()) {
            return abstractC0588Wo.R(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
