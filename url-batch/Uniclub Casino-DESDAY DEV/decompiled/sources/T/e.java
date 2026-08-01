package T;

import K.C0011l;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends q1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f715a;

    public e(f fVar) {
        this.f715a = fVar;
    }

    @Override // q1.l
    public final void b0(Throwable th) {
        this.f715a.f716a.d(th);
    }

    @Override // q1.l
    public final void g0(u uVar) {
        f fVar = this.f715a;
        fVar.f718c = uVar;
        u uVar2 = fVar.f718c;
        j jVar = fVar.f716a;
        fVar.f717b = new C0011l(uVar2, jVar.f729g, jVar.i, Build.VERSION.SDK_INT >= 34 ? o.a() : q1.d.w());
        j jVar2 = fVar.f716a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f724a.writeLock().lock();
        try {
            jVar2.f726c = 1;
            arrayList.addAll(jVar2.f725b);
            jVar2.f725b.clear();
            jVar2.f724a.writeLock().unlock();
            jVar2.d.post(new H.b(arrayList, jVar2.f726c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f724a.writeLock().unlock();
            throw th;
        }
    }
}
