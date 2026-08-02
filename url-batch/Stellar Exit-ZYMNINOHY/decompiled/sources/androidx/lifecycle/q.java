package androidx.lifecycle;

import D.u;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class q extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f450b = 0;

    /* renamed from: a, reason: collision with root package name */
    public u f451a;

    public final void a(d dVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            e0.h.d(activity, "activity");
            a.a.i(activity, dVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(d.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(d.ON_DESTROY);
        this.f451a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(d.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        u uVar = this.f451a;
        if (uVar != null) {
            ((n) uVar.f111c).b();
        }
        a(d.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        u uVar = this.f451a;
        if (uVar != null) {
            n nVar = (n) uVar.f111c;
            int i2 = nVar.f442a + 1;
            nVar.f442a = i2;
            if (i2 == 1 && nVar.f445d) {
                nVar.f447f.a(d.ON_START);
                nVar.f445d = false;
            }
        }
        a(d.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(d.ON_STOP);
    }
}
