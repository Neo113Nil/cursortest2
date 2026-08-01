package U;

import K.C0014m;
import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class e extends T.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f812a;

    public e(f fVar) {
        this.f812a = fVar;
    }

    @Override // T.e
    public final void G(Throwable th) {
        this.f812a.f813a.d(th);
    }

    @Override // T.e
    public final void J(v vVar) {
        f fVar = this.f812a;
        fVar.f815c = vVar;
        v vVar2 = fVar.f815c;
        j jVar = fVar.f813a;
        O0.e eVar = jVar.f826g;
        d dVar = jVar.i;
        Set<int[]> a2 = Build.VERSION.SDK_INT >= 34 ? o.a() : T.e.x();
        C0014m c0014m = new C0014m();
        c0014m.f424a = eVar;
        c0014m.f425b = vVar2;
        c0014m.f426c = dVar;
        if (!a2.isEmpty()) {
            for (int[] iArr : a2) {
                String str = new String(iArr, 0, iArr.length);
                c0014m.j(str, 0, str.length(), 1, true, new q(str, 0));
            }
        }
        fVar.f814b = c0014m;
        j jVar2 = fVar.f813a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f821a.writeLock().lock();
        try {
            jVar2.f823c = 1;
            arrayList.addAll(jVar2.f822b);
            jVar2.f822b.clear();
            jVar2.f821a.writeLock().unlock();
            jVar2.d.post(new H.b(arrayList, jVar2.f823c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f821a.writeLock().unlock();
            throw th;
        }
    }
}
