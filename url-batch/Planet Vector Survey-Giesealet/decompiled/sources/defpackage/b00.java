package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public class b00 extends g00 {
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b00(zz zzVar) {
        super(true);
        boolean z = true;
        M(zzVar);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g00.e;
        id idVar = (id) atomicReferenceFieldUpdater.get(this);
        jd jdVar = idVar instanceof jd ? (jd) idVar : null;
        if (jdVar != null) {
            g00 j = jdVar.j();
            while (!j.H()) {
                id idVar2 = (id) atomicReferenceFieldUpdater.get(j);
                jd jdVar2 = idVar2 instanceof jd ? (jd) idVar2 : null;
                if (jdVar2 != null) {
                    j = jdVar2.j();
                }
            }
            this.f = z;
        }
        z = false;
        this.f = z;
    }

    @Override // defpackage.g00
    public final boolean H() {
        return this.f;
    }

    @Override // defpackage.g00
    public final boolean I() {
        return true;
    }
}
