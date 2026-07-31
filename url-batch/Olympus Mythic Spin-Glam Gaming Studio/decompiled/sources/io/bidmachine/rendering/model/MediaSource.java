package io.bidmachine.rendering.model;

import android.webkit.MimeTypeMap;
import io.bidmachine.rendering.internal.g;
import io.bidmachine.util.Utils;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, d2 = {"Lio/bidmachine/rendering/model/MediaSource;", "", "Lio/bidmachine/rendering/model/MediaSource$DeliveryType;", "deliveryType", "<init>", "(Lio/bidmachine/rendering/model/MediaSource$DeliveryType;)V", "a", "Lio/bidmachine/rendering/model/MediaSource$DeliveryType;", "getDeliveryType", "()Lio/bidmachine/rendering/model/MediaSource$DeliveryType;", "Companion", "DeliveryType", "Lio/bidmachine/rendering/model/Base64MediaSource;", "Lio/bidmachine/rendering/model/UrlMediaSource;", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public abstract class MediaSource {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    private final DeliveryType deliveryType;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lio/bidmachine/rendering/model/MediaSource$Companion;", "", "()V", "EXTENSION_VIDEO_STREAMABLE_M3U8", "", "from", "Lio/bidmachine/rendering/model/MediaSource;", "input", "fromBase64", "fromDefaultSettings", "fromUrl", "fromUrls", "", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {

        static final class a extends Lambda implements Function1 {
            public static final a a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Utils.getValidUrl(it);
            }
        }

        static final class b extends Lambda implements Function1 {
            public static final b a = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(Utils.isHttpUrl(it));
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final MediaSource from(@Nullable String input) {
            MediaSource fromDefaultSettings = fromDefaultSettings(input);
            if (fromDefaultSettings != null) {
                return fromDefaultSettings;
            }
            MediaSource fromUrl = fromUrl(input);
            if (fromUrl != null) {
                return fromUrl;
            }
            if (input != null) {
                return fromBase64(input);
            }
            return null;
        }

        @Nullable
        public final MediaSource fromBase64(@Nullable String input) {
            if (input == null) {
                return null;
            }
            if (StringsKt.isBlank(input)) {
                input = null;
            }
            if (input != null) {
                return new Base64MediaSource(input);
            }
            return null;
        }

        @Nullable
        public final MediaSource fromDefaultSettings(@Nullable String input) {
            try {
                String a2 = g.a.a(input);
                if (a2 != null) {
                    return MediaSource.INSTANCE.fromBase64(a2);
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        @Nullable
        public final MediaSource fromUrl(@Nullable String input) {
            if (input == null) {
                return null;
            }
            return fromUrls(CollectionsKt.listOf(input));
        }

        @Nullable
        public final MediaSource fromUrls(@NotNull List<String> input) {
            boolean z;
            Intrinsics.checkNotNullParameter(input, "input");
            List list = SequencesKt.toList(SequencesKt.filter(SequencesKt.mapNotNull(CollectionsKt.asSequence(input), a.a), b.a));
            Object obj = null;
            if (list.isEmpty()) {
                return null;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                try {
                    z = StringsKt.contentEquals(MimeTypeMap.getFileExtensionFromUrl((String) next), "m3u8", true);
                } catch (Throwable unused) {
                    z = false;
                }
                if (z) {
                    obj = next;
                    break;
                }
            }
            String str = (String) obj;
            return str != null ? new UrlMediaSource(str, DeliveryType.STREAM) : new UrlMediaSource((List<String>) list, DeliveryType.PRELOAD);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lio/bidmachine/rendering/model/MediaSource$DeliveryType;", "", "(Ljava/lang/String;I)V", "PRELOAD", "STREAM", "bidmachine-android-sdk_bb_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum DeliveryType {
        PRELOAD,
        STREAM
    }

    public /* synthetic */ MediaSource(DeliveryType deliveryType, DefaultConstructorMarker defaultConstructorMarker) {
        this(deliveryType);
    }

    @Nullable
    public static final MediaSource from(@Nullable String str) {
        return INSTANCE.from(str);
    }

    @Nullable
    public static final MediaSource fromBase64(@Nullable String str) {
        return INSTANCE.fromBase64(str);
    }

    @Nullable
    public static final MediaSource fromDefaultSettings(@Nullable String str) {
        return INSTANCE.fromDefaultSettings(str);
    }

    @Nullable
    public static final MediaSource fromUrl(@Nullable String str) {
        return INSTANCE.fromUrl(str);
    }

    @Nullable
    public static final MediaSource fromUrls(@NotNull List<String> list) {
        return INSTANCE.fromUrls(list);
    }

    @NotNull
    public DeliveryType getDeliveryType() {
        return this.deliveryType;
    }

    private MediaSource(DeliveryType deliveryType) {
        this.deliveryType = deliveryType;
    }
}
