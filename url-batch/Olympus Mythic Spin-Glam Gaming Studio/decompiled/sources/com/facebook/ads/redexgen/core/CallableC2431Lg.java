package com.facebook.ads.redexgen.core;

import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.facebook.ads.redexgen.X.Lg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC2431Lg implements Callable<Void> {
    public final File A00;
    public final /* synthetic */ AbstractC3457kr A01;

    public CallableC2431Lg(AbstractC3457kr abstractC3457kr, File file) {
        this.A01 = abstractC3457kr;
        this.A00 = file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Void call() throws Exception {
        this.A01.A06(this.A00);
        return null;
    }
}
