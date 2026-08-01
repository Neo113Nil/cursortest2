package K1;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final q f773a = new q(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f774b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f775c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f774b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f775c = atomicReferenceArr;
    }

    public static final void a(q qVar) {
        i1.f.e(qVar, "segment");
        if (qVar.f771f != null || qVar.f772g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (qVar.d) {
            return;
        }
        AtomicReference atomicReference = f775c[(int) (Thread.currentThread().getId() & (f774b - 1))];
        q qVar2 = f773a;
        q qVar3 = (q) atomicReference.getAndSet(qVar2);
        if (qVar3 == qVar2) {
            return;
        }
        int i = qVar3 != null ? qVar3.f769c : 0;
        if (i >= 65536) {
            atomicReference.set(qVar3);
            return;
        }
        qVar.f771f = qVar3;
        qVar.f768b = 0;
        qVar.f769c = i + 8192;
        atomicReference.set(qVar);
    }

    public static final q b() {
        AtomicReference atomicReference = f775c[(int) (Thread.currentThread().getId() & (f774b - 1))];
        q qVar = f773a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set(null);
            return new q();
        }
        atomicReference.set(qVar2.f771f);
        qVar2.f771f = null;
        qVar2.f769c = 0;
        return qVar2;
    }
}
