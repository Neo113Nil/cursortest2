package yads;

import android.content.Context;
import kotlin.Unit;

/* loaded from: classes12.dex */
public final class vw2 {
    public static final Object k = new Object();
    public static volatile vw2 l;
    public volatile bu2 a;
    public Boolean b;
    public Boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g = true;
    public boolean h = true;
    public ua i;
    public Integer j;

    public final ua a() {
        ua uaVar;
        synchronized (k) {
            uaVar = this.i;
        }
        return uaVar;
    }

    public final boolean b() {
        boolean z;
        synchronized (k) {
            z = this.d;
        }
        return z;
    }

    public final Boolean c() {
        Boolean bool;
        synchronized (k) {
            bool = this.c;
        }
        return bool;
    }

    public final boolean d() {
        boolean z;
        synchronized (k) {
            z = this.f;
        }
        return z;
    }

    public final Boolean e() {
        Boolean bool;
        synchronized (k) {
            bool = this.b;
        }
        return bool;
    }

    public final bu2 a(Context context) {
        bu2 bu2Var;
        bu2 bu2Var2 = this.a;
        if (bu2Var2 != null) {
            return bu2Var2;
        }
        synchronized (k) {
            bu2 bu2Var3 = this.a;
            if (bu2Var3 == null) {
                bu2Var = vy.a(context).a();
                this.a = bu2Var;
            } else {
                bu2Var = bu2Var3;
            }
        }
        return bu2Var;
    }

    public final void a(Context context, bu2 bu2Var) {
        synchronized (k) {
            this.a = bu2Var;
            vy.a(context).a(bu2Var);
            Unit unit = Unit.INSTANCE;
        }
    }
}
