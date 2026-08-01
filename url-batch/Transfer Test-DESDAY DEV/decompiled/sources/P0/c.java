package P0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import x.AbstractC0346a;

/* loaded from: classes.dex */
public final class c extends T.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0346a f607b;

    public /* synthetic */ c(AbstractC0346a abstractC0346a, int i) {
        this.f606a = i;
        this.f607b = abstractC0346a;
    }

    @Override // T.e
    public int B(View view) {
        switch (this.f606a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f607b;
                return sideSheetBehavior.f1976l + sideSheetBehavior.f1979o;
            default:
                return super.B(view);
        }
    }

    @Override // T.e
    public int C() {
        switch (this.f606a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f607b;
                return bottomSheetBehavior.f1782I ? bottomSheetBehavior.f1793T : bottomSheetBehavior.f1780G;
            default:
                return super.C();
        }
    }

    @Override // T.e
    public final void L(int i) {
        switch (this.f606a) {
            case 0:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f607b;
                    if (sideSheetBehavior.f1973g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f607b;
                    if (bottomSheetBehavior.f1784K) {
                        bottomSheetBehavior.C(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // T.e
    public final void M(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f606a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f607b;
                WeakReference weakReference = sideSheetBehavior.f1981q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f1968a.C0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f1985u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f1968a.h(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
            default:
                ((BottomSheetBehavior) this.f607b).u(i2);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r7 > r4.f1779E) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.x()) < java.lang.Math.abs(r6.getTop() - r4.f1779E)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f1778D) < java.lang.Math.abs(r7 - r4.f1780G)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (r0.f1968a.c0(r6) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0146, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f1968a.L()) < java.lang.Math.abs(r7 - r0.f1968a.M())) goto L73;
     */
    @Override // T.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(View view, float f2, float f3) {
        switch (this.f606a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f607b;
                int i = 3;
                if (!sideSheetBehavior.f1968a.Z(f2)) {
                    if (sideSheetBehavior.f1968a.B0(view, f2)) {
                        if (!sideSheetBehavior.f1968a.d0(f2, f3)) {
                            break;
                        }
                        i = 5;
                    } else {
                        if (f2 == RecyclerView.f1570A0 || Math.abs(f2) <= Math.abs(f3)) {
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
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f607b;
                if (f3 < RecyclerView.f1570A0) {
                    if (!bottomSheetBehavior.f1802b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i2 = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.E(view, i2, true);
                    break;
                } else if (bottomSheetBehavior.f1782I && bottomSheetBehavior.D(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= bottomSheetBehavior.d) {
                        if (view.getTop() <= (bottomSheetBehavior.x() + bottomSheetBehavior.f1793T) / 2) {
                            if (!bottomSheetBehavior.f1802b) {
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
                    if (f3 == RecyclerView.f1570A0 || Math.abs(f2) > Math.abs(f3)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.f1802b) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.f1779E;
                            if (top2 < i3) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f1780G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 3;
                            } else {
                                if (Math.abs(top2 - i3) < Math.abs(top2 - bottomSheetBehavior.f1780G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i2 = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f1802b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f1779E) < Math.abs(top3 - bottomSheetBehavior.f1780G)) {
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

    @Override // T.e
    public final boolean Y(View view, int i) {
        WeakReference weakReference;
        switch (this.f606a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f607b;
                if (sideSheetBehavior.h != 1 && (weakReference = sideSheetBehavior.f1980p) != null && weakReference.get() == view) {
                    break;
                }
                break;
            default:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f607b;
                int i2 = bottomSheetBehavior.f1785L;
                if (i2 != 1 && !bottomSheetBehavior.f1801a0) {
                    if (i2 == 3 && bottomSheetBehavior.f1798Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f1795V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f1794U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // T.e
    public final int k(View view, int i) {
        switch (this.f606a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f607b;
                return A.c.n(i, sideSheetBehavior.f1968a.P(), sideSheetBehavior.f1968a.O());
            default:
                return view.getLeft();
        }
    }

    @Override // T.e
    public final int l(View view, int i) {
        switch (this.f606a) {
            case 0:
                return view.getTop();
            default:
                return A.c.n(i, ((BottomSheetBehavior) this.f607b).x(), C());
        }
    }
}
