package o;

import android.view.MotionEvent;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class EI {
    public final ArrayList a;
    public int b;

    public EI(ArrayList arrayList, C2002u5 c2002u5) {
        this.a = arrayList;
        C0208Hx c0208Hx = (C0208Hx) c2002u5.j;
        MotionEvent motionEvent = (MotionEvent) c0208Hx.j;
        if (motionEvent != null) {
            motionEvent.getButtonState();
        }
        MotionEvent motionEvent2 = (MotionEvent) c0208Hx.j;
        if (motionEvent2 != null) {
            motionEvent2.getMetaState();
        }
        MotionEvent motionEvent3 = (MotionEvent) c0208Hx.j;
        int i = 3;
        if (motionEvent3 != null) {
            int actionMasked = motionEvent3.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                                break;
                            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                                break;
                            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                                break;
                            case 8:
                                i = 6;
                                break;
                            case 9:
                                i = 4;
                                break;
                            case 10:
                                i = 5;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                    }
                }
                i = 2;
            }
            i = 1;
        } else {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                HI hi = (HI) arrayList.get(i2);
                boolean z = hi.h;
                boolean z2 = hi.d;
                if (z && !z2) {
                    i = 2;
                } else if (!z && z2) {
                    i = 1;
                }
            }
        }
        this.b = i;
    }

    public boolean a() {
        return this.b < this.a.size();
    }

    public EI(ArrayList arrayList) {
        this.a = arrayList;
    }
}
