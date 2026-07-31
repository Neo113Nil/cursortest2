package sg.bigo.ads.ad.banner;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.Map;
import java.util.WeakHashMap;
import sg.bigo.ads.api.Ad;

/* loaded from: classes13.dex */
public final class b {
    private static final Map<InterfaceC1824b, a> a = new WeakHashMap();

    static final class a {
        final long[] a;

        private a() {
            this.a = new long[9];
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: sg.bigo.ads.ad.banner.b$b, reason: collision with other inner class name */
    public interface InterfaceC1824b {
    }

    public static <T extends Ad> long a(InterfaceC1824b interfaceC1824b, long j) {
        if (j == -1) {
            return -1L;
        }
        return j - j(interfaceC1824b).a[4];
    }

    public static <T extends Ad> void a(InterfaceC1824b interfaceC1824b) {
        a(interfaceC1824b, 0);
    }

    private static <T extends Ad> void a(InterfaceC1824b interfaceC1824b, int i) {
        j(interfaceC1824b).a[i] = SystemClock.elapsedRealtime();
    }

    public static <T extends Ad> void b(InterfaceC1824b interfaceC1824b) {
        a(interfaceC1824b, 1);
    }

    public static <T extends Ad> void c(InterfaceC1824b interfaceC1824b) {
        a(interfaceC1824b, 2);
    }

    public static <T extends Ad> void d(InterfaceC1824b interfaceC1824b) {
        a(interfaceC1824b, 3);
    }

    public static <T extends Ad> void e(InterfaceC1824b interfaceC1824b) {
        a(interfaceC1824b, 4);
    }

    public static <T extends Ad> void f(InterfaceC1824b interfaceC1824b) {
        a(interfaceC1824b, 5);
    }

    public static <T extends Ad> void g(InterfaceC1824b interfaceC1824b) {
        a(interfaceC1824b, 6);
    }

    public static <T extends Ad> void h(InterfaceC1824b interfaceC1824b) {
        a.remove(interfaceC1824b);
    }

    public static <T extends Ad> long i(InterfaceC1824b interfaceC1824b) {
        long[] jArr = j(interfaceC1824b).a;
        return jArr[6] - jArr[4];
    }

    @NonNull
    private static <T extends Ad> a j(InterfaceC1824b interfaceC1824b) {
        Map<InterfaceC1824b, a> map = a;
        a aVar = map.get(interfaceC1824b);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a((byte) 0);
        map.put(interfaceC1824b, aVar2);
        return aVar2;
    }
}
