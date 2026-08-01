package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class d60 {
    public long a;
    public final SparseLongArray b = new SparseLongArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final ArrayList d = new ArrayList();
    public int e = -1;
    public int f = -1;

    /* JADX WARN: Removed duplicated region for block: B:50:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j3 a(MotionEvent motionEvent, f3 f3Var) {
        long j;
        int i;
        int i2;
        boolean z;
        boolean z2;
        long j2;
        long j3;
        long u;
        float rawX;
        float rawY;
        long floatToRawIntBits;
        long F;
        int toolType;
        int i3;
        int historySize;
        int i4;
        char c;
        long j4;
        char c2;
        int i5;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.b;
        SparseBooleanArray sparseBooleanArray = this.c;
        int i6 = 3;
        if (actionMasked != 3) {
            int i7 = 4;
            if (actionMasked != 4) {
                if (motionEvent.getPointerCount() == 1) {
                    int toolType2 = motionEvent.getToolType(0);
                    int source = motionEvent.getSource();
                    if (toolType2 != this.e || source != this.f) {
                        this.e = toolType2;
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
                        long j5 = this.a;
                        this.a = j5 + 1;
                        sparseLongArray.put(pointerId, j5);
                        if (motionEvent.getToolType(actionIndex) == 3) {
                            sparseBooleanArray.put(pointerId, true);
                        }
                    }
                } else {
                    if (actionMasked2 == 9) {
                        int pointerId2 = motionEvent.getPointerId(0);
                        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                            long j6 = this.a;
                            j = 1;
                            this.a = j6 + 1;
                            sparseLongArray.put(pointerId2, j6);
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
                int i8 = 0;
                while (i8 < pointerCount) {
                    boolean z5 = (z3 || i8 == actionIndex2 || (z4 && motionEvent.getButtonState() == 0)) ? false : true;
                    int pointerId3 = motionEvent.getPointerId(i8);
                    int indexOfKey = sparseLongArray.indexOfKey(pointerId3);
                    if (indexOfKey >= 0) {
                        z2 = z3;
                        z = z4;
                        j2 = sparseLongArray.valueAt(indexOfKey);
                    } else {
                        z = z4;
                        long j7 = this.a;
                        z2 = z3;
                        this.a = j7 + j;
                        sparseLongArray.put(pointerId3, j7);
                        j2 = j7;
                    }
                    float pressure = motionEvent.getPressure(i8);
                    char c3 = ' ';
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(motionEvent.getY(i8)) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getX(i8)) << 32);
                    long a = ra0.a(floatToRawIntBits2, i6);
                    if (i8 == 0) {
                        floatToRawIntBits = (Float.floatToRawIntBits(motionEvent.getRawY()) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getRawX()) << 32);
                        F = f3Var.F(floatToRawIntBits);
                    } else if (Build.VERSION.SDK_INT >= 29) {
                        rawX = motionEvent.getRawX(i8);
                        rawY = motionEvent.getRawY(i8);
                        floatToRawIntBits = (Float.floatToRawIntBits(rawY) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
                        F = f3Var.F(floatToRawIntBits);
                    } else {
                        j3 = floatToRawIntBits2;
                        u = f3Var.u(floatToRawIntBits2);
                        toolType = motionEvent.getToolType(i8);
                        if (toolType != 0) {
                            if (toolType == 1) {
                                i3 = 1;
                            } else if (toolType == 2) {
                                i3 = i6;
                            } else if (toolType == i6) {
                                i3 = 2;
                            } else if (toolType == i7) {
                                i3 = i7;
                            }
                            ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                            historySize = motionEvent.getHistorySize();
                            i4 = 0;
                            while (i4 < historySize) {
                                float historicalX = motionEvent.getHistoricalX(i8, i4);
                                float historicalY = motionEvent.getHistoricalY(i8, i4);
                                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                                    c2 = c3;
                                    i5 = pointerCount;
                                } else {
                                    long floatToRawIntBits3 = Float.floatToRawIntBits(historicalX);
                                    int floatToRawIntBits4 = Float.floatToRawIntBits(historicalY);
                                    c2 = c3;
                                    i5 = pointerCount;
                                    long j8 = (floatToRawIntBits3 << c2) | (floatToRawIntBits4 & 4294967295L);
                                    arrayList2.add(new gw(motionEvent.getHistoricalEventTime(i4), j8, j8));
                                }
                                i4++;
                                c3 = c2;
                                pointerCount = i5;
                            }
                            char c4 = c3;
                            int i9 = pointerCount;
                            if (motionEvent.getActionMasked() == 8) {
                                c = '\n';
                                j4 = (Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + 0.0f) & 4294967295L) | (Float.floatToRawIntBits(motionEvent.getAxisValue(10)) << c4);
                            } else {
                                c = '\n';
                                j4 = 0;
                            }
                            arrayList.add(new yg0(j2, motionEvent.getEventTime(), u, j3, z5, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i8), false), arrayList2, j4, a));
                            i8++;
                            z4 = z;
                            z3 = z2;
                            pointerCount = i9;
                            i6 = 3;
                            i7 = 4;
                        }
                        i3 = 0;
                        ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
                        historySize = motionEvent.getHistorySize();
                        i4 = 0;
                        while (i4 < historySize) {
                        }
                        char c42 = c3;
                        int i92 = pointerCount;
                        if (motionEvent.getActionMasked() == 8) {
                        }
                        arrayList.add(new yg0(j2, motionEvent.getEventTime(), u, j3, z5, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i8), false), arrayList22, j4, a));
                        i8++;
                        z4 = z;
                        z3 = z2;
                        pointerCount = i92;
                        i6 = 3;
                        i7 = 4;
                    }
                    u = floatToRawIntBits;
                    j3 = F;
                    toolType = motionEvent.getToolType(i8);
                    if (toolType != 0) {
                    }
                    i3 = 0;
                    ArrayList arrayList222 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    i4 = 0;
                    while (i4 < historySize) {
                    }
                    char c422 = c3;
                    int i922 = pointerCount;
                    if (motionEvent.getActionMasked() == 8) {
                    }
                    arrayList.add(new yg0(j2, motionEvent.getEventTime(), u, j3, z5, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i8), false), arrayList222, j4, a));
                    i8++;
                    z4 = z;
                    z3 = z2;
                    pointerCount = i922;
                    i6 = 3;
                    i7 = 4;
                }
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
                        int i10 = i2;
                        while (true) {
                            if (i10 >= pointerCount2) {
                                sparseLongArray.removeAt(size);
                                sparseBooleanArray.delete(keyAt);
                                break;
                            }
                            if (motionEvent.getPointerId(i10) == keyAt) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
                motionEvent.getEventTime();
                return new j3(9, arrayList, motionEvent);
            }
        }
        sparseLongArray.clear();
        sparseBooleanArray.clear();
        return null;
    }
}
