package N0;

import G0.o;
import K.T;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import x.AbstractC0379a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f903a;

    /* renamed from: b, reason: collision with root package name */
    public int f904b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f905c;
    public final Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0379a f906e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f903a = 0;
        this.f906e = sideSheetBehavior;
        this.d = new o(1, this);
    }

    public final void a(int i) {
        Runnable runnable = this.d;
        AbstractC0379a abstractC0379a = this.f906e;
        switch (this.f903a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0379a;
                WeakReference weakReference = sideSheetBehavior.f2347p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f904b = i;
                    if (!this.f905c) {
                        WeakHashMap weakHashMap = T.f633a;
                        ((View) sideSheetBehavior.f2347p.get()).postOnAnimation((o) runnable);
                        this.f905c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0379a;
                WeakReference weakReference2 = bottomSheetBehavior.f2162U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f904b = i;
                    if (!this.f905c) {
                        WeakHashMap weakHashMap2 = T.f633a;
                        ((View) bottomSheetBehavior.f2162U.get()).postOnAnimation((A1.e) runnable);
                        this.f905c = true;
                        break;
                    }
                }
                break;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f903a = 1;
        this.f906e = bottomSheetBehavior;
        this.d = new A1.e(14, this);
    }
}
