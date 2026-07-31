package com.my.target;

import android.content.Context;
import com.my.target.wh;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes6.dex */
public class cf {
    private final fe a;
    private final Context b;
    private boolean c = true;

    private cf(fe feVar, Context context) {
        this.a = feVar;
        this.b = context;
    }

    public static cf a(fe feVar, Context context) {
        return new cf(feVar, context);
    }

    public ha b() {
        return new bf(this.b, this);
    }

    public ha c() {
        return new kf(this.b, this.c);
    }

    public void a(boolean z) {
        this.c = z;
    }

    public zi b(qi qiVar, boolean z) {
        return new zi(this.b, qiVar, z);
    }

    public oe a(eb ebVar, wh.c cVar) {
        return oe.a(ebVar, this.a, cVar, this.b);
    }

    public a2 a() {
        return new a2(this.b);
    }

    public ef a(qi qiVar, boolean z) {
        return new ef(this.b, qiVar, z, this.c);
    }
}
