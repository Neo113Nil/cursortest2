package yads;

import android.content.Context;
import android.location.Location;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes6.dex */
public final class zg1 {
    public static final Object f = new Object();
    public static volatile zg1 g;
    public final ch1 a;
    public final bh1 b;
    public final vw2 c;
    public final fy2 d;
    public final Context e;

    public zg1(Context context) {
        vw2 vw2Var;
        ch1 ch1Var = new ch1();
        bh1 bh1Var = new bh1();
        vw2 vw2Var2 = vw2.l;
        if (vw2Var2 == null) {
            synchronized (vw2.k) {
                vw2Var = vw2.l;
                if (vw2Var == null) {
                    vw2Var = new vw2();
                    vw2.l = vw2Var;
                }
            }
            vw2Var2 = vw2Var;
        }
        fy2 fy2Var = new fy2();
        this.a = ch1Var;
        this.b = bh1Var;
        this.c = vw2Var2;
        this.d = fy2Var;
        this.e = pz.a(context);
    }

    public final Location a() {
        Location location;
        synchronized (f) {
            try {
                if (this.c.b()) {
                    fy2 fy2Var = this.d;
                    Context context = this.e;
                    fy2Var.getClass();
                    if (!fy2.a(context)) {
                        bh1 bh1Var = this.b;
                        Context context2 = this.e;
                        bh1Var.getClass();
                        ArrayList a = bh1.a(context2);
                        List createListBuilder = CollectionsKt.createListBuilder();
                        Iterator it = a.iterator();
                        while (it.hasNext()) {
                            Location a2 = ((ah1) it.next()).a();
                            if (a2 != null) {
                                createListBuilder.add(a2);
                            }
                        }
                        location = this.a.a(CollectionsKt.build(createListBuilder));
                    }
                }
                location = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return location;
    }
}
