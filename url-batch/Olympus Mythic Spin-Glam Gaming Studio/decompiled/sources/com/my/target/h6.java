package com.my.target;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.my.target.h6;
import com.my.target.instreamads.postview.InstreamAdPostViewPlayer;
import com.my.target.instreamads.postview.models.PostViewData;
import com.my.target.uj;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
/* loaded from: classes13.dex */
public final class h6 {
    private final d a;
    private final int b;
    private InstreamAdPostViewPlayer d;
    private long c = 0;
    private int e = 0;
    private boolean f = false;
    c g = null;
    private boolean h = true;
    private boolean i = false;
    private boolean j = false;
    ArrayList k = new ArrayList();

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class a implements c.a {
        final /* synthetic */ ue a;
        final /* synthetic */ int b;

        a(ue ueVar, int i) {
            this.a = ueVar;
            this.b = i;
        }

        @Override // com.my.target.h6.c.a
        public boolean a(int i) {
            return h6.this.a(i, this.b);
        }

        @Override // com.my.target.h6.c.a
        public void b() {
            h6.this.j = true;
        }

        @Override // com.my.target.h6.c.a
        public void c() {
            h6.this.a(this.a);
        }

        @Override // com.my.target.h6.c.a
        public void a() {
            h6.this.k();
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    class b implements View.OnAttachStateChangeListener {
        final /* synthetic */ ViewGroup a;
        final /* synthetic */ WeakReference b;

        b(ViewGroup viewGroup, WeakReference weakReference) {
            this.a = viewGroup;
            this.b = weakReference;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            h6.this.a(false);
            this.a.removeOnAttachStateChangeListener(this);
            h6.this.a(this.b);
            h6.this.k.remove(this.b);
            h6.this.c = SystemClock.elapsedRealtime();
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    public interface d {
        void a();

        void b();

        void onPostViewStart();
    }

    public h6(int i, d dVar) {
        this.a = dVar;
        this.b = i;
    }

    private void c() {
        InstreamAdPostViewPlayer instreamAdPostViewPlayer = this.d;
        if (instreamAdPostViewPlayer != null) {
            ViewGroup view = instreamAdPostViewPlayer.getView();
            if (view.isAttachedToWindow()) {
                uj ujVar = new uj(view.getContext());
                qi.b(ujVar, "viewability_view");
                ujVar.setStateChangedListener(new uj.a() { // from class: com.my.target.h6$$ExternalSyntheticLambda0
                    @Override // com.my.target.uj.a
                    public final void a(boolean z) {
                        h6.this.a(z);
                    }
                });
                view.addView(ujVar);
                WeakReference weakReference = new WeakReference(ujVar);
                this.k.add(weakReference);
                view.addOnAttachStateChangeListener(new b(view, weakReference));
                mi.b("InstreamAdPostViewCtrl", "ViewabilityView is added");
            }
        }
    }

    private boolean h() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((WeakReference) obj).get() != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a((WeakReference) obj);
        }
        this.k.clear();
        InstreamAdPostViewPlayer instreamAdPostViewPlayer = this.d;
        if (instreamAdPostViewPlayer != null) {
            instreamAdPostViewPlayer.hide();
            mi.b("InstreamAdPostViewCtrl", "Player is hidden");
        }
        if (this.j) {
            this.a.b();
            mi.b("InstreamAdPostViewCtrl", "PostView is canceled");
        } else {
            this.a.a();
            mi.b("InstreamAdPostViewCtrl", "PostView is completed");
        }
        this.j = false;
        this.i = false;
        this.e = 0;
    }

    public void a(InstreamAdPostViewPlayer instreamAdPostViewPlayer) {
        this.d = instreamAdPostViewPlayer;
    }

    public InstreamAdPostViewPlayer b() {
        return this.d;
    }

    public boolean d() {
        return this.e == 2;
    }

    public boolean e() {
        return this.e == 1;
    }

    public boolean f() {
        return e() || d();
    }

    public boolean g() {
        return b() != null && this.e == 0;
    }

    void j() {
        InstreamAdPostViewPlayer instreamAdPostViewPlayer;
        if (!e() || !this.f || this.g == null || (instreamAdPostViewPlayer = this.d) == null) {
            return;
        }
        instreamAdPostViewPlayer.pause();
        this.e = 2;
        mi.b("InstreamAdPostViewCtrl", "Player is paused");
    }

    void k() {
        if (!this.h && !h()) {
            this.i = true;
        } else if (this.d == null) {
            mi.b("InstreamAdPostViewCtrl", "PostView couldn't complete because player is null");
        } else {
            o0.e(new Runnable() { // from class: com.my.target.h6$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    h6.this.i();
                }
            });
        }
    }

    void l() {
        InstreamAdPostViewPlayer instreamAdPostViewPlayer;
        if (!d() || this.g == null || (instreamAdPostViewPlayer = this.d) == null) {
            return;
        }
        instreamAdPostViewPlayer.resume();
        this.e = 1;
        mi.b("InstreamAdPostViewCtrl", "Player is resumed");
    }

    public void a() {
        if (this.g != null && f()) {
            this.g.a();
            this.g = null;
            mi.b("InstreamAdPostViewCtrl", "Player is cancelled");
        }
    }

    public void b(ue ueVar) {
        if (g()) {
            this.f = ueVar.d();
            int b2 = (int) (ueVar.b() * 1000.0d);
            if (b2 == 0) {
                mi.b("InstreamAdPostViewCtrl", "Duration of PostViewInfo is 0. Skip playing.");
                return;
            }
            if (f()) {
                mi.b("InstreamAdPostViewCtrl", "Show was called while player is still playing");
                a();
            }
            this.h = true;
            c cVar = new c(new a(ueVar, b2));
            this.g = cVar;
            cVar.a(b2);
        }
    }

    /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
    static final class c {
        final a b;
        private Runnable f;
        private final zf a = zf.a(100);
        private int c = 0;
        private int d = 0;
        private boolean e = false;

        /* compiled from: r8-map-id-376f9cbbf0a7df308b3ad5c16a6608bc59316f0ad6051cf26b365c8cc4cd0036 */
        interface a {
            void a();

            boolean a(int i);

            void b();

            void c();
        }

        c(a aVar) {
            this.b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            if (this.e) {
                return;
            }
            int i = this.c;
            int i2 = this.d;
            if (i >= i2) {
                this.b.a(i2);
                b();
            } else if (this.b.a(i)) {
                this.c += 100;
            }
        }

        private void d() {
            e();
            Runnable runnable = new Runnable() { // from class: com.my.target.h6$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    h6.c.this.c();
                }
            };
            this.f = runnable;
            this.a.a(runnable);
        }

        private void e() {
            Runnable runnable = this.f;
            if (runnable != null) {
                this.a.b(runnable);
            }
            this.f = null;
        }

        void a(int i) {
            this.d = i;
            this.e = false;
            this.b.c();
            d();
        }

        void b() {
            this.c = 0;
            this.d = 0;
            e();
            this.b.a();
        }

        void a() {
            this.e = true;
            this.b.b();
            b();
        }
    }

