package com.meta.analytics.dsp.uinode;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;

/* loaded from: assets/audience_network.dex */
public abstract class W6 extends AbstractC0429Gj {
    public static String[] A01 = {"JXADnguvwbjBsYgslHoSHgr2xxMnawNn", "", "jNEAQ3UZ70aM1hHDYV2CS20ieNSkmYbb", "bnkACY5tQbsoiCdyBJgaOjSRI0w0kmrQ", "gVGuKveDeddXJzh5PaouiQlIwgfOoZnh", "qzMEUGGJ0FpDLYRljtzJ24rj8XT6rBKz", "LijUR", "ZVB7ZDT4TSe2rtQPBLBW6RwhtV59NTLq"};
    public C0424Ge A00;

    public abstract Pair<AB[], InterfaceC0426Gg[]> A0V(C0424Ge c0424Ge, int[][][] iArr, int[] iArr2) throws C02609c;

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x000b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A0Q(AA[] aaArr, TrackGroup trackGroup) throws C02609c {
        int formatSupportLevel = aaArr.length;
        int trackIndex = 0;
        for (int i = 0; i < bestRendererIndex; i++) {
            AA aa = aaArr[i];
            for (int bestFormatSupportLevel = 0; bestFormatSupportLevel < bestRendererIndex; bestFormatSupportLevel++) {
                int bestRendererIndex = aa.AGe(trackGroup.A01(bestFormatSupportLevel));
                int bestRendererIndex2 = bestRendererIndex & 7;
                if (bestRendererIndex2 > trackIndex) {
                    formatSupportLevel = i;
                    trackIndex = bestRendererIndex2;
                    if (trackIndex == 4) {
                        return formatSupportLevel;
                    }
                }
            }
        }
        return formatSupportLevel;
    }

    public static int[] A0R(AA aa, TrackGroup trackGroup) throws C02609c {
        int[] iArr = new int[trackGroup.A01];
        for (int i = 0; i < trackGroup.A01; i++) {
            iArr[i] = aa.AGe(trackGroup.A01(i));
        }
        return iArr;
    }

    public static int[] A0S(AA[] aaArr) throws C02609c {
        int[] iArr = new int[aaArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = aaArr[i].AGg();
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r3 == r8) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        r2 = new int[r4.A01];
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        r8 = r13[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        if (com.meta.analytics.dsp.uinode.W6.A01[4].charAt(3) == 'u') goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        r2 = A0R(r8, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        com.meta.analytics.dsp.uinode.W6.A01[1] = "";
        r2 = A0R(r8, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
    
        if (r3 == r8) goto L17;
     */
    @Override // com.meta.analytics.dsp.uinode.AbstractC0429Gj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0430Gk A0T(AA[] aaArr, TrackGroupArray trackGroupArray) throws C02609c {
        int[] rendererTrackGroupCounts;
        int[] iArr = new int[aaArr.length + 1];
        TrackGroup[][] trackGroupArr = new TrackGroup[aaArr.length + 1][];
        int[][][] iArr2 = new int[aaArr.length + 1][][];
        for (int i = 0; i < trackGroupArr.length; i++) {
            trackGroupArr[i] = new TrackGroup[trackGroupArray.A01];
            iArr2[i] = new int[trackGroupArray.A01][];
            if (A01[2].charAt(17) != 'V') {
                throw new RuntimeException();
            }
            A01[1] = "";
        }
        int[] A0S = A0S(aaArr);
        for (int rendererIndex = 0; rendererIndex < trackGroupArray.A01; rendererIndex++) {
            TrackGroup A012 = trackGroupArray.A01(rendererIndex);
            int A0Q = A0Q(aaArr, A012);
            int length = aaArr.length;
            if (A01[4].charAt(3) != 'u') {
                A01[6] = "flHuZy9qfiSfYNp536tqdaojA4";
            } else {
                String[] strArr = A01;
                strArr[7] = "D4rc1OneeydPNAn3BWDV4yQ6n9XdhHzA";
                strArr[3] = "1lNTPVAxZlA71NpHB66K3LVNnVnwQcNq";
            }
            int i2 = iArr[A0Q];
            trackGroupArr[A0Q][i2] = A012;
            iArr2[A0Q][i2] = rendererTrackGroupCounts;
            iArr[A0Q] = iArr[A0Q] + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[aaArr.length];
        int[] iArr3 = new int[aaArr.length];
        for (int i3 = 0; i3 < aaArr.length; i3++) {
            int i4 = iArr[i3];
            trackGroupArrayArr[i3] = new TrackGroupArray((TrackGroup[]) IF.A0k(trackGroupArr[i3], i4));
            iArr2[i3] = (int[][]) IF.A0k(iArr2[i3], i4);
            iArr3[i3] = aaArr[i3].A8C();
        }
        C0424Ge c0424Ge = new C0424Ge(iArr3, trackGroupArrayArr, A0S, iArr2, new TrackGroupArray((TrackGroup[]) IF.A0k(trackGroupArr[aaArr.length], iArr[aaArr.length])));
        Pair<AB[], InterfaceC0426Gg[]> A0V = A0V(c0424Ge, iArr2, A0S);
        return new C0430Gk((AB[]) A0V.first, (InterfaceC0426Gg[]) A0V.second, c0424Ge);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC0429Gj
    public final void A0U(Object obj) {
        this.A00 = (C0424Ge) obj;
    }
}
