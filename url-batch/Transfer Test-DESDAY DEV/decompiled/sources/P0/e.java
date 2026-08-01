package P0;

import K.T;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import x.AbstractC0346a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f609a;

    /* renamed from: b, reason: collision with root package name */
    public int f610b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f611c;
    public final Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0346a f612e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f609a = 0;
        this.f612e = sideSheetBehavior;
        this.d = new B0.b(2, this);
    }

    public final void a(int i) {
        Runnable runnable = this.d;
        AbstractC0346a abstractC0346a = this.f612e;
        switch (this.f609a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0346a;
                WeakReference weakReference = sideSheetBehavior.f1980p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f610b = i;
                    if (!this.f611c) {
                        WeakHashMap weakHashMap = T.f372a;
                        ((View) sideSheetBehavior.f1980p.get()).postOnAnimation((B0.b) runnable);
                        this.f611c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0346a;
                WeakReference weakReference2 = bottomSheetBehavior.f1794U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f610b = i;
                    if (!this.f611c) {
                        WeakHashMap weakHashMap2 = T.f372a;
                        ((View) bottomSheetBehavior.f1794U.get()).postOnAnimation((Q.b) runnable);
                        this.f611c = true;
                        break;
                    }
                }
                break;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f609a = 1;
        this.f612e = bottomSheetBehavior;
        this.d = new Q.b(13, this);
    }
}
