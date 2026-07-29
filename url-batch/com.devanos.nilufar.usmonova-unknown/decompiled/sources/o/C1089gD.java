package o;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* renamed from: o.gD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1089gD {
    public long a;
    public final SparseLongArray b = new SparseLongArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final ArrayList d = new ArrayList();
    public int e = -1;
    public int f = -1;

    /* JADX WARN: Removed duplicated region for block: B:61:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0208Hx a(MotionEvent motionEvent, S2 s2) {
        long j;
        int i;
        int i2;
        boolean z;
        boolean z2;
        long j2;
        long r;
        int i3;
        int historySize;
        int i4;
        char c;
        long j3;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.b;
        SparseBooleanArray sparseBooleanArray = this.c;
        if (actionMasked == 3 || actionMasked == 4) {
            sparseLongArray.clear();
            sparseBooleanArray.clear();
            return null;
        }
        if (motionEvent.getPointerCount() == 1) {
            int toolType = motionEvent.getToolType(0);
            int source = motionEvent.getSource();
            if (toolType != this.e || source != this.f) {
                this.e = toolType;
                this.f = source;
                sparseBooleanArray.clear();
                sparseLongArray.clear();
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 5) {
            j = 1;
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j4 = this.a;
                this.a = j4 + 1;
                sparseLongArray.put(pointerId, j4);
                if (motionEvent.getToolType(actionIndex) == 3) {
                    sparseBooleanArray.put(pointerId, true);
                }
            }
        } else {
            if (actionMasked2 == 9) {
                int pointerId2 = motionEvent.getPointerId(0);
                if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                    long j5 = this.a;
                    j = 1;
                    this.a = j5 + 1;
                    sparseLongArray.put(pointerId2, j5);
                }
            }
            j = 1;
        }
        boolean z3 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z4 = actionMasked == 8;
        if (z3) {
            i = 1;
            sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        } else {
            i = 1;
        }
        int actionIndex2 = actionMasked != i ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        ArrayList arrayList = this.d;
        arrayList.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i5 = 0;
        while (i5 < pointerCount) {
            boolean z5 = (z3 || i5 == actionIndex2 || (z4 && motionEvent.getButtonState() == 0)) ? false : true;
            int pointerId3 = motionEvent.getPointerId(i5);
            int indexOfKey = sparseLongArray.indexOfKey(pointerId3);
            if (indexOfKey >= 0) {
                z2 = z3;
                z = z4;
                j2 = sparseLongArray.valueAt(indexOfKey);
            } else {
                z = z4;
                long j6 = this.a;
                z2 = z3;
                this.a = j6 + j;
                sparseLongArray.put(pointerId3, j6);
                j2 = j6;
            }
            float pressure = motionEvent.getPressure(i5);
            long h = PX.h(motionEvent.getX(i5), motionEvent.getY(i5));
            float intBitsToFloat = Float.intBitsToFloat((int) (h >> 32));
            int i6 = pointerCount;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (h & 4294967295L));
            long floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            int floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat2);
            ArrayList arrayList2 = arrayList;
            long j7 = (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L);
            if (i5 == 0) {
                r = PX.h(motionEvent.getRawX(), motionEvent.getRawY());
                h = s2.D(r);
            } else if (Build.VERSION.SDK_INT >= 29) {
                r = C1155hD.a.a(motionEvent, i5);
                h = s2.D(r);
            } else {
                r = s2.r(h);
            }
            long j8 = h;
            int toolType2 = motionEvent.getToolType(i5);
            if (toolType2 != 0) {
                if (toolType2 == 1) {
                    i3 = 1;
                } else if (toolType2 == 2) {
                    i3 = 3;
                } else if (toolType2 == 3) {
                    i3 = 2;
                } else if (toolType2 == 4) {
                    i3 = 4;
                }
                ArrayList arrayList3 = new ArrayList(motionEvent.getHistorySize());
                historySize = motionEvent.getHistorySize();
                for (i4 = 0; i4 < historySize; i4++) {
                    float historicalX = motionEvent.getHistoricalX(i5, i4);
                    float historicalY = motionEvent.getHistoricalY(i5, i4);
                    if (!Float.isInfinite(historicalX) && !Float.isNaN(historicalX) && !Float.isInfinite(historicalY) && !Float.isNaN(historicalY)) {
                        long h2 = PX.h(historicalX, historicalY);
                        arrayList3.add(new C1984tr(motionEvent.getHistoricalEventTime(i4), h2, h2));
                    }
                }
                if (motionEvent.getActionMasked() != 8) {
                    c = '\t';
                    j3 = PX.h(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f);
                } else {
                    c = '\t';
                    j3 = 0;
                }
                arrayList2.add(new JI(j2, motionEvent.getEventTime(), r, j8, z5, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i5), false), arrayList3, j3, j7));
                i5++;
                arrayList = arrayList2;
                pointerCount = i6;
                z4 = z;
                z3 = z2;
            }
            i3 = 0;
            ArrayList arrayList32 = new ArrayList(motionEvent.getHistorySize());
            historySize = motionEvent.getHistorySize();
            while (i4 < historySize) {
            }
            if (motionEvent.getActionMasked() != 8) {
            }
            arrayList2.add(new JI(j2, motionEvent.getEventTime(), r, j8, z5, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i5), false), arrayList32, j3, j7));
            i5++;
            arrayList = arrayList2;
            pointerCount = i6;
            z4 = z;
            z3 = z2;
        }
        ArrayList arrayList4 = arrayList;
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 6) {
            int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
            i2 = 0;
            if (!sparseBooleanArray.get(pointerId4, false)) {
                sparseLongArray.delete(pointerId4);
                sparseBooleanArray.delete(pointerId4);
            }
        } else {
            i2 = 0;
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int keyAt = sparseLongArray.keyAt(size);
                int pointerCount2 = motionEvent.getPointerCount();
                int i7 = i2;
                while (true) {
                    if (i7 >= pointerCount2) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(keyAt);
                        break;
                    }
                    if (motionEvent.getPointerId(i7) == keyAt) {
                        break;
                    }
                    i7++;
                }
            }
        }
        motionEvent.getEventTime();
        return new C0208Hx(arrayList4, 17, motionEvent);
    }
}
