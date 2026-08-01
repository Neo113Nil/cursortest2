package g;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127g implements i0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2671a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2672b;

    public C0127g(i0.d dVar) {
        i1.f.e(dVar, "registry");
        this.f2672b = new LinkedHashSet();
        dVar.e("androidx.savedstate.Restarter", this);
    }

    @Override // i0.c
    public final Bundle a() {
        switch (this.f2671a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0129i) this.f2672b).l().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2672b));
                return bundle2;
        }
    }

    public C0127g(AbstractActivityC0129i abstractActivityC0129i) {
        this.f2672b = abstractActivityC0129i;
    }
}
