package o;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class ET extends Z implements UD, InterfaceC2243xm, InterfaceC0589Wp {
    public static final /* synthetic */ AtomicReferenceFieldUpdater m = AtomicReferenceFieldUpdater.newUpdater(ET.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int l;

    public ET(Object obj) {
        this._state$volatile = obj;
    }

    @Override // o.Z
    public final AbstractC0679a0 b() {
        return new FT();
    }

    @Override // o.Z
    public final AbstractC0679a0[] c() {
        return new FT[2];
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007d, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:25:0x0093, B:27:0x00b4, B:30:0x00c4, B:31:0x00e0, B:37:0x00f0, B:33:0x00e7, B:36:0x00ed, B:46:0x0099, B:49:0x00a0, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007d, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:25:0x0093, B:27:0x00b4, B:30:0x00c4, B:31:0x00e0, B:37:0x00f0, B:33:0x00e7, B:36:0x00ed, B:46:0x0099, B:49:0x00a0, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c3 -> B:15:0x007d). Please report as a decompilation issue!!! */
    @Override // o.InterfaceC2243xm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object collect(o.InterfaceC2309ym r18, o.InterfaceC2235xe r19) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ET.collect(o.ym, o.xe):java.lang.Object");
    }

    @Override // o.InterfaceC2309ym
    public final Object emit(Object obj, InterfaceC2235xe interfaceC2235xe) {
        if (obj == null) {
            obj = AbstractC1052fg.e;
        }
        f(null, obj);
        return C0782bY.a;
    }

    public final boolean f(Object obj, Object obj2) {
        int i;
        AbstractC0679a0[] abstractC0679a0Arr;
        C0457Rn c0457Rn;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !AbstractC0048Bt.h(obj3, obj)) {
                return false;
            }
            if (AbstractC0048Bt.h(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.l;
            if ((i2 & 1) != 0) {
                this.l = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.l = i3;
            AbstractC0679a0[] abstractC0679a0Arr2 = this.h;
            while (true) {
                FT[] ftArr = (FT[]) abstractC0679a0Arr2;
                if (ftArr != null) {
                    for (FT ft : ftArr) {
                        if (ft != null) {
                            AtomicReference atomicReference = ft.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (c0457Rn = AbstractC1305jX.m)) {
                                    C0457Rn c0457Rn2 = AbstractC1305jX.l;
                                    if (obj4 != c0457Rn2) {
                                        while (!atomicReference.compareAndSet(obj4, c0457Rn2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0849ca) obj4).resumeWith(C0782bY.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, c0457Rn)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.l;
                    if (i == i3) {
                        this.l = i3 + 1;
                        return true;
                    }
                    abstractC0679a0Arr = this.h;
                }
                abstractC0679a0Arr2 = abstractC0679a0Arr;
                i3 = i;
            }
        }
    }

    @Override // o.CT
    public final Object getValue() {
        C0457Rn c0457Rn = AbstractC1052fg.e;
        Object obj = m.get(this);
        if (obj == c0457Rn) {
            return null;
        }
        return obj;
    }

    @Override // o.RD
    public final void m() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // o.RD
    public final boolean n(Object obj) {
        f(null, obj);
        return true;
    }

    @Override // o.InterfaceC0589Wp
    public final InterfaceC2243xm p(InterfaceC0189He interfaceC0189He, int i, H8 h8) {
        return (((i < 0 || i >= 2) && i != -2) || h8 != H8.i) ? AbstractC0868ct.u(this, interfaceC0189He, i, h8) : this;
    }
}
