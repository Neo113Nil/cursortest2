package com.onevcat.uniwebview.internal.obfuscated;

import android.app.Activity;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0063p0 extends FrameLayout {
    public final C0031h0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0063p0(Activity context, C0031h0 inspector) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inspector, "inspector");
        this.a = inspector;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C0031h0 c0031h0 = this.a;
        c0031h0.getClass();
        if ((motionEvent != null && c0031h0.a(motionEvent.getRawX(), motionEvent.getRawY())) ? c0031h0.l : false) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x021f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        C0031h0 c0031h0 = this.a;
        c0031h0.getClass();
        if (motionEvent != null) {
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (!c0031h0.a(rawX, rawY)) {
                z = true;
            } else if (!c0031h0.l) {
                C0058o c0058o = C0058o.b;
                String message = "Transparency click check ignored for " + c0031h0.b + " because feature is disabled";
                c0058o.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                c0058o.a(EnumC0054n.DEBUG, message);
            } else if (c0031h0.y.getHeight() <= 0 || c0031h0.y.getWidth() <= 0) {
                C0058o c0058o2 = C0058o.b;
                String message2 = "Transparency click check ignored for " + c0031h0.b + " because layout size is zero";
                c0058o2.getClass();
                Intrinsics.checkNotNullParameter(message2, "message");
                c0058o2.a(EnumC0054n.DEBUG, message2);
            } else {
                float f = rawX - AbstractC0030h.a(c0031h0.y).x;
                float f2 = rawY - AbstractC0030h.a(c0031h0.y).y;
                C0015d0 c0015d0 = c0031h0.s;
                if (c0015d0 == null) {
                    C0058o c0058o3 = C0058o.b;
                    String message3 = "Transparency click check for " + c0031h0.b + " has no mask yet";
                    c0058o3.getClass();
                    Intrinsics.checkNotNullParameter(message3, "message");
                    c0058o3.a(EnumC0054n.DEBUG, message3);
                } else {
                    float f3 = c0015d0.b;
                    if (f3 <= 0.0f) {
                        float scale = c0031h0.v.getScale();
                        Float valueOf = Float.valueOf(scale);
                        if (scale <= 0.0f) {
                            valueOf = null;
                        }
                        f3 = valueOf != null ? valueOf.floatValue() : c0031h0.v.getResources().getDisplayMetrics().density;
                    }
                    float x = (f - c0031h0.v.getX()) / f3;
                    float y = (f2 - c0031h0.v.getY()) / f3;
                    float width = c0031h0.v.getWidth() / f3;
                    float height = c0031h0.v.getHeight() / f3;
                    if (x < 0.0f || x > width || y < 0.0f || y > height) {
                        C0058o c0058o4 = C0058o.b;
                        StringBuilder append = new StringBuilder("Transparency click check for ").append(c0031h0.b).append(" outside web bounds raw=");
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        Locale locale = Locale.US;
                        String format = String.format(locale, "(%.2f, %.2f)", Arrays.copyOf(new Object[]{Float.valueOf(rawX), Float.valueOf(rawY)}, 2));
                        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
                        StringBuilder append2 = append.append(format).append(" css=");
                        String format2 = String.format(locale, "(%.2f, %.2f)", Arrays.copyOf(new Object[]{Float.valueOf(x), Float.valueOf(y)}, 2));
                        Intrinsics.checkNotNullExpressionValue(format2, "format(locale, format, *args)");
                        String message4 = append2.append(format2).toString();
                        c0058o4.getClass();
                        Intrinsics.checkNotNullParameter(message4, "message");
                        c0058o4.a(EnumC0054n.DEBUG, message4);
                    } else {
                        List list = c0015d0.a;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (((RectF) it.next()).contains(x, y)) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        z2 = false;
                        boolean z3 = !z2;
                        C0058o c0058o5 = C0058o.b;
                        StringBuilder append3 = new StringBuilder("Transparency click check for ").append(c0031h0.b).append(" raw=");
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        Locale locale2 = Locale.US;
                        String format3 = String.format(locale2, "(%.2f, %.2f)", Arrays.copyOf(new Object[]{Float.valueOf(rawX), Float.valueOf(rawY)}, 2));
                        Intrinsics.checkNotNullExpressionValue(format3, "format(locale, format, *args)");
                        StringBuilder append4 = append3.append(format3).append(" css=");
                        String format4 = String.format(locale2, "(%.2f, %.2f)", Arrays.copyOf(new Object[]{Float.valueOf(x), Float.valueOf(y)}, 2));
                        Intrinsics.checkNotNullExpressionValue(format4, "format(locale, format, *args)");
                        String message5 = append4.append(format4).append(" passThrough=").append(z3).toString();
                        c0058o5.getClass();
                        Intrinsics.checkNotNullParameter(message5, "message");
                        c0058o5.a(EnumC0054n.DEBUG, message5);
                        z = z3;
                    }
                }
            }
            if (!z) {
                return super.onTouchEvent(motionEvent);
            }
            if (motionEvent == null) {
                return super.onTouchEvent(motionEvent);
            }
            E2 e2 = this.a.y;
            MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getActionMasked(), motionEvent.getX() - e2.getX(), motionEvent.getY() - e2.getY(), motionEvent.getMetaState());
            boolean dispatchTouchEvent = this.a.y.dispatchTouchEvent(obtain);
            obtain.recycle();
            return dispatchTouchEvent;
        }
        z = false;
        if (!z) {
        }
    }
}
