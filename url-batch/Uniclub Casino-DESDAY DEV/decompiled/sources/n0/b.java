package n0;

import X0.d;
import com.fortuneodd.shadegrid.MainActivity;
import i1.p;
import i1.q;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements W0.a {
    @Override // W0.a
    public final Object a() {
        int i = MainActivity.f1519E;
        p pVar = new p();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        d.e(timeUnit, "unit");
        byte[] bArr = j1.b.f2609a;
        long millis = timeUnit.toMillis(5L);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout".concat(" too large.").toString());
        }
        if (millis == 0) {
            throw new IllegalArgumentException("timeout".concat(" too small.").toString());
        }
        pVar.f2482r = (int) millis;
        return new q(pVar);
    }
}
