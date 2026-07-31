package io.ktor.http.cio;

import io.ktor.utils.io.ByteReadChannel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import kotlinx.io.Source;

/* compiled from: Multipart.kt */
/* loaded from: classes10.dex */
public abstract class MultipartEvent {
    public /* synthetic */ MultipartEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MultipartEvent() {
    }

    /* compiled from: Multipart.kt */
    public static final class Preamble extends MultipartEvent {
        private final Source body;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Preamble(Source body) {
            super(null);
            Intrinsics.checkNotNullParameter(body, "body");
            this.body = body;
        }
    }

    /* compiled from: Multipart.kt */
    public static final class MultipartPart extends MultipartEvent {
        private final ByteReadChannel body;
        private final Deferred headers;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipartPart(Deferred headers, ByteReadChannel body) {
            super(null);
            Intrinsics.checkNotNullParameter(headers, "headers");
            Intrinsics.checkNotNullParameter(body, "body");
            this.headers = headers;
            this.body = body;
        }
    }

    /* compiled from: Multipart.kt */
    public static final class Epilogue extends MultipartEvent {
        private final Source body;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Epilogue(Source body) {
            super(null);
            Intrinsics.checkNotNullParameter(body, "body");
            this.body = body;
        }
    }
}
