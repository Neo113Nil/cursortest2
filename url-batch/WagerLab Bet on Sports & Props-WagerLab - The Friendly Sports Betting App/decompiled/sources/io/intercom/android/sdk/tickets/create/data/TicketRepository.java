package io.intercom.android.sdk.tickets.create.data;

import io.intercom.android.nexus.NexusClient;
import io.intercom.android.sdk.AblyManager;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.CombinedEventAsFlowKt;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.navigation.CreateTicketDestinationKt;
import io.intercom.android.sdk.m5.upload.data.UploadRepository;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Ticket;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.tickets.list.data.TicketsResponse;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import okhttp3.RequestBody;

/* compiled from: TicketRepository.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ4\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0086@¢\u0006\u0002\u0010\u001bJ\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00122\u0006\u0010\u001e\u001a\u00020\u001fH\u0086@¢\u0006\u0002\u0010 J&\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00122\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010&J\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010(J,\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00122\u0006\u0010+\u001a\u00020\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0086@¢\u0006\u0002\u0010,J\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010(R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lio/intercom/android/sdk/tickets/create/data/TicketRepository;", "", MetricTracker.Place.API, "Lio/intercom/android/sdk/tickets/create/data/TicketApi;", "uploadRepository", "Lio/intercom/android/sdk/m5/upload/data/UploadRepository;", "nexusClient", "Lio/intercom/android/nexus/NexusClient;", "ablyManager", "Lio/intercom/android/sdk/AblyManager;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "<init>", "(Lio/intercom/android/sdk/tickets/create/data/TicketApi;Lio/intercom/android/sdk/m5/upload/data/UploadRepository;Lio/intercom/android/nexus/NexusClient;Lio/intercom/android/sdk/AblyManager;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;)V", "realTimeEvents", "Lkotlinx/coroutines/flow/Flow;", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent;", "createTicket", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/models/Ticket;", "conversationId", "", "ticketId", "", "attributes", "", "Lio/intercom/android/sdk/tickets/create/data/TicketAttributeRequest;", "(Ljava/lang/String;ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadFile", "Lio/intercom/android/sdk/models/Upload$Builder;", "data", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "(Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTickets", "Lio/intercom/android/sdk/tickets/list/data/TicketsResponse;", "page", "", "pageSize", "(JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTicketDetail", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTicketType", "Lio/intercom/android/sdk/blocks/lib/models/TicketTypeV2;", "ticketTypeId", "(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markAsRead", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TicketRepository {
    public static final int $stable = 8;
    private final AblyManager ablyManager;
    private final TicketApi api;
    private final IntercomDataLayer intercomDataLayer;
    private final NexusClient nexusClient;
    private final UploadRepository uploadRepository;

    public TicketRepository() {
        this(null, null, null, null, null, 31, null);
    }

    public TicketRepository(TicketApi api, UploadRepository uploadRepository, NexusClient nexusClient, AblyManager ablyManager, IntercomDataLayer intercomDataLayer) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(uploadRepository, "uploadRepository");
        Intrinsics.checkNotNullParameter(nexusClient, "nexusClient");
        Intrinsics.checkNotNullParameter(ablyManager, "ablyManager");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        this.api = api;
        this.uploadRepository = uploadRepository;
        this.nexusClient = nexusClient;
        this.ablyManager = ablyManager;
        this.intercomDataLayer = intercomDataLayer;
    }

    public /* synthetic */ TicketRepository(TicketApi ticketApi, UploadRepository uploadRepository, NexusClient nexusClient, AblyManager ablyManager, IntercomDataLayer intercomDataLayer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Injector.get().getTicketApi() : ticketApi, (i & 2) != 0 ? new UploadRepository(null, null, null, null, 15, null) : uploadRepository, (i & 4) != 0 ? Injector.get().getNexusClient() : nexusClient, (i & 8) != 0 ? Injector.get().getAblyManager() : ablyManager, (i & 16) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }

    public final Flow<ParsedNexusEvent> realTimeEvents() {
        return CombinedEventAsFlowKt.combinedEventAsFlow(this.nexusClient, this.ablyManager);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createTicket(String str, int i, List<TicketAttributeRequest> list, Continuation<? super NetworkResponse<Ticket>> continuation) {
        TicketRepository$createTicket$1 ticketRepository$createTicket$1;
        int i2;
        TicketRepository ticketRepository;
        NetworkResponse networkResponse;
        if (continuation instanceof TicketRepository$createTicket$1) {
            ticketRepository$createTicket$1 = (TicketRepository$createTicket$1) continuation;
            if ((ticketRepository$createTicket$1.label & Integer.MIN_VALUE) != 0) {
                ticketRepository$createTicket$1.label -= Integer.MIN_VALUE;
                Object obj = ticketRepository$createTicket$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = ticketRepository$createTicket$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    TicketApi ticketApi = this.api;
                    MessengerApiHelper messengerApiHelper = MessengerApiHelper.INSTANCE;
                    Map createMapBuilder = MapsKt.createMapBuilder();
                    String str2 = str;
                    if (str2 != null && !StringsKt.isBlank(str2)) {
                        createMapBuilder.put(CreateTicketDestinationKt.CONVERSATION_ID, str);
                    }
                    createMapBuilder.put("type_id", Boxing.boxInt(i));
                    createMapBuilder.put("attributes", list);
                    Unit unit = Unit.INSTANCE;
                    RequestBody defaultRequestBody$intercom_sdk_base_release = messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(MapsKt.build(createMapBuilder));
                    ticketRepository$createTicket$1.L$0 = this;
                    ticketRepository$createTicket$1.label = 1;
                    obj = ticketApi.createTicket(defaultRequestBody$intercom_sdk_base_release, ticketRepository$createTicket$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ticketRepository = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ticketRepository = (TicketRepository) ticketRepository$createTicket$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                networkResponse = (NetworkResponse) obj;
                if (networkResponse instanceof NetworkResponse.Success) {
                    ticketRepository.intercomDataLayer.updateTicket((Ticket) ((NetworkResponse.Success) networkResponse).getBody());
                }
                return networkResponse;
            }
        }
        ticketRepository$createTicket$1 = new TicketRepository$createTicket$1(this, continuation);
        Object obj2 = ticketRepository$createTicket$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = ticketRepository$createTicket$1.label;
        if (i2 != 0) {
        }
        networkResponse = (NetworkResponse) obj2;
        if (networkResponse instanceof NetworkResponse.Success) {
        }
        return networkResponse;
    }

    public final Object uploadFile(MediaData.Media media, Continuation<? super NetworkResponse<Upload.Builder>> continuation) {
        return this.uploadRepository.uploadFile(media, continuation);
    }

    public static /* synthetic */ Object fetchTickets$default(TicketRepository ticketRepository, long j, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 10;
        }
        return ticketRepository.fetchTickets(j, i, continuation);
    }

    public final Object fetchTickets(long j, int i, Continuation<? super NetworkResponse<TicketsResponse>> continuation) {
        return this.api.fetchTickets(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(MapsKt.mapOf(TuplesKt.to("page", Boxing.boxLong(j)), TuplesKt.to("per_page", Boxing.boxInt(i)))), continuation);
    }

    public final Object fetchTicketDetail(String str, Continuation<? super NetworkResponse<Ticket>> continuation) {
        return this.api.fetchTicketDetail(str, MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object fetchTicketType$default(TicketRepository ticketRepository, int i, List list, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        return ticketRepository.fetchTicketType(i, list, continuation);
    }

    public final Object fetchTicketType(int i, List<TicketAttributeRequest> list, Continuation<? super NetworkResponse<TicketTypeV2>> continuation) {
        return this.api.fetchTicketType(MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(MapsKt.mapOf(TuplesKt.to(CreateTicketDestinationKt.TICKET_TYPE_ID, Boxing.boxInt(i)), TuplesKt.to("attributes", list))), continuation);
    }

    public final Object markAsRead(String str, Continuation<? super NetworkResponse<Unit>> continuation) {
        return this.api.markAsRead(str, MessengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper.INSTANCE, null, 1, null), continuation);
    }
}
