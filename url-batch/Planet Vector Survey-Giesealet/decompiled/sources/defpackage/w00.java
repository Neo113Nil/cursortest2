package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public final class w00 {
    public final Object a = new Object();
    public ArrayList b = new ArrayList();
    public ArrayList c = new ArrayList();
    public boolean d = true;

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }
}
