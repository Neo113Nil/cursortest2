package o;

import com.google.firebase.database.DataSnapshot;

/* loaded from: classes.dex */
public final class WO {
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:40|41))(3:42|43|(1:45))|11|(2:13|14)(7:16|(5:21|22|(7:27|(1:29)(1:36)|30|(1:32)|33|34|35)|37|38)|39|22|(8:24|27|(0)(0)|30|(0)|33|34|35)|37|38)))|48|6|7|(0)(0)|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0031, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c6, code lost:
    
        r0 = o.AbstractC0896dH.a;
        o.AbstractC0896dH.f("RTDB", "load failed: " + r13.getMessage(), r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0059 A[Catch: Exception -> 0x0031, TryCatch #0 {Exception -> 0x0031, blocks: (B:10:0x002d, B:11:0x0055, B:13:0x0059, B:16:0x0061, B:18:0x007b, B:22:0x0085, B:24:0x0097, B:27:0x009e, B:30:0x00ad, B:32:0x00b1, B:33:0x00b5, B:36:0x00a9, B:37:0x00be, B:43:0x0044), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061 A[Catch: Exception -> 0x0031, TryCatch #0 {Exception -> 0x0031, blocks: (B:10:0x002d, B:11:0x0055, B:13:0x0059, B:16:0x0061, B:18:0x007b, B:22:0x0085, B:24:0x0097, B:27:0x009e, B:30:0x00ad, B:32:0x00b1, B:33:0x00b5, B:36:0x00a9, B:37:0x00be, B:43:0x0044), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1 A[Catch: Exception -> 0x0031, TryCatch #0 {Exception -> 0x0031, blocks: (B:10:0x002d, B:11:0x0055, B:13:0x0059, B:16:0x0061, B:18:0x007b, B:22:0x0085, B:24:0x0097, B:27:0x009e, B:30:0x00ad, B:32:0x00b1, B:33:0x00b5, B:36:0x00a9, B:37:0x00be, B:43:0x0044), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a9 A[Catch: Exception -> 0x0031, TryCatch #0 {Exception -> 0x0031, blocks: (B:10:0x002d, B:11:0x0055, B:13:0x0059, B:16:0x0061, B:18:0x007b, B:22:0x0085, B:24:0x0097, B:27:0x009e, B:30:0x00ad, B:32:0x00b1, B:33:0x00b5, B:36:0x00a9, B:37:0x00be, B:43:0x0044), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC2367ze abstractC2367ze) {
        UO uo;
        int i;
        DataSnapshot dataSnapshot;
        boolean z;
        if (abstractC2367ze instanceof UO) {
            uo = (UO) abstractC2367ze;
            int i2 = uo.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uo.j = i2 - Integer.MIN_VALUE;
                Object obj = uo.h;
                EnumC0448Re enumC0448Re = EnumC0448Re.h;
                i = uo.j;
                boolean z2 = false;
                if (i != 0) {
                    AbstractC1494mO.l(obj);
                    AbstractC0896dH.d("RTDB", "load begin");
                    VO vo = new VO(2, null);
                    uo.j = 1;
                    obj = AbstractC0773bP.m(5000L, vo, uo);
                    if (obj == enumC0448Re) {
                        return enumC0448Re;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1494mO.l(obj);
                }
                dataSnapshot = (DataSnapshot) obj;
                if (dataSnapshot != null) {
                    AbstractC0896dH.f("RTDB", "timeout", null);
                    return Boolean.FALSE;
                }
                String str = (String) dataSnapshot.child("hApi").getValue(String.class);
                String str2 = (String) dataSnapshot.child("hFp").getValue(String.class);
                BU bu = AbstractC0896dH.a;
                if (str != null && !UT.J(str)) {
                    z = false;
                    StringBuilder sb = new StringBuilder("snapshot ok=");
                    sb.append(!z);
                    AbstractC0896dH.d("RTDB", sb.toString());
                    if (str != null && !UT.J(str)) {
                        String str3 = AbstractC0707aP.a;
                        if (AbstractC0778bU.v(str, "/", false)) {
                            str = str.concat("/");
                        }
                        AbstractC0707aP.a = str;
                        if (str2 != null) {
                            UT.J(str2);
                        }
                        AbstractC0896dH.d("RuntimeConfig", "rtdb applied");
                        z2 = true;
                        return Boolean.valueOf(z2);
                    }
                    AbstractC0896dH.f("RTDB", "hApi empty", null);
                    return Boolean.FALSE;
                }
                z = true;
                StringBuilder sb2 = new StringBuilder("snapshot ok=");
                sb2.append(!z);
                AbstractC0896dH.d("RTDB", sb2.toString());
                if (str != null) {
                    String str32 = AbstractC0707aP.a;
                    if (AbstractC0778bU.v(str, "/", false)) {
                    }
                    AbstractC0707aP.a = str;
                    if (str2 != null) {
                    }
                    AbstractC0896dH.d("RuntimeConfig", "rtdb applied");
                    z2 = true;
                    return Boolean.valueOf(z2);
                }
                AbstractC0896dH.f("RTDB", "hApi empty", null);
                return Boolean.FALSE;
            }
        }
        uo = new UO(this, abstractC2367ze);
        Object obj2 = uo.h;
        EnumC0448Re enumC0448Re2 = EnumC0448Re.h;
        i = uo.j;
        boolean z22 = false;
        if (i != 0) {
        }
        dataSnapshot = (DataSnapshot) obj2;
        if (dataSnapshot != null) {
        }
    }
}
