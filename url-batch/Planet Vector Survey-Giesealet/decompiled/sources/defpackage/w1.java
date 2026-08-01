package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class w1 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final ArrayList c;
    public final transient LinkedHashMap d;
    public final LinkedHashMap e;
    public final Bundle f;

    public w1() {
        new LinkedHashMap();
        this.c = new ArrayList();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new Bundle();
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        this.e.remove(str);
        this.f.putParcelable(str, new r1(intent, i2));
        return true;
    }
}
