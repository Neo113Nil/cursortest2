package com.onevcat.uniwebview.internal.obfuscated;

import android.webkit.ConsoleMessage;

/* loaded from: classes.dex */
public abstract /* synthetic */ class W {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
        iArr[ConsoleMessage.MessageLevel.DEBUG.ordinal()] = 1;
        iArr[ConsoleMessage.MessageLevel.LOG.ordinal()] = 2;
        iArr[ConsoleMessage.MessageLevel.WARNING.ordinal()] = 3;
        iArr[ConsoleMessage.MessageLevel.ERROR.ordinal()] = 4;
        iArr[ConsoleMessage.MessageLevel.TIP.ordinal()] = 5;
        a = iArr;
    }
}
