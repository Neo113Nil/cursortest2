package defpackage;

import com.vectorharbor.planetvectorsurvey.ui.components.RelayComponentsKt;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final /* synthetic */ class sh implements qu {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ sh(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x014d, code lost:
    
        if (r4 == null) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0154  */
    @Override // defpackage.qu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        ky0 RelayScene$lambda$2$lambda$1;
        ky0 ScreenTopBar$lambda$9$lambda$7;
        char c;
        long j;
        char c2;
        long j2;
        Collection l0;
        Object obj3 = null;
        char c3 = 7;
        long j3 = -9187201950435737472L;
        int i = 8;
        switch (this.d) {
            case 0:
                ca0 ca0Var = (ca0) this.e;
                ((Integer) obj).getClass();
                if (obj2 instanceof p10) {
                    p10 p10Var = (p10) obj2;
                    b70 b70Var = (b70) ca0Var.i;
                    if (b70Var == null) {
                        int i2 = wn0.a;
                        b70Var = new b70();
                        ca0Var.i = b70Var;
                    }
                    b70Var.j(p10Var);
                    ca0Var.d.b(p10Var);
                }
                if (obj2 instanceof dk0) {
                    ca0Var.g((dk0) obj2);
                }
                if (obj2 instanceof ri0) {
                    ((ri0) obj2).c();
                }
                return ky0.a;
            case 1:
                wi0 wi0Var = (wi0) this.e;
                Set set = (Set) obj;
                synchronized (wi0Var.b) {
                    try {
                        if (((si0) wi0Var.t.getValue()).compareTo(si0.h) >= 0) {
                            b70 b70Var2 = wi0Var.g;
                            if (set instanceof xn0) {
                                b70 b70Var3 = ((xn0) set).d;
                                Object[] objArr = b70Var3.b;
                                long[] jArr = b70Var3.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    while (true) {
                                        long j4 = jArr[i3];
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = 0; i5 < i4; i5++) {
                                                if ((j4 & 255) < 128) {
                                                    Object obj4 = objArr[(i3 << 3) + i5];
                                                    if (!(obj4 instanceof it0) || ((it0) obj4).e(1)) {
                                                        b70Var2.a(obj4);
                                                    }
                                                }
                                                j4 >>= 8;
                                            }
                                            if (i4 != 8) {
                                            }
                                        }
                                        if (i3 != length) {
                                            i3++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj5 : set) {
                                    if (!(obj5 instanceof it0) || ((it0) obj5).e(1)) {
                                        b70Var2.a(obj5);
                                    }
                                }
                            }
                            obj3 = wi0Var.A();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (obj3 != null) {
                    ((hc) obj3).resumeWith(ky0.a);
                }
                return ky0.a;
            case 2:
                RelayScene$lambda$2$lambda$1 = RelayComponentsKt.RelayScene$lambda$2$lambda$1((ru) this.e, (ih) obj, ((Integer) obj2).intValue());
                return RelayScene$lambda$2$lambda$1;
            case 3:
                ScreenTopBar$lambda$9$lambda$7 = RelayComponentsKt.ScreenTopBar$lambda$9$lambda$7((bu) this.e, (ih) obj, ((Integer) obj2).intValue());
                return ScreenTopBar$lambda$9$lambda$7;
            case 4:
                lm0 lm0Var = (lm0) this.e;
                int intValue = ((Integer) obj).intValue();
                pj pjVar = (pj) obj2;
                qj key = pjVar.getKey();
                Object k = lm0Var.e.k(key);
                if (key != b2.C) {
                    if (pjVar != k) {
                        intValue = Integer.MIN_VALUE;
                    }
                    intValue++;
                } else {
                    Object obj6 = (zz) k;
                    Object obj7 = (zz) pjVar;
                    while (obj7 != null) {
                        if (obj7 != obj6 && (obj7 instanceof yn0)) {
                            id idVar = (id) g00.e.get((yn0) obj7);
                            obj7 = idVar != null ? idVar.getParent() : null;
                        } else {
                            obj3 = obj7;
                            if (obj3 == obj6) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + obj3 + ", expected child of " + obj6 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        }
                    }
                    if (obj3 == obj6) {
                    }
                }
                return Integer.valueOf(intValue);
            case 5:
                eb ebVar = (eb) this.e;
                Set set2 = (Set) obj;
                if (!(set2 instanceof xn0)) {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj8 : set3) {
                            if ((obj8 instanceof it0) && !((it0) obj8).e(4)) {
                            }
                            ebVar.r(set2);
                        }
                    }
                    return ky0.a;
                }
                b70 b70Var4 = ((xn0) set2).d;
                Object[] objArr2 = b70Var4.b;
                long[] jArr2 = b70Var4.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j5 = jArr2[i6];
                        if ((((~j5) << c3) & j5 & j3) != j3) {
                            int i7 = 8 - ((~(i6 - length2)) >>> 31);
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j5 & 255) < 128) {
                                    c2 = c3;
                                    Object obj9 = objArr2[(i6 << 3) + i8];
                                    j2 = j3;
                                    if ((obj9 instanceof it0) && !((it0) obj9).e(4)) {
                                    }
                                } else {
                                    c2 = c3;
                                    j2 = j3;
                                }
                                j5 >>= 8;
                                i8++;
                                c3 = c2;
                                j3 = j2;
                            }
                            c = c3;
                            j = j3;
                            if (i7 != 8) {
                            }
                        } else {
                            c = c3;
                            j = j3;
                        }
                        if (i6 != length2) {
                            i6++;
                            c3 = c;
                            j3 = j;
                        }
                    }
                }
                return ky0.a;
            default:
                is0 is0Var = (is0) this.e;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = is0Var.b;
                while (true) {
                    Object obj10 = atomicReference.get();
                    if (obj10 == null) {
                        l0 = collection;
                    } else if (obj10 instanceof Set) {
                        l0 = px0.I(obj10, collection);
                    } else {
                        if (!(obj10 instanceof List)) {
                            th.d("Unexpected notification");
                            throw new kf();
                        }
                        l0 = zd.l0((Collection) obj10, px0.H(collection));
                    }
                    while (!atomicReference.compareAndSet(obj10, l0)) {
                        if (atomicReference.get() != obj10) {
                            break;
                        }
                    }
                    if (is0Var.a()) {
                        is0Var.a.c(new ab0(i, is0Var));
                    }
                    return ky0.a;
                    break;
                }
        }
    }
}