    void a(ue ueVar) {
        InstreamAdPostViewPlayer instreamAdPostViewPlayer = this.d;
        if (instreamAdPostViewPlayer != null) {
            instreamAdPostViewPlayer.show(PostViewData.a(ueVar.a(), ueVar.e(), ueVar.b(), ueVar.c()));
            mi.b("InstreamAdPostViewCtrl", "Player is shown");
        }
        this.a.onPostViewStart();
        this.e = 1;
    }

    boolean a(int i, int i2) {
        boolean e = e();
        if (this.d != null) {
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            int i3 = 0;
            boolean z = false;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                uj ujVar = (uj) ((WeakReference) obj).get();
                if (ujVar != null) {
                    z = ujVar.getParent() == this.d.getView();
                    if (z) {
                        break;
                    }
                }
            }
            if (!z) {
                c();
            }
            if (h() && SystemClock.elapsedRealtime() - this.c > this.b && this.g != null) {
                mi.b("InstreamAdPostViewCtrl", "Container wasn't provided in " + this.b + "ms. PostView is completed.");
                this.g.b();
            }
            if (e) {
                this.d.updateProgress(i, i2);
            }
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WeakReference weakReference) {
        uj ujVar = (uj) weakReference.get();
        if (ujVar == null) {
            return;
        }
        ujVar.setStateChangedListener(null);
        ViewGroup viewGroup = (ViewGroup) ujVar.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(ujVar);
        }
        mi.b("InstreamAdPostViewCtrl", "ViewabilityView is removed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (this.h == z) {
            return;
        }
        this.h = z;
        if (!this.f) {
            if (this.i && z) {
                k();
                return;
            }
            return;
        }
        if (z) {
            if (this.i) {
                k();
                return;
            } else {
                l();
                return;
            }
        }
        j();
    }
}
