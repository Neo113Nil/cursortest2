package sg.bigo.ads.ax;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.RoundedCorner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes8.dex */
final class c {

    @Nullable
    private RoundedCorner c;

    @Nullable
    private RoundedCorner d;

    @Nullable
    private RoundedCorner e;

    @Nullable
    private RoundedCorner f;
    private int g = 0;
    private int h = 0;
    int a = 0;
    int b = 0;
    private final double i = Math.sin(Math.toRadians(45.0d));
    private final boolean[] j = {true, false, true, false};
    private final boolean[] k = {true, true, false, false};

    c() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        r1 = r6.getRadius();
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Rect a(@Nullable RoundedCorner roundedCorner, boolean z, boolean z2, int i, int i2) {
        int radius;
        Point center;
        Point center2;
        if (roundedCorner == null || Build.VERSION.SDK_INT < 31 || radius <= 0) {
            return null;
        }
        int sin = (int) (radius * Math.sin(Math.toRadians(45.0d)));
        center = roundedCorner.getCenter();
        int i3 = center.x;
        center2 = roundedCorner.getCenter();
        int i4 = center2.y;
        int max = z ? 0 : Math.max(0, i3 - sin);
        int max2 = z2 ? 0 : Math.max(0, i4 - sin);
        if (z) {
            i = Math.min(i, i3 + sin);
        }
        if (z2) {
            i2 = Math.min(i2, i4 + sin);
        }
        Rect rect = new Rect(max, max2, i, i2);
        if (rect.isEmpty()) {
            return null;
        }
        return rect;
    }

