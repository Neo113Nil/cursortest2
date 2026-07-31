package io.bidmachine.ads.networks.adaptiverendering;

import io.bidmachine.internal.AbstractC6013h;
import io.bidmachine.protobuf.rendering.Rendering;
import io.bidmachine.protobuf.rendering.RenderingTaskPermission;
import io.bidmachine.rendering.model.EventTaskParams;
import io.bidmachine.rendering.model.EventType;
import io.bidmachine.rendering.utils.NetworkRequestBuilder;
import io.bidmachine.util.network.ByteResponseProcessor;
import io.bidmachine.util.network.Method;
import io.bidmachine.util.network.NetworkError;
import io.bidmachine.util.network.NetworkRequest;
import io.bidmachine.util.network.ProtoRequestProcessor;
import io.bidmachine.util.network.ResponseProcessor;
import java.net.URLConnection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J_\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\u00042\u001a\u0010\u000f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lio/bidmachine/ads/networks/adaptiverendering/AdaptiveRenderingNetworkRequestBuilder;", "Lio/bidmachine/rendering/utils/NetworkRequestBuilder;", "<init>", "()V", "", "sourceName", "Lio/bidmachine/rendering/model/EventType;", "eventType", "eventValue", "", "Lio/bidmachine/rendering/model/EventTaskParams;", "eventTaskParamsList", "url", "Lkotlin/Function1;", "", "callback", "Lio/bidmachine/util/network/NetworkRequest;", "createRequestPermissionRequest", "(Ljava/lang/String;Lio/bidmachine/rendering/model/EventType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/bidmachine/util/network/NetworkRequest;", "a", "b", "c", "bidmachine-android-sdk_ba_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class AdaptiveRenderingNetworkRequestBuilder implements NetworkRequestBuilder {

    private static final class a implements NetworkRequest.Listener {
        private final Function1 a;

        public a(Function1 callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.a = callback;
        }

        @Override // io.bidmachine.util.network.NetworkRequest.Listener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(RenderingTaskPermission renderingTaskPermission) {
            RenderingTaskPermission.Response response;
            List<Rendering.Phase.Event.Task> eventTasksList;
            this.a.invoke((renderingTaskPermission == null || (response = renderingTaskPermission.getResponse()) == null || (eventTasksList = response.getEventTasksList()) == null) ? null : AbstractC6013h.b(eventTasksList));
        }

        @Override // io.bidmachine.util.network.NetworkRequest.Listener
        public void onError(NetworkError networkError) {
            Intrinsics.checkNotNullParameter(networkError, "networkError");
            this.a.invoke(null);
        }
    }

    private static final class b implements ProtoRequestProcessor {
        private final EventType a;
        private final String b;
        private final String c;
        private final List d;

        public b(EventType eventType, String sourceName, String str, List eventTaskParamsList) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            Intrinsics.checkNotNullParameter(sourceName, "sourceName");
            Intrinsics.checkNotNullParameter(eventTaskParamsList, "eventTaskParamsList");
            this.a = eventType;
            this.b = sourceName;
            this.c = str;
            this.d = eventTaskParamsList;
        }

        @Override // io.bidmachine.util.network.RequestProcessor
        public byte[] getBody() {
            RenderingTaskPermission.Request.Builder addAllEventTasks = RenderingTaskPermission.Request.newBuilder().setEventName(AbstractC6013h.a(this.a)).setEventSource(this.b).addAllEventTasks(AbstractC6013h.a(this.d));
            Intrinsics.checkNotNullExpressionValue(addAllEventTasks, "newBuilder()\n           …ist.mapToEventTaskList())");
            String str = this.c;
            if (str != null) {
                addAllEventTasks.setEventValue(str);
            }
            return RenderingTaskPermission.newBuilder().setRequest(addAllEventTasks).build().toByteArray();
        }

        @Override // io.bidmachine.util.network.ProtoRequestProcessor
        public String getMessageType() {
            return "bidmachine.protobuf.RenderingTaskPermission";
        }
    }

    private static final class c implements ResponseProcessor {
        private final ByteResponseProcessor a = new ByteResponseProcessor();

        @Override // io.bidmachine.util.network.ResponseProcessor
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RenderingTaskPermission process(URLConnection urlConnection) {
            Intrinsics.checkNotNullParameter(urlConnection, "urlConnection");
            RenderingTaskPermission parseFrom = RenderingTaskPermission.parseFrom(this.a.process(urlConnection));
            Intrinsics.checkNotNullExpressionValue(parseFrom, "parseFrom(byteResponsePr…r.process(urlConnection))");
            return parseFrom;
        }
    }

    @Override // io.bidmachine.rendering.utils.NetworkRequestBuilder
    @NotNull
    public NetworkRequest<?> createRequestPermissionRequest(@NotNull String sourceName, @NotNull EventType eventType, @Nullable String eventValue, @NotNull List<EventTaskParams> eventTaskParamsList, @NotNull String url, @NotNull Function1 callback) {
        Intrinsics.checkNotNullParameter(sourceName, "sourceName");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventTaskParamsList, "eventTaskParamsList");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new NetworkRequest.Builder(url, Method.Post).setRequestProcessor(new b(eventType, sourceName, eventValue, eventTaskParamsList)).setResponseProcessor(new c()).setListener(new a(callback)).build();
    }
}
