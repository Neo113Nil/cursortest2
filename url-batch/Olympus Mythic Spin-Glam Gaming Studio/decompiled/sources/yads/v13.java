package yads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v13 implements View.OnLayoutChangeListener {
    public final wk a;
    public final uo b;
    public final w13 c;
    public final q31 d;
    public final Drawable e;

    public v13(wk wkVar, uo uoVar, w13 w13Var, q31 q31Var, Drawable drawable) {
        this.a = wkVar;
        this.b = uoVar;
        this.c = w13Var;
        this.d = q31Var;
        this.e = drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7, types: [yads.q13] */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Bitmap bitmap;
        q13 q13Var;
        ArrayList arrayList;
        q13 q13Var2;
        yk ykVar;
        String str;
        y13 y13Var;
        q13 q13Var3;
        yk ykVar2;
        q13 q13Var4;
        float width;
        int i9;
        String str2;
        String str3;
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        if (imageView == null) {
            return;
        }
        Drawable drawable = this.e;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) {
            return;
        }
        boolean z = (i3 - i == i7 - i5 && i4 - i2 == i8 - i6) ? false : true;
        boolean z2 = (i4 == i2 || i == i3) ? false : true;
        if (z && z2) {
            RectF rectF = new RectF(0.0f, 0.0f, imageView.getWidth(), imageView.getHeight());
            if (rectF.height() == 0.0f) {
                return;
            }
            wk wkVar = this.a;
            q31 q31Var = this.d;
            wkVar.getClass();
            y13 y13Var2 = q31Var.e;
            if (y13Var2 != null && (ykVar = y13Var2.e) != null) {
                String str4 = ykVar.d;
                boolean z3 = (str4 == null || (str3 = ykVar.a) == null || !Intrinsics.areEqual(str4, str3)) ? false : true;
                String str5 = ykVar.c;
                boolean z4 = (str5 == null || (str2 = ykVar.b) == null || !Intrinsics.areEqual(str5, str2)) ? false : true;
                if (z3 || z4) {
                    wk wkVar2 = this.a;
                    q31 q31Var2 = this.d;
                    wkVar2.getClass();
                    y13 y13Var3 = q31Var2.e;
                    if (y13Var3 != null && (ykVar2 = y13Var3.e) != null && (q13Var4 = y13Var3.f) != null) {
                        float width2 = rectF.width();
                        float height = rectF.height();
                        float f = q31Var2.a;
                        float f2 = q31Var2.b;
                        float f3 = q13Var4.c;
                        float f4 = q13Var4.d;
                        if (width2 != 0.0f && height != 0.0f && f != 0.0f && f2 != 0.0f && f3 != 0.0f && f4 != 0.0f) {
                            if (rectF.width() / rectF.height() > q13Var4.c / q13Var4.d) {
                                width = rectF.height();
                                i9 = q13Var4.d;
                            } else {
                                width = rectF.width();
                                i9 = q13Var4.c;
                            }
                            if (width / i9 <= 1.0f) {
                                if (width2 / height > f3 / f4) {
                                    if (Intrinsics.areEqual(ykVar2.b, ykVar2.c)) {
                                        str = ykVar2.b;
                                    }
                                } else if (Intrinsics.areEqual(ykVar2.a, ykVar2.d)) {
                                    str = ykVar2.a;
                                }
                            } else if (width2 / height > f / f2) {
                                if (Intrinsics.areEqual(ykVar2.b, ykVar2.c)) {
                                    str = ykVar2.b;
                                }
                            } else if (Intrinsics.areEqual(ykVar2.a, ykVar2.d)) {
                                str = ykVar2.a;
                            }
                            y13Var = this.d.e;
                            if (y13Var != null || (q13Var3 = y13Var.f) == null) {
                                return;
                            }
                            if (str == null) {
                                this.c.a(imageView, bitmap, q13Var3);
                                return;
                            }
                            w13 w13Var = this.c;
                            w13Var.getClass();
                            float width3 = imageView.getWidth();
                            float height2 = imageView.getHeight();
                            float width4 = bitmap.getWidth();
                            float height3 = bitmap.getHeight();
                            float f5 = q13Var3.c;
                            float f6 = q13Var3.d;
                            if (height2 == 0.0f || f6 == 0.0f || height3 == 0.0f) {
                                return;
                            }
                            float f7 = width3 / height2;
                            float f8 = f7 < f5 / f6 ? width3 / f5 : height2 / f6;
                            if (f8 > 1.0f) {
                                f8 = f7 < width4 / height3 ? width3 / width4 : height2 / height3;
                            }
                            float f9 = 2;
                            w13Var.a.setScale(f8, f8);
                            w13Var.a.postTranslate((width3 / f9) - (((r12 / 2) + q13Var3.a) * f8), (height2 / f9) - (((r14 / 2) + q13Var3.b) * f8));
                            imageView.setScaleType(ImageView.ScaleType.MATRIX);
                            imageView.setImageMatrix(w13Var.a);
                            imageView.setBackgroundColor(Color.parseColor(str));
                            if (((qg1) sg1.a(imageView.getContext(), "YadPreferenceFile")).a("preference_smart_centers_debug_enabled", false)) {
                                Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                                Canvas canvas = new Canvas(copy);
                                Rect rect = w13Var.c;
                                int i10 = q13Var3.a;
                                int i11 = q13Var3.b;
                                rect.set(i10, i11, q13Var3.c + i10, q13Var3.d + i11);
                                canvas.drawRect(rect, w13Var.b);
                                imageView.setImageBitmap(copy);
                                return;
                            }
                            return;
                        }
                    }
                    str = null;
                    y13Var = this.d.e;
                    if (y13Var != null) {
                        return;
                    } else {
                        return;
                    }
                }
            }
            uo uoVar = this.b;
            q31 q31Var3 = this.d;
            uoVar.getClass();
            RectF rectF2 = new RectF(0.0f, 0.0f, q31Var3.a, q31Var3.b);
            y13 y13Var4 = q31Var3.e;
            if (y13Var4 == null || (arrayList = y13Var4.g) == null) {
                q13Var = null;
            } else {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    ?? next = it.next();
                    loop0: while (true) {
                        q13Var2 = next;
                        while (it.hasNext()) {
                            next = (q13) it.next();
                            q13Var2 = q13Var2;
                            float a = u13.a(q13Var2, rectF, rectF2);
                            float a2 = u13.a(next, rectF, rectF2);
                            if (a != Float.MAX_VALUE) {
                                if (a == a2) {
                                    if (q13Var2.e > next.e) {
                                    }
                                } else if (a > a2) {
                                    break;
                                }
                            }
                        }
                        break loop0;
                    }
                } else {
                    q13Var2 = null;
                }
                q13Var = q13Var2;
            }
            if (q13Var != null) {
                this.c.a(imageView, bitmap, q13Var);
            }
        }
    }
}