    private static void a(@Nullable RoundedCorner roundedCorner, boolean z, boolean z2, @NonNull Rect rect, int i, int i2, int i3, int i4, int i5, int i6, @NonNull List<Rect> list, @NonNull List<int[]> list2) {
        Rect a;
        int i7;
        int i8;
        if (roundedCorner == null || (a = a(roundedCorner, z, z2, i, i2)) == null || !Rect.intersects(rect, a)) {
            return;
        }
        list.add(a);
        if (z) {
            int i9 = rect.left;
            if (i9 < i3) {
                i7 = i3 - i9;
            }
            i7 = 0;
        } else {
            int i10 = rect.right;
            if (i10 > i5) {
                i7 = i5 - i10;
            }
            i7 = 0;
        }
        if (z2) {
            int i11 = rect.top;
            if (i11 < i4) {
                i8 = i4 - i11;
            }
            i8 = 0;
        } else {
            int i12 = rect.bottom;
            if (i12 > i6) {
                i8 = i6 - i12;
            }
            i8 = 0;
        }
        a(list2, i7, 0);
        a(list2, 0, i8);
        a(list2, i7, i8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000a, code lost:
    
        r0 = r5.getRadius();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(@Nullable RoundedCorner roundedCorner, boolean z, boolean z2, int[] iArr) {
        int radius;
        Point center;
        Point center2;
        if (roundedCorner != null && Build.VERSION.SDK_INT >= 31 && radius > 0) {
            int i = (int) (radius * this.i);
            center = roundedCorner.getCenter();
            int i2 = center.x;
            center2 = roundedCorner.getCenter();
            int i3 = center2.y;
            if (z) {
                iArr[0] = Math.max(iArr[0], i2 - i);
            } else {
                iArr[2] = Math.min(iArr[2], i2 + i);
            }
            if (z2) {
                iArr[1] = Math.max(iArr[1], i3 - i);
            } else {
                iArr[3] = Math.min(iArr[3], i3 + i);
            }
        }
    }

    private static void a(@NonNull List<int[]> list, int i, int i2) {
        for (int[] iArr : list) {
            if (iArr[0] == i && iArr[1] == i2) {
                return;
            }
        }
        list.add(new int[]{i, i2});
    }

    private static boolean a(@NonNull Rect rect, @NonNull List<Rect> list) {
        for (Rect rect2 : list) {
            if (rect2 != null && Rect.intersects(rect, rect2)) {
                return true;
            }
        }
        return false;
    }

    public final void a(int i, int i2) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (i <= 0 || i2 <= 0) {
            this.h = 0;
            this.g = 0;
            this.b = 0;
            this.a = 0;
            return;
        }
        int[] iArr = {0, 0, i, i2};
        RoundedCorner[] roundedCornerArr = {this.c, this.d, this.e, this.f};
        for (int i3 = 0; i3 < 4; i3++) {
            a(roundedCornerArr[i3], this.j[i3], this.k[i3], iArr);
        }
        this.g = iArr[0];
        this.h = iArr[1];
        this.a = iArr[2];
        this.b = iArr[3];
    }

    public final void a(@NonNull Rect rect, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        ArrayList arrayList;
        c cVar = this;
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        int i7 = cVar.a;
        if ((i7 == 0 && cVar.b == 0) || i7 > i || cVar.b > i2) {
            cVar.a(i, i2);
        }
        int i8 = cVar.g;
        int i9 = cVar.h;
        int i10 = cVar.a;
        int i11 = i10 > 0 ? i10 : i;
        int i12 = cVar.b;
        int i13 = i12 > 0 ? i12 : i2;
        int i14 = 4;
        ArrayList arrayList2 = new ArrayList(4);
        ArrayList arrayList3 = new ArrayList();
        int i15 = 0;
        arrayList3.add(new int[]{0, 0});
        RoundedCorner[] roundedCornerArr = {cVar.c, cVar.d, cVar.e, cVar.f};
        int i16 = 0;
        while (i16 < i14) {
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = arrayList2;
            int i17 = i13;
            a(roundedCornerArr[i16], cVar.j[i16], cVar.k[i16], rect, i, i2, i8, i9, i11, i17, arrayList5, arrayList4);
            i16++;
            i8 = i8;
            i15 = 0;
            roundedCornerArr = roundedCornerArr;
            arrayList3 = arrayList4;
            i14 = i14;
            arrayList2 = arrayList5;
            i13 = i17;
            i9 = i9;
            i11 = i11;
            cVar = this;
        }
        int i18 = i15;
        ArrayList<int[]> arrayList6 = arrayList3;
        ArrayList arrayList7 = arrayList2;
        int i19 = i13;
        int i20 = i11;
        int i21 = i9;
        int i22 = i8;
        if (arrayList7.isEmpty()) {
            Objects.toString(rect);
            return;
        }
        long j = Long.MAX_VALUE;
        int i23 = i18;
        int i24 = i23;
        int i25 = i24;
        for (int[] iArr : arrayList6) {
            int i26 = iArr[i18];
            int i27 = iArr[1];
            Rect rect2 = new Rect(rect);
            if (a.a(rect2, i26, i27, i, i2)) {
                arrayList = arrayList7;
                if (!a(rect2, arrayList)) {
                    long abs = Math.abs(i26) + Math.abs(i27);
                    if (i24 == 0 || abs < j) {
                        i23 = i27;
                        j = abs;
                        i24 = 1;
                        i25 = i26;
                    }
                }
            } else {
                arrayList = arrayList7;
            }
            arrayList7 = arrayList;
        }
        ArrayList<Rect> arrayList8 = arrayList7;
        if (i24 == 0) {
            int i28 = i18;
            int i29 = i28;
            for (Rect rect3 : arrayList8) {
                if (Rect.intersects(rect, rect3)) {
                    if (rect3.left == 0 && (i6 = rect.left) < i22) {
                        i29 = Math.max(i29, i22 - i6);
                    }
                    if (rect3.right == i) {
                        int i30 = rect.right;
                        i3 = i20;
                        if (i30 > i3) {
                            int i31 = i3 - i30;
                            if (i29 == 0 || Math.abs(i31) < Math.abs(i29)) {
                                i29 = i31;
                            }
                        }
                    } else {
                        i3 = i20;
                    }
                    if (rect3.top == 0) {
                        int i32 = rect.top;
                        i4 = i21;
                        if (i32 < i4) {
                            i28 = Math.max(i28, i4 - i32);
                        }
                    } else {
                        i4 = i21;
                    }
                    if (rect3.bottom == i2) {
                        int i33 = rect.bottom;
                        i5 = i19;
                        if (i33 > i5) {
                            int i34 = i5 - i33;
                            if (i28 == 0 || Math.abs(i34) < Math.abs(i28)) {
                                i28 = i34;
                            }
                        }
                    } else {
                        i5 = i19;
                    }
                    i19 = i5;
                    i20 = i3;
                    i21 = i4;
                }
            }
            int i35 = -rect.left;
            int i36 = i - rect.right;
            int i37 = -rect.top;
            i23 = i2 - rect.bottom;
            i25 = i29 < i35 ? i35 : i29 > i36 ? i36 : i29;
            if (i28 < i37) {
                i23 = i37;
            } else if (i28 <= i23) {
                i23 = i28;
            }
        }
        Objects.toString(rect);
        if (i25 == 0 && i23 == 0) {
            return;
        }
        rect.offset(i25, i23);
    }

    public final void a(@NonNull Rect rect, int i, int i2, int i3) {
        int i4;
        if (i3 != 1 && i3 != 2) {
            a(rect, i, i2);
            return;
        }
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        int i5 = this.a;
        if ((i5 == 0 && this.b == 0) || i5 > i || this.b > i2) {
            a(i, i2);
        }
        int i6 = this.g;
        int i7 = this.h;
        int i8 = this.a;
        if (i8 <= 0) {
            i8 = i;
        }
        int i9 = this.b;
        if (i9 <= 0) {
            i9 = i2;
        }
        int i10 = 0;
        if (i3 == 1) {
            int i11 = rect.left;
            if (i11 < i6) {
                i4 = 0;
                i10 = i6 - i11;
            } else {
                int i12 = rect.right;
                if (i12 > i8) {
                    i4 = 0;
                    i10 = i8 - i12;
                }
                i4 = 0;
            }
        } else {
            int i13 = rect.top;
            if (i13 < i7) {
                i4 = i7 - i13;
            } else {
                int i14 = rect.bottom;
                if (i14 > i9) {
                    i4 = i9 - i14;
                }
                i4 = 0;
            }
        }
        if (i10 == 0 && i4 == 0) {
            Objects.toString(rect);
            return;
        }
        boolean a = a.a(new Rect(rect), i10, i4, i, i2);
        Objects.toString(rect);
        if (a) {
            rect.offset(i10, i4);
        }
    }

    public final void a(@Nullable RoundedCorner roundedCorner, @Nullable RoundedCorner roundedCorner2, @Nullable RoundedCorner roundedCorner3, @Nullable RoundedCorner roundedCorner4) {
        this.c = roundedCorner;
        this.d = roundedCorner2;
        this.e = roundedCorner3;
        this.f = roundedCorner4;
    }
}
