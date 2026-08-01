package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
@o90("activity")
/* loaded from: classes.dex */
public class p1 extends p90 {
    public final Activity c;

    public p1(Context context) {
        Object obj;
        context.getClass();
        Iterator it = kq0.z(context, o1.f).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.c = (Activity) obj;
    }

    @Override // defpackage.p90
    public final m80 a() {
        return new n1(this);
    }

    @Override // defpackage.p90
    public final m80 c(m80 m80Var) {
        throw new IllegalStateException(("Destination " + ((n1) m80Var).i + " does not have an Intent set.").toString());
    }

    @Override // defpackage.p90
    public final boolean f() {
        Activity activity = this.c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
