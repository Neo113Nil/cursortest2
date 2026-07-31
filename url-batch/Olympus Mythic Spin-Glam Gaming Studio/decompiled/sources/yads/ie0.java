package yads;

import android.net.Uri;
import android.support.v4.media.MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public final class ie0 implements om1 {
    public final he0 a;
    public final p30 b;
    public final long c;
    public final long d;
    public final long e;
    public final float f;
    public final float g;

    public ie0(p30 p30Var, sd0 sd0Var) {
        this.b = p30Var;
        he0 he0Var = new he0(sd0Var);
        this.a = he0Var;
        if (p30Var != he0Var.e) {
            he0Var.e = p30Var;
            he0Var.b.clear();
            he0Var.d.clear();
        }
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -3.4028235E38f;
        this.g = -3.4028235E38f;
    }

    @Override // yads.om1
    public final om1 a(ld0 ld0Var) {
        he0 he0Var = this.a;
        if (ld0Var == null) {
            throw new NullPointerException("MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        }
        he0Var.f = ld0Var;
        Iterator it = he0Var.d.values().iterator();
        while (it.hasNext()) {
            ((om1) it.next()).a(ld0Var);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17, types: [yads.l41] */
    @Override // yads.om1
    public final ao a(wl1 wl1Var) {
        Uri uri;
        String str;
        List list;
        um2 um2Var;
        wl1 wl1Var2 = wl1Var;
        wl1Var2.c.getClass();
        String scheme = wl1Var2.c.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        int a = sb3.a(wl1Var2.c.a, (String) null);
        he0 he0Var = this.a;
        om1 om1Var = (om1) he0Var.d.get(Integer.valueOf(a));
        if (om1Var == null) {
            i53 a2 = he0Var.a(a);
            if (a2 == null) {
                om1Var = null;
            } else {
                om1Var = (om1) a2.get();
                ld0 ld0Var = he0Var.f;
                if (ld0Var != null) {
                    om1Var.a(ld0Var);
                }
                he0Var.d.put(Integer.valueOf(a), om1Var);
            }
        }
        oh.a(om1Var, "No suitable media source factory found for content type: " + a);
        ql1 ql1Var = wl1Var2.d;
        ql1Var.getClass();
        long j = ql1Var.b;
        long j2 = ql1Var.c;
        long j3 = ql1Var.d;
        float f = ql1Var.e;
        float f2 = ql1Var.f;
        ql1 ql1Var2 = wl1Var2.d;
        if (ql1Var2.b == -9223372036854775807L) {
            j = this.c;
        }
        long j4 = j;
        if (ql1Var2.e == -3.4028235E38f) {
            f = this.f;
        }
        float f3 = f;
        if (ql1Var2.f == -3.4028235E38f) {
            f2 = this.g;
        }
        float f4 = f2;
        if (ql1Var2.c == -9223372036854775807L) {
            j2 = this.d;
        }
        long j5 = j2;
        if (ql1Var2.d == -9223372036854775807L) {
            j3 = this.e;
        }
        ql1 ql1Var3 = new ql1(j4, j5, j3, f3, f4);
        if (!ql1Var3.equals(wl1Var2.d)) {
            new ol1();
            List emptyList = Collections.emptyList();
            um2 um2Var2 = um2.f;
            tl1 tl1Var = tl1.d;
            nl1 nl1Var = wl1Var2.f;
            nl1Var.getClass();
            ll1 ll1Var = new ll1(nl1Var);
            String str2 = wl1Var2.b;
            am1 am1Var = wl1Var2.e;
            wl1Var2.d.getClass();
            tl1 tl1Var2 = wl1Var2.g;
            rl1 rl1Var = wl1Var2.c;
            if (rl1Var != null) {
                String str3 = rl1Var.c;
                Uri uri2 = rl1Var.a;
                List list2 = rl1Var.b;
                ?? r1 = rl1Var.d;
                i41 i41Var = l41.c;
                um2Var = r1;
                str = str3;
                uri = uri2;
                list = list2;
            } else {
                uri = null;
                str = null;
                list = emptyList;
                um2Var = um2Var2;
            }
            long j6 = ql1Var3.b;
            long j7 = ql1Var3.c;
            long j8 = ql1Var3.d;
            float f5 = ql1Var3.e;
            float f6 = ql1Var3.f;
            rl1 rl1Var2 = uri != null ? new rl1(uri, null, list, str, um2Var) : null;
            String str4 = str2 != null ? str2 : "";
            nl1 nl1Var2 = new nl1(ll1Var);
            ql1 ql1Var4 = new ql1(j6, j7, j8, f5, f6);
            if (am1Var == null) {
                am1Var = am1.H;
            }
            wl1Var2 = new wl1(str4, nl1Var2, rl1Var2, ql1Var4, am1Var, tl1Var2);
        }
        ao a3 = om1Var.a(wl1Var2);
        l41 l41Var = wl1Var2.c.d;
        if (!l41Var.isEmpty()) {
            ao[] aoVarArr = new ao[l41Var.size() + 1];
            aoVarArr[0] = a3;
            if (l41Var.size() <= 0) {
                a3 = new et1(aoVarArr);
            } else {
                this.b.getClass();
                MediaBrowserCompat$MediaBrowserImplApi21$$ExternalSyntheticThrowCCEIfNotNull0.m(l41Var.get(0));
                new ArrayList(1);
                new HashSet(1);
                new sm1();
                new yk0();
                i41 i41Var2 = l41.c;
                um2 um2Var3 = um2.f;
                Collections.emptyList();
                tl1 tl1Var3 = tl1.d;
                Uri uri3 = Uri.EMPTY;
                throw null;
            }
        }
        ao aoVar = a3;
        nl1 nl1Var3 = wl1Var2.f;
        long j9 = nl1Var3.b;
        if (j9 != 0 || nl1Var3.c != Long.MIN_VALUE || nl1Var3.e) {
            long a4 = sb3.a(j9);
            long a5 = sb3.a(wl1Var2.f.c);
            nl1 nl1Var4 = wl1Var2.f;
            aoVar = new sv(aoVar, a4, a5, !nl1Var4.f, nl1Var4.d, nl1Var4.e);
        }
        wl1Var2.c.getClass();
        wl1Var2.c.getClass();
        return aoVar;
    }

    public static om1 a(Class cls, p30 p30Var) {
        try {
            return (om1) cls.getConstructor(p30.class).newInstance(p30Var);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
