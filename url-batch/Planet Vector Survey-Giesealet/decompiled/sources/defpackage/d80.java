package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class d80 extends v00 implements mu {
    public final /* synthetic */ cj0 e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ ej0 g;
    public final /* synthetic */ s80 h;
    public final /* synthetic */ Bundle i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d80(cj0 cj0Var, ArrayList arrayList, ej0 ej0Var, s80 s80Var, Bundle bundle) {
        super(1);
        this.e = cj0Var;
        this.f = arrayList;
        this.g = ej0Var;
        this.h = s80Var;
        this.i = bundle;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        List list;
        y70 y70Var = (y70) obj;
        y70Var.getClass();
        this.e.d = true;
        ArrayList arrayList = this.f;
        int indexOf = arrayList.indexOf(y70Var);
        if (indexOf != -1) {
            ej0 ej0Var = this.g;
            int i = indexOf + 1;
            list = arrayList.subList(ej0Var.d, i);
            ej0Var.d = i;
        } else {
            list = wp.d;
        }
        this.h.a(y70Var.e, this.i, y70Var, list);
        return ky0.a;
    }
}
