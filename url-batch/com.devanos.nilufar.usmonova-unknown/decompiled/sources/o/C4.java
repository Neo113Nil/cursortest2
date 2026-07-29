package o;

import com.devanos.nilufar.usmonova.p7.data.network.ApiService;
import com.devanos.nilufar.usmonova.p7.data.network.dto.PersistPayloadDto;
import com.squareup.moshi.Moshi;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* loaded from: classes.dex */
public final class C4 {
    public final C2069v6 a;
    public final C0803bt b;
    public final C1514mi c;
    public final C1580ni d;
    public final EF e;
    public final C0762bE f;

    public C4(C2069v6 c2069v6, C0803bt c0803bt, C1514mi c1514mi, C1580ni c1580ni, EF ef) {
        AbstractC0048Bt.n(c2069v6, "preferences");
        AbstractC0048Bt.n(c0803bt, "installIdManager");
        AbstractC0048Bt.n(c1514mi, "deviceIdManager");
        AbstractC0048Bt.n(c1580ni, "deviceInfo");
        AbstractC0048Bt.n(ef, "okHttpClient");
        this.a = c2069v6;
        this.b = c0803bt;
        this.c = c1514mi;
        this.d = c1580ni;
        this.e = ef;
        this.f = new C0762bE();
    }

    public final ApiService a() {
        Moshi moshi = AbstractC1945tE.a;
        EF ef = this.e;
        AbstractC0048Bt.n(ef, "client");
        String str = AbstractC0707aP.a;
        Object create = new Retrofit.Builder().baseUrl(AbstractC0707aP.a).client(ef).addConverterFactory(MoshiConverterFactory.create(AbstractC1945tE.a)).build().create(ApiService.class);
        AbstractC0048Bt.m(create, "create(...)");
        return (ApiService) create;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x006f -> B:17:0x0076). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, String str, InterfaceC2114vp interfaceC2114vp, AbstractC2367ze abstractC2367ze) {
        C2001u4 c2001u4;
        int i2;
        int i3;
        int i4;
        int i5;
        C1360kM c1360kM;
        InterfaceC2114vp interfaceC2114vp2;
        String str2;
        InterfaceC2114vp interfaceC2114vp3;
        Exception e;
        C1360kM c1360kM2;
        int i6;
        int i7;
        int i8;
        if (abstractC2367ze instanceof C2001u4) {
            c2001u4 = (C2001u4) abstractC2367ze;
            int i9 = c2001u4.q;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2001u4.q = i9 - Integer.MIN_VALUE;
                Object obj = c2001u4.f228o;
                i2 = c2001u4.q;
                if (i2 != 0) {
                    AbstractC1494mO.l(obj);
                    i3 = i + 1;
                    i4 = i;
                    i5 = 0;
                    c1360kM = new C1360kM();
                    interfaceC2114vp2 = interfaceC2114vp;
                    str2 = str;
                    if (i5 >= i3) {
                        Throwable th = (Exception) c1360kM.h;
                        if (th == null) {
                            th = new IllegalStateException("unknown error");
                        }
                        return AbstractC1494mO.d(th);
                    }
                    try {
                    } catch (Exception e2) {
                        interfaceC2114vp3 = interfaceC2114vp2;
                        e = e2;
                        c1360kM2 = c1360kM;
                        i6 = i3;
                        i7 = i4;
                        i8 = i5;
                        c1360kM2.h = e;
                        BU bu = AbstractC0896dH.a;
                        AbstractC0896dH.f("Repository", str2 + " attempt " + (i5 + 1) + " failed: " + e.getMessage(), e);
                        i5 = i8 + 1;
                        i4 = i7;
                        i3 = i6;
                        interfaceC2114vp2 = interfaceC2114vp3;
                        c1360kM = c1360kM2;
                        if (i5 >= i3) {
                        }
                    }
                    c2001u4.l = str2;
                    c2001u4.m = interfaceC2114vp2;
                    c2001u4.n = c1360kM;
                    c2001u4.h = i4;
                    c2001u4.i = i3;
                    c2001u4.j = i5;
                    c2001u4.k = i5;
                    c2001u4.q = 1;
                    Object invoke = interfaceC2114vp2.invoke(c2001u4);
                    EnumC0448Re enumC0448Re = EnumC0448Re.h;
                    return invoke == enumC0448Re ? enumC0448Re : invoke;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i5 = c2001u4.k;
                i8 = c2001u4.j;
                int i10 = c2001u4.i;
                i7 = c2001u4.h;
                C1360kM c1360kM3 = c2001u4.n;
                interfaceC2114vp3 = c2001u4.m;
                String str3 = c2001u4.l;
                try {
                    AbstractC1494mO.l(obj);
                    return obj;
                } catch (Exception e3) {
                    e = e3;
                    i6 = i10;
                    str2 = str3;
                    c1360kM2 = c1360kM3;
                    c1360kM2.h = e;
                    BU bu2 = AbstractC0896dH.a;
                    AbstractC0896dH.f("Repository", str2 + " attempt " + (i5 + 1) + " failed: " + e.getMessage(), e);
                    i5 = i8 + 1;
                    i4 = i7;
                    i3 = i6;
                    interfaceC2114vp2 = interfaceC2114vp3;
                    c1360kM = c1360kM2;
                    if (i5 >= i3) {
                    }
                }
            }
        }
        c2001u4 = new C2001u4(this, abstractC2367ze);
        Object obj2 = c2001u4.f228o;
        i2 = c2001u4.q;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00fe, code lost:
    
        if (r0 == r14) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008b, code lost:
    
        if (r0 == r14) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AbstractC2367ze abstractC2367ze) {
        C2067v4 c2067v4;
        int i;
        Object obj;
        String str;
        String str2;
        Object a;
        String str3;
        InterfaceC2114vp c2133w4;
        Object b;
        try {
            if (abstractC2367ze instanceof C2067v4) {
                c2067v4 = (C2067v4) abstractC2367ze;
                int i2 = c2067v4.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c2067v4.l = i2 - Integer.MIN_VALUE;
                    C2067v4 c2067v42 = c2067v4;
                    Object obj2 = c2067v42.j;
                    i = c2067v42.l;
                    obj = C0782bY.a;
                    C2069v6 c2069v6 = this.a;
                    int i3 = 3;
                    Object obj3 = EnumC0448Re.h;
                    if (i != 0) {
                        AbstractC1494mO.l(obj2);
                        c2067v42.l = 1;
                        obj2 = AbstractC0022At.o(new C1410l6(((InterfaceC1972tf) ((C1590ns) AbstractC2135w6.a(c2069v6.a)).i).c(), i3), c2067v42);
                    } else if (i == 1) {
                        AbstractC1494mO.l(obj2);
                    } else {
                        if (i == 2) {
                            str2 = c2067v42.h;
                            AbstractC1494mO.l(obj2);
                            String str4 = (String) obj2;
                            c2067v42.h = str2;
                            c2067v42.i = str4;
                            c2067v42.l = 3;
                            a = this.c.a(c2067v42);
                            if (a != obj3) {
                                str3 = str4;
                                obj2 = a;
                                String str5 = (String) obj2;
                                AbstractC0896dH.d("Repository", "click send");
                                c2133w4 = new C2133w4(this, str2, str3, str5, null);
                                c2067v42.h = null;
                                c2067v42.i = null;
                                c2067v42.l = 4;
                                if (b(2, "click", c2133w4, c2067v42) == obj3) {
                                }
                                c2067v42.h = null;
                                c2067v42.i = null;
                                c2067v42.l = 5;
                                b = ((C1590ns) AbstractC2135w6.a(c2069v6.a)).b(new C0701aJ(new C2003u6(null, null), null), c2067v42);
                                if (b != obj3) {
                                }
                            }
                            return obj3;
                        }
                        if (i == 3) {
                            String str6 = c2067v42.i;
                            String str7 = c2067v42.h;
                            AbstractC1494mO.l(obj2);
                            str3 = str6;
                            str2 = str7;
                            String str52 = (String) obj2;
                            AbstractC0896dH.d("Repository", "click send");
                            c2133w4 = new C2133w4(this, str2, str3, str52, null);
                            c2067v42.h = null;
                            c2067v42.i = null;
                            c2067v42.l = 4;
                            if (b(2, "click", c2133w4, c2067v42) == obj3) {
                                return obj3;
                            }
                            c2067v42.h = null;
                            c2067v42.i = null;
                            c2067v42.l = 5;
                            b = ((C1590ns) AbstractC2135w6.a(c2069v6.a)).b(new C0701aJ(new C2003u6(null, null), null), c2067v42);
                            if (b != obj3) {
                            }
                        } else {
                            if (i != 4) {
                                if (i != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC1494mO.l(obj2);
                                AbstractC0896dH.d("Repository", "click ok");
                                return obj;
                            }
                            AbstractC1494mO.l(obj2);
                            ((C1428lO) obj2).getClass();
                            c2067v42.h = null;
                            c2067v42.i = null;
                            c2067v42.l = 5;
                            b = ((C1590ns) AbstractC2135w6.a(c2069v6.a)).b(new C0701aJ(new C2003u6(null, null), null), c2067v42);
                            if (b != obj3) {
                                b = obj;
                            }
                        }
                    }
                    str = (String) obj2;
                    if (str != null) {
                        AbstractC0896dH.a("Repository", "click skip");
                        return obj;
                    }
                    c2067v42.h = str;
                    c2067v42.l = 2;
                    Object a2 = this.b.a(c2067v42);
                    if (a2 != obj3) {
                        str2 = str;
                        obj2 = a2;
                        String str42 = (String) obj2;
                        c2067v42.h = str2;
                        c2067v42.i = str42;
                        c2067v42.l = 3;
                        a = this.c.a(c2067v42);
                        if (a != obj3) {
                        }
                    }
                    return obj3;
                }
            }
            if (i != 0) {
            }
            str = (String) obj2;
            if (str != null) {
            }
        } catch (Exception e) {
            BU bu = AbstractC0896dH.a;
            AbstractC0896dH.f("Repository", "click failed: " + e.getMessage(), e);
            return obj;
        }
        c2067v4 = new C2067v4(this, abstractC2367ze);
        C2067v4 c2067v422 = c2067v4;
        Object obj22 = c2067v422.j;
        i = c2067v422.l;
        obj = C0782bY.a;
        C2069v6 c2069v62 = this.a;
        int i32 = 3;
        Object obj32 = EnumC0448Re.h;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|8|(1:(1:(1:(1:(4:14|15|16|17)(2:20|21))(3:22|23|24))(5:27|28|29|(2:31|26)|24))(1:32))(1:36)|33|(5:35|28|29|(0)|24)|26))|40|6|7|8|(0)(0)|33|(0)|26) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        if (r0.a(r2, r6) == r12) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        if (r2 == r12) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0038, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bd, code lost:
    
        r2 = o.AbstractC0896dH.a;
        o.AbstractC0896dH.f("Repository", "push failed: " + r0.getMessage(), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, AbstractC2367ze abstractC2367ze) {
        C2199x4 c2199x4;
        int i;
        Object obj;
        String str2;
        Object a;
        Object a2;
        String str3;
        String str4;
        InterfaceC2114vp c2265y4;
        if (abstractC2367ze instanceof C2199x4) {
            c2199x4 = (C2199x4) abstractC2367ze;
            int i2 = c2199x4.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2199x4.l = i2 - Integer.MIN_VALUE;
                C2199x4 c2199x42 = c2199x4;
                Object obj2 = c2199x42.j;
                i = c2199x42.l;
                obj = EnumC0448Re.h;
                if (i != 0) {
                    AbstractC1494mO.l(obj2);
                    str2 = str;
                    c2199x42.h = str2;
                    c2199x42.l = 1;
                    a = this.b.a(c2199x42);
                } else if (i == 1) {
                    String str5 = c2199x42.h;
                    AbstractC1494mO.l(obj2);
                    a = obj2;
                    str2 = str5;
                } else if (i == 2) {
                    String str6 = c2199x42.i;
                    String str7 = c2199x42.h;
                    AbstractC1494mO.l(obj2);
                    str4 = str6;
                    str3 = str7;
                    String str8 = (String) obj2;
                    AbstractC0896dH.d("Repository", "push send");
                    c2265y4 = new C2265y4(this, str3, str4, str8, null);
                    c2199x42.h = str3;
                    c2199x42.i = null;
                    c2199x42.l = 3;
                    if (b(2, "push", c2265y4, c2199x42) == obj) {
                        return obj;
                    }
                    C2069v6 c2069v6 = this.a;
                    c2199x42.h = null;
                    c2199x42.i = null;
                    c2199x42.l = 4;
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1494mO.l(obj2);
                        AbstractC0896dH.d("Repository", "push ok");
                        return C0782bY.a;
                    }
                    str3 = c2199x42.h;
                    AbstractC1494mO.l(obj2);
                    ((C1428lO) obj2).getClass();
                    C2069v6 c2069v62 = this.a;
                    c2199x42.h = null;
                    c2199x42.i = null;
                    c2199x42.l = 4;
                }
                String str9 = (String) a;
                c2199x42.h = str2;
                c2199x42.i = str9;
                c2199x42.l = 2;
                a2 = this.c.a(c2199x42);
                if (a2 != obj) {
                    str3 = str2;
                    obj2 = a2;
                    str4 = str9;
                    String str82 = (String) obj2;
                    AbstractC0896dH.d("Repository", "push send");
                    c2265y4 = new C2265y4(this, str3, str4, str82, null);
                    c2199x42.h = str3;
                    c2199x42.i = null;
                    c2199x42.l = 3;
                    if (b(2, "push", c2265y4, c2199x42) == obj) {
                    }
                    C2069v6 c2069v622 = this.a;
                    c2199x42.h = null;
                    c2199x42.i = null;
                    c2199x42.l = 4;
                }
                return obj;
            }
        }
        c2199x4 = new C2199x4(this, abstractC2367ze);
        C2199x4 c2199x422 = c2199x4;
        Object obj22 = c2199x422.j;
        i = c2199x422.l;
        obj = EnumC0448Re.h;
        if (i != 0) {
        }
        String str92 = (String) a;
        c2199x422.h = str2;
        c2199x422.i = str92;
        c2199x422.l = 2;
        a2 = this.c.a(c2199x422);
        if (a2 != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        if (r9 != r5) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r9 == r5) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(AbstractC2367ze abstractC2367ze) {
        C2331z4 c2331z4;
        int i;
        String str;
        if (abstractC2367ze instanceof C2331z4) {
            c2331z4 = (C2331z4) abstractC2367ze;
            int i2 = c2331z4.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2331z4.k = i2 - Integer.MIN_VALUE;
                Object obj = c2331z4.i;
                i = c2331z4.k;
                Object obj2 = EnumC0448Re.h;
                if (i != 0) {
                    AbstractC1494mO.l(obj);
                    c2331z4.k = 1;
                    obj = this.b.a(c2331z4);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC1494mO.l(obj);
                            return ((C1428lO) obj).h;
                        }
                        str = c2331z4.h;
                        AbstractC1494mO.l(obj);
                        String str2 = (String) obj;
                        BU bu = AbstractC0896dH.a;
                        AbstractC0896dH.d("Repository", "startup g9n4zr=" + str + " c2h8vn=" + str2 + " j5a9kf=" + this.d.a());
                        InterfaceC2114vp a4 = new A4(this, str, str2, null);
                        c2331z4.h = null;
                        c2331z4.k = 3;
                        Object b = b(2, "startup", a4, c2331z4);
                        return b == obj2 ? obj2 : b;
                    }
                    AbstractC1494mO.l(obj);
                }
                str = (String) obj;
                c2331z4.h = str;
                c2331z4.k = 2;
                obj = this.c.a(c2331z4);
            }
        }
        c2331z4 = new C2331z4(this, abstractC2367ze);
        Object obj3 = c2331z4.i;
        i = c2331z4.k;
        Object obj22 = EnumC0448Re.h;
        if (i != 0) {
        }
        str = (String) obj3;
        c2331z4.h = str;
        c2331z4.k = 2;
        obj3 = this.c.a(c2331z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x008d: MOVE (r3 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:142), block:B:78:0x008d */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4 A[Catch: all -> 0x008c, TRY_LEAVE, TryCatch #4 {all -> 0x008c, blocks: (B:24:0x0146, B:26:0x014d, B:37:0x012d, B:48:0x0119, B:53:0x0083, B:55:0x00dc, B:57:0x00e4, B:60:0x00ef, B:68:0x00b5), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ef A[Catch: all -> 0x008c, TRY_ENTER, TryCatch #4 {all -> 0x008c, blocks: (B:24:0x0146, B:26:0x014d, B:37:0x012d, B:48:0x0119, B:53:0x0083, B:55:0x00dc, B:57:0x00e4, B:60:0x00ef, B:68:0x00b5), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Type inference failed for: r0v20, types: [o.ns] */
    /* JADX WARN: Type inference failed for: r0v25, types: [o.bt] */
    /* JADX WARN: Type inference failed for: r0v28, types: [o.mi] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [o.B4, o.xe, o.ze] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v1, types: [o.ZD, o.bE] */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.devanos.nilufar.usmonova.p7.data.network.ApiService] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, AbstractC2367ze abstractC2367ze) {
        ?? r3;
        int i;
        C2069v6 c2069v6;
        Object obj;
        String str2;
        ZD zd;
        int i2;
        String str3;
        int i3;
        int i4;
        int i5;
        String str4;
        ZD zd2;
        ?? a;
        String f0;
        PersistPayloadDto persistPayloadDto;
        try {
            try {
                try {
                    if (abstractC2367ze instanceof B4) {
                        B4 b4 = (B4) abstractC2367ze;
                        int i6 = b4.f17o;
                        if ((i6 & Integer.MIN_VALUE) != 0) {
                            b4.f17o = i6 - Integer.MIN_VALUE;
                            r3 = b4;
                            Object obj2 = r3.m;
                            i = r3.f17o;
                            int i7 = 4;
                            c2069v6 = this.a;
                            int i8 = 0;
                            C0782bY c0782bY = C0782bY.a;
                            EnumC0448Re enumC0448Re = EnumC0448Re.h;
                            switch (i) {
                                case 0:
                                    AbstractC1494mO.l(obj2);
                                    r3.h = str;
                                    ?? r4 = this.f;
                                    r3.i = r4;
                                    r3.k = 0;
                                    r3.f17o = 1;
                                    if (r4.c(r3) != enumC0448Re) {
                                        str2 = str;
                                        zd = r4;
                                        i2 = 0;
                                        r3.h = str2;
                                        r3.i = zd;
                                        r3.k = i2;
                                        r3.l = 0;
                                        r3.f17o = 2;
                                        obj2 = AbstractC0022At.o(new C1410l6(((InterfaceC1972tf) ((C1590ns) AbstractC2135w6.a(c2069v6.a)).i).c(), i7), r3);
                                        if (obj2 == enumC0448Re) {
                                        }
                                        String str5 = str2;
                                        int i9 = i8;
                                        str3 = str5;
                                        if (((Boolean) obj2).booleanValue()) {
                                            AbstractC0896dH.a("Repository", "persist skip");
                                            ((C0762bE) zd).e(null);
                                            return c0782bY;
                                        }
                                        r3.h = str3;
                                        r3.i = zd;
                                        r3.k = i2;
                                        r3.l = i9;
                                        r3.f17o = 3;
                                        Object b = ((C1590ns) AbstractC2135w6.a(c2069v6.a)).b(new C0701aJ(new C1740q6(2, null), null), r3);
                                        if (b != enumC0448Re) {
                                            b = c0782bY;
                                        }
                                        if (b != enumC0448Re) {
                                            i3 = i2;
                                            i4 = i9;
                                            ?? r0 = this.b;
                                            r3.h = str3;
                                            r3.i = zd;
                                            r3.k = i3;
                                            r3.l = i4;
                                            r3.f17o = 4;
                                            obj2 = r0.a(r3);
                                            if (obj2 == enumC0448Re) {
                                                i5 = i3;
                                                str4 = (String) obj2;
                                                ?? r02 = this.c;
                                                r3.h = str3;
                                                r3.i = zd;
                                                r3.j = str4;
                                                r3.k = i5;
                                                r3.l = i4;
                                                r3.f17o = 5;
                                                obj2 = r02.a(r3);
                                                if (obj2 == enumC0448Re) {
                                                }
                                                String str6 = (String) obj2;
                                                AbstractC0896dH.d("Repository", "persist send");
                                                try {
                                                    a = a();
                                                    f0 = AbstractC1473m3.f0(AbstractC1473m3.f(89, 62, 111, 22, 19, 253, 87, 8, 65));
                                                    persistPayloadDto = new PersistPayloadDto(str3, str4, str6, this.d.a());
                                                    r3.h = null;
                                                    r3.i = zd;
                                                    r3.j = null;
                                                    r3.k = i5;
                                                    r3.l = i4;
                                                    r3.f17o = 6;
                                                } catch (Exception e) {
                                                    e = e;
                                                    zd2 = zd;
                                                    BU bu = AbstractC0896dH.a;
                                                    AbstractC0896dH.f("Repository", "persist failed: " + e.getMessage(), e);
                                                    ((C0762bE) zd2).e(null);
                                                    return c0782bY;
                                                }
                                                if (a.postPersist(f0, persistPayloadDto, r3) != enumC0448Re) {
                                                    zd2 = zd;
                                                    AbstractC0896dH.d("Repository", "persist ok");
                                                    ((C0762bE) zd2).e(null);
                                                    return c0782bY;
                                                }
                                            }
                                        }
                                    }
                                    return enumC0448Re;
                                case 1:
                                    i2 = r3.k;
                                    zd = r3.i;
                                    str2 = r3.h;
                                    AbstractC1494mO.l(obj2);
                                    r3.h = str2;
                                    r3.i = zd;
                                    r3.k = i2;
                                    r3.l = 0;
                                    r3.f17o = 2;
                                    obj2 = AbstractC0022At.o(new C1410l6(((InterfaceC1972tf) ((C1590ns) AbstractC2135w6.a(c2069v6.a)).i).c(), i7), r3);
                                    if (obj2 == enumC0448Re) {
                                    }
                                    String str52 = str2;
                                    int i92 = i8;
                                    str3 = str52;
                                    if (((Boolean) obj2).booleanValue()) {
                                    }
                                    break;
                                case 2:
                                    i8 = r3.l;
                                    i2 = r3.k;
                                    zd = r3.i;
                                    str2 = r3.h;
                                    AbstractC1494mO.l(obj2);
                                    String str522 = str2;
                                    int i922 = i8;
                                    str3 = str522;
                                    if (((Boolean) obj2).booleanValue()) {
                                    }
                                    break;
                                case 3:
                                    i4 = r3.l;
                                    i3 = r3.k;
                                    ZD zd3 = r3.i;
                                    str3 = r3.h;
                                    AbstractC1494mO.l(obj2);
                                    zd = zd3;
                                    ?? r03 = this.b;
                                    r3.h = str3;
                                    r3.i = zd;
                                    r3.k = i3;
                                    r3.l = i4;
                                    r3.f17o = 4;
                                    obj2 = r03.a(r3);
                                    if (obj2 == enumC0448Re) {
                                    }
                                    break;
                                case 4:
                                    i4 = r3.l;
                                    i5 = r3.k;
                                    ZD zd4 = r3.i;
                                    String str7 = r3.h;
                                    try {
                                        AbstractC1494mO.l(obj2);
                                        zd = zd4;
                                        str3 = str7;
                                        str4 = (String) obj2;
                                        ?? r022 = this.c;
                                        r3.h = str3;
                                        r3.i = zd;
                                        r3.j = str4;
                                        r3.k = i5;
                                        r3.l = i4;
                                        r3.f17o = 5;
                                        obj2 = r022.a(r3);
                                        if (obj2 == enumC0448Re) {
                                        }
                                        String str62 = (String) obj2;
                                        AbstractC0896dH.d("Repository", "persist send");
                                        a = a();
                                        f0 = AbstractC1473m3.f0(AbstractC1473m3.f(89, 62, 111, 22, 19, 253, 87, 8, 65));
                                        persistPayloadDto = new PersistPayloadDto(str3, str4, str62, this.d.a());
                                        r3.h = null;
                                        r3.i = zd;
                                        r3.j = null;
                                        r3.k = i5;
                                        r3.l = i4;
                                        r3.f17o = 6;
                                        if (a.postPersist(f0, persistPayloadDto, r3) != enumC0448Re) {
                                        }
                                        return enumC0448Re;
                                    } catch (Throwable th) {
                                        th = th;
                                        r3 = zd4;
                                        ((C0762bE) r3).e(null);
                                        throw th;
                                    }
                                case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                                    i4 = r3.l;
                                    i5 = r3.k;
                                    str4 = r3.j;
                                    ZD zd5 = r3.i;
                                    str3 = r3.h;
                                    AbstractC1494mO.l(obj2);
                                    zd = zd5;
                                    String str622 = (String) obj2;
                                    AbstractC0896dH.d("Repository", "persist send");
                                    a = a();
                                    f0 = AbstractC1473m3.f0(AbstractC1473m3.f(89, 62, 111, 22, 19, 253, 87, 8, 65));
                                    persistPayloadDto = new PersistPayloadDto(str3, str4, str622, this.d.a());
                                    r3.h = null;
                                    r3.i = zd;
                                    r3.j = null;
                                    r3.k = i5;
                                    r3.l = i4;
                                    r3.f17o = 6;
                                    if (a.postPersist(f0, persistPayloadDto, r3) != enumC0448Re) {
                                    }
                                    return enumC0448Re;
                                case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                                    zd2 = r3.i;
                                    try {
                                        AbstractC1494mO.l(obj2);
                                        AbstractC0896dH.d("Repository", "persist ok");
                                    } catch (Exception e2) {
                                        e = e2;
                                        BU bu2 = AbstractC0896dH.a;
                                        AbstractC0896dH.f("Repository", "persist failed: " + e.getMessage(), e);
                                        ((C0762bE) zd2).e(null);
                                        return c0782bY;
                                    }
                                    ((C0762bE) zd2).e(null);
                                    return c0782bY;
                                default:
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                    }
                    switch (i) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                r3 = c2069v6;
            }
        } catch (Throwable th4) {
            th = th4;
            r3 = obj;
        }
        r3 = new B4(this, abstractC2367ze);
        Object obj22 = r3.m;
        i = r3.f17o;
        int i72 = 4;
        c2069v6 = this.a;
        int i82 = 0;
        C0782bY c0782bY2 = C0782bY.a;
        EnumC0448Re enumC0448Re2 = EnumC0448Re.h;
    }
}
