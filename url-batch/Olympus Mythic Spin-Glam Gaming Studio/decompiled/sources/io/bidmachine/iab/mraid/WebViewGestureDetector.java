package io.bidmachine.iab.mraid;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lio/bidmachine/iab/mraid/WebViewGestureDetector;", "Landroid/view/GestureDetector;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lio/bidmachine/iab/mraid/WebViewGestureDetector$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "(Landroid/content/Context;Lio/bidmachine/iab/mraid/WebViewGestureDetector$a;)V", "", "resetClick", "()V", "", "isClicked", "()Z", "", "getClickTimeMs", "()J", "a", "Lio/bidmachine/iab/mraid/WebViewGestureDetector$a;", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class WebViewGestureDetector extends GestureDetector {

    /* renamed from: a, reason: from kotlin metadata */
    private final a listener;

    private static final class a extends GestureDetector.SimpleOnGestureListener {
        private boolean a;
        private volatile long b;

        public final long a() {
            return this.b;
        }

        public final boolean b() {
            return this.a;
        }

        public final void c() {
            this.a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e) {
            Intrinsics.checkNotNullParameter(e, "e");
            this.a = true;
            this.b = System.currentTimeMillis();
            return super.onSingleTapUp(e);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebViewGestureDetector(@NotNull Context context) {
        this(context, new a());
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final long getClickTimeMs() {
        return this.listener.a();
    }

    public final boolean isClicked() {
        return this.listener.b();
    }

    public final void resetClick() {
        this.listener.c();
    }

    private WebViewGestureDetector(Context context, a aVar) {
        super(context, aVar);
        this.listener = aVar;
        setIsLongpressEnabled(false);
    }
}
