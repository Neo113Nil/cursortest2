package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class ay implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ RecyclerView g;

    public /* synthetic */ ay(RecyclerView recyclerView, int i) {
        this.f = i;
        this.g = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.f;
        RecyclerView recyclerView = this.g;
        switch (i) {
            case 0:
                if (recyclerView.z && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.x) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.C) {
                        recyclerView.p();
                        break;
                    } else {
                        recyclerView.B = true;
                        break;
                    }
                }
                break;
            default:
                jy jyVar = recyclerView.Q;
                if (jyVar != null) {
                    je jeVar = (je) jyVar;
                    long j = jeVar.d;
                    ArrayList arrayList = jeVar.h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = jeVar.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = jeVar.k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = jeVar.i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            dz dzVar = (dz) obj;
                            View view = dzVar.a;
                            ArrayList arrayList5 = arrayList;
                            ViewPropertyAnimator animate = view.animate();
                            jeVar.q.add(dzVar);
                            animate.setDuration(j).alpha(0.0f).setListener(new ee(jeVar, dzVar, animate, view)).start();
                            arrayList = arrayList5;
                            isEmpty = isEmpty;
                            isEmpty2 = isEmpty2;
                        }
                        boolean z2 = isEmpty;
                        boolean z3 = isEmpty2;
                        arrayList.clear();
                        if (!z3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList2);
                            jeVar.m.add(arrayList6);
                            arrayList2.clear();
                            de deVar = new de(jeVar, arrayList6, 0);
                            if (z2) {
                                deVar.run();
                            } else {
                                View view2 = ((ie) arrayList6.get(0)).a.a;
                                WeakHashMap weakHashMap = f80.a;
                                view2.postOnAnimationDelayed(deVar, j);
                            }
                        }
                        if (!isEmpty3) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList3);
                            jeVar.n.add(arrayList7);
                            arrayList3.clear();
                            de deVar2 = new de(jeVar, arrayList7, 1);
                            if (z2) {
                                deVar2.run();
                            } else {
                                View view3 = ((he) arrayList7.get(0)).a.a;
                                WeakHashMap weakHashMap2 = f80.a;
                                view3.postOnAnimationDelayed(deVar2, j);
                            }
                        }
                        if (!isEmpty4) {
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.addAll(arrayList4);
                            jeVar.l.add(arrayList8);
                            arrayList4.clear();
                            de deVar3 = new de(jeVar, arrayList8, 2);
                            if (!z2 || !z3 || !isEmpty3) {
                                if (z2) {
                                    j = 0;
                                }
                                long max = Math.max(!z3 ? jeVar.e : 0L, isEmpty3 ? 0L : jeVar.f) + j;
                                z = false;
                                View view4 = ((dz) arrayList8.get(0)).a;
                                WeakHashMap weakHashMap3 = f80.a;
                                view4.postOnAnimationDelayed(deVar3, max);
                                recyclerView.r0 = z;
                                break;
                            } else {
                                deVar3.run();
                            }
                        }
                    }
                }
                z = false;
                recyclerView.r0 = z;
        }
    }
}
