package yads;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class kc {
    public static final Object b = new Object();
    public final og1 a;

    public kc(og1 og1Var) {
        this.a = og1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:30:0x0009, B:32:0x000d, B:11:0x002a, B:13:0x002e, B:15:0x0045, B:16:0x004e, B:25:0x0038, B:27:0x003c, B:6:0x0019, B:8:0x001f), top: B:29:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:30:0x0009, B:32:0x000d, B:11:0x002a, B:13:0x002e, B:15:0x0045, B:16:0x004e, B:25:0x0038, B:27:0x003c, B:6:0x0019, B:8:0x001f), top: B:29:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003c A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:30:0x0009, B:32:0x000d, B:11:0x002a, B:13:0x002e, B:15:0x0045, B:16:0x004e, B:25:0x0038, B:27:0x003c, B:6:0x0019, B:8:0x001f), top: B:29:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(mc mcVar, mc mcVar2, String str) {
        String str2;
        synchronized (b) {
            if (mcVar != null) {
                try {
                    if (mcVar.b) {
                        ((qg1) this.a).a("google_advertising_id_key", (String) null);
                        if (mcVar2 == null && mcVar2.b) {
                            ((qg1) this.a).a("huawei_advertising_id_key", (String) null);
                        } else {
                            str2 = mcVar2 != null ? mcVar2.a : null;
                            if (str2 != null) {
                                ((qg1) this.a).a("huawei_advertising_id_key", str2);
                            }
                        }
                        if (str != null) {
                            ((qg1) this.a).a("app_set_advertising_id_key", str);
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            String str3 = mcVar != null ? mcVar.a : null;
            if (str3 != null) {
                ((qg1) this.a).a("google_advertising_id_key", str3);
            }
            if (mcVar2 == null) {
            }
            if (mcVar2 != null) {
            }
            if (str2 != null) {
            }
            if (str != null) {
            }
            Unit unit2 = Unit.INSTANCE;
        }
    }
}
