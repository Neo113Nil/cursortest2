package defpackage;

import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements mu {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h(u70 u70Var, t70 t70Var) {
        this.d = 3;
        this.e = u70Var;
    }

    private final Object d(Object obj) {
        wi0 wi0Var = (wi0) this.e;
        Throwable th = (Throwable) obj;
        CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
        cancellationException.initCause(th);
        synchronized (wi0Var.b) {
            try {
                zz zzVar = wi0Var.c;
                if (zzVar != null) {
                    et0 et0Var = wi0Var.t;
                    si0 si0Var = si0.e;
                    et0Var.getClass();
                    et0Var.k(null, si0Var);
                    zzVar.a(cancellationException);
                    wi0Var.q = null;
                    zzVar.q(new aw(4, wi0Var, th));
                } else {
                    wi0Var.d = cancellationException;
                    et0 et0Var2 = wi0Var.t;
                    si0 si0Var2 = si0.d;
                    et0Var2.getClass();
                    et0Var2.k(null, si0Var2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ky0.a;
    }

    private final Object e(Object obj) {
        or0 or0Var = (or0) ((mu) this.e).c((sr0) obj);
        synchronized (ur0.c) {
            ur0.d = ur0.d.e(or0Var.g());
        }
        return or0Var;
    }

    @Override // defpackage.mu
    public final Object c(Object obj) {
        switch (this.d) {
            case 0:
                return obj == ((i) this.e) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                hf0 hf0Var = (hf0) this.e;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == hf0Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != hf0Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 2:
                ay0 ay0Var = (ay0) obj;
                return ((dt) this.e).a(new ay0(null, ay0Var.b, ay0Var.c, ay0Var.d, ay0Var.e)).d;
            case 3:
                ((u70) this.e).d(null);
                return ky0.a;
            case 4:
                ((bi) this.e).u(obj);
                return ky0.a;
            case 5:
                return d(obj);
            case 6:
                xm0 xm0Var = ((wm0) this.e).c;
                return Boolean.valueOf(xm0Var != null ? xm0Var.b(obj) : true);
            case 7:
                return e(obj);
            case 8:
                b70 b70Var = (b70) this.e;
                if (obj instanceof it0) {
                    ((it0) obj).f(4);
                }
                b70Var.a(obj);
                return ky0.a;
            default:
                is0 is0Var = (is0) this.e;
                synchronized (is0Var.g) {
                    hs0 hs0Var = is0Var.i;
                    hs0Var.getClass();
                    Object obj2 = hs0Var.b;
                    obj2.getClass();
                    int i = hs0Var.d;
                    w60 w60Var = hs0Var.c;
                    if (w60Var == null) {
                        w60Var = new w60();
                        hs0Var.c = w60Var;
                        hs0Var.f.m(obj2, w60Var);
                    }
                    hs0Var.c(obj, i, obj2, w60Var);
                }
                return ky0.a;
        }
    }

    public /* synthetic */ h(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }
}
