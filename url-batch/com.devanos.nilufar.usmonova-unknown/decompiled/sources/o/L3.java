package o;

import android.os.Looper;
import android.view.Choreographer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes.dex */
public final class L3 extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ L3(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                N3 n3 = new N3(choreographer, AbstractC0868ct.m(myLooper));
                return PX.E0(n3, n3.s);
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(HY.e);
                return simpleDateFormat;
            default:
                return new Random();
        }
    }
}
