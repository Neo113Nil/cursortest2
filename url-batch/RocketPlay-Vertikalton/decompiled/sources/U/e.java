package U;

import K.C0019l;
import android.os.Build;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class e extends F1.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f1170e;

    public e(f fVar) {
        this.f1170e = fVar;
    }

    @Override // F1.l
    public final void W(Throwable th) {
        this.f1170e.f1171a.d(th);
    }

    @Override // F1.l
    public final void X(v vVar) {
        f fVar = this.f1170e;
        fVar.f1173c = vVar;
        v vVar2 = fVar.f1173c;
        j jVar = fVar.f1171a;
        M0.e eVar = jVar.f1184g;
        d dVar = jVar.i;
        Set<int[]> a2 = Build.VERSION.SDK_INT >= 34 ? o.a() : F1.d.F();
        C0019l c0019l = new C0019l();
        c0019l.f683a = eVar;
        c0019l.f684b = vVar2;
        c0019l.f685c = dVar;
        if (!a2.isEmpty()) {
            for (int[] iArr : a2) {
                String str = new String(iArr, 0, iArr.length);
                c0019l.j(str, 0, str.length(), 1, true, new q(str, 0));
            }
        }
        fVar.f1172b = c0019l;
        j jVar2 = fVar.f1171a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f1179a.writeLock().lock();
        try {
            jVar2.f1181c = 1;
            arrayList.addAll(jVar2.f1180b);
            jVar2.f1180b.clear();
            jVar2.f1179a.writeLock().unlock();
            jVar2.d.post(new H.b(arrayList, jVar2.f1181c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f1179a.writeLock().unlock();
            throw th;
        }
    }
}
