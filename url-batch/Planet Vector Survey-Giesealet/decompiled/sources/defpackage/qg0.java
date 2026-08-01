package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class qg0 {
    public final List a;
    public int b;

    public qg0(List list, j3 j3Var) {
        this.a = list;
        if (Build.VERSION.SDK_INT >= 29) {
            MotionEvent motionEvent = j3Var != null ? (MotionEvent) ((j3) j3Var.f).f : null;
            if (motionEvent != null) {
                motionEvent.getClassification();
            }
        }
        MotionEvent motionEvent2 = j3Var != null ? (MotionEvent) ((j3) j3Var.f).f : null;
        if (motionEvent2 != null) {
            motionEvent2.getButtonState();
        }
        MotionEvent motionEvent3 = j3Var != null ? (MotionEvent) ((j3) j3Var.f).f : null;
        if (motionEvent3 != null) {
            motionEvent3.getMetaState();
        }
        MotionEvent motionEvent4 = j3Var != null ? (MotionEvent) ((j3) j3Var.f).f : null;
        int i = 0;
        if (motionEvent4 != null) {
            int actionMasked = motionEvent4.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
                                i = 5;
                                break;
                        }
                    }
                    i = 3;
                }
                i = 2;
            }
            i = 1;
        } else {
            int size = list.size();
            while (i < size) {
                wg0 wg0Var = (wg0) list.get(i);
                if (rg0.d(wg0Var)) {
                    i = 2;
                } else if (rg0.c(wg0Var)) {
                    i = 1;
                } else {
                    i++;
                }
            }
            i = 3;
        }
        this.b = i;
    }
}
