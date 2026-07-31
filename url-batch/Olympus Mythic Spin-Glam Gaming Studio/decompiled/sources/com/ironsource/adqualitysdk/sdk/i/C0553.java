package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.т, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0553 extends AbstractC1100 {
    static {
        StringFog.decrypt("+cuA1MgYXkHN2ob7zw0=\n", "nq70kqFqLTU=\n");
        StringFog.decrypt("auNCT7zCaVdo40RGjMJccHz4S0qt1Q==\n", "CZEnLsinOjI=\n");
        StringFog.decrypt("EWGL65EFUEkC\n", "dgT/pPNvNSo=\n");
        StringFog.decrypt("PDiV4ha29x8vLg==\n", "W13hrXTcknw=\n");
        StringFog.decrypt("CRzfcaNXIOcaP8JbrVk=\n", "bnmrPsE9RYQ=\n");
        StringFog.decrypt("x99k01hgHb7U7HHwT28=\n", "oLoQnDoKeN0=\n");
        StringFog.decrypt("SbNRVxlbtQVakEx9F1Wj\n", "LtYlGHsx0GY=\n");
        StringFog.decrypt("rJ0PaypNPCO/rhpIPUIq\n", "y/h7JEgnWUA=\n");
        StringFog.decrypt("3xGxIGCI1Cj8Eb0wdbrUP9EauA==\n", "uHTfRRLpoE0=\n");
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static ArrayList m4049(ArrayList arrayList) {
        Object m4401;
        C1084 c1084;
        Class<?> cls;
        int size = arrayList.size();
        Class<?> cls2 = null;
        cls2 = null;
        Object m44012 = null;
        if (size == 2) {
            if (arrayList.get(0) instanceof Class) {
                cls2 = (Class) AbstractC1100.m4401(arrayList, 0, Class.class);
                m4401 = null;
            } else {
                m4401 = AbstractC1100.m4401(arrayList, 0, Object.class);
                if (m4401 != null) {
                    cls2 = m4401.getClass();
                }
            }
            c1084 = (C1084) AbstractC1100.m4401(arrayList, 1, C1084.class);
        } else if (size != 3) {
            c1084 = null;
            m4401 = null;
        } else {
            if (arrayList.get(0) instanceof Class) {
                cls = (Class) AbstractC1100.m4401(arrayList, 0, Class.class);
                if (arrayList.get(1) instanceof C1084) {
                    c1084 = (C1084) AbstractC1100.m4401(arrayList, 1, C1084.class);
                } else {
                    m44012 = AbstractC1100.m4401(arrayList, 1, Object.class);
                    c1084 = (C1084) AbstractC1100.m4401(arrayList, 2, C1084.class);
                }
            } else {
                m44012 = AbstractC1100.m4401(arrayList, 0, Object.class);
                cls = m44012.getClass();
                c1084 = (C1084) AbstractC1100.m4401(arrayList, 1, C1084.class);
            }
            Object obj = m44012;
            cls2 = cls;
            m4401 = obj;
        }
        C0568 c0568 = C0860.m4221().f2085;
        c0568.getClass();
        ArrayList arrayList2 = new ArrayList();
        try {
            C1082 c1082 = C0860.m4221().f2086;
            ArrayList arrayList3 = new ArrayList();
            c1082.m4371(cls2, c1084, arrayList3);
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Field) it.next()).get(m4401));
            }
        } catch (Throwable unused) {
            AbstractC0580.m4072(c0568.f952, StringFog.decrypt("gPoQAxCQiVCx/AsCBZA=\n", "xYhibGKw7jU=\n") + c1084.f2744 + StringFog.decrypt("ziWcIlVppjWBPMU=\n", "7lHlUjBJwEc=\n") + cls2 + StringFog.decrypt("Wldnklvj\n", "ejQL8yiQv7k=\n"));
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b2 A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #0 {all -> 0x00b9, blocks: (B:10:0x00a6, B:12:0x00b2), top: B:9:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b7  */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m4050(ArrayList arrayList) {
        Object obj;
        Class<?> cls;
        C1084 c1084;
        Object obj2;
        C0568 c0568;
        int size = arrayList.size();
        try {
            if (size != 2) {
                if (size != 3) {
                    if (size != 4) {
                        obj2 = null;
                        cls = null;
                        obj = null;
                        c1084 = null;
                    } else {
                        cls = (Class) AbstractC1100.m4401(arrayList, 0, Class.class);
                        obj = AbstractC1100.m4401(arrayList, 1, Object.class);
                        c1084 = (C1084) AbstractC1100.m4401(arrayList, 2, C1084.class);
                        obj2 = AbstractC1100.m4401(arrayList, 3, Object.class);
                    }
                } else if (arrayList.get(0) instanceof Class) {
                    cls = (Class) AbstractC1100.m4401(arrayList, 0, Class.class);
                    if (arrayList.get(1) instanceof C1084) {
                        c1084 = (C1084) AbstractC1100.m4401(arrayList, 1, C1084.class);
                        obj2 = AbstractC1100.m4401(arrayList, 2, Object.class);
                        obj = null;
                    } else {
                        obj = AbstractC1100.m4401(arrayList, 1, Object.class);
                        c1084 = (C1084) AbstractC1100.m4401(arrayList, 2, C1084.class);
                    }
                } else {
                    obj = AbstractC1100.m4401(arrayList, 0, Object.class);
                    cls = obj.getClass();
                    c1084 = (C1084) AbstractC1100.m4401(arrayList, 1, C1084.class);
                    obj2 = AbstractC1100.m4401(arrayList, 2, Object.class);
                }
                c0568 = C0860.m4221().f2085;
                c0568.getClass();
                Field m4369 = C0860.m4221().f2086.m4369(cls, c1084);
                return m4369 == null ? m4369.get(obj) : obj2;
            }
            if (arrayList.get(0) instanceof Class) {
                cls = (Class) AbstractC1100.m4401(arrayList, 0, Class.class);
                obj = null;
            } else {
                Object m4401 = AbstractC1100.m4401(arrayList, 0, Object.class);
                if (m4401 != null) {
                    obj = m4401;
                    cls = m4401.getClass();
                } else {
                    obj = m4401;
                    cls = null;
                }
            }
            c1084 = (C1084) AbstractC1100.m4401(arrayList, 1, C1084.class);
            Field m43692 = C0860.m4221().f2086.m4369(cls, c1084);
            if (m43692 == null) {
            }
        } catch (Throwable unused) {
            AbstractC0580.m4072(c0568.f952, StringFog.decrypt("DBZH/Wj4cyA9EFz8ffg=\n", "SWQ1khrYFEU=\n") + c1084.f2744 + StringFog.decrypt("4/OaaDLoU4Ks6sM=\n", "w4fjGFfINfA=\n") + cls + StringFog.decrypt("kX5jiPhQ\n", "sR0P6YsjRM4=\n"));
            return null;
        }
        obj2 = null;
        c0568 = C0860.m4221().f2085;
        c0568.getClass();
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static ArrayList m4052(C0880 c0880, C0785 c0785, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = m4056(c0880, c0785, arrayList).iterator();
        while (it.hasNext()) {
            InterfaceC0858 interfaceC0858 = (InterfaceC0858) it.next();
            if (interfaceC0858 != null) {
                arrayList2.add(((C0658) interfaceC0858).m4133());
            }
        }
        return arrayList2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Object m4053(C0880 c0880, C0785 c0785, ArrayList arrayList) {
        InterfaceC0858 interfaceC0858;
        Object m4401 = AbstractC1100.m4401(arrayList, 0, Object.class);
        C1126 c1126 = (C1126) AbstractC1100.m4401(arrayList, 1, C1126.class);
        List m4402 = AbstractC1100.m4402(arrayList, 2);
        if (c1126 != null) {
            interfaceC0858 = C0860.m4221().f2085.m4062(m4401, c1126.f2876.m4132(new C0564(c1126, c0785, c0880, m4402), null, c1126.f2874, c1126.f2873));
        } else {
            interfaceC0858 = null;
        }
        if (interfaceC0858 != null) {
            return ((C0658) interfaceC0858).m4133();
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static C1197 m4055(ArrayList arrayList) {
        return new C1197((List) AbstractC1100.m4401(arrayList, 0, List.class), ((Integer) AbstractC1100.m4401(arrayList, 1, Integer.class)).intValue());
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m4056(C0880 c0880, C0785 c0785, ArrayList arrayList) {
        Object m4401 = AbstractC1100.m4401(arrayList, 0, Object.class);
        C1126 c1126 = (C1126) AbstractC1100.m4401(arrayList, 1, C1126.class);
        List m4402 = AbstractC1100.m4402(arrayList, 2);
        if (c1126 == null) {
            return null;
        }
        C0628 m4132 = c1126.f2876.m4132(new C0555(c1126, c0785, c0880, m4402), null, c1126.f2874, c1126.f2873);
        C0568 c0568 = C0860.m4221().f2085;
        c0568.getClass();
        C0612 c0612 = new C0612(m4132);
        c0612.f1113 = true;
        c0568.m4061(m4401, c0612, 0, (C0658) null);
        return new ArrayList(c0612.f1111);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static String m4051(ArrayList arrayList) {
        int i = 0;
        if (arrayList.get(0) instanceof Class) {
            Class cls = (Class) AbstractC1100.m4401(arrayList, 0, Class.class);
            String str = (String) AbstractC1100.m4401(arrayList, 1, String.class);
            C0860.m4221().f2085.getClass();
            return C0568.m4057((Object) null, cls, str);
        }
        Object m4401 = AbstractC1100.m4401(arrayList, 0, Object.class);
        if (arrayList.get(1) instanceof List) {
            JSONArray jSONArray = new JSONArray((Collection) AbstractC1100.m4401(arrayList, 1, List.class));
            C0860.m4221().f2085.getClass();
            while (i < jSONArray.length()) {
                String m4057 = C0568.m4057(m4401, m4401.getClass(), jSONArray.optString(i));
                if (m4057 != null) {
                    return m4057;
                }
                i++;
            }
            return null;
        }
        if (arrayList.get(1) instanceof JSONArray) {
            JSONArray jSONArray2 = (JSONArray) AbstractC1100.m4401(arrayList, 1, JSONArray.class);
            C0860.m4221().f2085.getClass();
            if (jSONArray2 == null) {
                return null;
            }
            while (i < jSONArray2.length()) {
                String m40572 = C0568.m4057(m4401, m4401.getClass(), jSONArray2.optString(i));
                if (m40572 != null) {
                    return m40572;
                }
                i++;
            }
            return null;
        }
        String str2 = (String) AbstractC1100.m4401(arrayList, 1, String.class);
        C0860.m4221().f2085.getClass();
        return C0568.m4057(m4401, m4401.getClass(), str2);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static String m4054(ArrayList arrayList) {
        Object m4401 = AbstractC1100.m4401(arrayList, 0, Object.class);
        List list = (List) AbstractC1100.m4401(arrayList, 1, List.class);
        int intValue = ((Integer) AbstractC1100.m4401(arrayList, 2, Integer.class)).intValue();
        C0860.m4221().f2085.getClass();
        return new C0646(list, intValue).m4127(m4401);
    }
}
