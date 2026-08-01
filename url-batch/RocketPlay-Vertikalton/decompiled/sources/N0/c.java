package N0;

import F1.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x.AbstractC0379a;

/* loaded from: classes.dex */
public final class c extends l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0379a f901f;

    public /* synthetic */ c(AbstractC0379a abstractC0379a, int i) {
        this.f900e = i;
        this.f901f = abstractC0379a;
    }

    @Override // F1.l
    public int L(View view) {
        switch (this.f900e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f901f;
                return sideSheetBehavior.f2343l + sideSheetBehavior.f2346o;
            default:
                return super.L(view);
        }
    }

    @Override // F1.l
    public int M() {
        switch (this.f900e) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f901f;
                return bottomSheetBehavior.f2150I ? bottomSheetBehavior.f2161T : bottomSheetBehavior.f2148G;
            default:
                return super.M();
        }
    }

    @Override // F1.l
    public final void a0(int i) {
        switch (this.f900e) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f901f;
                    if (sideSheetBehavior.f2340g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f901f;
                    if (bottomSheetBehavior.f2152K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // F1.l
    public final void b0(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f900e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f901f;
                WeakReference weakReference = sideSheetBehavior.f2348q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f2335a.q0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f2352u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f2335a.f(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.f901f).u(i2);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r4.f2147E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f2147E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f2146D) < java.lang.Math.abs(r7 - r4.f2148G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (r0.f2335a.R(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f2335a.D()) < java.lang.Math.abs(r7 - r0.f2335a.E())) goto L73;
     */
    @Override // F1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0(View view, float f2, float f3) {
        switch (this.f900e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f901f;
                int i = 3;
                if (!sideSheetBehavior.f2335a.P(f2)) {
                    if (sideSheetBehavior.f2335a.m0(view, f2)) {
                        if (!sideSheetBehavior.f2335a.S(f2, f3)) {
                            break;
                        }
                        i = 5;
                    } else {
                        if (f2 == RecyclerView.f1949A0 || Math.abs(f2) <= Math.abs(f3)) {
                            int left = view.getLeft();
                            break;
                        }
                        i = 5;
                    }
                }
                sideSheetBehavior.t(view, i, true);
                break;
            default:
                int i2 = 6;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f901f;
                if (f3 < RecyclerView.f1949A0) {
                    if (!bottomSheetBehavior.f2170b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i2 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i2, true);
                    break;
                } else if (bottomSheetBehavior.f2150I && bottomSheetBehavior.D(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= bottomSheetBehavior.d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f2161T) / 2) {
                            if (!bottomSheetBehavior.f2170b) {
                                break;
                            }
                            i2 = 3;
                            bottomSheetBehavior.getClass();
                            bottomSheetBehavior.E(view, i2, true);
                        }
                    }
                    i2 = 5;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i2, true);
                } else {
                    if (f3 == RecyclerView.f1949A0 || Math.abs(f2) > Math.abs(f3)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.f2170b) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.f2147E;
                            if (top2 < i3) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f2148G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 3;
                            } else {
                                if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.f2148G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f2170b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f2147E) < Math.abs(top3 - bottomSheetBehavior.f2148G)) {
                                bottomSheetBehavior.getClass();
                            }
                        }
                        i2 = 4;
                    }
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i2, true);
                }
                break;
        }
    }

    @Override // F1.l
    public final int n(View view, int i) {
        switch (this.f900e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f901f;
                return l.m(i, sideSheetBehavior.f2335a.G(), sideSheetBehavior.f2335a.F());
            default:
                return view.getLeft();
        }
    }

    @Override // F1.l
    public final int o(View view, int i) {
        switch (this.f900e) {
            case 0:
                return view.getTop();
            default:
                return l.m(i, ((BottomSheetBehavior) this.f901f).x(), M());
        }
    }

    @Override // F1.l
    public final boolean p0(View view, int i) {
        WeakReference weakReference;
        switch (this.f900e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f901f;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.f2347p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f901f;
                int i2 = bottomSheetBehavior.f2153L;
                if (i2 != 1 && !bottomSheetBehavior.f2169a0) {
                    if (i2 == 3 && bottomSheetBehavior.f2166Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f2163V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f2162U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
