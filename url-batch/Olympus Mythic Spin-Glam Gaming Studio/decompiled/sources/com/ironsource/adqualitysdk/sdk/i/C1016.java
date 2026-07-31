package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1016 extends AbstractC1100 {
    static {
        StringFog.decrypt("KqtF\n", "R8o1YX4VULA=\n");
        StringFog.decrypt("Lw8xFSyJsA==\n", "SWBDUE3q2JY=\n");
        StringFog.decrypt("dUQUnXec\n", "Ey146RLuBS0=\n");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b A[Catch: Exception -> 0x0038, TRY_LEAVE, TryCatch #0 {Exception -> 0x0038, blocks: (B:3:0x000b, B:5:0x0020, B:7:0x0026, B:9:0x0033, B:10:0x003f, B:11:0x0045, B:13:0x004b, B:19:0x003a), top: B:2:0x000b }] */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m4298(C0880 c0880, ArrayList arrayList) {
        C0880 c08802;
        int i;
        List list = (List) AbstractC1100.m4401(arrayList, 0, List.class);
        try {
            C1064 c1064 = (C1064) AbstractC1100.m4401(arrayList, 1, C1064.class);
            List arrayList2 = new ArrayList();
            if (arrayList.size() > 2) {
                if (AbstractC1100.m4400(arrayList, 2, C0880.class)) {
                    c08802 = (C0880) AbstractC1100.m4401(arrayList, 2, C0880.class);
                    if (arrayList.size() > 3) {
                        arrayList2 = AbstractC1100.m4402(arrayList, 3);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (i = 0; i < list.size(); i++) {
                        arrayList2.add(0, list.get(i));
                        arrayList3.add(c1064.m4337(c08802.f2145, c08802, arrayList2).f2276);
                        arrayList2.remove(0);
                    }
                    return arrayList3;
                }
                arrayList2 = AbstractC1100.m4402(arrayList, 2);
            }
            c08802 = c0880;
            ArrayList arrayList32 = new ArrayList();
            while (i < list.size()) {
            }
            return arrayList32;
        } catch (Exception e) {
            AbstractC0844.m4219(c0880.m4231(), StringFog.decrypt("lIVxeXCOQKm/mWp4ZY5fvaHYZXlw61O/uddseCLCW6+l\n", "0fcDFgKuMtw=\n"), e, null);
            return list;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m4299(C0880 c0880, ArrayList arrayList) {
        m4298(c0880, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:3:0x000b, B:5:0x0020, B:7:0x0026, B:9:0x0033, B:10:0x003f, B:11:0x0045, B:13:0x004b, B:15:0x005e, B:16:0x0065, B:22:0x003a), top: B:2:0x000b }] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m4300(C0880 c0880, ArrayList arrayList) {
        C0880 c08802;
        int i;
        List list = (List) AbstractC1100.m4401(arrayList, 0, List.class);
        try {
            C1064 c1064 = (C1064) AbstractC1100.m4401(arrayList, 1, C1064.class);
            List arrayList2 = new ArrayList();
            if (arrayList.size() > 2) {
                if (AbstractC1100.m4400(arrayList, 2, C0880.class)) {
                    c08802 = (C0880) AbstractC1100.m4401(arrayList, 2, C0880.class);
                    if (arrayList.size() > 3) {
                        arrayList2 = AbstractC1100.m4402(arrayList, 3);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (i = 0; i < list.size(); i++) {
                        arrayList2.add(0, list.get(i));
                        if (c1064.m4337(c08802.f2145, c08802, arrayList2).m4250()) {
                            arrayList3.add(list.get(i));
                        }
                        arrayList2.remove(0);
                    }
                    return arrayList3;
                }
                arrayList2 = AbstractC1100.m4402(arrayList, 2);
            }
            c08802 = c0880;
            ArrayList arrayList32 = new ArrayList();
            while (i < list.size()) {
            }
            return arrayList32;
        } catch (Exception e) {
            AbstractC0844.m4219(c0880.m4231(), StringFog.decrypt("puVNYfQ1QoSN+VZg4TVWmI/jWnymel7Rj/5Meg==\n", "45c/DoYVMPE=\n"), e, null);
            return list;
        }
    }
}
