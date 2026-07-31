package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﯨ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1227 extends AbstractC1100 {
    static {
        StringFog.decrypt("lIZ7n9x/z2KZmn+cxH8=\n", "9/Qe/qganRc=\n");
        StringFog.decrypt("61lWla0Yz973eFCopjTK\n", "mSw42sNVrrc=\n");
        StringFog.decrypt("mlu+UcO2Nq6DWplN/r0aqw==\n", "6jTNJYzYe88=\n");
        StringFog.decrypt("+5faX9KspBLync1k+ISpGuWswVnzqKw=\n", "i/ipK5bJyHM=\n");
        StringFog.decrypt("kLRfKlYGn0mMpFIRVzekT5CkUAE=\n", "4sExZThF8Cc=\n");
        StringFog.decrypt("Q2d7Xt3Zr1NdZm1J5tieaFt6bUv2\n", "MwgIKpK37Dw=\n");
        StringFog.decrypt("UwBFSanvPEtaClJyg8k/RE0KVUmC+ARCUQpXWQ==\n", "I282Pe2KUCo=\n");
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static void m4481(C0880 c0880, C0785 c0785, ArrayList arrayList) {
        AbstractC1026.m4312(m4488(c0880, c0785, arrayList));
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static void m4482(C0880 c0880, C0785 c0785, ArrayList arrayList) {
        AbstractC1026.m4313(m4488(c0880, c0785, arrayList));
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m4483(C0880 c0880, C0785 c0785, ArrayList arrayList) {
        AbstractC1026.m4314(m4488(c0880, c0785, arrayList));
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m4484(C0880 c0880, C0785 c0785, ArrayList arrayList) {
        AbstractC1026.m4316(m4488(c0880, c0785, arrayList));
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m4485(C0880 c0880, C0785 c0785, ArrayList arrayList) {
        AbstractC1026.m4315(m4488(c0880, c0785, arrayList), m4487(arrayList));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m4486(C0880 c0880, C0785 c0785, ArrayList arrayList) {
        AbstractC1026.m4317(m4488(c0880, c0785, arrayList), m4487(arrayList));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static AbstractRunnableC0913 m4488(C0880 c0880, C0785 c0785, ArrayList arrayList) {
        try {
            if (AbstractC1100.m4400(arrayList, 0, AbstractRunnableC0913.class)) {
                return (AbstractRunnableC0913) AbstractC1100.m4401(arrayList, 0, AbstractRunnableC0913.class);
            }
            return new C1239(arrayList.size() > 2 ? AbstractC1100.m4402(arrayList, 2) : AbstractC1100.m4402(arrayList, 1), (C1064) AbstractC1100.m4401(arrayList, 0, C1064.class), c0785, c0880);
        } catch (Exception e) {
            AbstractC0844.m4219(c0880.m4231(), StringFog.decrypt("mmhZkmMmaay6e1+Uf2Eqs7puQ5J1JnirsXRKn31j\n", "3xor/REGCt4=\n"), e, null);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static long m4487(ArrayList arrayList) {
        int intValue;
        if (arrayList.size() > 1 && AbstractC1100.m4400(arrayList, 1, Integer.class)) {
            intValue = ((Integer) AbstractC1100.m4401(arrayList, 1, Integer.class)).intValue();
        } else {
            if (arrayList.size() <= 2) {
                return 0L;
            }
            intValue = ((Integer) AbstractC1100.m4401(arrayList, 2, Integer.class)).intValue();
        }
        return intValue;
    }
}
