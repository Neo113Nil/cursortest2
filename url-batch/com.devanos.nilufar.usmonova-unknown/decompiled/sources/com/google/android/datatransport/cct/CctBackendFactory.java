package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import o.AbstractC0578We;
import o.C1938t7;
import o.C2033ua;
import o.InterfaceC2095vW;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory {
    public InterfaceC2095vW create(AbstractC0578We abstractC0578We) {
        C1938t7 c1938t7 = (C1938t7) abstractC0578We;
        return new C2033ua(c1938t7.a, c1938t7.b, c1938t7.c);
    }
}
