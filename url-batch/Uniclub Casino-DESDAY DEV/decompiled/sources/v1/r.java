package v1;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final q f4078a = new q(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f4079b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f4080c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f4079b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f4080c = atomicReferenceArr;
    }

    public static final void a(q qVar) {
        X0.d.e(qVar, "segment");
        if (qVar.f4076f != null || qVar.f4077g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (qVar.d) {
            return;
        }
        AtomicReference atomicReference = f4080c[(int) (Thread.currentThread().getId() & (f4079b - 1))];
        q qVar2 = f4078a;
        q qVar3 = (q) atomicReference.getAndSet(qVar2);
        if (qVar3 == qVar2) {
            return;
        }
        int i = qVar3 != null ? qVar3.f4074c : 0;
        if (i >= 65536) {
            atomicReference.set(qVar3);
            return;
        }
        qVar.f4076f = qVar3;
        qVar.f4073b = 0;
        qVar.f4074c = i + 8192;
        atomicReference.set(qVar);
    }

    public static final q b() {
        AtomicReference atomicReference = f4080c[(int) (Thread.currentThread().getId() & (f4079b - 1))];
        q qVar = f4078a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set(null);
            return new q();
        }
        atomicReference.set(qVar2.f4076f);
        qVar2.f4076f = null;
        qVar2.f4074c = 0;
        return qVar2;
    }
}
