package o;

import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: o.Kl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274Kl {
    public final C2069v6 a;
    public final C4 b;

    public C0274Kl(C2069v6 c2069v6, C4 c4) {
        AbstractC0048Bt.n(c2069v6, "preferences");
        AbstractC0048Bt.n(c4, "antiFraudRepository");
        this.a = c2069v6;
        this.b = c4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(1:(5:12|13|(1:20)|17|18)(2:21|22))(4:23|24|25|26))(1:27))(3:39|40|(2:42|36))|28|(4:33|(2:35|36)|25|26)|37|38))|47|6|7|(0)(0)|28|(5:30|33|(0)|25|26)|37|38|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0049, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004a, code lost:
    
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        r1.h = r0;
        r1.k = 3;
        r11 = o.AbstractC0022At.o(new o.C1410l6(((o.InterfaceC1972tf) ((o.C1590ns) o.AbstractC2135w6.a(r4.a)).i).c(), r3), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c4, code lost:
    
        if (r11 != r9) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC2367ze abstractC2367ze) {
        C0196Hl c0196Hl;
        int i;
        C2069v6 c2069v6;
        EnumC0448Re enumC0448Re;
        String str;
        if (abstractC2367ze instanceof C0196Hl) {
            c0196Hl = (C0196Hl) abstractC2367ze;
            int i2 = c0196Hl.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0196Hl.k = i2 - Integer.MIN_VALUE;
                Object obj = c0196Hl.i;
                i = c0196Hl.k;
                c2069v6 = this.a;
                enumC0448Re = EnumC0448Re.h;
                if (i != 0) {
                    AbstractC1494mO.l(obj);
                    AbstractC0896dH.d(FirebaseMessaging.INSTANCE_ID_SCOPE, "fetchAndCacheToken() begin");
                    MU token = FirebaseMessaging.getInstance().getToken();
                    AbstractC0048Bt.m(token, "getToken(...)");
                    c0196Hl.k = 1;
                    obj = ON.d(token, c0196Hl);
                    if (obj == enumC0448Re) {
                        return enumC0448Re;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            str = (String) c0196Hl.h;
                            AbstractC1494mO.l(obj);
                            BU bu = AbstractC0896dH.a;
                            AbstractC0896dH.d(FirebaseMessaging.INSTANCE_ID_SCOPE, "token fetched ok (len=" + str.length() + ")");
                            return str;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Exception exc = (Exception) c0196Hl.h;
                        AbstractC1494mO.l(obj);
                        String str2 = (String) obj;
                        BU bu2 = AbstractC0896dH.a;
                        String message = exc.getMessage();
                        AbstractC0896dH.f(FirebaseMessaging.INSTANCE_ID_SCOPE, "token fetch failed: " + message + "; cached=" + (((str2 == null || UT.J(str2)) ? 1 : 0) ^ 1), exc);
                        return str2;
                    }
                    AbstractC1494mO.l(obj);
                }
                str = (String) obj;
                if (str != null && !UT.J(str)) {
                    c0196Hl.h = str;
                    c0196Hl.k = 2;
                    if (c2069v6.a(str, c0196Hl) == enumC0448Re) {
                        return enumC0448Re;
                    }
                    BU bu3 = AbstractC0896dH.a;
                    AbstractC0896dH.d(FirebaseMessaging.INSTANCE_ID_SCOPE, "token fetched ok (len=" + str.length() + ")");
                    return str;
                }
                AbstractC0896dH.f(FirebaseMessaging.INSTANCE_ID_SCOPE, "token fetch returned blank", null);
                return str;
            }
        }
        c0196Hl = new C0196Hl(this, abstractC2367ze);
        Object obj2 = c0196Hl.i;
        i = c0196Hl.k;
        c2069v6 = this.a;
        enumC0448Re = EnumC0448Re.h;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str != null) {
            c0196Hl.h = str;
            c0196Hl.k = 2;
            if (c2069v6.a(str, c0196Hl) == enumC0448Re) {
            }
            BU bu32 = AbstractC0896dH.a;
            AbstractC0896dH.d(FirebaseMessaging.INSTANCE_ID_SCOPE, "token fetched ok (len=" + str.length() + ")");
            return str;
        }
        AbstractC0896dH.f(FirebaseMessaging.INSTANCE_ID_SCOPE, "token fetch returned blank", null);
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
    
        if (r6.b.d(r7, r0) != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r6.a.a(r7, r0) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, AbstractC2367ze abstractC2367ze) {
        C0222Il c0222Il;
        int i;
        if (abstractC2367ze instanceof C0222Il) {
            c0222Il = (C0222Il) abstractC2367ze;
            int i2 = c0222Il.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0222Il.k = i2 - Integer.MIN_VALUE;
                Object obj = c0222Il.i;
                i = c0222Il.k;
                EnumC0448Re enumC0448Re = EnumC0448Re.h;
                if (i != 0) {
                    AbstractC1494mO.l(obj);
                    BU bu = AbstractC0896dH.a;
                    AbstractC0896dH.d(FirebaseMessaging.INSTANCE_ID_SCOPE, "onNewToken len=" + str.length());
                    c0222Il.h = str;
                    c0222Il.k = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1494mO.l(obj);
                        return C0782bY.a;
                    }
                    str = c0222Il.h;
                    AbstractC1494mO.l(obj);
                }
                c0222Il.h = null;
                c0222Il.k = 2;
            }
        }
        c0222Il = new C0222Il(this, abstractC2367ze);
        Object obj2 = c0222Il.i;
        i = c0222Il.k;
        EnumC0448Re enumC0448Re2 = EnumC0448Re.h;
        if (i != 0) {
        }
        c0222Il.h = null;
        c0222Il.k = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r7 == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AbstractC2367ze abstractC2367ze) {
        C0248Jl c0248Jl;
        int i;
        C0782bY c0782bY;
        String str;
        if (abstractC2367ze instanceof C0248Jl) {
            c0248Jl = (C0248Jl) abstractC2367ze;
            int i2 = c0248Jl.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0248Jl.j = i2 - Integer.MIN_VALUE;
                Object obj = c0248Jl.h;
                i = c0248Jl.j;
                c0782bY = C0782bY.a;
                EnumC0448Re enumC0448Re = EnumC0448Re.h;
                if (i != 0) {
                    AbstractC1494mO.l(obj);
                    c0248Jl.j = 1;
                    obj = AbstractC0022At.o(new C1410l6(((InterfaceC1972tf) ((C1590ns) AbstractC2135w6.a(this.a.a)).i).c(), 0), c0248Jl);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1494mO.l(obj);
                        return c0782bY;
                    }
                    AbstractC1494mO.l(obj);
                }
                str = (String) obj;
                if (str != null || UT.J(str)) {
                    AbstractC0896dH.a(FirebaseMessaging.INSTANCE_ID_SCOPE, "push_token skip: no cached token");
                    return c0782bY;
                }
                c0248Jl.j = 2;
                return this.b.d(str, c0248Jl) == enumC0448Re ? enumC0448Re : c0782bY;
            }
        }
        c0248Jl = new C0248Jl(this, abstractC2367ze);
        Object obj2 = c0248Jl.h;
        i = c0248Jl.j;
        c0782bY = C0782bY.a;
        EnumC0448Re enumC0448Re2 = EnumC0448Re.h;
        if (i != 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        AbstractC0896dH.a(FirebaseMessaging.INSTANCE_ID_SCOPE, "push_token skip: no cached token");
        return c0782bY;
    }
}
