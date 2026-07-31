package yads;

import android.net.Uri;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class sd0 implements yp0 {
    public static final int[] a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
    public static final rd0 b = new rd0(new qd0() { // from class: yads.sd0$$ExternalSyntheticLambda0
        @Override // yads.qd0
        public final Constructor a() {
            return sd0.b();
        }
    });
    public static final rd0 c = new rd0(new qd0() { // from class: yads.sd0$$ExternalSyntheticLambda1
        @Override // yads.qd0
        public final Constructor a() {
            return sd0.c();
        }
    });

    public static Constructor b() {
        if (Boolean.TRUE.equals(Class.forName("com.monetization.ads.exo.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("com.monetization.ads.exo.ext.flac.FlacExtractor").asSubclass(tp0.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    public static Constructor c() {
        return Class.forName("com.monetization.ads.exo.decoder.midi.MidiExtractor").asSubclass(tp0.class).getConstructor(null);
    }

    @Override // yads.yp0
    public final synchronized tp0[] a() {
        return a(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0385, code lost:
    
        if (r5 == r4) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0387, code lost:
    
        a(r5, r1);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0044 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0211 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0093 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00a2 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00b0 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00be A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00cc A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00da A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00e8 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00f6 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0105 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0113 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0120 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x012e A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x013b A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0148 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0155 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0163 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0170 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x017d A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x018a A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0196 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01a1 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01ad A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01b9 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01c5 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x038d A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x01d1 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x01dd A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x021c A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x0211, B:16:0x0214, B:22:0x0387, B:25:0x038d, B:28:0x0393, B:30:0x0396, B:34:0x0398, B:39:0x021c, B:41:0x0224, B:44:0x022e, B:47:0x0239, B:49:0x0241, B:52:0x024b, B:55:0x0256, B:58:0x0262, B:61:0x026e, B:63:0x0276, B:65:0x027e, B:68:0x0288, B:70:0x0296, B:73:0x02a0, B:76:0x02ab, B:78:0x02b3, B:80:0x02c1, B:82:0x02cf, B:85:0x02df, B:87:0x02ed, B:90:0x02f7, B:92:0x02ff, B:94:0x0307, B:96:0x030f, B:99:0x0319, B:101:0x0321, B:104:0x0330, B:106:0x0338, B:109:0x0341, B:111:0x0349, B:114:0x0352, B:116:0x035a, B:119:0x0363, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e8, B:165:0x0093, B:169:0x00a2, B:173:0x00b0, B:177:0x00be, B:181:0x00cc, B:185:0x00da, B:189:0x00e8, B:193:0x00f6, B:197:0x0105, B:201:0x0113, B:205:0x0120, B:209:0x012e, B:213:0x013b, B:217:0x0148, B:221:0x0155, B:225:0x0163, B:229:0x0170, B:233:0x017d, B:237:0x018a, B:241:0x0196, B:245:0x01a1, B:249:0x01ad, B:253:0x01b9, B:257:0x01c5, B:261:0x01d1, B:265:0x01dd, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    @Override // yads.yp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized tp0[] a(Uri uri, Map map) {
        ArrayList arrayList;
        int[] iArr;
        List list;
        String str;
        char c2;
        char c3;
        int i;
        String lastPathSegment;
        int i2;
        try {
            iArr = a;
            arrayList = new ArrayList(16);
            list = (List) map.get("Content-Type");
        } catch (Throwable th) {
            throw th;
        }
        if (list != null && !list.isEmpty()) {
            str = (String) list.get(0);
            int i3 = 2;
            if (str == null) {
                ArrayList arrayList2 = vt1.a;
                int hashCode = str.hashCode();
                if (hashCode == -1007807498) {
                    if (str.equals("audio/x-flac")) {
                        c2 = 0;
                        if (c2 != 0) {
                        }
                        switch (str.hashCode()) {
                            case -2123537834:
                                break;
                            case -1662384011:
                                break;
                            case -1662384007:
                                break;
                            case -1662095187:
                                break;
                            case -1606874997:
                                break;
                            case -1487394660:
                                break;
                            case -1248337486:
                                break;
                            case -1079884372:
                                break;
                            case -1004728940:
                                break;
                            case -387023398:
                                break;
                            case -43467528:
                                break;
                            case 13915911:
                                break;
                            case 187078296:
                                break;
                            case 187078297:
                                break;
                            case 187078669:
                                break;
                            case 187090232:
                                break;
                            case 187091926:
                                break;
                            case 187099443:
                                break;
                            case 1331848029:
                                break;
                            case 1503095341:
                                break;
                            case 1504578661:
                                break;
                            case 1504619009:
                                break;
                            case 1504824762:
                                break;
                            case 1504831518:
                                break;
                            case 1505118770:
                                break;
                            case 2039520277:
                                break;
                        }
                        switch (c3) {
                        }
                        if (i != -1) {
                        }
                        lastPathSegment = uri.getLastPathSegment();
                        if (lastPathSegment != null) {
                        }
                        i3 = -1;
                        while (i2 < 16) {
                        }
                    }
                    c2 = 65535;
                    if (c2 != 0) {
                    }
                    switch (str.hashCode()) {
                        case -2123537834:
                            break;
                        case -1662384011:
                            break;
                        case -1662384007:
                            break;
                        case -1662095187:
                            break;
                        case -1606874997:
                            break;
                        case -1487394660:
                            break;
                        case -1248337486:
                            break;
                        case -1079884372:
                            break;
                        case -1004728940:
                            break;
                        case -387023398:
                            break;
                        case -43467528:
                            break;
                        case 13915911:
                            break;
                        case 187078296:
                            break;
                        case 187078297:
                            break;
                        case 187078669:
                            break;
                        case 187090232:
                            break;
                        case 187091926:
                            break;
                        case 187099443:
                            break;
                        case 1331848029:
                            break;
                        case 1503095341:
                            break;
                        case 1504578661:
                            break;
                        case 1504619009:
                            break;
                        case 1504824762:
                            break;
                        case 1504831518:
                            break;
                        case 1505118770:
                            break;
                        case 2039520277:
                            break;
                    }
                    switch (c3) {
                    }
                    if (i != -1) {
                    }
                    lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment != null) {
                    }
                    i3 = -1;
                    while (i2 < 16) {
                    }
                } else if (hashCode != -586683234) {
                    if (hashCode == 187090231 && str.equals("audio/mp3")) {
                        c2 = 2;
                        if (c2 != 0) {
                            str = "audio/flac";
                        } else if (c2 == 1) {
                            str = "audio/wav";
                        } else if (c2 == 2) {
                            str = "audio/mpeg";
                        }
                        switch (str.hashCode()) {
                            case -2123537834:
                                if (str.equals("audio/eac3-joc")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1662384011:
                                if (str.equals("video/mp2p")) {
                                    c3 = 1;
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case -1662384007:
                                if (str.equals("video/mp2t")) {
                                    c3 = 2;
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case -1662095187:
                                if (str.equals("video/webm")) {
                                    c3 = 3;
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case -1606874997:
                                if (str.equals("audio/amr-wb")) {
                                    c3 = 4;
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case -1487394660:
                                if (str.equals("image/jpeg")) {
                                    c3 = 5;
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case -1248337486:
                                if (str.equals("application/mp4")) {
                                    c3 = 6;
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case -1079884372:
                                if (str.equals("video/x-msvideo")) {
                                    c3 = 7;
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case -1004728940:
                                if (str.equals("text/vtt")) {
                                    c3 = '\b';
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case -387023398:
                                if (str.equals("audio/x-matroska")) {
                                    c3 = '\t';
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case -43467528:
                                if (str.equals("application/webm")) {
                                    c3 = '\n';
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case 13915911:
                                if (str.equals("video/x-flv")) {
                                    c3 = 11;
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case 187078296:
                                if (str.equals("audio/ac3")) {
                                    c3 = '\f';
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case 187078297:
                                if (str.equals("audio/ac4")) {
                                    c3 = '\r';
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case 187078669:
                                if (str.equals("audio/amr")) {
                                    c3 = 14;
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case 187090232:
                                if (str.equals("audio/mp4")) {
                                    c3 = 15;
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case 187091926:
                                if (str.equals("audio/ogg")) {
                                    c3 = 16;
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case 187099443:
                                if (str.equals("audio/wav")) {
                                    c3 = 17;
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case 1331848029:
                                if (str.equals("video/mp4")) {
                                    c3 = 18;
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case 1503095341:
                                if (str.equals("audio/3gpp")) {
                                    c3 = 19;
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case 1504578661:
                                if (str.equals("audio/eac3")) {
                                    c3 = 20;
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case 1504619009:
                                if (str.equals("audio/flac")) {
                                    c3 = 21;
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case 1504824762:
                                if (str.equals("audio/midi")) {
                                    c3 = 22;
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case 1504831518:
                                if (str.equals("audio/mpeg")) {
                                    c3 = 23;
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case 1505118770:
                                if (str.equals("audio/webm")) {
                                    c3 = 24;
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            case 2039520277:
                                if (str.equals("video/x-matroska")) {
                                    c3 = 25;
                                    break;
                                } else {
                                    c3 = 65535;
                                    break;
                                }
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                            case '\f':
                            case 20:
                                i = 0;
                                break;
                            case 1:
                                i = 10;
                                break;
                            case 2:
                                i = 11;
                                break;
                            case 3:
                            case '\t':
                            case '\n':
                            case 24:
                            case 25:
                                i = 6;
                                break;
                            case 4:
                            case 14:
                            case 19:
                                i = 3;
                                break;
                            case 5:
                                i = 14;
                                break;
                            case 6:
                            case 15:
                            case 18:
                                i = 8;
                                break;
                            case 7:
                                i = 16;
                                break;
                            case '\b':
                                i = 13;
                                break;
                            case 11:
                                i = 5;
                                break;
                            case '\r':
                                i = 1;
                                break;
                            case 16:
                                i = 9;
                                break;
                            case 17:
                                i = 12;
                                break;
                            case 21:
                                i = 4;
                                break;
                            case 22:
                                i = 15;
                                break;
                            case 23:
                                i = 7;
                                break;
                        }
                        if (i != -1) {
                            a(i, arrayList);
                        }
                        lastPathSegment = uri.getLastPathSegment();
                        if (lastPathSegment != null) {
                            if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
                                if (lastPathSegment.endsWith(".ac4")) {
                                    i3 = 1;
                                } else if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                                    if (lastPathSegment.endsWith(".amr")) {
                                        i3 = 3;
                                    } else if (lastPathSegment.endsWith(".flac")) {
                                        i3 = 4;
                                    } else if (lastPathSegment.endsWith(".flv")) {
                                        i3 = 5;
                                    } else {
                                        if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                                            if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                                                if (lastPathSegment.endsWith(".mp3")) {
                                                    i3 = 7;
                                                } else {
                                                    if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                                                        if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                                            if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                                                if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                                                    if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                                                        if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                                            if (!lastPathSegment.endsWith(BrandSafetyUtils.a) && !lastPathSegment.endsWith(".jpeg")) {
                                                                                if (lastPathSegment.endsWith(".avi")) {
                                                                                    i3 = 16;
                                                                                }
                                                                            }
                                                                            i3 = 14;
                                                                        }
                                                                        i3 = 13;
                                                                    }
                                                                    i3 = 12;
                                                                }
                                                                i3 = 11;
                                                            }
                                                            i3 = 10;
                                                        }
                                                        i3 = 9;
                                                    }
                                                    i3 = 8;
                                                }
                                            }
                                            i3 = 6;
                                        }
                                        i3 = 15;
                                    }
                                }
                                for (i2 = 0; i2 < 16; i2++) {
                                    int i4 = iArr[i2];
                                    if (i4 != i && i4 != i3) {
                                        a(i4, arrayList);
                                    }
                                }
                            }
                            i3 = 0;
                            while (i2 < 16) {
                            }
                        }
                        i3 = -1;
                        while (i2 < 16) {
                        }
                    }
                    c2 = 65535;
                    if (c2 != 0) {
                    }
                    switch (str.hashCode()) {
                        case -2123537834:
                            break;
                        case -1662384011:
                            break;
                        case -1662384007:
                            break;
                        case -1662095187:
                            break;
                        case -1606874997:
                            break;
                        case -1487394660:
                            break;
                        case -1248337486:
                            break;
                        case -1079884372:
                            break;
                        case -1004728940:
                            break;
                        case -387023398:
                            break;
                        case -43467528:
                            break;
                        case 13915911:
                            break;
                        case 187078296:
                            break;
                        case 187078297:
                            break;
                        case 187078669:
                            break;
                        case 187090232:
                            break;
                        case 187091926:
                            break;
                        case 187099443:
                            break;
                        case 1331848029:
                            break;
                        case 1503095341:
                            break;
                        case 1504578661:
                            break;
                        case 1504619009:
                            break;
                        case 1504824762:
                            break;
                        case 1504831518:
                            break;
                        case 1505118770:
                            break;
                        case 2039520277:
                            break;
                    }
                    switch (c3) {
                    }
                    if (i != -1) {
                    }
                    lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment != null) {
                    }
                    i3 = -1;
                    while (i2 < 16) {
                    }
                } else if (str.equals("audio/x-wav")) {
                    c2 = 1;
                    if (c2 != 0) {
                    }
                    switch (str.hashCode()) {
                        case -2123537834:
                            break;
                        case -1662384011:
                            break;
                        case -1662384007:
                            break;
                        case -1662095187:
                            break;
                        case -1606874997:
                            break;
                        case -1487394660:
                            break;
                        case -1248337486:
                            break;
                        case -1079884372:
                            break;
                        case -1004728940:
                            break;
                        case -387023398:
                            break;
                        case -43467528:
                            break;
                        case 13915911:
                            break;
                        case 187078296:
                            break;
                        case 187078297:
                            break;
                        case 187078669:
                            break;
                        case 187090232:
                            break;
                        case 187091926:
                            break;
                        case 187099443:
                            break;
                        case 1331848029:
                            break;
                        case 1503095341:
                            break;
                        case 1504578661:
                            break;
                        case 1504619009:
                            break;
                        case 1504824762:
                            break;
                        case 1504831518:
                            break;
                        case 1505118770:
                            break;
                        case 2039520277:
                            break;
                    }
                    switch (c3) {
                    }
                    if (i != -1) {
                    }
                    lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment != null) {
                    }
                    i3 = -1;
                    while (i2 < 16) {
                    }
                } else {
                    c2 = 65535;
                    if (c2 != 0) {
                    }
                    switch (str.hashCode()) {
                        case -2123537834:
                            break;
                        case -1662384011:
                            break;
                        case -1662384007:
                            break;
                        case -1662095187:
                            break;
                        case -1606874997:
                            break;
                        case -1487394660:
                            break;
                        case -1248337486:
                            break;
                        case -1079884372:
                            break;
                        case -1004728940:
                            break;
                        case -387023398:
                            break;
                        case -43467528:
                            break;
                        case 13915911:
                            break;
                        case 187078296:
                            break;
                        case 187078297:
                            break;
                        case 187078669:
                            break;
                        case 187090232:
                            break;
                        case 187091926:
                            break;
                        case 187099443:
                            break;
                        case 1331848029:
                            break;
                        case 1503095341:
                            break;
                        case 1504578661:
                            break;
                        case 1504619009:
                            break;
                        case 1504824762:
                            break;
                        case 1504831518:
                            break;
                        case 1505118770:
                            break;
                        case 2039520277:
                            break;
                    }
                    switch (c3) {
                    }
                    if (i != -1) {
                    }
                    lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment != null) {
                    }
                    i3 = -1;
                    while (i2 < 16) {
                    }
                }
                throw th;
            }
            i = -1;
            if (i != -1) {
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
            }
            i3 = -1;
            while (i2 < 16) {
            }
        }
        str = null;
        int i32 = 2;
        if (str == null) {
        }
        i = -1;
        if (i != -1) {
        }
        lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
        }
        i32 = -1;
        while (i2 < 16) {
        }
        return (tp0[]) arrayList.toArray(new tp0[arrayList.size()]);
    }

    public static void a(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new c0());
                break;
            case 1:
                arrayList.add(new f0());
                break;
            case 2:
                arrayList.add(new fb());
                break;
            case 3:
                arrayList.add(new jd());
                break;
            case 4:
                tp0 a2 = b.a(0);
                if (a2 != null) {
                    arrayList.add(a2);
                    break;
                } else {
                    arrayList.add(new pu0());
                    break;
                }
            case 5:
                arrayList.add(new bv0());
                break;
            case 6:
                arrayList.add(new ti1(0));
                break;
            case 7:
                arrayList.add(new wv1());
                break;
            case 8:
                arrayList.add(new pw0());
                arrayList.add(new yv1());
                break;
            case 9:
                arrayList.add(new y92());
                break;
            case 10:
                arrayList.add(new gl2());
                break;
            case 11:
                arrayList.add(new w93());
                break;
            case 12:
                arrayList.add(new nn3());
                break;
            case 14:
                arrayList.add(new wc1());
                break;
            case 15:
                tp0 a3 = c.a(new Object[0]);
                if (a3 != null) {
                    arrayList.add(a3);
                    break;
                }
                break;
            case 16:
                arrayList.add(new tk());
                break;
        }
    }
}
