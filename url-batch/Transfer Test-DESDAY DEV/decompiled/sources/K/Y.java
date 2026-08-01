package K;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class Y extends Z0.g implements f1.p, g1.e {

    /* renamed from: b, reason: collision with root package name */
    public final int f379b;

    /* renamed from: c, reason: collision with root package name */
    public int f380c;
    public /* synthetic */ Object d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f381e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(View view, X0.d dVar) {
        super(dVar);
        this.f381e = view;
        this.f379b = 2;
    }

    @Override // Z0.a
    public final X0.d a(Object obj, X0.d dVar) {
        Y y2 = new Y(this.f381e, dVar);
        y2.d = obj;
        return y2;
    }

    @Override // f1.p
    public final Object d(Object obj, Object obj2) {
        return ((Y) a((m1.e) obj, (X0.d) obj2)).i(U0.i.f870a);
    }

    @Override // g1.e
    public final int f() {
        return this.f379b;
    }

    @Override // Z0.a
    public final Object i(Object obj) {
        Object obj2;
        Object obj3 = Y0.a.f1162a;
        int i = this.f380c;
        View view = this.f381e;
        if (i == 0) {
            T.e.W(obj);
            m1.e eVar = (m1.e) this.d;
            this.d = eVar;
            this.f380c = 1;
            eVar.f3135b = view;
            eVar.f3134a = 3;
            eVar.d = this;
            return obj3;
        }
        Object obj4 = U0.i.f870a;
        if (i == 1) {
            m1.e eVar2 = (m1.e) this.d;
            T.e.W(obj);
            if (view instanceof ViewGroup) {
                this.d = null;
                this.f380c = 2;
                eVar2.getClass();
                C0024x c0024x = new C0024x(new X((ViewGroup) view));
                if (c0024x.f460b.hasNext()) {
                    eVar2.f3136c = c0024x;
                    eVar2.f3134a = 2;
                    eVar2.d = this;
                    obj2 = obj3;
                } else {
                    obj2 = obj4;
                }
                if (obj2 != obj3) {
                    obj2 = obj4;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            T.e.W(obj);
        }
        return obj4;
    }

    @Override // Z0.a
    public final String toString() {
        if (this.f1174a != null) {
            return super.toString();
        }
        g1.j.f2584a.getClass();
        String a2 = g1.k.a(this);
        g1.f.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
