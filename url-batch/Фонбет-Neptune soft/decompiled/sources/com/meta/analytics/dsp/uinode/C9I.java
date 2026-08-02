package com.meta.analytics.dsp.uinode;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.9I, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9I extends QS {
    public int A00;
    public boolean A01;
    public final AbstractC02518s<C9H> A02;
    public final AbstractC02518s<AnonymousClass98> A03;
    public final AbstractC02518s<O8> A04;
    public final AbstractC02518s<AnonymousClass93> A05;
    public final AbstractC02518s<C0585Mr> A06;
    public final AbstractC02518s<C0573Mf> A07;
    public final AbstractC02518s<C0568Ma> A08;
    public final AbstractC02518s<MU> A09;
    public final AbstractC02518s<C0562Lu> A0A;
    public final SA A0B;
    public final NX A0C;
    public final MV A0D;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C9I(C0889Yn c0889Yn, J2 j2, SA sa, List<C2P> list, String str) {
        super(c0889Yn, j2, sa, list, str, !sa.A0h(), new QR(c0889Yn, sa));
        MV mv = new MV() { // from class: com.facebook.ads.redexgen.X.9J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC02518s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MW mw) {
                C9I.this.A0a();
            }
        };
        this.A0D = mv;
        S7 s7 = new S7(this);
        this.A07 = s7;
        S3 s3 = new S3(this);
        this.A03 = s3;
        RH rh = new RH(this);
        this.A04 = rh;
        RA ra = new RA(this);
        this.A05 = ra;
        C0675Qd c0675Qd = new C0675Qd(this);
        this.A02 = c0675Qd;
        C0674Qc c0674Qc = new C0674Qc(this);
        this.A06 = c0674Qc;
        C0672Qa c0672Qa = new C0672Qa(this);
        this.A09 = c0672Qa;
        QV qv = new QV(this);
        this.A0A = qv;
        S9 s9 = new S9(this);
        this.A08 = s9;
        NX nx = new NX() { // from class: com.facebook.ads.redexgen.X.9K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC02518s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0607Nn c0607Nn) {
                SA sa2;
                C9I c9i = C9I.this;
                sa2 = c9i.A0B;
                c9i.A00 = sa2.getDuration();
            }
        };
        this.A0C = nx;
        this.A01 = false;
        this.A0B = sa;
        sa.getEventBus().A03(mv, ra, s7, rh, s3, c0675Qd, c0674Qc, c0672Qa, qv, nx, s9);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C9I(C0889Yn c0889Yn, J2 j2, SA sa, List<C2P> list, String str, Bundle bundle, Map<String, String> map) {
        super(c0889Yn, j2, sa, list, str, !sa.A0h(), bundle, map, new QR(c0889Yn, sa));
        MV mv = new MV() { // from class: com.facebook.ads.redexgen.X.9J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC02518s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MW mw) {
                C9I.this.A0a();
            }
        };
        this.A0D = mv;
        S7 s7 = new S7(this);
        this.A07 = s7;
        S3 s3 = new S3(this);
        this.A03 = s3;
        RH rh = new RH(this);
        this.A04 = rh;
        RA ra = new RA(this);
        this.A05 = ra;
        C0675Qd c0675Qd = new C0675Qd(this);
        this.A02 = c0675Qd;
        C0674Qc c0674Qc = new C0674Qc(this);
        this.A06 = c0674Qc;
        C0672Qa c0672Qa = new C0672Qa(this);
        this.A09 = c0672Qa;
        QV qv = new QV(this);
        this.A0A = qv;
        S9 s9 = new S9(this);
        this.A08 = s9;
        this.A0C = new NX() { // from class: com.facebook.ads.redexgen.X.9K
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meta.analytics.dsp.uinode.AbstractC02518s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0607Nn c0607Nn) {
                SA sa2;
                C9I c9i = C9I.this;
                sa2 = c9i.A0B;
                c9i.A00 = sa2.getDuration();
            }
        };
        this.A01 = false;
        this.A0B = sa;
        sa.getEventBus().A03(mv, ra, s7, rh, s3, c0675Qd, c0674Qc, c0672Qa, qv, s9);
    }

    public C9I(C0889Yn c0889Yn, J2 j2, SA sa, String str) {
        this(c0889Yn, j2, sa, new ArrayList(), str);
    }

    public C9I(C0889Yn c0889Yn, J2 j2, SA sa, String str, Bundle bundle) {
        this(c0889Yn, j2, sa, new ArrayList(), str, bundle, null);
    }

    public C9I(C0889Yn c0889Yn, J2 j2, SA sa, String str, Map<String, String> extraParams) {
        this(c0889Yn, j2, sa, new ArrayList(), str, null, extraParams);
    }

    public final void A0i() {
        S8 s8 = new S8(this);
        if (this.A0B.A0l()) {
            ExecutorC0550Li.A00(s8);
        } else {
            this.A0B.getStateHandler().post(s8);
        }
    }
}
