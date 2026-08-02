package com.meta.analytics.dsp.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0830Wf implements DW {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.meta.analytics.dsp.uinode.DW
    public final Metadata A51(E3 e3) {
        ByteBuffer byteBuffer = e3.A01;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C0470Hz c0470Hz = new C0470Hz(array, limit);
        String A0Q = c0470Hz.A0Q();
        String A0Q2 = c0470Hz.A0Q();
        long A0M = c0470Hz.A0M();
        return new Metadata(new EventMessage(A0Q, A0Q2, IF.A0F(c0470Hz.A0M(), 1000L, A0M), c0470Hz.A0M(), Arrays.copyOfRange(array, c0470Hz.A06(), limit), IF.A0F(c0470Hz.A0M(), 1000000L, A0M)));
    }
}
