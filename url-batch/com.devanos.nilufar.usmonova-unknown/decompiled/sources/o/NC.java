package o;

import android.util.Log;

/* loaded from: classes.dex */
public final class NC {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ NC(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public final void a(String str, String str2, Object obj) {
        switch (this.a) {
            case 0:
                ((C1511mf) this.b).a(((PC) ((C0950e6) ((C0208Hx) this.c).j).k).f(str, str2, obj));
                break;
            default:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                ((C1511mf) this.b).a(null);
                break;
        }
    }

    public final void d(Object obj) {
        switch (this.a) {
            case 0:
                ((C1511mf) this.b).a(((PC) ((C0950e6) ((C0208Hx) this.c).j).k).b(obj));
                break;
            default:
                ((Q4) this.c).f = (byte[]) this.b;
                break;
        }
    }

    private final void c() {
    }
}
