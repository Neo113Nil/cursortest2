package g;

import android.os.Bundle;
import com.fortuneodd.shadegrid.MainActivity;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0136g implements h0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2324a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2325b;

    public C0136g(h0.d dVar) {
        X0.d.e(dVar, "registry");
        this.f2325b = new LinkedHashSet();
        dVar.e("androidx.savedstate.Restarter", this);
    }

    @Override // h0.c
    public final Bundle a() {
        switch (this.f2324a) {
            case 0:
                Bundle bundle = new Bundle();
                ((MainActivity) this.f2325b).l().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2325b));
                return bundle2;
        }
    }

    public C0136g(MainActivity mainActivity) {
        this.f2325b = mainActivity;
    }
}
