package T;

import K.C0012l;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends q1.d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f711e;

    public e(f fVar) {
        this.f711e = fVar;
    }

    @Override // q1.d
    public final void b0(Throwable th) {
        this.f711e.f712a.d(th);
    }

    @Override // q1.d
    public final void e0(u uVar) {
        f fVar = this.f711e;
        fVar.f714c = uVar;
        u uVar2 = fVar.f714c;
        j jVar = fVar.f712a;
        fVar.f713b = new C0012l(uVar2, jVar.f725g, jVar.i, Build.VERSION.SDK_INT >= 34 ? o.a() : q1.l.w());
        j jVar2 = fVar.f712a;
        jVar2.getClass();
        ArrayList arrayList = new ArrayList();
        jVar2.f720a.writeLock().lock();
        try {
            jVar2.f722c = 1;
            arrayList.addAll(jVar2.f721b);
            jVar2.f721b.clear();
            jVar2.f720a.writeLock().unlock();
            jVar2.d.post(new H.b(arrayList, jVar2.f722c, (Throwable) null));
        } catch (Throwable th) {
            jVar2.f720a.writeLock().unlock();
            throw th;
        }
    }
}
