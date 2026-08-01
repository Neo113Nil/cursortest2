package g;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import i0.C0141d;
import i0.InterfaceC0140c;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: g.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0106g implements InterfaceC0140c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2237a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2238b;

    public C0106g(C0141d c0141d) {
        g1.f.e(c0141d, "registry");
        this.f2238b = new LinkedHashSet();
        c0141d.e("androidx.savedstate.Restarter", this);
    }

    @Override // i0.InterfaceC0140c
    public final Bundle a() {
        switch (this.f2237a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AppCompatActivity) this.f2238b).l().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f2238b));
                return bundle2;
        }
    }

    public C0106g(AppCompatActivity appCompatActivity) {
        this.f2238b = appCompatActivity;
    }
}
