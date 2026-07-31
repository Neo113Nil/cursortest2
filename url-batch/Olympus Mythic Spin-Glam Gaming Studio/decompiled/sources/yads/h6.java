package yads;

import android.net.Uri;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h6 implements ai0 {
    public final f6 a;

    public h6(f6 f6Var) {
        this.a = f6Var;
    }

    @Override // yads.ai0
    public final boolean a(Uri uri) {
        j6 j6Var;
        if (!Intrinsics.areEqual(uri.getHost(), "showNextAd")) {
            return false;
        }
        f6 f6Var = this.a;
        int i = f6Var.m - 1;
        if (i == f6Var.d.c && !f6Var.n) {
            f6Var.n = true;
            f6Var.b.b();
        }
        if (f6Var.m >= f6Var.j.size()) {
            return true;
        }
        rd1 rd1Var = (rd1) CollectionsKt.getOrNull(f6Var.j, i);
        if (rd1Var != null) {
            rd1Var.b();
        }
        i6 i6Var = (i6) CollectionsKt.getOrNull(f6Var.k, i);
        if (((i6Var == null || (j6Var = i6Var.b) == null) ? null : j6Var.a) != y03.c) {
            f6Var.b();
            return true;
        }
        int size = f6Var.j.size() - 1;
        f6Var.m = size;
        Iterator it = f6Var.k.subList(i, size).iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((i6) it.next()).a;
        }
        f6Var.g.a += j;
        gw gwVar = f6Var.h;
        gwVar.a += gwVar.b;
        gwVar.b = 0L;
        int i2 = f6Var.m;
        f6Var.m = i2 + 1;
        if (((rd1) f6Var.j.get(i2)).a()) {
            f6Var.a();
            f6Var.i.a(f6Var.e, f6Var.l, f6Var.g.a);
            return true;
        }
        if (f6Var.m >= f6Var.j.size()) {
            f6Var.c.e();
            return true;
        }
        f6Var.b();
        return true;
    }
}
