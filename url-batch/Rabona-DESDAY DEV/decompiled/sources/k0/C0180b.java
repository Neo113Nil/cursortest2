package k0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2778a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0180b(Class cls, String str, int i) {
        super(cls, str);
        this.f2778a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f2778a) {
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
                return Float.valueOf(AbstractC0201w.f2841a.j((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f2778a) {
            case 0:
                C0183e c0183e = (C0183e) obj;
                PointF pointF = (PointF) obj2;
                c0183e.getClass();
                c0183e.f2781a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0183e.f2782b = round;
                int i = c0183e.f2785f + 1;
                c0183e.f2785f = i;
                if (i == c0183e.f2786g) {
                    AbstractC0201w.a(c0183e.f2784e, c0183e.f2781a, round, c0183e.f2783c, c0183e.d);
                    c0183e.f2785f = 0;
                    c0183e.f2786g = 0;
                    break;
                }
                break;
            case 1:
                C0183e c0183e2 = (C0183e) obj;
                PointF pointF2 = (PointF) obj2;
                c0183e2.getClass();
                c0183e2.f2783c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0183e2.d = round2;
                int i2 = c0183e2.f2786g + 1;
                c0183e2.f2786g = i2;
                if (c0183e2.f2785f == i2) {
                    AbstractC0201w.a(c0183e2.f2784e, c0183e2.f2781a, c0183e2.f2782b, c0183e2.f2783c, round2);
                    c0183e2.f2785f = 0;
                    c0183e2.f2786g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC0201w.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC0201w.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                AbstractC0201w.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                AbstractC0201w.f2841a.r((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
