package g;

import android.os.Bundle;
import com.linetic.luckycross.MainActivity;
import h0.C0133d;
import h0.InterfaceC0132c;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124g implements InterfaceC0132c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2321a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2322b;

    public C0124g(C0133d c0133d) {
        X0.d.e(c0133d, "registry");
        this.f2322b = new LinkedHashSet();
        c0133d.e("androidx.savedstate.Restarter", this);
    }

    @Override // h0.InterfaceC0132c
    public final Bundle a() {
        switch (this.f2321a) {
            case 0:
                Bundle bundle = new Bundle();
                ((MainActivity) this.f2322b).l().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2322b));
                return bundle2;
        }
    }

    public C0124g(MainActivity mainActivity) {
        this.f2322b = mainActivity;
    }
}
