package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class bh {
    public final Object a;

    public bh(int i) {
        switch (i) {
            case 1:
                this.a = ud0.o(Boolean.FALSE);
                break;
            default:
                this.a = new ArrayList();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(zv zvVar, Object obj) {
        ArrayList arrayList = zvVar.a;
        if (arrayList == null) {
            return true;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj2 = arrayList.get(i);
            if (!(obj2 instanceof h2)) {
                if (!(obj2 instanceof zv)) {
                    g8.d(obj2, "Unexpected child source info ");
                    break;
                }
                if (a((zv) obj2, obj)) {
                    break;
                }
                i++;
            } else {
                if (obj2 == obj) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public abstract Object b();

    public abstract Object c();

    public abstract void e(Object obj);

    public abstract void f(cx0 cx0Var);

    public abstract void g();

    public void d(zv zvVar, Object obj) {
    }
}
