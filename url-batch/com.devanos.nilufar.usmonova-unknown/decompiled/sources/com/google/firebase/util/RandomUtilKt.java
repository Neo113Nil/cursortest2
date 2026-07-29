package com.google.firebase.util;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import o.AbstractC0048Bt;
import o.AbstractC0720ac;
import o.AbstractC0786bc;
import o.AbstractC1807r8;
import o.AbstractC1952tL;
import o.AbstractC2188wx;
import o.C1131gt;
import o.C1197ht;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0006\u001a\u00020\u00038\u0002X\u0082T¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo/tL;", "", "length", "", "nextAlphanumericString", "(Lo/tL;I)Ljava/lang/String;", "ALPHANUMERIC_ALPHABET", "Ljava/lang/String;", "getALPHANUMERIC_ALPHABET$annotations", "()V", "com.google.firebase-firebase-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RandomUtilKt {
    private static final String ALPHANUMERIC_ALPHABET = "23456789abcdefghjkmnpqrstvwxyz";

    private static /* synthetic */ void getALPHANUMERIC_ALPHABET$annotations() {
    }

    public static final String nextAlphanumericString(AbstractC1952tL abstractC1952tL, int i) {
        AbstractC0048Bt.n(abstractC1952tL, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC2188wx.g(i, "invalid length: ").toString());
        }
        C1197ht c0 = AbstractC1807r8.c0(0, i);
        ArrayList arrayList = new ArrayList(AbstractC0786bc.d0(c0));
        Iterator it = c0.iterator();
        while (((C1131gt) it).j) {
            ((C1131gt) it).nextInt();
            arrayList.add(Character.valueOf(ALPHANUMERIC_ALPHABET.charAt(abstractC1952tL.a(30))));
        }
        return AbstractC0720ac.t0(arrayList, "", null, null, null, 62);
    }
}
