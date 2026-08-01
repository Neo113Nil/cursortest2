package I0;

import B0.q;
import K.T;
import K0.B;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import x.AbstractC0336a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f348a;

    /* renamed from: b, reason: collision with root package name */
    public int f349b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f350c;
    public final Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0336a f351e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f348a = 0;
        this.f351e = sideSheetBehavior;
        this.d = new q(1, this);
    }

    public final void a(int i) {
        Runnable runnable = this.d;
        AbstractC0336a abstractC0336a = this.f351e;
        switch (this.f348a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0336a;
                WeakReference weakReference = sideSheetBehavior.f1745p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f349b = i;
                    if (!this.f350c) {
                        WeakHashMap weakHashMap = T.f381a;
                        ((View) sideSheetBehavior.f1745p.get()).postOnAnimation((q) runnable);
                        this.f350c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0336a;
                WeakReference weakReference2 = bottomSheetBehavior.f1559U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f349b = i;
                    if (!this.f350c) {
                        WeakHashMap weakHashMap2 = T.f381a;
                        ((View) bottomSheetBehavior.f1559U.get()).postOnAnimation((B) runnable);
                        this.f350c = true;
                        break;
                    }
                }
                break;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f348a = 1;
        this.f351e = bottomSheetBehavior;
        this.d = new B(13, this);
    }
}
