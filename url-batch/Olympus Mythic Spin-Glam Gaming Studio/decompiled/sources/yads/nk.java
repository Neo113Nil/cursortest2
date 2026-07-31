package yads;

import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class nk {
    public final jj2 a = new jj2();

    public final boolean a() {
        String a = this.a.a();
        if (a == null || !(StringsKt.endsWith$default(a, ":Metrica", false, 2, (Object) null) || StringsKt.endsWith$default(a, ":AppMetrica", false, 2, (Object) null))) {
            return false;
        }
        boolean z = ob1.a;
        return true;
    }
}
