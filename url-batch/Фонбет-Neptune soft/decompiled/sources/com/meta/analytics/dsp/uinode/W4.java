package com.meta.analytics.dsp.uinode;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class W4 implements InterfaceC0440Gu {
    public static byte[] A07;
    public static String[] A08 = {"LByWpbEPJA", "7zBd1gTQe", "KuygTrv8nulqhNSWOngA1uKtSEuZHgRN", "Njgdt1gsnhQwK4o", "BeNPg2roj36bAWsP0", "RQRmVWofVgKwOSOG8v2k1lAFTXU782LE", "P3wGsXlJvJ2cmEHDxz1oaqJg", "cQN91p4HTGgxD32"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public FileInputStream A03;
    public boolean A04;
    public final ContentResolver A05;
    public final HG<? super W4> A06;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{77, 97, 123, 98, 106, 46, 96, 97, 122, 46, 97, 126, 107, 96, 46, 104, 103, 98, 107, 46, 106, 107, 125, 109, 124, 103, 126, 122, 97, 124, 46, 104, 97, 124, 52, 46, 88};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final long ADl(C0444Gy c0444Gy) throws C0436Gq {
        try {
            Uri uri = c0444Gy.A04;
            this.A02 = uri;
            AssetFileDescriptor openAssetFileDescriptor = this.A05.openAssetFileDescriptor(uri, A00(36, 1, 66));
            this.A01 = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new FileNotFoundException(A00(0, 36, 102) + this.A02);
            }
            this.A03 = new FileInputStream(this.A01.getFileDescriptor());
            long startOffset = this.A01.getStartOffset();
            long skip = this.A03.skip(c0444Gy.A03 + startOffset) - startOffset;
            if (skip != c0444Gy.A03) {
                throw new EOFException();
            }
            if (c0444Gy.A02 != -1) {
                this.A00 = c0444Gy.A02;
            } else {
                long length = this.A01.getLength();
                if (length == -1) {
                    FileChannel channel = this.A03.getChannel();
                    long size = channel.size();
                    this.A00 = size != 0 ? size - channel.position() : -1L;
                } else {
                    this.A00 = length - skip;
                }
            }
            this.A04 = true;
            HG<? super W4> hg = this.A06;
            if (hg != null) {
                hg.ADP(this, c0444Gy);
            }
            return this.A00;
        } catch (IOException e) {
            throw new C0436Gq(e);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HG != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.ContentDataSource> */
    public W4(Context context, HG<? super W4> hg) {
        this.A05 = context.getContentResolver();
        this.A06 = hg;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final Uri A8E() {
        return this.A02;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    public final void close() throws C0436Gq {
        this.A02 = null;
        try {
            try {
                FileInputStream fileInputStream = this.A03;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.A03 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.A01;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C0436Gq(e);
                    }
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        HG<? super W4> hg = this.A06;
                        if (hg != null) {
                            hg.ADO(this);
                        }
                    }
                }
            } catch (Throwable th) {
                this.A03 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.A01;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.A01 = null;
                        if (this.A04) {
                            this.A04 = false;
                            HG<? super W4> hg2 = this.A06;
                            if (hg2 != null) {
                                hg2.ADO(this);
                            }
                        }
                        throw th;
                    } finally {
                        this.A01 = null;
                        if (this.A04) {
                            this.A04 = false;
                            HG<? super W4> hg3 = this.A06;
                            if (hg3 != null) {
                                hg3.ADO(this);
                            }
                        }
                    }
                } catch (IOException e2) {
                    throw new C0436Gq(e2);
                }
            }
        } catch (IOException e3) {
            throw new C0436Gq(e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        if (r2 != (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        r8.A00 = r2 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        r3 = r8.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (com.meta.analytics.dsp.uinode.W4.A08[4].length() == 17) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        com.meta.analytics.dsp.uinode.W4.A08[0] = "Oz3XLfSc2A979xkKdF0NMgeVRm8";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        if (r3 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        r3.AB1(r8, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        r2 = com.meta.analytics.dsp.uinode.W4.A08;
        r2[1] = "uqZ1tM2xm";
        r2[6] = "4bkl7P4p23vj4jNsoeIfag2n";
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        if (r3 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
    
        if (r2 != (-1)) goto L28;
     */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0440Gu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(byte[] bArr, int i, int i2) throws C0436Gq {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C0436Gq(e);
            }
        }
        int read = this.A03.read(bArr, i, i2);
        if (read == -1) {
            long j2 = this.A00;
            String[] strArr = A08;
            String str = strArr[3];
            String str2 = strArr[7];
            int length = str.length();
            int bytesRead = str2.length();
            if (length != bytesRead) {
                throw new RuntimeException();
            }
            A08[0] = "iixlGiSV2y9Sj4FhSzJ8n8KndyylS";
            if (j2 == -1) {
                return -1;
            }
            throw new C0436Gq(new EOFException());
        }
        long j3 = this.A00;
        if (A08[0].length() != 5) {
            A08[0] = "YPxf1aEs9O2Lc7g4LGclNCu";
        }
    }
}
