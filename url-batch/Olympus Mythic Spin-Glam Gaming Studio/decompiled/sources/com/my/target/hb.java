package com.my.target;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class hb extends x {
    public final int b;
    private final String c;
    private final ArrayList d = new ArrayList();
    private final ArrayList e = new ArrayList();
    private final ArrayList f = new ArrayList();
    private final ArrayList g = new ArrayList();
    private int h = 10;
    private int i = -1;

    private hb(String str) {
        this.c = str;
        str.getClass();
        switch (str) {
            case "preroll":
                this.b = 1;
                break;
            case "postroll":
                this.b = 3;
                break;
            case "pauseroll":
                this.b = 4;
                break;
            case "midroll":
                this.b = 2;
                break;
            default:
                this.b = 0;
                break;
        }
    }

    public static hb a(String str) {
        return new hb(str);
    }

    public void b(int i) {
        this.i = i;
    }

    public void c() {
        this.g.clear();
    }

    public List d() {
        return Collections.unmodifiableList(this.d);
    }

    public int e() {
        return this.h;
    }

    public int f() {
        return this.i;
    }

    public List g() {
        return Collections.unmodifiableList(this.f);
    }

    public String h() {
        return this.c;
    }

    public boolean i() {
        return (this.d.isEmpty() && this.f.isEmpty() && this.e.isEmpty()) ? false : true;
    }

    public boolean j() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            eb ebVar = (eb) obj;
            if (ebVar.A0() != null && !TextUtils.isEmpty(ebVar.A0().getUrl())) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        return "midroll".equals(this.c);
    }

    public y l() {
        if (this.e.size() > 0) {
            return (y) this.e.remove(0);
        }
        return null;
    }

    public void a(int i) {
        this.h = i;
    }

    public List b(float f) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            y yVar = (y) obj;
            if (yVar.A() == f) {
                arrayList.add(yVar);
            }
        }
        if (arrayList.size() > 0) {
            this.f.removeAll(arrayList);
        }
        return arrayList;
    }

    public void a(eb ebVar) {
        ebVar.e(this.b);
        this.d.add(ebVar);
    }

    public void a(eb ebVar, int i) {
        int size = this.d.size();
        if (i >= 0 && i <= size) {
            ebVar.e(this.b);
            this.d.add(i, ebVar);
            ArrayList arrayList = this.g;
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = arrayList.get(i2);
                i2++;
                y yVar = (y) obj;
                int C = yVar.C();
                if (C >= i) {
                    yVar.d(C + 1);
                }
            }
            return;
        }
        mi.a("MediaSection: can't add banner, wrong position");
    }

    public List a(float f) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            eb ebVar = (eb) obj;
            if (ebVar.f0() == f) {
                arrayList.add(ebVar);
            }
        }
        return arrayList;
    }

    @Override // com.my.target.x
    public int a() {
        return this.d.size();
    }

    public void a(y yVar) {
        if (yVar.K()) {
            this.f.add(yVar);
        } else if (yVar.I()) {
            this.e.add(yVar);
        } else {
            this.g.add(yVar);
        }
    }

    public void a(hb hbVar) {
        ArrayList arrayList = hbVar.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a((eb) obj);
        }
        this.e.addAll(hbVar.e);
        this.f.addAll(hbVar.f);
    }
}
