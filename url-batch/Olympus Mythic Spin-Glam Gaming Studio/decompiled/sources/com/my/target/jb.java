package com.my.target;

import java.util.ArrayList;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class jb {
    private final ArrayList a = new ArrayList();
    private int b = 60;

    private jb() {
    }

    public static final jb c() {
        return new jb();
    }

    public int a() {
        return this.b;
    }

    public boolean b() {
        return !this.a.isEmpty();
    }

    public kb d() {
        if (this.a.isEmpty()) {
            return null;
        }
        return (kb) this.a.remove(0);
    }

    public void a(int i) {
        this.b = i;
    }

    public void a(kb kbVar) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (kbVar.f() > ((kb) this.a.get(i)).f()) {
                this.a.add(i, kbVar);
                return;
            }
        }
        this.a.add(kbVar);
    }

    public void a(g3 g3Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            g3Var.accept((kb) obj);
        }
    }
}
