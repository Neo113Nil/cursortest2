package io.bidmachine.rendering.internal.adform.video;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import io.bidmachine.rendering.Repository;
import io.bidmachine.rendering.internal.adform.c;
import io.bidmachine.rendering.internal.adform.video.a;
import io.bidmachine.rendering.internal.adform.video.player.d;
import io.bidmachine.rendering.internal.j;
import io.bidmachine.rendering.internal.k;
import io.bidmachine.rendering.measurer.VideoMeasurer;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.MediaSource;
import io.bidmachine.rendering.model.Resource;
import io.bidmachine.rendering.model.ResourceSource;
import io.bidmachine.rendering.model.UrlResourceSource;
import io.bidmachine.rendering.utils.UiUtils;
import io.bidmachine.util.SystemComponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends io.bidmachine.rendering.internal.adform.a {
    private final VideoMeasurer s;
    private io.bidmachine.rendering.internal.adform.video.player.b t;

    /* renamed from: io.bidmachine.rendering.internal.adform.video.a$a, reason: collision with other inner class name */
    public final class C1782a implements d {
        public C1782a() {
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void a(io.bidmachine.rendering.internal.adform.video.player.b player, Error error) {
            Intrinsics.checkNotNullParameter(player, "player");
            Intrinsics.checkNotNullParameter(error, "error");
            a.this.b(error);
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void b(io.bidmachine.rendering.internal.adform.video.player.b player, Error error) {
            Intrinsics.checkNotNullParameter(player, "player");
            Intrinsics.checkNotNullParameter(error, "error");
            a.this.a(error);
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void c(io.bidmachine.rendering.internal.adform.video.player.b player) {
            Intrinsics.checkNotNullParameter(player, "player");
            VideoMeasurer videoMeasurer = a.this.s;
            if (videoMeasurer != null) {
                videoMeasurer.onMediaPaused();
            }
            a.this.n().h();
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void d(io.bidmachine.rendering.internal.adform.video.player.b player) {
            Intrinsics.checkNotNullParameter(player, "player");
            VideoMeasurer videoMeasurer = a.this.s;
            if (videoMeasurer != null) {
                videoMeasurer.onMediaSkipped();
            }
            a.this.n().d();
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void e(io.bidmachine.rendering.internal.adform.video.player.b player) {
            Intrinsics.checkNotNullParameter(player, "player");
            VideoMeasurer videoMeasurer = a.this.s;
            if (videoMeasurer != null) {
                videoMeasurer.onMediaThirdQuartile();
            }
            a.this.n().c();
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void f(io.bidmachine.rendering.internal.adform.video.player.b player) {
            Intrinsics.checkNotNullParameter(player, "player");
            VideoMeasurer videoMeasurer = a.this.s;
            if (videoMeasurer != null) {
                videoMeasurer.onViewReady(player.l());
            }
            a.this.q().b(a.this);
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void g(io.bidmachine.rendering.internal.adform.video.player.b player) {
            Intrinsics.checkNotNullParameter(player, "player");
            VideoMeasurer videoMeasurer = a.this.s;
            if (videoMeasurer != null) {
                videoMeasurer.onMediaStarted(player.f(), player.getVolume());
            }
            a.this.n().m();
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void h(io.bidmachine.rendering.internal.adform.video.player.b player) {
            Intrinsics.checkNotNullParameter(player, "player");
            VideoMeasurer videoMeasurer = a.this.s;
            if (videoMeasurer != null) {
                videoMeasurer.onMediaMidpoint();
            }
            a.this.n().j();
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void i(io.bidmachine.rendering.internal.adform.video.player.b player) {
            Intrinsics.checkNotNullParameter(player, "player");
            VideoMeasurer videoMeasurer = a.this.s;
            if (videoMeasurer != null) {
                videoMeasurer.onMediaCompleted();
            }
            a.this.n().a();
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void a(io.bidmachine.rendering.internal.adform.video.player.b player) {
            Intrinsics.checkNotNullParameter(player, "player");
            VideoMeasurer videoMeasurer = a.this.s;
            if (videoMeasurer != null) {
                videoMeasurer.onMediaFirstQuartile();
            }
            a.this.n().l();
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void b(io.bidmachine.rendering.internal.adform.video.player.b player) {
            Intrinsics.checkNotNullParameter(player, "player");
            a.this.z();
            VideoMeasurer videoMeasurer = a.this.s;
            if (videoMeasurer != null) {
                videoMeasurer.onMediaResumed();
            }
            a.this.n().b();
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void a(io.bidmachine.rendering.internal.adform.video.player.b player, long j) {
            Intrinsics.checkNotNullParameter(player, "player");
            a.this.n().a(player.f(), j);
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void a(io.bidmachine.rendering.internal.adform.video.player.b player, float f) {
            Intrinsics.checkNotNullParameter(player, "player");
            VideoMeasurer videoMeasurer = a.this.s;
            if (videoMeasurer != null) {
                videoMeasurer.onMediaVolumeChanged(f);
            }
        }

        @Override // io.bidmachine.rendering.internal.adform.video.player.d
        public void a(io.bidmachine.rendering.internal.adform.video.player.b player, boolean z) {
            Intrinsics.checkNotNullParameter(player, "player");
            View i = a.this.i();
            Integer valueOf = i != null ? Integer.valueOf(i.getId()) : null;
            if (z) {
                a.this.n().b(valueOf);
            } else {
                a.this.n().a(valueOf);
            }
        }
    }

    public final class b implements Repository.ResultCallback {
        public b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(a this$0, Uri uri) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(uri, "$uri");
            try {
                io.bidmachine.rendering.internal.adform.video.player.b bVar = this$0.t;
                if (bVar != null) {
                    bVar.a(uri);
                    bVar.prepare();
                }
            } catch (Throwable th) {
                k.b(th);
                this$0.a(Error.INSTANCE.create(th));
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.bidmachine.util.ResultCallback
        public void onError(Error error) {
            Intrinsics.checkNotNullParameter(error, "error");
            a.this.a(error);
        }

        @Override // io.bidmachine.rendering.Repository.ResultCallback, io.bidmachine.util.ResultCallback
        public void onSuccess(final Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            final a aVar = a.this;
            UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.internal.adform.video.a$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    a.b.a(a.this, uri);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, Object assetsHolder, Repository repository, AdElementParams adElementParams, c adFormListener, io.bidmachine.rendering.internal.event.b eventCallback, io.bidmachine.rendering.internal.detector.brokencreative.a aVar, VideoMeasurer videoMeasurer) {
        super(context, assetsHolder, repository, adElementParams, adFormListener, eventCallback, aVar);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(assetsHolder, "assetsHolder");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(adElementParams, "adElementParams");
        Intrinsics.checkNotNullParameter(adFormListener, "adFormListener");
        Intrinsics.checkNotNullParameter(eventCallback, "eventCallback");
        this.s = videoMeasurer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        io.bidmachine.rendering.internal.adform.video.player.b bVar = this$0.t;
        if (bVar != null) {
            bVar.pause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        io.bidmachine.rendering.internal.adform.video.player.b bVar = this$0.t;
        if (bVar != null) {
            bVar.play();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        io.bidmachine.rendering.internal.adform.video.player.b bVar = this$0.t;
        if (bVar != null) {
            bVar.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        io.bidmachine.rendering.internal.adform.video.player.b bVar = this$0.t;
        if (bVar != null) {
            bVar.d();
        }
    }

    public final void C() {
        UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.internal.adform.video.a$$ExternalSyntheticLambda6
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                a.d(a.this);
            }
        });
    }

    @Override // io.bidmachine.rendering.internal.u, io.bidmachine.rendering.internal.s
    public void d() {
        UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.internal.adform.video.a$$ExternalSyntheticLambda8
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                a.i(a.this);
            }
        });
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.b
    public void e() {
        super.e();
        UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.internal.adform.video.a$$ExternalSyntheticLambda1
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                a.f(a.this);
            }
        });
    }

    @Override // io.bidmachine.rendering.internal.u, io.bidmachine.rendering.internal.p
    public void j() {
        UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.internal.adform.video.a$$ExternalSyntheticLambda9
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                a.h(a.this);
            }
        });
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public View v() {
        io.bidmachine.rendering.internal.adform.video.player.b bVar = this.t;
        if (bVar != null) {
            return bVar.l();
        }
        return null;
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    protected void x() {
        Unit unit;
        VideoMeasurer videoMeasurer = this.s;
        if (videoMeasurer != null) {
            videoMeasurer.destroy(new j() { // from class: io.bidmachine.rendering.internal.adform.video.a$$ExternalSyntheticLambda5
                @Override // io.bidmachine.util.SafeRunnable
                public final void onRun() {
                    a.e(a.this);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C();
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.a
    public void z() {
        super.z();
        VideoMeasurer videoMeasurer = this.s;
        if (videoMeasurer != null) {
            videoMeasurer.onShown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        io.bidmachine.rendering.internal.adform.video.player.b bVar = this$0.t;
        if (bVar != null) {
            bVar.destroy();
        }
        this$0.t = null;
    }

    @Override // io.bidmachine.rendering.internal.adform.a, io.bidmachine.rendering.internal.b
    public void c() {
        UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.internal.adform.video.a$$ExternalSyntheticLambda0
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                a.g(a.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            io.bidmachine.rendering.internal.adform.video.player.b a = io.bidmachine.rendering.internal.adform.video.player.c.a(this$0.s(), str);
            a.a(this$0.new C1782a());
            VideoMeasurer videoMeasurer = this$0.s;
            if (videoMeasurer != null) {
                videoMeasurer.onViewCreated(a.l());
            }
            this$0.t = a;
        } catch (Throwable th) {
            k.b(th);
            this$0.a(Error.INSTANCE.create(th));
        }
    }

    @Override // io.bidmachine.rendering.internal.b
    public void b() {
        final String customParam;
        Resource resource = g().getResource();
        List<String> list = null;
        ResourceSource source = resource != null ? resource.getSource() : null;
        if (source != null) {
            if (source instanceof UrlResourceSource) {
                list = ((UrlResourceSource) source).getUrls();
            } else {
                b("Invalid resource type (" + source.getClass().getSimpleName() + "), it should be UrlResourceSource");
            }
        } else {
            String source2 = g().getSource();
            if (source2 != null) {
                list = CollectionsKt.listOf(source2);
            }
        }
        MediaSource fromUrls = MediaSource.INSTANCE.fromUrls(list == null ? CollectionsKt.emptyList() : list);
        if (fromUrls == null) {
            a(new Error("Invalid adm url (" + list + ')'));
            return;
        }
        if (fromUrls.getDeliveryType() == MediaSource.DeliveryType.STREAM) {
            customParam = "exo";
        } else {
            customParam = g().getCustomParam("player");
        }
        UiUtils.onUiThread(new Runnable() { // from class: io.bidmachine.rendering.internal.adform.video.a$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                a.a(a.this, customParam);
            }
        });
        u().getVideo(fromUrls, t(), new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(a this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.C();
    }

    @Override // io.bidmachine.rendering.internal.b
    public void a(final ViewGroup rootContainer) {
        Intrinsics.checkNotNullParameter(rootContainer, "rootContainer");
        UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.internal.adform.video.a$$ExternalSyntheticLambda2
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                a.a(a.this, rootContainer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a this$0, ViewGroup rootContainer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(rootContainer, "$rootContainer");
        io.bidmachine.rendering.internal.adform.video.player.b bVar = this$0.t;
        VideoMeasurer videoMeasurer = this$0.s;
        if (videoMeasurer == null || bVar == null) {
            return;
        }
        videoMeasurer.onViewAddedToContainer(bVar.l(), rootContainer);
    }

    @Override // io.bidmachine.rendering.internal.u
    public void a(SystemComponent systemComponent) {
        VideoMeasurer videoMeasurer = this.s;
        if (videoMeasurer != null) {
            videoMeasurer.onClicked();
        }
        super.a(systemComponent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        io.bidmachine.rendering.internal.adform.video.player.b bVar = this$0.t;
        if (bVar != null) {
            bVar.b(num);
        }
    }

    @Override // io.bidmachine.rendering.internal.u, io.bidmachine.rendering.internal.m
    public void a(final Integer num) {
        UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.internal.adform.video.a$$ExternalSyntheticLambda7
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                a.b(a.this, num);
            }
        });
    }

    @Override // io.bidmachine.rendering.internal.u, io.bidmachine.rendering.internal.e
    public void a() {
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Error error) {
        VideoMeasurer videoMeasurer = this.s;
        if (videoMeasurer != null) {
            videoMeasurer.onError(error);
        }
        q().c(this, error);
    }

    @Override // io.bidmachine.rendering.internal.u, io.bidmachine.rendering.internal.m
    public void b(final Integer num) {
        UiUtils.onUiThread(new j() { // from class: io.bidmachine.rendering.internal.adform.video.a$$ExternalSyntheticLambda3
            @Override // io.bidmachine.util.SafeRunnable
            public final void onRun() {
                a.a(a.this, num);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(a this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        io.bidmachine.rendering.internal.adform.video.player.b bVar = this$0.t;
        if (bVar != null) {
            bVar.a(num);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Error error) {
        VideoMeasurer videoMeasurer = this.s;
        if (videoMeasurer != null) {
            videoMeasurer.onError(error);
        }
        q().a(this, error);
    }
}
