package K0;

import D0.p;
import K.S;
import M0.B;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import x.AbstractC0333a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f464a;

    /* renamed from: b, reason: collision with root package name */
    public int f465b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f466c;
    public final Runnable d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC0333a f467e;

    public e(SideSheetBehavior sideSheetBehavior) {
        this.f464a = 0;
        this.f467e = sideSheetBehavior;
        this.d = new p(1, this);
    }

    public final void a(int i) {
        Runnable runnable = this.d;
        AbstractC0333a abstractC0333a = this.f467e;
        switch (this.f464a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0333a;
                WeakReference weakReference = sideSheetBehavior.f1755p;
                if (weakReference != null && weakReference.get() != null) {
                    this.f465b = i;
                    if (!this.f466c) {
                        WeakHashMap weakHashMap = S.f360a;
                        ((View) sideSheetBehavior.f1755p.get()).postOnAnimation((p) runnable);
                        this.f466c = true;
                        break;
                    }
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0333a;
                WeakReference weakReference2 = bottomSheetBehavior.f1568U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f465b = i;
                    if (!this.f466c) {
                        WeakHashMap weakHashMap2 = S.f360a;
                        ((View) bottomSheetBehavior.f1568U.get()).postOnAnimation((B) runnable);
                        this.f466c = true;
                        break;
                    }
                }
                break;
        }
    }

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f464a = 1;
        this.f467e = bottomSheetBehavior;
        this.d = new B(13, this);
    }
}
