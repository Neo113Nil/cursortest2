package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public abstract class Vm {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Ol ol, double d, EnumC3944df enumC3944df, int i, AdConfig.VastVideoConfig vastVideoConfig, ContinuationImpl continuationImpl) {
        Pm pm;
        int i2;
        double doubleValue;
        if (continuationImpl instanceof Pm) {
            pm = (Pm) continuationImpl;
            int i3 = pm.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pm.e = i3 - Integer.MIN_VALUE;
                Object obj = pm.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = pm.e;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    pm.a = ol;
                    pm.b = enumC3944df;
                    pm.c = i;
                    pm.e = 1;
                    obj = a(ol, d, vastVideoConfig, pm);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = pm.c;
                    enumC3944df = pm.b;
                    ol = pm.a;
                    ResultKt.throwOnFailure(obj);
                }
                doubleValue = ((Number) obj).doubleValue();
                if (doubleValue != Double.MAX_VALUE) {
                    return Boxing.boxDouble(Double.MAX_VALUE);
                }
                double abs = Math.abs((ol.a * ol.b) - i);
                int ordinal = enumC3944df.ordinal();
                return Boxing.boxDouble((abs * (ordinal != 2 ? ordinal != 3 ? 0.5d : 1.5d : 1.0d)) / Math.exp(doubleValue / 3.145728E7d));
            }
        }
        pm = new Pm(continuationImpl);
        Object obj2 = pm.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = pm.e;
        if (i2 != 0) {
        }
        doubleValue = ((Number) obj2).doubleValue();
        if (doubleValue != Double.MAX_VALUE) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Ol ol, double d, AdConfig.VastVideoConfig vastVideoConfig, ContinuationImpl continuationImpl) {
        Qm qm;
        int i;
        double d2;
        if (continuationImpl instanceof Qm) {
            qm = (Qm) continuationImpl;
            int i2 = qm.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qm.c = i2 - Integer.MIN_VALUE;
                Object obj = qm.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = qm.c;
                double d3 = Double.MAX_VALUE;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    d2 = ol.d * d;
                    if (d2 <= 0.0d && !vastVideoConfig.getBitRate().getFetchFromHead()) {
                        return Boxing.boxDouble(Double.MAX_VALUE);
                    }
                    if (d2 <= 0.0d) {
                        qm.a = vastVideoConfig;
                        qm.c = 1;
                        obj = a(ol, vastVideoConfig, qm);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    if (d2 > 0.0d && d2 <= vastVideoConfig.getVastMaxAssetSize()) {
                        d3 = d2;
                    }
                    return Boxing.boxDouble(d3);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vastVideoConfig = qm.a;
                ResultKt.throwOnFailure(obj);
                d2 = ((Number) obj).doubleValue();
                if (d2 > 0.0d) {
                    d3 = d2;
                }
                return Boxing.boxDouble(d3);
            }
        }
        qm = new Qm(continuationImpl);
        Object obj2 = qm.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = qm.c;
        double d32 = Double.MAX_VALUE;
        if (i != 0) {
        }
        d2 = ((Number) obj2).doubleValue();
        if (d2 > 0.0d) {
        }
        return Boxing.boxDouble(d32);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:21|22))(3:23|24|(1:26))|11|(2:18|19)(2:15|16)))|28|6|7|(0)(0)|11|(1:13)|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        r13 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Ol ol, AdConfig.VastVideoConfig vastVideoConfig, ContinuationImpl continuationImpl) {
        Rm rm;
        int i;
        InterfaceC3892bf interfaceC3892bf;
        if (continuationImpl instanceof Rm) {
            rm = (Rm) continuationImpl;
            int i2 = rm.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rm.b = i2 - Integer.MIN_VALUE;
                Object obj = rm.a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rm.b;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ye ye = new Ye(ol.c, new Ok(vastVideoConfig.getBitRate().getHeaderTimeout(), vastVideoConfig.getBitRate().getHeaderTimeout(), vastVideoConfig.getBitRate().getHeaderTimeout()));
                    F9 f9 = (F9) Ve.c.getValue();
                    rm.b = 1;
                    obj = f9.a.a(ye, rm);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                interfaceC3892bf = (InterfaceC3892bf) obj;
                if (interfaceC3892bf == null && interfaceC3892bf.c() == 200) {
                    return Boxing.boxDouble(interfaceC3892bf.b().c);
                }
                return Boxing.boxDouble(Double.MAX_VALUE);
            }
        }
        rm = new Rm(continuationImpl);
        Object obj2 = rm.a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rm.b;
        if (i != 0) {
        }
        interfaceC3892bf = (InterfaceC3892bf) obj2;
        if (interfaceC3892bf == null) {
        }
        return Boxing.boxDouble(Double.MAX_VALUE);
    }
}
