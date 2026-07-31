package io.intercom.android.sdk.m5.conversation.usecase;

import android.app.Application;
import android.content.Context;
import com.facebook.share.internal.ShareConstants;
import expo.modules.notifications.serverregistration.InstallationId;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.utils.MediaCompressionKt;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.utilities.BitmapUtilsKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: SendMediaUseCase.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ<\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0086B¢\u0006\u0002\u0010\u001dJ:\u0010\u001e\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010\u001dJ<\u0010\u001f\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/SendMediaUseCase;", "", "sendMessageUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase;", "conversationRepository", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "userIdentity", "Lio/intercom/android/sdk/identity/UserIdentity;", "applicationContext", "Landroid/content/Context;", "attachmentSettings", "Lkotlin/Function0;", "Lio/intercom/android/sdk/models/AttachmentSettings;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase;Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;Lio/intercom/android/sdk/identity/UserIdentity;Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "getSendMessageUseCase", "()Lio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase;", "invoke", "", "clientState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "uiEffect", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiEffect;", "mediaData", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", InstallationId.LEGACY_PREFERENCES_UUID_KEY, "", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlinx/coroutines/flow/MutableSharedFlow;Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMedia", "sendMediaNewWay", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SendMediaUseCase {
    public static final int $stable = 8;
    private final Context applicationContext;
    private final Function0<AttachmentSettings> attachmentSettings;
    private final ConversationRepository conversationRepository;
    private final SendMessageUseCase sendMessageUseCase;
    private final UserIdentity userIdentity;

    public SendMediaUseCase(SendMessageUseCase sendMessageUseCase, ConversationRepository conversationRepository, UserIdentity userIdentity, Context applicationContext, Function0<AttachmentSettings> attachmentSettings) {
        Intrinsics.checkNotNullParameter(sendMessageUseCase, "sendMessageUseCase");
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(attachmentSettings, "attachmentSettings");
        this.sendMessageUseCase = sendMessageUseCase;
        this.conversationRepository = conversationRepository;
        this.userIdentity = userIdentity;
        this.applicationContext = applicationContext;
        this.attachmentSettings = attachmentSettings;
    }

    public final SendMessageUseCase getSendMessageUseCase() {
        return this.sendMessageUseCase;
    }

    public /* synthetic */ SendMediaUseCase(SendMessageUseCase sendMessageUseCase, ConversationRepository conversationRepository, UserIdentity userIdentity, Application application, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sendMessageUseCase, conversationRepository, (i & 4) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i & 8) != 0 ? Injector.get().getApplication() : application, (i & 16) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AttachmentSettings _init_$lambda$0;
                _init_$lambda$0 = SendMediaUseCase._init_$lambda$0();
                return _init_$lambda$0;
            }
        } : function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AttachmentSettings _init_$lambda$0() {
        return Injector.get().getAppConfigProvider().get().getAttachmentSettings();
    }

    public static /* synthetic */ Object invoke$default(SendMediaUseCase sendMediaUseCase, MutableStateFlow mutableStateFlow, MutableSharedFlow mutableSharedFlow, MediaData.Media media, String str, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            str = UUID.randomUUID().toString();
        }
        return sendMediaUseCase.invoke(mutableStateFlow, mutableSharedFlow, media, str, continuation);
    }

    public final Object invoke(MutableStateFlow<ConversationClientState> mutableStateFlow, MutableSharedFlow<ConversationUiEffect> mutableSharedFlow, MediaData.Media media, String str, Continuation<? super Unit> continuation) {
        Object sendMedia = sendMedia(mutableStateFlow, mutableSharedFlow, media, str, continuation);
        return sendMedia == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? sendMedia : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0354, code lost:
    
        if (r7.invoke(r3, r4, r2, r5) == r6) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e2 A[LOOP:1: B:52:0x01e2->B:69:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendMedia(MutableStateFlow<ConversationClientState> mutableStateFlow, MutableSharedFlow<ConversationUiEffect> mutableSharedFlow, MediaData.Media media, String str, Continuation<? super Unit> continuation) {
        SendMediaUseCase$sendMedia$1 sendMediaUseCase$sendMedia$1;
        int i;
        Block.Builder withType;
        ConversationClientState value;
        ConversationClientState conversationClientState;
        LinkedHashMap linkedHashMap;
        SendMediaUseCase sendMediaUseCase;
        MutableSharedFlow mutableSharedFlow2;
        MediaData.Media media2;
        MutableStateFlow<ConversationClientState> mutableStateFlow2;
        MediaData.Media media3;
        String str2;
        ConversationClientState value2;
        ConversationClientState conversationClientState2;
        LinkedHashMap linkedHashMap2;
        NetworkResponse networkResponse;
        PendingMessage pendingMessage;
        ConversationClientState value3;
        ConversationClientState conversationClientState3;
        LinkedHashMap linkedHashMap3;
        Block.Builder withType2;
        MutableStateFlow<ConversationClientState> mutableStateFlow3 = mutableStateFlow;
        MediaData.Media.Image image = media;
        String str3 = str;
        if (continuation instanceof SendMediaUseCase$sendMedia$1) {
            sendMediaUseCase$sendMedia$1 = (SendMediaUseCase$sendMedia$1) continuation;
            if ((sendMediaUseCase$sendMedia$1.label & Integer.MIN_VALUE) != 0) {
                sendMediaUseCase$sendMedia$1.label -= Integer.MIN_VALUE;
                Object obj = sendMediaUseCase$sendMedia$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sendMediaUseCase$sendMedia$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    boolean z = image instanceof MediaData.Media.Image;
                    if (z) {
                        MediaData.Media.Image image2 = (MediaData.Media.Image) image;
                        withType = new Block.Builder().withLocalUri(image2.getUri()).withWidth(image2.getWidth()).withHeight(image2.getHeight()).withType(ShareConstants.IMAGE_URL);
                        Intrinsics.checkNotNull(withType);
                    } else {
                        if (!(image instanceof MediaData.Media.Video) && !(image instanceof MediaData.Media.Other)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        withType = new Block.Builder().withAttachments(CollectionsKt.listOf(new BlockAttachment.Builder().withName(image.getFileName()).withUrl(image.getUri().toString()).withContentType(image.getMimeType()).build())).withType("LOCAL_ATTACHMENT");
                        Intrinsics.checkNotNull(withType);
                    }
                    Part build = new Part.Builder().withBlocks(CollectionsKt.listOf(withType)).withParticipantIsAdmin(false).withClientAssignedUuid(str3).build();
                    build.setParticipant(new Participant.Builder().withId(this.userIdentity.getIntercomId()).build());
                    build.setMessageState(Part.MessageState.SENDING);
                    do {
                        value = mutableStateFlow3.getValue();
                        conversationClientState = value;
                        linkedHashMap = new LinkedHashMap();
                        linkedHashMap.putAll(conversationClientState.getPendingMessages());
                        Intrinsics.checkNotNull(build);
                        linkedHashMap.put(str3, new PendingMessage(build, false, null));
                    } while (!mutableStateFlow3.compareAndSet(value, ConversationClientState.copy$default(conversationClientState, linkedHashMap, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194302, null)));
                    if (z) {
                        MediaData.Media.Image image3 = (MediaData.Media.Image) image;
                        if (image3.getExifData().isEmpty()) {
                            image = MediaData.Media.Image.copy$default(image3, null, 0, 0, 0L, null, null, BitmapUtilsKt.extractExifData(this.applicationContext, image3.getUri()), 63, null);
                        }
                    }
                    Context context = this.applicationContext;
                    sendMediaUseCase$sendMedia$1.L$0 = this;
                    sendMediaUseCase$sendMedia$1.L$1 = mutableStateFlow3;
                    sendMediaUseCase$sendMedia$1.L$2 = mutableSharedFlow;
                    sendMediaUseCase$sendMedia$1.L$3 = str3;
                    sendMediaUseCase$sendMedia$1.label = 1;
                    obj = MediaCompressionKt.getCompressedMediaData(image, context, sendMediaUseCase$sendMedia$1);
                    if (obj != coroutine_suspended) {
                        sendMediaUseCase = this;
                        mutableSharedFlow2 = mutableSharedFlow;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            media3 = (MediaData.Media) sendMediaUseCase$sendMedia$1.L$3;
                            str2 = (String) sendMediaUseCase$sendMedia$1.L$2;
                            mutableStateFlow2 = (MutableStateFlow) sendMediaUseCase$sendMedia$1.L$1;
                            sendMediaUseCase = (SendMediaUseCase) sendMediaUseCase$sendMedia$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            networkResponse = (NetworkResponse) obj;
                            if (!(networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
                                pendingMessage = mutableStateFlow2.getValue().getPendingMessages().get(str2);
                                if (pendingMessage != null) {
                                    PendingMessage copy$default = PendingMessage.copy$default(pendingMessage, null, false, new PendingMessage.FailedImageUploadData(str2, media3), 3, null);
                                    do {
                                        value3 = mutableStateFlow2.getValue();
                                        conversationClientState3 = value3;
                                        linkedHashMap3 = new LinkedHashMap();
                                        linkedHashMap3.putAll(conversationClientState3.getPendingMessages());
                                        linkedHashMap3.put(str2, copy$default);
                                    } while (!mutableStateFlow2.compareAndSet(value3, ConversationClientState.copy$default(conversationClientState3, linkedHashMap3, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194302, null)));
                                }
                            } else {
                                if (!(networkResponse instanceof NetworkResponse.Success)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Upload build2 = ((Upload.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
                                if (media3 instanceof MediaData.Media.Image) {
                                    MediaData.Media.Image image4 = (MediaData.Media.Image) media3;
                                    withType2 = new Block.Builder().withUrl(build2.getPublicUrl()).withWidth(image4.getWidth()).withHeight(image4.getHeight()).withType(BlockType.IMAGE.getSerializedName());
                                } else {
                                    if (!(media3 instanceof MediaData.Media.Video) && !(media3 instanceof MediaData.Media.Other)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    withType2 = new Block.Builder().withAttachments(CollectionsKt.listOf(new BlockAttachment.Builder().withName(media3.getFileName()).withId(build2.getId()).withSize(media3.getSize()).withUrl(build2.getPublicUrl()).withContentType(media3.getMimeType()).build())).withType(BlockType.ATTACHMENTLIST.getSerializedName());
                                }
                                SendMessageUseCase sendMessageUseCase = sendMediaUseCase.sendMessageUseCase;
                                List<Block.Builder> listOf = CollectionsKt.listOf(withType2);
                                sendMediaUseCase$sendMedia$1.L$0 = media3;
                                sendMediaUseCase$sendMedia$1.L$1 = null;
                                sendMediaUseCase$sendMedia$1.L$2 = null;
                                sendMediaUseCase$sendMedia$1.L$3 = null;
                                sendMediaUseCase$sendMedia$1.label = 4;
                            }
                            MediaCompressionKt.deleteCompressedMedia(media3.getUri());
                            return Unit.INSTANCE;
                        }
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    media3 = (MediaData.Media) sendMediaUseCase$sendMedia$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    MediaCompressionKt.deleteCompressedMedia(media3.getUri());
                    return Unit.INSTANCE;
                }
                String str4 = (String) sendMediaUseCase$sendMedia$1.L$3;
                mutableSharedFlow2 = (MutableSharedFlow) sendMediaUseCase$sendMedia$1.L$2;
                MutableStateFlow<ConversationClientState> mutableStateFlow4 = (MutableStateFlow) sendMediaUseCase$sendMedia$1.L$1;
                sendMediaUseCase = (SendMediaUseCase) sendMediaUseCase$sendMedia$1.L$0;
                ResultKt.throwOnFailure(obj);
                str3 = str4;
                mutableStateFlow3 = mutableStateFlow4;
                media2 = (MediaData.Media) obj;
                if (media2.getSize() > sendMediaUseCase.attachmentSettings.invoke().getUploadSizeLimit()) {
                    ConversationRepository conversationRepository = sendMediaUseCase.conversationRepository;
                    sendMediaUseCase$sendMedia$1.L$0 = sendMediaUseCase;
                    sendMediaUseCase$sendMedia$1.L$1 = mutableStateFlow3;
                    sendMediaUseCase$sendMedia$1.L$2 = str3;
                    sendMediaUseCase$sendMedia$1.L$3 = media2;
                    sendMediaUseCase$sendMedia$1.label = 3;
                    Object uploadMedia = conversationRepository.uploadMedia(media2, sendMediaUseCase$sendMedia$1);
                    if (uploadMedia != coroutine_suspended) {
                        String str5 = str3;
                        mutableStateFlow2 = mutableStateFlow3;
                        media3 = media2;
                        obj = uploadMedia;
                        str2 = str5;
                        networkResponse = (NetworkResponse) obj;
                        if (!(networkResponse instanceof NetworkResponse.ClientError)) {
                        }
                        pendingMessage = mutableStateFlow2.getValue().getPendingMessages().get(str2);
                        if (pendingMessage != null) {
                        }
                        MediaCompressionKt.deleteCompressedMedia(media3.getUri());
                        return Unit.INSTANCE;
                    }
                } else {
                    do {
                        value2 = mutableStateFlow3.getValue();
                        conversationClientState2 = value2;
                        Map<String, PendingMessage> pendingMessages = conversationClientState2.getPendingMessages();
                        linkedHashMap2 = new LinkedHashMap();
                        for (Map.Entry<String, PendingMessage> entry : pendingMessages.entrySet()) {
                            if (!Intrinsics.areEqual(str3, entry.getKey())) {
                                linkedHashMap2.put(entry.getKey(), entry.getValue());
                            }
                        }
                    } while (!mutableStateFlow3.compareAndSet(value2, ConversationClientState.copy$default(conversationClientState2, linkedHashMap2, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194302, null)));
                    ConversationUiEffect.ShowUploadSizeLimitDialog showUploadSizeLimitDialog = new ConversationUiEffect.ShowUploadSizeLimitDialog(sendMediaUseCase.attachmentSettings.invoke().getUploadSizeLimitMB());
                    sendMediaUseCase$sendMedia$1.L$0 = media2;
                    sendMediaUseCase$sendMedia$1.L$1 = null;
                    sendMediaUseCase$sendMedia$1.L$2 = null;
                    sendMediaUseCase$sendMedia$1.L$3 = null;
                    sendMediaUseCase$sendMedia$1.label = 2;
                    if (mutableSharedFlow2.emit(showUploadSizeLimitDialog, sendMediaUseCase$sendMedia$1) != coroutine_suspended) {
                        media3 = media2;
                        MediaCompressionKt.deleteCompressedMedia(media3.getUri());
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            }
        }
        sendMediaUseCase$sendMedia$1 = new SendMediaUseCase$sendMedia$1(this, continuation);
        Object obj2 = sendMediaUseCase$sendMedia$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sendMediaUseCase$sendMedia$1.label;
        if (i != 0) {
        }
        media2 = (MediaData.Media) obj2;
        if (media2.getSize() > sendMediaUseCase.attachmentSettings.invoke().getUploadSizeLimit()) {
        }
        return coroutine_suspended2;
    }

    static /* synthetic */ Object sendMediaNewWay$default(SendMediaUseCase sendMediaUseCase, MutableStateFlow mutableStateFlow, MutableSharedFlow mutableSharedFlow, MediaData.Media media, String str, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            str = UUID.randomUUID().toString();
        }
        return sendMediaUseCase.sendMediaNewWay(mutableStateFlow, mutableSharedFlow, media, str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendMediaNewWay(MutableStateFlow<ConversationClientState> mutableStateFlow, MutableSharedFlow<ConversationUiEffect> mutableSharedFlow, MediaData.Media media, String str, Continuation<? super Unit> continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new SendMediaUseCase$sendMediaNewWay$2(media, str, mutableStateFlow, this, mutableSharedFlow, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }
}
