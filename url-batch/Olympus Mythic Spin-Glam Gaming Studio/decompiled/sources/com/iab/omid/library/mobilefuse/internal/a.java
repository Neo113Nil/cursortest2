package com.iab.omid.library.mobilefuse.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.mobilefuse.internal.d;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class a implements d.a {
    private static a f = new a(new d());
    protected com.iab.omid.library.mobilefuse.utils.f a = new com.iab.omid.library.mobilefuse.utils.f();
    private Date b;
    private boolean c;
    private d d;
    private boolean e;

    private a(d dVar) {
        this.d = dVar;
    }

    public static a a() {
        return f;
    }

    private void c() {
        if (!this.c || this.b == null) {
            return;
        }
        Iterator<com.iab.omid.library.mobilefuse.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public void a(@NonNull Context context) {
        if (this.c) {
            return;
        }
        this.d.a(context);
        this.d.a(this);
        this.d.e();
        this.e = this.d.c();
        this.c = true;
    }

    @Override // com.iab.omid.library.mobilefuse.internal.d.a
    public void a(boolean z) {
        if (!this.e && z) {
            d();
        }
        this.e = z;
    }

    public Date b() {
        Date date = this.b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date a = this.a.a();
        Date date = this.b;
        if (date == null || a.after(date)) {
            this.b = a;
            c();
        }
    }
}
