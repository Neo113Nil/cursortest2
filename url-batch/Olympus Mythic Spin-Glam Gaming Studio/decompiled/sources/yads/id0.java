package yads;

import android.net.Uri;
import android.util.SparseArray;
import com.monetization.ads.exo.source.dash.offline.DashDownloader;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes13.dex */
public final class id0 {
    public static final SparseArray c;
    public final er a;
    public final ExecutorService b;

    static {
        SparseArray sparseArray = new SparseArray();
        try {
            sparseArray.put(0, a(DashDownloader.class));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, a(Class.forName("com.monetization.ads.exo.source.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, a(Class.forName("com.monetization.ads.exo.source.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        c = sparseArray;
    }

    public id0(er erVar, ExecutorService executorService) {
        this.a = erVar;
        executorService.getClass();
        this.b = executorService;
    }

    public final dk0 a(ck0 ck0Var) {
        int a = sb3.a(ck0Var.c, ck0Var.d);
        if (a != 0 && a != 1 && a != 2) {
            if (a != 4) {
                throw new IllegalArgumentException(gg2.a(a, "Unsupported type: "));
            }
            ll1 ll1Var = new ll1();
            i41 i41Var = l41.c;
            um2 um2Var = um2.f;
            List emptyList = Collections.emptyList();
            um2 um2Var2 = um2.f;
            tl1 tl1Var = tl1.d;
            Uri uri = ck0Var.c;
            return new ck2(new wl1("", new nl1(ll1Var), uri != null ? new rl1(uri, null, emptyList, ck0Var.g, um2Var2) : null, new ql1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), am1.H, tl1Var), this.a, this.b);
        }
        Constructor constructor = (Constructor) c.get(a);
        if (constructor == null) {
            throw new IllegalStateException(gg2.a(a, "Module missing for content type "));
        }
        ll1 ll1Var2 = new ll1();
        i41 i41Var2 = l41.c;
        um2 um2Var3 = um2.f;
        Collections.emptyList();
        um2 um2Var4 = um2.f;
        tl1 tl1Var2 = tl1.d;
        Uri uri2 = ck0Var.c;
        List list = ck0Var.e;
        try {
            return (dk0) constructor.newInstance(new wl1("", new nl1(ll1Var2), uri2 != null ? new rl1(uri2, null, (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list)), ck0Var.g, um2Var4) : null, new ql1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), am1.H, tl1Var2), this.a, this.b);
        } catch (Exception unused) {
            throw new IllegalStateException(gg2.a(a, "Failed to instantiate downloader for content type "));
        }
    }

    public static Constructor a(Class cls) {
        try {
            return cls.asSubclass(dk0.class).getConstructor(wl1.class, er.class, Executor.class);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Downloader constructor missing", e);
        }
    }
}
