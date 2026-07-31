package yads;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class pq implements c83 {
    public final int a;
    public final jw0 b;
    public final hl0 c = new hl0();
    public jw0 d;
    public c83 e;
    public long f;

    public pq(int i, int i2, jw0 jw0Var) {
        this.a = i2;
        this.b = jw0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0095  */
    @Override // yads.c83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(jw0 jw0Var) {
        jw0 jw0Var2;
        String str;
        String str2;
        float f;
        int i;
        float f2;
        int i2;
        String str3;
        jw0 jw0Var3 = this.b;
        if (jw0Var3 != null) {
            if (jw0Var != jw0Var3) {
                int d = vt1.d(jw0Var.m);
                String str4 = jw0Var3.b;
                String str5 = jw0Var3.c;
                if (str5 == null) {
                    str5 = jw0Var.c;
                }
                String str6 = jw0Var.d;
                if ((d == 3 || d == 1) && (str = jw0Var3.d) != null) {
                    str6 = str;
                }
                int i3 = jw0Var.g;
                if (i3 == -1) {
                    i3 = jw0Var3.g;
                }
                int i4 = jw0Var.h;
                if (i4 == -1) {
                    i4 = jw0Var3.h;
                }
                String str7 = jw0Var.j;
                int i5 = 0;
                if (str7 == null) {
                    String str8 = jw0Var3.j;
                    String[] split = TextUtils.isEmpty(str8) ? new String[0] : str8.trim().split("(\\s*,\\s*)", -1);
                    if (split.length != 0) {
                        StringBuilder sb = new StringBuilder();
                        int length = split.length;
                        while (i5 < length) {
                            String str9 = split[i5];
                            int i6 = length;
                            if (d == vt1.d(vt1.a(str9))) {
                                if (sb.length() > 0) {
                                    sb.append(StringUtils.COMMA);
                                }
                                sb.append(str9);
                            }
                            i5++;
                            length = i6;
                        }
                        if (sb.length() > 0) {
                            str3 = sb.toString();
                            if ((!TextUtils.isEmpty(str3) ? new String[0] : str3.trim().split("(\\s*,\\s*)", -1)).length == 1) {
                                str7 = str3;
                            }
                        }
                    }
                    str3 = null;
                    if ((!TextUtils.isEmpty(str3) ? new String[0] : str3.trim().split("(\\s*,\\s*)", -1)).length == 1) {
                    }
                }
                ht1 ht1Var = jw0Var.k;
                if (ht1Var == null) {
                    ht1Var = jw0Var3.k;
                } else {
                    ht1 ht1Var2 = jw0Var3.k;
                    if (ht1Var2 != null) {
                        gt1[] gt1VarArr = ht1Var2.b;
                        if (gt1VarArr.length != 0) {
                            ht1Var = new ht1((gt1[]) sb3.a((Object[]) ht1Var.b, (Object[]) gt1VarArr));
                        }
                    }
                }
                float f3 = jw0Var.t;
                if (f3 == -1.0f && d == 2) {
                    f3 = jw0Var3.t;
                }
                int i7 = jw0Var.e | jw0Var3.e;
                int i8 = jw0Var.f | jw0Var3.f;
                vk0 vk0Var = jw0Var3.p;
                vk0 vk0Var2 = jw0Var.p;
                ArrayList arrayList = new ArrayList();
                if (vk0Var != null) {
                    String str10 = vk0Var.d;
                    uk0[] uk0VarArr = vk0Var.b;
                    int length2 = uk0VarArr.length;
                    int i9 = 0;
                    while (i9 < length2) {
                        int i10 = length2;
                        uk0 uk0Var = uk0VarArr[i9];
                        uk0[] uk0VarArr2 = uk0VarArr;
                        if (uk0Var.f != null) {
                            arrayList.add(uk0Var);
                        }
                        i9++;
                        length2 = i10;
                        uk0VarArr = uk0VarArr2;
                    }
                    str2 = str10;
                } else {
                    str2 = null;
                }
                if (vk0Var2 != null) {
                    if (str2 == null) {
                        str2 = vk0Var2.d;
                    }
                    int size = arrayList.size();
                    uk0[] uk0VarArr3 = vk0Var2.b;
                    int length3 = uk0VarArr3.length;
                    String str11 = str2;
                    int i11 = 0;
                    while (i11 < length3) {
                        int i12 = length3;
                        uk0 uk0Var2 = uk0VarArr3[i11];
                        uk0[] uk0VarArr4 = uk0VarArr3;
                        if (uk0Var2.f != null) {
                            UUID uuid = uk0Var2.c;
                            f2 = f3;
                            int i13 = 0;
                            while (i13 < size) {
                                i = size;
                                if (!((uk0) arrayList.get(i13)).c.equals(uuid)) {
                                    i13++;
                                    size = i;
                                }
                            }
                            i = size;
                            i2 = 1;
                            arrayList.add(uk0Var2);
                            i11 += i2;
                            length3 = i12;
                            uk0VarArr3 = uk0VarArr4;
                            f3 = f2;
                            size = i;
                        } else {
                            i = size;
                            f2 = f3;
                        }
                        i2 = 1;
                        i11 += i2;
                        length3 = i12;
                        uk0VarArr3 = uk0VarArr4;
                        f3 = f2;
                        size = i;
                    }
                    f = f3;
                    str2 = str11;
                } else {
                    f = f3;
                }
                vk0 vk0Var3 = arrayList.isEmpty() ? null : new vk0(str2, false, (uk0[]) arrayList.toArray(new uk0[0]));
                iw0 iw0Var = new iw0(jw0Var);
                iw0Var.a = str4;
                iw0Var.b = str5;
                iw0Var.c = str6;
                iw0Var.d = i7;
                iw0Var.e = i8;
                iw0Var.f = i3;
                iw0Var.g = i4;
                iw0Var.h = str7;
                iw0Var.i = ht1Var;
                iw0Var.n = vk0Var3;
                iw0Var.r = f;
                jw0Var2 = new jw0(iw0Var);
                this.d = jw0Var2;
                c83 c83Var = this.e;
                int i14 = sb3.a;
                c83Var.a(jw0Var2);
            }
            jw0Var.getClass();
        }
        jw0Var2 = jw0Var;
        this.d = jw0Var2;
        c83 c83Var2 = this.e;
        int i142 = sb3.a;
        c83Var2.a(jw0Var2);
    }

    @Override // yads.c83
    public final int a(n30 n30Var, int i, boolean z) {
        c83 c83Var = this.e;
        int i2 = sb3.a;
        return c83Var.b(n30Var, i, z);
    }

    @Override // yads.c83
    public final void a(int i, xb2 xb2Var) {
        c83 c83Var = this.e;
        int i2 = sb3.a;
        c83Var.a(i, xb2Var);
    }

    @Override // yads.c83
    public final void a(long j, int i, int i2, int i3, b83 b83Var) {
        long j2 = this.f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.e = this.c;
        }
        c83 c83Var = this.e;
        int i4 = sb3.a;
        c83Var.a(j, i, i2, i3, b83Var);
    }
}
