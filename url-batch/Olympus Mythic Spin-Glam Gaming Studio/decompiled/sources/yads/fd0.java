package yads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes15.dex */
public final class fd0 implements q30 {
    public final Context a;
    public final ArrayList b;
    public final q30 c;
    public au0 d;
    public yh e;
    public kz f;
    public q30 g;
    public oa3 h;
    public o30 i;
    public fm2 j;
    public q30 k;

    public fd0(Context context, q30 q30Var) {
        this.a = context.getApplicationContext();
        q30Var.getClass();
        this.c = q30Var;
        this.b = new ArrayList();
    }

    @Override // yads.q30
    public final void a(h93 h93Var) {
        h93Var.getClass();
        this.c.a(h93Var);
        this.b.add(h93Var);
        au0 au0Var = this.d;
        if (au0Var != null) {
            au0Var.a(h93Var);
        }
        yh yhVar = this.e;
        if (yhVar != null) {
            yhVar.a(h93Var);
        }
        kz kzVar = this.f;
        if (kzVar != null) {
            kzVar.a(h93Var);
        }
        q30 q30Var = this.g;
        if (q30Var != null) {
            q30Var.a(h93Var);
        }
        oa3 oa3Var = this.h;
        if (oa3Var != null) {
            oa3Var.a(h93Var);
        }
        o30 o30Var = this.i;
        if (o30Var != null) {
            o30Var.a(h93Var);
        }
        fm2 fm2Var = this.j;
        if (fm2Var != null) {
            fm2Var.a(h93Var);
        }
    }

    @Override // yads.q30
    public final Map b() {
        q30 q30Var = this.k;
        return q30Var == null ? Collections.emptyMap() : q30Var.b();
    }

    @Override // yads.n30
    public final int c(byte[] bArr, int i, int i2) {
        q30 q30Var = this.k;
        q30Var.getClass();
        return q30Var.c(bArr, i, i2);
    }

    @Override // yads.q30
    public final void close() {
        q30 q30Var = this.k;
        if (q30Var != null) {
            try {
                q30Var.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // yads.q30
    public final Uri d() {
        q30 q30Var = this.k;
        if (q30Var == null) {
            return null;
        }
        return q30Var.d();
    }

    @Override // yads.q30
    public final long a(v30 v30Var) {
        if (this.k == null) {
            String scheme = v30Var.a.getScheme();
            Uri uri = v30Var.a;
            int i = sb3.a;
            String scheme2 = uri.getScheme();
            if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
                if ("asset".equals(scheme)) {
                    if (this.e == null) {
                        yh yhVar = new yh(this.a);
                        this.e = yhVar;
                        a(yhVar);
                    }
                    this.k = this.e;
                } else if ("content".equals(scheme)) {
                    if (this.f == null) {
                        kz kzVar = new kz(this.a);
                        this.f = kzVar;
                        a(kzVar);
                    }
                    this.k = this.f;
                } else if ("rtmp".equals(scheme)) {
                    if (this.g == null) {
                        try {
                            q30 q30Var = (q30) Class.forName("com.monetization.ads.exo.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                            this.g = q30Var;
                            a(q30Var);
                        } catch (ClassNotFoundException unused) {
                            gh1.d("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                        } catch (Exception e) {
                            throw new RuntimeException("Error instantiating RTMP extension", e);
                        }
                        if (this.g == null) {
                            this.g = this.c;
                        }
                    }
                    this.k = this.g;
                } else if ("udp".equals(scheme)) {
                    if (this.h == null) {
                        oa3 oa3Var = new oa3();
                        this.h = oa3Var;
                        a(oa3Var);
                    }
                    this.k = this.h;
                } else if ("data".equals(scheme)) {
                    if (this.i == null) {
                        o30 o30Var = new o30();
                        this.i = o30Var;
                        a(o30Var);
                    }
                    this.k = this.i;
                } else if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                    this.k = this.c;
                } else {
                    if (this.j == null) {
                        fm2 fm2Var = new fm2(this.a);
                        this.j = fm2Var;
                        a(fm2Var);
                    }
                    this.k = this.j;
                }
            } else {
                String path = v30Var.a.getPath();
                if (path != null && path.startsWith("/android_asset/")) {
                    if (this.e == null) {
                        yh yhVar2 = new yh(this.a);
                        this.e = yhVar2;
                        a(yhVar2);
                    }
                    this.k = this.e;
                } else {
                    if (this.d == null) {
                        au0 au0Var = new au0();
                        this.d = au0Var;
                        a(au0Var);
                    }
                    this.k = this.d;
                }
            }
            return this.k.a(v30Var);
        }
        throw new IllegalStateException();
    }

    public final void a(q30 q30Var) {
        for (int i = 0; i < this.b.size(); i++) {
            q30Var.a((h93) this.b.get(i));
        }
    }
}
