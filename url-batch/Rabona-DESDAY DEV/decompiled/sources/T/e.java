package T;

import K.C0012l;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f717e;

    public e(f fVar) {
        this.f717e = fVar;
    }

    @Override // q1.d
    public final void c0(Throwable th) {
        this.f717e.f718a.d(th);
    }

    @Override // q1.d
    public final void f0(u uVar) {
        f fVar = this.f717e;
        fVar.f720c = uVar;
        u uVar2 = fVar.f720c;
        j jVar = fVar.f718a;
        fVar.f719b = new C0012l(uVar2, jVar.f731g, jVar.i, Build.VERSION.SDK_INT >= 34 ? o.a() : q1.l.w());
        j jVar2 = fVar.f718a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f726a.writeLock().lock();
        try {
            jVar2.f728c = 1;
            arrayList.addAll(jVar2.f727b);
            jVar2.f727b.clear();
            jVar2.f726a.writeLock().unlock();
            jVar2.d.post(new H.b(arrayList, jVar2.f728c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f726a.writeLock().unlock();
            throw th;
        }
    }
}
