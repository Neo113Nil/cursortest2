package K0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x.AbstractC0333a;

/* loaded from: classes.dex */
public final class c extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC0333a f462f;

    public /* synthetic */ c(AbstractC0333a abstractC0333a, int i) {
        this.f461e = i;
        this.f462f = abstractC0333a;
    }

    @Override // q1.d
    public int A() {
        switch (this.f461e) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f462f;
                return bottomSheetBehavior.f1556I ? bottomSheetBehavior.f1567T : bottomSheetBehavior.f1554G;
            default:
                return super.A();
        }
    }

    @Override // q1.d
    public final void G(int i) {
        switch (this.f461e) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f462f;
                    if (sideSheetBehavior.f1748g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f462f;
                    if (bottomSheetBehavior.f1558K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // q1.d
    public final void H(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f461e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f462f;
                WeakReference weakReference = sideSheetBehavior.f1756q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f1743a.v0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1760u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f1743a.k(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.f462f).u(i2);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r4.f1553E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f1553E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f1552D) < java.lang.Math.abs(r7 - r4.f1554G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (r0.f1743a.V(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f1743a.E()) < java.lang.Math.abs(r7 - r0.f1743a.F())) goto L73;
     */
    @Override // q1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(View view, float f2, float f3) {
        switch (this.f461e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f462f;
                int i = 3;
                if (!sideSheetBehavior.f1743a.T(f2)) {
                    if (sideSheetBehavior.f1743a.s0(view, f2)) {
                        if (!sideSheetBehavior.f1743a.W(f2, f3)) {
                            break;
                        }
                        i = 5;
                    } else {
                        if (f2 == 0.0f || Math.abs(f2) <= Math.abs(f3)) {
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
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f462f;
                if (f3 < 0.0f) {
                    if (!bottomSheetBehavior.f1576b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i2 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i2, true);
                    break;
                } else if (bottomSheetBehavior.f1556I && bottomSheetBehavior.D(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= bottomSheetBehavior.d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f1567T) / 2) {
                            if (!bottomSheetBehavior.f1576b) {
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
                    if (f3 == 0.0f || Math.abs(f2) > Math.abs(f3)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.f1576b) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.f1553E;
                            if (top2 < i3) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f1554G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 3;
                            } else {
                                if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.f1554G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f1576b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f1553E) < Math.abs(top3 - bottomSheetBehavior.f1554G)) {
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

    @Override // q1.d
    public final boolean Z(View view, int i) {
        WeakReference weakReference;
        switch (this.f461e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f462f;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.f1755p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f462f;
                int i2 = bottomSheetBehavior.f1559L;
                if (i2 != 1 && !bottomSheetBehavior.f1575a0) {
                    if (i2 == 3 && bottomSheetBehavior.f1572Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f1569V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f1568U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // q1.d
    public final int e(View view, int i) {
        switch (this.f461e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f462f;
                return q1.d.d(i, sideSheetBehavior.f1743a.K(), sideSheetBehavior.f1743a.J());
            default:
                return view.getLeft();
        }
    }

    @Override // q1.d
    public final int f(View view, int i) {
        switch (this.f461e) {
            case 0:
                return view.getTop();
            default:
                return q1.d.d(i, ((BottomSheetBehavior) this.f462f).x(), A());
        }
    }

    @Override // q1.d
    public int z(View view) {
        switch (this.f461e) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f462f;
                return sideSheetBehavior.f1751l + sideSheetBehavior.f1754o;
            default:
                return super.z(view);
        }
    }
}
