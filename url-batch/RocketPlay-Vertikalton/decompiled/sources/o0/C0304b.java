package o0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0304b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3638a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0304b(Class cls, String str, int i) {
        super(cls, str);
        this.f3638a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f3638a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(w.f3701a.q((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f3638a) {
            case 0:
                C0307e c0307e = (C0307e) obj;
                PointF pointF = (PointF) obj2;
                c0307e.getClass();
                c0307e.f3641a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0307e.f3642b = round;
                int i = c0307e.f3645f + 1;
                c0307e.f3645f = i;
                if (i == c0307e.f3646g) {
                    w.a(c0307e.f3644e, c0307e.f3641a, round, c0307e.f3643c, c0307e.d);
                    c0307e.f3645f = 0;
                    c0307e.f3646g = 0;
                    break;
                }
                break;
            case 1:
                C0307e c0307e2 = (C0307e) obj;
                PointF pointF2 = (PointF) obj2;
                c0307e2.getClass();
                c0307e2.f3643c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0307e2.d = round2;
                int i2 = c0307e2.f3646g + 1;
                c0307e2.f3646g = i2;
                if (c0307e2.f3645f == i2) {
                    w.a(c0307e2.f3644e, c0307e2.f3641a, c0307e2.f3642b, c0307e2.f3643c, round2);
                    c0307e2.f3645f = 0;
                    c0307e2.f3646g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                w.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                w.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                w.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                w.f3701a.x((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
