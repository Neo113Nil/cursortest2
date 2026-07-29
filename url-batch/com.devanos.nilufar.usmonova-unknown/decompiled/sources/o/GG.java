package o;

import com.google.firebase.messaging.Constants;

/* loaded from: classes.dex */
public final class GG extends JG {
    public static final GG c = new GG(0, 1, 1);

    @Override // o.JG
    public final void a(C0575Wb c0575Wb, C0950e6 c0950e6, C0972eS c0972eS, C1970td c1970td) {
        c0972eS.I(c0575Wb.c(0));
    }

    @Override // o.JG
    public final String c(int i) {
        return i == 0 ? Constants.ScionAnalytics.MessageType.DATA_MESSAGE : super.c(i);
    }
}
