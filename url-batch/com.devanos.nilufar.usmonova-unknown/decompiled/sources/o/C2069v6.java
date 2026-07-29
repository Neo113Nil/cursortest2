package o;

import android.content.Context;

/* renamed from: o.v6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2069v6 {
    public static final YI b = new YI("install_id");
    public static final YI c = new YI("idfv");
    public static final YI d = new YI("p7_pd");
    public static final YI e = new YI("fcm_token");
    public static final YI f = new YI("pending_click_id");
    public final Context a;

    public C2069v6(Context context) {
        this.a = context;
    }

    public final Object a(String str, AbstractC2367ze abstractC2367ze) {
        Object b2 = ((C1590ns) AbstractC2135w6.a(this.a)).b(new C0701aJ(new C1805r6(str, null), null), abstractC2367ze);
        return b2 == EnumC0448Re.h ? b2 : C0782bY.a;
    }
}
