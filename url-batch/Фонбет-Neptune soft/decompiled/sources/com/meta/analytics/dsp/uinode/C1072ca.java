package com.meta.analytics.dsp.uinode;

import android.view.View;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.ca, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1072ca<ModelType, StateType> {
    public static byte[] A06;
    public static String[] A07 = {"K3IBH5IY5D9A1s0otTNJJ1EDvo1qLs", "HR7iyfZ1MOS5huP42RSdRpCkeBunQMOf", "", "bEqFTGguyIKgMYqaAFudqvCpFKGvMgpm", "3wGEEC73gwsSkVWXWqLxZk", "wIAJ3aMEmj6qTKsV0aDgjtipvoJzkW0C", "SCvpsyQDnQo4JnEbtI83SB", "GSqpB1BwT3x"};
    public static final C1072ca A08;
    public boolean A00;
    public final C1072ca A01;
    public final ModelType A02;
    public final StateType A03;
    public final String A04;
    public final List<InterfaceC1075cd<ModelType, StateType>> A05;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{66, 85, 81, 99, 92, 91, 85, 90, 96, 48, 77, 96, 77, Ascii.FF, 95, 84, 91, 97, 88, 80, Ascii.FF, 90, 91, 96, Ascii.FF, 79, 91, 90, 96, 77, 85, 90, Ascii.FF, 77, Ascii.FF, 98, 85, 81, 99, Ascii.FF, 77, 95, Ascii.FF, 89, 91, 80, 81, 88, 0, 8, Ascii.VT, Ascii.SI, Ascii.DC4};
    }

    static {
        A02();
        A08 = new C1072ca(null, null, A01(48, 5, 42), Collections.emptyList(), A08);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cb != com.instagram.common.viewpoint.core.ViewpointData$Builder<ModelType, StateType> */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1072ca(C1073cb<ModelType, StateType> c1073cb) {
        this(r1, r2, r3, r4, r5);
        Object obj;
        Object obj2;
        String str;
        List list;
        List list2;
        C1072ca c1072ca;
        obj = c1073cb.A02;
        obj2 = c1073cb.A03;
        str = c1073cb.A04;
        list = c1073cb.A01;
        if (list == null) {
            list2 = Collections.emptyList();
        } else {
            list2 = c1073cb.A01;
        }
        c1072ca = c1073cb.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public C1072ca(ModelType modeltype, StateType statetype, String str, List<InterfaceC1075cd<ModelType, StateType>> list, C1072ca c1072ca) {
        if (!(modeltype instanceof View)) {
            this.A02 = modeltype;
            this.A03 = statetype;
            this.A04 = str;
            this.A01 = c1072ca;
            this.A00 = false;
            this.A05 = list;
            return;
        }
        throw new IllegalArgumentException(A01(0, 48, 123));
    }

    public static <ModelType, StateType> C1073cb<ModelType, StateType> A00(ModelType model, StateType state, String str) {
        return new C1073cb<>(model, state, str);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cd != com.instagram.common.viewpoint.core.ViewpointAction<ModelType, StateType> */
    public final void A03(InterfaceC1062cP interfaceC1062cP) {
        Iterator<InterfaceC1075cd<ModelType, StateType>> it = this.A05.iterator();
        while (it.hasNext()) {
            it.next().A5c(this, interfaceC1062cP);
        }
        EnumC1063cQ A8J = interfaceC1062cP.A8J(this);
        String[] strArr = A07;
        if (strArr[1].charAt(23) == strArr[3].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[7] = "xMDdEaQw2xH";
        strArr2[2] = "";
        if (A8J == EnumC1063cQ.A02) {
            this.A00 = true;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<ModelType, StateType> */
    public final boolean A04() {
        return this.A00;
    }
}
