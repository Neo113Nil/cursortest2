package com.my.target;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class bg {
    private final ArrayList a;
    private final uh b;
    private int c = -1;

    private bg(th thVar) {
        ArrayList arrayList = new ArrayList();
        for (rh rhVar : thVar.b("playheadTimerValue").c) {
            if (rhVar instanceof dg) {
                arrayList.add((dg) rhVar);
            }
        }
        this.a = arrayList;
        this.b = thVar.d();
    }

    public static bg a(th thVar) {
        return new bg(thVar);
    }

    public void a(int i, int i2) {
        if (i2 < 0 || i < 0 || i == this.c) {
            return;
        }
        this.c = i;
        if (!this.a.isEmpty() && i != 0) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                a(i, (dg) obj);
            }
        }
        uh a = this.b.a();
        while (!this.b.c.isEmpty()) {
            List list = this.b.c;
            if (((xe) list.get(list.size() - 1)).h() > i) {
                break;
            }
            List list2 = this.b.c;
            a.c.add((xe) list2.remove(list2.size() - 1));
        }
        wh.b(a, 1);
    }

    private void a(int i, dg dgVar) {
        int i2 = dgVar.i();
        int g = dgVar.g();
        if (i2 <= i) {
            if ((g == 0 || g >= i) && (i - i2) % dgVar.h() == 0) {
                String replace = dgVar.c().replace("[CONTENTPLAYHEAD]", String.valueOf(i));
                if (TextUtils.isEmpty(replace)) {
                    return;
                }
                wh.a(replace);
            }
        }
    }
}
