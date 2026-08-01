package K;

import a1.EnumC0064a;
import android.view.View;
import android.view.ViewGroup;
import b1.AbstractC0098g;

/* loaded from: classes.dex */
public final class Y extends AbstractC0098g implements h1.p, i1.e {

    /* renamed from: a, reason: collision with root package name */
    public final int f641a;

    /* renamed from: b, reason: collision with root package name */
    public int f642b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f643c;
    public final /* synthetic */ View d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(View view, Z0.d dVar) {
        super(dVar);
        this.d = view;
        this.f641a = 2;
    }

    @Override // b1.AbstractC0092a
    public final Z0.d create(Object obj, Z0.d dVar) {
        Y y2 = new Y(this.d, dVar);
        y2.f643c = obj;
        return y2;
    }

    @Override // h1.p
    public final Object d(Object obj, Object obj2) {
        return ((Y) create((o1.e) obj, (Z0.d) obj2)).invokeSuspend(V0.i.f1250a);
    }

    @Override // i1.e
    public final int f() {
        return this.f641a;
    }

    @Override // b1.AbstractC0092a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = EnumC0064a.f1630a;
        int i = this.f642b;
        View view = this.d;
        if (i == 0) {
            F1.l.n0(obj);
            o1.e eVar = (o1.e) this.f643c;
            this.f643c = eVar;
            this.f642b = 1;
            eVar.f3710b = view;
            eVar.f3709a = 3;
            eVar.d = this;
            return obj3;
        }
        Object obj4 = V0.i.f1250a;
        if (i == 1) {
            o1.e eVar2 = (o1.e) this.f643c;
            F1.l.n0(obj);
            if (view instanceof ViewGroup) {
                this.f643c = null;
                this.f642b = 2;
                eVar2.getClass();
                C0030x c0030x = new C0030x(new X(0, (ViewGroup) view));
                if (c0030x.f723b.hasNext()) {
                    eVar2.f3711c = c0030x;
                    eVar2.f3709a = 2;
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
            F1.l.n0(obj);
        }
        return obj4;
    }

    @Override // b1.AbstractC0092a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        i1.j.f3052a.getClass();
        String a2 = i1.k.a(this);
        i1.f.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
