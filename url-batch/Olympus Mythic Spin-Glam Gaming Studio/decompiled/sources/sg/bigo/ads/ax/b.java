package sg.bigo.ads.ax;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.common.utils.v;

/* loaded from: classes8.dex */
public final class b {

    @NonNull
    private final Activity c;

    @Nullable
    private DisplayCutout g;
    private final List<View> d = new ArrayList();
    private final Map<View, Integer> e = new IdentityHashMap();
    private final Map<View, Rect> f = new IdentityHashMap();

    @NonNull
    private final c h = new c();
    int a = 0;
    int b = 0;
    private final Rect i = new Rect(0, 0, 0, 0);

    interface a {
        void a(@NonNull Rect rect);
    }

    public b(@NonNull Activity activity) {
        this.c = activity;
    }

    private static int a(int i) {
        if (i == 0 || i == 1 || i == 2) {
            return i;
        }
        return 0;
    }

    private int a(@NonNull View view) {
        Integer num = this.e.get(view);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @UiThread
    private void a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 && !this.d.isEmpty()) {
            View decorView = this.c.getWindow() != null ? this.c.getWindow().getDecorView() : null;
            int width = decorView != null ? decorView.getWidth() : 0;
            int height = decorView != null ? decorView.getHeight() : 0;
            if (i >= 31) {
                c cVar = this.h;
                if (cVar.a == 0 && cVar.b == 0 && width > 0 && height > 0) {
                    cVar.a(width, height);
                }
            }
            for (View view : this.d) {
                if (view != null) {
                    Rect a2 = v.a(view, 0);
                    if (!this.i.equals(a2)) {
                        Rect rect = new Rect(a2);
                        int a3 = a(view);
                        if (a3 == 0) {
                            a(view, a2, rect, width, height);
                        } else {
                            a(view, a3, a2, rect, width, height);
                        }
                    }
                }
            }
        }
    }

    private void a(@NonNull View view, int i, int i2) {
        b(view);
        Rect rect = this.f.get(view);
        if (rect == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i3 = rect.left;
            int i4 = rect.right;
            int i5 = rect.top;
            int i6 = rect.bottom;
            if (i != 0) {
                if (i > 0) {
                    i3 += i;
                } else {
                    i4 -= i;
                }
            }
            if (i2 != 0) {
                if (i2 > 0) {
                    i5 += i2;
                } else {
                    i6 -= i2;
                }
            }
            if (marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5 && marginLayoutParams.bottomMargin == i6) {
                return;
            }
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            marginLayoutParams.topMargin = i5;
            marginLayoutParams.bottomMargin = i6;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    private void a(@NonNull View view, final int i, @NonNull Rect rect, @NonNull final Rect rect2, int i2, int i3) {
        a(new a() { // from class: sg.bigo.ads.ax.b.2
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
            
                if (r5 < Integer.MAX_VALUE) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
            
                if (java.lang.Math.abs(r13) < r5) goto L44;
             */
            @Override // sg.bigo.ads.ax.b.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void a(@NonNull Rect rect3) {
                int i4;
                int i5;
                int i6;
                Rect rect4 = rect2;
                b bVar = b.this;
                int i7 = bVar.a;
                int i8 = bVar.b;
                int i9 = i;
                if (Rect.intersects(rect3, rect4)) {
                    int i10 = rect3.left;
                    int i11 = rect4.right;
                    int i12 = i10 - i11;
                    int i13 = rect3.right - rect4.left;
                    int i14 = rect3.top;
                    int i15 = rect4.bottom;
                    int i16 = i14 - i15;
                    int i17 = rect3.bottom - rect4.top;
                    int i18 = 0;
                    if (i9 == 1) {
                        if (i11 <= i10 || !sg.bigo.ads.ax.a.a(new Rect(rect4), i12, 0, i7, i8) || (i6 = Math.abs(i12)) >= Integer.MAX_VALUE) {
                            i12 = 0;
                            i6 = Integer.MAX_VALUE;
                        }
                        if (rect4.left >= rect3.right || !sg.bigo.ads.ax.a.a(new Rect(rect4), i13, 0, i7, i8) || Math.abs(i13) >= i6) {
                            i13 = i12;
                        }
                        i17 = 0;
                        i18 = i13;
                    } else {
                        if (i9 != 2) {
                            sg.bigo.ads.ax.a.a(rect3, rect4, i7, i8);
                            return;
                        }
                        if (i15 > i14) {
                            Rect rect5 = new Rect(rect4);
                            if (sg.bigo.ads.ax.a.a(rect5, 0, i16, i7, i8) && !Rect.intersects(rect5, rect3)) {
                                i5 = Math.abs(i16);
                                i4 = Integer.MAX_VALUE;
                            }
                        }
                        i4 = Integer.MAX_VALUE;
                        i5 = i4;
                        i16 = 0;
                        if (rect4.top < rect3.bottom) {
                            Rect rect6 = new Rect(rect4);
                            if (sg.bigo.ads.ax.a.a(rect6, 0, i17, i7, i8)) {
                                if (!Rect.intersects(rect6, rect3)) {
                                }
                            }
                        }
                        i17 = i16;
                    }
                    rect4.toString();
                    rect3.toString();
                    rect4.offset(i18, i17);
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 31 && i2 > 0 && i3 > 0) {
            this.h.a(rect2, i2, i3, i);
        }
        if (rect2.equals(rect)) {
            rect2.toString();
            return;
        }
        int i4 = rect2.left - rect.left;
        int i5 = rect2.top - rect.top;
        rect.toString();
        rect2.toString();
        a(view, i4, i5);
    }

    private void a(@NonNull View view, @NonNull Rect rect, @NonNull final Rect rect2, int i, int i2) {
        a(new a() { // from class: sg.bigo.ads.ax.b.1
            @Override // sg.bigo.ads.ax.b.a
            public final void a(@NonNull Rect rect3) {
                Rect rect4 = rect2;
                b bVar = b.this;
                sg.bigo.ads.ax.a.a(rect3, rect4, bVar.a, bVar.b);
            }
        });
        if (Build.VERSION.SDK_INT >= 31 && i > 0 && i2 > 0) {
            this.h.a(rect2, i, i2);
        }
        if (rect2.equals(rect)) {
            rect2.toString();
            return;
        }
        float f = rect2.left - rect.left;
        float f2 = rect2.top - rect.top;
        rect.toString();
        rect2.toString();
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    private void a(@NonNull a aVar) {
        List<Rect> boundingRects;
        DisplayCutout displayCutout = this.g;
        if (displayCutout != null && Build.VERSION.SDK_INT >= 28) {
            boundingRects = displayCutout.getBoundingRects();
            if (boundingRects.isEmpty()) {
                return;
            }
            for (Rect rect : boundingRects) {
                if (rect != null) {
                    aVar.a(rect);
                }
            }
        }
    }

    private void b(@NonNull View view) {
        if (this.f.containsKey(view)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            this.f.put(view, new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin));
        }
    }

    @UiThread
    public final void a(View view, int i) {
        if (Build.VERSION.SDK_INT >= 28 && view != null) {
            int a2 = a(i);
            this.d.add(view);
            this.e.put(view, Integer.valueOf(a2));
            b(view);
            a();
        }
    }

    @UiThread
    public final void a(@Nullable WindowInsets windowInsets) {
        DisplayCutout displayCutout;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        RoundedCorner roundedCorner3;
        RoundedCorner roundedCorner4;
        int i = Build.VERSION.SDK_INT;
        if (i < 28 || windowInsets == null) {
            return;
        }
        displayCutout = windowInsets.getDisplayCutout();
        this.g = displayCutout;
        View decorView = this.c.getWindow() != null ? this.c.getWindow().getDecorView() : null;
        this.a = decorView != null ? decorView.getWidth() : 0;
        this.b = decorView != null ? decorView.getHeight() : 0;
        if (i >= 31) {
            c cVar = this.h;
            roundedCorner = windowInsets.getRoundedCorner(0);
            roundedCorner2 = windowInsets.getRoundedCorner(1);
            roundedCorner3 = windowInsets.getRoundedCorner(3);
            roundedCorner4 = windowInsets.getRoundedCorner(2);
            cVar.a(roundedCorner, roundedCorner2, roundedCorner3, roundedCorner4);
            this.h.a(this.a, this.b);
        }
        a();
    }
}
