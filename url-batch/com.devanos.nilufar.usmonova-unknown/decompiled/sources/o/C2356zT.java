package o;

import com.devanos.nilufar.usmonova.p7.data.network.dto.StartupResponseDto;

/* renamed from: o.zT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2356zT {
    public final WO a;
    public final C4 b;

    public C2356zT(WO wo, C4 c4) {
        AbstractC0048Bt.n(wo, "rtdbConfigLoader");
        AbstractC0048Bt.n(c4, "antiFraudRepository");
        this.a = wo;
        this.b = c4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0081, code lost:
    
        if (r11 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0083, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x004c, code lost:
    
        if (r11 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC2367ze abstractC2367ze) {
        C2290yT c2290yT;
        int i;
        Object e;
        String n6u4xl;
        if (abstractC2367ze instanceof C2290yT) {
            c2290yT = (C2290yT) abstractC2367ze;
            int i2 = c2290yT.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2290yT.j = i2 - Integer.MIN_VALUE;
                Object obj = c2290yT.h;
                EnumC0448Re enumC0448Re = EnumC0448Re.h;
                i = c2290yT.j;
                if (i != 0) {
                    AbstractC1494mO.l(obj);
                    AbstractC0896dH.d("Startup", "execute begin");
                    WO wo = this.a;
                    c2290yT.j = 1;
                    obj = wo.a(c2290yT);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1494mO.l(obj);
                        e = ((C1428lO) obj).h;
                        Throwable a = C1428lO.a(e);
                        if (a != null) {
                            BU bu = AbstractC0896dH.a;
                            AbstractC0896dH.b("Startup", "failed: " + a.getMessage(), a);
                            String message = a.getMessage();
                            if (message == null) {
                                message = "startup_error";
                            }
                            return new C1960tT(message);
                        }
                        StartupResponseDto startupResponseDto = (StartupResponseDto) e;
                        Object obj2 = C2092vT.a;
                        AbstractC0048Bt.n(startupResponseDto, "response");
                        BU bu2 = AbstractC0896dH.a;
                        AbstractC0896dH.d("Decision", "raw z3q8rs=" + startupResponseDto.getZ3q8rs() + " v9m2pt=" + C1097gL.F0(startupResponseDto.getV9m2pt()) + " n6u4xl=" + C1097gL.F0(startupResponseDto.getN6u4xl()) + " a2c8yo=" + startupResponseDto.getA2c8yo() + " l7s5hk=" + startupResponseDto.getL7s5hk() + " e4f7nr=" + startupResponseDto.getE4f7nr());
                        String n6u4xl2 = startupResponseDto.getN6u4xl();
                        if (n6u4xl2 != null && !UT.J(n6u4xl2)) {
                            AbstractC0896dH.d("Decision", "-> S0");
                            obj2 = new C2158wT(startupResponseDto.getN6u4xl());
                        } else if (AbstractC0048Bt.h(startupResponseDto.getA2c8yo(), AbstractC1473m3.f0(AbstractC1473m3.f(69, 47, 124, 29, 19, 225, 81, 10, 67, 60, 96)))) {
                            AbstractC0896dH.d("Decision", "-> Policy");
                        } else {
                            String v9m2pt = startupResponseDto.getV9m2pt();
                            if (v9m2pt != null && !UT.J(v9m2pt)) {
                                AbstractC0896dH.d("Decision", "-> Fallback token");
                                obj2 = new C1960tT("block_token");
                            } else if (AbstractC0048Bt.h(startupResponseDto.getZ3q8rs(), "ok") && AbstractC0048Bt.h(startupResponseDto.getL7s5hk(), AbstractC1473m3.f0(AbstractC1473m3.f(65, 58, 112, 7, 45, 227, 81, 57, 69, 57, 127)))) {
                                AbstractC0896dH.d("Decision", "-> MainStub");
                                obj2 = C2026uT.a;
                            } else if (AbstractC0048Bt.h(startupResponseDto.getZ3q8rs(), "ok") && ((n6u4xl = startupResponseDto.getN6u4xl()) == null || UT.J(n6u4xl))) {
                                AbstractC0896dH.d("Decision", "-> Policy ok");
                            } else {
                                String e4f7nr = startupResponseDto.getE4f7nr();
                                if (e4f7nr == null) {
                                    e4f7nr = "unknown_response";
                                }
                                AbstractC0896dH.f("Decision", "-> Fallback ".concat(e4f7nr), null);
                                obj2 = new C1960tT(e4f7nr);
                            }
                        }
                        AbstractC0896dH.d("Startup", "done -> " + obj2);
                        return obj2;
                    }
                    AbstractC1494mO.l(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                BU bu3 = AbstractC0896dH.a;
                String str = AbstractC0707aP.a;
                AbstractC0896dH.d("Startup", "rtdb ok=" + booleanValue + " rootReady=" + (!UT.J(AbstractC0707aP.a)));
                C4 c4 = this.b;
                c2290yT.j = 2;
                e = c4.e(c2290yT);
            }
        }
        c2290yT = new C2290yT(this, abstractC2367ze);
        Object obj3 = c2290yT.h;
        EnumC0448Re enumC0448Re2 = EnumC0448Re.h;
        i = c2290yT.j;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        BU bu32 = AbstractC0896dH.a;
        String str2 = AbstractC0707aP.a;
        AbstractC0896dH.d("Startup", "rtdb ok=" + booleanValue2 + " rootReady=" + (!UT.J(AbstractC0707aP.a)));
        C4 c42 = this.b;
        c2290yT.j = 2;
        e = c42.e(c2290yT);
    }
}
