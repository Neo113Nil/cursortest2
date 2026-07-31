package io.intercom.android.sdk.tickets.create.model;

import android.content.Context;
import androidx.lifecycle.ViewModelKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.utils.MediaCompressionKt;
import io.intercom.android.sdk.models.Upload;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreateTicketViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$compressAndUploadFileAttachments$1", f = "CreateTicketViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class CreateTicketViewModel$compressAndUploadFileAttachments$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Answer.MediaAnswer.MediaItem> $mediaItems;
    int label;
    final /* synthetic */ CreateTicketViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateTicketViewModel$compressAndUploadFileAttachments$1(List<Answer.MediaAnswer.MediaItem> list, CreateTicketViewModel createTicketViewModel, Continuation<? super CreateTicketViewModel$compressAndUploadFileAttachments$1> continuation) {
        super(2, continuation);
        this.$mediaItems = list;
        this.this$0 = createTicketViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTicketViewModel$compressAndUploadFileAttachments$1(this.$mediaItems, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CreateTicketViewModel$compressAndUploadFileAttachments$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineDispatcher coroutineDispatcher;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<Answer.MediaAnswer.MediaItem> list = this.$mediaItems;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (Intrinsics.areEqual(((Answer.MediaAnswer.MediaItem) obj2).getUploadStatus(), Answer.MediaAnswer.FileUploadStatus.Queued.INSTANCE)) {
                arrayList.add(obj2);
            }
        }
        ArrayList<Answer.MediaAnswer.MediaItem> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (Answer.MediaAnswer.MediaItem mediaItem : arrayList2) {
            mediaItem.setUploadStatus(Answer.MediaAnswer.FileUploadStatus.Uploading.INSTANCE);
            arrayList3.add(mediaItem);
        }
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this.this$0);
        coroutineDispatcher = this.this$0.dispatcher;
        BuildersKt__Builders_commonKt.launch$default(viewModelScope, coroutineDispatcher, null, new AnonymousClass1(arrayList3, this.this$0, null), 2, null);
        return Unit.INSTANCE;
    }

    /* compiled from: CreateTicketViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$compressAndUploadFileAttachments$1$1", f = "CreateTicketViewModel.kt", i = {0, 1, 1}, l = {358, 378}, m = "invokeSuspend", n = {"mediaItem", "mediaItem", "compressedMedia"}, s = {"L$2", "L$2", "L$3"})
    /* renamed from: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$compressAndUploadFileAttachments$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<Answer.MediaAnswer.MediaItem> $itemsToUpload;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ CreateTicketViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<Answer.MediaAnswer.MediaItem> list, CreateTicketViewModel createTicketViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$itemsToUpload = list;
            this.this$0 = createTicketViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$itemsToUpload, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00d3, code lost:
        
            if (r14 == r0) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0131  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007e -> B:16:0x00be). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d3 -> B:6:0x00d6). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CreateTicketViewModel createTicketViewModel;
            Iterator it;
            CreateTicketViewModel createTicketViewModel2;
            Iterator it2;
            Answer.MediaAnswer.MediaItem mediaItem;
            MediaData.Media media;
            boolean isFileSizeExceeded;
            TicketRepository ticketRepository;
            AppConfig appConfig;
            Context context;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<Answer.MediaAnswer.MediaItem> list = this.$itemsToUpload;
                createTicketViewModel = this.this$0;
                it = list.iterator();
                if (it.hasNext()) {
                }
            } else if (i == 1) {
                Answer.MediaAnswer.MediaItem mediaItem2 = (Answer.MediaAnswer.MediaItem) this.L$2;
                Iterator it3 = (Iterator) this.L$1;
                CreateTicketViewModel createTicketViewModel3 = (CreateTicketViewModel) this.L$0;
                ResultKt.throwOnFailure(obj);
                createTicketViewModel2 = createTicketViewModel3;
                it2 = it3;
                mediaItem = mediaItem2;
                media = (MediaData.Media) obj;
                isFileSizeExceeded = createTicketViewModel2.isFileSizeExceeded(media);
                if (isFileSizeExceeded) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                media = (MediaData.Media) this.L$3;
                mediaItem = (Answer.MediaAnswer.MediaItem) this.L$2;
                it2 = (Iterator) this.L$1;
                createTicketViewModel2 = (CreateTicketViewModel) this.L$0;
                ResultKt.throwOnFailure(obj);
                NetworkResponse networkResponse = (NetworkResponse) obj;
                if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
                    mediaItem.setUploadStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.UploadFailed(CollectionsKt.listOf(new StringProvider.StringRes(R.string.intercom_upload_failed, null, 2, null)))));
                } else {
                    if (!(networkResponse instanceof NetworkResponse.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mediaItem.setUploadStatus(new Answer.MediaAnswer.FileUploadStatus.Success(((Upload.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build().getId()));
                }
                createTicketViewModel2.updateCtaState();
                MediaCompressionKt.deleteCompressedMedia(media.getUri());
                it = it2;
                createTicketViewModel = createTicketViewModel2;
                if (it.hasNext()) {
                    mediaItem = (Answer.MediaAnswer.MediaItem) it.next();
                    MediaData.Media data = mediaItem.getData();
                    context = createTicketViewModel.applicationContext;
                    this.L$0 = createTicketViewModel;
                    this.L$1 = it;
                    this.L$2 = mediaItem;
                    this.L$3 = null;
                    this.label = 1;
                    Object compressedMediaData = MediaCompressionKt.getCompressedMediaData(data, context, this);
                    if (compressedMediaData != coroutine_suspended) {
                        it2 = it;
                        obj = compressedMediaData;
                        createTicketViewModel2 = createTicketViewModel;
                        media = (MediaData.Media) obj;
                        isFileSizeExceeded = createTicketViewModel2.isFileSizeExceeded(media);
                        if (isFileSizeExceeded) {
                            ticketRepository = createTicketViewModel2.ticketRepository;
                            this.L$0 = createTicketViewModel2;
                            this.L$1 = it2;
                            this.L$2 = mediaItem;
                            this.L$3 = media;
                            this.label = 2;
                            obj = ticketRepository.uploadFile(media, this);
                        } else {
                            int i2 = R.string.intercom_upload_max_files_size;
                            appConfig = createTicketViewModel2.config;
                            mediaItem.setUploadStatus(new Answer.MediaAnswer.FileUploadStatus.Error(new Answer.MediaAnswer.FileUploadError.FileTooLarge(CollectionsKt.listOf((Object[]) new StringProvider.StringRes[]{new StringProvider.StringRes(R.string.intercom_upload_failed, null, 2, null), new StringProvider.StringRes(i2, CollectionsKt.listOf(TuplesKt.to("limit", appConfig.getAttachmentSettings().getUploadSizeLimitMB())))}))));
                            it = it2;
                            createTicketViewModel = createTicketViewModel2;
                            if (it.hasNext()) {
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    return coroutine_suspended;
                }
            }
        }
    }
}
