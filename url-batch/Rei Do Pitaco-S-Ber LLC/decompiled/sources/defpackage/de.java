package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class de implements Runnable {
    public final /* synthetic */ int f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ je h;

    public /* synthetic */ de(je jeVar, ArrayList arrayList, int i) {
        this.f = i;
        this.h = jeVar;
        this.g = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c;
        int i = this.f;
        int i2 = 0;
        ArrayList arrayList = this.g;
        switch (i) {
            case 0:
                int size = arrayList.size();
                while (true) {
                    je jeVar = this.h;
                    if (i2 >= size) {
                        arrayList.clear();
                        jeVar.m.remove(arrayList);
                        break;
                    } else {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ie ieVar = (ie) obj;
                        dz dzVar = ieVar.a;
                        int i3 = ieVar.b;
                        int i4 = ieVar.c;
                        int i5 = ieVar.d;
                        int i6 = ieVar.e;
                        jeVar.getClass();
                        View view = dzVar.a;
                        int i7 = i5 - i3;
                        int i8 = i6 - i4;
                        if (i7 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i8 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        jeVar.p.add(dzVar);
                        animate.setDuration(jeVar.e).setListener(new fe(jeVar, dzVar, i7, view, i8, animate)).start();
                    }
                }
            case 1:
                int size2 = arrayList.size();
                while (true) {
                    je jeVar2 = this.h;
                    if (i2 >= size2) {
                        arrayList.clear();
                        jeVar2.n.remove(arrayList);
                        break;
                    } else {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        he heVar = (he) obj2;
                        ArrayList arrayList2 = jeVar2.r;
                        long j = jeVar2.f;
                        dz dzVar2 = heVar.a;
                        View view2 = dzVar2 == null ? null : dzVar2.a;
                        dz dzVar3 = heVar.b;
                        View view3 = dzVar3 != null ? dzVar3.a : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList2.add(heVar.a);
                            duration.translationX(heVar.e - heVar.c);
                            duration.translationY(heVar.f - heVar.d);
                            duration.alpha(0.0f).setListener(new ge(jeVar2, heVar, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList2.add(heVar.b);
                            c = 0;
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new ge(jeVar2, heVar, animate2, view3, 1)).start();
                        } else {
                            c = 0;
                        }
                    }
                }
            default:
                int size3 = arrayList.size();
                while (true) {
                    je jeVar3 = this.h;
                    if (i2 >= size3) {
                        arrayList.clear();
                        jeVar3.l.remove(arrayList);
                        break;
                    } else {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        dz dzVar4 = (dz) obj3;
                        jeVar3.getClass();
                        View view4 = dzVar4.a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        jeVar3.o.add(dzVar4);
                        animate3.alpha(1.0f).setDuration(jeVar3.c).setListener(new ee(jeVar3, dzVar4, view4, animate3)).start();
                    }
                }
        }
    }
}
