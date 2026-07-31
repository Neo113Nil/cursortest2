package io.intercom.android.sdk.m5.upload.data;

import android.app.Application;
import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.ExternalUploadApi;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.api.MessengerApiHelper;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.Upload;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* compiled from: UploadRepository.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0086@¢\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/m5/upload/data/UploadRepository;", "", "messengerApi", "Lio/intercom/android/sdk/api/MessengerApi;", "externalUploadApi", "Lio/intercom/android/sdk/api/ExternalUploadApi;", "userIdentity", "Lio/intercom/android/sdk/identity/UserIdentity;", "context", "Landroid/content/Context;", "<init>", "(Lio/intercom/android/sdk/api/MessengerApi;Lio/intercom/android/sdk/api/ExternalUploadApi;Lio/intercom/android/sdk/identity/UserIdentity;Landroid/content/Context;)V", "getUserIdentity", "()Lio/intercom/android/sdk/identity/UserIdentity;", "getContext", "()Landroid/content/Context;", "uploadFile", "Lio/intercom/android/sdk/helpcenter/utils/networking/NetworkResponse;", "Lio/intercom/android/sdk/models/Upload$Builder;", "imageData", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "(Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UploadRepository {
    public static final int $stable = 8;
    private final Context context;
    private final ExternalUploadApi externalUploadApi;
    private final MessengerApi messengerApi;
    private final UserIdentity userIdentity;

    public UploadRepository() {
        this(null, null, null, null, 15, null);
    }

    public UploadRepository(MessengerApi messengerApi, ExternalUploadApi externalUploadApi, UserIdentity userIdentity, Context context) {
        Intrinsics.checkNotNullParameter(messengerApi, "messengerApi");
        Intrinsics.checkNotNullParameter(externalUploadApi, "externalUploadApi");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(context, "context");
        this.messengerApi = messengerApi;
        this.externalUploadApi = externalUploadApi;
        this.userIdentity = userIdentity;
        this.context = context;
    }

    public /* synthetic */ UploadRepository(MessengerApi messengerApi, ExternalUploadApi externalUploadApi, UserIdentity userIdentity, Application application, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Injector.get().getMessengerApi() : messengerApi, (i & 2) != 0 ? Injector.get().getExternalUploadApi() : externalUploadApi, (i & 4) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i & 8) != 0 ? Injector.get().getApplication() : application);
    }

    public final UserIdentity getUserIdentity() {
        return this.userIdentity;
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0202 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uploadFile(MediaData.Media media, Continuation<? super NetworkResponse<Upload.Builder>> continuation) {
        UploadRepository$uploadFile$1 uploadRepository$uploadFile$1;
        int i;
        UploadRepository uploadRepository;
        NetworkResponse networkResponse;
        NetworkResponse networkResponse2;
        NetworkResponse networkResponse3;
        MediaData.Media media2 = media;
        if (continuation instanceof UploadRepository$uploadFile$1) {
            uploadRepository$uploadFile$1 = (UploadRepository$uploadFile$1) continuation;
            if ((uploadRepository$uploadFile$1.label & Integer.MIN_VALUE) != 0) {
                uploadRepository$uploadFile$1.label -= Integer.MIN_VALUE;
                UploadRepository$uploadFile$1 uploadRepository$uploadFile$12 = uploadRepository$uploadFile$1;
                Object obj = uploadRepository$uploadFile$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = uploadRepository$uploadFile$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Map createMapBuilder = MapsKt.createMapBuilder();
                    createMapBuilder.put("original_filename", media2.getFileName());
                    createMapBuilder.put("size_in_bytes", Boxing.boxLong(media2.getSize()));
                    createMapBuilder.put(FirebaseAnalytics.Param.CONTENT_TYPE, media2.getMimeType());
                    if (media2 instanceof MediaData.Media.Image) {
                        MediaData.Media.Image image = (MediaData.Media.Image) media2;
                        createMapBuilder.put("width", Boxing.boxInt(image.getWidth()));
                        createMapBuilder.put("height", Boxing.boxInt(image.getHeight()));
                        if (!image.getExifData().isEmpty()) {
                            createMapBuilder.put("image_exif", image.getExifData());
                        }
                    }
                    if (media2 instanceof MediaData.Media.Video) {
                        MediaData.Media.Video video = (MediaData.Media.Video) media2;
                        createMapBuilder.put("width", Boxing.boxInt(video.getWidth()));
                        createMapBuilder.put("height", Boxing.boxInt(video.getHeight()));
                    }
                    RequestBody defaultRequestBody$intercom_sdk_base_release = MessengerApiHelper.INSTANCE.getDefaultRequestBody$intercom_sdk_base_release(MapsKt.mapOf(TuplesKt.to("upload", MapsKt.build(createMapBuilder)), TuplesKt.to(Participant.USER_TYPE, this.userIdentity.toMap()), TuplesKt.to("include_metadata", Boxing.boxBoolean(true))));
                    MessengerApi messengerApi = this.messengerApi;
                    uploadRepository$uploadFile$12.L$0 = this;
                    uploadRepository$uploadFile$12.L$1 = media2;
                    uploadRepository$uploadFile$12.label = 1;
                    obj = messengerApi.getUploadFileUrlSuspended(defaultRequestBody$intercom_sdk_base_release, uploadRepository$uploadFile$12);
                    if (obj != coroutine_suspended) {
                        uploadRepository = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    networkResponse2 = (NetworkResponse) uploadRepository$uploadFile$12.L$0;
                    ResultKt.throwOnFailure(obj);
                    networkResponse3 = (NetworkResponse) obj;
                    if ((networkResponse3 instanceof NetworkResponse.ClientError) || (networkResponse3 instanceof NetworkResponse.NetworkError) || (networkResponse3 instanceof NetworkResponse.ServerError)) {
                        return networkResponse3;
                    }
                    if (networkResponse3 instanceof NetworkResponse.Success) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return networkResponse2;
                }
                media2 = (MediaData.Media) uploadRepository$uploadFile$12.L$1;
                uploadRepository = (UploadRepository) uploadRepository$uploadFile$12.L$0;
                ResultKt.throwOnFailure(obj);
                networkResponse = (NetworkResponse) obj;
                if (!(networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
                    return networkResponse;
                }
                if (!(networkResponse instanceof NetworkResponse.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                Upload build = ((Upload.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
                ExternalUploadApi externalUploadApi = uploadRepository.externalUploadApi;
                String uploadDestination = build.getUploadDestination();
                MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
                String key = build.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "getKey(...)");
                MultipartBody.Part createFormData = companion.createFormData("key", key);
                MultipartBody.Part.Companion companion2 = MultipartBody.Part.INSTANCE;
                String acl = build.getAcl();
                Intrinsics.checkNotNullExpressionValue(acl, "getAcl(...)");
                MultipartBody.Part createFormData2 = companion2.createFormData("acl", acl);
                MultipartBody.Part.Companion companion3 = MultipartBody.Part.INSTANCE;
                String contentType = build.getContentType();
                Intrinsics.checkNotNullExpressionValue(contentType, "getContentType(...)");
                MultipartBody.Part createFormData3 = companion3.createFormData("Content-Type", contentType);
                MultipartBody.Part.Companion companion4 = MultipartBody.Part.INSTANCE;
                String awsAccessKey = build.getAwsAccessKey();
                Intrinsics.checkNotNullExpressionValue(awsAccessKey, "getAwsAccessKey(...)");
                MultipartBody.Part createFormData4 = companion4.createFormData("AWSAccessKeyId", awsAccessKey);
                MultipartBody.Part.Companion companion5 = MultipartBody.Part.INSTANCE;
                String policy = build.getPolicy();
                Intrinsics.checkNotNullExpressionValue(policy, "getPolicy(...)");
                MultipartBody.Part createFormData5 = companion5.createFormData("policy", policy);
                MultipartBody.Part.Companion companion6 = MultipartBody.Part.INSTANCE;
                String signature = build.getSignature();
                Intrinsics.checkNotNullExpressionValue(signature, "getSignature(...)");
                MultipartBody.Part createFormData6 = companion6.createFormData("signature", signature);
                MultipartBody.Part.Companion companion7 = MultipartBody.Part.INSTANCE;
                String successActionStatus = build.getSuccessActionStatus();
                Intrinsics.checkNotNullExpressionValue(successActionStatus, "getSuccessActionStatus(...)");
                MultipartBody.Part createFormData7 = companion7.createFormData("success_action_status", successActionStatus);
                MultipartBody.Part createFormData8 = MultipartBody.Part.INSTANCE.createFormData("x-amz-meta-safe_app_id", build.getMetadata().getSafeAppId());
                MultipartBody.Part createFormData9 = MultipartBody.Part.INSTANCE.createFormData("file", media2.getFileName(), new UploadRequestBody(uploadRepository.context, media2));
                uploadRepository$uploadFile$12.L$0 = networkResponse;
                uploadRepository$uploadFile$12.L$1 = null;
                uploadRepository$uploadFile$12.label = 2;
                Object uploadFileSuspended = externalUploadApi.uploadFileSuspended(uploadDestination, createFormData, createFormData2, createFormData3, createFormData4, createFormData5, createFormData6, createFormData7, createFormData8, createFormData9, uploadRepository$uploadFile$12);
                if (uploadFileSuspended != coroutine_suspended) {
                    networkResponse2 = networkResponse;
                    obj = uploadFileSuspended;
                    networkResponse3 = (NetworkResponse) obj;
                    if (networkResponse3 instanceof NetworkResponse.ClientError) {
                        if (networkResponse3 instanceof NetworkResponse.Success) {
                        }
                    }
                    return networkResponse3;
                }
                return coroutine_suspended;
            }
        }
        uploadRepository$uploadFile$1 = new UploadRepository$uploadFile$1(this, continuation);
        UploadRepository$uploadFile$1 uploadRepository$uploadFile$122 = uploadRepository$uploadFile$1;
        Object obj2 = uploadRepository$uploadFile$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = uploadRepository$uploadFile$122.label;
        if (i != 0) {
        }
        networkResponse = (NetworkResponse) obj2;
        if (networkResponse instanceof NetworkResponse.ClientError) {
        }
        return networkResponse;
    }
}
