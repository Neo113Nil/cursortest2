package defpackage;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class d8 extends j90 {
    public final /* synthetic */ int d;
    public final /* synthetic */ hd e;

    public /* synthetic */ d8(hd hdVar, int i) {
        this.d = i;
        this.e = hdVar;
    }

    @Override // defpackage.j90
    public final int a(View view, int i) {
        switch (this.d) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                return m60.m(i, sideSheetBehavior.a.F(), sideSheetBehavior.a.E());
        }
    }

    @Override // defpackage.j90
    public final int b(View view, int i) {
        switch (this.d) {
            case 0:
                return m60.m(i, ((BottomSheetBehavior) this.e).y(), e());
            default:
                return view.getTop();
        }
    }

    @Override // defpackage.j90
    public int d(View view) {
        switch (this.d) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                return sideSheetBehavior.l + sideSheetBehavior.o;
            default:
                return super.d(view);
        }
    }

    @Override // defpackage.j90
    public int e() {
        switch (this.d) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                return bottomSheetBehavior.J ? bottomSheetBehavior.X : bottomSheetBehavior.H;
            default:
                return super.e();
        }
    }

    @Override // defpackage.j90
    public final void g(int i) {
        int i2 = this.d;
        hd hdVar = this.e;
        switch (i2) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) hdVar;
                    if (bottomSheetBehavior.L) {
                        bottomSheetBehavior.F(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) hdVar;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.r(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.j90
    public final void h(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3 = this.d;
        hd hdVar = this.e;
        switch (i3) {
            case 0:
                ((BottomSheetBehavior) hdVar).v(i2);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) hdVar;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.a.k0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.u;
                if (!linkedHashSet.isEmpty()) {
                    sideSheetBehavior.a.i(i);
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        l8.c();
                        break;
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r6.a.T(r7) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (java.lang.Math.abs(r8 - r6.a.B()) < java.lang.Math.abs(r8 - r6.a.D())) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r8 > r6.F) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
    
        if (java.lang.Math.abs(r7.getTop() - r6.y()) < java.lang.Math.abs(r7.getTop() - r6.F)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fb, code lost:
    
        if (java.lang.Math.abs(r8 - r6.F) < java.lang.Math.abs(r8 - r6.H)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0115, code lost:
    
        if (java.lang.Math.abs(r8 - r6.E) < java.lang.Math.abs(r8 - r6.H)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0124, code lost:
    
        if (r8 < java.lang.Math.abs(r8 - r6.H)) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0134, code lost:
    
        if (java.lang.Math.abs(r8 - r9) < java.lang.Math.abs(r8 - r6.H)) goto L50;
     */
    @Override // defpackage.j90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(View view, float f, float f2) {
        int i = this.d;
        int i2 = 3;
        hd hdVar = this.e;
        switch (i) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) hdVar;
                if (f2 < 0.0f) {
                    if (!bottomSheetBehavior.b) {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        break;
                    }
                    bottomSheetBehavior.H(view, i2, true);
                    break;
                } else if (bottomSheetBehavior.J && bottomSheetBehavior.G(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.d) {
                        if (view.getTop() <= (bottomSheetBehavior.y() + bottomSheetBehavior.X) / 2) {
                            if (!bottomSheetBehavior.b) {
                                break;
                            }
                            bottomSheetBehavior.H(view, i2, true);
                        }
                    }
                    i2 = 5;
                    bottomSheetBehavior.H(view, i2, true);
                } else {
                    if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.b) {
                            break;
                        } else {
                            int i3 = bottomSheetBehavior.F;
                            if (top2 >= i3) {
                                break;
                            } else {
                                break;
                            }
                            i2 = 6;
                        }
                    } else {
                        if (!bottomSheetBehavior.b) {
                            int top3 = view.getTop();
                            break;
                        }
                        i2 = 4;
                    }
                    bottomSheetBehavior.H(view, i2, true);
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) hdVar;
                if (!sideSheetBehavior.a.S(f)) {
                    if (sideSheetBehavior.a.g0(view, f)) {
                        if (!sideSheetBehavior.a.U(f, f2)) {
                            break;
                        }
                        i2 = 5;
                    } else {
                        if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                            int left = view.getLeft();
                            break;
                        }
                        i2 = 5;
                    }
                }
                sideSheetBehavior.t(view, i2, true);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        if (r0.canScrollVertically(-1) != false) goto L41;
     */
    @Override // defpackage.j90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(View view, int i) {
        WeakReference weakReference;
        int i2 = this.d;
        hd hdVar = this.e;
        switch (i2) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) hdVar;
                int i3 = bottomSheetBehavior.P;
                if (i3 != 1 && !bottomSheetBehavior.f0) {
                    if (i3 == 3 && bottomSheetBehavior.c0 == i) {
                        View view2 = null;
                        if (bottomSheetBehavior.e) {
                            WeakReference weakReference2 = bottomSheetBehavior.e0;
                            if (weakReference2 != null) {
                                view2 = (View) weakReference2.get();
                            }
                        } else {
                            ArrayList arrayList = bottomSheetBehavior.Z;
                            if (!arrayList.isEmpty()) {
                                view2 = (View) ((WeakReference) arrayList.get(0)).get();
                            }
                        }
                        if (view2 != null) {
                            break;
                        }
                    }
                    SystemClock.uptimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.Y;
                    if (weakReference3 != null && weakReference3.get() == view) {
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) hdVar;
                if (sideSheetBehavior.h == 1 || (weakReference = sideSheetBehavior.p) == null || weakReference.get() != view) {
                    break;
                }
                break;
        }
        return false;
    }
}
