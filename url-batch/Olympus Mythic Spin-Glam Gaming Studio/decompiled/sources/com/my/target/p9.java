package com.my.target;

import android.content.Context;
import android.view.View;
import com.my.target.g;
import com.my.target.g2;
import com.my.target.z9;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes3.dex */
public class p9 implements z9 {
    private final z9.a a;
    private final q9 b;
    private f c;
    h2 d = h2.a();

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements View.OnClickListener {
        final /* synthetic */ e a;

        a(e eVar) {
            this.a = eVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p9.this.a(view.getContext(), this.a);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class b implements g.a {
        final /* synthetic */ com.my.target.b a;

        b(com.my.target.b bVar) {
            this.a = bVar;
        }

        @Override // com.my.target.g.a
        public void b() {
            p9.this.a.b(this.a);
        }
    }

    p9(q9 q9Var, z9.a aVar) {
        this.b = q9Var;
        this.a = aVar;
    }

    public static p9 a(Context context, z9.a aVar) {
        return new p9(new q9(context), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(r8 r8Var, View view) {
        this.a.a(r8Var);
    }

    @Override // com.my.target.z9
    public void destroy() {
    }

    @Override // com.my.target.z9
    public View getCloseButton() {
        return this.b.getCloseButton();
    }

    @Override // com.my.target.z9
    public View i() {
        return this.b;
    }

    @Override // com.my.target.z9
    public void pause() {
    }

    @Override // com.my.target.z9
    public void resume() {
    }

    @Override // com.my.target.z9
    public void stop() {
    }

    public void a(final r8 r8Var) {
        this.b.a(r8Var.e0(), r8Var.f0(), r8Var.Z());
        this.b.setAgeRestrictions(r8Var.d());
        this.b.getImageView().setOnClickListener(new View.OnClickListener() { // from class: com.my.target.p9$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p9.this.a(r8Var, view);
            }
        });
        this.b.getImageView().setOnTouchListener(new g2(new g2.a() { // from class: com.my.target.p9$$ExternalSyntheticLambda1
            @Override // com.my.target.g2.a
            public final void a(h2 h2Var) {
                p9.this.a(h2Var);
            }
        }));
        this.b.getCloseButton().setOnClickListener(new View.OnClickListener() { // from class: com.my.target.p9$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p9.this.b(r8Var, view);
            }
        });
        a((com.my.target.b) r8Var);
        this.a.a(r8Var, this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(r8 r8Var, View view) {
        n2 a2;
        if (r8Var.f().b()) {
            a2 = t2.a(8, this.d);
        } else {
            a2 = q2.a();
        }
        this.a.a(r8Var, null, 1, s2.a(a2), view.getContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h2 h2Var) {
        this.d = h2Var;
    }

    void a(Context context, e eVar) {
        f fVar = this.c;
        if (fVar == null || !fVar.b()) {
            f fVar2 = this.c;
            if (fVar2 == null) {
                a7.a(eVar.c(), context);
            } else {
                fVar2.a(context);
            }
        }
    }

    private void a(com.my.target.b bVar) {
        e a2 = bVar.a();
        if (a2 == null) {
            return;
        }
        this.b.a(a2, new a(a2));
        if (a2.b() == null) {
            return;
        }
        f a3 = f.a(a2, new r3());
        this.c = a3;
        a3.a(new b(bVar));
    }
}
