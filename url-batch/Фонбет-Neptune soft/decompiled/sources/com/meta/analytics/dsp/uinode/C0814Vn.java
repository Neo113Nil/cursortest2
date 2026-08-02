package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Vn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0814Vn implements InterfaceC0440Gu {
    public static String[] A04 = {"X6WlBdbGeBIUy9RcgyD1kPyvMH5gl65h", "mWixtdhRvEEOtO49Z6LrUITCnd", "19dVuEeyHaOsnSLi", "Fh0FDziHvuuc46M8RjDn", "TMNOdV", "BntQd7XboiQ5Pp5LCDj1cbVKSXS32D1x", "NrlP0Z8V9f9J6rKzzcCufZh8yiDjfbRh", "BOidXQkRBMfwkg7VYmAkrOpgeHcKVKv0"};
    public long A00;
    public boolean A01;
    public final InterfaceC0438Gs A02;
    public final InterfaceC0440Gu A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final long ADl(C0444Gy c0444Gy) throws IOException {
        long ADl = this.A03.ADl(c0444Gy);
        this.A00 = ADl;
        if (ADl == 0) {
            return 0L;
        }
        if (c0444Gy.A02 == -1 && this.A00 != -1) {
            c0444Gy = new C0444Gy(c0444Gy.A04, c0444Gy.A01, c0444Gy.A03, this.A00, c0444Gy.A05, c0444Gy.A00);
        }
        this.A01 = true;
        this.A02.ADn(c0444Gy);
        return this.A00;
    }

    public C0814Vn(InterfaceC0440Gu interfaceC0440Gu, InterfaceC0438Gs interfaceC0438Gs) {
        this.A03 = (InterfaceC0440Gu) AbstractC0445Ha.A01(interfaceC0440Gu);
        this.A02 = (InterfaceC0438Gs) AbstractC0445Ha.A01(interfaceC0438Gs);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final Uri A8E() {
        return this.A03.A8E();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final void close() throws IOException {
        try {
            this.A03.close();
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        } catch (Throwable th) {
            boolean z = this.A01;
            if (A04[5].charAt(29) != 'a') {
                A04[1] = "CXpRjqYaQVmivrsYVOmY1oz";
                if (z) {
                    this.A01 = false;
                    InterfaceC0438Gs interfaceC0438Gs = this.A02;
                    if (A04[1].length() != 2) {
                        A04[5] = "FmRI3fMemMJaQGBcEYhbAky7hUfnuUR1";
                        interfaceC0438Gs.close();
                    }
                }
                throw th;
            }
            throw new RuntimeException();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.A03.read(bArr, i, i2);
        if (read > 0) {
            this.A02.write(bArr, i, read);
            long j = this.A00;
            if (j != -1) {
                this.A00 = j - read;
            }
        }
        return read;
    }
}
